package com.example.anim_7_7;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by zhaozhu on 16/7/29.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1: {
                Intent intent = new Intent(MainActivity.this, PropertyTest.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_2: {
                Intent intent = new Intent(MainActivity.this, TimerTest.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_3: {
                Intent intent = new Intent(MainActivity.this, DropTest.class);
                startActivity(intent);
                break;
            }
        }
    }
}
