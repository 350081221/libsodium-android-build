package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hms.base.log.a;
import com.huawei.hms.base.log.d;

/* loaded from: classes3.dex */
public class HMSLog {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8793a = new a();

    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + "(" + packageInfo.versionCode + ")";
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    public static void d(String str, String str2) {
        f8793a.a(3, str, str2);
    }

    public static void e(String str, String str2) {
        f8793a.a(6, str, str2);
    }

    public static void i(String str, String str2) {
        f8793a.a(4, str, str2);
    }

    public static void init(Context context, int i5, String str) {
        a aVar = f8793a;
        aVar.a(context, i5, str);
        aVar.a(str, "============================================================================\n====== " + a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f8793a.a(6);
    }

    public static boolean isInfoEnable() {
        return f8793a.a(4);
    }

    public static boolean isWarnEnable() {
        return f8793a.a(5);
    }

    public static void setExtLogger(HMSExtLogger hMSExtLogger, boolean z4) throws IllegalArgumentException {
        if (hMSExtLogger != null) {
            d dVar = new d(hMSExtLogger);
            if (z4) {
                f8793a.a(dVar);
                return;
            } else {
                f8793a.a().a(dVar);
                return;
            }
        }
        throw new IllegalArgumentException("extLogger is not able to be null");
    }

    public static void w(String str, String str2) {
        f8793a.a(5, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        f8793a.b(6, str, str2, th);
    }

    public static void e(String str, long j5, String str2) {
        f8793a.a(6, str, "[" + j5 + "] " + str2);
    }

    public static void e(String str, long j5, String str2, Throwable th) {
        f8793a.b(6, str, "[" + j5 + "] " + str2, th);
    }
}
