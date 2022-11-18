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
import com.drupal.test.dao.LafOlTaxonomyTermFieldRevisionDao;
import com.drupal.test.entity.LafOlTaxonomyTermFieldRevision;
import com.drupal.test.entity.LafOlTaxonomyTermFieldRevisionId;

@Stateless
@Named("DefaultLafOlTaxonomyTermFieldRevisionService")
public class DefaultLafOlTaxonomyTermFieldRevisionService
    implements LafOlTaxonomyTermFieldRevisionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlTaxonomyTermFieldRevisionDao dao;

  @Inject
  @Named("DefaultLafOlTaxonomyTermFieldRevisionDao")
  public DefaultLafOlTaxonomyTermFieldRevisionService(final LafOlTaxonomyTermFieldRevisionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlTaxonomyTermFieldRevision find(LafOlTaxonomyTermFieldRevisionId id) {
    final LafOlTaxonomyTermFieldRevision result = dao.find(id);
    logger.info("find(LafOlTaxonomyTermFieldRevision) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlTaxonomyTermFieldRevision> select(int maxResult) {
    final List<LafOlTaxonomyTermFieldRevision> result = dao.select(maxResult);
    logger.info("select(LafOlTaxonomyTermFieldRevision) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlTaxonomyTermFieldRevision> selectAll() {
    final List<LafOlTaxonomyTermFieldRevision> results = dao.selectAll();
    logger.info("selectAll(LafOlTaxonomyTermFieldRevision) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlTaxonomyTermFieldRevision create(LafOlTaxonomyTermFieldRevision bean) {
    requireNonNull(bean);
    logger.info("create(LafOlTaxonomyTermFieldRevision={}) - entered bean ");

    final LafOlTaxonomyTermFieldRevision result = dao.create(bean);

    logger.info("create(LafOlTaxonomyTermFieldRevision) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlTaxonomyTermFieldRevision update(LafOlTaxonomyTermFieldRevision bean) {
    requireNonNull(bean);
    logger.info("update(LafOlTaxonomyTermFieldRevision={}) - entered bean ");

    final LafOlTaxonomyTermFieldRevision result = dao.update(bean);

    logger.info("update(LafOlTaxonomyTermFieldRevision) - exited - return value={} result ");
    return result;
  }
}
