import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'wid', header: 'wid', defaultFlex: 1 },
  { name: 'uid', header: 'uid', defaultFlex: 1 },
  { name: 'type', header: 'type', defaultFlex: 1 },
  { name: 'message', header: 'message', defaultFlex: 1 },
  { name: 'variables', header: 'variables', defaultFlex: 1 },
  { name: 'severity', header: 'severity', defaultFlex: 1 },
  { name: 'link', header: 'link', defaultFlex: 1 },
  { name: 'location', header: 'location', defaultFlex: 1 },
  { name: 'referer', header: 'referer', defaultFlex: 1 },
  { name: 'hostname', header: 'hostname', defaultFlex: 1 },
  { name: 'timestamp', header: 'timestamp', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolwatchdog/selectAll',{
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

const LafOlWatchdog = () => {
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

export default LafOlWatchdog;