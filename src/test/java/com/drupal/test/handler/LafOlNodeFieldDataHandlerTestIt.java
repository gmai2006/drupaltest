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
import com.drupal.test.entity.LafOlNodeFieldData;
import com.drupal.test.dao.JpaDao;
import com.drupal.test.dao.StandaloneJpaDao;
import com.drupal.test.dao.DefaultLafOlNodeFieldDataDao;
import com.drupal.test.utils.DelimiterParser;
import com.drupal.test.utils.FileUtils;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;

import com.drupal.test.entity.LafOlNodeFieldDataId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LafOlNodeFieldDataHandlerTestIt {
  static final String inputFile = "LafOlNodeFieldData.json";
  static LafOlNodeFieldDataHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private LafOlNodeFieldData[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new LafOlNodeFieldDataHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = new File("./src/test/resources/LafOlNodeFieldData.csv");
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, LafOlNodeFieldData[].class);
    assertEquals("match count", count, records.length);
    final LafOlNodeFieldDataId id =
        new LafOlNodeFieldDataId(this.records[0].getLangcode(), this.records[0].getNid());
    LafOlNodeFieldData testResult = jpa.find(LafOlNodeFieldData.class, id);
    org.junit.Assert.assertEquals(
        "expect equals vid ", this.records[0].getVid(), testResult.getVid());
    assertEquals("expect equals type ", this.records[0].getType(), testResult.getType());
    org.junit.Assert.assertEquals(
        "expect equals status ", this.records[0].getStatus(), testResult.getStatus());
    org.junit.Assert.assertEquals(
        "expect equals uid ", this.records[0].getUid(), testResult.getUid());
    assertEquals("expect equals title ", this.records[0].getTitle(), testResult.getTitle());
    org.junit.Assert.assertEquals(
        "expect equals created ", this.records[0].getCreated(), testResult.getCreated());
    org.junit.Assert.assertEquals(
        "expect equals changed ", this.records[0].getChanged(), testResult.getChanged());
    org.junit.Assert.assertEquals(
        "expect equals promote ", this.records[0].getPromote(), testResult.getPromote());
    org.junit.Assert.assertEquals(
        "expect equals sticky ", this.records[0].getSticky(), testResult.getSticky());
    org.junit.Assert.assertEquals(
        "expect equals defaultLangcode ",
        this.records[0].getDefaultLangcode(),
        testResult.getDefaultLangcode());
    org.junit.Assert.assertEquals(
        "expect equals revisionTranslationAffected ",
        this.records[0].getRevisionTranslationAffected(),
        testResult.getRevisionTranslationAffected());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }
}
