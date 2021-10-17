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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lafol_cachetags")
public class LafOlCachetags implements Serializable {
    private static final long serialVersionUID = 163445265019815602L;

    /** Description: tag. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "tag")
    private java.lang.String tag;

    /** Description: invalidations. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "invalidations")
    private java.lang.Integer invalidations;

    public LafOlCachetags() {}

    public java.lang.String getTag() {
        return this.tag;
    }

    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }

    public java.lang.Integer getInvalidations() {
        return this.invalidations;
    }

    public void setInvalidations(java.lang.Integer invalidations) {
        this.invalidations = invalidations;
    }
}
