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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.drupal.test.entity.LafOlCommentFieldData;
import com.drupal.test.entity.LafOlCommentFieldDataId;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;
import com.drupal.test.utils.FileUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class LafOlCommentFieldDataServiceTest {
    private static DefaultLafOlCommentFieldDataService serviceMock;
    private static LafOlCommentFieldData[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultLafOlCommentFieldDataService.class);
        String inputFile = "LafOlCommentFieldData.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, LafOlCommentFieldData[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        final LafOlCommentFieldDataId id =
                new LafOlCommentFieldDataId(records[0].getLangcode(), records[0].getCid());
        when(serviceMock.find(id)).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        final LafOlCommentFieldDataId id =
                new LafOlCommentFieldDataId(records[0].getLangcode(), records[0].getCid());
        LafOlCommentFieldData testResult = serviceMock.find(id);
        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals commentType ",
                records[0].getCommentType(),
                testResult.getCommentType());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals uid ", records[0].getUid() == testResult.getUid());
        org.junit.Assert.assertTrue(
                "expect equals pid ", records[0].getPid() == testResult.getPid());
        org.junit.Assert.assertTrue(
                "expect equals entityId ", records[0].getEntityId() == testResult.getEntityId());
        org.junit.Assert.assertEquals(
                "expect equals subject ", records[0].getSubject(), testResult.getSubject());
        org.junit.Assert.assertEquals(
                "expect equals name ", records[0].getName(), testResult.getName());
        org.junit.Assert.assertEquals(
                "expect equals mail ", records[0].getMail(), testResult.getMail());
        org.junit.Assert.assertEquals(
                "expect equals homepage ", records[0].getHomepage(), testResult.getHomepage());
        org.junit.Assert.assertEquals(
                "expect equals hostname ", records[0].getHostname(), testResult.getHostname());
        org.junit.Assert.assertTrue(
                "expect equals created ", records[0].getCreated() == testResult.getCreated());
        org.junit.Assert.assertTrue(
                "expect equals changed ", records[0].getChanged() == testResult.getChanged());
        org.junit.Assert.assertEquals(
                "expect equals thread ", records[0].getThread(), testResult.getThread());
        org.junit.Assert.assertEquals(
                "expect equals entityType ",
                records[0].getEntityType(),
                testResult.getEntityType());
        org.junit.Assert.assertEquals(
                "expect equals fieldName ", records[0].getFieldName(), testResult.getFieldName());
        org.junit.Assert.assertTrue(
                "expect equals defaultLangcode ",
                records[0].getDefaultLangcode() == testResult.getDefaultLangcode());
    }
}
