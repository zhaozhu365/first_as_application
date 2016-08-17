package com.example.a13_1_xpuzzle.bean;

import android.graphics.Bitmap;

/**
 * Created by zhaozhu on 16/8/17.
 * 拼图Item逻辑实体类：封装逻辑相关属性
 */
public class ItemBean {

    private int itemId;
    private int bitmapId;
    private Bitmap bitmap;

    public ItemBean() {
    }

    public ItemBean(int itemId, int bitmapId, Bitmap bitmap) {
        this.itemId = itemId;
        this.bitmapId = bitmapId;
        this.bitmap = bitmap;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getBitmapId() {
        return bitmapId;
    }

    public void setBitmapId(int bitmapId) {
        this.bitmapId = bitmapId;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
