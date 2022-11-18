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
@IdClass(LafOlHistoryId.class)
@Table(name = "lafol_history")
public class LafOlHistory implements Serializable {
  private static final long serialVersionUID = 166875433021125952L;

  /** Description: uid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "uid")
  private java.lang.Integer uid;
  /** Description: nid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "nid")
  private java.lang.Integer nid;

  /** Description: timestamp. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "timestamp")
  private java.lang.Integer timestamp;

  public LafOlHistory() {}

  public java.lang.Integer getUid() {
    return this.uid;
  }

  public java.lang.Integer getNid() {
    return this.nid;
  }

  public void setUid(java.lang.Integer uid) {
    this.uid = uid;
  }

  public void setNid(java.lang.Integer nid) {
    this.nid = nid;
  }

  public java.lang.Integer getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(java.lang.Integer timestamp) {
    this.timestamp = timestamp;
  }
}
