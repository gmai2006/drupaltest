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

import com.drupal.test.dao.LafOlSearchIndexDao;
import com.drupal.test.entity.LafOlSearchIndex;
import com.drupal.test.entity.LafOlSearchIndexId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlSearchIndexService")
public class DefaultLafOlSearchIndexService implements LafOlSearchIndexService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlSearchIndexDao dao;

    @Inject
    @Named("DefaultLafOlSearchIndexDao")
    public DefaultLafOlSearchIndexService(final LafOlSearchIndexDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlSearchIndex find(LafOlSearchIndexId id) {
        final LafOlSearchIndex result = dao.find(id);
        logger.info("find(LafOlSearchIndex) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlSearchIndex> select(int maxResult) {
        final List<LafOlSearchIndex> result = dao.select(maxResult);
        logger.info("select(LafOlSearchIndex) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlSearchIndex> selectAll() {
        final List<LafOlSearchIndex> results = dao.selectAll();
        logger.info("selectAll(LafOlSearchIndex) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlSearchIndex create(LafOlSearchIndex bean) {
        requireNonNull(bean);
        logger.info("create(LafOlSearchIndex={}) - entered bean ");

        final LafOlSearchIndex result = dao.create(bean);

        logger.info("create(LafOlSearchIndex) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlSearchIndex update(LafOlSearchIndex bean) {
        requireNonNull(bean);
        logger.info("update(LafOlSearchIndex={}) - entered bean ");

        final LafOlSearchIndex result = dao.update(bean);

        logger.info("update(LafOlSearchIndex) - exited - return value={} result ");
        return result;
    }
}
