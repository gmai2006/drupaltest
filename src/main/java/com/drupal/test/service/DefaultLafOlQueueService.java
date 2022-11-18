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
import com.drupal.test.dao.LafOlQueueDao;
import com.drupal.test.entity.LafOlQueue;

@Stateless
@Named("DefaultLafOlQueueService")
public class DefaultLafOlQueueService implements LafOlQueueService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlQueueDao dao;

  @Inject
  @Named("DefaultLafOlQueueDao")
  public DefaultLafOlQueueService(final LafOlQueueDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlQueue find(java.lang.Integer id) {

    final LafOlQueue result = dao.find(id);
    logger.info("find(LafOlQueue) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlQueue> select(int maxResult) {
    final List<LafOlQueue> result = dao.select(maxResult);
    logger.info("select(LafOlQueue) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlQueue> selectAll() {
    final List<LafOlQueue> results = dao.selectAll();
    logger.info("selectAll(LafOlQueue) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlQueue create(LafOlQueue bean) {
    requireNonNull(bean);
    logger.info("create(LafOlQueue={}) - entered bean ");

    final LafOlQueue result = dao.create(bean);

    logger.info("create(LafOlQueue) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlQueue update(LafOlQueue bean) {
    requireNonNull(bean);
    logger.info("update(LafOlQueue={}) - entered bean ");

    final LafOlQueue result = dao.update(bean);

    logger.info("update(LafOlQueue) - exited - return value={} result ");
    return result;
  }
}
