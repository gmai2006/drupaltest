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
@Table(name = "lafol_locales_location")
public class LafOlLocalesLocation implements Serializable {
    private static final long serialVersionUID = 16344526503903057L;

    /** Description: lid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "lid")
    private java.lang.Integer lid;

    /** Description: sid. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sid")
    private java.lang.Integer sid;
    /** Description: type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "type", length = 50)
    private java.lang.String type;
    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 255)
    private java.lang.String name;
    /** Description: version. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "version", length = 20)
    private java.lang.String version;

    public LafOlLocalesLocation() {}

    public java.lang.Integer getLid() {
        return this.lid;
    }

    public void setLid(java.lang.Integer lid) {
        this.lid = lid;
    }

    public java.lang.Integer getSid() {
        return this.sid;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public void setSid(java.lang.Integer sid) {
        this.sid = sid;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setVersion(java.lang.String version) {
        this.version = version;
    }
}
