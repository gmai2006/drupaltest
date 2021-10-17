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
@IdClass(LafOlLocalesTargetId.class)
@Table(name = "lafol_locales_target")
public class LafOlLocalesTarget implements Serializable {
    private static final long serialVersionUID = 163445265041077980L;

    /** Description: lid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "lid")
    private java.lang.Integer lid;
    /** Description: language. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "language")
    private java.lang.String language;

    /** Description: translation. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "translation")
    private java.lang.String translation;
    /** Description: customized. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customized")
    private java.lang.Integer customized;

    public LafOlLocalesTarget() {}

    public java.lang.Integer getLid() {
        return this.lid;
    }

    public java.lang.String getLanguage() {
        return this.language;
    }

    public void setLid(java.lang.Integer lid) {
        this.lid = lid;
    }

    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    public java.lang.String getTranslation() {
        return this.translation;
    }

    public java.lang.Integer getCustomized() {
        return this.customized;
    }

    public void setTranslation(java.lang.String translation) {
        this.translation = translation;
    }

    public void setCustomized(java.lang.Integer customized) {
        this.customized = customized;
    }
}
