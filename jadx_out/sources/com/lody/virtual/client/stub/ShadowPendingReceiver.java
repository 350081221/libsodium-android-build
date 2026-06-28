package com.lody.virtual.client.stub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.lody.virtual.helper.utils.ComponentUtils;

/* loaded from: classes3.dex */
public class ShadowPendingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ComponentUtils.IntentSenderInfo intentSenderInfo;
        int i5;
        try {
            intentSenderInfo = ComponentUtils.parseIntentSenderInfo(intent, false);
        } catch (Throwable th) {
            th.printStackTrace();
            intentSenderInfo = null;
        }
        if (intentSenderInfo != null && (i5 = intentSenderInfo.userId) != -1) {
            context.sendBroadcast(ComponentUtils.proxyBroadcastIntent(intentSenderInfo.intent, i5));
        }
    }
}
