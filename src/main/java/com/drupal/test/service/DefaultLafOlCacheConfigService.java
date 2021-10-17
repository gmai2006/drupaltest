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

import com.drupal.test.dao.LafOlCacheConfigDao;
import com.drupal.test.entity.LafOlCacheConfig;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlCacheConfigService")
public class DefaultLafOlCacheConfigService implements LafOlCacheConfigService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlCacheConfigDao dao;

    @Inject
    @Named("DefaultLafOlCacheConfigDao")
    public DefaultLafOlCacheConfigService(final LafOlCacheConfigDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheConfig find(java.lang.String id) {

        final LafOlCacheConfig result = dao.find(id);
        logger.info("find(LafOlCacheConfig) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheConfig> select(int maxResult) {
        final List<LafOlCacheConfig> result = dao.select(maxResult);
        logger.info("select(LafOlCacheConfig) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheConfig> selectAll() {
        final List<LafOlCacheConfig> results = dao.selectAll();
        logger.info("selectAll(LafOlCacheConfig) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheConfig create(LafOlCacheConfig bean) {
        requireNonNull(bean);
        logger.info("create(LafOlCacheConfig={}) - entered bean ");

        final LafOlCacheConfig result = dao.create(bean);

        logger.info("create(LafOlCacheConfig) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheConfig update(LafOlCacheConfig bean) {
        requireNonNull(bean);
        logger.info("update(LafOlCacheConfig={}) - entered bean ");

        final LafOlCacheConfig result = dao.update(bean);

        logger.info("update(LafOlCacheConfig) - exited - return value={} result ");
        return result;
    }
}
