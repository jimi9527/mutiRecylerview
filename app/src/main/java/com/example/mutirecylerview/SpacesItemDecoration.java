package com.example.mutirecylerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * author: daxiong9527
 * mail : 15570350453@163.com
 */

public class SpacesItemDecoration extends RecyclerView.ItemDecoration{
    private int space ;


    public SpacesItemDecoration(int space) {
        this.space = space;
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = space ;
    }
}
