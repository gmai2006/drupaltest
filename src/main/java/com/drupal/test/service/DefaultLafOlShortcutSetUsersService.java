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

import com.drupal.test.dao.LafOlShortcutSetUsersDao;
import com.drupal.test.entity.LafOlShortcutSetUsers;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlShortcutSetUsersService")
public class DefaultLafOlShortcutSetUsersService implements LafOlShortcutSetUsersService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlShortcutSetUsersDao dao;

    @Inject
    @Named("DefaultLafOlShortcutSetUsersDao")
    public DefaultLafOlShortcutSetUsersService(final LafOlShortcutSetUsersDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlShortcutSetUsers find(java.lang.Integer id) {

        final LafOlShortcutSetUsers result = dao.find(id);
        logger.info("find(LafOlShortcutSetUsers) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlShortcutSetUsers> select(int maxResult) {
        final List<LafOlShortcutSetUsers> result = dao.select(maxResult);
        logger.info("select(LafOlShortcutSetUsers) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlShortcutSetUsers> selectAll() {
        final List<LafOlShortcutSetUsers> results = dao.selectAll();
        logger.info("selectAll(LafOlShortcutSetUsers) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlShortcutSetUsers create(LafOlShortcutSetUsers bean) {
        requireNonNull(bean);
        logger.info("create(LafOlShortcutSetUsers={}) - entered bean ");

        final LafOlShortcutSetUsers result = dao.create(bean);

        logger.info("create(LafOlShortcutSetUsers) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlShortcutSetUsers update(LafOlShortcutSetUsers bean) {
        requireNonNull(bean);
        logger.info("update(LafOlShortcutSetUsers={}) - entered bean ");

        final LafOlShortcutSetUsers result = dao.update(bean);

        logger.info("update(LafOlShortcutSetUsers) - exited - return value={} result ");
        return result;
    }
}
