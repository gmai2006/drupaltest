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
import com.drupal.test.dao.LafOlShortcutDao;
import com.drupal.test.entity.LafOlShortcut;
import com.drupal.test.entity.LafOlShortcutId;

@Stateless
@Named("DefaultLafOlShortcutService")
public class DefaultLafOlShortcutService implements LafOlShortcutService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LafOlShortcutDao dao;

  @Inject
  @Named("DefaultLafOlShortcutDao")
  public DefaultLafOlShortcutService(final LafOlShortcutDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlShortcut find(LafOlShortcutId id) {
    final LafOlShortcut result = dao.find(id);
    logger.info("find(LafOlShortcut) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlShortcut> select(int maxResult) {
    final List<LafOlShortcut> result = dao.select(maxResult);
    logger.info("select(LafOlShortcut) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LafOlShortcut> selectAll() {
    final List<LafOlShortcut> results = dao.selectAll();
    logger.info("selectAll(LafOlShortcut) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlShortcut create(LafOlShortcut bean) {
    requireNonNull(bean);
    logger.info("create(LafOlShortcut={}) - entered bean ");

    final LafOlShortcut result = dao.create(bean);

    logger.info("create(LafOlShortcut) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LafOlShortcut update(LafOlShortcut bean) {
    requireNonNull(bean);
    logger.info("update(LafOlShortcut={}) - entered bean ");

    final LafOlShortcut result = dao.update(bean);

    logger.info("update(LafOlShortcut) - exited - return value={} result ");
    return result;
  }
}
