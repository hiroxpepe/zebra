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

package com.studio.meowtoon.zebra.util;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

///////////////////////////////////////////////////////////////////////////////
/**
 * 共通ユーティリティクラス
 * @author h.adachi
 */
public class CommonUtils {

    ///////////////////////////////////////////////////////////////////////////
    // Constructor

    // コンストラクタ隠蔽
    private CommonUtils() {
    }

    ///////////////////////////////////////////////////////////////////////////
    // public Method

    ///////////////////////////////////////////////////////////////////////////
    // 改行文字列を返す
    public static String getLineSeparator() {
        return "\r\n";
    }

    ///////////////////////////////////////////////////////////////////////////
    // XMLGregorianCalendar 現在時刻を返す
    public static XMLGregorianCalendar getXMLGregorianCalendarNow() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory;
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException ex) {
            throw new RuntimeException(ex);
        }
        XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        return now;
    }

}