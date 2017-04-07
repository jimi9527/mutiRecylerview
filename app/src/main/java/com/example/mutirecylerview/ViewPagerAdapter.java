package com.example.mutirecylerview;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * author: daxiong9527
 * mail : 15570350453@163.com
 */

public class ViewPagerAdapter extends PagerAdapter {

    private List<Integer> list ;
    private Context context ;

    public ViewPagerAdapter(List<Integer> list,Context context ) {
        this.list = list ;
        this.context = context ;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object ;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pager,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setBackgroundResource(list.get(position));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}