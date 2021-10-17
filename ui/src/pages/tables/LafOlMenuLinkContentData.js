import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'revisionId', header: 'revisionId', defaultFlex: 1 },
  { name: 'bundle', header: 'bundle', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'enabled', header: 'enabled', defaultFlex: 1 },
  { name: 'title', header: 'title', defaultFlex: 1 },
  { name: 'description', header: 'description', defaultFlex: 1 },
  { name: 'menuName', header: 'menuName', defaultFlex: 1 },
  { name: 'linkUri', header: 'linkUri', defaultFlex: 1 },
  { name: 'linkTitle', header: 'linkTitle', defaultFlex: 1 },
  { name: 'linkOptions', header: 'linkOptions', defaultFlex: 1 },
  { name: 'external', header: 'external', defaultFlex: 1 },
  { name: 'rediscover', header: 'rediscover', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'expanded', header: 'expanded', defaultFlex: 1 },
  { name: 'parent', header: 'parent', defaultFlex: 1 },
  { name: 'changed', header: 'changed', defaultFlex: 1 },
  { name: 'defaultLangcode', header: 'defaultLangcode', defaultFlex: 1 },
  { name: 'revisionTranslationAffected', header: 'revisionTranslationAffected', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolmenulinkcontentdata/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const LafOlMenuLinkContentData = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default LafOlMenuLinkContentData;