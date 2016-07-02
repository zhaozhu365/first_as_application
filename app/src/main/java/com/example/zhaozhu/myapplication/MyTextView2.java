package com.example.zhaozhu.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by zhaozhu on 16/7/1.
 */
public class MyTextView2 extends TextView {


    public MyTextView2(Context context) {
        super(context);
    }

    public MyTextView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (matrix != null) {
            mTranslate += mViewWidth / 5;
            if (mTranslate > 2 * mViewWidth) {
                mTranslate = -mViewWidth;
            }
            matrix.setTranslate(mTranslate, 0);
            mLinearGradient.setLocalMatrix(matrix);
            postInvalidateDelayed(100);
        }
    }

    private Paint mPaint = null;
    private int mViewWidth;
    private int mTranslate;
    private LinearGradient mLinearGradient = null;
    private Matrix matrix = null;

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mViewWidth == 0) {
            mViewWidth = getMeasuredWidth();
            if (mViewWidth > 0) {
                mPaint = getPaint();
                mLinearGradient = new LinearGradient(0, 0, mViewWidth, 0, new int[]{Color.BLUE, 0xffffffff, Color.BLUE}, null, Shader.TileMode.CLAMP);
                mPaint.setShader(mLinearGradient);
                matrix = new Matrix();
            }
        }


    }


}
