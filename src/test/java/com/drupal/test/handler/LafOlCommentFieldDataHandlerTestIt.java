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
import com.drupal.test.entity.LafOlCommentFieldData;
import com.drupal.test.entity.LafOlCommentFieldDataId;
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

public class LafOlCommentFieldDataHandlerTestIt {
    static final String inputFile = "LafOlCommentFieldData.json";
    static LafOlCommentFieldDataHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private LafOlCommentFieldData[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new LafOlCommentFieldDataHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, LafOlCommentFieldData[].class);
        assertEquals("match count", count, records.length);
        final LafOlCommentFieldDataId id =
                new LafOlCommentFieldDataId(
                        this.records[0].getLangcode(), this.records[0].getCid());
        LafOlCommentFieldData testResult = jpa.find(LafOlCommentFieldData.class, id);
        assertEquals(
                "expect equals commentType ",
                this.records[0].getCommentType(),
                testResult.getCommentType());
        org.junit.Assert.assertEquals(
                "expect equals status ", this.records[0].getStatus(), testResult.getStatus());
        org.junit.Assert.assertEquals(
                "expect equals uid ", this.records[0].getUid(), testResult.getUid());
        org.junit.Assert.assertEquals(
                "expect equals pid ", this.records[0].getPid(), testResult.getPid());
        org.junit.Assert.assertEquals(
                "expect equals entityId ", this.records[0].getEntityId(), testResult.getEntityId());
        assertEquals(
                "expect equals subject ", this.records[0].getSubject(), testResult.getSubject());
        assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
        assertEquals("expect equals mail ", this.records[0].getMail(), testResult.getMail());
        assertEquals(
                "expect equals homepage ", this.records[0].getHomepage(), testResult.getHomepage());
        assertEquals(
                "expect equals hostname ", this.records[0].getHostname(), testResult.getHostname());
        org.junit.Assert.assertEquals(
                "expect equals created ", this.records[0].getCreated(), testResult.getCreated());
        org.junit.Assert.assertEquals(
                "expect equals changed ", this.records[0].getChanged(), testResult.getChanged());
        assertEquals("expect equals thread ", this.records[0].getThread(), testResult.getThread());
        assertEquals(
                "expect equals entityType ",
                this.records[0].getEntityType(),
                testResult.getEntityType());
        assertEquals(
                "expect equals fieldName ",
                this.records[0].getFieldName(),
                testResult.getFieldName());
        org.junit.Assert.assertEquals(
                "expect equals defaultLangcode ",
                this.records[0].getDefaultLangcode(),
                testResult.getDefaultLangcode());

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
