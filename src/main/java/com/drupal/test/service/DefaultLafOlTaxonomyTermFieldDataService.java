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

import com.drupal.test.dao.LafOlTaxonomyTermFieldDataDao;
import com.drupal.test.entity.LafOlTaxonomyTermFieldData;
import com.drupal.test.entity.LafOlTaxonomyTermFieldDataId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlTaxonomyTermFieldDataService")
public class DefaultLafOlTaxonomyTermFieldDataService implements LafOlTaxonomyTermFieldDataService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlTaxonomyTermFieldDataDao dao;

    @Inject
    @Named("DefaultLafOlTaxonomyTermFieldDataDao")
    public DefaultLafOlTaxonomyTermFieldDataService(final LafOlTaxonomyTermFieldDataDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermFieldData find(LafOlTaxonomyTermFieldDataId id) {
        final LafOlTaxonomyTermFieldData result = dao.find(id);
        logger.info("find(LafOlTaxonomyTermFieldData) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlTaxonomyTermFieldData> select(int maxResult) {
        final List<LafOlTaxonomyTermFieldData> result = dao.select(maxResult);
        logger.info("select(LafOlTaxonomyTermFieldData) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlTaxonomyTermFieldData> selectAll() {
        final List<LafOlTaxonomyTermFieldData> results = dao.selectAll();
        logger.info("selectAll(LafOlTaxonomyTermFieldData) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermFieldData create(LafOlTaxonomyTermFieldData bean) {
        requireNonNull(bean);
        logger.info("create(LafOlTaxonomyTermFieldData={}) - entered bean ");

        final LafOlTaxonomyTermFieldData result = dao.create(bean);

        logger.info("create(LafOlTaxonomyTermFieldData) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermFieldData update(LafOlTaxonomyTermFieldData bean) {
        requireNonNull(bean);
        logger.info("update(LafOlTaxonomyTermFieldData={}) - entered bean ");

        final LafOlTaxonomyTermFieldData result = dao.update(bean);

        logger.info("update(LafOlTaxonomyTermFieldData) - exited - return value={} result ");
        return result;
    }
}
