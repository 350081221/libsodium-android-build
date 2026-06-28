package com.lody.virtual.remote;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import com.lody.virtual.helper.compat.BundleCompat;

/* loaded from: classes3.dex */
public class ShadowActivityInfo {
    public ActivityInfo info;
    public Intent intent;
    public int userId;
    public IBinder virtualToken;

    public ShadowActivityInfo(Intent intent, ActivityInfo activityInfo, int i5, IBinder iBinder) {
        this.intent = intent;
        this.info = activityInfo;
        this.userId = i5;
        this.virtualToken = iBinder;
    }

    public void saveToIntent(Intent intent) {
        intent.putExtra("_VA_|_intent_", this.intent);
        intent.putExtra("_VA_|_info_", this.info);
        intent.putExtra("_VA_|_user_id_", this.userId);
        BundleCompat.putBinder(intent, "_VA_|_token_", this.virtualToken);
    }

    public ShadowActivityInfo(Intent intent) {
        try {
            this.intent = (Intent) intent.getParcelableExtra("_VA_|_intent_");
            this.info = (ActivityInfo) intent.getParcelableExtra("_VA_|_info_");
            this.userId = intent.getIntExtra("_VA_|_user_id_", -1);
            this.virtualToken = BundleCompat.getBinder(intent, "_VA_|_token_");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
