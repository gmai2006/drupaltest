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

import com.drupal.test.dao.LafOlCommentCommentBodyDao;
import com.drupal.test.entity.LafOlCommentCommentBody;
import com.drupal.test.entity.LafOlCommentCommentBodyId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlCommentCommentBodyService")
public class DefaultLafOlCommentCommentBodyService implements LafOlCommentCommentBodyService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlCommentCommentBodyDao dao;

    @Inject
    @Named("DefaultLafOlCommentCommentBodyDao")
    public DefaultLafOlCommentCommentBodyService(final LafOlCommentCommentBodyDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCommentCommentBody find(LafOlCommentCommentBodyId id) {
        final LafOlCommentCommentBody result = dao.find(id);
        logger.info("find(LafOlCommentCommentBody) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCommentCommentBody> select(int maxResult) {
        final List<LafOlCommentCommentBody> result = dao.select(maxResult);
        logger.info("select(LafOlCommentCommentBody) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlCommentCommentBody> selectAll() {
        final List<LafOlCommentCommentBody> results = dao.selectAll();
        logger.info("selectAll(LafOlCommentCommentBody) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCommentCommentBody create(LafOlCommentCommentBody bean) {
        requireNonNull(bean);
        logger.info("create(LafOlCommentCommentBody={}) - entered bean ");

        final LafOlCommentCommentBody result = dao.create(bean);

        logger.info("create(LafOlCommentCommentBody) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlCommentCommentBody update(LafOlCommentCommentBody bean) {
        requireNonNull(bean);
        logger.info("update(LafOlCommentCommentBody={}) - entered bean ");

        final LafOlCommentCommentBody result = dao.update(bean);

        logger.info("update(LafOlCommentCommentBody) - exited - return value={} result ");
        return result;
    }
}
