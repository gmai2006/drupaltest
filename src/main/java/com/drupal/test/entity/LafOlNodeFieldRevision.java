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
@IdClass(LafOlNodeFieldRevisionId.class)
@Table(name = "lafol_node_field_revision")
public class LafOlNodeFieldRevision implements Serializable {
  private static final long serialVersionUID = 166875433041529869L;

  /** Description: vid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "vid")
  private java.lang.Integer vid;
  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "langcode")
  private java.lang.String langcode;

  /** Description: nid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "nid")
  private java.lang.Integer nid;
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
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: created. */
  @Basic
  @Column(name = "created")
  private java.lang.Integer created;
  /** Description: changed. */
  @Basic
  @Column(name = "changed")
  private java.lang.Integer changed;
  /** Description: promote. */
  @Basic
  @Column(name = "promote")
  private java.lang.Integer promote;
  /** Description: sticky. */
  @Basic
  @Column(name = "sticky")
  private java.lang.Integer sticky;
  /** Description: default_langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_langcode")
  private java.lang.Integer defaultLangcode;
  /** Description: revision_translation_affected. */
  @Basic
  @Column(name = "revision_translation_affected")
  private java.lang.Integer revisionTranslationAffected;

  public LafOlNodeFieldRevision() {}

  public java.lang.Integer getVid() {
    return this.vid;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public void setVid(java.lang.Integer vid) {
    this.vid = vid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public java.lang.Integer getNid() {
    return this.nid;
  }

  public java.lang.Integer getStatus() {
    return this.status;
  }

  public java.lang.Integer getUid() {
    return this.uid;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.Integer getCreated() {
    return this.created;
  }

  public java.lang.Integer getChanged() {
    return this.changed;
  }

  public java.lang.Integer getPromote() {
    return this.promote;
  }

  public java.lang.Integer getSticky() {
    return this.sticky;
  }

  public java.lang.Integer getDefaultLangcode() {
    return this.defaultLangcode;
  }

  public java.lang.Integer getRevisionTranslationAffected() {
    return this.revisionTranslationAffected;
  }

  public void setNid(java.lang.Integer nid) {
    this.nid = nid;
  }

  public void setStatus(java.lang.Integer status) {
    this.status = status;
  }

  public void setUid(java.lang.Integer uid) {
    this.uid = uid;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setCreated(java.lang.Integer created) {
    this.created = created;
  }

  public void setChanged(java.lang.Integer changed) {
    this.changed = changed;
  }

  public void setPromote(java.lang.Integer promote) {
    this.promote = promote;
  }

  public void setSticky(java.lang.Integer sticky) {
    this.sticky = sticky;
  }

  public void setDefaultLangcode(java.lang.Integer defaultLangcode) {
    this.defaultLangcode = defaultLangcode;
  }

  public void setRevisionTranslationAffected(java.lang.Integer revisionTranslationAffected) {
    this.revisionTranslationAffected = revisionTranslationAffected;
  }
}
