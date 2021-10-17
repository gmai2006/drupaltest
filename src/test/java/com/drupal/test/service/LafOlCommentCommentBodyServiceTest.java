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

import com.drupal.test.entity.LafOlCommentCommentBody;
import com.drupal.test.entity.LafOlCommentCommentBodyId;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;
import com.drupal.test.utils.FileUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class LafOlCommentCommentBodyServiceTest {
    private static DefaultLafOlCommentCommentBodyService serviceMock;
    private static LafOlCommentCommentBody[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultLafOlCommentCommentBodyService.class);
        String inputFile = "LafOlCommentCommentBody.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, LafOlCommentCommentBody[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        final LafOlCommentCommentBodyId id =
                new LafOlCommentCommentBodyId(
                        records[0].getLangcode(),
                        records[0].getDeleted(),
                        records[0].getDelta(),
                        records[0].getEntityId());
        when(serviceMock.find(id)).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        final LafOlCommentCommentBodyId id =
                new LafOlCommentCommentBodyId(
                        records[0].getLangcode(),
                        records[0].getDeleted(),
                        records[0].getDelta(),
                        records[0].getEntityId());
        LafOlCommentCommentBody testResult = serviceMock.find(id);
        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals bundle ", records[0].getBundle(), testResult.getBundle());
        org.junit.Assert.assertTrue(
                "expect equals revisionId ",
                records[0].getRevisionId() == testResult.getRevisionId());
        org.junit.Assert.assertEquals(
                "expect equals commentBodyValue ",
                records[0].getCommentBodyValue(),
                testResult.getCommentBodyValue());
        org.junit.Assert.assertEquals(
                "expect equals commentBodyFormat ",
                records[0].getCommentBodyFormat(),
                testResult.getCommentBodyFormat());
    }
}
