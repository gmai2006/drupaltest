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
import com.drupal.test.dao.LafOlSessionsDao;
import com.drupal.test.entity.LafOlSessions;

@Stateless
@Named("DefaultLafOlSessionsService")
public class DefaultLafOlSessionsService implements LafOlSessionsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlSessionsDao dao;

  @Inject
  @Named("DefaultLafOlSessionsDao")
  public DefaultLafOlSessionsService(final LafOlSessionsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlSessions find(java.lang.String id) {

    final LafOlSessions result = dao.find(id);
    logger.info("find(LafOlSessions) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlSessions> select(int maxResult) {
    final List<LafOlSessions> result = dao.select(maxResult);
    logger.info("select(LafOlSessions) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlSessions> selectAll() {
    final List<LafOlSessions> results = dao.selectAll();
    logger.info("selectAll(LafOlSessions) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlSessions create(LafOlSessions bean) {
    requireNonNull(bean);
    logger.info("create(LafOlSessions={}) - entered bean ");

    final LafOlSessions result = dao.create(bean);

    logger.info("create(LafOlSessions) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlSessions update(LafOlSessions bean) {
    requireNonNull(bean);
    logger.info("update(LafOlSessions={}) - entered bean ");

    final LafOlSessions result = dao.update(bean);

    logger.info("update(LafOlSessions) - exited - return value={} result ");
    return result;
  }
}
