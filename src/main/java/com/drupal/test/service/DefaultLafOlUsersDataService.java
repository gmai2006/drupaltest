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

import static java.util.Objects.requireNonNull;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import com.drupal.test.dao.LafOlUsersDataDao;
import com.drupal.test.entity.LafOlUsersData;
import com.drupal.test.entity.LafOlUsersDataId;

@Stateless
@Named("DefaultLafOlUsersDataService")
public class DefaultLafOlUsersDataService implements LafOlUsersDataService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlUsersDataDao dao;

  @Inject
  @Named("DefaultLafOlUsersDataDao")
  public DefaultLafOlUsersDataService(final LafOlUsersDataDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlUsersData find(LafOlUsersDataId id) {
    final LafOlUsersData result = dao.find(id);
    logger.info("find(LafOlUsersData) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlUsersData> select(int maxResult) {
    final List<LafOlUsersData> result = dao.select(maxResult);
    logger.info("select(LafOlUsersData) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlUsersData> selectAll() {
    final List<LafOlUsersData> results = dao.selectAll();
    logger.info("selectAll(LafOlUsersData) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlUsersData create(LafOlUsersData bean) {
    requireNonNull(bean);
    logger.info("create(LafOlUsersData={}) - entered bean ");

    final LafOlUsersData result = dao.create(bean);

    logger.info("create(LafOlUsersData) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlUsersData update(LafOlUsersData bean) {
    requireNonNull(bean);
    logger.info("update(LafOlUsersData={}) - entered bean ");

    final LafOlUsersData result = dao.update(bean);

    logger.info("update(LafOlUsersData) - exited - return value={} result ");
    return result;
  }
}
