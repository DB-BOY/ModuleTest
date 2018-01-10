package com.example.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


/**
 * Created by chendong on 2018/1/8.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
}
