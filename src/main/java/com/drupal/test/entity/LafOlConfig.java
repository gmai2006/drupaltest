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
@IdClass(LafOlConfigId.class)
@Table(name = "lafol_config")
public class LafOlConfig implements Serializable {
  private static final long serialVersionUID = 166875433018266241L;

  /** Description: name. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "name")
  private java.lang.String name;
  /** Description: collection. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "collection")
  private java.lang.String collection;

  /** Description: data. */
  @Basic
  @Column(name = "data", length = 0)
  private java.lang.String data;

  public LafOlConfig() {}

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getCollection() {
    return this.collection;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setCollection(java.lang.String collection) {
    this.collection = collection;
  }

  public java.lang.String getData() {
    return this.data;
  }

  public void setData(java.lang.String data) {
    this.data = data;
  }
}
