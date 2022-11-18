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

/** embeddable class Id for LafOlMenuLinkContent. generated on 11/17/2022 from a schema. */
public class LafOlMenuLinkContentId implements Serializable {
  private static final long serialVersionUID = 166875433026616830L;

  @Column(name = "id")
  private java.lang.Integer id;

  @Column(name = "uuid")
  private java.lang.String uuid;

  @Column(name = "revision_id")
  private java.lang.Integer revisionId;

  /** Constructor: LafOlMenuLinkContentId. */
  public LafOlMenuLinkContentId() {}

  /**
   * Constructor: LafOlMenuLinkContentId.
   *
   * @param id - id.
   * @param uuid - uuid.
   * @param revisionId - revisionId.
   */
  public LafOlMenuLinkContentId(
      java.lang.Integer id, java.lang.String uuid, java.lang.Integer revisionId) {
    this.id = id;
    this.uuid = uuid;
    this.revisionId = revisionId;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public java.lang.String getUuid() {
    return this.uuid;
  }

  public java.lang.Integer getRevisionId() {
    return this.revisionId;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public void setUuid(java.lang.String uuid) {
    this.uuid = uuid;
  }

  public void setRevisionId(java.lang.Integer revisionId) {
    this.revisionId = revisionId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
    result = prime * result + ((revisionId == null) ? 0 : revisionId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    LafOlMenuLinkContentId other = (LafOlMenuLinkContentId) obj;

    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;

    if (uuid == null) {
      if (other.uuid != null) return false;
    } else if (!uuid.equals(other.uuid)) return false;

    if (revisionId == null) {
      if (other.revisionId != null) return false;
    } else if (!revisionId.equals(other.revisionId)) return false;

    return true;
  }
}
