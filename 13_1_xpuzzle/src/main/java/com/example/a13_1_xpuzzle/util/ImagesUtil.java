package com.example.a13_1_xpuzzle.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

import com.example.a13_1_xpuzzle.R;
import com.example.a13_1_xpuzzle.activity.PuzzleMain;
import com.example.a13_1_xpuzzle.bean.ItemBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaozhu on 16/8/17.
 */
public class ImagesUtil {

    public ItemBean itemBean;

    /**
     * 切图、初始状态（正常顺序）
     *
     * @param type        游戏种类
     * @param picSelected 选择的图片
     * @param context     context
     */
    public void createInitBitmaps(int type, Bitmap picSelected, Context context) {
        Bitmap bitmap = null;
        List<Bitmap> bitmapItems = new ArrayList<Bitmap>();
        // 每个Item的宽高
        int itemWidth = picSelected.getWidth() / type;
        int itemHeight = picSelected.getHeight() / type;
        for (int i = 0; i < type; i++) {
            for (int j = 0; j < type; j++) {
                bitmap = Bitmap.createBitmap(picSelected, j * itemWidth, i * itemHeight, itemWidth, itemHeight);
                bitmapItems.add(bitmap);
                itemBean = new ItemBean(i * type + j + 1, i * type + j + 1, bitmap);
                GameUtil.mItemBeans.add(itemBean);
            }
        }

        // 保存最后一个图片在拼图完成式填充
        PuzzleMain.mLastBitmap = bitmapItems.get(type * type - 1);
        // 设置最后一个为空Item
        bitmapItems.remove(type * type - 1);
        GameUtil.mItemBeans.remove(type * type - 1);
        Bitmap blankBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.blank);
        blankBitmap = Bitmap.createBitmap(blankBitmap, 0, 0, itemWidth, itemHeight);
        bitmapItems.add(blankBitmap);
        GameUtil.mItemBeans.add(new ItemBean(type * type, 0, blankBitmap));
        GameUtil.mBlankItemBean = GameUtil.mItemBeans.get(type * type - 1);
    }

    /**
     * 处理图片 放大、缩小到合适位置
     *
     * @param newWidth  缩放后Width
     * @param newHeight 缩放后Height
     * @param bitmap    bitmap
     * @return bitmap
     */
    public Bitmap resizeBitmap(float newWidth, float newHeight, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postScale(newWidth / bitmap.getWidth(), newHeight / bitmap.getHeight());
        Bitmap newBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        return newBitmap;
    }


}
