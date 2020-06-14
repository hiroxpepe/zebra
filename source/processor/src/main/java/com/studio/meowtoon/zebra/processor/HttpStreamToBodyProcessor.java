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

import java.io.InputStream;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

///////////////////////////////////////////////////////////////////////////////
/**
 * @author h.adachi
 */
public class HttpStreamToBodyProcessor implements Processor {

    ///////////////////////////////////////////////////////////////////////////
    // Field

    private static final Log LOG = LogFactory.getLog(
        HttpStreamToBodyProcessor.class
    );

    private final String encode; // Default: Shift_JIS

    ///////////////////////////////////////////////////////////////////////////
    // Constructor

    public HttpStreamToBodyProcessor() {
        this.encode = "Shift_JIS";
    }

    public HttpStreamToBodyProcessor(String encode) {
        this.encode = encode;
    }

    ///////////////////////////////////////////////////////////////////////////
    // public Method

    @Override
    public void process(Exchange exchange) throws Exception {
        try {
            // exchange the body text.
            Message in = exchange.getIn();
            String body = IOUtils.toString((InputStream) in.getBody(), encode);
            exchange.getIn().setBody(body);

        } catch (RuntimeException re) {
            throw re;
        }
    }

}