package com.suikajy.aidldemo;

import android.app.Application;
import android.content.Intent;

import com.suikajy.debugtool.LogTools;

/**
 * @author zjy
 * @date 2018/1/31
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogTools.init(this);
    }
}
