import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'uid', header: 'uid', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'preferredLangcode', header: 'preferredLangcode', defaultFlex: 1 },
  { name: 'preferredAdminLangcode', header: 'preferredAdminLangcode', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'pass', header: 'pass', defaultFlex: 1 },
  { name: 'mail', header: 'mail', defaultFlex: 1 },
  { name: 'timezone', header: 'timezone', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'created', header: 'created', defaultFlex: 1 },
  { name: 'changed', header: 'changed', defaultFlex: 1 },
  { name: 'access', header: 'access', defaultFlex: 1 },
  { name: 'login', header: 'login', defaultFlex: 1 },
  { name: 'init', header: 'init', defaultFlex: 1 },
  { name: 'defaultLangcode', header: 'defaultLangcode', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolusersfielddata/selectAll',{
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

const LafOlUsersFieldData = () => {
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

export default LafOlUsersFieldData;