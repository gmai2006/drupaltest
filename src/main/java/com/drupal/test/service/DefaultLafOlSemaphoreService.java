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
import com.drupal.test.dao.LafOlSemaphoreDao;
import com.drupal.test.entity.LafOlSemaphore;

@Stateless
@Named("DefaultLafOlSemaphoreService")
public class DefaultLafOlSemaphoreService implements LafOlSemaphoreService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlSemaphoreDao dao;

  @Inject
  @Named("DefaultLafOlSemaphoreDao")
  public DefaultLafOlSemaphoreService(final LafOlSemaphoreDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlSemaphore find(java.lang.String id) {

    final LafOlSemaphore result = dao.find(id);
    logger.info("find(LafOlSemaphore) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlSemaphore> select(int maxResult) {
    final List<LafOlSemaphore> result = dao.select(maxResult);
    logger.info("select(LafOlSemaphore) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlSemaphore> selectAll() {
    final List<LafOlSemaphore> results = dao.selectAll();
    logger.info("selectAll(LafOlSemaphore) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlSemaphore create(LafOlSemaphore bean) {
    requireNonNull(bean);
    logger.info("create(LafOlSemaphore={}) - entered bean ");

    final LafOlSemaphore result = dao.create(bean);

    logger.info("create(LafOlSemaphore) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlSemaphore update(LafOlSemaphore bean) {
    requireNonNull(bean);
    logger.info("update(LafOlSemaphore={}) - entered bean ");

    final LafOlSemaphore result = dao.update(bean);

    logger.info("update(LafOlSemaphore) - exited - return value={} result ");
    return result;
  }
}
