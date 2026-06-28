package com.bytedance.android.alog;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return str;
    }
}
