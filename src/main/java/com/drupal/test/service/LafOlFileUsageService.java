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

import com.drupal.test.entity.LafOlFileUsage;
import com.drupal.test.entity.LafOlFileUsageId;
import java.util.List;

public interface LafOlFileUsageService {
    public LafOlFileUsage find(LafOlFileUsageId id);
    /**
     * Select a list of LafOlFileUsage based on a given maximum number of returning records.
     *
     * @param maxResult : a specified maximum number of returned records.
     * @return LafOlFileUsage records.
     */
    public List<LafOlFileUsage> select(int maxResult);

    /**
     * Select all LafOlFileUsage.
     *
     * @return all LafOlFileUsage records.
     */
    public List<LafOlFileUsage> selectAll();

    /**
     * Create LafOlFileUsage.
     *
     * @param bean The LafOlFileUsage.
     * @return The LafOlFileUsage.
     */
    public LafOlFileUsage create(LafOlFileUsage bean);

    /**
     * Update a LafOlFileUsage.
     *
     * @param bean - The LafOlFileUsage.
     * @return LafOlFileUsage.
     */
    public LafOlFileUsage update(LafOlFileUsage bean);
}
