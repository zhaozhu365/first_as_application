package com.example.a12_4_elevation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView img = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.img);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    long t1 = System.currentTimeMillis();
                    long t2 = System.currentTimeMillis();
                    while (t2 - t1 < 100) {
                        t2 = System.currentTimeMillis();
                    }

                    handler.sendEmptyMessage(i);
                }
            }
        }).start();
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            img.setTranslationZ(msg.what);
        }
    };
}
