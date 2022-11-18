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
import com.drupal.test.dao.LafOlNodeFieldRevisionDao;
import com.drupal.test.entity.LafOlNodeFieldRevision;
import com.drupal.test.entity.LafOlNodeFieldRevisionId;

@Stateless
@Named("DefaultLafOlNodeFieldRevisionService")
public class DefaultLafOlNodeFieldRevisionService implements LafOlNodeFieldRevisionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlNodeFieldRevisionDao dao;

  @Inject
  @Named("DefaultLafOlNodeFieldRevisionDao")
  public DefaultLafOlNodeFieldRevisionService(final LafOlNodeFieldRevisionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeFieldRevision find(LafOlNodeFieldRevisionId id) {
    final LafOlNodeFieldRevision result = dao.find(id);
    logger.info("find(LafOlNodeFieldRevision) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlNodeFieldRevision> select(int maxResult) {
    final List<LafOlNodeFieldRevision> result = dao.select(maxResult);
    logger.info("select(LafOlNodeFieldRevision) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlNodeFieldRevision> selectAll() {
    final List<LafOlNodeFieldRevision> results = dao.selectAll();
    logger.info("selectAll(LafOlNodeFieldRevision) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeFieldRevision create(LafOlNodeFieldRevision bean) {
    requireNonNull(bean);
    logger.info("create(LafOlNodeFieldRevision={}) - entered bean ");

    final LafOlNodeFieldRevision result = dao.create(bean);

    logger.info("create(LafOlNodeFieldRevision) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeFieldRevision update(LafOlNodeFieldRevision bean) {
    requireNonNull(bean);
    logger.info("update(LafOlNodeFieldRevision={}) - entered bean ");

    final LafOlNodeFieldRevision result = dao.update(bean);

    logger.info("update(LafOlNodeFieldRevision) - exited - return value={} result ");
    return result;
  }
}
