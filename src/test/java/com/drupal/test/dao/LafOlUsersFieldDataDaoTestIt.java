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

import com.drupal.test.entity.LafOlUsersFieldData;
import com.drupal.test.entity.LafOlUsersFieldDataId;
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

public class LafOlUsersFieldDataDaoTestIt {
    static final String inputFile = "LafOlUsersFieldData.json";
    static LafOlUsersFieldDataDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private LafOlUsersFieldData[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultLafOlUsersFieldDataDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, LafOlUsersFieldData[].class);
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
        final LafOlUsersFieldDataId id =
                new LafOlUsersFieldDataId(
                        this.records[1].getUid(),
                        this.records[1].getLangcode(),
                        this.records[1].getName());
        LafOlUsersFieldData testResult = dao.find(id);
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals preferredLangcode ",
                this.records[1].getPreferredLangcode(),
                testResult.getPreferredLangcode());
        org.junit.Assert.assertEquals(
                "expect equals preferredAdminLangcode ",
                this.records[1].getPreferredAdminLangcode(),
                testResult.getPreferredAdminLangcode());
        org.junit.Assert.assertEquals(
                "expect equals pass ", this.records[1].getPass(), testResult.getPass());
        org.junit.Assert.assertEquals(
                "expect equals mail ", this.records[1].getMail(), testResult.getMail());
        org.junit.Assert.assertEquals(
                "expect equals timezone ", this.records[1].getTimezone(), testResult.getTimezone());
        org.junit.Assert.assertTrue(
                "expect equals status ", this.records[1].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals created ", this.records[1].getCreated() == testResult.getCreated());
        org.junit.Assert.assertTrue(
                "expect equals changed ", this.records[1].getChanged() == testResult.getChanged());
        org.junit.Assert.assertTrue(
                "expect equals access ", this.records[1].getAccess() == testResult.getAccess());
        org.junit.Assert.assertTrue(
                "expect equals login ", this.records[1].getLogin() == testResult.getLogin());
        org.junit.Assert.assertEquals(
                "expect equals init ", this.records[1].getInit(), testResult.getInit());
        org.junit.Assert.assertTrue(
                "expect equals defaultLangcode ",
                this.records[1].getDefaultLangcode() == testResult.getDefaultLangcode());
    }
}
