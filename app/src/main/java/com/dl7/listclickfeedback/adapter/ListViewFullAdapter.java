package com.dl7.listclickfeedback.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dl7.listclickfeedback.R;

/**
 * Created by long on 2017/1/4.
 */

public class ListViewFullAdapter extends BaseListAdapter<String> {

    public ListViewFullAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.adapter_list_full, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (position % 2 == 0) {
            viewHolder.ivIcon.setImageResource(R.mipmap.ic_pic);
        } else {
            viewHolder.ivIcon.setImageResource(R.mipmap.ic_pic2);
        }
        return view;
    }


    public static class ViewHolder {
        public View rootView;
        public ImageView ivIcon;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.ivIcon = (ImageView) rootView.findViewById(R.id.iv_icon);
        }
    }
}

