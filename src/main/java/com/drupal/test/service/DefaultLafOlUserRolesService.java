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

import com.drupal.test.dao.LafOlUserRolesDao;
import com.drupal.test.entity.LafOlUserRoles;
import com.drupal.test.entity.LafOlUserRolesId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlUserRolesService")
public class DefaultLafOlUserRolesService implements LafOlUserRolesService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlUserRolesDao dao;

    @Inject
    @Named("DefaultLafOlUserRolesDao")
    public DefaultLafOlUserRolesService(final LafOlUserRolesDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUserRoles find(LafOlUserRolesId id) {
        final LafOlUserRoles result = dao.find(id);
        logger.info("find(LafOlUserRoles) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlUserRoles> select(int maxResult) {
        final List<LafOlUserRoles> result = dao.select(maxResult);
        logger.info("select(LafOlUserRoles) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlUserRoles> selectAll() {
        final List<LafOlUserRoles> results = dao.selectAll();
        logger.info("selectAll(LafOlUserRoles) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUserRoles create(LafOlUserRoles bean) {
        requireNonNull(bean);
        logger.info("create(LafOlUserRoles={}) - entered bean ");

        final LafOlUserRoles result = dao.create(bean);

        logger.info("create(LafOlUserRoles) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUserRoles update(LafOlUserRoles bean) {
        requireNonNull(bean);
        logger.info("update(LafOlUserRoles={}) - entered bean ");

        final LafOlUserRoles result = dao.update(bean);

        logger.info("update(LafOlUserRoles) - exited - return value={} result ");
        return result;
    }
}
