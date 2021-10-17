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
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(LafOlUsersDataId.class)
@Table(name = "lafol_users_data")
public class LafOlUsersData implements Serializable {
    private static final long serialVersionUID = 163445265111567700L;

    /** Description: uid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "uid")
    private java.lang.Integer uid;
    /** Description: module. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "module")
    private java.lang.String module;
    /** Description: name. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "name")
    private java.lang.String name;

    /** Description: value. */
    @Basic
    @Column(name = "value", length = 0)
    private java.lang.String value;
    /** Description: serialized. */
    @Basic
    @Column(name = "serialized")
    private java.lang.Integer serialized;

    public LafOlUsersData() {}

    public java.lang.Integer getUid() {
        return this.uid;
    }

    public java.lang.String getModule() {
        return this.module;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setUid(java.lang.Integer uid) {
        this.uid = uid;
    }

    public void setModule(java.lang.String module) {
        this.module = module;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public java.lang.Integer getSerialized() {
        return this.serialized;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public void setSerialized(java.lang.Integer serialized) {
        this.serialized = serialized;
    }
}
