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
import com.drupal.test.dao.LafOlCacheDiscoveryDao;
import com.drupal.test.entity.LafOlCacheDiscovery;

@Stateless
@Named("DefaultLafOlCacheDiscoveryService")
public class DefaultLafOlCacheDiscoveryService implements LafOlCacheDiscoveryService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlCacheDiscoveryDao dao;

  @Inject
  @Named("DefaultLafOlCacheDiscoveryDao")
  public DefaultLafOlCacheDiscoveryService(final LafOlCacheDiscoveryDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlCacheDiscovery find(java.lang.String id) {

    final LafOlCacheDiscovery result = dao.find(id);
    logger.info("find(LafOlCacheDiscovery) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlCacheDiscovery> select(int maxResult) {
    final List<LafOlCacheDiscovery> result = dao.select(maxResult);
    logger.info("select(LafOlCacheDiscovery) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlCacheDiscovery> selectAll() {
    final List<LafOlCacheDiscovery> results = dao.selectAll();
    logger.info("selectAll(LafOlCacheDiscovery) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlCacheDiscovery create(LafOlCacheDiscovery bean) {
    requireNonNull(bean);
    logger.info("create(LafOlCacheDiscovery={}) - entered bean ");

    final LafOlCacheDiscovery result = dao.create(bean);

    logger.info("create(LafOlCacheDiscovery) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlCacheDiscovery update(LafOlCacheDiscovery bean) {
    requireNonNull(bean);
    logger.info("update(LafOlCacheDiscovery={}) - entered bean ");

    final LafOlCacheDiscovery result = dao.update(bean);

    logger.info("update(LafOlCacheDiscovery) - exited - return value={} result ");
    return result;
  }
}
