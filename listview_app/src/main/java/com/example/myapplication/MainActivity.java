package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    private int mMaxOverDistance = 1;

    public void initView() {
        DisplayMetrics metrics = getApplicationContext().getResources().getDisplayMetrics();
        float density = metrics.density;
        Toast.makeText(this, "" + density, Toast.LENGTH_SHORT).show();
        mMaxOverDistance = (int) (density * mMaxOverDistance);
        Toast.makeText(this, "" + mMaxOverDistance, Toast.LENGTH_SHORT).show();
    }
}
