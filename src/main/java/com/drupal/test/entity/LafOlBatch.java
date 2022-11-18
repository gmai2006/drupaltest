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
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "lafol_batch")
public class LafOlBatch implements Serializable {
  private static final long serialVersionUID = 166875432998322386L;

  /** Description: bid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "bid")
  private java.lang.Integer bid;

  /** Description: token. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "token", length = 64)
  private java.lang.String token;
  /** Description: timestamp. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "timestamp")
  private java.lang.Integer timestamp;
  /** Description: batch. */
  @Basic
  @Column(name = "batch", length = 0)
  private java.lang.String batch;

  public LafOlBatch() {}

  public java.lang.Integer getBid() {
    return this.bid;
  }

  public void setBid(java.lang.Integer bid) {
    this.bid = bid;
  }

  public java.lang.String getToken() {
    return this.token;
  }

  public java.lang.Integer getTimestamp() {
    return this.timestamp;
  }

  public java.lang.String getBatch() {
    return this.batch;
  }

  public void setToken(java.lang.String token) {
    this.token = token;
  }

  public void setTimestamp(java.lang.Integer timestamp) {
    this.timestamp = timestamp;
  }

  public void setBatch(java.lang.String batch) {
    this.batch = batch;
  }
}
