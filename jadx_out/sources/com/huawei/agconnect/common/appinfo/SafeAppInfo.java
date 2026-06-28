package com.huawei.agconnect.common.appinfo;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.agconnect.common.api.Logger;

/* loaded from: classes3.dex */
public class SafeAppInfo {
    private static final String TAG = "SafeAppInfo";

    public static ApplicationInfo safeGetApplicationInfo(PackageManager packageManager, String str, int i5) {
        try {
            return packageManager.getApplicationInfo(str, i5);
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.e(TAG, "not found", e5);
            return null;
        } catch (RuntimeException unused) {
            Logger.e(TAG, "get ApplicationInfo Exception: " + str);
            return null;
        }
    }

    public static PackageInfo safeGetPackageInfo(PackageManager packageManager, String str, int i5) {
        try {
            return packageManager.getPackageInfo(str, i5);
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.e(TAG, "not found", e5);
            return null;
        } catch (RuntimeException unused) {
            Logger.e(TAG, "get PackageInfo Exception: " + str);
            return null;
        }
    }
}
