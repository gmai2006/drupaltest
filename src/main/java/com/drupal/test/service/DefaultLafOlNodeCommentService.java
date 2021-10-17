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

import com.drupal.test.dao.LafOlNodeCommentDao;
import com.drupal.test.entity.LafOlNodeComment;
import com.drupal.test.entity.LafOlNodeCommentId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlNodeCommentService")
public class DefaultLafOlNodeCommentService implements LafOlNodeCommentService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlNodeCommentDao dao;

    @Inject
    @Named("DefaultLafOlNodeCommentDao")
    public DefaultLafOlNodeCommentService(final LafOlNodeCommentDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeComment find(LafOlNodeCommentId id) {
        final LafOlNodeComment result = dao.find(id);
        logger.info("find(LafOlNodeComment) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeComment> select(int maxResult) {
        final List<LafOlNodeComment> result = dao.select(maxResult);
        logger.info("select(LafOlNodeComment) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeComment> selectAll() {
        final List<LafOlNodeComment> results = dao.selectAll();
        logger.info("selectAll(LafOlNodeComment) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeComment create(LafOlNodeComment bean) {
        requireNonNull(bean);
        logger.info("create(LafOlNodeComment={}) - entered bean ");

        final LafOlNodeComment result = dao.create(bean);

        logger.info("create(LafOlNodeComment) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeComment update(LafOlNodeComment bean) {
        requireNonNull(bean);
        logger.info("update(LafOlNodeComment={}) - entered bean ");

        final LafOlNodeComment result = dao.update(bean);

        logger.info("update(LafOlNodeComment) - exited - return value={} result ");
        return result;
    }
}
