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

/** embeddable class Id for LafOlTaxonomyTermFieldData. generated on 11/17/2022 from a schema. */
public class LafOlTaxonomyTermFieldDataId implements Serializable {
  private static final long serialVersionUID = 166875433061271985L;

  @Column(name = "langcode")
  private java.lang.String langcode;

  @Column(name = "tid")
  private java.lang.Integer tid;

  /** Constructor: LafOlTaxonomyTermFieldDataId. */
  public LafOlTaxonomyTermFieldDataId() {}

  /**
   * Constructor: LafOlTaxonomyTermFieldDataId.
   *
   * @param langcode - langcode.
   * @param tid - tid.
   */
  public LafOlTaxonomyTermFieldDataId(java.lang.String langcode, java.lang.Integer tid) {
    this.langcode = langcode;
    this.tid = tid;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.Integer getTid() {
    return this.tid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }

  public void setTid(java.lang.Integer tid) {
    this.tid = tid;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
    result = prime * result + ((tid == null) ? 0 : tid.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LafOlTaxonomyTermFieldDataId other = (LafOlTaxonomyTermFieldDataId) obj;

    if (langcode == null) {
      if (other.langcode != null) return false;
    } else if (!langcode.equals(other.langcode)) return false;

    if (tid == null) {
      if (other.tid != null) return false;
    } else if (!tid.equals(other.tid)) return false;

    return true;
  }
}
