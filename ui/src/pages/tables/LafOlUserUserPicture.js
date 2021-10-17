import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'bundle', header: 'bundle', defaultFlex: 1 },
  { name: 'deleted', header: 'deleted', defaultFlex: 1 },
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'revisionId', header: 'revisionId', defaultFlex: 1 },
  { name: 'langcode', header: 'langcode', defaultFlex: 1 },
  { name: 'delta', header: 'delta', defaultFlex: 1 },
  { name: 'userPictureTargetId', header: 'userPictureTargetId', defaultFlex: 1 },
  { name: 'userPictureAlt', header: 'userPictureAlt', defaultFlex: 1 },
  { name: 'userPictureTitle', header: 'userPictureTitle', defaultFlex: 1 },
  { name: 'userPictureWidth', header: 'userPictureWidth', defaultFlex: 1 },
  { name: 'userPictureHeight', header: 'userPictureHeight', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafoluseruserpicture/selectAll',{
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

const LafOlUserUserPicture = () => {
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

export default LafOlUserUserPicture;