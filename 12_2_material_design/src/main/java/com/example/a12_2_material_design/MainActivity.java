package com.example.a12_2_material_design;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.graphics.Palette.PaletteAsyncListener;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);

        Palette.generateAsync(bitmap,
                new PaletteAsyncListener() {
                    @Override
                    public void onGenerated(Palette palette) {
                        Palette.Swatch vibrant = palette.getDarkVibrantSwatch();
                        getActionBar().setBackgroundDrawable(new ColorDrawable(vibrant.getRgb()));
                        Window window = getWindow();
                        window.setStatusBarColor(vibrant.getRgb());
                    }
                });
    }
}
