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
@Table(name = "lafol_watchdog")
public class LafOlWatchdog implements Serializable {
  private static final long serialVersionUID = 16687543307361749L;

  /** Description: wid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "wid")
  private java.lang.Integer wid;

  /** Description: uid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "uid")
  private java.lang.Integer uid;
  /** Description: type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type", length = 64)
  private java.lang.String type;
  /** Description: message. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "message", length = 0)
  private java.lang.String message;
  /** Description: variables. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "variables", length = 0)
  private java.lang.String variables;
  /** Description: severity. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "severity")
  private java.lang.Integer severity;
  /** Description: link. */
  @Basic
  @Column(name = "link", length = 0)
  private java.lang.String link;
  /** Description: location. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "location", length = 0)
  private java.lang.String location;
  /** Description: referer. */
  @Basic
  @Column(name = "referer", length = 0)
  private java.lang.String referer;
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

  public LafOlWatchdog() {}

  public java.lang.Integer getWid() {
    return this.wid;
  }

  public void setWid(java.lang.Integer wid) {
    this.wid = wid;
  }

  public java.lang.Integer getUid() {
    return this.uid;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public java.lang.String getVariables() {
    return this.variables;
  }

  public java.lang.Integer getSeverity() {
    return this.severity;
  }

  public java.lang.String getLink() {
    return this.link;
  }

  public java.lang.String getLocation() {
    return this.location;
  }

  public java.lang.String getReferer() {
    return this.referer;
  }

  public java.lang.String getHostname() {
    return this.hostname;
  }

  public java.lang.Integer getTimestamp() {
    return this.timestamp;
  }

  public void setUid(java.lang.Integer uid) {
    this.uid = uid;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setMessage(java.lang.String message) {
    this.message = message;
  }

  public void setVariables(java.lang.String variables) {
    this.variables = variables;
  }

  public void setSeverity(java.lang.Integer severity) {
    this.severity = severity;
  }

  public void setLink(java.lang.String link) {
    this.link = link;
  }

  public void setLocation(java.lang.String location) {
    this.location = location;
  }

  public void setReferer(java.lang.String referer) {
    this.referer = referer;
  }

  public void setHostname(java.lang.String hostname) {
    this.hostname = hostname;
  }

  public void setTimestamp(java.lang.Integer timestamp) {
    this.timestamp = timestamp;
  }
}
