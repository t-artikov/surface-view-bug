package com.example.surfaceviewbug;

import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class MyGLSurfaceView extends GLSurfaceView {

    public MyGLSurfaceView(Context context) {
        super(context);

        setZOrderOnTop(true);
        getHolder().setFormat(PixelFormat.TRANSPARENT);

        setEGLContextClientVersion(2);
        super.setEGLConfigChooser(8 , 8, 8, 8, 16, 0);

        MyGLRenderer renderer = new MyGLRenderer();
        setRenderer(renderer);
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Intent intent = new Intent(getContext(), SecondActivity.class);
            getContext().startActivity(intent);
        }
        return true;
    }
}
