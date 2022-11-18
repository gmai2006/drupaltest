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
import com.drupal.test.dao.LafOlBlockContentBodyDao;
import com.drupal.test.entity.LafOlBlockContentBody;
import com.drupal.test.entity.LafOlBlockContentBodyId;

@Stateless
@Named("DefaultLafOlBlockContentBodyService")
public class DefaultLafOlBlockContentBodyService implements LafOlBlockContentBodyService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlBlockContentBodyDao dao;

  @Inject
  @Named("DefaultLafOlBlockContentBodyDao")
  public DefaultLafOlBlockContentBodyService(final LafOlBlockContentBodyDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBlockContentBody find(LafOlBlockContentBodyId id) {
    final LafOlBlockContentBody result = dao.find(id);
    logger.info("find(LafOlBlockContentBody) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlBlockContentBody> select(int maxResult) {
    final List<LafOlBlockContentBody> result = dao.select(maxResult);
    logger.info("select(LafOlBlockContentBody) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlBlockContentBody> selectAll() {
    final List<LafOlBlockContentBody> results = dao.selectAll();
    logger.info("selectAll(LafOlBlockContentBody) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBlockContentBody create(LafOlBlockContentBody bean) {
    requireNonNull(bean);
    logger.info("create(LafOlBlockContentBody={}) - entered bean ");

    final LafOlBlockContentBody result = dao.create(bean);

    logger.info("create(LafOlBlockContentBody) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBlockContentBody update(LafOlBlockContentBody bean) {
    requireNonNull(bean);
    logger.info("update(LafOlBlockContentBody={}) - entered bean ");

    final LafOlBlockContentBody result = dao.update(bean);

    logger.info("update(LafOlBlockContentBody) - exited - return value={} result ");
    return result;
  }
}
