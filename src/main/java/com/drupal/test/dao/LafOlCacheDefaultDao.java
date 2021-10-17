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

import com.drupal.test.entity.LafOlCacheDefault;
import java.util.List;

public interface LafOlCacheDefaultDao {
    /**
     * Retrieve all records LafOlCacheDefault.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of LafOlCacheDefault
     */
    public List<LafOlCacheDefault> select(int maxResult);

    /**
     * Retrieve all records LafOlCacheDefault.
     *
     * @return A list of LafOlCacheDefault
     */
    public List<LafOlCacheDefault> selectAll();

    /**
     * Find an entity.
     *
     * @param id An LafOlCacheDefault id.
     * @return The same LafOlCacheDefault.
     */
    public LafOlCacheDefault find(java.lang.String id);

    /**
     * Create an LafOlCacheDefault.
     *
     * @param e the LafOlCacheDefault.
     * @return The same LafOlCacheDefault.
     */
    public LafOlCacheDefault create(LafOlCacheDefault e);

    /**
     * Update the LafOlCacheDefault.
     *
     * @param e the LafOlCacheDefault.
     * @return The same LafOlCacheDefault.
     */
    public LafOlCacheDefault update(LafOlCacheDefault e);
}