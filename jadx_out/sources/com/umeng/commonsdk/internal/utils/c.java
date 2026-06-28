package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13178a = "BatteryUtils";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f13179b = false;

    /* renamed from: c, reason: collision with root package name */
    private static Context f13180c;

    /* renamed from: d, reason: collision with root package name */
    private BroadcastReceiver f13181d;

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13183a = new c();

        private a() {
        }
    }

    public static c a(Context context) {
        if (f13180c == null && context != null) {
            f13180c = context.getApplicationContext();
        }
        return a.f13183a;
    }

    public synchronized void b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f13180c.registerReceiver(this.f13181d, intentFilter);
            f13179b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f13180c, th);
        }
    }

    public synchronized void c() {
        try {
            f13180c.unregisterReceiver(this.f13181d);
            f13179b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f13180c, th);
        }
    }

    private c() {
        this.f13181d = new BroadcastReceiver() { // from class: com.umeng.commonsdk.internal.utils.c.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "ACTION_BATTERY_CHANGED：battery info cc.");
                        int i5 = 0;
                        int intExtra = intent.getIntExtra("level", 0);
                        int intExtra2 = intent.getIntExtra("voltage", 0);
                        int intExtra3 = intent.getIntExtra("temperature", 0);
                        int intExtra4 = intent.getIntExtra("status", 0);
                        int i6 = -1;
                        if (intExtra4 != 1) {
                            if (intExtra4 != 2) {
                                if (intExtra4 != 4) {
                                    if (intExtra4 == 5) {
                                        i6 = 2;
                                    }
                                } else {
                                    i6 = 0;
                                }
                            } else {
                                i6 = 1;
                            }
                        }
                        int intExtra5 = intent.getIntExtra("plugged", 0);
                        if (intExtra5 != 1) {
                            if (intExtra5 == 2) {
                                i5 = 2;
                            }
                        } else {
                            i5 = 1;
                        }
                        b bVar = new b();
                        bVar.f13172a = intExtra;
                        bVar.f13173b = intExtra2;
                        bVar.f13175d = i6;
                        bVar.f13174c = intExtra3;
                        bVar.f13176e = i5;
                        bVar.f13177f = System.currentTimeMillis();
                        UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.f13127h, com.umeng.commonsdk.internal.b.a(c.f13180c).a(), bVar);
                        c.this.c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(c.f13180c, th);
                }
            }
        };
    }

    public synchronized boolean a() {
        return f13179b;
    }
}
