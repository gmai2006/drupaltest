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

/** embeddable class Id for LafOlLocalesTarget. generated on 10/16/2021 from a schema. */
public class LafOlLocalesTargetId implements Serializable {
    private static final long serialVersionUID = 1634452650403458L;

    @Column(name = "lid")
    private java.lang.Integer lid;

    @Column(name = "language")
    private java.lang.String language;

    /** Constructor: LafOlLocalesTargetId. */
    public LafOlLocalesTargetId() {}

    /**
     * Constructor: LafOlLocalesTargetId.
     *
     * @param lid - lid.
     * @param language - language.
     */
    public LafOlLocalesTargetId(java.lang.Integer lid, java.lang.String language) {
        this.lid = lid;
        this.language = language;
    }

    public java.lang.Integer getLid() {
        return this.lid;
    }

    public java.lang.String getLanguage() {
        return this.language;
    }

    public void setLid(java.lang.Integer lid) {
        this.lid = lid;
    }

    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((lid == null) ? 0 : lid.hashCode());
        result = prime * result + ((language == null) ? 0 : language.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlLocalesTargetId other = (LafOlLocalesTargetId) obj;

        if (lid == null) {
            if (other.lid != null) return false;
        } else if (!lid.equals(other.lid)) return false;

        if (language == null) {
            if (other.language != null) return false;
        } else if (!language.equals(other.language)) return false;

        return true;
    }
}
