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

/** embeddable class Id for LafOlTaxonomyIndex. generated on 10/16/2021 from a schema. */
public class LafOlTaxonomyIndexId implements Serializable {
    private static final long serialVersionUID = 16344526509183782L;

    @Column(name = "nid")
    private java.lang.Integer nid;

    @Column(name = "tid")
    private java.lang.Integer tid;

    /** Constructor: LafOlTaxonomyIndexId. */
    public LafOlTaxonomyIndexId() {}

    /**
     * Constructor: LafOlTaxonomyIndexId.
     *
     * @param nid - nid.
     * @param tid - tid.
     */
    public LafOlTaxonomyIndexId(java.lang.Integer nid, java.lang.Integer tid) {
        this.nid = nid;
        this.tid = tid;
    }

    public java.lang.Integer getNid() {
        return this.nid;
    }

    public java.lang.Integer getTid() {
        return this.tid;
    }

    public void setNid(java.lang.Integer nid) {
        this.nid = nid;
    }

    public void setTid(java.lang.Integer tid) {
        this.tid = tid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nid == null) ? 0 : nid.hashCode());
        result = prime * result + ((tid == null) ? 0 : tid.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlTaxonomyIndexId other = (LafOlTaxonomyIndexId) obj;

        if (nid == null) {
            if (other.nid != null) return false;
        } else if (!nid.equals(other.nid)) return false;

        if (tid == null) {
            if (other.tid != null) return false;
        } else if (!tid.equals(other.tid)) return false;

        return true;
    }
}
