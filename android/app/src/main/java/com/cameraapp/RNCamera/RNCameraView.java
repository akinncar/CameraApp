package com.cameraapp.RNCamera;

import android.graphics.Color;
import android.hardware.Camera;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

import com.facebook.react.uimanager.ThemedReactContext;

public class RNCameraView extends ViewGroup {
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
        final View preview = getView();
        this.setBackgroundColor(Color.BLUE);
        int width = right - left;
        int height = bottom - top;
        preview.layout(0, 0, width, height);
    }
}
