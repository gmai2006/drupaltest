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
import com.drupal.test.dao.LafOlNodeRevisionFieldImageDao;
import com.drupal.test.entity.LafOlNodeRevisionFieldImage;
import com.drupal.test.entity.LafOlNodeRevisionFieldImageId;

@Stateless
@Named("DefaultLafOlNodeRevisionFieldImageService")
public class DefaultLafOlNodeRevisionFieldImageService
    implements LafOlNodeRevisionFieldImageService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlNodeRevisionFieldImageDao dao;

  @Inject
  @Named("DefaultLafOlNodeRevisionFieldImageDao")
  public DefaultLafOlNodeRevisionFieldImageService(final LafOlNodeRevisionFieldImageDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeRevisionFieldImage find(LafOlNodeRevisionFieldImageId id) {
    final LafOlNodeRevisionFieldImage result = dao.find(id);
    logger.info("find(LafOlNodeRevisionFieldImage) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlNodeRevisionFieldImage> select(int maxResult) {
    final List<LafOlNodeRevisionFieldImage> result = dao.select(maxResult);
    logger.info("select(LafOlNodeRevisionFieldImage) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlNodeRevisionFieldImage> selectAll() {
    final List<LafOlNodeRevisionFieldImage> results = dao.selectAll();
    logger.info("selectAll(LafOlNodeRevisionFieldImage) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeRevisionFieldImage create(LafOlNodeRevisionFieldImage bean) {
    requireNonNull(bean);
    logger.info("create(LafOlNodeRevisionFieldImage={}) - entered bean ");

    final LafOlNodeRevisionFieldImage result = dao.create(bean);

    logger.info("create(LafOlNodeRevisionFieldImage) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlNodeRevisionFieldImage update(LafOlNodeRevisionFieldImage bean) {
    requireNonNull(bean);
    logger.info("update(LafOlNodeRevisionFieldImage={}) - entered bean ");

    final LafOlNodeRevisionFieldImage result = dao.update(bean);

    logger.info("update(LafOlNodeRevisionFieldImage) - exited - return value={} result ");
    return result;
  }
}
