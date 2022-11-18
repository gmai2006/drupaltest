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
@IdClass(LafOlTaxonomyTermDataId.class)
@Table(name = "lafol_taxonomy_term_data")
public class LafOlTaxonomyTermData implements Serializable {
  private static final long serialVersionUID = 1668754330603660L;

  /** Description: uuid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "uuid")
  private java.lang.String uuid;
  /** Description: tid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tid")
  private java.lang.Integer tid;
  /** Description: revision_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "revision_id")
  private java.lang.Integer revisionId;

  /** Description: vid. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "vid", length = 32)
  private java.lang.String vid;
  /** Description: langcode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "langcode", length = 12)
  private java.lang.String langcode;

  public LafOlTaxonomyTermData() {}

  public java.lang.String getUuid() {
    return this.uuid;
  }

  public java.lang.Integer getTid() {
    return this.tid;
  }

  public java.lang.Integer getRevisionId() {
    return this.revisionId;
  }

  public void setUuid(java.lang.String uuid) {
    this.uuid = uuid;
  }

  public void setTid(java.lang.Integer tid) {
    this.tid = tid;
  }

  public void setRevisionId(java.lang.Integer revisionId) {
    this.revisionId = revisionId;
  }

  public java.lang.String getVid() {
    return this.vid;
  }

  public java.lang.String getLangcode() {
    return this.langcode;
  }

  public void setVid(java.lang.String vid) {
    this.vid = vid;
  }

  public void setLangcode(java.lang.String langcode) {
    this.langcode = langcode;
  }
}
