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

/**
 * embeddable class Id for LafOlTaxonomyTermFieldRevision. generated on 10/16/2021 from a schema.
 */
public class LafOlTaxonomyTermFieldRevisionId implements Serializable {
    private static final long serialVersionUID = 163445265099540829L;

    @Column(name = "langcode")
    private java.lang.String langcode;

    @Column(name = "revision_id")
    private java.lang.Integer revisionId;

    /** Constructor: LafOlTaxonomyTermFieldRevisionId. */
    public LafOlTaxonomyTermFieldRevisionId() {}

    /**
     * Constructor: LafOlTaxonomyTermFieldRevisionId.
     *
     * @param langcode - langcode.
     * @param revisionId - revisionId.
     */
    public LafOlTaxonomyTermFieldRevisionId(
            java.lang.String langcode, java.lang.Integer revisionId) {
        this.langcode = langcode;
        this.revisionId = revisionId;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getRevisionId() {
        return this.revisionId;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setRevisionId(java.lang.Integer revisionId) {
        this.revisionId = revisionId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
        result = prime * result + ((revisionId == null) ? 0 : revisionId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlTaxonomyTermFieldRevisionId other = (LafOlTaxonomyTermFieldRevisionId) obj;

        if (langcode == null) {
            if (other.langcode != null) return false;
        } else if (!langcode.equals(other.langcode)) return false;

        if (revisionId == null) {
            if (other.revisionId != null) return false;
        } else if (!revisionId.equals(other.revisionId)) return false;

        return true;
    }
}
