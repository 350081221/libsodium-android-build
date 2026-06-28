package com.huawei.hms.analytics;

import android.app.AppOpsManager;
import android.content.Context;

/* loaded from: classes3.dex */
public final class dk {
    public static int lmn(Context context, String str, int i5, int i6) {
        if (context == null || context.checkPermission(str, i5, i6) == -1) {
            return -1;
        }
        String lmn = lmn(str);
        if (lmn == null) {
            return 0;
        }
        String packageName = context.getPackageName();
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i6);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        return lmn(context, lmn, packageName) != 0 ? -2 : 0;
    }

    private static int lmn(Context context, String str, String str2) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        if (appOpsManager == null) {
            return -2;
        }
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    private static String lmn(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
