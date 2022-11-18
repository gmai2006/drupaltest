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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for LafOlNode. generated on 11/17/2022 from a schema. */
public class LafOlNodeId implements Serializable {
  private static final long serialVersionUID = 16687543303286370L;

  @Column(name = "vid")
  private java.lang.Integer vid;

  @Column(name = "nid")
  private java.lang.Integer nid;

  @Column(name = "uuid")
  private java.lang.String uuid;

  /** Constructor: LafOlNodeId. */
  public LafOlNodeId() {}

  /**
   * Constructor: LafOlNodeId.
   *
   * @param vid - vid.
   * @param nid - nid.
   * @param uuid - uuid.
   */
  public LafOlNodeId(java.lang.Integer vid, java.lang.Integer nid, java.lang.String uuid) {
    this.vid = vid;
    this.nid = nid;
    this.uuid = uuid;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((vid == null) ? 0 : vid.hashCode());
    result = prime * result + ((nid == null) ? 0 : nid.hashCode());
    result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LafOlNodeId other = (LafOlNodeId) obj;

    if (vid == null) {
      if (other.vid != null) return false;
    } else if (!vid.equals(other.vid)) return false;

    if (nid == null) {
      if (other.nid != null) return false;
    } else if (!nid.equals(other.nid)) return false;

    if (uuid == null) {
      if (other.uuid != null) return false;
    } else if (!uuid.equals(other.uuid)) return false;

    return true;
  }
}
