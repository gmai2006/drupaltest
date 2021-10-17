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

import com.drupal.test.entity.DataLoadingStatus;
import com.drupal.test.entity.LafOlBatch;
import com.drupal.test.entity.LafOlBlockContent;
import com.drupal.test.entity.LafOlBlockContentBody;
import com.drupal.test.entity.LafOlBlockContentFieldData;
import com.drupal.test.entity.LafOlBlockContentFieldRevision;
import com.drupal.test.entity.LafOlBlockContentRevision;
import com.drupal.test.entity.LafOlBlockContentRevisionBody;
import com.drupal.test.entity.LafOlCacheBootstrap;
import com.drupal.test.entity.LafOlCacheConfig;
import com.drupal.test.entity.LafOlCacheContainer;
import com.drupal.test.entity.LafOlCacheData;
import com.drupal.test.entity.LafOlCacheDefault;
import com.drupal.test.entity.LafOlCacheDiscovery;
import com.drupal.test.entity.LafOlCacheDynamicPageCache;
import com.drupal.test.entity.LafOlCacheEntity;
import com.drupal.test.entity.LafOlCacheMenu;
import com.drupal.test.entity.LafOlCachePage;
import com.drupal.test.entity.LafOlCacheRender;
import com.drupal.test.entity.LafOlCachetags;
import com.drupal.test.entity.LafOlComment;
import com.drupal.test.entity.LafOlCommentCommentBody;
import com.drupal.test.entity.LafOlCommentEntityStatistics;
import com.drupal.test.entity.LafOlCommentFieldData;
import com.drupal.test.entity.LafOlConfig;
import com.drupal.test.entity.LafOlFileManaged;
import com.drupal.test.entity.LafOlFileUsage;
import com.drupal.test.entity.LafOlHistory;
import com.drupal.test.entity.LafOlKeyValue;
import com.drupal.test.entity.LafOlKeyValueExpire;
import com.drupal.test.entity.LafOlLocaleFile;
import com.drupal.test.entity.LafOlLocalesLocation;
import com.drupal.test.entity.LafOlLocalesSource;
import com.drupal.test.entity.LafOlLocalesTarget;
import com.drupal.test.entity.LafOlMenuLinkContent;
import com.drupal.test.entity.LafOlMenuLinkContentData;
import com.drupal.test.entity.LafOlMenuLinkContentFieldRevision;
import com.drupal.test.entity.LafOlMenuLinkContentRevision;
import com.drupal.test.entity.LafOlMenuTree;
import com.drupal.test.entity.LafOlNode;
import com.drupal.test.entity.LafOlNodeAccess;
import com.drupal.test.entity.LafOlNodeBody;
import com.drupal.test.entity.LafOlNodeComment;
import com.drupal.test.entity.LafOlNodeFieldData;
import com.drupal.test.entity.LafOlNodeFieldImage;
import com.drupal.test.entity.LafOlNodeFieldRevision;
import com.drupal.test.entity.LafOlNodeFieldTags;
import com.drupal.test.entity.LafOlNodeRevision;
import com.drupal.test.entity.LafOlNodeRevisionBody;
import com.drupal.test.entity.LafOlNodeRevisionComment;
import com.drupal.test.entity.LafOlNodeRevisionFieldImage;
import com.drupal.test.entity.LafOlNodeRevisionFieldTags;
import com.drupal.test.entity.LafOlQueue;
import com.drupal.test.entity.LafOlRouter;
import com.drupal.test.entity.LafOlSearchDataset;
import com.drupal.test.entity.LafOlSearchIndex;
import com.drupal.test.entity.LafOlSearchTotal;
import com.drupal.test.entity.LafOlSemaphore;
import com.drupal.test.entity.LafOlSequences;
import com.drupal.test.entity.LafOlSessions;
import com.drupal.test.entity.LafOlShortcut;
import com.drupal.test.entity.LafOlShortcutFieldData;
import com.drupal.test.entity.LafOlShortcutSetUsers;
import com.drupal.test.entity.LafOlTaxonomyIndex;
import com.drupal.test.entity.LafOlTaxonomyTermData;
import com.drupal.test.entity.LafOlTaxonomyTermFieldData;
import com.drupal.test.entity.LafOlTaxonomyTermFieldRevision;
import com.drupal.test.entity.LafOlTaxonomyTermParent;
import com.drupal.test.entity.LafOlTaxonomyTermRevision;
import com.drupal.test.entity.LafOlTaxonomyTermRevisionParent;
import com.drupal.test.entity.LafOlUrlAlias;
import com.drupal.test.entity.LafOlUserRoles;
import com.drupal.test.entity.LafOlUserUserPicture;
import com.drupal.test.entity.LafOlUsers;
import com.drupal.test.entity.LafOlUsersData;
import com.drupal.test.entity.LafOlUsersFieldData;
import com.drupal.test.entity.LafOlWatchdog;
import com.drupal.test.entity.Loadingstatus;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultDataLoadingDao")
public class DefaultDataLoadingDao implements DataLoadingDao {

    private static final Logger logger = Logger.getLogger(DefaultDataLoadingDao.class.getName());
    private JpaDao dao;

