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
import com.drupal.test.dao.LafOlBatchDao;
import com.drupal.test.entity.LafOlBatch;

@Stateless
@Named("DefaultLafOlBatchService")
public class DefaultLafOlBatchService implements LafOlBatchService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlBatchDao dao;

  @Inject
  @Named("DefaultLafOlBatchDao")
  public DefaultLafOlBatchService(final LafOlBatchDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBatch find(java.lang.Integer id) {

    final LafOlBatch result = dao.find(id);
    logger.info("find(LafOlBatch) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlBatch> select(int maxResult) {
    final List<LafOlBatch> result = dao.select(maxResult);
    logger.info("select(LafOlBatch) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlBatch> selectAll() {
    final List<LafOlBatch> results = dao.selectAll();
    logger.info("selectAll(LafOlBatch) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBatch create(LafOlBatch bean) {
    requireNonNull(bean);
    logger.info("create(LafOlBatch={}) - entered bean ");

    final LafOlBatch result = dao.create(bean);

    logger.info("create(LafOlBatch) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBatch update(LafOlBatch bean) {
    requireNonNull(bean);
    logger.info("update(LafOlBatch={}) - entered bean ");

    final LafOlBatch result = dao.update(bean);

    logger.info("update(LafOlBatch) - exited - return value={} result ");
    return result;
  }
}
