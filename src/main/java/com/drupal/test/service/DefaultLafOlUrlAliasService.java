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

import com.drupal.test.dao.LafOlUrlAliasDao;
import com.drupal.test.entity.LafOlUrlAlias;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlUrlAliasService")
public class DefaultLafOlUrlAliasService implements LafOlUrlAliasService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlUrlAliasDao dao;

    @Inject
    @Named("DefaultLafOlUrlAliasDao")
    public DefaultLafOlUrlAliasService(final LafOlUrlAliasDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUrlAlias find(java.lang.Integer id) {

        final LafOlUrlAlias result = dao.find(id);
        logger.info("find(LafOlUrlAlias) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlUrlAlias> select(int maxResult) {
        final List<LafOlUrlAlias> result = dao.select(maxResult);
        logger.info("select(LafOlUrlAlias) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlUrlAlias> selectAll() {
        final List<LafOlUrlAlias> results = dao.selectAll();
        logger.info("selectAll(LafOlUrlAlias) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUrlAlias create(LafOlUrlAlias bean) {
        requireNonNull(bean);
        logger.info("create(LafOlUrlAlias={}) - entered bean ");

        final LafOlUrlAlias result = dao.create(bean);

        logger.info("create(LafOlUrlAlias) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlUrlAlias update(LafOlUrlAlias bean) {
        requireNonNull(bean);
        logger.info("update(LafOlUrlAlias={}) - entered bean ");

        final LafOlUrlAlias result = dao.update(bean);

        logger.info("update(LafOlUrlAlias) - exited - return value={} result ");
        return result;
    }
}
