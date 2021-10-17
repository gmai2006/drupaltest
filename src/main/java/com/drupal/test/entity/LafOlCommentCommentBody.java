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
@IdClass(LafOlCommentCommentBodyId.class)
@Table(name = "lafol_comment__comment_body")
public class LafOlCommentCommentBody implements Serializable {
    private static final long serialVersionUID = 163445265022814771L;

    /** Description: langcode. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "langcode")
    private java.lang.String langcode;
    /** Description: deleted. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "deleted")
    private java.lang.Integer deleted;
    /** Description: delta. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "delta")
    private java.lang.Integer delta;
    /** Description: entity_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "entity_id")
    private java.lang.Integer entityId;

    /** Description: bundle. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "bundle", length = 128)
    private java.lang.String bundle;
    /** Description: revision_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "revision_id")
    private java.lang.Integer revisionId;
    /** Description: comment_body_value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "comment_body_value", length = 0)
    private java.lang.String commentBodyValue;
    /** Description: comment_body_format. */
    @Basic
    @Column(name = "comment_body_format", length = 255)
    private java.lang.String commentBodyFormat;

    public LafOlCommentCommentBody() {}

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getDeleted() {
        return this.deleted;
    }

    public java.lang.Integer getDelta() {
        return this.delta;
    }

    public java.lang.Integer getEntityId() {
        return this.entityId;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setDeleted(java.lang.Integer deleted) {
        this.deleted = deleted;
    }

    public void setDelta(java.lang.Integer delta) {
        this.delta = delta;
    }

    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }

    public java.lang.String getBundle() {
        return this.bundle;
    }

    public java.lang.Integer getRevisionId() {
        return this.revisionId;
    }

    public java.lang.String getCommentBodyValue() {
        return this.commentBodyValue;
    }

    public java.lang.String getCommentBodyFormat() {
        return this.commentBodyFormat;
    }

    public void setBundle(java.lang.String bundle) {
        this.bundle = bundle;
    }

    public void setRevisionId(java.lang.Integer revisionId) {
        this.revisionId = revisionId;
    }

    public void setCommentBodyValue(java.lang.String commentBodyValue) {
        this.commentBodyValue = commentBodyValue;
    }

    public void setCommentBodyFormat(java.lang.String commentBodyFormat) {
        this.commentBodyFormat = commentBodyFormat;
    }
}
