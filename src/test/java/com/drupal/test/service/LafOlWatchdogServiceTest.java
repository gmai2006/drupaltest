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

import com.drupal.test.entity.LafOlWatchdog;

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

public class LafOlWatchdogServiceTest {
  private static DefaultLafOlWatchdogService serviceMock;
  private static LafOlWatchdog[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultLafOlWatchdogService.class);
    String inputFile = "LafOlWatchdog.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlWatchdog[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getWid())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    LafOlWatchdog testResult = serviceMock.find(records[0].getWid());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue("expect equals uid ", records[0].getUid() == testResult.getUid());
    org.junit.Assert.assertEquals(
        "expect equals type ", records[0].getType(), testResult.getType());
    org.junit.Assert.assertEquals(
        "expect equals message ", records[0].getMessage(), testResult.getMessage());
    org.junit.Assert.assertEquals(
        "expect equals variables ", records[0].getVariables(), testResult.getVariables());
    org.junit.Assert.assertTrue(
        "expect equals severity ", records[0].getSeverity() == testResult.getSeverity());
    org.junit.Assert.assertEquals(
        "expect equals link ", records[0].getLink(), testResult.getLink());
    org.junit.Assert.assertEquals(
        "expect equals location ", records[0].getLocation(), testResult.getLocation());
    org.junit.Assert.assertEquals(
        "expect equals referer ", records[0].getReferer(), testResult.getReferer());
    org.junit.Assert.assertEquals(
        "expect equals hostname ", records[0].getHostname(), testResult.getHostname());
    org.junit.Assert.assertTrue(
        "expect equals timestamp ", records[0].getTimestamp() == testResult.getTimestamp());
  }
}
