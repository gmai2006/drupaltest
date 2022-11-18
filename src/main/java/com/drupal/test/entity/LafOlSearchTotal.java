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
@Table(name = "lafol_search_total")
public class LafOlSearchTotal implements Serializable {
  private static final long serialVersionUID = 166875433051258792L;

  /** Description: word. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "word")
  private java.lang.String word;

  /** Description: count. */
  @Basic
  @Column(name = "count")
  private java.lang.Float count;

  public LafOlSearchTotal() {}

  public java.lang.String getWord() {
    return this.word;
  }

  public void setWord(java.lang.String word) {
    this.word = word;
  }

  public java.lang.Float getCount() {
    return this.count;
  }

  public void setCount(java.lang.Float count) {
    this.count = count;
  }
}
