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

import com.drupal.test.entity.LafOlShortcut;
import com.drupal.test.entity.LafOlShortcutId;
import java.util.List;

public interface LafOlShortcutDao {
    /**
     * Retrieve all records LafOlShortcut.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of LafOlShortcut
     */
    public List<LafOlShortcut> select(int maxResult);

    /**
     * Retrieve all records LafOlShortcut.
     *
     * @return A list of LafOlShortcut
     */
    public List<LafOlShortcut> selectAll();

    /**
     * Find an entity.
     *
     * @param id An LafOlShortcut id.
     * @return The same LafOlShortcut.
     */
    public LafOlShortcut find(LafOlShortcutId id);
    /**
     * Create an LafOlShortcut.
     *
     * @param e the LafOlShortcut.
     * @return The same LafOlShortcut.
     */
    public LafOlShortcut create(LafOlShortcut e);

    /**
     * Update the LafOlShortcut.
     *
     * @param e the LafOlShortcut.
     * @return The same LafOlShortcut.
     */
    public LafOlShortcut update(LafOlShortcut e);
}
