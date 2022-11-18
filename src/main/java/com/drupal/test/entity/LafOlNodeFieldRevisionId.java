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

/** embeddable class Id for LafOlNodeFieldRevision. generated on 11/17/2022 from a schema. */
public class LafOlNodeFieldRevisionId implements Serializable {
  private static final long serialVersionUID = 166875433041113947L;

  @Column(name = "vid")
  private java.lang.Integer vid;

  @Column(name = "langcode")
  private java.lang.String langcode;

  /** Constructor: LafOlNodeFieldRevisionId. */
  public LafOlNodeFieldRevisionId() {}

  /**
   * Constructor: LafOlNodeFieldRevisionId.
   *
   * @param vid - vid.
   * @param langcode - langcode.
   */
  public LafOlNodeFieldRevisionId(java.lang.Integer vid, java.lang.String langcode) {
    this.vid = vid;
    this.langcode = langcode;
  }

  public java.lang.Integer getVid() {
    return this.vid;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public void setVid(java.lang.Integer vid) {
    this.vid = vid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((vid == null) ? 0 : vid.hashCode());
    result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LafOlNodeFieldRevisionId other = (LafOlNodeFieldRevisionId) obj;

    if (vid == null) {
      if (other.vid != null) return false;
    } else if (!vid.equals(other.vid)) return false;

    if (langcode == null) {
      if (other.langcode != null) return false;
    } else if (!langcode.equals(other.langcode)) return false;

    return true;
  }
}
