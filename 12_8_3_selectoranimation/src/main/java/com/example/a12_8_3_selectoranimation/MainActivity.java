package com.example.a12_8_3_selectoranimation;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);

        StateListAnimator stateListAnimator = AnimatorInflater.loadStateListAnimator(this, R.drawable.anim_change);
        button.setStateListAnimator(stateListAnimator);

    }
}
