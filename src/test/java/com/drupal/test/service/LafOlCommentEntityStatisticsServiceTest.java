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

import com.drupal.test.entity.LafOlCommentEntityStatistics;
import com.drupal.test.entity.LafOlCommentEntityStatisticsId;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;
import com.drupal.test.utils.FileUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class LafOlCommentEntityStatisticsServiceTest {
    private static DefaultLafOlCommentEntityStatisticsService serviceMock;
    private static LafOlCommentEntityStatistics[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultLafOlCommentEntityStatisticsService.class);
        String inputFile = "LafOlCommentEntityStatistics.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, LafOlCommentEntityStatistics[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        final LafOlCommentEntityStatisticsId id =
                new LafOlCommentEntityStatisticsId(
                        records[0].getEntityType(),
                        records[0].getEntityId(),
                        records[0].getFieldName());
        when(serviceMock.find(id)).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        final LafOlCommentEntityStatisticsId id =
                new LafOlCommentEntityStatisticsId(
                        records[0].getEntityType(),
                        records[0].getEntityId(),
                        records[0].getFieldName());
        LafOlCommentEntityStatistics testResult = serviceMock.find(id);
        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals cid ", records[0].getCid() == testResult.getCid());
        org.junit.Assert.assertTrue(
                "expect equals lastCommentTimestamp ",
                records[0].getLastCommentTimestamp() == testResult.getLastCommentTimestamp());
        org.junit.Assert.assertEquals(
                "expect equals lastCommentName ",
                records[0].getLastCommentName(),
                testResult.getLastCommentName());
        org.junit.Assert.assertTrue(
                "expect equals lastCommentUid ",
                records[0].getLastCommentUid() == testResult.getLastCommentUid());
        org.junit.Assert.assertTrue(
                "expect equals commentCount ",
                records[0].getCommentCount() == testResult.getCommentCount());
    }
}
