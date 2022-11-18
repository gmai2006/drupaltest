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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "lafol_node_revision")
public class LafOlNodeRevision implements Serializable {
  private static final long serialVersionUID = 166875433042255854L;

  /** Description: vid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "vid")
  private java.lang.Integer vid;

  /** Description: nid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "nid")
  private java.lang.Integer nid;
  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "langcode", length = 12)
  private java.lang.String langcode;
  /** Description: revision_uid. */
  @Basic
  @Column(name = "revision_uid")
  private java.lang.Integer revisionUid;
  /** Description: revision_timestamp. */
  @Basic
  @Column(name = "revision_timestamp")
  private java.lang.Integer revisionTimestamp;
  /** Description: revision_log. */
  @Basic
  @Column(name = "revision_log", length = 0)
  private java.lang.String revisionLog;
  /** Description: revision_default. */
  @Basic
  @Column(name = "revision_default")
  private java.lang.Integer revisionDefault;

  public LafOlNodeRevision() {}

  public java.lang.Integer getVid() {
    return this.vid;
  }

  public void setVid(java.lang.Integer vid) {
    this.vid = vid;
  }

  public java.lang.Integer getNid() {
    return this.nid;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.Integer getRevisionUid() {
    return this.revisionUid;
  }

  public java.lang.Integer getRevisionTimestamp() {
    return this.revisionTimestamp;
  }

  public java.lang.String getRevisionLog() {
    return this.revisionLog;
  }

  public java.lang.Integer getRevisionDefault() {
    return this.revisionDefault;
  }

  public void setNid(java.lang.Integer nid) {
    this.nid = nid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setRevisionUid(java.lang.Integer revisionUid) {
    this.revisionUid = revisionUid;
  }

  public void setRevisionTimestamp(java.lang.Integer revisionTimestamp) {
    this.revisionTimestamp = revisionTimestamp;
  }

  public void setRevisionLog(java.lang.String revisionLog) {
    this.revisionLog = revisionLog;
  }

  public void setRevisionDefault(java.lang.Integer revisionDefault) {
    this.revisionDefault = revisionDefault;
  }
}
