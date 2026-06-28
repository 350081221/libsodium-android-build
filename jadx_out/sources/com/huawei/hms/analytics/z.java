package com.huawei.hms.analytics;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;

/* loaded from: classes3.dex */
public final class z {
    public static boolean ghi() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) || !TextUtils.isEmpty(dg.lmn("ro.miui.ui.version.name", ""));
    }

    public static boolean hij() {
        return "VIVO".equalsIgnoreCase(Build.MANUFACTURER) || !TextUtils.isEmpty(dg.lmn("ro.vivo.os.version", ""));
    }

    public static boolean ijk() {
        return "BLACKSHARK".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean ikl() {
        String str = Build.MANUFACTURER;
        return BaseConstants.ROM_OPPO_UPPER_CONSTANT.equalsIgnoreCase(str) || "REALME".equalsIgnoreCase(str) || !TextUtils.isEmpty(dg.lmn("ro.build.version.opporom", ""));
    }

    public static boolean klm() {
        return !TextUtils.isEmpty(ar.lmn().lmn.lmn);
    }

    public static boolean lmn() {
        String str = Build.MANUFACTURER;
        return "HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str);
    }
}
