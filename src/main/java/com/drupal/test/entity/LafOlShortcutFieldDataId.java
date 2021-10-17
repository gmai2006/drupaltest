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

/** embeddable class Id for LafOlShortcutFieldData. generated on 10/16/2021 from a schema. */
public class LafOlShortcutFieldDataId implements Serializable {
    private static final long serialVersionUID = 163445265089640162L;

    @Column(name = "langcode")
    private java.lang.String langcode;

    @Column(name = "id")
    private java.lang.Integer id;

    /** Constructor: LafOlShortcutFieldDataId. */
    public LafOlShortcutFieldDataId() {}

    /**
     * Constructor: LafOlShortcutFieldDataId.
     *
     * @param langcode - langcode.
     * @param id - id.
     */
    public LafOlShortcutFieldDataId(java.lang.String langcode, java.lang.Integer id) {
        this.langcode = langcode;
        this.id = id;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlShortcutFieldDataId other = (LafOlShortcutFieldDataId) obj;

        if (langcode == null) {
            if (other.langcode != null) return false;
        } else if (!langcode.equals(other.langcode)) return false;

        if (id == null) {
            if (other.id != null) return false;
        } else if (!id.equals(other.id)) return false;

        return true;
    }
}
