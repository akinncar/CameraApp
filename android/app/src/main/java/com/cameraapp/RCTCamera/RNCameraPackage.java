package com.cameraapp.RCTCamera;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.List;

public class RNCameraPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(
//            new RCTCameraModule(reactApplicationContext),
//            new CameraModule(reactApplicationContext)
        );
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(
            new RCTCameraViewManager()
        );
    }
}