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

import com.drupal.test.entity.LafOlNodeRevision;

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

public class LafOlNodeRevisionServiceTest {
  private static DefaultLafOlNodeRevisionService serviceMock;
  private static LafOlNodeRevision[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultLafOlNodeRevisionService.class);
    String inputFile = "LafOlNodeRevision.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlNodeRevision[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getVid())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    LafOlNodeRevision testResult = serviceMock.find(records[0].getVid());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue("expect equals nid ", records[0].getNid() == testResult.getNid());
    org.junit.Assert.assertEquals(
        "expect equals langcode ", records[0].getLangcode(), testResult.getLangcode());
    org.junit.Assert.assertTrue(
        "expect equals revisionUid ", records[0].getRevisionUid() == testResult.getRevisionUid());
    org.junit.Assert.assertTrue(
        "expect equals revisionTimestamp ",
        records[0].getRevisionTimestamp() == testResult.getRevisionTimestamp());
    org.junit.Assert.assertEquals(
        "expect equals revisionLog ", records[0].getRevisionLog(), testResult.getRevisionLog());
    org.junit.Assert.assertTrue(
        "expect equals revisionDefault ",
        records[0].getRevisionDefault() == testResult.getRevisionDefault());
  }
}
