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
@IdClass(LafOlUsersFieldDataId.class)
@Table(name = "lafol_users_field_data")
public class LafOlUsersFieldData implements Serializable {
  private static final long serialVersionUID = 166875433072821287L;

  /** Description: uid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "uid")
  private java.lang.Integer uid;
  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "langcode")
  private java.lang.String langcode;
  /** Description: name. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "name")
  private java.lang.String name;

  /** Description: preferred_langcode. */
  @Basic
  @Column(name = "preferred_langcode", length = 12)
  private java.lang.String preferredLangcode;
  /** Description: preferred_admin_langcode. */
  @Basic
  @Column(name = "preferred_admin_langcode", length = 12)
  private java.lang.String preferredAdminLangcode;
  /** Description: pass. */
  @Basic
  @Column(name = "pass", length = 255)
  private java.lang.String pass;
  /** Description: mail. */
  @Basic
  @Column(name = "mail", length = 254)
  private java.lang.String mail;
  /** Description: timezone. */
  @Basic
  @Column(name = "timezone", length = 32)
  private java.lang.String timezone;
  /** Description: status. */
  @Basic
  @Column(name = "status")
  private java.lang.Integer status;
  /** Description: created. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created")
  private java.lang.Integer created;
  /** Description: changed. */
  @Basic
  @Column(name = "changed")
  private java.lang.Integer changed;
  /** Description: access. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "access")
  private java.lang.Integer access;
  /** Description: login. */
  @Basic
  @Column(name = "login")
  private java.lang.Integer login;
  /** Description: init. */
  @Basic
  @Column(name = "init", length = 254)
  private java.lang.String init;
  /** Description: default_langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "default_langcode")
  private java.lang.Integer defaultLangcode;

  public LafOlUsersFieldData() {}

  public java.lang.Integer getUid() {
    return this.uid;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setUid(java.lang.Integer uid) {
    this.uid = uid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.String getPreferredLangcode() {
    return this.preferredLangcode;
  }

  public java.lang.String getPreferredAdminLangcode() {
    return this.preferredAdminLangcode;
  }

  public java.lang.String getPass() {
    return this.pass;
  }

  public java.lang.String getMail() {
    return this.mail;
  }

  public java.lang.String getTimezone() {
    return this.timezone;
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

  public java.lang.Integer getAccess() {
    return this.access;
  }

  public java.lang.Integer getLogin() {
    return this.login;
  }

  public java.lang.String getInit() {
    return this.init;
  }

  public java.lang.Integer getDefaultLangcode() {
    return this.defaultLangcode;
  }

  public void setPreferredLangcode(java.lang.String preferredLangcode) {
    this.preferredLangcode = preferredLangcode;
  }

  public void setPreferredAdminLangcode(java.lang.String preferredAdminLangcode) {
    this.preferredAdminLangcode = preferredAdminLangcode;
  }

  public void setPass(java.lang.String pass) {
    this.pass = pass;
  }

  public void setMail(java.lang.String mail) {
    this.mail = mail;
  }

  public void setTimezone(java.lang.String timezone) {
    this.timezone = timezone;
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

  public void setAccess(java.lang.Integer access) {
    this.access = access;
  }

  public void setLogin(java.lang.Integer login) {
    this.login = login;
  }

  public void setInit(java.lang.String init) {
    this.init = init;
  }

  public void setDefaultLangcode(java.lang.Integer defaultLangcode) {
    this.defaultLangcode = defaultLangcode;
  }
}
