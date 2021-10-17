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

/** embeddable class Id for LafOlTaxonomyTermData. generated on 10/16/2021 from a schema. */
public class LafOlTaxonomyTermDataId implements Serializable {
    private static final long serialVersionUID = 163445265095166520L;

    @Column(name = "uuid")
    private java.lang.String uuid;

    @Column(name = "tid")
    private java.lang.Integer tid;

    @Column(name = "revision_id")
    private java.lang.Integer revisionId;

    /** Constructor: LafOlTaxonomyTermDataId. */
    public LafOlTaxonomyTermDataId() {}

    /**
     * Constructor: LafOlTaxonomyTermDataId.
     *
     * @param uuid - uuid.
     * @param tid - tid.
     * @param revisionId - revisionId.
     */
    public LafOlTaxonomyTermDataId(
            java.lang.String uuid, java.lang.Integer tid, java.lang.Integer revisionId) {
        this.uuid = uuid;
        this.tid = tid;
        this.revisionId = revisionId;
    }

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
        result = prime * result + ((tid == null) ? 0 : tid.hashCode());
        result = prime * result + ((revisionId == null) ? 0 : revisionId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlTaxonomyTermDataId other = (LafOlTaxonomyTermDataId) obj;

        if (uuid == null) {
            if (other.uuid != null) return false;
        } else if (!uuid.equals(other.uuid)) return false;

        if (tid == null) {
            if (other.tid != null) return false;
        } else if (!tid.equals(other.tid)) return false;

        if (revisionId == null) {
            if (other.revisionId != null) return false;
        } else if (!revisionId.equals(other.revisionId)) return false;

        return true;
    }
}
