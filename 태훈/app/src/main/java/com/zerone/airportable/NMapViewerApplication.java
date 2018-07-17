package com.zerone.airportable;

/**
 * Created by yoonhwan on 2018-07-15.
 */
import android.app.Application;


public class NMapViewerApplication extends Application {

    private static NMapViewerApplication instance;

    public static NMapViewerApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {

        super.onCreate();

        instance = this;
    }
}