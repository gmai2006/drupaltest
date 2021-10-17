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
  { name: 'fieldImageTargetId', header: 'fieldImageTargetId', defaultFlex: 1 },
  { name: 'fieldImageAlt', header: 'fieldImageAlt', defaultFlex: 1 },
  { name: 'fieldImageTitle', header: 'fieldImageTitle', defaultFlex: 1 },
  { name: 'fieldImageWidth', header: 'fieldImageWidth', defaultFlex: 1 },
  { name: 'fieldImageHeight', header: 'fieldImageHeight', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'lafolnodefieldimage/selectAll',{
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

const LafOlNodeFieldImage = () => {
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

export default LafOlNodeFieldImage;