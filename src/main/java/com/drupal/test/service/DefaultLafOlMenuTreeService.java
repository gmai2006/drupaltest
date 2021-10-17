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

import com.drupal.test.dao.LafOlMenuTreeDao;
import com.drupal.test.entity.LafOlMenuTree;
import com.drupal.test.entity.LafOlMenuTreeId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlMenuTreeService")
public class DefaultLafOlMenuTreeService implements LafOlMenuTreeService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlMenuTreeDao dao;

    @Inject
    @Named("DefaultLafOlMenuTreeDao")
    public DefaultLafOlMenuTreeService(final LafOlMenuTreeDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlMenuTree find(LafOlMenuTreeId id) {
        final LafOlMenuTree result = dao.find(id);
        logger.info("find(LafOlMenuTree) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlMenuTree> select(int maxResult) {
        final List<LafOlMenuTree> result = dao.select(maxResult);
        logger.info("select(LafOlMenuTree) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlMenuTree> selectAll() {
        final List<LafOlMenuTree> results = dao.selectAll();
        logger.info("selectAll(LafOlMenuTree) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlMenuTree create(LafOlMenuTree bean) {
        requireNonNull(bean);
        logger.info("create(LafOlMenuTree={}) - entered bean ");

        final LafOlMenuTree result = dao.create(bean);

        logger.info("create(LafOlMenuTree) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlMenuTree update(LafOlMenuTree bean) {
        requireNonNull(bean);
        logger.info("update(LafOlMenuTree={}) - entered bean ");

        final LafOlMenuTree result = dao.update(bean);

        logger.info("update(LafOlMenuTree) - exited - return value={} result ");
        return result;
    }
}
