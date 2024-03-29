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
import com.drupal.test.dao.LafOlMenuLinkContentFieldRevisionDao;
import com.drupal.test.entity.LafOlMenuLinkContentFieldRevision;
import com.drupal.test.entity.LafOlMenuLinkContentFieldRevisionId;

@Stateless
@Named("DefaultLafOlMenuLinkContentFieldRevisionService")
public class DefaultLafOlMenuLinkContentFieldRevisionService
    implements LafOlMenuLinkContentFieldRevisionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlMenuLinkContentFieldRevisionDao dao;

  @Inject
  @Named("DefaultLafOlMenuLinkContentFieldRevisionDao")
  public DefaultLafOlMenuLinkContentFieldRevisionService(
      final LafOlMenuLinkContentFieldRevisionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlMenuLinkContentFieldRevision find(LafOlMenuLinkContentFieldRevisionId id) {
    final LafOlMenuLinkContentFieldRevision result = dao.find(id);
    logger.info("find(LafOlMenuLinkContentFieldRevision) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlMenuLinkContentFieldRevision> select(int maxResult) {
    final List<LafOlMenuLinkContentFieldRevision> result = dao.select(maxResult);
    logger.info("select(LafOlMenuLinkContentFieldRevision) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlMenuLinkContentFieldRevision> selectAll() {
    final List<LafOlMenuLinkContentFieldRevision> results = dao.selectAll();
    logger.info("selectAll(LafOlMenuLinkContentFieldRevision) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlMenuLinkContentFieldRevision create(LafOlMenuLinkContentFieldRevision bean) {
    requireNonNull(bean);
    logger.info("create(LafOlMenuLinkContentFieldRevision={}) - entered bean ");

    final LafOlMenuLinkContentFieldRevision result = dao.create(bean);

    logger.info("create(LafOlMenuLinkContentFieldRevision) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlMenuLinkContentFieldRevision update(LafOlMenuLinkContentFieldRevision bean) {
    requireNonNull(bean);
    logger.info("update(LafOlMenuLinkContentFieldRevision={}) - entered bean ");

    final LafOlMenuLinkContentFieldRevision result = dao.update(bean);

    logger.info("update(LafOlMenuLinkContentFieldRevision) - exited - return value={} result ");
    return result;
  }
}
