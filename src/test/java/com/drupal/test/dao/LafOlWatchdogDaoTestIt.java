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
import com.drupal.test.entity.LafOlWatchdog;
import com.drupal.test.utils.FileUtils;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;

public class LafOlWatchdogDaoTestIt {
  static final String inputFile = "LafOlWatchdog.json";
  static LafOlWatchdogDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private LafOlWatchdog[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultLafOlWatchdogDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlWatchdog[].class);
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
    LafOlWatchdog testResult = dao.find(records[1].getWid());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals uid ", this.records[1].getUid() == testResult.getUid());
    org.junit.Assert.assertEquals(
        "expect equals type ", this.records[1].getType(), testResult.getType());
    org.junit.Assert.assertEquals(
        "expect equals message ", this.records[1].getMessage(), testResult.getMessage());
    org.junit.Assert.assertEquals(
        "expect equals variables ", this.records[1].getVariables(), testResult.getVariables());
    org.junit.Assert.assertTrue(
        "expect equals severity ", this.records[1].getSeverity() == testResult.getSeverity());
    org.junit.Assert.assertEquals(
        "expect equals link ", this.records[1].getLink(), testResult.getLink());
    org.junit.Assert.assertEquals(
        "expect equals location ", this.records[1].getLocation(), testResult.getLocation());
    org.junit.Assert.assertEquals(
        "expect equals referer ", this.records[1].getReferer(), testResult.getReferer());
    org.junit.Assert.assertEquals(
        "expect equals hostname ", this.records[1].getHostname(), testResult.getHostname());
    org.junit.Assert.assertTrue(
        "expect equals timestamp ", this.records[1].getTimestamp() == testResult.getTimestamp());
  }
}
