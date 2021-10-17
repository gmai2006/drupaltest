import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'path', header: 'path', defaultFlex: 1 },
  { name: 'patternOutline', header: 'patternOutline', defaultFlex: 1 },
  { name: 'fit', header: 'fit', defaultFlex: 1 },
  { name: 'route', header: 'route', defaultFlex: 1 },
  { name: 'numberParts', header: 'numberParts', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolrouter/selectAll',{
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

const LafOlRouter = () => {
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

export default LafOlRouter;