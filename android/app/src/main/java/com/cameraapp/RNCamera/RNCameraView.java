package com.cameraapp.RNCamera;

import android.graphics.Color;
import android.hardware.Camera;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.react.uimanager.ThemedReactContext;

public class RNCameraView extends ViewGroup{
    private RCTCameraViewFinder _viewFinder = null;

    public RNCameraView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        try {
            Camera.open();
        } catch (Exception e) {
            Log.e("RNCamera", "failed", e);
        }
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.setBackgroundColor(Color.BLUE);
    }

}
