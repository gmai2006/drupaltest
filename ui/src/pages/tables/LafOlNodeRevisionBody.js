import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'bundle', header: 'bundle', defaultFlex: 1 },
  { name: 'deleted', header: 'deleted', defaultFlex: 1 },
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'revisionId', header: 'revisionId', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'delta', header: 'delta', defaultFlex: 1 },
  { name: 'bodyValue', header: 'bodyValue', defaultFlex: 1 },
  { name: 'bodySummary', header: 'bodySummary', defaultFlex: 1 },
  { name: 'bodyFormat', header: 'bodyFormat', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolnoderevisionbody/selectAll',{
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

const LafOlNodeRevisionBody = () => {
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

export default LafOlNodeRevisionBody;