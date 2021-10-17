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

import com.drupal.test.dao.LafOlCacheDynamicPageCacheDao;
import com.drupal.test.entity.LafOlCacheDynamicPageCache;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlCacheDynamicPageCacheService")
public class DefaultLafOlCacheDynamicPageCacheService implements LafOlCacheDynamicPageCacheService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlCacheDynamicPageCacheDao dao;

    @Inject
    @Named("DefaultLafOlCacheDynamicPageCacheDao")
    public DefaultLafOlCacheDynamicPageCacheService(final LafOlCacheDynamicPageCacheDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheDynamicPageCache find(java.lang.String id) {

        final LafOlCacheDynamicPageCache result = dao.find(id);
        logger.info("find(LafOlCacheDynamicPageCache) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheDynamicPageCache> select(int maxResult) {
        final List<LafOlCacheDynamicPageCache> result = dao.select(maxResult);
        logger.info("select(LafOlCacheDynamicPageCache) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheDynamicPageCache> selectAll() {
        final List<LafOlCacheDynamicPageCache> results = dao.selectAll();
        logger.info("selectAll(LafOlCacheDynamicPageCache) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheDynamicPageCache create(LafOlCacheDynamicPageCache bean) {
        requireNonNull(bean);
        logger.info("create(LafOlCacheDynamicPageCache={}) - entered bean ");

        final LafOlCacheDynamicPageCache result = dao.create(bean);

        logger.info("create(LafOlCacheDynamicPageCache) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheDynamicPageCache update(LafOlCacheDynamicPageCache bean) {
        requireNonNull(bean);
        logger.info("update(LafOlCacheDynamicPageCache={}) - entered bean ");

        final LafOlCacheDynamicPageCache result = dao.update(bean);

        logger.info("update(LafOlCacheDynamicPageCache) - exited - return value={} result ");
        return result;
    }
}
