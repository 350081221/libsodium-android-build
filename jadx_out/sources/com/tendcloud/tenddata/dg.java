package com.tendcloud.tenddata;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class dg extends cy {
    public dg() {
        a("bootTime", Long.valueOf(c()));
        a("activeTime", Long.valueOf(SystemClock.elapsedRealtime()));
        a("freeDiskSpace", Integer.valueOf(a()));
        a("batteryLevel", Integer.valueOf(k.f(ab.f11351g)));
        a("batteryState", Integer.valueOf(k.g(ab.f11351g)));
    }

    public static int a() {
        try {
            int[] u4 = k.u();
            if (u4 != null) {
                return u4[1];
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long c() {
        try {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
