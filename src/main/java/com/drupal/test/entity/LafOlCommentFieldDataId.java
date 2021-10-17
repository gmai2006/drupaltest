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

/** embeddable class Id for LafOlCommentFieldData. generated on 10/16/2021 from a schema. */
public class LafOlCommentFieldDataId implements Serializable {
    private static final long serialVersionUID = 163445265025694508L;

    @Column(name = "langcode")
    private java.lang.String langcode;

    @Column(name = "cid")
    private java.lang.Integer cid;

    /** Constructor: LafOlCommentFieldDataId. */
    public LafOlCommentFieldDataId() {}

    /**
     * Constructor: LafOlCommentFieldDataId.
     *
     * @param langcode - langcode.
     * @param cid - cid.
     */
    public LafOlCommentFieldDataId(java.lang.String langcode, java.lang.Integer cid) {
        this.langcode = langcode;
        this.cid = cid;
    }

    public java.lang.String getLangcode() {
        return this.langcode;
    }

    public java.lang.Integer getCid() {
        return this.cid;
    }

    public void setLangcode(java.lang.String langcode) {
        this.langcode = langcode;
    }

    public void setCid(java.lang.Integer cid) {
        this.cid = cid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((langcode == null) ? 0 : langcode.hashCode());
        result = prime * result + ((cid == null) ? 0 : cid.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        LafOlCommentFieldDataId other = (LafOlCommentFieldDataId) obj;

        if (langcode == null) {
            if (other.langcode != null) return false;
        } else if (!langcode.equals(other.langcode)) return false;

        if (cid == null) {
            if (other.cid != null) return false;
        } else if (!cid.equals(other.cid)) return false;

        return true;
    }
}
