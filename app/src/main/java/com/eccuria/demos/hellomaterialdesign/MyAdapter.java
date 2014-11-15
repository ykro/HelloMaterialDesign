package com.eccuria.demos.hellomaterialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ykro on 11/15/14.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>  {
    private String[] dataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtContent;
        public ViewHolder(View v) {
            super(v);
            txtContent = (TextView)v.findViewById(R.id.txtContent);
        }
    }

    public MyAdapter(String[] dataset) {
        this.dataset = dataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtContent.setText(dataset[position]);
    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }
}