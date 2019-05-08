package com.training.example1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyViewHolder> {
    public String[]  myDataset;
    public MyAdaptor(String[]  myDataset) {
        this.myDataset = myDataset;
    }

    @NonNull
    @Override
    public MyAdaptor.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder Holder, int position) {
        Holder.textView.setText(myDataset[position]);
    }

    @Override
    public int getItemCount() {

        return myDataset.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
         public TextView textView;

        public MyViewHolder(View v) {
            super(v);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
