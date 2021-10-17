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
@Table(name = "lafol_shortcut_set_users")
public class LafOlShortcutSetUsers implements Serializable {
    private static final long serialVersionUID = 163445265091342573L;

    /** Description: uid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "uid")
    private java.lang.Integer uid;

    /** Description: set_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "set_name", length = 32)
    private java.lang.String setName;

    public LafOlShortcutSetUsers() {}

    public java.lang.Integer getUid() {
        return this.uid;
    }

    public void setUid(java.lang.Integer uid) {
        this.uid = uid;
    }

    public java.lang.String getSetName() {
        return this.setName;
    }

    public void setSetName(java.lang.String setName) {
        this.setName = setName;
    }
}
