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

/** embeddable class Id for LafOlComment. generated on 10/16/2021 from a schema. */
public class LafOlCommentId implements Serializable {
    private static final long serialVersionUID = 163445265020374599L;

    @Column(name = "uuid")
    private java.lang.String uuid;

    @Column(name = "cid")
    private java.lang.Integer cid;

    /** Constructor: LafOlCommentId. */
    public LafOlCommentId() {}

    /**
     * Constructor: LafOlCommentId.
     *
     * @param uuid - uuid.
     * @param cid - cid.
     */
    public LafOlCommentId(java.lang.String uuid, java.lang.Integer cid) {
        this.uuid = uuid;
        this.cid = cid;
    }

    public java.lang.String getUuid() {
        return this.uuid;
    }

    public java.lang.Integer getCid() {
        return this.cid;
    }

    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    public void setCid(java.lang.Integer cid) {
        this.cid = cid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
        result = prime * result + ((cid == null) ? 0 : cid.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlCommentId other = (LafOlCommentId) obj;

        if (uuid == null) {
            if (other.uuid != null) return false;
        } else if (!uuid.equals(other.uuid)) return false;

        if (cid == null) {
            if (other.cid != null) return false;
        } else if (!cid.equals(other.cid)) return false;

        return true;
    }
}
