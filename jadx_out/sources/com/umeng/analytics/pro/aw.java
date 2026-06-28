package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;
import com.umeng.commonsdk.debug.UMRTLog;

/* loaded from: classes3.dex */
public class aw {

    /* renamed from: a, reason: collision with root package name */
    private static av f12220a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f12221b = false;

    public static synchronized String a(Context context) {
        synchronized (aw.class) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** real call OpenDeviceId.getOaid()");
            if (context != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    b(context);
                    av avVar = f12220a;
                    if (avVar != null) {
                        try {
                            return avVar.a(context);
                        } catch (Exception unused) {
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            throw new RuntimeException("Context is null");
        }
    }

    private static void b(Context context) {
        if (f12220a == null && !f12221b) {
            synchronized (aw.class) {
                if (f12220a == null && !f12221b) {
                    f12220a = ay.a(context);
                    f12221b = true;
                }
            }
        }
    }
}
