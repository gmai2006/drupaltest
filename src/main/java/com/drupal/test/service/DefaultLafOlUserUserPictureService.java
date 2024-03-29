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
import com.drupal.test.dao.LafOlUserUserPictureDao;
import com.drupal.test.entity.LafOlUserUserPicture;
import com.drupal.test.entity.LafOlUserUserPictureId;

@Stateless
@Named("DefaultLafOlUserUserPictureService")
public class DefaultLafOlUserUserPictureService implements LafOlUserUserPictureService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlUserUserPictureDao dao;

  @Inject
  @Named("DefaultLafOlUserUserPictureDao")
  public DefaultLafOlUserUserPictureService(final LafOlUserUserPictureDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlUserUserPicture find(LafOlUserUserPictureId id) {
    final LafOlUserUserPicture result = dao.find(id);
    logger.info("find(LafOlUserUserPicture) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlUserUserPicture> select(int maxResult) {
    final List<LafOlUserUserPicture> result = dao.select(maxResult);
    logger.info("select(LafOlUserUserPicture) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlUserUserPicture> selectAll() {
    final List<LafOlUserUserPicture> results = dao.selectAll();
    logger.info("selectAll(LafOlUserUserPicture) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlUserUserPicture create(LafOlUserUserPicture bean) {
    requireNonNull(bean);
    logger.info("create(LafOlUserUserPicture={}) - entered bean ");

    final LafOlUserUserPicture result = dao.create(bean);

    logger.info("create(LafOlUserUserPicture) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlUserUserPicture update(LafOlUserUserPicture bean) {
    requireNonNull(bean);
    logger.info("update(LafOlUserUserPicture={}) - entered bean ");

    final LafOlUserUserPicture result = dao.update(bean);

    logger.info("update(LafOlUserUserPicture) - exited - return value={} result ");
    return result;
  }
}
