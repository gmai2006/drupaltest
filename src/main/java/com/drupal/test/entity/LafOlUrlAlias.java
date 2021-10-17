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
@Table(name = "lafol_url_alias")
public class LafOlUrlAlias implements Serializable {
    private static final long serialVersionUID = 163445265104532347L;

    /** Description: pid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "pid")
    private java.lang.Integer pid;

    /** Description: source. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "source", length = 255)
    private java.lang.String source;
    /** Description: alias. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "alias", length = 255)
    private java.lang.String alias;
    /** Description: langcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "langcode", length = 12)
    private java.lang.String langcode;

    public LafOlUrlAlias() {}

    public java.lang.Integer getPid() {
        return this.pid;
    }

    public void setPid(java.lang.Integer pid) {
        this.pid = pid;
    }

    public java.lang.String getSource() {
        return this.source;
    }

    public java.lang.String getAlias() {
        return this.alias;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public void setSource(java.lang.String source) {
        this.source = source;
    }

    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }
}
