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
@IdClass(LafOlCommentId.class)
@Table(name = "lafol_comment")
public class LafOlComment implements Serializable {
    private static final long serialVersionUID = 163445265021135220L;

    /** Description: uuid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "uuid")
    private java.lang.String uuid;
    /** Description: cid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "cid")
    private java.lang.Integer cid;

    /** Description: comment_type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "comment_type", length = 32)
    private java.lang.String commentType;
    /** Description: langcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "langcode", length = 12)
    private java.lang.String langcode;

    public LafOlComment() {}

    public java.lang.String getUuid() {
        return this.uuid;
    }

    public java.lang.Integer getCid() {
        return this.cid;
    }

    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    public void setCid(java.lang.Integer cid) {
        this.cid = cid;
    }

    public java.lang.String getCommentType() {
        return this.commentType;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public void setCommentType(java.lang.String commentType) {
        this.commentType = commentType;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }
}
