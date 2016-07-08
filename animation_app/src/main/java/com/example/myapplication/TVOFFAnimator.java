package com.example.myapplication;

import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by zhaozhu on 16/7/7.
 *
 */
public class TVOFFAnimator extends Animation {

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {

        final Matrix matrix = t.getMatrix();
        matrix.preScale(1, 1 - interpolatedTime, mCenterWidth, mCenterHeight);

    }

    float mCenterWidth;
    float mCenterHeight;

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        mCenterWidth = width / 2;
        mCenterHeight = height / 2;
        setInterpolator(new AccelerateDecelerateInterpolator());
    }
}
