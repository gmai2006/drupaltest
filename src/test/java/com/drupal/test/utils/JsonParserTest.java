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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.drupal.test.entity.*;

public class JsonParserTest {
  @Test
  public void testParsingLafOlBatch() throws IOException {
    final String inputFile = "LafOlBatch.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlBatch> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlBatch(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals bid ", o.get("bid").getAsInt(), result.get(i).getBid(), 0.0001);
      assertEquals("expect equals token ", o.get("token").getAsString(), result.get(i).getToken());
      assertEquals(
          "expect equals timestamp ",
          o.get("timestamp").getAsInt(),
          result.get(i).getTimestamp(),
          0.0001);
      assertEquals("expect equals batch ", o.get("batch").getAsString(), result.get(i).getBatch());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlBlockContent() throws IOException {
    final String inputFile = "LafOlBlockContent.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlBlockContent> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlBlockContent(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals("expect equals uuid ", o.get("uuid").getAsString(), result.get(i).getUuid());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlBlockContentBody() throws IOException {
    final String inputFile = "LafOlBlockContentBody.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlBlockContentBody> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlBlockContentBody(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bodyValue ",
          o.get("bodyValue").getAsString(),
          result.get(i).getBodyValue());
      assertEquals(
          "expect equals bodySummary ",
          o.get("bodySummary").getAsString(),
          result.get(i).getBodySummary());
      assertEquals(
          "expect equals bodyFormat ",
          o.get("bodyFormat").getAsString(),
          result.get(i).getBodyFormat());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlBlockContentFieldData() throws IOException {
    final String inputFile = "LafOlBlockContentFieldData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlBlockContentFieldData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlBlockContentFieldData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals("expect equals info ", o.get("info").getAsString(), result.get(i).getInfo());
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals reusable ",
          o.get("reusable").getAsInt(),
          result.get(i).getReusable(),
          0.0001);
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
      assertEquals(
          "expect equals revisionTranslationAffected ",
          o.get("revisionTranslationAffected").getAsInt(),
          result.get(i).getRevisionTranslationAffected(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlBlockContentFieldRevision() throws IOException {
    final String inputFile = "LafOlBlockContentFieldRevision.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlBlockContentFieldRevision> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlBlockContentFieldRevision(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals("expect equals info ", o.get("info").getAsString(), result.get(i).getInfo());
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
      assertEquals(
          "expect equals revisionTranslationAffected ",
          o.get("revisionTranslationAffected").getAsInt(),
          result.get(i).getRevisionTranslationAffected(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlBlockContentRevision() throws IOException {
    final String inputFile = "LafOlBlockContentRevision.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlBlockContentRevision> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlBlockContentRevision(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals revisionUser ",
          o.get("revisionUser").getAsInt(),
          result.get(i).getRevisionUser(),
          0.0001);
      assertEquals(
          "expect equals revisionCreated ",
          o.get("revisionCreated").getAsInt(),
          result.get(i).getRevisionCreated(),
          0.0001);
      assertEquals(
          "expect equals revisionLog ",
          o.get("revisionLog").getAsString(),
          result.get(i).getRevisionLog());
      assertEquals(
          "expect equals revisionDefault ",
          o.get("revisionDefault").getAsInt(),
          result.get(i).getRevisionDefault(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlBlockContentRevisionBody() throws IOException {
    final String inputFile = "LafOlBlockContentRevisionBody.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlBlockContentRevisionBody> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlBlockContentRevisionBody(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals bodyValue ",
          o.get("bodyValue").getAsString(),
          result.get(i).getBodyValue());
      assertEquals(
          "expect equals bodySummary ",
          o.get("bodySummary").getAsString(),
          result.get(i).getBodySummary());
      assertEquals(
          "expect equals bodyFormat ",
          o.get("bodyFormat").getAsString(),
          result.get(i).getBodyFormat());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheBootstrap() throws IOException {
    final String inputFile = "LafOlCacheBootstrap.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheBootstrap> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheBootstrap(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheConfig() throws IOException {
    final String inputFile = "LafOlCacheConfig.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheConfig> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheConfig(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheContainer() throws IOException {
    final String inputFile = "LafOlCacheContainer.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheContainer> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheContainer(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheData() throws IOException {
    final String inputFile = "LafOlCacheData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheDefault() throws IOException {
    final String inputFile = "LafOlCacheDefault.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheDefault> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheDefault(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheDiscovery() throws IOException {
    final String inputFile = "LafOlCacheDiscovery.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheDiscovery> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheDiscovery(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheDynamicPageCache() throws IOException {
    final String inputFile = "LafOlCacheDynamicPageCache.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheDynamicPageCache> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheDynamicPageCache(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheEntity() throws IOException {
    final String inputFile = "LafOlCacheEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheMenu() throws IOException {
    final String inputFile = "LafOlCacheMenu.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheMenu> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheMenu(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCachePage() throws IOException {
    final String inputFile = "LafOlCachePage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCachePage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCachePage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCacheRender() throws IOException {
    final String inputFile = "LafOlCacheRender.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCacheRender> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCacheRender(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals cid ", o.get("cid").getAsString(), result.get(i).getCid());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ", o.get("created").getAsBigDecimal(), result.get(i).getCreated());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
      assertEquals("expect equals tags ", o.get("tags").getAsString(), result.get(i).getTags());
      assertEquals(
          "expect equals checksum ", o.get("checksum").getAsString(), result.get(i).getChecksum());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCachetags() throws IOException {
    final String inputFile = "LafOlCachetags.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCachetags> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCachetags(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals tag ", o.get("tag").getAsString(), result.get(i).getTag());
      assertEquals(
          "expect equals invalidations ",
          o.get("invalidations").getAsInt(),
          result.get(i).getInvalidations(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlComment() throws IOException {
    final String inputFile = "LafOlComment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlComment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlComment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals uuid ", o.get("uuid").getAsString(), result.get(i).getUuid());
      assertEquals("expect equals cid ", o.get("cid").getAsInt(), result.get(i).getCid(), 0.0001);
      assertEquals(
          "expect equals commentType ",
          o.get("commentType").getAsString(),
          result.get(i).getCommentType());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCommentCommentBody() throws IOException {
    final String inputFile = "LafOlCommentCommentBody.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCommentCommentBody> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCommentCommentBody(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals commentBodyValue ",
          o.get("commentBodyValue").getAsString(),
          result.get(i).getCommentBodyValue());
      assertEquals(
          "expect equals commentBodyFormat ",
          o.get("commentBodyFormat").getAsString(),
          result.get(i).getCommentBodyFormat());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCommentEntityStatistics() throws IOException {
    final String inputFile = "LafOlCommentEntityStatistics.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCommentEntityStatistics> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCommentEntityStatistics(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityType ",
          o.get("entityType").getAsString(),
          result.get(i).getEntityType());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals fieldName ",
          o.get("fieldName").getAsString(),
          result.get(i).getFieldName());
      assertEquals("expect equals cid ", o.get("cid").getAsInt(), result.get(i).getCid(), 0.0001);
      assertEquals(
          "expect equals lastCommentTimestamp ",
          o.get("lastCommentTimestamp").getAsInt(),
          result.get(i).getLastCommentTimestamp(),
          0.0001);
      assertEquals(
          "expect equals lastCommentName ",
          o.get("lastCommentName").getAsString(),
          result.get(i).getLastCommentName());
      assertEquals(
          "expect equals lastCommentUid ",
          o.get("lastCommentUid").getAsInt(),
          result.get(i).getLastCommentUid(),
          0.0001);
      assertEquals(
          "expect equals commentCount ",
          o.get("commentCount").getAsInt(),
          result.get(i).getCommentCount(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlCommentFieldData() throws IOException {
    final String inputFile = "LafOlCommentFieldData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlCommentFieldData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlCommentFieldData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals cid ", o.get("cid").getAsInt(), result.get(i).getCid(), 0.0001);
      assertEquals(
          "expect equals commentType ",
          o.get("commentType").getAsString(),
          result.get(i).getCommentType());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals("expect equals pid ", o.get("pid").getAsInt(), result.get(i).getPid(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals subject ", o.get("subject").getAsString(), result.get(i).getSubject());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals mail ", o.get("mail").getAsString(), result.get(i).getMail());
      assertEquals(
          "expect equals homepage ", o.get("homepage").getAsString(), result.get(i).getHomepage());
      assertEquals(
          "expect equals hostname ", o.get("hostname").getAsString(), result.get(i).getHostname());
      assertEquals(
          "expect equals created ",
          o.get("created").getAsInt(),
          result.get(i).getCreated(),
          0.0001);
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals thread ", o.get("thread").getAsString(), result.get(i).getThread());
      assertEquals(
          "expect equals entityType ",
          o.get("entityType").getAsString(),
          result.get(i).getEntityType());
      assertEquals(
          "expect equals fieldName ",
          o.get("fieldName").getAsString(),
          result.get(i).getFieldName());
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlConfig() throws IOException {
    final String inputFile = "LafOlConfig.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlConfig> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlConfig(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals collection ",
          o.get("collection").getAsString(),
          result.get(i).getCollection());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlFileManaged() throws IOException {
    final String inputFile = "LafOlFileManaged.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlFileManaged> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlFileManaged(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals fid ", o.get("fid").getAsInt(), result.get(i).getFid(), 0.0001);
      assertEquals("expect equals uuid ", o.get("uuid").getAsString(), result.get(i).getUuid());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals(
          "expect equals filename ", o.get("filename").getAsString(), result.get(i).getFilename());
      assertEquals("expect equals uri ", o.get("uri").getAsString(), result.get(i).getUri());
      assertEquals(
          "expect equals filemime ", o.get("filemime").getAsString(), result.get(i).getFilemime());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals(
          "expect equals created ",
          o.get("created").getAsInt(),
          result.get(i).getCreated(),
          0.0001);
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlFileUsage() throws IOException {
    final String inputFile = "LafOlFileUsage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlFileUsage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlFileUsage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals fid ", o.get("fid").getAsInt(), result.get(i).getFid(), 0.0001);
      assertEquals(
          "expect equals module ", o.get("module").getAsString(), result.get(i).getModule());
      assertEquals("expect equals id ", o.get("id").getAsString(), result.get(i).getId());
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals count ", o.get("count").getAsInt(), result.get(i).getCount(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlHistory() throws IOException {
    final String inputFile = "LafOlHistory.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlHistory> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlHistory(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals("expect equals nid ", o.get("nid").getAsInt(), result.get(i).getNid(), 0.0001);
      assertEquals(
          "expect equals timestamp ",
          o.get("timestamp").getAsInt(),
          result.get(i).getTimestamp(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlKeyValue() throws IOException {
    final String inputFile = "LafOlKeyValue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlKeyValue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlKeyValue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals collection ",
          o.get("collection").getAsString(),
          result.get(i).getCollection());
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlKeyValueExpire() throws IOException {
    final String inputFile = "LafOlKeyValueExpire.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlKeyValueExpire> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlKeyValueExpire(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals collection ",
          o.get("collection").getAsString(),
          result.get(i).getCollection());
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlLocaleFile() throws IOException {
    final String inputFile = "LafOlLocaleFile.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlLocaleFile> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlLocaleFile(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals project ", o.get("project").getAsString(), result.get(i).getProject());
      assertEquals(
          "expect equals filename ", o.get("filename").getAsString(), result.get(i).getFilename());
      assertEquals(
          "expect equals version ", o.get("version").getAsString(), result.get(i).getVersion());
      assertEquals("expect equals uri ", o.get("uri").getAsString(), result.get(i).getUri());
      assertEquals(
          "expect equals timestamp ",
          o.get("timestamp").getAsInt(),
          result.get(i).getTimestamp(),
          0.0001);
      assertEquals(
          "expect equals lastChecked ",
          o.get("lastChecked").getAsInt(),
          result.get(i).getLastChecked(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlLocalesLocation() throws IOException {
    final String inputFile = "LafOlLocalesLocation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlLocalesLocation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlLocalesLocation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals lid ", o.get("lid").getAsInt(), result.get(i).getLid(), 0.0001);
      assertEquals("expect equals sid ", o.get("sid").getAsInt(), result.get(i).getSid(), 0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals version ", o.get("version").getAsString(), result.get(i).getVersion());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlLocalesSource() throws IOException {
    final String inputFile = "LafOlLocalesSource.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlLocalesSource> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlLocalesSource(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals lid ", o.get("lid").getAsInt(), result.get(i).getLid(), 0.0001);
      assertEquals(
          "expect equals context ", o.get("context").getAsString(), result.get(i).getContext());
      assertEquals(
          "expect equals version ", o.get("version").getAsString(), result.get(i).getVersion());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlLocalesTarget() throws IOException {
    final String inputFile = "LafOlLocalesTarget.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlLocalesTarget> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlLocalesTarget(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals lid ", o.get("lid").getAsInt(), result.get(i).getLid(), 0.0001);
      assertEquals(
          "expect equals language ", o.get("language").getAsString(), result.get(i).getLanguage());
      assertEquals(
          "expect equals customized ",
          o.get("customized").getAsInt(),
          result.get(i).getCustomized(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlMenuLinkContent() throws IOException {
    final String inputFile = "LafOlMenuLinkContent.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlMenuLinkContent> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlMenuLinkContent(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals("expect equals uuid ", o.get("uuid").getAsString(), result.get(i).getUuid());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlMenuLinkContentData() throws IOException {
    final String inputFile = "LafOlMenuLinkContentData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlMenuLinkContentData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlMenuLinkContentData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals enabled ",
          o.get("enabled").getAsInt(),
          result.get(i).getEnabled(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals menuName ", o.get("menuName").getAsString(), result.get(i).getMenuName());
      assertEquals(
          "expect equals linkUri ", o.get("linkUri").getAsString(), result.get(i).getLinkUri());
      assertEquals(
          "expect equals linkTitle ",
          o.get("linkTitle").getAsString(),
          result.get(i).getLinkTitle());
      assertEquals(
          "expect equals linkOptions ",
          o.get("linkOptions").getAsString(),
          result.get(i).getLinkOptions());
      assertEquals(
          "expect equals external ",
          o.get("external").getAsInt(),
          result.get(i).getExternal(),
          0.0001);
      assertEquals(
          "expect equals rediscover ",
          o.get("rediscover").getAsInt(),
          result.get(i).getRediscover(),
          0.0001);
      assertEquals(
          "expect equals weight ", o.get("weight").getAsInt(), result.get(i).getWeight(), 0.0001);
      assertEquals(
          "expect equals expanded ",
          o.get("expanded").getAsInt(),
          result.get(i).getExpanded(),
          0.0001);
      assertEquals(
          "expect equals parent ", o.get("parent").getAsString(), result.get(i).getParent());
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
      assertEquals(
          "expect equals revisionTranslationAffected ",
          o.get("revisionTranslationAffected").getAsInt(),
          result.get(i).getRevisionTranslationAffected(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlMenuLinkContentFieldRevision() throws IOException {
    final String inputFile = "LafOlMenuLinkContentFieldRevision.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlMenuLinkContentFieldRevision> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlMenuLinkContentFieldRevision(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals enabled ",
          o.get("enabled").getAsInt(),
          result.get(i).getEnabled(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals linkUri ", o.get("linkUri").getAsString(), result.get(i).getLinkUri());
      assertEquals(
          "expect equals linkTitle ",
          o.get("linkTitle").getAsString(),
          result.get(i).getLinkTitle());
      assertEquals(
          "expect equals linkOptions ",
          o.get("linkOptions").getAsString(),
          result.get(i).getLinkOptions());
      assertEquals(
          "expect equals external ",
          o.get("external").getAsInt(),
          result.get(i).getExternal(),
          0.0001);
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
      assertEquals(
          "expect equals revisionTranslationAffected ",
          o.get("revisionTranslationAffected").getAsInt(),
          result.get(i).getRevisionTranslationAffected(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlMenuLinkContentRevision() throws IOException {
    final String inputFile = "LafOlMenuLinkContentRevision.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlMenuLinkContentRevision> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlMenuLinkContentRevision(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals revisionUser ",
          o.get("revisionUser").getAsInt(),
          result.get(i).getRevisionUser(),
          0.0001);
      assertEquals(
          "expect equals revisionCreated ",
          o.get("revisionCreated").getAsInt(),
          result.get(i).getRevisionCreated(),
          0.0001);
      assertEquals(
          "expect equals revisionLogMessage ",
          o.get("revisionLogMessage").getAsString(),
          result.get(i).getRevisionLogMessage());
      assertEquals(
          "expect equals revisionDefault ",
          o.get("revisionDefault").getAsInt(),
          result.get(i).getRevisionDefault(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlMenuTree() throws IOException {
    final String inputFile = "LafOlMenuTree.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlMenuTree> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlMenuTree(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals mlid ", o.get("mlid").getAsInt(), result.get(i).getMlid(), 0.0001);
      assertEquals("expect equals id ", o.get("id").getAsString(), result.get(i).getId());
      assertEquals(
          "expect equals menuName ", o.get("menuName").getAsString(), result.get(i).getMenuName());
      assertEquals(
          "expect equals parent ", o.get("parent").getAsString(), result.get(i).getParent());
      assertEquals(
          "expect equals routeName ",
          o.get("routeName").getAsString(),
          result.get(i).getRouteName());
      assertEquals(
          "expect equals routeParamKey ",
          o.get("routeParamKey").getAsString(),
          result.get(i).getRouteParamKey());
      assertEquals(
          "expect equals routeParameters ",
          o.get("routeParameters").getAsString(),
          result.get(i).getRouteParameters());
      assertEquals("expect equals url ", o.get("url").getAsString(), result.get(i).getUrl());
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals class1 ", o.get("class1").getAsString(), result.get(i).getClass1());
      assertEquals(
          "expect equals options ", o.get("options").getAsString(), result.get(i).getOptions());
      assertEquals(
          "expect equals provider ", o.get("provider").getAsString(), result.get(i).getProvider());
      assertEquals(
          "expect equals enabled ",
          o.get("enabled").getAsInt(),
          result.get(i).getEnabled(),
          0.0001);
      assertEquals(
          "expect equals discovered ",
          o.get("discovered").getAsInt(),
          result.get(i).getDiscovered(),
          0.0001);
      assertEquals(
          "expect equals expanded ",
          o.get("expanded").getAsInt(),
          result.get(i).getExpanded(),
          0.0001);
      assertEquals(
          "expect equals weight ", o.get("weight").getAsInt(), result.get(i).getWeight(), 0.0001);
      assertEquals(
          "expect equals metadata ", o.get("metadata").getAsString(), result.get(i).getMetadata());
      assertEquals(
          "expect equals hasChildren ",
          o.get("hasChildren").getAsInt(),
          result.get(i).getHasChildren(),
          0.0001);
      assertEquals(
          "expect equals depth ", o.get("depth").getAsInt(), result.get(i).getDepth(), 0.0001);
      assertEquals("expect equals p1 ", o.get("p1").getAsInt(), result.get(i).getP1(), 0.0001);
      assertEquals("expect equals p2 ", o.get("p2").getAsInt(), result.get(i).getP2(), 0.0001);
      assertEquals("expect equals p3 ", o.get("p3").getAsInt(), result.get(i).getP3(), 0.0001);
      assertEquals("expect equals p4 ", o.get("p4").getAsInt(), result.get(i).getP4(), 0.0001);
      assertEquals("expect equals p5 ", o.get("p5").getAsInt(), result.get(i).getP5(), 0.0001);
      assertEquals("expect equals p6 ", o.get("p6").getAsInt(), result.get(i).getP6(), 0.0001);
      assertEquals("expect equals p7 ", o.get("p7").getAsInt(), result.get(i).getP7(), 0.0001);
      assertEquals("expect equals p8 ", o.get("p8").getAsInt(), result.get(i).getP8(), 0.0001);
      assertEquals("expect equals p9 ", o.get("p9").getAsInt(), result.get(i).getP9(), 0.0001);
      assertEquals(
          "expect equals formClass ",
          o.get("formClass").getAsString(),
          result.get(i).getFormClass());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNode() throws IOException {
    final String inputFile = "LafOlNode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals vid ", o.get("vid").getAsInt(), result.get(i).getVid(), 0.0001);
      assertEquals("expect equals nid ", o.get("nid").getAsInt(), result.get(i).getNid(), 0.0001);
      assertEquals("expect equals uuid ", o.get("uuid").getAsString(), result.get(i).getUuid());
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeBody() throws IOException {
    final String inputFile = "LafOlNodeBody.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeBody> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeBody(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bodyValue ",
          o.get("bodyValue").getAsString(),
          result.get(i).getBodyValue());
      assertEquals(
          "expect equals bodySummary ",
          o.get("bodySummary").getAsString(),
          result.get(i).getBodySummary());
      assertEquals(
          "expect equals bodyFormat ",
          o.get("bodyFormat").getAsString(),
          result.get(i).getBodyFormat());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeComment() throws IOException {
    final String inputFile = "LafOlNodeComment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeComment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeComment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals commentStatus ",
          o.get("commentStatus").getAsInt(),
          result.get(i).getCommentStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeFieldImage() throws IOException {
    final String inputFile = "LafOlNodeFieldImage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeFieldImage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeFieldImage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals fieldImageTargetId ",
          o.get("fieldImageTargetId").getAsInt(),
          result.get(i).getFieldImageTargetId(),
          0.0001);
      assertEquals(
          "expect equals fieldImageAlt ",
          o.get("fieldImageAlt").getAsString(),
          result.get(i).getFieldImageAlt());
      assertEquals(
          "expect equals fieldImageTitle ",
          o.get("fieldImageTitle").getAsString(),
          result.get(i).getFieldImageTitle());
      assertEquals(
          "expect equals fieldImageWidth ",
          o.get("fieldImageWidth").getAsInt(),
          result.get(i).getFieldImageWidth(),
          0.0001);
      assertEquals(
          "expect equals fieldImageHeight ",
          o.get("fieldImageHeight").getAsInt(),
          result.get(i).getFieldImageHeight(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeFieldTags() throws IOException {
    final String inputFile = "LafOlNodeFieldTags.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeFieldTags> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeFieldTags(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals fieldTagsTargetId ",
          o.get("fieldTagsTargetId").getAsInt(),
          result.get(i).getFieldTagsTargetId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeAccess() throws IOException {
    final String inputFile = "LafOlNodeAccess.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeAccess> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeAccess(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals gid ", o.get("gid").getAsInt(), result.get(i).getGid(), 0.0001);
      assertEquals("expect equals nid ", o.get("nid").getAsInt(), result.get(i).getNid(), 0.0001);
      assertEquals("expect equals realm ", o.get("realm").getAsString(), result.get(i).getRealm());
      assertEquals(
          "expect equals fallback ",
          o.get("fallback").getAsInt(),
          result.get(i).getFallback(),
          0.0001);
      assertEquals(
          "expect equals grantView ",
          o.get("grantView").getAsInt(),
          result.get(i).getGrantView(),
          0.0001);
      assertEquals(
          "expect equals grantUpdate ",
          o.get("grantUpdate").getAsInt(),
          result.get(i).getGrantUpdate(),
          0.0001);
      assertEquals(
          "expect equals grantDelete ",
          o.get("grantDelete").getAsInt(),
          result.get(i).getGrantDelete(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeFieldData() throws IOException {
    final String inputFile = "LafOlNodeFieldData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeFieldData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeFieldData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals nid ", o.get("nid").getAsInt(), result.get(i).getNid(), 0.0001);
      assertEquals("expect equals vid ", o.get("vid").getAsInt(), result.get(i).getVid(), 0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals created ",
          o.get("created").getAsInt(),
          result.get(i).getCreated(),
          0.0001);
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals promote ",
          o.get("promote").getAsInt(),
          result.get(i).getPromote(),
          0.0001);
      assertEquals(
          "expect equals sticky ", o.get("sticky").getAsInt(), result.get(i).getSticky(), 0.0001);
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
      assertEquals(
          "expect equals revisionTranslationAffected ",
          o.get("revisionTranslationAffected").getAsInt(),
          result.get(i).getRevisionTranslationAffected(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeFieldRevision() throws IOException {
    final String inputFile = "LafOlNodeFieldRevision.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeFieldRevision> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeFieldRevision(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals vid ", o.get("vid").getAsInt(), result.get(i).getVid(), 0.0001);
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals nid ", o.get("nid").getAsInt(), result.get(i).getNid(), 0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals created ",
          o.get("created").getAsInt(),
          result.get(i).getCreated(),
          0.0001);
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals promote ",
          o.get("promote").getAsInt(),
          result.get(i).getPromote(),
          0.0001);
      assertEquals(
          "expect equals sticky ", o.get("sticky").getAsInt(), result.get(i).getSticky(), 0.0001);
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
      assertEquals(
          "expect equals revisionTranslationAffected ",
          o.get("revisionTranslationAffected").getAsInt(),
          result.get(i).getRevisionTranslationAffected(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeRevision() throws IOException {
    final String inputFile = "LafOlNodeRevision.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeRevision> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeRevision(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals vid ", o.get("vid").getAsInt(), result.get(i).getVid(), 0.0001);
      assertEquals("expect equals nid ", o.get("nid").getAsInt(), result.get(i).getNid(), 0.0001);
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals revisionUid ",
          o.get("revisionUid").getAsInt(),
          result.get(i).getRevisionUid(),
          0.0001);
      assertEquals(
          "expect equals revisionTimestamp ",
          o.get("revisionTimestamp").getAsInt(),
          result.get(i).getRevisionTimestamp(),
          0.0001);
      assertEquals(
          "expect equals revisionLog ",
          o.get("revisionLog").getAsString(),
          result.get(i).getRevisionLog());
      assertEquals(
          "expect equals revisionDefault ",
          o.get("revisionDefault").getAsInt(),
          result.get(i).getRevisionDefault(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeRevisionBody() throws IOException {
    final String inputFile = "LafOlNodeRevisionBody.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeRevisionBody> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeRevisionBody(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals bodyValue ",
          o.get("bodyValue").getAsString(),
          result.get(i).getBodyValue());
      assertEquals(
          "expect equals bodySummary ",
          o.get("bodySummary").getAsString(),
          result.get(i).getBodySummary());
      assertEquals(
          "expect equals bodyFormat ",
          o.get("bodyFormat").getAsString(),
          result.get(i).getBodyFormat());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeRevisionComment() throws IOException {
    final String inputFile = "LafOlNodeRevisionComment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeRevisionComment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeRevisionComment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals commentStatus ",
          o.get("commentStatus").getAsInt(),
          result.get(i).getCommentStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeRevisionFieldImage() throws IOException {
    final String inputFile = "LafOlNodeRevisionFieldImage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeRevisionFieldImage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeRevisionFieldImage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals fieldImageTargetId ",
          o.get("fieldImageTargetId").getAsInt(),
          result.get(i).getFieldImageTargetId(),
          0.0001);
      assertEquals(
          "expect equals fieldImageAlt ",
          o.get("fieldImageAlt").getAsString(),
          result.get(i).getFieldImageAlt());
      assertEquals(
          "expect equals fieldImageTitle ",
          o.get("fieldImageTitle").getAsString(),
          result.get(i).getFieldImageTitle());
      assertEquals(
          "expect equals fieldImageWidth ",
          o.get("fieldImageWidth").getAsInt(),
          result.get(i).getFieldImageWidth(),
          0.0001);
      assertEquals(
          "expect equals fieldImageHeight ",
          o.get("fieldImageHeight").getAsInt(),
          result.get(i).getFieldImageHeight(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlNodeRevisionFieldTags() throws IOException {
    final String inputFile = "LafOlNodeRevisionFieldTags.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlNodeRevisionFieldTags> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlNodeRevisionFieldTags(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals fieldTagsTargetId ",
          o.get("fieldTagsTargetId").getAsInt(),
          result.get(i).getFieldTagsTargetId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlQueue() throws IOException {
    final String inputFile = "LafOlQueue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlQueue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlQueue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsInt(), result.get(i).getExpire(), 0.0001);
      assertEquals(
          "expect equals created ",
          o.get("created").getAsInt(),
          result.get(i).getCreated(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlRouter() throws IOException {
    final String inputFile = "LafOlRouter.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlRouter> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlRouter(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals path ", o.get("path").getAsString(), result.get(i).getPath());
      assertEquals(
          "expect equals patternOutline ",
          o.get("patternOutline").getAsString(),
          result.get(i).getPatternOutline());
      assertEquals("expect equals fit ", o.get("fit").getAsInt(), result.get(i).getFit(), 0.0001);
      assertEquals("expect equals route ", o.get("route").getAsString(), result.get(i).getRoute());
      assertEquals(
          "expect equals numberParts ",
          o.get("numberParts").getAsInt(),
          result.get(i).getNumberParts(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlSearchDataset() throws IOException {
    final String inputFile = "LafOlSearchDataset.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlSearchDataset> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlSearchDataset(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals("expect equals sid ", o.get("sid").getAsInt(), result.get(i).getSid(), 0.0001);
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
      assertEquals(
          "expect equals reindex ",
          o.get("reindex").getAsInt(),
          result.get(i).getReindex(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlSearchIndex() throws IOException {
    final String inputFile = "LafOlSearchIndex.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlSearchIndex> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlSearchIndex(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals("expect equals word ", o.get("word").getAsString(), result.get(i).getWord());
      assertEquals("expect equals sid ", o.get("sid").getAsInt(), result.get(i).getSid(), 0.0001);
      assertEquals(
          "expect equals score ", o.get("score").getAsFloat(), result.get(i).getScore(), 0.001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlSearchTotal() throws IOException {
    final String inputFile = "LafOlSearchTotal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlSearchTotal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlSearchTotal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals word ", o.get("word").getAsString(), result.get(i).getWord());
      assertEquals(
          "expect equals count ", o.get("count").getAsFloat(), result.get(i).getCount(), 0.001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlSemaphore() throws IOException {
    final String inputFile = "LafOlSemaphore.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlSemaphore> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlSemaphore(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
      assertEquals(
          "expect equals expire ", o.get("expire").getAsDouble(), result.get(i).getExpire(), 0.001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlSequences() throws IOException {
    final String inputFile = "LafOlSequences.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlSequences> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlSequences(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlSessions() throws IOException {
    final String inputFile = "LafOlSessions.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlSessions> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlSessions(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals sid ", o.get("sid").getAsString(), result.get(i).getSid());
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals(
          "expect equals hostname ", o.get("hostname").getAsString(), result.get(i).getHostname());
      assertEquals(
          "expect equals timestamp ",
          o.get("timestamp").getAsInt(),
          result.get(i).getTimestamp(),
          0.0001);
      assertEquals(
          "expect equals session ", o.get("session").getAsString(), result.get(i).getSession());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlShortcut() throws IOException {
    final String inputFile = "LafOlShortcut.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlShortcut> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlShortcut(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals("expect equals uuid ", o.get("uuid").getAsString(), result.get(i).getUuid());
      assertEquals(
          "expect equals shortcutSet ",
          o.get("shortcutSet").getAsString(),
          result.get(i).getShortcutSet());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlShortcutFieldData() throws IOException {
    final String inputFile = "LafOlShortcutFieldData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlShortcutFieldData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlShortcutFieldData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals shortcutSet ",
          o.get("shortcutSet").getAsString(),
          result.get(i).getShortcutSet());
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsInt(), result.get(i).getWeight(), 0.0001);
      assertEquals(
          "expect equals linkUri ", o.get("linkUri").getAsString(), result.get(i).getLinkUri());
      assertEquals(
          "expect equals linkTitle ",
          o.get("linkTitle").getAsString(),
          result.get(i).getLinkTitle());
      assertEquals(
          "expect equals linkOptions ",
          o.get("linkOptions").getAsString(),
          result.get(i).getLinkOptions());
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlShortcutSetUsers() throws IOException {
    final String inputFile = "LafOlShortcutSetUsers.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlShortcutSetUsers> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlShortcutSetUsers(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals(
          "expect equals setName ", o.get("setName").getAsString(), result.get(i).getSetName());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlTaxonomyIndex() throws IOException {
    final String inputFile = "LafOlTaxonomyIndex.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlTaxonomyIndex> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlTaxonomyIndex(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals nid ", o.get("nid").getAsInt(), result.get(i).getNid(), 0.0001);
      assertEquals("expect equals tid ", o.get("tid").getAsInt(), result.get(i).getTid(), 0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals(
          "expect equals sticky ", o.get("sticky").getAsInt(), result.get(i).getSticky(), 0.0001);
      assertEquals(
          "expect equals created ",
          o.get("created").getAsInt(),
          result.get(i).getCreated(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlTaxonomyTermParent() throws IOException {
    final String inputFile = "LafOlTaxonomyTermParent.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlTaxonomyTermParent> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlTaxonomyTermParent(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals parentTargetId ",
          o.get("parentTargetId").getAsInt(),
          result.get(i).getParentTargetId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlTaxonomyTermData() throws IOException {
    final String inputFile = "LafOlTaxonomyTermData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlTaxonomyTermData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlTaxonomyTermData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals uuid ", o.get("uuid").getAsString(), result.get(i).getUuid());
      assertEquals("expect equals tid ", o.get("tid").getAsInt(), result.get(i).getTid(), 0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals vid ", o.get("vid").getAsString(), result.get(i).getVid());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlTaxonomyTermFieldData() throws IOException {
    final String inputFile = "LafOlTaxonomyTermFieldData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlTaxonomyTermFieldData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlTaxonomyTermFieldData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals tid ", o.get("tid").getAsInt(), result.get(i).getTid(), 0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals vid ", o.get("vid").getAsString(), result.get(i).getVid());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals descriptionValue ",
          o.get("descriptionValue").getAsString(),
          result.get(i).getDescriptionValue());
      assertEquals(
          "expect equals descriptionFormat ",
          o.get("descriptionFormat").getAsString(),
          result.get(i).getDescriptionFormat());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsInt(), result.get(i).getWeight(), 0.0001);
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
      assertEquals(
          "expect equals revisionTranslationAffected ",
          o.get("revisionTranslationAffected").getAsInt(),
          result.get(i).getRevisionTranslationAffected(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlTaxonomyTermFieldRevision() throws IOException {
    final String inputFile = "LafOlTaxonomyTermFieldRevision.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlTaxonomyTermFieldRevision> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlTaxonomyTermFieldRevision(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals tid ", o.get("tid").getAsInt(), result.get(i).getTid(), 0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals descriptionValue ",
          o.get("descriptionValue").getAsString(),
          result.get(i).getDescriptionValue());
      assertEquals(
          "expect equals descriptionFormat ",
          o.get("descriptionFormat").getAsString(),
          result.get(i).getDescriptionFormat());
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
      assertEquals(
          "expect equals revisionTranslationAffected ",
          o.get("revisionTranslationAffected").getAsInt(),
          result.get(i).getRevisionTranslationAffected(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlTaxonomyTermRevision() throws IOException {
    final String inputFile = "LafOlTaxonomyTermRevision.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlTaxonomyTermRevision> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlTaxonomyTermRevision(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals("expect equals tid ", o.get("tid").getAsInt(), result.get(i).getTid(), 0.0001);
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals revisionUser ",
          o.get("revisionUser").getAsInt(),
          result.get(i).getRevisionUser(),
          0.0001);
      assertEquals(
          "expect equals revisionCreated ",
          o.get("revisionCreated").getAsInt(),
          result.get(i).getRevisionCreated(),
          0.0001);
      assertEquals(
          "expect equals revisionLogMessage ",
          o.get("revisionLogMessage").getAsString(),
          result.get(i).getRevisionLogMessage());
      assertEquals(
          "expect equals revisionDefault ",
          o.get("revisionDefault").getAsInt(),
          result.get(i).getRevisionDefault(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlTaxonomyTermRevisionParent() throws IOException {
    final String inputFile = "LafOlTaxonomyTermRevisionParent.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlTaxonomyTermRevisionParent> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlTaxonomyTermRevisionParent(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals parentTargetId ",
          o.get("parentTargetId").getAsInt(),
          result.get(i).getParentTargetId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlUrlAlias() throws IOException {
    final String inputFile = "LafOlUrlAlias.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlUrlAlias> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlUrlAlias(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals pid ", o.get("pid").getAsInt(), result.get(i).getPid(), 0.0001);
      assertEquals(
          "expect equals source ", o.get("source").getAsString(), result.get(i).getSource());
      assertEquals("expect equals alias ", o.get("alias").getAsString(), result.get(i).getAlias());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlUserRoles() throws IOException {
    final String inputFile = "LafOlUserRoles.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlUserRoles> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlUserRoles(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals rolesTargetId ",
          o.get("rolesTargetId").getAsString(),
          result.get(i).getRolesTargetId());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlUserUserPicture() throws IOException {
    final String inputFile = "LafOlUserUserPicture.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlUserUserPicture> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlUserUserPicture(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals(
          "expect equals deleted ",
          o.get("deleted").getAsInt(),
          result.get(i).getDeleted(),
          0.0001);
      assertEquals(
          "expect equals delta ", o.get("delta").getAsInt(), result.get(i).getDelta(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals bundle ", o.get("bundle").getAsString(), result.get(i).getBundle());
      assertEquals(
          "expect equals revisionId ",
          o.get("revisionId").getAsInt(),
          result.get(i).getRevisionId(),
          0.0001);
      assertEquals(
          "expect equals userPictureTargetId ",
          o.get("userPictureTargetId").getAsInt(),
          result.get(i).getUserPictureTargetId(),
          0.0001);
      assertEquals(
          "expect equals userPictureAlt ",
          o.get("userPictureAlt").getAsString(),
          result.get(i).getUserPictureAlt());
      assertEquals(
          "expect equals userPictureTitle ",
          o.get("userPictureTitle").getAsString(),
          result.get(i).getUserPictureTitle());
      assertEquals(
          "expect equals userPictureWidth ",
          o.get("userPictureWidth").getAsInt(),
          result.get(i).getUserPictureWidth(),
          0.0001);
      assertEquals(
          "expect equals userPictureHeight ",
          o.get("userPictureHeight").getAsInt(),
          result.get(i).getUserPictureHeight(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlUsers() throws IOException {
    final String inputFile = "LafOlUsers.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlUsers> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlUsers(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals("expect equals uuid ", o.get("uuid").getAsString(), result.get(i).getUuid());
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlUsersData() throws IOException {
    final String inputFile = "LafOlUsersData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlUsersData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlUsersData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals(
          "expect equals module ", o.get("module").getAsString(), result.get(i).getModule());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
      assertEquals(
          "expect equals serialized ",
          o.get("serialized").getAsInt(),
          result.get(i).getSerialized(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlUsersFieldData() throws IOException {
    final String inputFile = "LafOlUsersFieldData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlUsersFieldData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlUsersFieldData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals(
          "expect equals langcode ", o.get("langcode").getAsString(), result.get(i).getLangcode());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals preferredLangcode ",
          o.get("preferredLangcode").getAsString(),
          result.get(i).getPreferredLangcode());
      assertEquals(
          "expect equals preferredAdminLangcode ",
          o.get("preferredAdminLangcode").getAsString(),
          result.get(i).getPreferredAdminLangcode());
      assertEquals("expect equals pass ", o.get("pass").getAsString(), result.get(i).getPass());
      assertEquals("expect equals mail ", o.get("mail").getAsString(), result.get(i).getMail());
      assertEquals(
          "expect equals timezone ", o.get("timezone").getAsString(), result.get(i).getTimezone());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals(
          "expect equals created ",
          o.get("created").getAsInt(),
          result.get(i).getCreated(),
          0.0001);
      assertEquals(
          "expect equals changed ",
          o.get("changed").getAsInt(),
          result.get(i).getChanged(),
          0.0001);
      assertEquals(
          "expect equals access ", o.get("access").getAsInt(), result.get(i).getAccess(), 0.0001);
      assertEquals(
          "expect equals login ", o.get("login").getAsInt(), result.get(i).getLogin(), 0.0001);
      assertEquals("expect equals init ", o.get("init").getAsString(), result.get(i).getInit());
      assertEquals(
          "expect equals defaultLangcode ",
          o.get("defaultLangcode").getAsInt(),
          result.get(i).getDefaultLangcode(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLafOlWatchdog() throws IOException {
    final String inputFile = "LafOlWatchdog.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LafOlWatchdog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LafOlWatchdog(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals wid ", o.get("wid").getAsInt(), result.get(i).getWid(), 0.0001);
      assertEquals("expect equals uid ", o.get("uid").getAsInt(), result.get(i).getUid(), 0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals message ", o.get("message").getAsString(), result.get(i).getMessage());
      assertEquals(
          "expect equals variables ",
          o.get("variables").getAsString(),
          result.get(i).getVariables());
      assertEquals(
          "expect equals severity ",
          o.get("severity").getAsInt(),
          result.get(i).getSeverity(),
          0.0001);
      assertEquals("expect equals link ", o.get("link").getAsString(), result.get(i).getLink());
      assertEquals(
          "expect equals location ", o.get("location").getAsString(), result.get(i).getLocation());
      assertEquals(
          "expect equals referer ", o.get("referer").getAsString(), result.get(i).getReferer());
      assertEquals(
          "expect equals hostname ", o.get("hostname").getAsString(), result.get(i).getHostname());
      assertEquals(
          "expect equals timestamp ",
          o.get("timestamp").getAsInt(),
          result.get(i).getTimestamp(),
          0.0001);
    }

    result.clear();
  }
}
