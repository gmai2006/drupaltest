import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'entityType', header: 'entityType', defaultFlex: 1 },
  { name: 'fieldName', header: 'fieldName', defaultFlex: 1 },
  { name: 'cid', header: 'cid', defaultFlex: 1 },
  { name: 'lastCommentTimestamp', header: 'lastCommentTimestamp', defaultFlex: 1 },
  { name: 'lastCommentName', header: 'lastCommentName', defaultFlex: 1 },
  { name: 'lastCommentUid', header: 'lastCommentUid', defaultFlex: 1 },
  { name: 'commentCount', header: 'commentCount', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolcommententitystatistics/selectAll',{
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

const LafOlCommentEntityStatistics = () => {
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

export default LafOlCommentEntityStatistics;