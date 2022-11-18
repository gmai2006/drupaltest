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
import com.drupal.test.dao.LafOlCacheRenderDao;
import com.drupal.test.entity.LafOlCacheRender;

@Stateless
@Named("DefaultLafOlCacheRenderService")
public class DefaultLafOlCacheRenderService implements LafOlCacheRenderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlCacheRenderDao dao;

  @Inject
  @Named("DefaultLafOlCacheRenderDao")
  public DefaultLafOlCacheRenderService(final LafOlCacheRenderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlCacheRender find(java.lang.String id) {

    final LafOlCacheRender result = dao.find(id);
    logger.info("find(LafOlCacheRender) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlCacheRender> select(int maxResult) {
    final List<LafOlCacheRender> result = dao.select(maxResult);
    logger.info("select(LafOlCacheRender) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlCacheRender> selectAll() {
    final List<LafOlCacheRender> results = dao.selectAll();
    logger.info("selectAll(LafOlCacheRender) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlCacheRender create(LafOlCacheRender bean) {
    requireNonNull(bean);
    logger.info("create(LafOlCacheRender={}) - entered bean ");

    final LafOlCacheRender result = dao.create(bean);

    logger.info("create(LafOlCacheRender) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlCacheRender update(LafOlCacheRender bean) {
    requireNonNull(bean);
    logger.info("update(LafOlCacheRender={}) - entered bean ");

    final LafOlCacheRender result = dao.update(bean);

    logger.info("update(LafOlCacheRender) - exited - return value={} result ");
    return result;
  }
}
