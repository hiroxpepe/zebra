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

package com.studio.meowtoon.zebra.processor;

import java.io.File;
import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

/**
 * @author h.adachi
 */
@Slf4j
public class FileToBodyProcessor implements Processor {

    ///////////////////////////////////////////////////////////////////////////
    // Field

    private final String encode; // Default: Shift_JIS

    ///////////////////////////////////////////////////////////////////////////
    // Constructor

    public FileToBodyProcessor(String encode) {
        this.encode = encode;
    }

    public FileToBodyProcessor() {
        this.encode = "Shift_JIS";
    }

    ///////////////////////////////////////////////////////////////////////////
    // public Method

    public void process(Exchange exchange) throws Exception {
        try {
            String filePath = getFilePath(exchange);
            log.debug("filePath: " + filePath);

            String fromText = getFromText(filePath);
            log.debug("fromText: " + fromText);

            // exchange the body text.
            exchange.getIn().setBody(fromText);

        } catch (RuntimeException re) {
            throw re;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // private Method

    private String getFromText(String filePath) throws IOException, IllegalArgumentException {
        String fileText = FileUtils.readFileToString(new File(filePath), encode);
        return fileText;
    }

    private String getFilePath(Exchange exchange) {

        // get the file url
        Endpoint endpoint = exchange.getFromEndpoint();
        String url = endpoint.getEndpointUri();

        // get the file directory
        String[] param1 = StringUtils.split(url, "?");
        String fileDir = param1[0].replace("file://", "");

        // get the file name
        String param2 = param1[1];
        String[] param3 = StringUtils.split(param2, "&");
        String fileName = "";
        for (String param4 : param3) {
            if (StringUtils.contains(param4, "fileName=")) {
                fileName = StringUtils.remove(param4, "fileName=");
            }
        }

        return fileDir + "/" + fileName;
    }

}