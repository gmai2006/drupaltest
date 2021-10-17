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

import com.drupal.test.dao.LafOlCacheDefaultDao;
import com.drupal.test.entity.LafOlCacheDefault;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlCacheDefaultService")
public class DefaultLafOlCacheDefaultService implements LafOlCacheDefaultService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlCacheDefaultDao dao;

    @Inject
    @Named("DefaultLafOlCacheDefaultDao")
    public DefaultLafOlCacheDefaultService(final LafOlCacheDefaultDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheDefault find(java.lang.String id) {

        final LafOlCacheDefault result = dao.find(id);
        logger.info("find(LafOlCacheDefault) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheDefault> select(int maxResult) {
        final List<LafOlCacheDefault> result = dao.select(maxResult);
        logger.info("select(LafOlCacheDefault) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCacheDefault> selectAll() {
        final List<LafOlCacheDefault> results = dao.selectAll();
        logger.info("selectAll(LafOlCacheDefault) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheDefault create(LafOlCacheDefault bean) {
        requireNonNull(bean);
        logger.info("create(LafOlCacheDefault={}) - entered bean ");

        final LafOlCacheDefault result = dao.create(bean);

        logger.info("create(LafOlCacheDefault) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCacheDefault update(LafOlCacheDefault bean) {
        requireNonNull(bean);
        logger.info("update(LafOlCacheDefault={}) - entered bean ");

        final LafOlCacheDefault result = dao.update(bean);

        logger.info("update(LafOlCacheDefault) - exited - return value={} result ");
        return result;
    }
}
