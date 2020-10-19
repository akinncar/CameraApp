package com.cameraapp.RCTCamera;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class RCTCameraViewManager extends SimpleViewManager<RCTCameraView> {
    private static final String REACT_CLASS = "RCTCamera";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RCTCameraView createViewInstance(ThemedReactContext themedReactContext) {
        return new RCTCameraView(themedReactContext);
    }
}
