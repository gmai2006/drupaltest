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
@IdClass(LafOlFileUsageId.class)
@Table(name = "lafol_file_usage")
public class LafOlFileUsage implements Serializable {
    private static final long serialVersionUID = 16344526503219972L;

    /** Description: fid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "fid")
    private java.lang.Integer fid;
    /** Description: module. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "module")
    private java.lang.String module;
    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.String id;
    /** Description: type. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "type")
    private java.lang.String type;

    /** Description: count. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "count")
    private java.lang.Integer count;

    public LafOlFileUsage() {}

    public java.lang.Integer getFid() {
        return this.fid;
    }

    public java.lang.String getModule() {
        return this.module;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void setFid(java.lang.Integer fid) {
        this.fid = fid;
    }

    public void setModule(java.lang.String module) {
        this.module = module;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public java.lang.Integer getCount() {
        return this.count;
    }

    public void setCount(java.lang.Integer count) {
        this.count = count;
    }
}
