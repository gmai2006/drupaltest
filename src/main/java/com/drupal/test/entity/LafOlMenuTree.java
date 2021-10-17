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
@IdClass(LafOlMenuTreeId.class)
@Table(name = "lafol_menu_tree")
public class LafOlMenuTree implements Serializable {
    private static final long serialVersionUID = 163445265049191484L;

    /** Description: mlid. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "mlid")
    private java.lang.Integer mlid;
    /** Description: id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "id")
    private java.lang.String id;

    /** Description: menu_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "menu_name", length = 32)
    private java.lang.String menuName;
    /** Description: parent. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "parent", length = 255)
    private java.lang.String parent;
    /** Description: route_name. */
    @Basic
    @Column(name = "route_name", length = 255)
    private java.lang.String routeName;
    /** Description: route_param_key. */
    @Basic
    @Column(name = "route_param_key", length = 255)
    private java.lang.String routeParamKey;
    /** Description: route_parameters. */
    @Basic
    @Column(name = "route_parameters", length = 0)
    private java.lang.String routeParameters;
    /** Description: url. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "url", length = 255)
    private java.lang.String url;
    /** Description: title. */
    @Basic
    @Column(name = "title", length = 0)
    private java.lang.String title;
    /** Description: description. */
    @Basic
    @Column(name = "description", length = 0)
    private java.lang.String description;
    /** Description: class1. */
    @Basic
    @Column(name = "class1", length = 0)
    private java.lang.String class1;
    /** Description: options. */
    @Basic
    @Column(name = "options", length = 0)
    private java.lang.String options;
    /** Description: provider. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "provider", length = 50)
    private java.lang.String provider;
    /** Description: enabled. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "enabled")
    private java.lang.Integer enabled;
    /** Description: discovered. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "discovered")
    private java.lang.Integer discovered;
    /** Description: expanded. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "expanded")
    private java.lang.Integer expanded;
    /** Description: weight. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "weight")
    private java.lang.Integer weight;
    /** Description: metadata. */
    @Basic
    @Column(name = "metadata", length = 0)
    private java.lang.String metadata;
    /** Description: has_children. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "has_children")
    private java.lang.Integer hasChildren;
    /** Description: depth. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "depth")
    private java.lang.Integer depth;
    /** Description: p1. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p1")
    private java.lang.Integer p1;
    /** Description: p2. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p2")
    private java.lang.Integer p2;
    /** Description: p3. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p3")
    private java.lang.Integer p3;
    /** Description: p4. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p4")
    private java.lang.Integer p4;
    /** Description: p5. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p5")
    private java.lang.Integer p5;
    /** Description: p6. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p6")
    private java.lang.Integer p6;
    /** Description: p7. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p7")
    private java.lang.Integer p7;
    /** Description: p8. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p8")
    private java.lang.Integer p8;
    /** Description: p9. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "p9")
    private java.lang.Integer p9;
    /** Description: form_class. */
    @Basic
    @Column(name = "form_class", length = 255)
    private java.lang.String formClass;

    public LafOlMenuTree() {}

    public java.lang.Integer getMlid() {
        return this.mlid;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setMlid(java.lang.Integer mlid) {
        this.mlid = mlid;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public java.lang.String getMenuName() {
        return this.menuName;
    }

    public java.lang.String getParent() {
        return this.parent;
    }

    public java.lang.String getRouteName() {
        return this.routeName;
    }

    public java.lang.String getRouteParamKey() {
        return this.routeParamKey;
    }

    public java.lang.String getRouteParameters() {
        return this.routeParameters;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getClass1() {
        return this.class1;
    }

    public java.lang.String getOptions() {
        return this.options;
    }

    public java.lang.String getProvider() {
        return this.provider;
    }

    public java.lang.Integer getEnabled() {
        return this.enabled;
    }

    public java.lang.Integer getDiscovered() {
        return this.discovered;
    }

    public java.lang.Integer getExpanded() {
        return this.expanded;
    }

    public java.lang.Integer getWeight() {
        return this.weight;
    }

    public java.lang.String getMetadata() {
        return this.metadata;
    }

    public java.lang.Integer getHasChildren() {
        return this.hasChildren;
    }

    public java.lang.Integer getDepth() {
        return this.depth;
    }

    public java.lang.Integer getP1() {
        return this.p1;
    }

    public java.lang.Integer getP2() {
        return this.p2;
    }

    public java.lang.Integer getP3() {
        return this.p3;
    }

    public java.lang.Integer getP4() {
        return this.p4;
    }

    public java.lang.Integer getP5() {
        return this.p5;
    }

    public java.lang.Integer getP6() {
        return this.p6;
    }

    public java.lang.Integer getP7() {
        return this.p7;
    }

    public java.lang.Integer getP8() {
        return this.p8;
    }

    public java.lang.Integer getP9() {
        return this.p9;
    }

    public java.lang.String getFormClass() {
        return this.formClass;
    }

    public void setMenuName(java.lang.String menuName) {
        this.menuName = menuName;
    }

    public void setParent(java.lang.String parent) {
        this.parent = parent;
    }

    public void setRouteName(java.lang.String routeName) {
        this.routeName = routeName;
    }

    public void setRouteParamKey(java.lang.String routeParamKey) {
        this.routeParamKey = routeParamKey;
    }

    public void setRouteParameters(java.lang.String routeParameters) {
        this.routeParameters = routeParameters;
    }

    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setClass1(java.lang.String class1) {
        this.class1 = class1;
    }

    public void setOptions(java.lang.String options) {
        this.options = options;
    }

    public void setProvider(java.lang.String provider) {
        this.provider = provider;
    }

    public void setEnabled(java.lang.Integer enabled) {
        this.enabled = enabled;
    }

    public void setDiscovered(java.lang.Integer discovered) {
        this.discovered = discovered;
    }

    public void setExpanded(java.lang.Integer expanded) {
        this.expanded = expanded;
    }

    public void setWeight(java.lang.Integer weight) {
        this.weight = weight;
    }

    public void setMetadata(java.lang.String metadata) {
        this.metadata = metadata;
    }

    public void setHasChildren(java.lang.Integer hasChildren) {
        this.hasChildren = hasChildren;
    }

    public void setDepth(java.lang.Integer depth) {
        this.depth = depth;
    }

    public void setP1(java.lang.Integer p1) {
        this.p1 = p1;
    }

    public void setP2(java.lang.Integer p2) {
        this.p2 = p2;
    }

    public void setP3(java.lang.Integer p3) {
        this.p3 = p3;
    }

    public void setP4(java.lang.Integer p4) {
        this.p4 = p4;
    }

    public void setP5(java.lang.Integer p5) {
        this.p5 = p5;
    }

    public void setP6(java.lang.Integer p6) {
        this.p6 = p6;
    }

    public void setP7(java.lang.Integer p7) {
        this.p7 = p7;
    }

    public void setP8(java.lang.Integer p8) {
        this.p8 = p8;
    }

    public void setP9(java.lang.Integer p9) {
        this.p9 = p9;
    }

    public void setFormClass(java.lang.String formClass) {
        this.formClass = formClass;
    }
}
