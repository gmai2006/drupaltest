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
@IdClass(LafOlNodeId.class)
@Table(name = "lafol_node")
public class LafOlNode implements Serializable {
  private static final long serialVersionUID = 166875433033370241L;

  /** Description: vid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "vid")
  private java.lang.Integer vid;
  /** Description: nid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "nid")
  private java.lang.Integer nid;
  /** Description: uuid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "uuid")
  private java.lang.String uuid;

  /** Description: type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type", length = 32)
  private java.lang.String type;
  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "langcode", length = 12)
  private java.lang.String langcode;

  public LafOlNode() {}

  public java.lang.Integer getVid() {
    return this.vid;
  }

  public java.lang.Integer getNid() {
    return this.nid;
  }

  public java.lang.String getUuid() {
    return this.uuid;
  }

  public void setVid(java.lang.Integer vid) {
    this.vid = vid;
  }

  public void setNid(java.lang.Integer nid) {
    this.nid = nid;
  }

  public void setUuid(java.lang.String uuid) {
    this.uuid = uuid;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }
}
