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

/** embeddable class Id for LafOlNodeFieldData. generated on 11/17/2022 from a schema. */
public class LafOlNodeFieldDataId implements Serializable {
  private static final long serialVersionUID = 166875433039720015L;

  @Column(name = "langcode")
  private java.lang.String langcode;

  @Column(name = "nid")
  private java.lang.Integer nid;

  /** Constructor: LafOlNodeFieldDataId. */
  public LafOlNodeFieldDataId() {}

  /**
   * Constructor: LafOlNodeFieldDataId.
   *
   * @param langcode - langcode.
   * @param nid - nid.
   */
  public LafOlNodeFieldDataId(java.lang.String langcode, java.lang.Integer nid) {
    this.langcode = langcode;
    this.nid = nid;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.Integer getNid() {
    return this.nid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setNid(java.lang.Integer nid) {
    this.nid = nid;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
    result = prime * result + ((nid == null) ? 0 : nid.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LafOlNodeFieldDataId other = (LafOlNodeFieldDataId) obj;

    if (langcode == null) {
      if (other.langcode != null) return false;
    } else if (!langcode.equals(other.langcode)) return false;

    if (nid == null) {
      if (other.nid != null) return false;
    } else if (!nid.equals(other.nid)) return false;

    return true;
  }
}
