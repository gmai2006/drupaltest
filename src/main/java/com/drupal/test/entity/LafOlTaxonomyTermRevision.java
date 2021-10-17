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
@Table(name = "lafol_taxonomy_term_revision")
public class LafOlTaxonomyTermRevision implements Serializable {
    private static final long serialVersionUID = 163445265101228114L;

    /** Description: revision_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "revision_id")
    private java.lang.Integer revisionId;

    /** Description: tid. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "tid")
    private java.lang.Integer tid;
    /** Description: langcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "langcode", length = 12)
    private java.lang.String langcode;
    /** Description: revision_user. */
    @Basic
    @Column(name = "revision_user")
    private java.lang.Integer revisionUser;
    /** Description: revision_created. */
    @Basic
    @Column(name = "revision_created")
    private java.lang.Integer revisionCreated;
    /** Description: revision_log_message. */
    @Basic
    @Column(name = "revision_log_message", length = 0)
    private java.lang.String revisionLogMessage;
    /** Description: revision_default. */
    @Basic
    @Column(name = "revision_default")
    private java.lang.Integer revisionDefault;

    public LafOlTaxonomyTermRevision() {}

    public java.lang.Integer getRevisionId() {
        return this.revisionId;
    }

    public void setRevisionId(java.lang.Integer revisionId) {
        this.revisionId = revisionId;
    }

    public java.lang.Integer getTid() {
        return this.tid;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getRevisionUser() {
        return this.revisionUser;
    }

    public java.lang.Integer getRevisionCreated() {
        return this.revisionCreated;
    }

    public java.lang.String getRevisionLogMessage() {
        return this.revisionLogMessage;
    }

    public java.lang.Integer getRevisionDefault() {
        return this.revisionDefault;
    }

    public void setTid(java.lang.Integer tid) {
        this.tid = tid;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setRevisionUser(java.lang.Integer revisionUser) {
        this.revisionUser = revisionUser;
    }

    public void setRevisionCreated(java.lang.Integer revisionCreated) {
        this.revisionCreated = revisionCreated;
    }

    public void setRevisionLogMessage(java.lang.String revisionLogMessage) {
        this.revisionLogMessage = revisionLogMessage;
    }

    public void setRevisionDefault(java.lang.Integer revisionDefault) {
        this.revisionDefault = revisionDefault;
    }
}
