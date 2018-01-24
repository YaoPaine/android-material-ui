package com.yaopaine.coordinatorylayout;

import android.app.Application;
import android.content.Context;

/**
 * Created by yaopaine on 1/24/18.
 */

public class BasicApp extends Application {

    private static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return mAppContext;
    }
}
