import React from 'react';
import {
  requireNativeComponent,
  Platform,
  PermissionsAndroid,
} from 'react-native';

const RNCamera = requireNativeComponent('RNCamera');

export default RNCamera;

// export default class Camera extends React.Component<PropsType, StateType> {
//   async componentDidMount() {
//     console.log(await PermissionsAndroid.PERMISSIONS.CAMERA);
//     await PermissionsAndroid.request(PermissionsAndroid.PERMISSIONS.CAMERA);
//   }

//   render() {
//     return <RNCamera />;
//   }
// }
