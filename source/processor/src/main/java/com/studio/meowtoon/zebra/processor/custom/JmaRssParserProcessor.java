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

import java.util.List;
import javax.inject.Inject;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.studio.meowtoon.zebra.jma.entity.Type;

import com.studio.meowtoon.zebra.jma.repository.TypeRepository;
import com.studio.meowtoon.zebra.processor.RssParserProcessor;
import com.studio.meowtoon.zebra.util.CommonUtils;

///////////////////////////////////////////////////////////////////////////////
/**
 * @author h.adachi
 */
public class JmaRssParserProcessor extends RssParserProcessor {

    /*
    CSVを生成する方針
    [title],[uuid],[updated],[author],[summary],[link]
        title   -> entry.getTitle()
        uuid    -> entry.getUri()
        updated -> entry.getUpdatedDate()
        author  -> entry.getAuthor()
        summary -> entry.getContents().get(0).getValue().trim()
        link    -> entry.getLink()
    */

    ///////////////////////////////////////////////////////////////////////////
    // Field

    @Inject
    private final TypeRepository typeRepository = null;

    ///////////////////////////////////////////////////////////////////////////
    // protected Method

    @Override
    protected String getContentText(SyndFeed feed) {

        // 必要のない情報種別リスト取得
        List<Type> unuseTypes = typeRepository.findByUseFalse();

        // csv形式に変換
        String mergedText = "";
        int index = 1;
        List<SyndEntry> entryList = feed.getEntries();
        for (SyndEntry entry : entryList) {
            boolean need = true;
            for (Type type : unuseTypes) { // 必要のない情報種別は除外する
                if (type.getTitle().equals(entry.getTitle())) {
                    LOG.info(entry.getTitle() + " は必要ない情報種別です。");
                    need = false;
                    break;
                }
            }
            if (need) { // 必要な情報種別だけCSV化する
                mergedText += String.valueOf(index) + ",";
                mergedText += entry.getTitle() + ",";
                mergedText += entry.getUri().replace("urn:uuid:", "") + ",";
                mergedText += entry.getUpdatedDate() + ",";
                mergedText += entry.getAuthor() + ",";
                mergedText += entry.getContents().get(0).getValue().trim().replace("\n", "") + ",";
                mergedText += entry.getLink();
                mergedText += CommonUtils.getLineSeparator();
                index++;
            }
        }
        return mergedText;
    }

}