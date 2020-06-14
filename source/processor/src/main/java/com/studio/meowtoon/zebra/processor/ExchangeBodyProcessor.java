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
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.camel.Endpoint;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

///////////////////////////////////////////////////////////////////////////////
/**
 * @author h.adachi
 */
public class ExchangeBodyProcessor implements Processor {

    ///////////////////////////////////////////////////////////////////////////
    // Field

    private static final Log LOG = LogFactory.getLog(
        ExchangeBodyProcessor.class
    );

    ///////////////////////////////////////////////////////////////////////////
    // public Method

    public void process(Exchange exchange) throws Exception {
        try {
            String filePath = getFilePath(exchange);
            String fromText = getFromText(filePath);

            // exchange the body text.
            exchange.getIn().setBody(fromText);

        } catch (RuntimeException re) {
            throw re;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // private Method

    private String getFromText(String filePath) throws IOException, IllegalArgumentException {
        FileInputStream stream = null;
        stream = new FileInputStream(new File(filePath));
        return IOUtils.toString(stream);
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