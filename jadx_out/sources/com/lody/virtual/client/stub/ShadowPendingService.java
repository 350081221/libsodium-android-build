package com.lody.virtual.client.stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.utils.ComponentUtils;

/* loaded from: classes3.dex */
public class ShadowPendingService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i5, int i6) {
        ComponentUtils.IntentSenderInfo intentSenderInfo;
        stopSelf();
        try {
            intentSenderInfo = ComponentUtils.parseIntentSenderInfo(intent, false);
        } catch (Throwable th) {
            th.printStackTrace();
            intentSenderInfo = null;
        }
        if (intentSenderInfo != null && intentSenderInfo.userId != -1) {
            VActivityManager.get().startService(this, intentSenderInfo.intent, intentSenderInfo.userId);
            return 2;
        }
        return 2;
    }
}
