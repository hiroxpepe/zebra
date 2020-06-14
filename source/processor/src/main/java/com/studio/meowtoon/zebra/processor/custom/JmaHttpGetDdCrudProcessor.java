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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.time.StopWatch;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.studio.meowtoon.zebra.processor.DdCrudProcessor;
import com.studio.meowtoon.zebra.jma.entity.Entry;
import com.studio.meowtoon.zebra.jma.repository.EntryRepository;

/**
 * @author h.adachi
 */
@RequiredArgsConstructor
public class JmaHttpGetDdCrudProcessor extends DdCrudProcessor {

    ///////////////////////////////////////////////////////////////////////////
    // Field

    private static final String BASE_DIR = "../../var/www/html/zebra/data/"; // FIXME: 設定化

    // コネクションタイムアウトmsec
    private final int connectionTimeout = 3000;

    // ソケットタイムアウトmsec
    private final int socketTimeout = 3000;

    private final int defaultMaxConnectionsPerHost = 64;

    private final int maxTotalConnections = 256;

    @NonNull
    private final ApplicationContext context;

    @NonNull
    private final EntryRepository entryRepository;

    ///////////////////////////////////////////////////////////////////////////
    // protected Method

    @Override
    @Transactional
    protected void doCrud(String data) {
        try {
            // DBに登録されたレコードでXMLの内容の値が空のレコードを抽出。
            // URL先のxmlをダウンロード、ファイル出力する。
            List<Entry> list = entryRepository.findByBodyIsNull();
            LOG.info("XMLの内容がnullのレコード数: " + list.size());
            for (Entry entry : list) {
                String url = entry.getUrl();
                String xml = request(url);
                entry.setBody(entry.getUuid() + ".xml");
                entryRepository.save(entry);
                // ファイルとして出力する
                FileUtils.writeStringToFile( new File(BASE_DIR + entry.getUuid() + ".xml"), xml, "UTF-8" );
            }

        } catch (IOException ex) {
            // FIXME:
            LOG.error(ex.getMessage());
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // private Method

    // HTTPリクエスト処理
    private String request(final String url) {
        LOG.trace("was called.");

        HttpMethod method = null;
        try {
            // パラメータ設定
            HttpConnectionManager manager = new MultiThreadedHttpConnectionManager();
            HttpConnectionManagerParams params = new HttpConnectionManagerParams();
            params.setConnectionTimeout(connectionTimeout);
            params.setSoTimeout(socketTimeout);
            params.setDefaultMaxConnectionsPerHost(defaultMaxConnectionsPerHost);
            params.setMaxTotalConnections(maxTotalConnections);
            manager.setParams(params);

            // HTTPオブジェクト作成
            HttpClient client = new HttpClient(manager);
            method = new GetMethod(url);

            // リクエストレスポンス計測
            LOG.info("HTTPリクエスト開始: " + method.getURI().toString());
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();

            // HTTPリクエスト実行
            client.executeMethod(method);
            if (method.getStatusCode() == HttpStatus.SC_OK) {
                stopWatch.stop();
                LOG.info("レスポンス時間: " + stopWatch.getTime() + " msec");
                LOG.info("HTTPリクエストの結果: " + method.getStatusCode());
                // ストリーム取得
                InputStream is = method.getResponseBodyAsStream();
                String responseBody = IOUtils.toString(is, "UTF-8");
                LOG.info("responseBodyのサイズ: " + responseBody.length());
                return responseBody;
            }
            // HTTP の 200 以外が返された場合はエラーフラグを付ける為、例外を投げる
            else {
                LOG.error(
                    "error: HTTP request failed. [" +
                    String.valueOf(method.getStatusCode()) + "]"
                );
                throw new RuntimeException("HTTP request failed.");
            }
        } catch (HttpException he) {
            LOG.error("error: " + he.getMessage());
            throw new RuntimeException("HttpException happened.", he);
        } catch (IOException ioe) {
            LOG.error("error: " + ioe.getMessage());
            throw new RuntimeException("IOException happened.", ioe);
        } finally {
            method.releaseConnection();
        }
    }

}