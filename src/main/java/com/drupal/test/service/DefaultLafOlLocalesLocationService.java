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

import com.drupal.test.dao.LafOlLocalesLocationDao;
import com.drupal.test.entity.LafOlLocalesLocation;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlLocalesLocationService")
public class DefaultLafOlLocalesLocationService implements LafOlLocalesLocationService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlLocalesLocationDao dao;

    @Inject
    @Named("DefaultLafOlLocalesLocationDao")
    public DefaultLafOlLocalesLocationService(final LafOlLocalesLocationDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocalesLocation find(java.lang.Integer id) {

        final LafOlLocalesLocation result = dao.find(id);
        logger.info("find(LafOlLocalesLocation) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlLocalesLocation> select(int maxResult) {
        final List<LafOlLocalesLocation> result = dao.select(maxResult);
        logger.info("select(LafOlLocalesLocation) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlLocalesLocation> selectAll() {
        final List<LafOlLocalesLocation> results = dao.selectAll();
        logger.info("selectAll(LafOlLocalesLocation) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocalesLocation create(LafOlLocalesLocation bean) {
        requireNonNull(bean);
        logger.info("create(LafOlLocalesLocation={}) - entered bean ");

        final LafOlLocalesLocation result = dao.create(bean);

        logger.info("create(LafOlLocalesLocation) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocalesLocation update(LafOlLocalesLocation bean) {
        requireNonNull(bean);
        logger.info("update(LafOlLocalesLocation={}) - entered bean ");

        final LafOlLocalesLocation result = dao.update(bean);

        logger.info("update(LafOlLocalesLocation) - exited - return value={} result ");
        return result;
    }
}
