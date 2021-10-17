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

import com.drupal.test.dao.JpaDao;
import com.drupal.test.dao.StandaloneJpaDao;
import com.drupal.test.entity.LafOlNodeRevisionFieldImage;
import com.drupal.test.entity.LafOlNodeRevisionFieldImageId;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;
import com.drupal.test.utils.FileUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.CDL;
import org.json.JSONArray;
import org.junit.BeforeClass;
import org.junit.Test;

public class LafOlNodeRevisionFieldImageHandlerTestIt {
    static final String inputFile = "LafOlNodeRevisionFieldImage.json";
    static LafOlNodeRevisionFieldImageHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private LafOlNodeRevisionFieldImage[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new LafOlNodeRevisionFieldImageHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, LafOlNodeRevisionFieldImage[].class);
        assertEquals("match count", count, records.length);
        final LafOlNodeRevisionFieldImageId id =
                new LafOlNodeRevisionFieldImageId(
                        this.records[0].getLangcode(),
                        this.records[0].getDeleted(),
                        this.records[0].getDelta(),
                        this.records[0].getEntityId(),
                        this.records[0].getRevisionId());
        LafOlNodeRevisionFieldImage testResult = jpa.find(LafOlNodeRevisionFieldImage.class, id);
        assertEquals("expect equals bundle ", this.records[0].getBundle(), testResult.getBundle());
        org.junit.Assert.assertEquals(
                "expect equals fieldImageTargetId ",
                this.records[0].getFieldImageTargetId(),
                testResult.getFieldImageTargetId());
        assertEquals(
                "expect equals fieldImageAlt ",
                this.records[0].getFieldImageAlt(),
                testResult.getFieldImageAlt());
        assertEquals(
                "expect equals fieldImageTitle ",
                this.records[0].getFieldImageTitle(),
                testResult.getFieldImageTitle());
        org.junit.Assert.assertEquals(
                "expect equals fieldImageWidth ",
                this.records[0].getFieldImageWidth(),
                testResult.getFieldImageWidth());
        org.junit.Assert.assertEquals(
                "expect equals fieldImageHeight ",
                this.records[0].getFieldImageHeight(),
                testResult.getFieldImageHeight());

        // cleanup
        inputStream.close();
        json = null;
        records = null;
    }

    /**
     * Construct a delimiter file from a json file.
     *
     * @param inputFile the json file.
     * @param charset default charset.
     * @return
     */
    private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
        try {
            final File tempFile = File.createTempFile(inputFile, ".txt");
            tempFile.deleteOnExit();
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            JSONArray docs = new JSONArray(json);
            String csv = CDL.toString(docs);
            org.apache.commons.io.FileUtils.writeStringToFile(
                    tempFile, csv, Charset.defaultCharset());
            return tempFile;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
