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
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(LafOlTaxonomyIndexId.class)
@Table(name = "lafol_taxonomy_index")
public class LafOlTaxonomyIndex implements Serializable {
    private static final long serialVersionUID = 163445265092563221L;

    /** Description: nid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "nid")
    private java.lang.Integer nid;
    /** Description: tid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "tid")
    private java.lang.Integer tid;

    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Integer status;
    /** Description: sticky. */
    @Basic
    @Column(name = "sticky")
    private java.lang.Integer sticky;
    /** Description: created. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "created")
    private java.lang.Integer created;

    public LafOlTaxonomyIndex() {}

    public java.lang.Integer getNid() {
        return this.nid;
    }

    public java.lang.Integer getTid() {
        return this.tid;
    }

    public void setNid(java.lang.Integer nid) {
        this.nid = nid;
    }

    public void setTid(java.lang.Integer tid) {
        this.tid = tid;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public java.lang.Integer getSticky() {
        return this.sticky;
    }

    public java.lang.Integer getCreated() {
        return this.created;
    }

    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    public void setSticky(java.lang.Integer sticky) {
        this.sticky = sticky;
    }

    public void setCreated(java.lang.Integer created) {
        this.created = created;
    }
}
