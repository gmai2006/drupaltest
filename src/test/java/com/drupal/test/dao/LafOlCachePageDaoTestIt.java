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
import com.drupal.test.entity.LafOlCachePage;
import com.drupal.test.utils.FileUtils;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;

public class LafOlCachePageDaoTestIt {
  static final String inputFile = "LafOlCachePage.json";
  static LafOlCachePageDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private LafOlCachePage[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultLafOlCachePageDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, LafOlCachePage[].class);
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
    LafOlCachePage testResult = dao.find(records[1].getCid());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals data ", this.records[1].getData(), testResult.getData());
    org.junit.Assert.assertTrue(
        "expect equals expire ", this.records[1].getExpire() == testResult.getExpire());
    org.junit.Assert.assertEquals(
        "expect equals created ", this.records[1].getCreated(), testResult.getCreated());
    org.junit.Assert.assertTrue(
        "expect equals serialized ", this.records[1].getSerialized() == testResult.getSerialized());
    org.junit.Assert.assertEquals(
        "expect equals tags ", this.records[1].getTags(), testResult.getTags());
    org.junit.Assert.assertEquals(
        "expect equals checksum ", this.records[1].getChecksum(), testResult.getChecksum());
  }
}
