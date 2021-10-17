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
package com.drupal.test.dao;

import com.drupal.test.entity.LafOlShortcut;
import com.drupal.test.entity.LafOlShortcutId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Stateless
@Named("DefaultLafOlShortcutDao")
public class DefaultLafOlShortcutDao implements LafOlShortcutDao {
    private static final int BATCH_SIZE = 50;
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private JpaDao dao;

    @Inject
    @Named("DefaultJpaDao")
    public DefaultLafOlShortcutDao(JpaDao dao) {
        this.dao = dao;
    }

    public DefaultLafOlShortcutDao() {}

    /** {@inheritDoc} */
    @Override
    public LafOlShortcut find(LafOlShortcutId id) {
        final EntityManager em = dao.getEntityManager();
        return em.find(LafOlShortcut.class, id);
    }

    /** {@inheritDoc} */
    @Override
    public List<LafOlShortcut> select(int max) {
        return dao.select("select a from LafOlShortcut a", LafOlShortcut.class, max);
    }

    /** {@inheritDoc} */
    @Override
    public List<LafOlShortcut> selectAll() {
        return dao.selectAll("select a from LafOlShortcut a", LafOlShortcut.class);
    }

    /** {@inheritDoc} */
    @Override
    public LafOlShortcut create(LafOlShortcut e) {
        return dao.create(e);
    }

    /** {@inheritDoc} */
    @Override
    public LafOlShortcut update(LafOlShortcut e) {
        return dao.update(e);
    }
}
