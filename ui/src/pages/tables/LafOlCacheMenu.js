import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'cid', header: 'cid', defaultFlex: 1 },
  { name: 'data', header: 'data', defaultFlex: 1 },
  { name: 'expire', header: 'expire', defaultFlex: 1 },
  { name: 'created', header: 'created', defaultFlex: 1 },
  { name: 'serialized', header: 'serialized', defaultFlex: 1 },
  { name: 'tags', header: 'tags', defaultFlex: 1 },
  { name: 'checksum', header: 'checksum', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolcachemenu/selectAll',{
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

const LafOlCacheMenu = () => {
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

export default LafOlCacheMenu;