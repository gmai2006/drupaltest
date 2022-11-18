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
package com.drupal.test.rest;

import com.drupal.test.dao.JpaDao;
import com.drupal.test.entity.*;
import com.drupal.test.service.*;
import com.drupal.test.handler.*;
import com.drupal.test.utils.MetaDataEnum;
import javax.inject.Inject;
import java.io.InputStream;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static java.util.Objects.requireNonNull;

@Path("/meta")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class DatabaseMetaResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());

  public DatabaseMetaResource() {}

  @Inject private LafOlBatchService service;

  @Inject
  @Named("DefaultJpaDao")
  JpaDao jpa;

  /**
   * hello.
   *
   * @return a hello.
   */
  @GET
  @Path("")
  public Response hello() {
    List<LafOlBatch> result = service.selectAll();
    if (result.isEmpty()) {
      loadData();
    }

    return Response.status(Response.Status.OK).entity(this.getClass().getName()).build();
  }

  /**
   * Select all tables.
   *
   * @return a list tables.
   */
  @GET
  @Path("tables")
  public Response selectAll() {
    List<String> result =
        Arrays.asList(
            new String[] {
              "LafOlBatch",
              "LafOlBlockContent",
              "LafOlBlockContentBody",
              "LafOlBlockContentFieldData",
              "LafOlBlockContentFieldRevision",
              "LafOlBlockContentRevision",
              "LafOlBlockContentRevisionBody",
              "LafOlCacheBootstrap",
              "LafOlCacheConfig",
              "LafOlCacheContainer",
              "LafOlCacheData",
              "LafOlCacheDefault",
              "LafOlCacheDiscovery",
              "LafOlCacheDynamicPageCache",
              "LafOlCacheEntity",
              "LafOlCacheMenu",
              "LafOlCachePage",
              "LafOlCacheRender",
              "LafOlCachetags",
              "LafOlComment",
              "LafOlCommentCommentBody",
              "LafOlCommentEntityStatistics",
              "LafOlCommentFieldData",
              "LafOlConfig",
              "LafOlFileManaged",
              "LafOlFileUsage",
              "LafOlHistory",
              "LafOlKeyValue",
              "LafOlKeyValueExpire",
              "LafOlLocaleFile",
              "LafOlLocalesLocation",
              "LafOlLocalesSource",
              "LafOlLocalesTarget",
              "LafOlMenuLinkContent",
              "LafOlMenuLinkContentData",
              "LafOlMenuLinkContentFieldRevision",
              "LafOlMenuLinkContentRevision",
              "LafOlMenuTree",
              "LafOlNode",
              "LafOlNodeBody",
              "LafOlNodeComment",
              "LafOlNodeFieldImage",
              "LafOlNodeFieldTags",
              "LafOlNodeAccess",
              "LafOlNodeFieldData",
              "LafOlNodeFieldRevision",
              "LafOlNodeRevision",
              "LafOlNodeRevisionBody",
              "LafOlNodeRevisionComment",
              "LafOlNodeRevisionFieldImage",
              "LafOlNodeRevisionFieldTags",
              "LafOlQueue",
              "LafOlRouter",
              "LafOlSearchDataset",
              "LafOlSearchIndex",
              "LafOlSearchTotal",
              "LafOlSemaphore",
              "LafOlSequences",
              "LafOlSessions",
              "LafOlShortcut",
              "LafOlShortcutFieldData",
              "LafOlShortcutSetUsers",
              "LafOlTaxonomyIndex",
              "LafOlTaxonomyTermParent",
              "LafOlTaxonomyTermData",
              "LafOlTaxonomyTermFieldData",
              "LafOlTaxonomyTermFieldRevision",
              "LafOlTaxonomyTermRevision",
              "LafOlTaxonomyTermRevisionParent",
              "LafOlUrlAlias",
              "LafOlUserRoles",
              "LafOlUserUserPicture",
              "LafOlUsers",
              "LafOlUsersData",
              "LafOlUsersFieldData",
              "LafOlWatchdog",
            });
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  private void loadData() {

    Arrays.stream(MetaDataEnum.values())
        .forEach(
            item -> {
              logger.info("processing " + item.name());
              InputStream in =
                  DatabaseLoadingResource.class.getResourceAsStream("/" + item.name() + ".csv");
              process(item.name(), in, jpa);
            });
  }

  private static void process(String handlerName, InputStream inputStream, JpaDao jpa) {
    DelimiterFileHandler handler = null;

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
  }
}
