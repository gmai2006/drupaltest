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
import com.drupal.test.dao.LafOlNodeRevisionBodyDao;
import com.drupal.test.entity.LafOlNodeRevisionBody;
import com.drupal.test.entity.LafOlNodeRevisionBodyId;

@Stateless
@Named("DefaultLafOlNodeRevisionBodyService")
public class DefaultLafOlNodeRevisionBodyService implements LafOlNodeRevisionBodyService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlNodeRevisionBodyDao dao;

  @Inject
  @Named("DefaultLafOlNodeRevisionBodyDao")
  public DefaultLafOlNodeRevisionBodyService(final LafOlNodeRevisionBodyDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeRevisionBody find(LafOlNodeRevisionBodyId id) {
    final LafOlNodeRevisionBody result = dao.find(id);
    logger.info("find(LafOlNodeRevisionBody) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlNodeRevisionBody> select(int maxResult) {
    final List<LafOlNodeRevisionBody> result = dao.select(maxResult);
    logger.info("select(LafOlNodeRevisionBody) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlNodeRevisionBody> selectAll() {
    final List<LafOlNodeRevisionBody> results = dao.selectAll();
    logger.info("selectAll(LafOlNodeRevisionBody) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeRevisionBody create(LafOlNodeRevisionBody bean) {
    requireNonNull(bean);
    logger.info("create(LafOlNodeRevisionBody={}) - entered bean ");

    final LafOlNodeRevisionBody result = dao.create(bean);

    logger.info("create(LafOlNodeRevisionBody) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeRevisionBody update(LafOlNodeRevisionBody bean) {
    requireNonNull(bean);
    logger.info("update(LafOlNodeRevisionBody={}) - entered bean ");

    final LafOlNodeRevisionBody result = dao.update(bean);

    logger.info("update(LafOlNodeRevisionBody) - exited - return value={} result ");
    return result;
  }
}
