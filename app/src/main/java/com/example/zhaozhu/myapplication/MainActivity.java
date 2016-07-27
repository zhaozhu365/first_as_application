package com.example.zhaozhu.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println( DensityUtil.px2dip(this, 170));

        TopBar mTopBar = (TopBar) findViewById(R.id.topbar);
        mTopBar.setOnTopBarClickListener(new TopBar.TopBarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(MainActivity.this, "left click", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(MainActivity.this, "right click", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
