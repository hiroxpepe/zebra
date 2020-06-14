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

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author h.adachi
 */
public class DdCrudProcessor implements Processor {

    ///////////////////////////////////////////////////////////////////////////
    // Constructor

    public DdCrudProcessor() {
    }

    ///////////////////////////////////////////////////////////////////////////
    // public Method

    @Override
    public void process(Exchange exchange) throws Exception {
        try {
            doCrud(exchange.getIn().getBody(String.class));

        } catch (RuntimeException re) {
            throw re;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // protected Method

    protected void doCrud(String data) {
    }

    ///////////////////////////////////////////////////////////////////////////
    // private Method

}