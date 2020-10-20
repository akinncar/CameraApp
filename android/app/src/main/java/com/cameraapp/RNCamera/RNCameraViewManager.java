package com.cameraapp.RNCamera;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNCameraViewManager extends ViewGroupManager<RNCameraView> {
    private static final String REACT_CLASS = "RNCamera";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RNCameraView createViewInstance(ThemedReactContext themedReactContext) {
        return new RNCameraView(themedReactContext);
    }
}
