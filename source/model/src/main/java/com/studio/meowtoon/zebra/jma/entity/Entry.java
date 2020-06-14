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

package com.studio.meowtoon.zebra.jma.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author h.adachi
 */
@Data
@Entity
@Table(name="jma_entries")
@Component
@Scope(value="prototype")
public class Entry implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true)
    Long id;

    @Column(name="title")
    String title;

    @Column(name="uuid", unique=true)
    String uuid;

    @Column(name="updated")
    @Temporal(TemporalType.TIMESTAMP)
    Date updated;

    @Column(name="author")
    String author;

    @Column(name="summary")
    String summary;

    @Column(name="url")
    String url;

    //@Column(name="body", length=1000000)
    //String body;
    @Column(name="body") // ファイル名を格納する形式に変更
    String body;

}