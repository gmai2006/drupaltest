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

import com.drupal.test.dao.LafOlLocalesSourceDao;
import com.drupal.test.entity.LafOlLocalesSource;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlLocalesSourceService")
public class DefaultLafOlLocalesSourceService implements LafOlLocalesSourceService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlLocalesSourceDao dao;

    @Inject
    @Named("DefaultLafOlLocalesSourceDao")
    public DefaultLafOlLocalesSourceService(final LafOlLocalesSourceDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocalesSource find(java.lang.Integer id) {

        final LafOlLocalesSource result = dao.find(id);
        logger.info("find(LafOlLocalesSource) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlLocalesSource> select(int maxResult) {
        final List<LafOlLocalesSource> result = dao.select(maxResult);
        logger.info("select(LafOlLocalesSource) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlLocalesSource> selectAll() {
        final List<LafOlLocalesSource> results = dao.selectAll();
        logger.info("selectAll(LafOlLocalesSource) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocalesSource create(LafOlLocalesSource bean) {
        requireNonNull(bean);
        logger.info("create(LafOlLocalesSource={}) - entered bean ");

        final LafOlLocalesSource result = dao.create(bean);

        logger.info("create(LafOlLocalesSource) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocalesSource update(LafOlLocalesSource bean) {
        requireNonNull(bean);
        logger.info("update(LafOlLocalesSource={}) - entered bean ");

        final LafOlLocalesSource result = dao.update(bean);

        logger.info("update(LafOlLocalesSource) - exited - return value={} result ");
        return result;
    }
}
