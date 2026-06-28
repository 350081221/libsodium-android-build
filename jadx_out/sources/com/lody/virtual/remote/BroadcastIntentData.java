package com.lody.virtual.remote;

import android.content.Intent;

/* loaded from: classes3.dex */
public class BroadcastIntentData {
    public Intent intent;
    public String targetPackage;
    public int userId;

    public BroadcastIntentData(int i5, Intent intent, String str) {
        this.userId = i5;
        this.intent = intent;
        this.targetPackage = str;
    }

    public void saveIntent(Intent intent) {
        intent.putExtra("_VA_|_user_id_", this.userId);
        intent.putExtra("_VA_|_intent_", this.intent);
        intent.putExtra("_VA_|_target_pkg_", this.targetPackage);
    }

    public BroadcastIntentData(Intent intent) {
        this.userId = intent.getIntExtra("_VA_|_user_id_", -1);
        this.intent = (Intent) intent.getParcelableExtra("_VA_|_intent_");
        this.targetPackage = intent.getStringExtra("_VA_|_target_pkg_");
    }
}
