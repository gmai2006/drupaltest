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

/** embeddable class Id for LafOlUsers. generated on 11/17/2022 from a schema. */
public class LafOlUsersId implements Serializable {
  private static final long serialVersionUID = 166875433069776244L;

  @Column(name = "uid")
  private java.lang.Integer uid;

  @Column(name = "uuid")
  private java.lang.String uuid;

  /** Constructor: LafOlUsersId. */
  public LafOlUsersId() {}

  /**
   * Constructor: LafOlUsersId.
   *
   * @param uid - uid.
   * @param uuid - uuid.
   */
  public LafOlUsersId(java.lang.Integer uid, java.lang.String uuid) {
    this.uid = uid;
    this.uuid = uuid;
  }

  public java.lang.Integer getUid() {
    return this.uid;
  }

  public java.lang.String getUuid() {
    return this.uuid;
  }

  public void setUid(java.lang.Integer uid) {
    this.uid = uid;
  }

  public void setUuid(java.lang.String uuid) {
    this.uuid = uuid;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((uid == null) ? 0 : uid.hashCode());
    result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LafOlUsersId other = (LafOlUsersId) obj;

    if (uid == null) {
      if (other.uid != null) return false;
    } else if (!uid.equals(other.uid)) return false;

    if (uuid == null) {
      if (other.uuid != null) return false;
    } else if (!uuid.equals(other.uuid)) return false;

    return true;
  }
}
