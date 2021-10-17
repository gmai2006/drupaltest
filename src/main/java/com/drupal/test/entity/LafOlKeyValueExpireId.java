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

/** embeddable class Id for LafOlKeyValueExpire. generated on 10/16/2021 from a schema. */
public class LafOlKeyValueExpireId implements Serializable {
    private static final long serialVersionUID = 163445265035796699L;

    @Column(name = "name")
    private java.lang.String name;

    @Column(name = "collection")
    private java.lang.String collection;

    /** Constructor: LafOlKeyValueExpireId. */
    public LafOlKeyValueExpireId() {}

    /**
     * Constructor: LafOlKeyValueExpireId.
     *
     * @param name - name.
     * @param collection - collection.
     */
    public LafOlKeyValueExpireId(java.lang.String name, java.lang.String collection) {
        this.name = name;
        this.collection = collection;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getCollection() {
        return this.collection;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setCollection(java.lang.String collection) {
        this.collection = collection;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((collection == null) ? 0 : collection.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlKeyValueExpireId other = (LafOlKeyValueExpireId) obj;

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        if (collection == null) {
            if (other.collection != null) return false;
        } else if (!collection.equals(other.collection)) return false;

        return true;
    }
}
