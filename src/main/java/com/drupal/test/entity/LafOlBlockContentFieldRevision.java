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
@IdClass(LafOlBlockContentFieldRevisionId.class)
@Table(name = "lafol_block_content_field_revision")
public class LafOlBlockContentFieldRevision implements Serializable {
    private static final long serialVersionUID = 163445265002982013L;

    /** Description: langcode. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "langcode")
    private java.lang.String langcode;
    /** Description: revision_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "revision_id")
    private java.lang.Integer revisionId;

    /** Description: id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "id")
    private java.lang.Integer id;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Integer status;
    /** Description: info. */
    @Basic
    @Column(name = "info", length = 255)
    private java.lang.String info;
    /** Description: changed. */
    @Basic
    @Column(name = "changed")
    private java.lang.Integer changed;
    /** Description: default_langcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "default_langcode")
    private java.lang.Integer defaultLangcode;
    /** Description: revision_translation_affected. */
    @Basic
    @Column(name = "revision_translation_affected")
    private java.lang.Integer revisionTranslationAffected;

    public LafOlBlockContentFieldRevision() {}

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getRevisionId() {
        return this.revisionId;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setRevisionId(java.lang.Integer revisionId) {
        this.revisionId = revisionId;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public java.lang.String getInfo() {
        return this.info;
    }

    public java.lang.Integer getChanged() {
        return this.changed;
    }

    public java.lang.Integer getDefaultLangcode() {
        return this.defaultLangcode;
    }

    public java.lang.Integer getRevisionTranslationAffected() {
        return this.revisionTranslationAffected;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    public void setInfo(java.lang.String info) {
        this.info = info;
    }

    public void setChanged(java.lang.Integer changed) {
        this.changed = changed;
    }

    public void setDefaultLangcode(java.lang.Integer defaultLangcode) {
        this.defaultLangcode = defaultLangcode;
    }

    public void setRevisionTranslationAffected(java.lang.Integer revisionTranslationAffected) {
        this.revisionTranslationAffected = revisionTranslationAffected;
    }
}
