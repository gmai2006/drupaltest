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

/** embeddable class Id for LafOlMenuTree. generated on 11/17/2022 from a schema. */
public class LafOlMenuTreeId implements Serializable {
  private static final long serialVersionUID = 166875433031223952L;

  @Column(name = "mlid")
  private java.lang.Integer mlid;

  @Column(name = "id")
  private java.lang.String id;

  /** Constructor: LafOlMenuTreeId. */
  public LafOlMenuTreeId() {}

  /**
   * Constructor: LafOlMenuTreeId.
   *
   * @param mlid - mlid.
   * @param id - id.
   */
  public LafOlMenuTreeId(java.lang.Integer mlid, java.lang.String id) {
    this.mlid = mlid;
    this.id = id;
  }

  public java.lang.Integer getMlid() {
    return this.mlid;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public void setMlid(java.lang.Integer mlid) {
    this.mlid = mlid;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((mlid == null) ? 0 : mlid.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LafOlMenuTreeId other = (LafOlMenuTreeId) obj;

    if (mlid == null) {
      if (other.mlid != null) return false;
    } else if (!mlid.equals(other.mlid)) return false;

    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;

    return true;
  }
}
