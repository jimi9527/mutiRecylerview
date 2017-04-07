package com.example.mutirecylerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * author: daxiong9527
 * mail : 15570350453@163.com
 */

public class MutiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private static final int POSTION = 5 ;

    private static final int VIEWTYPE_HEADER = 0 ;
    private static final int VIEWTYPE_TWO = 1 ;
    private static final int VIEWTYPE_THREE = 2 ;

    private Context context ;

    public MutiAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0 ){
            return VIEWTYPE_HEADER ;
        }else if(position == 1 || position == 2 ){
            return VIEWTYPE_TWO ;
        }else  {
            return VIEWTYPE_THREE;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == VIEWTYPE_HEADER){
            View view = LayoutInflater.from(context).inflate(R.layout.headview,null);
            return new HeadViewholder(view);
        }else if(viewType == VIEWTYPE_TWO){
            View view = LayoutInflater.from(context).inflate(R.layout.twoview,null);
            return  new TwoViewhodler(view);
        }else{
            View view = LayoutInflater.from(context).inflate(R.layout.threeview,null);
            return new ThreeViewholder(view) ;
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof HeadViewholder){
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,400);
            ((HeadViewholder) holder).linearhead.setLayoutParams(layoutParams);
        }else if(holder instanceof  TwoViewhodler){
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,400);
            ((TwoViewhodler) holder).lineartwo.setLayoutParams(layoutParams);
        }else if(holder instanceof  ThreeViewholder){
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,400);
            ((ThreeViewholder) holder).linearthree.setLayoutParams(layoutParams);
        }

    }

    @Override
    public int getItemCount() {
        return POSTION ;
    }

    class HeadViewholder extends RecyclerView.ViewHolder{
        LinearLayout linearhead ;
        TextView textView ;
        public HeadViewholder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textview_one);
            linearhead = (LinearLayout)itemView.findViewById(R.id.linear_head);
        }
    }
    class TwoViewhodler extends RecyclerView.ViewHolder{
        LinearLayout lineartwo;
        public TwoViewhodler(View itemView) {
            super(itemView);
            lineartwo = (LinearLayout)itemView.findViewById(R.id.linear_two);

        }
    }
    class ThreeViewholder extends RecyclerView.ViewHolder{
        LinearLayout linearthree;
        public ThreeViewholder(View itemView) {
            super(itemView);
            linearthree = (LinearLayout)itemView.findViewById(R.id.linear_three);
        }
    }
}
