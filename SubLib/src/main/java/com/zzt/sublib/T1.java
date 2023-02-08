package com.zzt.sublib;

import android.app.Application;
import android.util.Log;

/**
 * @author: zeting
 * @date: 2023/2/8
 */
public class T1 extends Application {
    private static final String TAG = T1.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "第一次提交");
    }
}
