package com.efs.sdk.memoryinfo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c {
    final String activity;
    final String bg;

    /* renamed from: n, reason: collision with root package name */
    final long f6725n;

    /* renamed from: o, reason: collision with root package name */
    final long f6726o;

    /* renamed from: p, reason: collision with root package name */
    final long f6727p;

    /* renamed from: q, reason: collision with root package name */
    final long f6728q;

    /* renamed from: r, reason: collision with root package name */
    final float f6729r;

    /* renamed from: s, reason: collision with root package name */
    final long f6730s;

    /* renamed from: t, reason: collision with root package name */
    final long f6731t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        String str;
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo = null;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length > 0) {
                memoryInfo = processMemoryInfo[0];
            }
        } catch (Throwable unused) {
        }
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        }
        if (UMMemoryMonitor.get().isForeground()) {
            str = "fg";
        } else {
            str = "bg";
        }
        this.bg = str;
        this.f6725n = memoryInfo.getTotalPss() * 1024;
        this.f6726o = memoryInfo.dalvikPss * 1024;
        this.f6727p = memoryInfo.nativePss * 1024;
        this.f6730s = f.a(memoryInfo) * 1024;
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.f6728q = freeMemory;
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory != 0) {
            this.f6729r = (((float) freeMemory) * 1.0f) / ((float) maxMemory);
        } else {
            this.f6729r = 1.0f;
        }
        this.f6731t = f.a() * 1024;
        this.activity = UMMemoryMonitor.get().getCurrentActivity();
    }
}
