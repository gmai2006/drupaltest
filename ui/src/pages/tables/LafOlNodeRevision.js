import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'nid', header: 'nid', defaultFlex: 1 },
  { name: 'vid', header: 'vid', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'revisionUid', header: 'revisionUid', defaultFlex: 1 },
  { name: 'revisionTimestamp', header: 'revisionTimestamp', defaultFlex: 1 },
  { name: 'revisionLog', header: 'revisionLog', defaultFlex: 1 },
  { name: 'revisionDefault', header: 'revisionDefault', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolnoderevision/selectAll',{
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

const LafOlNodeRevision = () => {
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

export default LafOlNodeRevision;