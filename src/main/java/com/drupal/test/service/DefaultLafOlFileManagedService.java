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
import com.drupal.test.dao.LafOlFileManagedDao;
import com.drupal.test.entity.LafOlFileManaged;
import com.drupal.test.entity.LafOlFileManagedId;

@Stateless
@Named("DefaultLafOlFileManagedService")
public class DefaultLafOlFileManagedService implements LafOlFileManagedService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlFileManagedDao dao;

  @Inject
  @Named("DefaultLafOlFileManagedDao")
  public DefaultLafOlFileManagedService(final LafOlFileManagedDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlFileManaged find(LafOlFileManagedId id) {
    final LafOlFileManaged result = dao.find(id);
    logger.info("find(LafOlFileManaged) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlFileManaged> select(int maxResult) {
    final List<LafOlFileManaged> result = dao.select(maxResult);
    logger.info("select(LafOlFileManaged) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlFileManaged> selectAll() {
    final List<LafOlFileManaged> results = dao.selectAll();
    logger.info("selectAll(LafOlFileManaged) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlFileManaged create(LafOlFileManaged bean) {
    requireNonNull(bean);
    logger.info("create(LafOlFileManaged={}) - entered bean ");

    final LafOlFileManaged result = dao.create(bean);

    logger.info("create(LafOlFileManaged) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlFileManaged update(LafOlFileManaged bean) {
    requireNonNull(bean);
    logger.info("update(LafOlFileManaged={}) - entered bean ");

    final LafOlFileManaged result = dao.update(bean);

    logger.info("update(LafOlFileManaged) - exited - return value={} result ");
    return result;
  }
}
