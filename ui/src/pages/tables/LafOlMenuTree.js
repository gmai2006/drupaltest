import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'menuName', header: 'menuName', defaultFlex: 1 },
  { name: 'mlid', header: 'mlid', defaultFlex: 1 },
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'parent', header: 'parent', defaultFlex: 1 },
  { name: 'routeName', header: 'routeName', defaultFlex: 1 },
  { name: 'routeParamKey', header: 'routeParamKey', defaultFlex: 1 },
  { name: 'routeParameters', header: 'routeParameters', defaultFlex: 1 },
  { name: 'url', header: 'url', defaultFlex: 1 },
  { name: 'title', header: 'title', defaultFlex: 1 },
  { name: 'description', header: 'description', defaultFlex: 1 },
  { name: 'class', header: 'class', defaultFlex: 1 },
  { name: 'options', header: 'options', defaultFlex: 1 },
  { name: 'provider', header: 'provider', defaultFlex: 1 },
  { name: 'enabled', header: 'enabled', defaultFlex: 1 },
  { name: 'discovered', header: 'discovered', defaultFlex: 1 },
  { name: 'expanded', header: 'expanded', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'metadata', header: 'metadata', defaultFlex: 1 },
  { name: 'hasChildren', header: 'hasChildren', defaultFlex: 1 },
  { name: 'depth', header: 'depth', defaultFlex: 1 },
  { name: 'p1', header: 'p1', defaultFlex: 1 },
  { name: 'p2', header: 'p2', defaultFlex: 1 },
  { name: 'p3', header: 'p3', defaultFlex: 1 },
  { name: 'p4', header: 'p4', defaultFlex: 1 },
  { name: 'p5', header: 'p5', defaultFlex: 1 },
  { name: 'p6', header: 'p6', defaultFlex: 1 },
  { name: 'p7', header: 'p7', defaultFlex: 1 },
  { name: 'p8', header: 'p8', defaultFlex: 1 },
  { name: 'p9', header: 'p9', defaultFlex: 1 },
  { name: 'formClass', header: 'formClass', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolmenutree/selectAll',{
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

const LafOlMenuTree = () => {
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

export default LafOlMenuTree;