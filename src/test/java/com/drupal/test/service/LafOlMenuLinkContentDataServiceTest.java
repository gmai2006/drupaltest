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

import com.drupal.test.entity.LafOlMenuLinkContentData;
import com.drupal.test.entity.LafOlMenuLinkContentDataId;

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

public class LafOlMenuLinkContentDataServiceTest {
  private static DefaultLafOlMenuLinkContentDataService serviceMock;
  private static LafOlMenuLinkContentData[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultLafOlMenuLinkContentDataService.class);
    String inputFile = "LafOlMenuLinkContentData.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlMenuLinkContentData[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final LafOlMenuLinkContentDataId id =
        new LafOlMenuLinkContentDataId(records[0].getLangcode(), records[0].getId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final LafOlMenuLinkContentDataId id =
        new LafOlMenuLinkContentDataId(records[0].getLangcode(), records[0].getId());
    LafOlMenuLinkContentData testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals revisionId ", records[0].getRevisionId() == testResult.getRevisionId());
    org.junit.Assert.assertEquals(
        "expect equals bundle ", records[0].getBundle(), testResult.getBundle());
    org.junit.Assert.assertTrue(
        "expect equals enabled ", records[0].getEnabled() == testResult.getEnabled());
    org.junit.Assert.assertEquals(
        "expect equals title ", records[0].getTitle(), testResult.getTitle());
    org.junit.Assert.assertEquals(
        "expect equals description ", records[0].getDescription(), testResult.getDescription());
    org.junit.Assert.assertEquals(
        "expect equals menuName ", records[0].getMenuName(), testResult.getMenuName());
    org.junit.Assert.assertEquals(
        "expect equals linkUri ", records[0].getLinkUri(), testResult.getLinkUri());
    org.junit.Assert.assertEquals(
        "expect equals linkTitle ", records[0].getLinkTitle(), testResult.getLinkTitle());
    org.junit.Assert.assertEquals(
        "expect equals linkOptions ", records[0].getLinkOptions(), testResult.getLinkOptions());
    org.junit.Assert.assertTrue(
        "expect equals external ", records[0].getExternal() == testResult.getExternal());
    org.junit.Assert.assertTrue(
        "expect equals rediscover ", records[0].getRediscover() == testResult.getRediscover());
    org.junit.Assert.assertTrue(
        "expect equals weight ", records[0].getWeight() == testResult.getWeight());
    org.junit.Assert.assertTrue(
        "expect equals expanded ", records[0].getExpanded() == testResult.getExpanded());
    org.junit.Assert.assertEquals(
        "expect equals parent ", records[0].getParent(), testResult.getParent());
    org.junit.Assert.assertTrue(
        "expect equals changed ", records[0].getChanged() == testResult.getChanged());
    org.junit.Assert.assertTrue(
        "expect equals defaultLangcode ",
        records[0].getDefaultLangcode() == testResult.getDefaultLangcode());
    org.junit.Assert.assertTrue(
        "expect equals revisionTranslationAffected ",
        records[0].getRevisionTranslationAffected() == testResult.getRevisionTranslationAffected());
  }
}
