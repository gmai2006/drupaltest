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

import com.drupal.test.dao.LafOlTaxonomyTermParentDao;
import com.drupal.test.entity.LafOlTaxonomyTermParent;
import com.drupal.test.entity.LafOlTaxonomyTermParentId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlTaxonomyTermParentService")
public class DefaultLafOlTaxonomyTermParentService implements LafOlTaxonomyTermParentService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlTaxonomyTermParentDao dao;

    @Inject
    @Named("DefaultLafOlTaxonomyTermParentDao")
    public DefaultLafOlTaxonomyTermParentService(final LafOlTaxonomyTermParentDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermParent find(LafOlTaxonomyTermParentId id) {
        final LafOlTaxonomyTermParent result = dao.find(id);
        logger.info("find(LafOlTaxonomyTermParent) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlTaxonomyTermParent> select(int maxResult) {
        final List<LafOlTaxonomyTermParent> result = dao.select(maxResult);
        logger.info("select(LafOlTaxonomyTermParent) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlTaxonomyTermParent> selectAll() {
        final List<LafOlTaxonomyTermParent> results = dao.selectAll();
        logger.info("selectAll(LafOlTaxonomyTermParent) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermParent create(LafOlTaxonomyTermParent bean) {
        requireNonNull(bean);
        logger.info("create(LafOlTaxonomyTermParent={}) - entered bean ");

        final LafOlTaxonomyTermParent result = dao.create(bean);

        logger.info("create(LafOlTaxonomyTermParent) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlTaxonomyTermParent update(LafOlTaxonomyTermParent bean) {
        requireNonNull(bean);
        logger.info("update(LafOlTaxonomyTermParent={}) - entered bean ");

        final LafOlTaxonomyTermParent result = dao.update(bean);

        logger.info("update(LafOlTaxonomyTermParent) - exited - return value={} result ");
        return result;
    }
}
