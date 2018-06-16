package com.polygalov.deeplinktest;

import android.app.Application;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

import com.airbnb.deeplinkdispatch.DeepLinkHandler;

public class AppLink extends Application {

    @Override public void onCreate() {
        super.onCreate();
        IntentFilter intentFilter = new IntentFilter(DeepLinkHandler.ACTION);
        LocalBroadcastManager.getInstance(this).registerReceiver(new DeepLinkReceiver(), intentFilter);
    }
}