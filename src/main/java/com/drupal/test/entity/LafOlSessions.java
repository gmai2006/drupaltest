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
@Table(name = "lafol_sessions")
public class LafOlSessions implements Serializable {
  private static final long serialVersionUID = 166875433053560085L;

  /** Description: sid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "sid")
  private java.lang.String sid;

  /** Description: uid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "uid")
  private java.lang.Integer uid;
  /** Description: hostname. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "hostname", length = 128)
  private java.lang.String hostname;
  /** Description: timestamp. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "timestamp")
  private java.lang.Integer timestamp;
  /** Description: session. */
  @Basic
  @Column(name = "session", length = 0)
  private java.lang.String session;

  public LafOlSessions() {}

  public java.lang.String getSid() {
    return this.sid;
  }

  public void setSid(java.lang.String sid) {
    this.sid = sid;
  }

  public java.lang.Integer getUid() {
    return this.uid;
  }

  public java.lang.String getHostname() {
    return this.hostname;
  }

  public java.lang.Integer getTimestamp() {
    return this.timestamp;
  }

  public java.lang.String getSession() {
    return this.session;
  }

  public void setUid(java.lang.Integer uid) {
    this.uid = uid;
  }

  public void setHostname(java.lang.String hostname) {
    this.hostname = hostname;
  }

  public void setTimestamp(java.lang.Integer timestamp) {
    this.timestamp = timestamp;
  }

  public void setSession(java.lang.String session) {
    this.session = session;
  }
}
