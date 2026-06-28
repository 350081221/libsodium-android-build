package io.busniess.va.delegate;

import android.os.Looper;
import com.lody.virtual.client.core.CrashHandler;
import com.lody.virtual.helper.utils.VLog;

/* loaded from: classes3.dex */
public class DefaultCrashHandler implements CrashHandler {
    private static final String TAG = "DefaultCrashHandler";

    @Override // com.lody.virtual.client.core.CrashHandler
    public void handleUncaughtException(Thread thread, Throwable th) {
        VLog.e(TAG, "DefaultCrashHandler->handleUncaughtException:" + th + ",thread:" + th);
        if (thread == Looper.getMainLooper().getThread()) {
            System.exit(0);
        }
    }
}
