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

/** embeddable class Id for LafOlNodeAccess. generated on 10/16/2021 from a schema. */
public class LafOlNodeAccessId implements Serializable {
    private static final long serialVersionUID = 163445265062139061L;

    @Column(name = "langcode")
    private java.lang.String langcode;

    @Column(name = "gid")
    private java.lang.Integer gid;

    @Column(name = "nid")
    private java.lang.Integer nid;

    @Column(name = "realm")
    private java.lang.String realm;

    /** Constructor: LafOlNodeAccessId. */
    public LafOlNodeAccessId() {}

    /**
     * Constructor: LafOlNodeAccessId.
     *
     * @param langcode - langcode.
     * @param gid - gid.
     * @param nid - nid.
     * @param realm - realm.
     */
    public LafOlNodeAccessId(
            java.lang.String langcode,
            java.lang.Integer gid,
            java.lang.Integer nid,
            java.lang.String realm) {
        this.langcode = langcode;
        this.gid = gid;
        this.nid = nid;
        this.realm = realm;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getGid() {
        return this.gid;
    }

    public java.lang.Integer getNid() {
        return this.nid;
    }

    public java.lang.String getRealm() {
        return this.realm;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setGid(java.lang.Integer gid) {
        this.gid = gid;
    }

    public void setNid(java.lang.Integer nid) {
        this.nid = nid;
    }

    public void setRealm(java.lang.String realm) {
        this.realm = realm;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
        result = prime * result + ((gid == null) ? 0 : gid.hashCode());
        result = prime * result + ((nid == null) ? 0 : nid.hashCode());
        result = prime * result + ((realm == null) ? 0 : realm.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlNodeAccessId other = (LafOlNodeAccessId) obj;

        if (langcode == null) {
            if (other.langcode != null) return false;
        } else if (!langcode.equals(other.langcode)) return false;

        if (gid == null) {
            if (other.gid != null) return false;
        } else if (!gid.equals(other.gid)) return false;

        if (nid == null) {
            if (other.nid != null) return false;
        } else if (!nid.equals(other.nid)) return false;

        if (realm == null) {
            if (other.realm != null) return false;
        } else if (!realm.equals(other.realm)) return false;

        return true;
    }
}
