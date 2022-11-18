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
@IdClass(LafOlMenuLinkContentFieldRevisionId.class)
@Table(name = "lafol_menu_link_content_field_revision")
public class LafOlMenuLinkContentFieldRevision implements Serializable {
  private static final long serialVersionUID = 166875433029810500L;

  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "langcode")
  private java.lang.String langcode;
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
  /** Description: enabled. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "enabled")
  private java.lang.Integer enabled;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: description. */
  @Basic
  @Column(name = "description", length = 255)
  private java.lang.String description;
  /** Description: link__uri. */
  @Basic
  @Column(name = "link__uri", length = 2048)
  private java.lang.String linkUri;
  /** Description: link__title. */
  @Basic
  @Column(name = "link__title", length = 255)
  private java.lang.String linkTitle;
  /** Description: link__options. */
  @Basic
  @Column(name = "link__options", length = 0)
  private java.lang.String linkOptions;
  /** Description: external. */
  @Basic
  @Column(name = "external")
  private java.lang.Integer external;
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

  public LafOlMenuLinkContentFieldRevision() {}

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.Integer getRevisionId() {
    return this.revisionId;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setRevisionId(java.lang.Integer revisionId) {
    this.revisionId = revisionId;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public java.lang.Integer getEnabled() {
    return this.enabled;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public java.lang.String getLinkUri() {
    return this.linkUri;
  }

  public java.lang.String getLinkTitle() {
    return this.linkTitle;
  }

  public java.lang.String getLinkOptions() {
    return this.linkOptions;
  }

  public java.lang.Integer getExternal() {
    return this.external;
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

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public void setEnabled(java.lang.Integer enabled) {
    this.enabled = enabled;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void setLinkUri(java.lang.String linkUri) {
    this.linkUri = linkUri;
  }

  public void setLinkTitle(java.lang.String linkTitle) {
    this.linkTitle = linkTitle;
  }

  public void setLinkOptions(java.lang.String linkOptions) {
    this.linkOptions = linkOptions;
  }

  public void setExternal(java.lang.Integer external) {
    this.external = external;
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
