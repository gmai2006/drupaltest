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

import com.drupal.test.dao.LafOlTaxonomyTermRevisionDao;
import com.drupal.test.entity.LafOlTaxonomyTermRevision;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlTaxonomyTermRevisionService")
public class DefaultLafOlTaxonomyTermRevisionService implements LafOlTaxonomyTermRevisionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlTaxonomyTermRevisionDao dao;

    @Inject
    @Named("DefaultLafOlTaxonomyTermRevisionDao")
    public DefaultLafOlTaxonomyTermRevisionService(final LafOlTaxonomyTermRevisionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermRevision find(java.lang.Integer id) {

        final LafOlTaxonomyTermRevision result = dao.find(id);
        logger.info("find(LafOlTaxonomyTermRevision) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlTaxonomyTermRevision> select(int maxResult) {
        final List<LafOlTaxonomyTermRevision> result = dao.select(maxResult);
        logger.info("select(LafOlTaxonomyTermRevision) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlTaxonomyTermRevision> selectAll() {
        final List<LafOlTaxonomyTermRevision> results = dao.selectAll();
        logger.info("selectAll(LafOlTaxonomyTermRevision) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermRevision create(LafOlTaxonomyTermRevision bean) {
        requireNonNull(bean);
        logger.info("create(LafOlTaxonomyTermRevision={}) - entered bean ");

        final LafOlTaxonomyTermRevision result = dao.create(bean);

        logger.info("create(LafOlTaxonomyTermRevision) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermRevision update(LafOlTaxonomyTermRevision bean) {
        requireNonNull(bean);
        logger.info("update(LafOlTaxonomyTermRevision={}) - entered bean ");

        final LafOlTaxonomyTermRevision result = dao.update(bean);

        logger.info("update(LafOlTaxonomyTermRevision) - exited - return value={} result ");
        return result;
    }
}
