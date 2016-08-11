package com.example.a12_8_2_circular_reveal;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View oval = this.findViewById(R.id.oval);
        oval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animator animator = ViewAnimationUtils.createCircularReveal(oval, oval.getWidth() / 2, oval.getHeight() / 2, oval.getWidth(), 0);
                animator.setInterpolator(new AccelerateDecelerateInterpolator());
                animator.setDuration(2000);
                animator.start();
            }
        });

        final View rect = this.findViewById(R.id.rect);
        rect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animator animator = ViewAnimationUtils.createCircularReveal(rect, 0, 0, 0, (float) Math.hypot(rect.getWidth(), rect.getHeight()));
                animator.setInterpolator(new AccelerateInterpolator());
                animator.setDuration(2000);
                animator.start();
            }
        });

    }
}
