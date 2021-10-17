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

/** embeddable class Id for LafOlFileManaged. generated on 10/16/2021 from a schema. */
public class LafOlFileManagedId implements Serializable {
    private static final long serialVersionUID = 163445265029451269L;

    @Column(name = "fid")
    private java.lang.Integer fid;

    @Column(name = "uuid")
    private java.lang.String uuid;

    /** Constructor: LafOlFileManagedId. */
    public LafOlFileManagedId() {}

    /**
     * Constructor: LafOlFileManagedId.
     *
     * @param fid - fid.
     * @param uuid - uuid.
     */
    public LafOlFileManagedId(java.lang.Integer fid, java.lang.String uuid) {
        this.fid = fid;
        this.uuid = uuid;
    }

    public java.lang.Integer getFid() {
        return this.fid;
    }

    public java.lang.String getUuid() {
        return this.uuid;
    }

    public void setFid(java.lang.Integer fid) {
        this.fid = fid;
    }

    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fid == null) ? 0 : fid.hashCode());
        result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlFileManagedId other = (LafOlFileManagedId) obj;

        if (fid == null) {
            if (other.fid != null) return false;
        } else if (!fid.equals(other.fid)) return false;

        if (uuid == null) {
            if (other.uuid != null) return false;
        } else if (!uuid.equals(other.uuid)) return false;

        return true;
    }
}
