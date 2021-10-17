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
@IdClass(LafOlFileManagedId.class)
@Table(name = "lafol_file_managed")
public class LafOlFileManaged implements Serializable {
    private static final long serialVersionUID = 163445265030169357L;

    /** Description: fid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "fid")
    private java.lang.Integer fid;
    /** Description: uuid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "uuid")
    private java.lang.String uuid;

    /** Description: langcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "langcode", length = 12)
    private java.lang.String langcode;
    /** Description: uid. */
    @Basic
    @Column(name = "uid")
    private java.lang.Integer uid;
    /** Description: filename. */
    @Basic
    @Column(name = "filename", length = 255)
    private java.lang.String filename;
    /** Description: uri. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "uri", length = 255)
    private java.lang.String uri;
    /** Description: filemime. */
    @Basic
    @Column(name = "filemime", length = 255)
    private java.lang.String filemime;
    /** Description: filesize. */
    @Basic
    @Column(name = "filesize")
    private java.lang.Long filesize;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Integer status;
    /** Description: created. */
    @Basic
    @Column(name = "created")
    private java.lang.Integer created;
    /** Description: changed. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "changed")
    private java.lang.Integer changed;

    public LafOlFileManaged() {}

    public java.lang.Integer getFid() {
        return this.fid;
    }

    public java.lang.String getUuid() {
        return this.uuid;
    }

    public void setFid(java.lang.Integer fid) {
        this.fid = fid;
    }

    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getUid() {
        return this.uid;
    }

    public java.lang.String getFilename() {
        return this.filename;
    }

    public java.lang.String getUri() {
        return this.uri;
    }

    public java.lang.String getFilemime() {
        return this.filemime;
    }

    public java.lang.Long getFilesize() {
        return this.filesize;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public java.lang.Integer getCreated() {
        return this.created;
    }

    public java.lang.Integer getChanged() {
        return this.changed;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setUid(java.lang.Integer uid) {
        this.uid = uid;
    }

    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    public void setFilemime(java.lang.String filemime) {
        this.filemime = filemime;
    }

    public void setFilesize(java.lang.Long filesize) {
        this.filesize = filesize;
    }

    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    public void setCreated(java.lang.Integer created) {
        this.created = created;
    }

    public void setChanged(java.lang.Integer changed) {
        this.changed = changed;
    }
}
