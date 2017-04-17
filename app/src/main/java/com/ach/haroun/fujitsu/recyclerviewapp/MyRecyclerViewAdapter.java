package com.ach.haroun.fujitsu.recyclerviewapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by FUJITSU on 17/04/2017.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{
    private int mNumberItems;
    public  MyRecyclerViewAdapter(int numberItems){
        mNumberItems = numberItems;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutID = R.layout.item_number;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(layoutID, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView itemNumberView;
        public MyViewHolder(View itemView) {
            super(itemView);
            itemNumberView = (TextView) itemView.findViewById(R.id.textview_item_number);
        }
        void bind(int number){
            itemNumberView.setText(String.valueOf(number));
        }
    }
}
