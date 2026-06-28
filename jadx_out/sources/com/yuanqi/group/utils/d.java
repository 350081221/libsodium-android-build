package com.yuanqi.group.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public class d {
    public static PackageInfo a(PackageManager packageManager, String str, int i5) {
        try {
            return packageManager.getPackageArchiveInfo(str, i5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int b(Context context, String str) {
        PackageInfo a5 = a(context.getPackageManager(), str, 0);
        if (a5 == null) {
            return -1;
        }
        return a5.versionCode;
    }

    public static int c(PackageManager packageManager, String str) {
        PackageInfo a5 = a(packageManager, str, 0);
        if (a5 == null) {
            return -1;
        }
        return a5.versionCode;
    }
}
