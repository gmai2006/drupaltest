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
import com.drupal.test.dao.LafOlLocalesTargetDao;
import com.drupal.test.entity.LafOlLocalesTarget;
import com.drupal.test.entity.LafOlLocalesTargetId;

@Stateless
@Named("DefaultLafOlLocalesTargetService")
public class DefaultLafOlLocalesTargetService implements LafOlLocalesTargetService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlLocalesTargetDao dao;

  @Inject
  @Named("DefaultLafOlLocalesTargetDao")
  public DefaultLafOlLocalesTargetService(final LafOlLocalesTargetDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlLocalesTarget find(LafOlLocalesTargetId id) {
    final LafOlLocalesTarget result = dao.find(id);
    logger.info("find(LafOlLocalesTarget) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlLocalesTarget> select(int maxResult) {
    final List<LafOlLocalesTarget> result = dao.select(maxResult);
    logger.info("select(LafOlLocalesTarget) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlLocalesTarget> selectAll() {
    final List<LafOlLocalesTarget> results = dao.selectAll();
    logger.info("selectAll(LafOlLocalesTarget) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlLocalesTarget create(LafOlLocalesTarget bean) {
    requireNonNull(bean);
    logger.info("create(LafOlLocalesTarget={}) - entered bean ");

    final LafOlLocalesTarget result = dao.create(bean);

    logger.info("create(LafOlLocalesTarget) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlLocalesTarget update(LafOlLocalesTarget bean) {
    requireNonNull(bean);
    logger.info("update(LafOlLocalesTarget={}) - entered bean ");

    final LafOlLocalesTarget result = dao.update(bean);

    logger.info("update(LafOlLocalesTarget) - exited - return value={} result ");
    return result;
  }
}
