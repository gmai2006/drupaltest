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

import com.drupal.test.dao.LafOlCacheDataDao;
import com.drupal.test.entity.LafOlCacheData;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlCacheDataService")
public class DefaultLafOlCacheDataService implements LafOlCacheDataService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlCacheDataDao dao;

    @Inject
    @Named("DefaultLafOlCacheDataDao")
    public DefaultLafOlCacheDataService(final LafOlCacheDataDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheData find(java.lang.String id) {

        final LafOlCacheData result = dao.find(id);
        logger.info("find(LafOlCacheData) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheData> select(int maxResult) {
        final List<LafOlCacheData> result = dao.select(maxResult);
        logger.info("select(LafOlCacheData) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheData> selectAll() {
        final List<LafOlCacheData> results = dao.selectAll();
        logger.info("selectAll(LafOlCacheData) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheData create(LafOlCacheData bean) {
        requireNonNull(bean);
        logger.info("create(LafOlCacheData={}) - entered bean ");

        final LafOlCacheData result = dao.create(bean);

        logger.info("create(LafOlCacheData) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheData update(LafOlCacheData bean) {
        requireNonNull(bean);
        logger.info("update(LafOlCacheData={}) - entered bean ");

        final LafOlCacheData result = dao.update(bean);

        logger.info("update(LafOlCacheData) - exited - return value={} result ");
        return result;
    }
}
