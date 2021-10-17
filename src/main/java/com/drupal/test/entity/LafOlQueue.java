/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.drupal.test.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lafol_queue")
public class LafOlQueue implements Serializable {
    private static final long serialVersionUID = 163445265077820819L;

    /** Description: item_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "item_id")
    private java.lang.Integer itemId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 255)
    private java.lang.String name;
    /** Description: data. */
    @Basic
    @Column(name = "data", length = 0)
    private java.lang.String data;
    /** Description: expire. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "expire")
    private java.lang.Integer expire;
    /** Description: created. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "created")
    private java.lang.Integer created;

    public LafOlQueue() {}

    public java.lang.Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getData() {
        return this.data;
    }

    public java.lang.Integer getExpire() {
        return this.expire;
    }

    public java.lang.Integer getCreated() {
        return this.created;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setData(java.lang.String data) {
        this.data = data;
    }

    public void setExpire(java.lang.Integer expire) {
        this.expire = expire;
    }

    public void setCreated(java.lang.Integer created) {
        this.created = created;
    }
}
