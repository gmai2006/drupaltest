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
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(LafOlSearchIndexId.class)
@Table(name = "lafol_search_index")
public class LafOlSearchIndex implements Serializable {
  private static final long serialVersionUID = 166875433050641997L;

  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "langcode")
  private java.lang.String langcode;
  /** Description: type. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "type")
  private java.lang.String type;
  /** Description: word. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "word")
  private java.lang.String word;
  /** Description: sid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "sid")
  private java.lang.Integer sid;

  /** Description: score. */
  @Basic
  @Column(name = "score")
  private java.lang.Float score;

  public LafOlSearchIndex() {}

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public java.lang.String getWord() {
    return this.word;
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

  public void setWord(java.lang.String word) {
    this.word = word;
  }

  public void setSid(java.lang.Integer sid) {
    this.sid = sid;
  }

  public java.lang.Float getScore() {
    return this.score;
  }

  public void setScore(java.lang.Float score) {
    this.score = score;
  }
}
