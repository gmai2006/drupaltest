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

import com.drupal.test.dao.LafOlNodeBodyDao;
import com.drupal.test.entity.LafOlNodeBody;
import com.drupal.test.entity.LafOlNodeBodyId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlNodeBodyService")
public class DefaultLafOlNodeBodyService implements LafOlNodeBodyService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlNodeBodyDao dao;

    @Inject
    @Named("DefaultLafOlNodeBodyDao")
    public DefaultLafOlNodeBodyService(final LafOlNodeBodyDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeBody find(LafOlNodeBodyId id) {
        final LafOlNodeBody result = dao.find(id);
        logger.info("find(LafOlNodeBody) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeBody> select(int maxResult) {
        final List<LafOlNodeBody> result = dao.select(maxResult);
        logger.info("select(LafOlNodeBody) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeBody> selectAll() {
        final List<LafOlNodeBody> results = dao.selectAll();
        logger.info("selectAll(LafOlNodeBody) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeBody create(LafOlNodeBody bean) {
        requireNonNull(bean);
        logger.info("create(LafOlNodeBody={}) - entered bean ");

        final LafOlNodeBody result = dao.create(bean);

        logger.info("create(LafOlNodeBody) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeBody update(LafOlNodeBody bean) {
        requireNonNull(bean);
        logger.info("update(LafOlNodeBody={}) - entered bean ");

        final LafOlNodeBody result = dao.update(bean);

        logger.info("update(LafOlNodeBody) - exited - return value={} result ");
        return result;
    }
}
