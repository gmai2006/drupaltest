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

import com.drupal.test.entity.LafOlFileManaged;
import com.drupal.test.entity.LafOlFileManagedId;
import com.drupal.test.utils.ByteArrayToBase64TypeAdapter;
import com.drupal.test.utils.FileUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class LafOlFileManagedServiceTest {
    private static DefaultLafOlFileManagedService serviceMock;
    private static LafOlFileManaged[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultLafOlFileManagedService.class);
        String inputFile = "LafOlFileManaged.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, LafOlFileManaged[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        final LafOlFileManagedId id =
                new LafOlFileManagedId(records[0].getFid(), records[0].getUuid());
        when(serviceMock.find(id)).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        final LafOlFileManagedId id =
                new LafOlFileManagedId(records[0].getFid(), records[0].getUuid());
        LafOlFileManaged testResult = serviceMock.find(id);
        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals langcode ", records[0].getLangcode(), testResult.getLangcode());
        org.junit.Assert.assertTrue(
                "expect equals uid ", records[0].getUid() == testResult.getUid());
        org.junit.Assert.assertEquals(
                "expect equals filename ", records[0].getFilename(), testResult.getFilename());
        org.junit.Assert.assertEquals(
                "expect equals uri ", records[0].getUri(), testResult.getUri());
        org.junit.Assert.assertEquals(
                "expect equals filemime ", records[0].getFilemime(), testResult.getFilemime());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals created ", records[0].getCreated() == testResult.getCreated());
        org.junit.Assert.assertTrue(
                "expect equals changed ", records[0].getChanged() == testResult.getChanged());
    }
}
