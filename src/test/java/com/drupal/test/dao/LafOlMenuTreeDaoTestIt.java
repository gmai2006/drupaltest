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
import com.drupal.test.entity.LafOlMenuTree;
import com.drupal.test.entity.LafOlMenuTreeId;
import com.drupal.test.utils.FileUtils;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;

public class LafOlMenuTreeDaoTestIt {
  static final String inputFile = "LafOlMenuTree.json";
  static LafOlMenuTreeDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private LafOlMenuTree[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultLafOlMenuTreeDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlMenuTree[].class);
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
    final LafOlMenuTreeId id =
        new LafOlMenuTreeId(this.records[1].getMlid(), this.records[1].getId());
    LafOlMenuTree testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals menuName ", this.records[1].getMenuName(), testResult.getMenuName());
    org.junit.Assert.assertEquals(
        "expect equals parent ", this.records[1].getParent(), testResult.getParent());
    org.junit.Assert.assertEquals(
        "expect equals routeName ", this.records[1].getRouteName(), testResult.getRouteName());
    org.junit.Assert.assertEquals(
        "expect equals routeParamKey ",
        this.records[1].getRouteParamKey(),
        testResult.getRouteParamKey());
    org.junit.Assert.assertEquals(
        "expect equals routeParameters ",
        this.records[1].getRouteParameters(),
        testResult.getRouteParameters());
    org.junit.Assert.assertEquals(
        "expect equals url ", this.records[1].getUrl(), testResult.getUrl());
    org.junit.Assert.assertEquals(
        "expect equals title ", this.records[1].getTitle(), testResult.getTitle());
    org.junit.Assert.assertEquals(
        "expect equals description ",
        this.records[1].getDescription(),
        testResult.getDescription());
    org.junit.Assert.assertEquals(
        "expect equals class1 ", this.records[1].getClass1(), testResult.getClass1());
    org.junit.Assert.assertEquals(
        "expect equals options ", this.records[1].getOptions(), testResult.getOptions());
    org.junit.Assert.assertEquals(
        "expect equals provider ", this.records[1].getProvider(), testResult.getProvider());
    org.junit.Assert.assertTrue(
        "expect equals enabled ", this.records[1].getEnabled() == testResult.getEnabled());
    org.junit.Assert.assertTrue(
        "expect equals discovered ", this.records[1].getDiscovered() == testResult.getDiscovered());
    org.junit.Assert.assertTrue(
        "expect equals expanded ", this.records[1].getExpanded() == testResult.getExpanded());
    org.junit.Assert.assertTrue(
        "expect equals weight ", this.records[1].getWeight() == testResult.getWeight());
    org.junit.Assert.assertEquals(
        "expect equals metadata ", this.records[1].getMetadata(), testResult.getMetadata());
    org.junit.Assert.assertTrue(
        "expect equals hasChildren ",
        this.records[1].getHasChildren() == testResult.getHasChildren());
    org.junit.Assert.assertTrue(
        "expect equals depth ", this.records[1].getDepth() == testResult.getDepth());
    org.junit.Assert.assertTrue("expect equals p1 ", this.records[1].getP1() == testResult.getP1());
    org.junit.Assert.assertTrue("expect equals p2 ", this.records[1].getP2() == testResult.getP2());
    org.junit.Assert.assertTrue("expect equals p3 ", this.records[1].getP3() == testResult.getP3());
    org.junit.Assert.assertTrue("expect equals p4 ", this.records[1].getP4() == testResult.getP4());
    org.junit.Assert.assertTrue("expect equals p5 ", this.records[1].getP5() == testResult.getP5());
    org.junit.Assert.assertTrue("expect equals p6 ", this.records[1].getP6() == testResult.getP6());
    org.junit.Assert.assertTrue("expect equals p7 ", this.records[1].getP7() == testResult.getP7());
    org.junit.Assert.assertTrue("expect equals p8 ", this.records[1].getP8() == testResult.getP8());
    org.junit.Assert.assertTrue("expect equals p9 ", this.records[1].getP9() == testResult.getP9());
    org.junit.Assert.assertEquals(
        "expect equals formClass ", this.records[1].getFormClass(), testResult.getFormClass());
  }
}
