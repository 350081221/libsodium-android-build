package com.lody.virtual.server.am;

import android.content.Intent;

/* loaded from: classes3.dex */
public class PendingNewIntent {
    public String creator;
    public Intent intent;

    public PendingNewIntent(String str, Intent intent) {
        this.creator = str;
        this.intent = intent;
    }
}
