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

import java.util.Date;
import java.util.EventObject;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.management.event.ExchangeCompletedEvent;
import org.apache.camel.management.event.ExchangeCreatedEvent;
import org.apache.camel.management.event.ExchangeFailedEvent;
import org.apache.camel.management.event.ExchangeRedeliveryEvent;
import org.apache.camel.management.event.ExchangeSentEvent;
import org.apache.camel.support.EventNotifierSupport;

/**
 * @author h.adachi
 */
@Slf4j
public class LoggingEventNotifer extends EventNotifierSupport {

    // TODO: from の処理では、ここはまだ呼ばれていないのでは？

    ///////////////////////////////////////////////////////////////////////////
    // public Method

    @Override
    public void notify(EventObject event) throws Exception {

        if (event instanceof ExchangeCreatedEvent) {
            onExchangeCreatedEvent(event);
        }

        else if (event instanceof ExchangeSentEvent) {
            onExchangeSentEvent(event);
        }

        else if (event instanceof ExchangeCompletedEvent) {
            onExchangeCompletedEvent(event);
        }

        else if (event instanceof ExchangeRedeliveryEvent) {
            onExchangeRedeliveryEvent(event);
        }

        else if (event instanceof ExchangeFailedEvent) {
            onExchangeFailedEvent(event);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // protected Method

    // on ExchangeFailedEvent
    protected void onExchangeFailedEvent(EventObject event) {
        ExchangeFailedEvent  failedEvent = (ExchangeFailedEvent) event;
        Exchange exchange =  failedEvent.getExchange();
        String exchangeId = exchange.getExchangeId();
        String routeId = exchange.getFromRouteId();
        Object source =  failedEvent.getSource();

        log.warn(">>> [" + routeId + ":" + exchangeId + "] Failed:" + source.toString());
    }

    // on ExchangeRedeliveryEvent
    protected void onExchangeRedeliveryEvent(EventObject event) {
        ExchangeRedeliveryEvent redeliveryEvent = (ExchangeRedeliveryEvent) event;
        Exchange exchange = redeliveryEvent.getExchange();
        String exchangeId = exchange.getExchangeId();
        String routeId = exchange.getFromRouteId();
        int attempt = redeliveryEvent.getAttempt();

        log.warn(">>> [" + routeId + ":" + exchangeId + "] Redelivery: " + attempt);
    }

    // on ExchangeCompletedEvent
    protected void onExchangeCompletedEvent(EventObject event) {
        ExchangeCompletedEvent completedEvent = (ExchangeCompletedEvent) event;
        Exchange exchange = completedEvent.getExchange();
        String exchangeId = exchange.getExchangeId();
        String routeId = exchange.getFromRouteId();

        // calculate elapsed time
        Date created = ((ExchangeCompletedEvent) event).getExchange().getProperty(Exchange.CREATED_TIMESTAMP, Date.class);
        Date now = new Date();
        long elapsed = now.getTime() - created.getTime();

        log.info(">>> [" + routeId + ":" + exchangeId + "] End: " + elapsed + " msec for the exchange");
    }

    // on ExchangeSentEvent
    protected void onExchangeSentEvent(EventObject event) {
        ExchangeSentEvent sentEvent = (ExchangeSentEvent) event;
        Exchange exchange = sentEvent.getExchange();
        String exchangeId = exchange.getExchangeId();
        String routeId = exchange.getFromRouteId();
        Endpoint endpoint = sentEvent.getEndpoint();
        String EndpointUri = endpoint.getEndpointUri();

        log.info(">>> [" + routeId + ":" + exchangeId + "] To: " + sentEvent.getTimeTaken() + " msec to: " + EndpointUri);
    }

    // on ExchangeCreatedEvent
    protected void onExchangeCreatedEvent(EventObject event) {
        ExchangeCreatedEvent createdEvent = (ExchangeCreatedEvent) event;
        Exchange exchange = createdEvent.getExchange();
        String exchangeId = exchange.getExchangeId();
        String routeId = exchange.getFromRouteId();

        log.info(">>> [" + routeId + ":" + exchangeId + "] Exchange start ");

        Endpoint endpoint = exchange.getFromEndpoint();
        String EndpointUri = endpoint.getEndpointUri();
        log.info(">>> [" + routeId + ":" + exchangeId + "] From: " + EndpointUri);
    }

    @Override
    public boolean isEnabled(EventObject event) {
        return true;
    }

    @Override
    protected void doStart() throws Exception {

        // filter out unwanted events
        setIgnoreCamelContextEvents(true);
        setIgnoreServiceEvents(true);
        setIgnoreRouteEvents(true);
        setIgnoreExchangeCreatedEvent(false);
        setIgnoreExchangeCompletedEvent(false);
        setIgnoreExchangeFailedEvents(false);
        setIgnoreExchangeRedeliveryEvents(false);
        setIgnoreExchangeSentEvents(false);
    }

    @Override
    protected void doStop() throws Exception {
        // noop
    }

}