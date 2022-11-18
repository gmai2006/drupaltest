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
import com.drupal.test.dao.LafOlMenuLinkContentRevisionDao;
import com.drupal.test.entity.LafOlMenuLinkContentRevision;

@Stateless
@Named("DefaultLafOlMenuLinkContentRevisionService")
public class DefaultLafOlMenuLinkContentRevisionService
    implements LafOlMenuLinkContentRevisionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlMenuLinkContentRevisionDao dao;

  @Inject
  @Named("DefaultLafOlMenuLinkContentRevisionDao")
  public DefaultLafOlMenuLinkContentRevisionService(final LafOlMenuLinkContentRevisionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlMenuLinkContentRevision find(java.lang.Integer id) {

    final LafOlMenuLinkContentRevision result = dao.find(id);
    logger.info("find(LafOlMenuLinkContentRevision) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlMenuLinkContentRevision> select(int maxResult) {
    final List<LafOlMenuLinkContentRevision> result = dao.select(maxResult);
    logger.info("select(LafOlMenuLinkContentRevision) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlMenuLinkContentRevision> selectAll() {
    final List<LafOlMenuLinkContentRevision> results = dao.selectAll();
    logger.info("selectAll(LafOlMenuLinkContentRevision) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlMenuLinkContentRevision create(LafOlMenuLinkContentRevision bean) {
    requireNonNull(bean);
    logger.info("create(LafOlMenuLinkContentRevision={}) - entered bean ");

    final LafOlMenuLinkContentRevision result = dao.create(bean);

    logger.info("create(LafOlMenuLinkContentRevision) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlMenuLinkContentRevision update(LafOlMenuLinkContentRevision bean) {
    requireNonNull(bean);
    logger.info("update(LafOlMenuLinkContentRevision={}) - entered bean ");

    final LafOlMenuLinkContentRevision result = dao.update(bean);

    logger.info("update(LafOlMenuLinkContentRevision) - exited - return value={} result ");
    return result;
  }
}
