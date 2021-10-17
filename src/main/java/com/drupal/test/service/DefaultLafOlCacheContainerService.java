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

import com.drupal.test.dao.LafOlCacheContainerDao;
import com.drupal.test.entity.LafOlCacheContainer;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlCacheContainerService")
public class DefaultLafOlCacheContainerService implements LafOlCacheContainerService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlCacheContainerDao dao;

    @Inject
    @Named("DefaultLafOlCacheContainerDao")
    public DefaultLafOlCacheContainerService(final LafOlCacheContainerDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheContainer find(java.lang.String id) {

        final LafOlCacheContainer result = dao.find(id);
        logger.info("find(LafOlCacheContainer) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheContainer> select(int maxResult) {
        final List<LafOlCacheContainer> result = dao.select(maxResult);
        logger.info("select(LafOlCacheContainer) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheContainer> selectAll() {
        final List<LafOlCacheContainer> results = dao.selectAll();
        logger.info("selectAll(LafOlCacheContainer) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheContainer create(LafOlCacheContainer bean) {
        requireNonNull(bean);
        logger.info("create(LafOlCacheContainer={}) - entered bean ");

        final LafOlCacheContainer result = dao.create(bean);

        logger.info("create(LafOlCacheContainer) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheContainer update(LafOlCacheContainer bean) {
        requireNonNull(bean);
        logger.info("update(LafOlCacheContainer={}) - entered bean ");

        final LafOlCacheContainer result = dao.update(bean);

        logger.info("update(LafOlCacheContainer) - exited - return value={} result ");
        return result;
    }
}
