package com.dl7.listclickfeedback.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dl7.listclickfeedback.R;
import com.dl7.listclickfeedback.RippleView;
import com.dl7.listclickfeedback.utils.ToastUtils;

import java.util.List;

/**
 * Created by long on 2017/1/4.
 */

public class RecyclerRippleAdapter extends BaseRecyclerAdapter<String> {

    public RecyclerRippleAdapter(Context context) {
        super(context);
    }

    public RecyclerRippleAdapter(Context context, List<String> datas) {
        super(context, datas);
    }

    public RecyclerRippleAdapter(Context context, String[] datas) {
        super(context, datas);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_recycler_ripple, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.mTvTitle.setText(mDatas.get(position));
        if (position % 2 == 0) {
            viewHolder.mIvIcon.setImageResource(R.mipmap.ic_face_funny);
        } else {
            viewHolder.mIvIcon.setImageResource(R.mipmap.ic_face_sad);
        }
        ((ViewHolder) holder).mItemRipple.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                ToastUtils.showToast(mDatas.get(position));
            }
        });
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mIvIcon;
        TextView mTvTitle;
        RippleView mItemRipple;

        ViewHolder(View view) {
            super(view);
            mIvIcon = (ImageView) view.findViewById(R.id.iv_icon);
            mTvTitle = (TextView) view.findViewById(R.id.tv_title);
            mItemRipple = (RippleView) view.findViewById(R.id.item_ripple);
        }
    }
}
