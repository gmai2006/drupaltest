import React from 'react';
import init from "../init";
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import LafOlBatch from '../pages/tables/LafOlBatch';
import LafOlBlockContent from '../pages/tables/LafOlBlockContent';
import LafOlBlockContentBody from '../pages/tables/LafOlBlockContentBody';
import LafOlBlockContentFieldData from '../pages/tables/LafOlBlockContentFieldData';
import LafOlBlockContentFieldRevision from '../pages/tables/LafOlBlockContentFieldRevision';
import LafOlBlockContentRevision from '../pages/tables/LafOlBlockContentRevision';
import LafOlBlockContentRevisionBody from '../pages/tables/LafOlBlockContentRevisionBody';
import LafOlCacheBootstrap from '../pages/tables/LafOlCacheBootstrap';
import LafOlCacheConfig from '../pages/tables/LafOlCacheConfig';
import LafOlCacheContainer from '../pages/tables/LafOlCacheContainer';
import LafOlCacheData from '../pages/tables/LafOlCacheData';
import LafOlCacheDefault from '../pages/tables/LafOlCacheDefault';
import LafOlCacheDiscovery from '../pages/tables/LafOlCacheDiscovery';
import LafOlCacheDynamicPageCache from '../pages/tables/LafOlCacheDynamicPageCache';
import LafOlCacheEntity from '../pages/tables/LafOlCacheEntity';
import LafOlCacheMenu from '../pages/tables/LafOlCacheMenu';
import LafOlCachePage from '../pages/tables/LafOlCachePage';
import LafOlCacheRender from '../pages/tables/LafOlCacheRender';
import LafOlCachetags from '../pages/tables/LafOlCachetags';
import LafOlComment from '../pages/tables/LafOlComment';
import LafOlCommentCommentBody from '../pages/tables/LafOlCommentCommentBody';
import LafOlCommentEntityStatistics from '../pages/tables/LafOlCommentEntityStatistics';
import LafOlCommentFieldData from '../pages/tables/LafOlCommentFieldData';
import LafOlConfig from '../pages/tables/LafOlConfig';
import LafOlFileManaged from '../pages/tables/LafOlFileManaged';
import LafOlFileUsage from '../pages/tables/LafOlFileUsage';
import LafOlHistory from '../pages/tables/LafOlHistory';
import LafOlKeyValue from '../pages/tables/LafOlKeyValue';
import LafOlKeyValueExpire from '../pages/tables/LafOlKeyValueExpire';
import LafOlLocaleFile from '../pages/tables/LafOlLocaleFile';
import LafOlLocalesLocation from '../pages/tables/LafOlLocalesLocation';
import LafOlLocalesSource from '../pages/tables/LafOlLocalesSource';
import LafOlLocalesTarget from '../pages/tables/LafOlLocalesTarget';
import LafOlMenuLinkContent from '../pages/tables/LafOlMenuLinkContent';
import LafOlMenuLinkContentData from '../pages/tables/LafOlMenuLinkContentData';
import LafOlMenuLinkContentFieldRevision from '../pages/tables/LafOlMenuLinkContentFieldRevision';
import LafOlMenuLinkContentRevision from '../pages/tables/LafOlMenuLinkContentRevision';
import LafOlMenuTree from '../pages/tables/LafOlMenuTree';
import LafOlNode from '../pages/tables/LafOlNode';
import LafOlNodeBody from '../pages/tables/LafOlNodeBody';
import LafOlNodeComment from '../pages/tables/LafOlNodeComment';
import LafOlNodeFieldImage from '../pages/tables/LafOlNodeFieldImage';
import LafOlNodeFieldTags from '../pages/tables/LafOlNodeFieldTags';
import LafOlNodeAccess from '../pages/tables/LafOlNodeAccess';
import LafOlNodeFieldData from '../pages/tables/LafOlNodeFieldData';
import LafOlNodeFieldRevision from '../pages/tables/LafOlNodeFieldRevision';
import LafOlNodeRevision from '../pages/tables/LafOlNodeRevision';
import LafOlNodeRevisionBody from '../pages/tables/LafOlNodeRevisionBody';
import LafOlNodeRevisionComment from '../pages/tables/LafOlNodeRevisionComment';
import LafOlNodeRevisionFieldImage from '../pages/tables/LafOlNodeRevisionFieldImage';
import LafOlNodeRevisionFieldTags from '../pages/tables/LafOlNodeRevisionFieldTags';
import LafOlQueue from '../pages/tables/LafOlQueue';
import LafOlRouter from '../pages/tables/LafOlRouter';
import LafOlSearchDataset from '../pages/tables/LafOlSearchDataset';
import LafOlSearchIndex from '../pages/tables/LafOlSearchIndex';
import LafOlSearchTotal from '../pages/tables/LafOlSearchTotal';
import LafOlSemaphore from '../pages/tables/LafOlSemaphore';
import LafOlSequences from '../pages/tables/LafOlSequences';
import LafOlSessions from '../pages/tables/LafOlSessions';
import LafOlShortcut from '../pages/tables/LafOlShortcut';
import LafOlShortcutFieldData from '../pages/tables/LafOlShortcutFieldData';
import LafOlShortcutSetUsers from '../pages/tables/LafOlShortcutSetUsers';
import LafOlTaxonomyIndex from '../pages/tables/LafOlTaxonomyIndex';
import LafOlTaxonomyTermParent from '../pages/tables/LafOlTaxonomyTermParent';
import LafOlTaxonomyTermData from '../pages/tables/LafOlTaxonomyTermData';
import LafOlTaxonomyTermFieldData from '../pages/tables/LafOlTaxonomyTermFieldData';
import LafOlTaxonomyTermFieldRevision from '../pages/tables/LafOlTaxonomyTermFieldRevision';
import LafOlTaxonomyTermRevision from '../pages/tables/LafOlTaxonomyTermRevision';
import LafOlTaxonomyTermRevisionParent from '../pages/tables/LafOlTaxonomyTermRevisionParent';
import LafOlUrlAlias from '../pages/tables/LafOlUrlAlias';
import LafOlUserRoles from '../pages/tables/LafOlUserRoles';
import LafOlUserUserPicture from '../pages/tables/LafOlUserUserPicture';
import LafOlUsers from '../pages/tables/LafOlUsers';
import LafOlUsersData from '../pages/tables/LafOlUsersData';
import LafOlUsersFieldData from '../pages/tables/LafOlUsersFieldData';
import LafOlWatchdog from '../pages/tables/LafOlWatchdog';;

