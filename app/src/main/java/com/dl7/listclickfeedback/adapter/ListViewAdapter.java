package com.dl7.listclickfeedback.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dl7.listclickfeedback.R;

/**
 * Created by long on 2017/1/4.
 */

public class ListViewAdapter extends BaseListAdapter<String> {

    public ListViewAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.adapter_list, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tvTitle.setText(mDatas.get(position));
        if (position % 2 == 0) {
            viewHolder.ivIcon.setImageResource(R.mipmap.ic_face_funny);
        } else {
            viewHolder.ivIcon.setImageResource(R.mipmap.ic_face_sad);
        }
        return view;
    }


    public static class ViewHolder {
        public View rootView;
        public ImageView ivIcon;
        public TextView tvTitle;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.ivIcon = (ImageView) rootView.findViewById(R.id.iv_icon);
            this.tvTitle = (TextView) rootView.findViewById(R.id.tv_title);
        }
    }
}
