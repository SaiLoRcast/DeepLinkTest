package com.polygalov.deeplinktest;

import android.app.Activity;
import android.os.Bundle;

import com.airbnb.deeplinkdispatch.DeepLinkHandler;

@DeepLinkHandler({SimpleModule.class, LibraryDeepLinkModule.class})
public class DeepLinkActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DeepLinkDelegate deepLinkDelegate = new DeepLinkDelegate(new SimpleModuleLoader(), new LibraryDeepLinkModuleLoader());
        deepLinkDelegate.dispatchFrom(this);

        finish();
    }
}
