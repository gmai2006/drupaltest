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

import com.drupal.test.dao.LafOlTaxonomyIndexDao;
import com.drupal.test.entity.LafOlTaxonomyIndex;
import com.drupal.test.entity.LafOlTaxonomyIndexId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlTaxonomyIndexService")
public class DefaultLafOlTaxonomyIndexService implements LafOlTaxonomyIndexService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlTaxonomyIndexDao dao;

    @Inject
    @Named("DefaultLafOlTaxonomyIndexDao")
    public DefaultLafOlTaxonomyIndexService(final LafOlTaxonomyIndexDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyIndex find(LafOlTaxonomyIndexId id) {
        final LafOlTaxonomyIndex result = dao.find(id);
        logger.info("find(LafOlTaxonomyIndex) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlTaxonomyIndex> select(int maxResult) {
        final List<LafOlTaxonomyIndex> result = dao.select(maxResult);
        logger.info("select(LafOlTaxonomyIndex) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlTaxonomyIndex> selectAll() {
        final List<LafOlTaxonomyIndex> results = dao.selectAll();
        logger.info("selectAll(LafOlTaxonomyIndex) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyIndex create(LafOlTaxonomyIndex bean) {
        requireNonNull(bean);
        logger.info("create(LafOlTaxonomyIndex={}) - entered bean ");

        final LafOlTaxonomyIndex result = dao.create(bean);

        logger.info("create(LafOlTaxonomyIndex) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyIndex update(LafOlTaxonomyIndex bean) {
        requireNonNull(bean);
        logger.info("update(LafOlTaxonomyIndex={}) - entered bean ");

        final LafOlTaxonomyIndex result = dao.update(bean);

        logger.info("update(LafOlTaxonomyIndex) - exited - return value={} result ");
        return result;
    }
}
