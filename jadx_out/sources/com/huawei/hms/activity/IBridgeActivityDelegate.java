package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

/* loaded from: classes3.dex */
public interface IBridgeActivityDelegate {
    int getRequestCode();

    void onBridgeActivityCreate(Activity activity);

    void onBridgeActivityDestroy();

    boolean onBridgeActivityResult(int i5, int i6, Intent intent);

    void onBridgeConfigurationChanged();

    void onKeyUp(int i5, KeyEvent keyEvent);
}
