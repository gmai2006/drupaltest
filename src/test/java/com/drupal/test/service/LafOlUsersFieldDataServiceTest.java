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

import com.drupal.test.entity.LafOlUsersFieldData;
import com.drupal.test.entity.LafOlUsersFieldDataId;

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

public class LafOlUsersFieldDataServiceTest {
  private static DefaultLafOlUsersFieldDataService serviceMock;
  private static LafOlUsersFieldData[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultLafOlUsersFieldDataService.class);
    String inputFile = "LafOlUsersFieldData.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlUsersFieldData[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final LafOlUsersFieldDataId id =
        new LafOlUsersFieldDataId(
            records[0].getUid(), records[0].getLangcode(), records[0].getName());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final LafOlUsersFieldDataId id =
        new LafOlUsersFieldDataId(
            records[0].getUid(), records[0].getLangcode(), records[0].getName());
    LafOlUsersFieldData testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals preferredLangcode ",
        records[0].getPreferredLangcode(),
        testResult.getPreferredLangcode());
    org.junit.Assert.assertEquals(
        "expect equals preferredAdminLangcode ",
        records[0].getPreferredAdminLangcode(),
        testResult.getPreferredAdminLangcode());
    org.junit.Assert.assertEquals(
        "expect equals pass ", records[0].getPass(), testResult.getPass());
    org.junit.Assert.assertEquals(
        "expect equals mail ", records[0].getMail(), testResult.getMail());
    org.junit.Assert.assertEquals(
        "expect equals timezone ", records[0].getTimezone(), testResult.getTimezone());
    org.junit.Assert.assertTrue(
        "expect equals status ", records[0].getStatus() == testResult.getStatus());
    org.junit.Assert.assertTrue(
        "expect equals created ", records[0].getCreated() == testResult.getCreated());
    org.junit.Assert.assertTrue(
        "expect equals changed ", records[0].getChanged() == testResult.getChanged());
    org.junit.Assert.assertTrue(
        "expect equals access ", records[0].getAccess() == testResult.getAccess());
    org.junit.Assert.assertTrue(
        "expect equals login ", records[0].getLogin() == testResult.getLogin());
    org.junit.Assert.assertEquals(
        "expect equals init ", records[0].getInit(), testResult.getInit());
    org.junit.Assert.assertTrue(
        "expect equals defaultLangcode ",
        records[0].getDefaultLangcode() == testResult.getDefaultLangcode());
  }
}
