package com.bondex.ysl.aroutertest;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

/**
 * date: 2019/4/30
 * Author: ysl
 * description:
 */
@Interceptor(priority = 5,name = "测试")
public class MainInterceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {

        callback.onContinue(postcard);

        Log.i("aaa","interceptor   process");

    }

    @Override
    public void init(Context context) {

        Log.i("aaa","interceptor  init");

    }
}
