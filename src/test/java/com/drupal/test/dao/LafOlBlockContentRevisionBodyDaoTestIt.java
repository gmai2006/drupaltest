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

import static org.junit.Assert.assertNotNull;

import com.drupal.test.entity.LafOlBlockContentRevisionBody;
import com.drupal.test.entity.LafOlBlockContentRevisionBodyId;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;
import com.drupal.test.utils.FileUtils;
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

public class LafOlBlockContentRevisionBodyDaoTestIt {
    static final String inputFile = "LafOlBlockContentRevisionBody.json";
    static LafOlBlockContentRevisionBodyDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private LafOlBlockContentRevisionBody[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultLafOlBlockContentRevisionBodyDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, LafOlBlockContentRevisionBody[].class);
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
        final LafOlBlockContentRevisionBodyId id =
                new LafOlBlockContentRevisionBodyId(
                        this.records[1].getLangcode(),
                        this.records[1].getDeleted(),
                        this.records[1].getDelta(),
                        this.records[1].getEntityId(),
                        this.records[1].getRevisionId());
        LafOlBlockContentRevisionBody testResult = dao.find(id);
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals bundle ", this.records[1].getBundle(), testResult.getBundle());
        org.junit.Assert.assertEquals(
                "expect equals bodyValue ",
                this.records[1].getBodyValue(),
                testResult.getBodyValue());
        org.junit.Assert.assertEquals(
                "expect equals bodySummary ",
                this.records[1].getBodySummary(),
                testResult.getBodySummary());
        org.junit.Assert.assertEquals(
                "expect equals bodyFormat ",
                this.records[1].getBodyFormat(),
                testResult.getBodyFormat());
    }
}
