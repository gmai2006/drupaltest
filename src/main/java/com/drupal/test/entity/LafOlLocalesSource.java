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
@Table(name = "lafol_locales_source")
public class LafOlLocalesSource implements Serializable {
    private static final long serialVersionUID = 163445265039726820L;

    /** Description: lid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "lid")
    private java.lang.Integer lid;

    /** Description: source. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "source")
    private java.lang.String source;
    /** Description: context. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "context", length = 255)
    private java.lang.String context;
    /** Description: version. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "version", length = 20)
    private java.lang.String version;

    public LafOlLocalesSource() {}

    public java.lang.Integer getLid() {
        return this.lid;
    }

    public void setLid(java.lang.Integer lid) {
        this.lid = lid;
    }

    public java.lang.String getSource() {
        return this.source;
    }

    public java.lang.String getContext() {
        return this.context;
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public void setSource(java.lang.String source) {
        this.source = source;
    }

    public void setContext(java.lang.String context) {
        this.context = context;
    }

    public void setVersion(java.lang.String version) {
        this.version = version;
    }
}
