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
@IdClass(LafOlTaxonomyTermFieldDataId.class)
@Table(name = "lafol_taxonomy_term_field_data")
public class LafOlTaxonomyTermFieldData implements Serializable {
  private static final long serialVersionUID = 16687543306185839L;

  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "langcode")
  private java.lang.String langcode;
  /** Description: tid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tid")
  private java.lang.Integer tid;

  /** Description: revision_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "revision_id")
  private java.lang.Integer revisionId;
  /** Description: vid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "vid", length = 32)
  private java.lang.String vid;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status")
  private java.lang.Integer status;
  /** Description: name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: description__value. */
  @Basic
  @Column(name = "description__value", length = 0)
  private java.lang.String descriptionValue;
  /** Description: description__format. */
  @Basic
  @Column(name = "description__format", length = 255)
  private java.lang.String descriptionFormat;
  /** Description: weight. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "weight")
  private java.lang.Integer weight;
  /** Description: changed. */
  @Basic
  @Column(name = "changed")
  private java.lang.Integer changed;
  /** Description: default_langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_langcode")
  private java.lang.Integer defaultLangcode;
  /** Description: revision_translation_affected. */
  @Basic
  @Column(name = "revision_translation_affected")
  private java.lang.Integer revisionTranslationAffected;

  public LafOlTaxonomyTermFieldData() {}

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.Integer getTid() {
    return this.tid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setTid(java.lang.Integer tid) {
    this.tid = tid;
  }

  public java.lang.Integer getRevisionId() {
    return this.revisionId;
  }

  public java.lang.String getVid() {
    return this.vid;
  }

  public java.lang.Integer getStatus() {
    return this.status;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getDescriptionValue() {
    return this.descriptionValue;
  }

  public java.lang.String getDescriptionFormat() {
    return this.descriptionFormat;
  }

  public java.lang.Integer getWeight() {
    return this.weight;
  }

  public java.lang.Integer getChanged() {
    return this.changed;
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

  public void setVid(java.lang.String vid) {
    this.vid = vid;
  }

  public void setStatus(java.lang.Integer status) {
    this.status = status;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setDescriptionValue(java.lang.String descriptionValue) {
    this.descriptionValue = descriptionValue;
  }

  public void setDescriptionFormat(java.lang.String descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
  }

  public void setWeight(java.lang.Integer weight) {
    this.weight = weight;
  }

  public void setChanged(java.lang.Integer changed) {
    this.changed = changed;
  }

  public void setDefaultLangcode(java.lang.Integer defaultLangcode) {
    this.defaultLangcode = defaultLangcode;
  }

  public void setRevisionTranslationAffected(java.lang.Integer revisionTranslationAffected) {
    this.revisionTranslationAffected = revisionTranslationAffected;
  }
}
