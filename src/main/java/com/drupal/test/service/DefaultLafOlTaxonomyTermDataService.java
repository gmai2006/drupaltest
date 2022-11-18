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
import com.drupal.test.dao.LafOlTaxonomyTermDataDao;
import com.drupal.test.entity.LafOlTaxonomyTermData;
import com.drupal.test.entity.LafOlTaxonomyTermDataId;

@Stateless
@Named("DefaultLafOlTaxonomyTermDataService")
public class DefaultLafOlTaxonomyTermDataService implements LafOlTaxonomyTermDataService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlTaxonomyTermDataDao dao;

  @Inject
  @Named("DefaultLafOlTaxonomyTermDataDao")
  public DefaultLafOlTaxonomyTermDataService(final LafOlTaxonomyTermDataDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlTaxonomyTermData find(LafOlTaxonomyTermDataId id) {
    final LafOlTaxonomyTermData result = dao.find(id);
    logger.info("find(LafOlTaxonomyTermData) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlTaxonomyTermData> select(int maxResult) {
    final List<LafOlTaxonomyTermData> result = dao.select(maxResult);
    logger.info("select(LafOlTaxonomyTermData) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlTaxonomyTermData> selectAll() {
    final List<LafOlTaxonomyTermData> results = dao.selectAll();
    logger.info("selectAll(LafOlTaxonomyTermData) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlTaxonomyTermData create(LafOlTaxonomyTermData bean) {
    requireNonNull(bean);
    logger.info("create(LafOlTaxonomyTermData={}) - entered bean ");

    final LafOlTaxonomyTermData result = dao.create(bean);

    logger.info("create(LafOlTaxonomyTermData) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlTaxonomyTermData update(LafOlTaxonomyTermData bean) {
    requireNonNull(bean);
    logger.info("update(LafOlTaxonomyTermData={}) - entered bean ");

    final LafOlTaxonomyTermData result = dao.update(bean);

    logger.info("update(LafOlTaxonomyTermData) - exited - return value={} result ");
    return result;
  }
}
