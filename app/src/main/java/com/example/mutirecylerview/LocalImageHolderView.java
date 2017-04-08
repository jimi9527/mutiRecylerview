package com.example.mutirecylerview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;

/**
 * author: daxiong9527
 * mail : 15570350453@163.com
 */

public class LocalImageHolderView implements Holder<Integer>{
    private ImageView imageView;
    @Override
    public View createView(Context context) {
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, int position, Integer data) {
            imageView.setImageResource(data);
    }
}
