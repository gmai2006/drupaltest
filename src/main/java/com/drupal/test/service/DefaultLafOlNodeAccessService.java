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

import com.drupal.test.dao.LafOlNodeAccessDao;
import com.drupal.test.entity.LafOlNodeAccess;
import com.drupal.test.entity.LafOlNodeAccessId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlNodeAccessService")
public class DefaultLafOlNodeAccessService implements LafOlNodeAccessService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlNodeAccessDao dao;

    @Inject
    @Named("DefaultLafOlNodeAccessDao")
    public DefaultLafOlNodeAccessService(final LafOlNodeAccessDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeAccess find(LafOlNodeAccessId id) {
        final LafOlNodeAccess result = dao.find(id);
        logger.info("find(LafOlNodeAccess) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeAccess> select(int maxResult) {
        final List<LafOlNodeAccess> result = dao.select(maxResult);
        logger.info("select(LafOlNodeAccess) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeAccess> selectAll() {
        final List<LafOlNodeAccess> results = dao.selectAll();
        logger.info("selectAll(LafOlNodeAccess) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeAccess create(LafOlNodeAccess bean) {
        requireNonNull(bean);
        logger.info("create(LafOlNodeAccess={}) - entered bean ");

        final LafOlNodeAccess result = dao.create(bean);

        logger.info("create(LafOlNodeAccess) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeAccess update(LafOlNodeAccess bean) {
        requireNonNull(bean);
        logger.info("update(LafOlNodeAccess={}) - entered bean ");

        final LafOlNodeAccess result = dao.update(bean);

        logger.info("update(LafOlNodeAccess) - exited - return value={} result ");
        return result;
    }
}
