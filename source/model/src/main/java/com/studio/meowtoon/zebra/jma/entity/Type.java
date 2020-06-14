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
@Table(name="jma_types")
@Component
@Scope(value="prototype")
public class Type implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true)
    Long id;

    @Column(name="title", unique=true)
    String title;

    @Column(name="updated")
    @Temporal(TemporalType.TIMESTAMP)
    Date updated;

    @Column(name="use")
    boolean use = true; // TODO: デフォルト値になる？

}