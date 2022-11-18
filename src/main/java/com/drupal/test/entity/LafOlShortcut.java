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
@IdClass(LafOlShortcutId.class)
@Table(name = "lafol_shortcut")
public class LafOlShortcut implements Serializable {
  private static final long serialVersionUID = 166875433054962811L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;
  /** Description: uuid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "uuid")
  private java.lang.String uuid;

  /** Description: shortcut_set. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "shortcut_set", length = 32)
  private java.lang.String shortcutSet;
  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "langcode", length = 12)
  private java.lang.String langcode;

  public LafOlShortcut() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public java.lang.String getUuid() {
    return this.uuid;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public void setUuid(java.lang.String uuid) {
    this.uuid = uuid;
  }

  public java.lang.String getShortcutSet() {
    return this.shortcutSet;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public void setShortcutSet(java.lang.String shortcutSet) {
    this.shortcutSet = shortcutSet;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }
}
