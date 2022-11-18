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

/** embeddable class Id for LafOlSearchDataset. generated on 11/17/2022 from a schema. */
public class LafOlSearchDatasetId implements Serializable {
  private static final long serialVersionUID = 166875433048672668L;

  @Column(name = "langcode")
  private java.lang.String langcode;

  @Column(name = "type")
  private java.lang.String type;

  @Column(name = "sid")
  private java.lang.Integer sid;

  /** Constructor: LafOlSearchDatasetId. */
  public LafOlSearchDatasetId() {}

  /**
   * Constructor: LafOlSearchDatasetId.
   *
   * @param langcode - langcode.
   * @param type - type.
   * @param sid - sid.
   */
  public LafOlSearchDatasetId(
      java.lang.String langcode, java.lang.String type, java.lang.Integer sid) {
    this.langcode = langcode;
    this.type = type;
    this.sid = sid;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.Integer getSid() {
    return this.sid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void setSid(java.lang.Integer sid) {
    this.sid = sid;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    result = prime * result + ((sid == null) ? 0 : sid.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LafOlSearchDatasetId other = (LafOlSearchDatasetId) obj;

    if (langcode == null) {
      if (other.langcode != null) return false;
    } else if (!langcode.equals(other.langcode)) return false;

    if (type == null) {
      if (other.type != null) return false;
    } else if (!type.equals(other.type)) return false;

    if (sid == null) {
      if (other.sid != null) return false;
    } else if (!sid.equals(other.sid)) return false;

    return true;
  }
}
