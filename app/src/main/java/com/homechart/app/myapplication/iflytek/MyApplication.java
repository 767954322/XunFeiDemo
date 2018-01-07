package com.homechart.app.myapplication.iflytek;

import android.app.Application;

import com.homechart.app.myapplication.R;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by gumenghao on 18/1/7.
 */

public class MyApplication extends Application{


    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(MyApplication.this, "appid=" + getString(R.string.app_id));
    }
}
