package com.example.myapplication;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.Transformation;

/**
 * Created by zhaozhu on 16/7/7.
 */
public class CameraAnimator extends Animation {

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        setDuration(2000);
        setFillAfter(true);
        setInterpolator(new BounceInterpolator());
        mCenterWidth = width / 2;
        mCenterHeight = height / 2;
    }

    private float mCenterWidth;
    private float mCenterHeight;
    private Camera mCamera = new Camera();
    private float mRotateY = 0f;

    public void setmRotateY(float mRotateY) {
        this.mRotateY = mRotateY;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        final Matrix matrix = t.getMatrix();
        mCamera.save();
        mCamera.rotateY(mRotateY * interpolatedTime);
        mCamera.getMatrix(matrix);
        mCamera.restore();

        matrix.preTranslate(mCenterWidth, mCenterHeight);
        matrix.postTranslate(-mCenterWidth, -mCenterHeight);

    }
}
