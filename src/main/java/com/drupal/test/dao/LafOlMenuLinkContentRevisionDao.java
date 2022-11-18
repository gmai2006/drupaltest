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
import com.drupal.test.entity.LafOlMenuLinkContentRevision;

public interface LafOlMenuLinkContentRevisionDao {
  /**
   * Retrieve all records LafOlMenuLinkContentRevision.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of LafOlMenuLinkContentRevision
   */
  public List<LafOlMenuLinkContentRevision> select(int maxResult);

  /**
   * Retrieve all records LafOlMenuLinkContentRevision.
   *
   * @return A list of LafOlMenuLinkContentRevision
   */
  public List<LafOlMenuLinkContentRevision> selectAll();

  /**
   * Find an entity.
   *
   * @param id An LafOlMenuLinkContentRevision id.
   * @return The same LafOlMenuLinkContentRevision.
   */
  public LafOlMenuLinkContentRevision find(java.lang.Integer id);

  /**
   * Create an LafOlMenuLinkContentRevision.
   *
   * @param e the LafOlMenuLinkContentRevision.
   * @return The same LafOlMenuLinkContentRevision.
   */
  public LafOlMenuLinkContentRevision create(LafOlMenuLinkContentRevision e);

  /**
   * Update the LafOlMenuLinkContentRevision.
   *
   * @param e the LafOlMenuLinkContentRevision.
   * @return The same LafOlMenuLinkContentRevision.
   */
  public LafOlMenuLinkContentRevision update(LafOlMenuLinkContentRevision e);
}
