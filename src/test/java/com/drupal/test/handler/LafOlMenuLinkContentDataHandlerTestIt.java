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
package com.drupal.test.handler;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.CDL;
import org.json.JSONArray;
import com.google.gson.Gson;
import com.drupal.test.entity.LafOlMenuLinkContentData;
import com.drupal.test.dao.JpaDao;
import com.drupal.test.dao.StandaloneJpaDao;
import com.drupal.test.dao.DefaultLafOlMenuLinkContentDataDao;
import com.drupal.test.utils.DelimiterParser;
import com.drupal.test.utils.FileUtils;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;

import com.drupal.test.entity.LafOlMenuLinkContentDataId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LafOlMenuLinkContentDataHandlerTestIt {
  static final String inputFile = "LafOlMenuLinkContentData.json";
  static LafOlMenuLinkContentDataHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private LafOlMenuLinkContentData[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new LafOlMenuLinkContentDataHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/LafOlMenuLinkContentData.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, LafOlMenuLinkContentData[].class);
    assertEquals("match count", count, records.length);
    final LafOlMenuLinkContentDataId id =
        new LafOlMenuLinkContentDataId(this.records[0].getLangcode(), this.records[0].getId());
    LafOlMenuLinkContentData testResult = jpa.find(LafOlMenuLinkContentData.class, id);
    org.junit.Assert.assertEquals(
        "expect equals revisionId ", this.records[0].getRevisionId(), testResult.getRevisionId());
    assertEquals("expect equals bundle ", this.records[0].getBundle(), testResult.getBundle());
    org.junit.Assert.assertEquals(
        "expect equals enabled ", this.records[0].getEnabled(), testResult.getEnabled());
    assertEquals("expect equals title ", this.records[0].getTitle(), testResult.getTitle());
    assertEquals(
        "expect equals description ",
        this.records[0].getDescription(),
        testResult.getDescription());
    assertEquals(
        "expect equals menuName ", this.records[0].getMenuName(), testResult.getMenuName());
    assertEquals("expect equals linkUri ", this.records[0].getLinkUri(), testResult.getLinkUri());
    assertEquals(
        "expect equals linkTitle ", this.records[0].getLinkTitle(), testResult.getLinkTitle());
    assertEquals(
        "expect equals linkOptions ",
        this.records[0].getLinkOptions(),
        testResult.getLinkOptions());
    org.junit.Assert.assertEquals(
        "expect equals external ", this.records[0].getExternal(), testResult.getExternal());
    org.junit.Assert.assertEquals(
        "expect equals rediscover ", this.records[0].getRediscover(), testResult.getRediscover());
    org.junit.Assert.assertEquals(
        "expect equals weight ", this.records[0].getWeight(), testResult.getWeight());
    org.junit.Assert.assertEquals(
        "expect equals expanded ", this.records[0].getExpanded(), testResult.getExpanded());
    assertEquals("expect equals parent ", this.records[0].getParent(), testResult.getParent());
    org.junit.Assert.assertEquals(
        "expect equals changed ", this.records[0].getChanged(), testResult.getChanged());
    org.junit.Assert.assertEquals(
        "expect equals defaultLangcode ",
        this.records[0].getDefaultLangcode(),
        testResult.getDefaultLangcode());
    org.junit.Assert.assertEquals(
        "expect equals revisionTranslationAffected ",
        this.records[0].getRevisionTranslationAffected(),
        testResult.getRevisionTranslationAffected());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
