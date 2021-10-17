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

/** embeddable class Id for LafOlNodeRevisionBody. generated on 10/16/2021 from a schema. */
public class LafOlNodeRevisionBodyId implements Serializable {
    private static final long serialVersionUID = 163445265069248697L;

    @Column(name = "langcode")
    private java.lang.String langcode;

    @Column(name = "deleted")
    private java.lang.Integer deleted;

    @Column(name = "delta")
    private java.lang.Integer delta;

    @Column(name = "entity_id")
    private java.lang.Integer entityId;

    @Column(name = "revision_id")
    private java.lang.Integer revisionId;

    /** Constructor: LafOlNodeRevisionBodyId. */
    public LafOlNodeRevisionBodyId() {}

    /**
     * Constructor: LafOlNodeRevisionBodyId.
     *
     * @param langcode - langcode.
     * @param deleted - deleted.
     * @param delta - delta.
     * @param entityId - entityId.
     * @param revisionId - revisionId.
     */
    public LafOlNodeRevisionBodyId(
            java.lang.String langcode,
            java.lang.Integer deleted,
            java.lang.Integer delta,
            java.lang.Integer entityId,
            java.lang.Integer revisionId) {
        this.langcode = langcode;
        this.deleted = deleted;
        this.delta = delta;
        this.entityId = entityId;
        this.revisionId = revisionId;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getDeleted() {
        return this.deleted;
    }

    public java.lang.Integer getDelta() {
        return this.delta;
    }

    public java.lang.Integer getEntityId() {
        return this.entityId;
    }

    public java.lang.Integer getRevisionId() {
        return this.revisionId;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setDeleted(java.lang.Integer deleted) {
        this.deleted = deleted;
    }

    public void setDelta(java.lang.Integer delta) {
        this.delta = delta;
    }

    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }

    public void setRevisionId(java.lang.Integer revisionId) {
        this.revisionId = revisionId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
        result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
        result = prime * result + ((delta == null) ? 0 : delta.hashCode());
        result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
        result = prime * result + ((revisionId == null) ? 0 : revisionId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlNodeRevisionBodyId other = (LafOlNodeRevisionBodyId) obj;

        if (langcode == null) {
            if (other.langcode != null) return false;
        } else if (!langcode.equals(other.langcode)) return false;

        if (deleted == null) {
            if (other.deleted != null) return false;
        } else if (!deleted.equals(other.deleted)) return false;

        if (delta == null) {
            if (other.delta != null) return false;
        } else if (!delta.equals(other.delta)) return false;

        if (entityId == null) {
            if (other.entityId != null) return false;
        } else if (!entityId.equals(other.entityId)) return false;

        if (revisionId == null) {
            if (other.revisionId != null) return false;
        } else if (!revisionId.equals(other.revisionId)) return false;

        return true;
    }
}
