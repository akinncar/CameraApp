package com.cameraapp.RNCamera;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNCameraViewManager extends SimpleViewManager<RNCameraView> {
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
