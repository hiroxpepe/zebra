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

import java.util.List;
import java.io.InputStream;
import java.io.IOException;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.StringUtils;

/**
 * simply create text contents from the item list of RSS.
 * @author h.adachi
 */
@Slf4j
public class RssParserProcessor implements Processor {

    ///////////////////////////////////////////////////////////////////////////
    // protected Field

    protected String contentFormat = "【${title}】　\r\n\r\n${items}";

    protected String itemFormat = "${title}\r\n${description}\r\n${publishedDate}\r\n\r\n";

    protected String dateFormat = "＜yyyy年MM月dd日 hh時mm分＞　　　　　"; //"yyyy-MM-dd hh:mm:ss";

    ///////////////////////////////////////////////////////////////////////////
    // Constructor

    public RssParserProcessor() {
    }

    public RssParserProcessor(String contentFormat, String itemFormat, String dateFormat) {
        this.contentFormat = replacePlaceHolderMark(contentFormat);
        this.itemFormat = replacePlaceHolderMark(itemFormat);
        this.dateFormat = replacePlaceHolderMark(dateFormat);
    }

    ///////////////////////////////////////////////////////////////////////////
    // public Method

    @Override
    public void process(Exchange exchange) throws Exception {
        try {
            // get the RSS feed.
            SyndFeed feed = getFeed(exchange);

            // exchange the body text.
            exchange.getIn().setBody(getContentText(feed));

        } catch (RuntimeException re) {
            throw re;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // protected Method

    protected String getContentText(SyndFeed feed) {
        String title = getContentTitle(feed);
        String publishedDateString = getContentPublishedDateString(feed);
        String items = getMergedItem(feed);
        return createContent(title, items, publishedDateString);
    }

    protected String getContentTitle(SyndFeed feed) {
        return feed.getTitle();
    }

    protected String getContentPublishedDateString(SyndFeed feed) {
        return DateFormatUtils.format(feed.getPublishedDate(), dateFormat);
    }

    protected String createContent(String title, String items, String publishedDateString) {
        String content = StringUtils.replace(contentFormat, "${title}", title);
        content = StringUtils.replace(content, "${items}", items);
        content = StringUtils.replace(content, "${publishedDate}", publishedDateString);
        return content.trim();
    }

    protected String getItemText(SyndEntry entry, int index) {
        String title = getItemTitle(entry);
        String description = getItemDescription(entry);
        String publishedDateString = getItemPublishedDateString(entry);
        return createItem(title, description, publishedDateString);
    }

    protected String getItemTitle(SyndEntry entry) {
        return entry.getTitle();
    }

    protected String getItemDescription(SyndEntry entry) {
        return entry.getDescription().getValue().trim();
    }

    protected String getItemPublishedDateString(SyndEntry entry) {
        return DateFormatUtils.format(entry.getPublishedDate(), dateFormat);
    }

    protected String createItem(String title, String description, String publishedDateString) {
        String item = StringUtils.replace(itemFormat, "${title}", title);
        item = StringUtils.replace(item, "${description}", description);
        item = StringUtils.replace(item, "${publishedDate}", publishedDateString);
        return item.trim();
    }

    protected void doEntry(SyndEntry entry, int index) {
    }

    protected final String replacePlaceHolderMark(String target) {
        return target.replace("{{", "${").replace("}}", "}");
    }

    ///////////////////////////////////////////////////////////////////////////
    // private Method

    private SyndFeed getFeed(Exchange exchange) throws IOException, FeedException {
        InputStream is = exchange.getIn().getBody(InputStream.class);
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(is));
        return feed;
    }

    private String getMergedItem(SyndFeed feed) {
        String mergedItem = "";
        int index = 0;
        List<SyndEntry> entryList = feed.getEntries();
        for (SyndEntry entry : entryList) {
            // called by sub class.
            doEntry(entry, index);
            // marge the item;
            mergedItem += getItemText(entry, index);
            index++;
        }
        return mergedItem;
    }

}