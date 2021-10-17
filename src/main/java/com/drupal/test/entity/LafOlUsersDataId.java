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

/** embeddable class Id for LafOlUsersData. generated on 10/16/2021 from a schema. */
public class LafOlUsersDataId implements Serializable {
    private static final long serialVersionUID = 163445265110780069L;

    @Column(name = "uid")
    private java.lang.Integer uid;

    @Column(name = "module")
    private java.lang.String module;

    @Column(name = "name")
    private java.lang.String name;

    /** Constructor: LafOlUsersDataId. */
    public LafOlUsersDataId() {}

    /**
     * Constructor: LafOlUsersDataId.
     *
     * @param uid - uid.
     * @param module - module.
     * @param name - name.
     */
    public LafOlUsersDataId(java.lang.Integer uid, java.lang.String module, java.lang.String name) {
        this.uid = uid;
        this.module = module;
        this.name = name;
    }

    public java.lang.Integer getUid() {
        return this.uid;
    }

    public java.lang.String getModule() {
        return this.module;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setUid(java.lang.Integer uid) {
        this.uid = uid;
    }

    public void setModule(java.lang.String module) {
        this.module = module;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uid == null) ? 0 : uid.hashCode());
        result = prime * result + ((module == null) ? 0 : module.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlUsersDataId other = (LafOlUsersDataId) obj;

        if (uid == null) {
            if (other.uid != null) return false;
        } else if (!uid.equals(other.uid)) return false;

        if (module == null) {
            if (other.module != null) return false;
        } else if (!module.equals(other.module)) return false;

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        return true;
    }
}
