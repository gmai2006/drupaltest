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
@IdClass(LafOlShortcutFieldDataId.class)
@Table(name = "lafol_shortcut_field_data")
public class LafOlShortcutFieldData implements Serializable {
  private static final long serialVersionUID = 166875433056150304L;

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

  /** Description: shortcut_set. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "shortcut_set", length = 32)
  private java.lang.String shortcutSet;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: weight. */
  @Basic
  @Column(name = "weight")
  private java.lang.Integer weight;
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
  /** Description: default_langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_langcode")
  private java.lang.Integer defaultLangcode;

  public LafOlShortcutFieldData() {}

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

  public java.lang.String getShortcutSet() {
    return this.shortcutSet;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.Integer getWeight() {
    return this.weight;
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

  public java.lang.Integer getDefaultLangcode() {
    return this.defaultLangcode;
  }

  public void setShortcutSet(java.lang.String shortcutSet) {
    this.shortcutSet = shortcutSet;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setWeight(java.lang.Integer weight) {
    this.weight = weight;
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

  public void setDefaultLangcode(java.lang.Integer defaultLangcode) {
    this.defaultLangcode = defaultLangcode;
  }
}
