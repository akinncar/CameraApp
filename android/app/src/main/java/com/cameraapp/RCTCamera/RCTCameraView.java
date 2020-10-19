package com.cameraapp.RCTCamera;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Camera;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.react.uimanager.ThemedReactContext;

public class RCTCameraView extends ViewGroup{
    public RCTCameraView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        try {
            Camera.open(1);
        } catch (Exception e) {
            Log.e("RCTCamera", "failed", e);
        }
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.setBackgroundColor(Color.BLUE);
    }
}
