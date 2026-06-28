package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes3.dex */
public class p {
    public static boolean a() {
        int i5 = HwBuildEx.VERSION.EMUI_SDK_INT;
        HMSLog.d("CommFun", "Emui Api Level:" + i5);
        return i5 > 0;
    }

    public static long b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    public static boolean c(Context context) {
        if (a() && HwBuildEx.VERSION.EMUI_SDK_INT < 21 && b(context) < 110001400) {
            return true;
        }
        return false;
    }

    public static String a(Context context) {
        String str = context.createDeviceProtectedStorageContext().getDataDir() + "";
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("CommFun", "get storage root path of the current user failed.");
        }
        return str;
    }
}
