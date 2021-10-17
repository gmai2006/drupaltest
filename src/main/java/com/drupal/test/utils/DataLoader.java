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
package com.drupal.test.utils;

import com.drupal.test.dao.DefaultJpaDao;
import com.drupal.test.dao.JpaDao;
import com.drupal.test.handler.*;
import java.io.*;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataLoader {

    public static void main(String[] args) {
        String inputDir = "./data/";
        Path inputPath = Paths.get(inputDir);
        if (!Files.exists(inputPath)) {
            System.err.println("Not found " + inputDir);
            System.exit(0);
        }

        loadData(inputPath);
        System.exit(0);
    }

    private static void loadData(Path inputPath) {
        EntityManager manager = null;
        try {

            EntityManagerFactory entityManagerFactory =
                    Persistence.createEntityManagerFactory("localpersistence");

            manager = entityManagerFactory.createEntityManager();
            final JpaDao jpa = new DefaultJpaDao(manager);

            Stream<Path> stream = Files.walk(inputPath, 1, FileVisitOption.FOLLOW_LINKS);
            stream.filter(path -> path.toString().endsWith(".csv"))
                    .forEach(path -> process(path, jpa));

        } catch (IOException e) {
            System.err.println("Cannot load data:" + e.getLocalizedMessage());
        } finally {
            manager.close();
        }
    }

    private static void process(Path inputPath, JpaDao jpa) {
        DelimiterFileHandler handler = null;
        String handlerName = getFileNameWithoutExtension(inputPath.getFileName().toString());
        InputStream inputStream = null;

        try {
            inputStream = new BufferedInputStream(new FileInputStream(inputPath.toFile()));

            switch (handlerName) {
                case "LafOlBatch":
                    handler = new LafOlBatchHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlBlockContent":
                    handler = new LafOlBlockContentHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlBlockContentBody":
                    handler = new LafOlBlockContentBodyHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlBlockContentFieldData":
                    handler = new LafOlBlockContentFieldDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlBlockContentFieldRevision":
                    handler = new LafOlBlockContentFieldRevisionHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlBlockContentRevision":
                    handler = new LafOlBlockContentRevisionHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlBlockContentRevisionBody":
                    handler = new LafOlBlockContentRevisionBodyHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheBootstrap":
                    handler = new LafOlCacheBootstrapHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheConfig":
                    handler = new LafOlCacheConfigHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheContainer":
                    handler = new LafOlCacheContainerHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheData":
                    handler = new LafOlCacheDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheDefault":
                    handler = new LafOlCacheDefaultHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheDiscovery":
                    handler = new LafOlCacheDiscoveryHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheDynamicPageCache":
                    handler = new LafOlCacheDynamicPageCacheHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheEntity":
                    handler = new LafOlCacheEntityHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheMenu":
                    handler = new LafOlCacheMenuHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCachePage":
                    handler = new LafOlCachePageHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCacheRender":
                    handler = new LafOlCacheRenderHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCachetags":
                    handler = new LafOlCachetagsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlComment":
                    handler = new LafOlCommentHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCommentCommentBody":
                    handler = new LafOlCommentCommentBodyHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCommentEntityStatistics":
                    handler = new LafOlCommentEntityStatisticsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlCommentFieldData":
                    handler = new LafOlCommentFieldDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlConfig":
                    handler = new LafOlConfigHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlFileManaged":
                    handler = new LafOlFileManagedHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlFileUsage":
                    handler = new LafOlFileUsageHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlHistory":
                    handler = new LafOlHistoryHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlKeyValue":
                    handler = new LafOlKeyValueHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlKeyValueExpire":
                    handler = new LafOlKeyValueExpireHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlLocaleFile":
                    handler = new LafOlLocaleFileHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlLocalesLocation":
                    handler = new LafOlLocalesLocationHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlLocalesSource":
                    handler = new LafOlLocalesSourceHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlLocalesTarget":
                    handler = new LafOlLocalesTargetHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlMenuLinkContent":
                    handler = new LafOlMenuLinkContentHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlMenuLinkContentData":
                    handler = new LafOlMenuLinkContentDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlMenuLinkContentFieldRevision":
                    handler = new LafOlMenuLinkContentFieldRevisionHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlMenuLinkContentRevision":
                    handler = new LafOlMenuLinkContentRevisionHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlMenuTree":
                    handler = new LafOlMenuTreeHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNode":
                    handler = new LafOlNodeHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeBody":
                    handler = new LafOlNodeBodyHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeComment":
                    handler = new LafOlNodeCommentHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeFieldImage":
                    handler = new LafOlNodeFieldImageHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeFieldTags":
                    handler = new LafOlNodeFieldTagsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeAccess":
                    handler = new LafOlNodeAccessHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeFieldData":
                    handler = new LafOlNodeFieldDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeFieldRevision":
                    handler = new LafOlNodeFieldRevisionHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeRevision":
                    handler = new LafOlNodeRevisionHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeRevisionBody":
                    handler = new LafOlNodeRevisionBodyHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeRevisionComment":
                    handler = new LafOlNodeRevisionCommentHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeRevisionFieldImage":
                    handler = new LafOlNodeRevisionFieldImageHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlNodeRevisionFieldTags":
                    handler = new LafOlNodeRevisionFieldTagsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlQueue":
                    handler = new LafOlQueueHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlRouter":
                    handler = new LafOlRouterHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlSearchDataset":
                    handler = new LafOlSearchDatasetHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlSearchIndex":
                    handler = new LafOlSearchIndexHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlSearchTotal":
                    handler = new LafOlSearchTotalHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlSemaphore":
                    handler = new LafOlSemaphoreHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlSequences":
                    handler = new LafOlSequencesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlSessions":
                    handler = new LafOlSessionsHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlShortcut":
                    handler = new LafOlShortcutHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlShortcutFieldData":
                    handler = new LafOlShortcutFieldDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlShortcutSetUsers":
                    handler = new LafOlShortcutSetUsersHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlTaxonomyIndex":
                    handler = new LafOlTaxonomyIndexHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlTaxonomyTermParent":
                    handler = new LafOlTaxonomyTermParentHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlTaxonomyTermData":
                    handler = new LafOlTaxonomyTermDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlTaxonomyTermFieldData":
                    handler = new LafOlTaxonomyTermFieldDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlTaxonomyTermFieldRevision":
                    handler = new LafOlTaxonomyTermFieldRevisionHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlTaxonomyTermRevision":
                    handler = new LafOlTaxonomyTermRevisionHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlTaxonomyTermRevisionParent":
                    handler = new LafOlTaxonomyTermRevisionParentHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlUrlAlias":
                    handler = new LafOlUrlAliasHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlUserRoles":
                    handler = new LafOlUserRolesHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlUserUserPicture":
                    handler = new LafOlUserUserPictureHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlUsers":
                    handler = new LafOlUsersHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlUsersData":
                    handler = new LafOlUsersDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlUsersFieldData":
                    handler = new LafOlUsersFieldDataHandler(jpa);
                    handler.process(inputStream);
                    break;
                case "LafOlWatchdog":
                    handler = new LafOlWatchdogHandler(jpa);
                    handler.process(inputStream);
                    break;

                default:
                    System.out.println("Not found " + handlerName);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException ignored) {
                }
            }
        }
    }

    private static String getFileNameWithoutExtension(String fileName) {
        int lastIndex = fileName.lastIndexOf(".");
        if (lastIndex > 0) return fileName.substring(0, lastIndex);
        return fileName;
    }
}
