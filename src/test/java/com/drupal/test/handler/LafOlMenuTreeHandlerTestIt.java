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
import com.drupal.test.entity.LafOlMenuTree;
import com.drupal.test.dao.JpaDao;
import com.drupal.test.dao.StandaloneJpaDao;
import com.drupal.test.dao.DefaultLafOlMenuTreeDao;
import com.drupal.test.utils.DelimiterParser;
import com.drupal.test.utils.FileUtils;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;

import com.drupal.test.entity.LafOlMenuTreeId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LafOlMenuTreeHandlerTestIt {
  static final String inputFile = "LafOlMenuTree.json";
  static LafOlMenuTreeHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private LafOlMenuTree[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new LafOlMenuTreeHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/LafOlMenuTree.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, LafOlMenuTree[].class);
    assertEquals("match count", count, records.length);
    final LafOlMenuTreeId id =
        new LafOlMenuTreeId(this.records[0].getMlid(), this.records[0].getId());
    LafOlMenuTree testResult = jpa.find(LafOlMenuTree.class, id);
    assertEquals(
        "expect equals menuName ", this.records[0].getMenuName(), testResult.getMenuName());
    assertEquals("expect equals parent ", this.records[0].getParent(), testResult.getParent());
    assertEquals(
        "expect equals routeName ", this.records[0].getRouteName(), testResult.getRouteName());
    assertEquals(
        "expect equals routeParamKey ",
        this.records[0].getRouteParamKey(),
        testResult.getRouteParamKey());
    assertEquals(
        "expect equals routeParameters ",
        this.records[0].getRouteParameters(),
        testResult.getRouteParameters());
    assertEquals("expect equals url ", this.records[0].getUrl(), testResult.getUrl());
    assertEquals("expect equals title ", this.records[0].getTitle(), testResult.getTitle());
    assertEquals(
        "expect equals description ",
        this.records[0].getDescription(),
        testResult.getDescription());
    assertEquals("expect equals class1 ", this.records[0].getClass1(), testResult.getClass1());
    assertEquals("expect equals options ", this.records[0].getOptions(), testResult.getOptions());
    assertEquals(
        "expect equals provider ", this.records[0].getProvider(), testResult.getProvider());
    org.junit.Assert.assertEquals(
        "expect equals enabled ", this.records[0].getEnabled(), testResult.getEnabled());
    org.junit.Assert.assertEquals(
        "expect equals discovered ", this.records[0].getDiscovered(), testResult.getDiscovered());
    org.junit.Assert.assertEquals(
        "expect equals expanded ", this.records[0].getExpanded(), testResult.getExpanded());
    org.junit.Assert.assertEquals(
        "expect equals weight ", this.records[0].getWeight(), testResult.getWeight());
    assertEquals(
        "expect equals metadata ", this.records[0].getMetadata(), testResult.getMetadata());
    org.junit.Assert.assertEquals(
        "expect equals hasChildren ",
        this.records[0].getHasChildren(),
        testResult.getHasChildren());
    org.junit.Assert.assertEquals(
        "expect equals depth ", this.records[0].getDepth(), testResult.getDepth());
    org.junit.Assert.assertEquals("expect equals p1 ", this.records[0].getP1(), testResult.getP1());
    org.junit.Assert.assertEquals("expect equals p2 ", this.records[0].getP2(), testResult.getP2());
    org.junit.Assert.assertEquals("expect equals p3 ", this.records[0].getP3(), testResult.getP3());
    org.junit.Assert.assertEquals("expect equals p4 ", this.records[0].getP4(), testResult.getP4());
    org.junit.Assert.assertEquals("expect equals p5 ", this.records[0].getP5(), testResult.getP5());
    org.junit.Assert.assertEquals("expect equals p6 ", this.records[0].getP6(), testResult.getP6());
    org.junit.Assert.assertEquals("expect equals p7 ", this.records[0].getP7(), testResult.getP7());
    org.junit.Assert.assertEquals("expect equals p8 ", this.records[0].getP8(), testResult.getP8());
    org.junit.Assert.assertEquals("expect equals p9 ", this.records[0].getP9(), testResult.getP9());
    assertEquals(
        "expect equals formClass ", this.records[0].getFormClass(), testResult.getFormClass());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