    @Inject
    @Named("DefaultJpaDao")
    public DefaultDataLoadingDao(JpaDao dao) {
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public DataLoadingStatus update(DataLoadingStatus e) {
        return dao.update(e);
    }

    /** {@inheritDoc} */
    @Override
    public DataLoadingStatus getLoadingStatus(String type) {
        DataLoadingStatus loadingStatus = dao.find(DataLoadingStatus.class, type);
        if (null == loadingStatus) {
            loadingStatus = new DataLoadingStatus(type, Loadingstatus.NEW);
            dao.create(loadingStatus);
        }
        return loadingStatus;
    }

    /** {@inheritDoc} */
    @Override
    public <E> E create(E e) {
        return dao.create(e);
    }

    /** {@inheritDoc} */
    @Override
    public void delete(String id) {
        dao.delete(DataLoadingStatus.class, id);
    }

    /** {@inheritDoc} */
    @Override
    public void deleteAll() {
        dao.deleteAll(LafOlBatch.class);
        dao.deleteAll(LafOlBlockContent.class);
        dao.deleteAll(LafOlBlockContentBody.class);
        dao.deleteAll(LafOlBlockContentFieldData.class);
        dao.deleteAll(LafOlBlockContentFieldRevision.class);
        dao.deleteAll(LafOlBlockContentRevision.class);
        dao.deleteAll(LafOlBlockContentRevisionBody.class);
        dao.deleteAll(LafOlCacheBootstrap.class);
        dao.deleteAll(LafOlCacheConfig.class);
        dao.deleteAll(LafOlCacheContainer.class);
        dao.deleteAll(LafOlCacheData.class);
        dao.deleteAll(LafOlCacheDefault.class);
        dao.deleteAll(LafOlCacheDiscovery.class);
        dao.deleteAll(LafOlCacheDynamicPageCache.class);
        dao.deleteAll(LafOlCacheEntity.class);
        dao.deleteAll(LafOlCacheMenu.class);
        dao.deleteAll(LafOlCachePage.class);
        dao.deleteAll(LafOlCacheRender.class);
        dao.deleteAll(LafOlCachetags.class);
        dao.deleteAll(LafOlComment.class);
        dao.deleteAll(LafOlCommentCommentBody.class);
        dao.deleteAll(LafOlCommentEntityStatistics.class);
        dao.deleteAll(LafOlCommentFieldData.class);
        dao.deleteAll(LafOlConfig.class);
        dao.deleteAll(LafOlFileManaged.class);
        dao.deleteAll(LafOlFileUsage.class);
        dao.deleteAll(LafOlHistory.class);
        dao.deleteAll(LafOlKeyValue.class);
        dao.deleteAll(LafOlKeyValueExpire.class);
        dao.deleteAll(LafOlLocaleFile.class);
        dao.deleteAll(LafOlLocalesLocation.class);
        dao.deleteAll(LafOlLocalesSource.class);
        dao.deleteAll(LafOlLocalesTarget.class);
        dao.deleteAll(LafOlMenuLinkContent.class);
        dao.deleteAll(LafOlMenuLinkContentData.class);
        dao.deleteAll(LafOlMenuLinkContentFieldRevision.class);
        dao.deleteAll(LafOlMenuLinkContentRevision.class);
        dao.deleteAll(LafOlMenuTree.class);
        dao.deleteAll(LafOlNode.class);
        dao.deleteAll(LafOlNodeBody.class);
        dao.deleteAll(LafOlNodeComment.class);
        dao.deleteAll(LafOlNodeFieldImage.class);
        dao.deleteAll(LafOlNodeFieldTags.class);
        dao.deleteAll(LafOlNodeAccess.class);
        dao.deleteAll(LafOlNodeFieldData.class);
        dao.deleteAll(LafOlNodeFieldRevision.class);
        dao.deleteAll(LafOlNodeRevision.class);
        dao.deleteAll(LafOlNodeRevisionBody.class);
        dao.deleteAll(LafOlNodeRevisionComment.class);
        dao.deleteAll(LafOlNodeRevisionFieldImage.class);
        dao.deleteAll(LafOlNodeRevisionFieldTags.class);
        dao.deleteAll(LafOlQueue.class);
        dao.deleteAll(LafOlRouter.class);
        dao.deleteAll(LafOlSearchDataset.class);
        dao.deleteAll(LafOlSearchIndex.class);
        dao.deleteAll(LafOlSearchTotal.class);
        dao.deleteAll(LafOlSemaphore.class);
        dao.deleteAll(LafOlSequences.class);
        dao.deleteAll(LafOlSessions.class);
        dao.deleteAll(LafOlShortcut.class);
        dao.deleteAll(LafOlShortcutFieldData.class);
        dao.deleteAll(LafOlShortcutSetUsers.class);
        dao.deleteAll(LafOlTaxonomyIndex.class);
        dao.deleteAll(LafOlTaxonomyTermParent.class);
        dao.deleteAll(LafOlTaxonomyTermData.class);
        dao.deleteAll(LafOlTaxonomyTermFieldData.class);
        dao.deleteAll(LafOlTaxonomyTermFieldRevision.class);
        dao.deleteAll(LafOlTaxonomyTermRevision.class);
        dao.deleteAll(LafOlTaxonomyTermRevisionParent.class);
        dao.deleteAll(LafOlUrlAlias.class);
        dao.deleteAll(LafOlUserRoles.class);
        dao.deleteAll(LafOlUserUserPicture.class);
        dao.deleteAll(LafOlUsers.class);
        dao.deleteAll(LafOlUsersData.class);
        dao.deleteAll(LafOlUsersFieldData.class);
        dao.deleteAll(LafOlWatchdog.class);
    }
}
