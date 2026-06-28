package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8761a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8762b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8763c = false;

    public static boolean a() {
        synchronized (f8761a) {
            if (!f8762b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                f8762b = true;
                HMSLog.i("HianalyticsExist", "hianalytics exist: " + f8763c);
            }
        }
        return f8763c;
    }
}
