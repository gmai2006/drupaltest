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
@IdClass(LafOlBlockContentFieldDataId.class)
@Table(name = "lafol_block_content_field_data")
public class LafOlBlockContentFieldData implements Serializable {
  private static final long serialVersionUID = 166875433002810472L;

  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "langcode")
  private java.lang.String langcode;
  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: revision_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "revision_id")
  private java.lang.Integer revisionId;
  /** Description: type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type", length = 32)
  private java.lang.String type;
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
  /** Description: reusable. */
  @Basic
  @Column(name = "reusable")
  private java.lang.Integer reusable;
  /** Description: default_langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_langcode")
  private java.lang.Integer defaultLangcode;
  /** Description: revision_translation_affected. */
  @Basic
  @Column(name = "revision_translation_affected")
  private java.lang.Integer revisionTranslationAffected;

  public LafOlBlockContentFieldData() {}

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getRevisionId() {
    return this.revisionId;
  }

  public java.lang.String getType() {
    return this.type;
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

  public java.lang.Integer getReusable() {
    return this.reusable;
  }

  public java.lang.Integer getDefaultLangcode() {
    return this.defaultLangcode;
  }

  public java.lang.Integer getRevisionTranslationAffected() {
    return this.revisionTranslationAffected;
  }

  public void setRevisionId(java.lang.Integer revisionId) {
    this.revisionId = revisionId;
  }

  public void setType(java.lang.String type) {
    this.type = type;
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

  public void setReusable(java.lang.Integer reusable) {
    this.reusable = reusable;
  }

  public void setDefaultLangcode(java.lang.Integer defaultLangcode) {
    this.defaultLangcode = defaultLangcode;
  }

  public void setRevisionTranslationAffected(java.lang.Integer revisionTranslationAffected) {
    this.revisionTranslationAffected = revisionTranslationAffected;
  }
}
