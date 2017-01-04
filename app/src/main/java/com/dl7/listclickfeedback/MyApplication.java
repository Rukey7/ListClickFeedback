package com.dl7.listclickfeedback;

import android.app.Application;

import com.dl7.listclickfeedback.utils.ToastUtils;

/**
 * Created by long on 2017/1/4.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtils.init(this);
    }
}
