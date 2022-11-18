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
import com.drupal.test.dao.LafOlBlockContentDao;
import com.drupal.test.entity.LafOlBlockContent;
import com.drupal.test.entity.LafOlBlockContentId;

@Stateless
@Named("DefaultLafOlBlockContentService")
public class DefaultLafOlBlockContentService implements LafOlBlockContentService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlBlockContentDao dao;

  @Inject
  @Named("DefaultLafOlBlockContentDao")
  public DefaultLafOlBlockContentService(final LafOlBlockContentDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBlockContent find(LafOlBlockContentId id) {
    final LafOlBlockContent result = dao.find(id);
    logger.info("find(LafOlBlockContent) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlBlockContent> select(int maxResult) {
    final List<LafOlBlockContent> result = dao.select(maxResult);
    logger.info("select(LafOlBlockContent) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlBlockContent> selectAll() {
    final List<LafOlBlockContent> results = dao.selectAll();
    logger.info("selectAll(LafOlBlockContent) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBlockContent create(LafOlBlockContent bean) {
    requireNonNull(bean);
    logger.info("create(LafOlBlockContent={}) - entered bean ");

    final LafOlBlockContent result = dao.create(bean);

    logger.info("create(LafOlBlockContent) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlBlockContent update(LafOlBlockContent bean) {
    requireNonNull(bean);
    logger.info("update(LafOlBlockContent={}) - entered bean ");

    final LafOlBlockContent result = dao.update(bean);

    logger.info("update(LafOlBlockContent) - exited - return value={} result ");
    return result;
  }
}
