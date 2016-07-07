package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv_1);
        button = (Button) findViewById(R.id.btn_1);

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

    }


}
