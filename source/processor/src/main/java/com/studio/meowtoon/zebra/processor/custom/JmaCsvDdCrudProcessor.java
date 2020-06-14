/*
 * Copyright 2002-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.studio.meowtoon.zebra.processor.custom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.studio.meowtoon.zebra.processor.DdCrudProcessor;
import com.studio.meowtoon.zebra.jma.entity.Entry;
import com.studio.meowtoon.zebra.jma.entity.Type;
import com.studio.meowtoon.zebra.jma.repository.EntryRepository;
import com.studio.meowtoon.zebra.jma.repository.TypeRepository;

///////////////////////////////////////////////////////////////////////////////
/**
 * @author h.adachi
 */
public class JmaCsvDdCrudProcessor extends DdCrudProcessor {

    ///////////////////////////////////////////////////////////////////////////
    // Field

    @Inject
    private final ApplicationContext context = null;

    @Inject
    private final EntryRepository entryRepository = null;

    @Inject
    private final TypeRepository typeRepository = null;

    ///////////////////////////////////////////////////////////////////////////
    // Constructor

    public JmaCsvDdCrudProcessor() {
    }

    ///////////////////////////////////////////////////////////////////////////
    // protected Method

    @Override
    @Transactional
    protected void doCrud(String csvData) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd hh:mm:ss Z yyyy", Locale.ENGLISH);
        try {
            // CSVの一行リスト
            List<String> lineList = Arrays.asList(csvData.split("\r\n"));
            LOG.info("CSVの行数: " + lineList.size());
            if (lineList.get(0).equals("")) {
                return;
            }
            for (String line : lineList) {
                String[] field = line.split(",");
                // マスタタイプ(情報種別)の収集
                List<Type> existingTypes = typeRepository.findByTitle(field[1]);
                if (existingTypes.isEmpty()) { // なければ新規追加
                    LOG.info("情報種別:" + field[1] + " を新規追加します。");
                    Type type = context.getBean(Type.class);
                    type.setTitle(field[1]);
                    type.setUpdated(sdf.parse(field[3]));
                    typeRepository.save(type);
                } else { // 情報種別が存在し、更新時刻が新しければ上書き
                    Type target = existingTypes.get(0);
                    if (target.getUpdated().compareTo(sdf.parse(field[3])) == -1) {
                        LOG.info("情報種別:" + field[1] + " の更新時刻を更新します。");
                        target.setUpdated(sdf.parse(field[3]));
                        typeRepository.save(target);
                    }
                }

                // レコードテーブルに取り込み
                List<Entry> existingUuids = entryRepository.findByUuid(field[2]);
                if (existingUuids.isEmpty()) { // UUIDの確認、なければ新規追加
                    LOG.info(field[1] + " を新規追加します。");
                    Entry entry = context.getBean(Entry.class);
                    entry.setTitle(field[1]);
                    entry.setUuid(field[2]);
                    entry.setUpdated(sdf.parse(field[3]));
                    entry.setAuthor(field[4]);
                    entry.setSummary(field[5]);
                    entry.setUrl(field[6]);
                    entryRepository.save(entry);
                } else { // UUIDが既に登録されている場合でも、
                    Entry target = existingUuids.get(0);
                    // 更新時刻が違えば更新する
                    if (target.getUpdated().compareTo(sdf.parse(field[3])) != 0) {
                        LOG.info(field[1] + " を更新します。");
                        target.setTitle(field[1]);
                        target.setUpdated(sdf.parse(field[3]));
                        target.setAuthor(field[4]);
                        target.setSummary(field[5]);
                        target.setUrl(field[6]);
                        target.setBody(null); // XMLの内容は削除する
                        entryRepository.save(target);
                    }
                }
            }
        } catch (ParseException ex) {
            // FIXME:
            LOG.error(ex.getMessage());
        }
    }

}