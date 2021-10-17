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

/** embeddable class Id for LafOlHistory. generated on 10/16/2021 from a schema. */
public class LafOlHistoryId implements Serializable {
    private static final long serialVersionUID = 163445265032910933L;

    @Column(name = "uid")
    private java.lang.Integer uid;

    @Column(name = "nid")
    private java.lang.Integer nid;

    /** Constructor: LafOlHistoryId. */
    public LafOlHistoryId() {}

    /**
     * Constructor: LafOlHistoryId.
     *
     * @param uid - uid.
     * @param nid - nid.
     */
    public LafOlHistoryId(java.lang.Integer uid, java.lang.Integer nid) {
        this.uid = uid;
        this.nid = nid;
    }

    public java.lang.Integer getUid() {
        return this.uid;
    }

    public java.lang.Integer getNid() {
        return this.nid;
    }

    public void setUid(java.lang.Integer uid) {
        this.uid = uid;
    }

    public void setNid(java.lang.Integer nid) {
        this.nid = nid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uid == null) ? 0 : uid.hashCode());
        result = prime * result + ((nid == null) ? 0 : nid.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlHistoryId other = (LafOlHistoryId) obj;

        if (uid == null) {
            if (other.uid != null) return false;
        } else if (!uid.equals(other.uid)) return false;

        if (nid == null) {
            if (other.nid != null) return false;
        } else if (!nid.equals(other.nid)) return false;

        return true;
    }
}
