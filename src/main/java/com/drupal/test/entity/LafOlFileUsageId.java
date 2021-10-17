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

/** embeddable class Id for LafOlFileUsage. generated on 10/16/2021 from a schema. */
public class LafOlFileUsageId implements Serializable {
    private static final long serialVersionUID = 163445265031282596L;

    @Column(name = "fid")
    private java.lang.Integer fid;

    @Column(name = "module")
    private java.lang.String module;

    @Column(name = "id")
    private java.lang.String id;

    @Column(name = "type")
    private java.lang.String type;

    /** Constructor: LafOlFileUsageId. */
    public LafOlFileUsageId() {}

    /**
     * Constructor: LafOlFileUsageId.
     *
     * @param fid - fid.
     * @param module - module.
     * @param id - id.
     * @param type - type.
     */
    public LafOlFileUsageId(
            java.lang.Integer fid,
            java.lang.String module,
            java.lang.String id,
            java.lang.String type) {
        this.fid = fid;
        this.module = module;
        this.id = id;
        this.type = type;
    }

    public java.lang.Integer getFid() {
        return this.fid;
    }

    public java.lang.String getModule() {
        return this.module;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void setFid(java.lang.Integer fid) {
        this.fid = fid;
    }

    public void setModule(java.lang.String module) {
        this.module = module;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fid == null) ? 0 : fid.hashCode());
        result = prime * result + ((module == null) ? 0 : module.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlFileUsageId other = (LafOlFileUsageId) obj;

        if (fid == null) {
            if (other.fid != null) return false;
        } else if (!fid.equals(other.fid)) return false;

        if (module == null) {
            if (other.module != null) return false;
        } else if (!module.equals(other.module)) return false;

        if (id == null) {
            if (other.id != null) return false;
        } else if (!id.equals(other.id)) return false;

        if (type == null) {
            if (other.type != null) return false;
        } else if (!type.equals(other.type)) return false;

        return true;
    }
}
