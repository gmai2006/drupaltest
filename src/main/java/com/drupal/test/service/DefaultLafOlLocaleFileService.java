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

import com.drupal.test.dao.LafOlLocaleFileDao;
import com.drupal.test.entity.LafOlLocaleFile;
import com.drupal.test.entity.LafOlLocaleFileId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultLafOlLocaleFileService")
public class DefaultLafOlLocaleFileService implements LafOlLocaleFileService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final LafOlLocaleFileDao dao;

    @Inject
    @Named("DefaultLafOlLocaleFileDao")
    public DefaultLafOlLocaleFileService(final LafOlLocaleFileDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocaleFile find(LafOlLocaleFileId id) {
        final LafOlLocaleFile result = dao.find(id);
        logger.info("find(LafOlLocaleFile) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlLocaleFile> select(int maxResult) {
        final List<LafOlLocaleFile> result = dao.select(maxResult);
        logger.info("select(LafOlLocaleFile) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<LafOlLocaleFile> selectAll() {
        final List<LafOlLocaleFile> results = dao.selectAll();
        logger.info("selectAll(LafOlLocaleFile) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocaleFile create(LafOlLocaleFile bean) {
        requireNonNull(bean);
        logger.info("create(LafOlLocaleFile={}) - entered bean ");

        final LafOlLocaleFile result = dao.create(bean);

        logger.info("create(LafOlLocaleFile) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public LafOlLocaleFile update(LafOlLocaleFile bean) {
        requireNonNull(bean);
        logger.info("update(LafOlLocaleFile={}) - entered bean ");

        final LafOlLocaleFile result = dao.update(bean);

        logger.info("update(LafOlLocaleFile) - exited - return value={} result ");
        return result;
    }
}
