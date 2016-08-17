package com.example.a13_1_xpuzzle.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by zhaozhu on 16/8/17.
 */
public class GridItemsAdapter extends BaseAdapter {

    private List<Bitmap> mBimapItemList;
    private Context mContext;

    public GridItemsAdapter(Context mContext, List<Bitmap> picList) {
        this.mContext = mContext;
        this.mBimapItemList = picList;
    }

    @Override
    public int getCount() {
        return mBimapItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mBimapItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv_pic_item = null;
        if (convertView == null) {
            iv_pic_item = new ImageView(mContext);
            // 设置布局 图片
            iv_pic_item.setLayoutParams(new GridView.LayoutParams(
                    mBimapItemList.get(position).getWidth(),
                    mBimapItemList.get(position).getHeight()));
            // 设置显示比例类型
            iv_pic_item.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }else {
            iv_pic_item = (ImageView) convertView;
        }
        iv_pic_item.setImageBitmap(mBimapItemList.get(position));
        return iv_pic_item;
    }
}
