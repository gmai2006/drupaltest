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
package com.drupal.test.service;

import com.drupal.test.entity.LafOlMenuTree;
import com.drupal.test.entity.LafOlMenuTreeId;

import com.drupal.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;

public class LafOlMenuTreeServiceTest {
  private static DefaultLafOlMenuTreeService serviceMock;
  private static LafOlMenuTree[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultLafOlMenuTreeService.class);
    String inputFile = "LafOlMenuTree.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlMenuTree[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final LafOlMenuTreeId id = new LafOlMenuTreeId(records[0].getMlid(), records[0].getId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final LafOlMenuTreeId id = new LafOlMenuTreeId(records[0].getMlid(), records[0].getId());
    LafOlMenuTree testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals menuName ", records[0].getMenuName(), testResult.getMenuName());
    org.junit.Assert.assertEquals(
        "expect equals parent ", records[0].getParent(), testResult.getParent());
    org.junit.Assert.assertEquals(
        "expect equals routeName ", records[0].getRouteName(), testResult.getRouteName());
    org.junit.Assert.assertEquals(
        "expect equals routeParamKey ",
        records[0].getRouteParamKey(),
        testResult.getRouteParamKey());
    org.junit.Assert.assertEquals(
        "expect equals routeParameters ",
        records[0].getRouteParameters(),
        testResult.getRouteParameters());
    org.junit.Assert.assertEquals("expect equals url ", records[0].getUrl(), testResult.getUrl());
    org.junit.Assert.assertEquals(
        "expect equals title ", records[0].getTitle(), testResult.getTitle());
    org.junit.Assert.assertEquals(
        "expect equals description ", records[0].getDescription(), testResult.getDescription());
    org.junit.Assert.assertEquals(
        "expect equals class1 ", records[0].getClass1(), testResult.getClass1());
    org.junit.Assert.assertEquals(
        "expect equals options ", records[0].getOptions(), testResult.getOptions());
    org.junit.Assert.assertEquals(
        "expect equals provider ", records[0].getProvider(), testResult.getProvider());
    org.junit.Assert.assertTrue(
        "expect equals enabled ", records[0].getEnabled() == testResult.getEnabled());
    org.junit.Assert.assertTrue(
        "expect equals discovered ", records[0].getDiscovered() == testResult.getDiscovered());
    org.junit.Assert.assertTrue(
        "expect equals expanded ", records[0].getExpanded() == testResult.getExpanded());
    org.junit.Assert.assertTrue(
        "expect equals weight ", records[0].getWeight() == testResult.getWeight());
    org.junit.Assert.assertEquals(
        "expect equals metadata ", records[0].getMetadata(), testResult.getMetadata());
    org.junit.Assert.assertTrue(
        "expect equals hasChildren ", records[0].getHasChildren() == testResult.getHasChildren());
    org.junit.Assert.assertTrue(
        "expect equals depth ", records[0].getDepth() == testResult.getDepth());
    org.junit.Assert.assertTrue("expect equals p1 ", records[0].getP1() == testResult.getP1());
    org.junit.Assert.assertTrue("expect equals p2 ", records[0].getP2() == testResult.getP2());
    org.junit.Assert.assertTrue("expect equals p3 ", records[0].getP3() == testResult.getP3());
    org.junit.Assert.assertTrue("expect equals p4 ", records[0].getP4() == testResult.getP4());
    org.junit.Assert.assertTrue("expect equals p5 ", records[0].getP5() == testResult.getP5());
    org.junit.Assert.assertTrue("expect equals p6 ", records[0].getP6() == testResult.getP6());
    org.junit.Assert.assertTrue("expect equals p7 ", records[0].getP7() == testResult.getP7());
    org.junit.Assert.assertTrue("expect equals p8 ", records[0].getP8() == testResult.getP8());
    org.junit.Assert.assertTrue("expect equals p9 ", records[0].getP9() == testResult.getP9());
    org.junit.Assert.assertEquals(
        "expect equals formClass ", records[0].getFormClass(), testResult.getFormClass());
  }
}
