package com.yanbo.floatview;

import android.app.Application;

/**
 * 描述：
 *
 * @author Yanbo
 * @date 2018/12/14
 */
public class App extends Application {
    private static Application context;

    public static Application getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        context=this;
        super.onCreate();
    }

}
