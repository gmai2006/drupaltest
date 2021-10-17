import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'fid', header: 'fid', defaultFlex: 1 },
  { name: 'uuid', header: 'uuid', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'uid', header: 'uid', defaultFlex: 1 },
  { name: 'filename', header: 'filename', defaultFlex: 1 },
  { name: 'uri', header: 'uri', defaultFlex: 1 },
  { name: 'filemime', header: 'filemime', defaultFlex: 1 },
  { name: 'filesize', header: 'filesize', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'created', header: 'created', defaultFlex: 1 },
  { name: 'changed', header: 'changed', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolfilemanaged/selectAll',{
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

const LafOlFileManaged = () => {
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

export default LafOlFileManaged;