const TableMenu = () => {
  const path = '/' + init.appName;
  return (
    <div>
      <Switch>

          <Route path={path + '/tables/lafolbatch'} component={LafOlBatch} />
          <Route path={path + '/tables/lafolblockcontent'} component={LafOlBlockContent} />
          <Route path={path + '/tables/lafolblockcontentbody'} component={LafOlBlockContentBody} />
          <Route path={path + '/tables/lafolblockcontentfielddata'} component={LafOlBlockContentFieldData} />
          <Route path={path + '/tables/lafolblockcontentfieldrevision'} component={LafOlBlockContentFieldRevision} />
          <Route path={path + '/tables/lafolblockcontentrevision'} component={LafOlBlockContentRevision} />
          <Route path={path + '/tables/lafolblockcontentrevisionbody'} component={LafOlBlockContentRevisionBody} />
          <Route path={path + '/tables/lafolcachebootstrap'} component={LafOlCacheBootstrap} />
          <Route path={path + '/tables/lafolcacheconfig'} component={LafOlCacheConfig} />
          <Route path={path + '/tables/lafolcachecontainer'} component={LafOlCacheContainer} />
          <Route path={path + '/tables/lafolcachedata'} component={LafOlCacheData} />
          <Route path={path + '/tables/lafolcachedefault'} component={LafOlCacheDefault} />
          <Route path={path + '/tables/lafolcachediscovery'} component={LafOlCacheDiscovery} />
          <Route path={path + '/tables/lafolcachedynamicpagecache'} component={LafOlCacheDynamicPageCache} />
          <Route path={path + '/tables/lafolcacheentity'} component={LafOlCacheEntity} />
          <Route path={path + '/tables/lafolcachemenu'} component={LafOlCacheMenu} />
          <Route path={path + '/tables/lafolcachepage'} component={LafOlCachePage} />
          <Route path={path + '/tables/lafolcacherender'} component={LafOlCacheRender} />
          <Route path={path + '/tables/lafolcachetags'} component={LafOlCachetags} />
          <Route path={path + '/tables/lafolcomment'} component={LafOlComment} />
          <Route path={path + '/tables/lafolcommentcommentbody'} component={LafOlCommentCommentBody} />
          <Route path={path + '/tables/lafolcommententitystatistics'} component={LafOlCommentEntityStatistics} />
          <Route path={path + '/tables/lafolcommentfielddata'} component={LafOlCommentFieldData} />
          <Route path={path + '/tables/lafolconfig'} component={LafOlConfig} />
          <Route path={path + '/tables/lafolfilemanaged'} component={LafOlFileManaged} />
          <Route path={path + '/tables/lafolfileusage'} component={LafOlFileUsage} />
          <Route path={path + '/tables/lafolhistory'} component={LafOlHistory} />
          <Route path={path + '/tables/lafolkeyvalue'} component={LafOlKeyValue} />
          <Route path={path + '/tables/lafolkeyvalueexpire'} component={LafOlKeyValueExpire} />
          <Route path={path + '/tables/lafollocalefile'} component={LafOlLocaleFile} />
          <Route path={path + '/tables/lafollocaleslocation'} component={LafOlLocalesLocation} />
          <Route path={path + '/tables/lafollocalessource'} component={LafOlLocalesSource} />
          <Route path={path + '/tables/lafollocalestarget'} component={LafOlLocalesTarget} />
          <Route path={path + '/tables/lafolmenulinkcontent'} component={LafOlMenuLinkContent} />
          <Route path={path + '/tables/lafolmenulinkcontentdata'} component={LafOlMenuLinkContentData} />
          <Route path={path + '/tables/lafolmenulinkcontentfieldrevision'} component={LafOlMenuLinkContentFieldRevision} />
          <Route path={path + '/tables/lafolmenulinkcontentrevision'} component={LafOlMenuLinkContentRevision} />
          <Route path={path + '/tables/lafolmenutree'} component={LafOlMenuTree} />
          <Route path={path + '/tables/lafolnode'} component={LafOlNode} />
          <Route path={path + '/tables/lafolnodebody'} component={LafOlNodeBody} />
          <Route path={path + '/tables/lafolnodecomment'} component={LafOlNodeComment} />
          <Route path={path + '/tables/lafolnodefieldimage'} component={LafOlNodeFieldImage} />
          <Route path={path + '/tables/lafolnodefieldtags'} component={LafOlNodeFieldTags} />
          <Route path={path + '/tables/lafolnodeaccess'} component={LafOlNodeAccess} />
          <Route path={path + '/tables/lafolnodefielddata'} component={LafOlNodeFieldData} />
          <Route path={path + '/tables/lafolnodefieldrevision'} component={LafOlNodeFieldRevision} />
          <Route path={path + '/tables/lafolnoderevision'} component={LafOlNodeRevision} />
          <Route path={path + '/tables/lafolnoderevisionbody'} component={LafOlNodeRevisionBody} />
          <Route path={path + '/tables/lafolnoderevisioncomment'} component={LafOlNodeRevisionComment} />
          <Route path={path + '/tables/lafolnoderevisionfieldimage'} component={LafOlNodeRevisionFieldImage} />
          <Route path={path + '/tables/lafolnoderevisionfieldtags'} component={LafOlNodeRevisionFieldTags} />
          <Route path={path + '/tables/lafolqueue'} component={LafOlQueue} />
          <Route path={path + '/tables/lafolrouter'} component={LafOlRouter} />
          <Route path={path + '/tables/lafolsearchdataset'} component={LafOlSearchDataset} />
          <Route path={path + '/tables/lafolsearchindex'} component={LafOlSearchIndex} />
          <Route path={path + '/tables/lafolsearchtotal'} component={LafOlSearchTotal} />
          <Route path={path + '/tables/lafolsemaphore'} component={LafOlSemaphore} />
          <Route path={path + '/tables/lafolsequences'} component={LafOlSequences} />
          <Route path={path + '/tables/lafolsessions'} component={LafOlSessions} />
          <Route path={path + '/tables/lafolshortcut'} component={LafOlShortcut} />
          <Route path={path + '/tables/lafolshortcutfielddata'} component={LafOlShortcutFieldData} />
          <Route path={path + '/tables/lafolshortcutsetusers'} component={LafOlShortcutSetUsers} />
          <Route path={path + '/tables/lafoltaxonomyindex'} component={LafOlTaxonomyIndex} />
          <Route path={path + '/tables/lafoltaxonomytermparent'} component={LafOlTaxonomyTermParent} />
          <Route path={path + '/tables/lafoltaxonomytermdata'} component={LafOlTaxonomyTermData} />
          <Route path={path + '/tables/lafoltaxonomytermfielddata'} component={LafOlTaxonomyTermFieldData} />
          <Route path={path + '/tables/lafoltaxonomytermfieldrevision'} component={LafOlTaxonomyTermFieldRevision} />
          <Route path={path + '/tables/lafoltaxonomytermrevision'} component={LafOlTaxonomyTermRevision} />
          <Route path={path + '/tables/lafoltaxonomytermrevisionparent'} component={LafOlTaxonomyTermRevisionParent} />
          <Route path={path + '/tables/lafolurlalias'} component={LafOlUrlAlias} />
          <Route path={path + '/tables/lafoluserroles'} component={LafOlUserRoles} />
          <Route path={path + '/tables/lafoluseruserpicture'} component={LafOlUserUserPicture} />
          <Route path={path + '/tables/lafolusers'} component={LafOlUsers} />
          <Route path={path + '/tables/lafolusersdata'} component={LafOlUsersData} />
          <Route path={path + '/tables/lafolusersfielddata'} component={LafOlUsersFieldData} />
          <Route path={path + '/tables/lafolwatchdog'} component={LafOlWatchdog} />
      </Switch>
  </div>
)};

export default TableMenu;