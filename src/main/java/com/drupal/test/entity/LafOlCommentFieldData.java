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
@IdClass(LafOlCommentFieldDataId.class)
@Table(name = "lafol_comment_field_data")
public class LafOlCommentFieldData implements Serializable {
    private static final long serialVersionUID = 16344526502631690L;

    /** Description: langcode. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "langcode")
    private java.lang.String langcode;
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
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Integer status;
    /** Description: uid. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "uid")
    private java.lang.Integer uid;
    /** Description: pid. */
    @Basic
    @Column(name = "pid")
    private java.lang.Integer pid;
    /** Description: entity_id. */
    @Basic
    @Column(name = "entity_id")
    private java.lang.Integer entityId;
    /** Description: subject. */
    @Basic
    @Column(name = "subject", length = 64)
    private java.lang.String subject;
    /** Description: name. */
    @Basic
    @Column(name = "name", length = 60)
    private java.lang.String name;
    /** Description: mail. */
    @Basic
    @Column(name = "mail", length = 254)
    private java.lang.String mail;
    /** Description: homepage. */
    @Basic
    @Column(name = "homepage", length = 255)
    private java.lang.String homepage;
    /** Description: hostname. */
    @Basic
    @Column(name = "hostname", length = 128)
    private java.lang.String hostname;
    /** Description: created. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "created")
    private java.lang.Integer created;
    /** Description: changed. */
    @Basic
    @Column(name = "changed")
    private java.lang.Integer changed;
    /** Description: thread. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "thread", length = 255)
    private java.lang.String thread;
    /** Description: entity_type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "entity_type", length = 32)
    private java.lang.String entityType;
    /** Description: field_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "field_name", length = 32)
    private java.lang.String fieldName;
    /** Description: default_langcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "default_langcode")
    private java.lang.Integer defaultLangcode;

    public LafOlCommentFieldData() {}

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getCid() {
        return this.cid;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setCid(java.lang.Integer cid) {
        this.cid = cid;
    }

    public java.lang.String getCommentType() {
        return this.commentType;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public java.lang.Integer getUid() {
        return this.uid;
    }

    public java.lang.Integer getPid() {
        return this.pid;
    }

    public java.lang.Integer getEntityId() {
        return this.entityId;
    }

    public java.lang.String getSubject() {
        return this.subject;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getMail() {
        return this.mail;
    }

    public java.lang.String getHomepage() {
        return this.homepage;
    }

    public java.lang.String getHostname() {
        return this.hostname;
    }

    public java.lang.Integer getCreated() {
        return this.created;
    }

    public java.lang.Integer getChanged() {
        return this.changed;
    }

    public java.lang.String getThread() {
        return this.thread;
    }

    public java.lang.String getEntityType() {
        return this.entityType;
    }

    public java.lang.String getFieldName() {
        return this.fieldName;
    }

    public java.lang.Integer getDefaultLangcode() {
        return this.defaultLangcode;
    }

    public void setCommentType(java.lang.String commentType) {
        this.commentType = commentType;
    }

    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    public void setUid(java.lang.Integer uid) {
        this.uid = uid;
    }

    public void setPid(java.lang.Integer pid) {
        this.pid = pid;
    }

    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }

    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setMail(java.lang.String mail) {
        this.mail = mail;
    }

    public void setHomepage(java.lang.String homepage) {
        this.homepage = homepage;
    }

    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }

    public void setCreated(java.lang.Integer created) {
        this.created = created;
    }

    public void setChanged(java.lang.Integer changed) {
        this.changed = changed;
    }

    public void setThread(java.lang.String thread) {
        this.thread = thread;
    }

    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }

    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }

    public void setDefaultLangcode(java.lang.Integer defaultLangcode) {
        this.defaultLangcode = defaultLangcode;
    }
}
