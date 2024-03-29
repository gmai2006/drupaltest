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
package com.drupal.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.drupal.test.entity.LafOlMenuLinkContentData;
import com.drupal.test.entity.LafOlMenuLinkContentDataId;
import com.drupal.test.utils.FileUtils;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;

public class LafOlMenuLinkContentDataDaoTestIt {
  static final String inputFile = "LafOlMenuLinkContentData.json";
  static LafOlMenuLinkContentDataDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private LafOlMenuLinkContentData[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultLafOlMenuLinkContentDataDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlMenuLinkContentData[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    final LafOlMenuLinkContentDataId id =
        new LafOlMenuLinkContentDataId(this.records[1].getLangcode(), this.records[1].getId());
    LafOlMenuLinkContentData testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals revisionId ", this.records[1].getRevisionId() == testResult.getRevisionId());
    org.junit.Assert.assertEquals(
        "expect equals bundle ", this.records[1].getBundle(), testResult.getBundle());
    org.junit.Assert.assertTrue(
        "expect equals enabled ", this.records[1].getEnabled() == testResult.getEnabled());
    org.junit.Assert.assertEquals(
        "expect equals title ", this.records[1].getTitle(), testResult.getTitle());
    org.junit.Assert.assertEquals(
        "expect equals description ",
        this.records[1].getDescription(),
        testResult.getDescription());
    org.junit.Assert.assertEquals(
        "expect equals menuName ", this.records[1].getMenuName(), testResult.getMenuName());
    org.junit.Assert.assertEquals(
        "expect equals linkUri ", this.records[1].getLinkUri(), testResult.getLinkUri());
    org.junit.Assert.assertEquals(
        "expect equals linkTitle ", this.records[1].getLinkTitle(), testResult.getLinkTitle());
    org.junit.Assert.assertEquals(
        "expect equals linkOptions ",
        this.records[1].getLinkOptions(),
        testResult.getLinkOptions());
    org.junit.Assert.assertTrue(
        "expect equals external ", this.records[1].getExternal() == testResult.getExternal());
    org.junit.Assert.assertTrue(
        "expect equals rediscover ", this.records[1].getRediscover() == testResult.getRediscover());
    org.junit.Assert.assertTrue(
        "expect equals weight ", this.records[1].getWeight() == testResult.getWeight());
    org.junit.Assert.assertTrue(
        "expect equals expanded ", this.records[1].getExpanded() == testResult.getExpanded());
    org.junit.Assert.assertEquals(
        "expect equals parent ", this.records[1].getParent(), testResult.getParent());
    org.junit.Assert.assertTrue(
        "expect equals changed ", this.records[1].getChanged() == testResult.getChanged());
    org.junit.Assert.assertTrue(
        "expect equals defaultLangcode ",
        this.records[1].getDefaultLangcode() == testResult.getDefaultLangcode());
    org.junit.Assert.assertTrue(
        "expect equals revisionTranslationAffected ",
        this.records[1].getRevisionTranslationAffected()
            == testResult.getRevisionTranslationAffected());
  }
}
