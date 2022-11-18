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
@Table(name = "lafol_cache_dynamic_page_cache")
public class LafOlCacheDynamicPageCache implements Serializable {
  private static final long serialVersionUID = 166875433009972821L;

  /** Description: cid. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "cid")
  private java.lang.String cid;

  /** Description: data. */
  @Basic
  @Column(name = "data", length = 0)
  private java.lang.String data;
  /** Description: expire. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "expire")
  private java.lang.Integer expire;
  /** Description: created. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created")
  private java.math.BigDecimal created;
  /** Description: serialized. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "serialized")
  private java.lang.Integer serialized;
  /** Description: tags. */
  @Basic
  @Column(name = "tags", length = 0)
  private java.lang.String tags;
  /** Description: checksum. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "checksum", length = 255)
  private java.lang.String checksum;

  public LafOlCacheDynamicPageCache() {}

  public java.lang.String getCid() {
    return this.cid;
  }

  public void setCid(java.lang.String cid) {
    this.cid = cid;
  }

  public java.lang.String getData() {
    return this.data;
  }

  public java.lang.Integer getExpire() {
    return this.expire;
  }

  public java.math.BigDecimal getCreated() {
    return this.created;
  }

  public java.lang.Integer getSerialized() {
    return this.serialized;
  }

  public java.lang.String getTags() {
    return this.tags;
  }

  public java.lang.String getChecksum() {
    return this.checksum;
  }

  public void setData(java.lang.String data) {
    this.data = data;
  }

  public void setExpire(java.lang.Integer expire) {
    this.expire = expire;
  }

  public void setCreated(java.math.BigDecimal created) {
    this.created = created;
  }

  public void setSerialized(java.lang.Integer serialized) {
    this.serialized = serialized;
  }

  public void setTags(java.lang.String tags) {
    this.tags = tags;
  }

  public void setChecksum(java.lang.String checksum) {
    this.checksum = checksum;
  }
}
