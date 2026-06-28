package com.lody.virtual.client.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.lody.virtual.client.ipc.VActivityManager;

/* loaded from: classes3.dex */
public class ExtLaunchAppActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("_VA_|_userid_", -1);
            String stringExtra = intent.getStringExtra("_VA_|_package_");
            if (intExtra >= 0 && stringExtra != null && !stringExtra.isEmpty()) {
                VActivityManager.get().launchApp(intExtra, stringExtra);
            }
        }
    }
}
