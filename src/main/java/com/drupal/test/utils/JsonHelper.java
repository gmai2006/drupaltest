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
package com.drupal.test.utils;

import com.drupal.test.entity.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Objects;

public class JsonHelper {
    static final Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlBatch.
     */
    public static LafOlBatch fromJson2LafOlBatch(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlBatch.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlBlockContent.
     */
    public static LafOlBlockContent fromJson2LafOlBlockContent(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlBlockContent.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlBlockContentBody.
     */
    public static LafOlBlockContentBody fromJson2LafOlBlockContentBody(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlBlockContentBody.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlBlockContentFieldData.
     */
    public static LafOlBlockContentFieldData fromJson2LafOlBlockContentFieldData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlBlockContentFieldData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlBlockContentFieldRevision.
     */
    public static LafOlBlockContentFieldRevision fromJson2LafOlBlockContentFieldRevision(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlBlockContentFieldRevision.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlBlockContentRevision.
     */
    public static LafOlBlockContentRevision fromJson2LafOlBlockContentRevision(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlBlockContentRevision.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlBlockContentRevisionBody.
     */
    public static LafOlBlockContentRevisionBody fromJson2LafOlBlockContentRevisionBody(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlBlockContentRevisionBody.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheBootstrap.
     */
    public static LafOlCacheBootstrap fromJson2LafOlCacheBootstrap(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheBootstrap.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheConfig.
     */
    public static LafOlCacheConfig fromJson2LafOlCacheConfig(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheConfig.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheContainer.
     */
    public static LafOlCacheContainer fromJson2LafOlCacheContainer(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheContainer.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheData.
     */
    public static LafOlCacheData fromJson2LafOlCacheData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheDefault.
     */
    public static LafOlCacheDefault fromJson2LafOlCacheDefault(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheDefault.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheDiscovery.
     */
    public static LafOlCacheDiscovery fromJson2LafOlCacheDiscovery(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheDiscovery.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheDynamicPageCache.
     */
    public static LafOlCacheDynamicPageCache fromJson2LafOlCacheDynamicPageCache(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheDynamicPageCache.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheEntity.
     */
    public static LafOlCacheEntity fromJson2LafOlCacheEntity(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheEntity.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheMenu.
     */
    public static LafOlCacheMenu fromJson2LafOlCacheMenu(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheMenu.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCachePage.
     */
    public static LafOlCachePage fromJson2LafOlCachePage(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCachePage.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCacheRender.
     */
    public static LafOlCacheRender fromJson2LafOlCacheRender(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCacheRender.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCachetags.
     */
    public static LafOlCachetags fromJson2LafOlCachetags(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCachetags.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlComment.
     */
    public static LafOlComment fromJson2LafOlComment(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlComment.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCommentCommentBody.
     */
    public static LafOlCommentCommentBody fromJson2LafOlCommentCommentBody(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCommentCommentBody.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCommentEntityStatistics.
     */
    public static LafOlCommentEntityStatistics fromJson2LafOlCommentEntityStatistics(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCommentEntityStatistics.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlCommentFieldData.
     */
    public static LafOlCommentFieldData fromJson2LafOlCommentFieldData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlCommentFieldData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlConfig.
     */
    public static LafOlConfig fromJson2LafOlConfig(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlConfig.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlFileManaged.
     */
    public static LafOlFileManaged fromJson2LafOlFileManaged(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlFileManaged.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlFileUsage.
     */
    public static LafOlFileUsage fromJson2LafOlFileUsage(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlFileUsage.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlHistory.
     */
    public static LafOlHistory fromJson2LafOlHistory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlHistory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlKeyValue.
     */
    public static LafOlKeyValue fromJson2LafOlKeyValue(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlKeyValue.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlKeyValueExpire.
     */
    public static LafOlKeyValueExpire fromJson2LafOlKeyValueExpire(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlKeyValueExpire.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlLocaleFile.
     */
    public static LafOlLocaleFile fromJson2LafOlLocaleFile(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlLocaleFile.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlLocalesLocation.
     */
    public static LafOlLocalesLocation fromJson2LafOlLocalesLocation(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlLocalesLocation.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlLocalesSource.
     */
    public static LafOlLocalesSource fromJson2LafOlLocalesSource(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlLocalesSource.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlLocalesTarget.
     */
    public static LafOlLocalesTarget fromJson2LafOlLocalesTarget(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlLocalesTarget.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlMenuLinkContent.
     */
    public static LafOlMenuLinkContent fromJson2LafOlMenuLinkContent(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlMenuLinkContent.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlMenuLinkContentData.
     */
    public static LafOlMenuLinkContentData fromJson2LafOlMenuLinkContentData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlMenuLinkContentData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlMenuLinkContentFieldRevision.
     */
    public static LafOlMenuLinkContentFieldRevision fromJson2LafOlMenuLinkContentFieldRevision(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlMenuLinkContentFieldRevision.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlMenuLinkContentRevision.
     */
    public static LafOlMenuLinkContentRevision fromJson2LafOlMenuLinkContentRevision(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlMenuLinkContentRevision.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlMenuTree.
     */
    public static LafOlMenuTree fromJson2LafOlMenuTree(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlMenuTree.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNode.
     */
    public static LafOlNode fromJson2LafOlNode(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNode.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeBody.
     */
    public static LafOlNodeBody fromJson2LafOlNodeBody(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeBody.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeComment.
     */
    public static LafOlNodeComment fromJson2LafOlNodeComment(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeComment.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeFieldImage.
     */
    public static LafOlNodeFieldImage fromJson2LafOlNodeFieldImage(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeFieldImage.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeFieldTags.
     */
    public static LafOlNodeFieldTags fromJson2LafOlNodeFieldTags(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeFieldTags.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeAccess.
     */
    public static LafOlNodeAccess fromJson2LafOlNodeAccess(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeAccess.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeFieldData.
     */
    public static LafOlNodeFieldData fromJson2LafOlNodeFieldData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeFieldData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeFieldRevision.
     */
    public static LafOlNodeFieldRevision fromJson2LafOlNodeFieldRevision(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeFieldRevision.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeRevision.
     */
    public static LafOlNodeRevision fromJson2LafOlNodeRevision(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeRevision.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeRevisionBody.
     */
    public static LafOlNodeRevisionBody fromJson2LafOlNodeRevisionBody(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeRevisionBody.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeRevisionComment.
     */
    public static LafOlNodeRevisionComment fromJson2LafOlNodeRevisionComment(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeRevisionComment.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeRevisionFieldImage.
     */
    public static LafOlNodeRevisionFieldImage fromJson2LafOlNodeRevisionFieldImage(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeRevisionFieldImage.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlNodeRevisionFieldTags.
     */
    public static LafOlNodeRevisionFieldTags fromJson2LafOlNodeRevisionFieldTags(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlNodeRevisionFieldTags.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlQueue.
     */
    public static LafOlQueue fromJson2LafOlQueue(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlQueue.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlRouter.
     */
    public static LafOlRouter fromJson2LafOlRouter(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlRouter.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlSearchDataset.
     */
    public static LafOlSearchDataset fromJson2LafOlSearchDataset(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlSearchDataset.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlSearchIndex.
     */
    public static LafOlSearchIndex fromJson2LafOlSearchIndex(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlSearchIndex.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlSearchTotal.
     */
    public static LafOlSearchTotal fromJson2LafOlSearchTotal(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlSearchTotal.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlSemaphore.
     */
    public static LafOlSemaphore fromJson2LafOlSemaphore(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlSemaphore.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlSequences.
     */
    public static LafOlSequences fromJson2LafOlSequences(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlSequences.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlSessions.
     */
    public static LafOlSessions fromJson2LafOlSessions(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlSessions.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlShortcut.
     */
    public static LafOlShortcut fromJson2LafOlShortcut(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlShortcut.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlShortcutFieldData.
     */
    public static LafOlShortcutFieldData fromJson2LafOlShortcutFieldData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlShortcutFieldData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlShortcutSetUsers.
     */
    public static LafOlShortcutSetUsers fromJson2LafOlShortcutSetUsers(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlShortcutSetUsers.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlTaxonomyIndex.
     */
    public static LafOlTaxonomyIndex fromJson2LafOlTaxonomyIndex(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlTaxonomyIndex.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlTaxonomyTermParent.
     */
    public static LafOlTaxonomyTermParent fromJson2LafOlTaxonomyTermParent(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlTaxonomyTermParent.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlTaxonomyTermData.
     */
    public static LafOlTaxonomyTermData fromJson2LafOlTaxonomyTermData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlTaxonomyTermData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlTaxonomyTermFieldData.
     */
    public static LafOlTaxonomyTermFieldData fromJson2LafOlTaxonomyTermFieldData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlTaxonomyTermFieldData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlTaxonomyTermFieldRevision.
     */
    public static LafOlTaxonomyTermFieldRevision fromJson2LafOlTaxonomyTermFieldRevision(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlTaxonomyTermFieldRevision.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlTaxonomyTermRevision.
     */
    public static LafOlTaxonomyTermRevision fromJson2LafOlTaxonomyTermRevision(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlTaxonomyTermRevision.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlTaxonomyTermRevisionParent.
     */
    public static LafOlTaxonomyTermRevisionParent fromJson2LafOlTaxonomyTermRevisionParent(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlTaxonomyTermRevisionParent.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlUrlAlias.
     */
    public static LafOlUrlAlias fromJson2LafOlUrlAlias(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlUrlAlias.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlUserRoles.
     */
    public static LafOlUserRoles fromJson2LafOlUserRoles(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlUserRoles.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlUserUserPicture.
     */
    public static LafOlUserUserPicture fromJson2LafOlUserUserPicture(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlUserUserPicture.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlUsers.
     */
    public static LafOlUsers fromJson2LafOlUsers(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlUsers.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlUsersData.
     */
    public static LafOlUsersData fromJson2LafOlUsersData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlUsersData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlUsersFieldData.
     */
    public static LafOlUsersFieldData fromJson2LafOlUsersFieldData(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlUsersFieldData.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The LafOlWatchdog.
     */
    public static LafOlWatchdog fromJson2LafOlWatchdog(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, LafOlWatchdog.class);
    }

    /**
     * Helper function that converts JSON to an JSON array.
     *
     * @param json The JSON string.
     * @return an JSON array.
     */
    public static JsonArray fromJson2Arr(String json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, JsonArray.class);
    }
}
