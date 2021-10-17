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

import com.drupal.test.entity.LafOlNodeFieldData;
import com.drupal.test.entity.LafOlNodeFieldDataId;
import java.util.List;

public interface LafOlNodeFieldDataDao {
    /**
     * Retrieve all records LafOlNodeFieldData.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of LafOlNodeFieldData
     */
    public List<LafOlNodeFieldData> select(int maxResult);

    /**
     * Retrieve all records LafOlNodeFieldData.
     *
     * @return A list of LafOlNodeFieldData
     */
    public List<LafOlNodeFieldData> selectAll();

    /**
     * Find an entity.
     *
     * @param id An LafOlNodeFieldData id.
     * @return The same LafOlNodeFieldData.
     */
    public LafOlNodeFieldData find(LafOlNodeFieldDataId id);
    /**
     * Create an LafOlNodeFieldData.
     *
     * @param e the LafOlNodeFieldData.
     * @return The same LafOlNodeFieldData.
     */
    public LafOlNodeFieldData create(LafOlNodeFieldData e);

    /**
     * Update the LafOlNodeFieldData.
     *
     * @param e the LafOlNodeFieldData.
     * @return The same LafOlNodeFieldData.
     */
    public LafOlNodeFieldData update(LafOlNodeFieldData e);
}
