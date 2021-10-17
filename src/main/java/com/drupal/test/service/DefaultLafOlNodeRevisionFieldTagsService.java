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

import com.drupal.test.dao.LafOlNodeRevisionFieldTagsDao;
import com.drupal.test.entity.LafOlNodeRevisionFieldTags;
import com.drupal.test.entity.LafOlNodeRevisionFieldTagsId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlNodeRevisionFieldTagsService")
public class DefaultLafOlNodeRevisionFieldTagsService implements LafOlNodeRevisionFieldTagsService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlNodeRevisionFieldTagsDao dao;

    @Inject
    @Named("DefaultLafOlNodeRevisionFieldTagsDao")
    public DefaultLafOlNodeRevisionFieldTagsService(final LafOlNodeRevisionFieldTagsDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeRevisionFieldTags find(LafOlNodeRevisionFieldTagsId id) {
        final LafOlNodeRevisionFieldTags result = dao.find(id);
        logger.info("find(LafOlNodeRevisionFieldTags) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeRevisionFieldTags> select(int maxResult) {
        final List<LafOlNodeRevisionFieldTags> result = dao.select(maxResult);
        logger.info("select(LafOlNodeRevisionFieldTags) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlNodeRevisionFieldTags> selectAll() {
        final List<LafOlNodeRevisionFieldTags> results = dao.selectAll();
        logger.info("selectAll(LafOlNodeRevisionFieldTags) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeRevisionFieldTags create(LafOlNodeRevisionFieldTags bean) {
        requireNonNull(bean);
        logger.info("create(LafOlNodeRevisionFieldTags={}) - entered bean ");

        final LafOlNodeRevisionFieldTags result = dao.create(bean);

        logger.info("create(LafOlNodeRevisionFieldTags) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlNodeRevisionFieldTags update(LafOlNodeRevisionFieldTags bean) {
        requireNonNull(bean);
        logger.info("update(LafOlNodeRevisionFieldTags={}) - entered bean ");

        final LafOlNodeRevisionFieldTags result = dao.update(bean);

        logger.info("update(LafOlNodeRevisionFieldTags) - exited - return value={} result ");
        return result;
    }
}
