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
@IdClass(LafOlCommentEntityStatisticsId.class)
@Table(name = "lafol_comment_entity_statistics")
public class LafOlCommentEntityStatistics implements Serializable {
    private static final long serialVersionUID = 163445265024628116L;

    /** Description: entity_type. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "entity_type")
    private java.lang.String entityType;
    /** Description: entity_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "entity_id")
    private java.lang.Integer entityId;
    /** Description: field_name. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "field_name")
    private java.lang.String fieldName;

    /** Description: cid. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "cid")
    private java.lang.Integer cid;
    /** Description: last_comment_timestamp. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "last_comment_timestamp")
    private java.lang.Integer lastCommentTimestamp;
    /** Description: last_comment_name. */
    @Basic
    @Column(name = "last_comment_name", length = 60)
    private java.lang.String lastCommentName;
    /** Description: last_comment_uid. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "last_comment_uid")
    private java.lang.Integer lastCommentUid;
    /** Description: comment_count. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "comment_count")
    private java.lang.Integer commentCount;

    public LafOlCommentEntityStatistics() {}

    public java.lang.String getEntityType() {
        return this.entityType;
    }

    public java.lang.Integer getEntityId() {
        return this.entityId;
    }

    public java.lang.String getFieldName() {
        return this.fieldName;
    }

    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }

    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }

    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }

    public java.lang.Integer getCid() {
        return this.cid;
    }

    public java.lang.Integer getLastCommentTimestamp() {
        return this.lastCommentTimestamp;
    }

    public java.lang.String getLastCommentName() {
        return this.lastCommentName;
    }

    public java.lang.Integer getLastCommentUid() {
        return this.lastCommentUid;
    }

    public java.lang.Integer getCommentCount() {
        return this.commentCount;
    }

    public void setCid(java.lang.Integer cid) {
        this.cid = cid;
    }

    public void setLastCommentTimestamp(java.lang.Integer lastCommentTimestamp) {
        this.lastCommentTimestamp = lastCommentTimestamp;
    }

    public void setLastCommentName(java.lang.String lastCommentName) {
        this.lastCommentName = lastCommentName;
    }

    public void setLastCommentUid(java.lang.Integer lastCommentUid) {
        this.lastCommentUid = lastCommentUid;
    }

    public void setCommentCount(java.lang.Integer commentCount) {
        this.commentCount = commentCount;
    }
}
