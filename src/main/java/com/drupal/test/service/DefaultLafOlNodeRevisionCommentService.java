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

import com.drupal.test.dao.LafOlNodeRevisionCommentDao;
import com.drupal.test.entity.LafOlNodeRevisionComment;
import com.drupal.test.entity.LafOlNodeRevisionCommentId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlNodeRevisionCommentService")
public class DefaultLafOlNodeRevisionCommentService implements LafOlNodeRevisionCommentService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlNodeRevisionCommentDao dao;

    @Inject
    @Named("DefaultLafOlNodeRevisionCommentDao")
    public DefaultLafOlNodeRevisionCommentService(final LafOlNodeRevisionCommentDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeRevisionComment find(LafOlNodeRevisionCommentId id) {
        final LafOlNodeRevisionComment result = dao.find(id);
        logger.info("find(LafOlNodeRevisionComment) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeRevisionComment> select(int maxResult) {
        final List<LafOlNodeRevisionComment> result = dao.select(maxResult);
        logger.info("select(LafOlNodeRevisionComment) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeRevisionComment> selectAll() {
        final List<LafOlNodeRevisionComment> results = dao.selectAll();
        logger.info("selectAll(LafOlNodeRevisionComment) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeRevisionComment create(LafOlNodeRevisionComment bean) {
        requireNonNull(bean);
        logger.info("create(LafOlNodeRevisionComment={}) - entered bean ");

        final LafOlNodeRevisionComment result = dao.create(bean);

        logger.info("create(LafOlNodeRevisionComment) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeRevisionComment update(LafOlNodeRevisionComment bean) {
        requireNonNull(bean);
        logger.info("update(LafOlNodeRevisionComment={}) - entered bean ");

        final LafOlNodeRevisionComment result = dao.update(bean);

        logger.info("update(LafOlNodeRevisionComment) - exited - return value={} result ");
        return result;
    }
}
