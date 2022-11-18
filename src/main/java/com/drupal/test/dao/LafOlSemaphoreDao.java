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

import java.util.List;
import com.drupal.test.entity.LafOlSemaphore;

public interface LafOlSemaphoreDao {
  /**
   * Retrieve all records LafOlSemaphore.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of LafOlSemaphore
   */
  public List<LafOlSemaphore> select(int maxResult);

  /**
   * Retrieve all records LafOlSemaphore.
   *
   * @return A list of LafOlSemaphore
   */
  public List<LafOlSemaphore> selectAll();

  /**
   * Find an entity.
   *
   * @param id An LafOlSemaphore id.
   * @return The same LafOlSemaphore.
   */
  public LafOlSemaphore find(java.lang.String id);

  /**
   * Create an LafOlSemaphore.
   *
   * @param e the LafOlSemaphore.
   * @return The same LafOlSemaphore.
   */
  public LafOlSemaphore create(LafOlSemaphore e);

  /**
   * Update the LafOlSemaphore.
   *
   * @param e the LafOlSemaphore.
   * @return The same LafOlSemaphore.
   */
  public LafOlSemaphore update(LafOlSemaphore e);
}
