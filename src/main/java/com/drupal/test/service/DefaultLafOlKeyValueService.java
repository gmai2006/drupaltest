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

import com.drupal.test.dao.LafOlKeyValueDao;
import com.drupal.test.entity.LafOlKeyValue;
import com.drupal.test.entity.LafOlKeyValueId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlKeyValueService")
public class DefaultLafOlKeyValueService implements LafOlKeyValueService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlKeyValueDao dao;

    @Inject
    @Named("DefaultLafOlKeyValueDao")
    public DefaultLafOlKeyValueService(final LafOlKeyValueDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlKeyValue find(LafOlKeyValueId id) {
        final LafOlKeyValue result = dao.find(id);
        logger.info("find(LafOlKeyValue) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlKeyValue> select(int maxResult) {
        final List<LafOlKeyValue> result = dao.select(maxResult);
        logger.info("select(LafOlKeyValue) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlKeyValue> selectAll() {
        final List<LafOlKeyValue> results = dao.selectAll();
        logger.info("selectAll(LafOlKeyValue) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlKeyValue create(LafOlKeyValue bean) {
        requireNonNull(bean);
        logger.info("create(LafOlKeyValue={}) - entered bean ");

        final LafOlKeyValue result = dao.create(bean);

        logger.info("create(LafOlKeyValue) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlKeyValue update(LafOlKeyValue bean) {
        requireNonNull(bean);
        logger.info("update(LafOlKeyValue={}) - entered bean ");

        final LafOlKeyValue result = dao.update(bean);

        logger.info("update(LafOlKeyValue) - exited - return value={} result ");
        return result;
    }
}
