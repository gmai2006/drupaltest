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

import com.drupal.test.entity.LafOlShortcutSetUsers;
import java.util.List;

public interface LafOlShortcutSetUsersService {
    public LafOlShortcutSetUsers find(java.lang.Integer id);

    /**
     * Select a list of LafOlShortcutSetUsers based on a given maximum number of returning records.
     *
     * @param maxResult : a specified maximum number of returned records.
     * @return LafOlShortcutSetUsers records.
     */
    public List<LafOlShortcutSetUsers> select(int maxResult);

    /**
     * Select all LafOlShortcutSetUsers.
     *
     * @return all LafOlShortcutSetUsers records.
     */
    public List<LafOlShortcutSetUsers> selectAll();

    /**
     * Create LafOlShortcutSetUsers.
     *
     * @param bean The LafOlShortcutSetUsers.
     * @return The LafOlShortcutSetUsers.
     */
    public LafOlShortcutSetUsers create(LafOlShortcutSetUsers bean);

    /**
     * Update a LafOlShortcutSetUsers.
     *
     * @param bean - The LafOlShortcutSetUsers.
     * @return LafOlShortcutSetUsers.
     */
    public LafOlShortcutSetUsers update(LafOlShortcutSetUsers bean);
}
