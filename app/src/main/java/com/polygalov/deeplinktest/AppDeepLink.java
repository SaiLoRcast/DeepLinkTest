package com.polygalov.deeplinktest;

import com.airbnb.deeplinkdispatch.DeepLinkSpec;

@DeepLinkSpec(prefix = { "example://example" })
public @interface AppDeepLink {

    String[] value();
}