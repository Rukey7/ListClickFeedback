package com.dl7.listclickfeedback.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dl7.listclickfeedback.R;

import java.util.List;

/**
 * Created by long on 2017/1/4.
 */

public class RecyclerFullAdapter extends BaseRecyclerAdapter<String> {

    public RecyclerFullAdapter(Context context) {
        super(context);
    }

    public RecyclerFullAdapter(Context context, List<String> datas) {
        super(context, datas);
    }

    public RecyclerFullAdapter(Context context, String[] datas) {
        super(context, datas);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_recycler_full, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        if (position % 2 == 0) {
            viewHolder.mIvIcon.setImageResource(R.mipmap.ic_pic);
        } else {
            viewHolder.mIvIcon.setImageResource(R.mipmap.ic_pic2);
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mIvIcon;

        ViewHolder(View view) {
            super(view);
            mIvIcon = (ImageView) view.findViewById(R.id.iv_icon);
        }
    }

}