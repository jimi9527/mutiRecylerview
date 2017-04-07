package com.example.mutirecylerview;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * author: daxiong9527
 * mail : 15570350453@163.com
 */

public class MutiRecylerviewFragment extends Fragment {

    RecyclerView mRecylerview ;
    private Context context ;

    private ViewPager mViewPager ;
    private List<Integer> list ;
    private IndicatorView indicatorView ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mutifragment,null);
        context = getActivity() ;
        list = new ArrayList<>();

        list.add(R.mipmap.ic_launcher);
        list.add(R.mipmap.ic_launcher);
        list.add(R.mipmap.ic_launcher);

        mRecylerview = (RecyclerView) view.findViewById(R.id.recylerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        mRecylerview.setLayoutManager(linearLayoutManager);
        MutiAdapter mutiAdapter = new MutiAdapter(context);
        mRecylerview.addItemDecoration(new SpacesItemDecoration(20));
        mRecylerview.setAdapter(mutiAdapter);

        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(list,context);
        mViewPager.setAdapter(viewPagerAdapter);

        indicatorView = (IndicatorView) view.findViewById(R.id.id_indicator);
        indicatorView.setViewPager(mViewPager);

        return view;
    }
}
