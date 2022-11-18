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
@Table(name = "lafol_block_content_revision")
public class LafOlBlockContentRevision implements Serializable {
  private static final long serialVersionUID = 166875433004672244L;

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
  /** Description: revision_log. */
  @Basic
  @Column(name = "revision_log", length = 0)
  private java.lang.String revisionLog;
  /** Description: revision_default. */
  @Basic
  @Column(name = "revision_default")
  private java.lang.Integer revisionDefault;

  public LafOlBlockContentRevision() {}

  public java.lang.Integer getRevisionId() {
    return this.revisionId;
  }

  public void setRevisionId(java.lang.Integer revisionId) {
    this.revisionId = revisionId;
  }

  public java.lang.Integer getId() {
    return this.id;
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

  public java.lang.String getRevisionLog() {
    return this.revisionLog;
  }

  public java.lang.Integer getRevisionDefault() {
    return this.revisionDefault;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
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

  public void setRevisionLog(java.lang.String revisionLog) {
    this.revisionLog = revisionLog;
  }

  public void setRevisionDefault(java.lang.Integer revisionDefault) {
    this.revisionDefault = revisionDefault;
  }
}
