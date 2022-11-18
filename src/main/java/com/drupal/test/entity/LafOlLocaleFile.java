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
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(LafOlLocaleFileId.class)
@Table(name = "lafol_locale_file")
public class LafOlLocaleFile implements Serializable {
  private static final long serialVersionUID = 16687543302436896L;

  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "langcode")
  private java.lang.String langcode;
  /** Description: project. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "project")
  private java.lang.String project;

  /** Description: filename. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "filename", length = 255)
  private java.lang.String filename;
  /** Description: version. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "version", length = 128)
  private java.lang.String version;
  /** Description: uri. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "uri", length = 255)
  private java.lang.String uri;
  /** Description: timestamp. */
  @Basic
  @Column(name = "timestamp")
  private java.lang.Integer timestamp;
  /** Description: last_checked. */
  @Basic
  @Column(name = "last_checked")
  private java.lang.Integer lastChecked;

  public LafOlLocaleFile() {}

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.String getProject() {
    return this.project;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setProject(java.lang.String project) {
    this.project = project;
  }

  public java.lang.String getFilename() {
    return this.filename;
  }

  public java.lang.String getVersion() {
    return this.version;
  }

  public java.lang.String getUri() {
    return this.uri;
  }

  public java.lang.Integer getTimestamp() {
    return this.timestamp;
  }

  public java.lang.Integer getLastChecked() {
    return this.lastChecked;
  }

  public void setFilename(java.lang.String filename) {
    this.filename = filename;
  }

  public void setVersion(java.lang.String version) {
    this.version = version;
  }

  public void setUri(java.lang.String uri) {
    this.uri = uri;
  }

  public void setTimestamp(java.lang.Integer timestamp) {
    this.timestamp = timestamp;
  }

  public void setLastChecked(java.lang.Integer lastChecked) {
    this.lastChecked = lastChecked;
  }
}
