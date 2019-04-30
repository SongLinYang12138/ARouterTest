package com.bondex.ysl.librarybase;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * date: 2019/4/30
 * Author: ysl
 * description:
 */
public class MainApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        if(BuildConfig.DEBUG){

            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);

    }
}
