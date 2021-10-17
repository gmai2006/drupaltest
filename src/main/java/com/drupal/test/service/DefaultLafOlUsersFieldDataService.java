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

import com.drupal.test.dao.LafOlUsersFieldDataDao;
import com.drupal.test.entity.LafOlUsersFieldData;
import com.drupal.test.entity.LafOlUsersFieldDataId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlUsersFieldDataService")
public class DefaultLafOlUsersFieldDataService implements LafOlUsersFieldDataService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlUsersFieldDataDao dao;

    @Inject
    @Named("DefaultLafOlUsersFieldDataDao")
    public DefaultLafOlUsersFieldDataService(final LafOlUsersFieldDataDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUsersFieldData find(LafOlUsersFieldDataId id) {
        final LafOlUsersFieldData result = dao.find(id);
        logger.info("find(LafOlUsersFieldData) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlUsersFieldData> select(int maxResult) {
        final List<LafOlUsersFieldData> result = dao.select(maxResult);
        logger.info("select(LafOlUsersFieldData) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlUsersFieldData> selectAll() {
        final List<LafOlUsersFieldData> results = dao.selectAll();
        logger.info("selectAll(LafOlUsersFieldData) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUsersFieldData create(LafOlUsersFieldData bean) {
        requireNonNull(bean);
        logger.info("create(LafOlUsersFieldData={}) - entered bean ");

        final LafOlUsersFieldData result = dao.create(bean);

        logger.info("create(LafOlUsersFieldData) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUsersFieldData update(LafOlUsersFieldData bean) {
        requireNonNull(bean);
        logger.info("update(LafOlUsersFieldData={}) - entered bean ");

        final LafOlUsersFieldData result = dao.update(bean);

        logger.info("update(LafOlUsersFieldData) - exited - return value={} result ");
        return result;
    }
}
