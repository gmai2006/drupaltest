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

import com.drupal.test.dao.LafOlNodeDao;
import com.drupal.test.entity.LafOlNode;
import com.drupal.test.entity.LafOlNodeId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlNodeService")
public class DefaultLafOlNodeService implements LafOlNodeService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlNodeDao dao;

    @Inject
    @Named("DefaultLafOlNodeDao")
    public DefaultLafOlNodeService(final LafOlNodeDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNode find(LafOlNodeId id) {
        final LafOlNode result = dao.find(id);
        logger.info("find(LafOlNode) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNode> select(int maxResult) {
        final List<LafOlNode> result = dao.select(maxResult);
        logger.info("select(LafOlNode) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNode> selectAll() {
        final List<LafOlNode> results = dao.selectAll();
        logger.info("selectAll(LafOlNode) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNode create(LafOlNode bean) {
        requireNonNull(bean);
        logger.info("create(LafOlNode={}) - entered bean ");

        final LafOlNode result = dao.create(bean);

        logger.info("create(LafOlNode) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNode update(LafOlNode bean) {
        requireNonNull(bean);
        logger.info("update(LafOlNode={}) - entered bean ");

        final LafOlNode result = dao.update(bean);

        logger.info("update(LafOlNode) - exited - return value={} result ");
        return result;
    }
}
