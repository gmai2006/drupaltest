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
@IdClass(LafOlNodeAccessId.class)
@Table(name = "lafol_node_access")
public class LafOlNodeAccess implements Serializable {
  private static final long serialVersionUID = 166875433039268216L;

  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "langcode")
  private java.lang.String langcode;
  /** Description: gid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "gid")
  private java.lang.Integer gid;
  /** Description: nid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "nid")
  private java.lang.Integer nid;
  /** Description: realm. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "realm")
  private java.lang.String realm;

  /** Description: fallback. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "fallback")
  private java.lang.Integer fallback;
  /** Description: grant_view. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "grant_view")
  private java.lang.Integer grantView;
  /** Description: grant_update. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "grant_update")
  private java.lang.Integer grantUpdate;
  /** Description: grant_delete. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "grant_delete")
  private java.lang.Integer grantDelete;

  public LafOlNodeAccess() {}

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.Integer getGid() {
    return this.gid;
  }

  public java.lang.Integer getNid() {
    return this.nid;
  }

  public java.lang.String getRealm() {
    return this.realm;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setGid(java.lang.Integer gid) {
    this.gid = gid;
  }

  public void setNid(java.lang.Integer nid) {
    this.nid = nid;
  }

  public void setRealm(java.lang.String realm) {
    this.realm = realm;
  }

  public java.lang.Integer getFallback() {
    return this.fallback;
  }

  public java.lang.Integer getGrantView() {
    return this.grantView;
  }

  public java.lang.Integer getGrantUpdate() {
    return this.grantUpdate;
  }

  public java.lang.Integer getGrantDelete() {
    return this.grantDelete;
  }

  public void setFallback(java.lang.Integer fallback) {
    this.fallback = fallback;
  }

  public void setGrantView(java.lang.Integer grantView) {
    this.grantView = grantView;
  }

  public void setGrantUpdate(java.lang.Integer grantUpdate) {
    this.grantUpdate = grantUpdate;
  }

  public void setGrantDelete(java.lang.Integer grantDelete) {
    this.grantDelete = grantDelete;
  }
}
