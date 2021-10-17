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
@Table(name = "lafol_router")
public class LafOlRouter implements Serializable {
    private static final long serialVersionUID = 163445265078552655L;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "name")
    private java.lang.String name;

    /** Description: path. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "path", length = 255)
    private java.lang.String path;
    /** Description: pattern_outline. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "pattern_outline", length = 255)
    private java.lang.String patternOutline;
    /** Description: fit. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "fit")
    private java.lang.Integer fit;
    /** Description: route. */
    @Basic
    @Column(name = "route", length = 0)
    private java.lang.String route;
    /** Description: number_parts. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "number_parts")
    private java.lang.Integer numberParts;

    public LafOlRouter() {}

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public java.lang.String getPatternOutline() {
        return this.patternOutline;
    }

    public java.lang.Integer getFit() {
        return this.fit;
    }

    public java.lang.String getRoute() {
        return this.route;
    }

    public java.lang.Integer getNumberParts() {
        return this.numberParts;
    }

    public void setPath(java.lang.String path) {
        this.path = path;
    }

    public void setPatternOutline(java.lang.String patternOutline) {
        this.patternOutline = patternOutline;
    }

    public void setFit(java.lang.Integer fit) {
        this.fit = fit;
    }

    public void setRoute(java.lang.String route) {
        this.route = route;
    }

    public void setNumberParts(java.lang.Integer numberParts) {
        this.numberParts = numberParts;
    }
}
