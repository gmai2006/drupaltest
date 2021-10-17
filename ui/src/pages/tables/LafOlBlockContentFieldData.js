import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'revisionId', header: 'revisionId', defaultFlex: 1 },
  { name: 'type', header: 'type', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'info', header: 'info', defaultFlex: 1 },
  { name: 'changed', header: 'changed', defaultFlex: 1 },
  { name: 'reusable', header: 'reusable', defaultFlex: 1 },
  { name: 'defaultLangcode', header: 'defaultLangcode', defaultFlex: 1 },
  { name: 'revisionTranslationAffected', header: 'revisionTranslationAffected', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolblockcontentfielddata/selectAll',{
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

const LafOlBlockContentFieldData = () => {
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

export default LafOlBlockContentFieldData;