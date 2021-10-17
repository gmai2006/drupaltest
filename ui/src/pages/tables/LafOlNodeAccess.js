import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'nid', header: 'nid', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'fallback', header: 'fallback', defaultFlex: 1 },
  { name: 'gid', header: 'gid', defaultFlex: 1 },
  { name: 'realm', header: 'realm', defaultFlex: 1 },
  { name: 'grantView', header: 'grantView', defaultFlex: 1 },
  { name: 'grantUpdate', header: 'grantUpdate', defaultFlex: 1 },
  { name: 'grantDelete', header: 'grantDelete', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolnodeaccess/selectAll',{
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

const LafOlNodeAccess = () => {
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

export default LafOlNodeAccess;