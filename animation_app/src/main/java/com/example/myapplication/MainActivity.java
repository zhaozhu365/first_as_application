package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {


    private TextView textView;
    private Button button;
    private Button button2;
    private Button button3;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv_1);
        button = (Button) findViewById(R.id.btn_1);
        button2 = (Button) findViewById(R.id.btn_2);
        button3 = (Button) findViewById(R.id.btn_3);
        imageView = (ImageView) findViewById(R.id.imgv_1);

        // 视图动画
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlphaAnimation aa = new AlphaAnimation(0, 1);
                aa.setDuration(1000);

                RotateAnimation ra = new RotateAnimation(0, 360, 100, 100);
                ra.setDuration(1000);
                RotateAnimation ra1 = new RotateAnimation(0, 360, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                ra1.setDuration(1000);

                TranslateAnimation ta = new TranslateAnimation(0, 200, 0, 300);
                ta.setDuration(1000);

                ScaleAnimation sa = new ScaleAnimation(0, 2, 0, 2);
                sa.setDuration(1000);
                ScaleAnimation sa1 = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                sa1.setDuration(1000);

                // 单个视图动画
//                textView.startAnimation(aa);
//                textView.startAnimation(ra);
//                textView.startAnimation(ra1);
//                textView.startAnimation(ta);
//                textView.startAnimation(sa);
                textView.startAnimation(sa1);

                // 组合视图动画
//                AnimationSet as = new AnimationSet(true);
//                as.setDuration(2000);
//                as.addAnimation(aa);
//                as.addAnimation(ra);
//                as.addAnimation(ra1);
//                as.addAnimation(ta);
//                as.addAnimation(sa);
//                as.addAnimation(sa1);
//                textView.startAnimation(AS);

            }
        });

        // 属性动画
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1
//                ObjectAnimator animator = ObjectAnimator.ofFloat(textView, "translationX", 300);
//                animator.setDuration(300);
//                animator.start();

                //2
//                PropertyValuesHolder pvh1 = PropertyValuesHolder.ofFloat("translationX", 300f);
//                PropertyValuesHolder pvh2 = PropertyValuesHolder.ofFloat("scaleX", 1f, 0, 1f);
//                PropertyValuesHolder pvh3 = PropertyValuesHolder.ofFloat("scaleY", 1f, 0, 1f);
//                ObjectAnimator.ofPropertyValuesHolder(textView, pvh1, pvh2, pvh3).setDuration(1000).start();

                //3
//                ObjectAnimator animator1 = ObjectAnimator.ofFloat(textView, "translationX", 300f);
//                ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 0f, 1f);
//                ObjectAnimator animator3 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 0f, 1f);
//                AnimatorSet set = new AnimatorSet();
//                set.setDuration(1000);
//                set.playTogether(animator1, animator2, animator3);
//                set.start();

                //4
//                Animator anim = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.scalex);
//                anim.setTarget(textView);
//                anim.start();

                //5
                textView.animate().alpha(0).y(300).setDuration(300).start();

                //6========
                TVOFFAnimator TVOFFAnimator = new TVOFFAnimator();
                TVOFFAnimator.setDuration(500);
                imageView.startAnimation(TVOFFAnimator);


            }
        });

        //3D动画
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CameraAnimator cameraAnimator = new CameraAnimator();
                cameraAnimator.setmRotateY(360);
                v.startAnimation(cameraAnimator);
            }
        });



    }


}
