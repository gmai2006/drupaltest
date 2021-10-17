import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'project', header: 'project', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'filename', header: 'filename', defaultFlex: 1 },
  { name: 'version', header: 'version', defaultFlex: 1 },
  { name: 'uri', header: 'uri', defaultFlex: 1 },
  { name: 'timestamp', header: 'timestamp', defaultFlex: 1 },
  { name: 'lastChecked', header: 'lastChecked', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafollocalefile/selectAll',{
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

const LafOlLocaleFile = () => {
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

export default LafOlLocaleFile;