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

/** embeddable class Id for LafOlUsersFieldData. generated on 10/16/2021 from a schema. */
public class LafOlUsersFieldDataId implements Serializable {
    private static final long serialVersionUID = 163445265112261236L;

    @Column(name = "uid")
    private java.lang.Integer uid;

    @Column(name = "langcode")
    private java.lang.String langcode;

    @Column(name = "name")
    private java.lang.String name;

    /** Constructor: LafOlUsersFieldDataId. */
    public LafOlUsersFieldDataId() {}

    /**
     * Constructor: LafOlUsersFieldDataId.
     *
     * @param uid - uid.
     * @param langcode - langcode.
     * @param name - name.
     */
    public LafOlUsersFieldDataId(
            java.lang.Integer uid, java.lang.String langcode, java.lang.String name) {
        this.uid = uid;
        this.langcode = langcode;
        this.name = name;
    }

    public java.lang.Integer getUid() {
        return this.uid;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setUid(java.lang.Integer uid) {
        this.uid = uid;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uid == null) ? 0 : uid.hashCode());
        result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlUsersFieldDataId other = (LafOlUsersFieldDataId) obj;

        if (uid == null) {
            if (other.uid != null) return false;
        } else if (!uid.equals(other.uid)) return false;

        if (langcode == null) {
            if (other.langcode != null) return false;
        } else if (!langcode.equals(other.langcode)) return false;

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        return true;
    }
}
