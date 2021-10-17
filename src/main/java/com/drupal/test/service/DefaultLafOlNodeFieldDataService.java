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

import com.drupal.test.dao.LafOlNodeFieldDataDao;
import com.drupal.test.entity.LafOlNodeFieldData;
import com.drupal.test.entity.LafOlNodeFieldDataId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlNodeFieldDataService")
public class DefaultLafOlNodeFieldDataService implements LafOlNodeFieldDataService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlNodeFieldDataDao dao;

    @Inject
    @Named("DefaultLafOlNodeFieldDataDao")
    public DefaultLafOlNodeFieldDataService(final LafOlNodeFieldDataDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeFieldData find(LafOlNodeFieldDataId id) {
        final LafOlNodeFieldData result = dao.find(id);
        logger.info("find(LafOlNodeFieldData) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeFieldData> select(int maxResult) {
        final List<LafOlNodeFieldData> result = dao.select(maxResult);
        logger.info("select(LafOlNodeFieldData) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeFieldData> selectAll() {
        final List<LafOlNodeFieldData> results = dao.selectAll();
        logger.info("selectAll(LafOlNodeFieldData) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeFieldData create(LafOlNodeFieldData bean) {
        requireNonNull(bean);
        logger.info("create(LafOlNodeFieldData={}) - entered bean ");

        final LafOlNodeFieldData result = dao.create(bean);

        logger.info("create(LafOlNodeFieldData) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeFieldData update(LafOlNodeFieldData bean) {
        requireNonNull(bean);
        logger.info("update(LafOlNodeFieldData={}) - entered bean ");

        final LafOlNodeFieldData result = dao.update(bean);

        logger.info("update(LafOlNodeFieldData) - exited - return value={} result ");
        return result;
    }
}
