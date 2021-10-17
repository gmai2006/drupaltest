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

import com.drupal.test.entity.LafOlLocalesTarget;
import com.drupal.test.entity.LafOlLocalesTargetId;
import java.util.List;

public interface LafOlLocalesTargetDao {
    /**
     * Retrieve all records LafOlLocalesTarget.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of LafOlLocalesTarget
     */
    public List<LafOlLocalesTarget> select(int maxResult);

    /**
     * Retrieve all records LafOlLocalesTarget.
     *
     * @return A list of LafOlLocalesTarget
     */
    public List<LafOlLocalesTarget> selectAll();

    /**
     * Find an entity.
     *
     * @param id An LafOlLocalesTarget id.
     * @return The same LafOlLocalesTarget.
     */
    public LafOlLocalesTarget find(LafOlLocalesTargetId id);
    /**
     * Create an LafOlLocalesTarget.
     *
     * @param e the LafOlLocalesTarget.
     * @return The same LafOlLocalesTarget.
     */
    public LafOlLocalesTarget create(LafOlLocalesTarget e);

    /**
     * Update the LafOlLocalesTarget.
     *
     * @param e the LafOlLocalesTarget.
     * @return The same LafOlLocalesTarget.
     */
    public LafOlLocalesTarget update(LafOlLocalesTarget e);
}
