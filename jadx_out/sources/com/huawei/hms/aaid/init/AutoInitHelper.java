package com.huawei.hms.aaid.init;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.opendevice.f;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes3.dex */
public class AutoInitHelper {
    public static void doAutoInit(Context context) {
        try {
            if (isAutoInitEnabled(context)) {
                HMSLog.i("AutoInit", "Push init start");
                new Thread(new f(context)).start();
            }
        } catch (Exception e5) {
            HMSLog.e("AutoInit", "Push init failed", e5);
        }
    }

    public static boolean isAutoInitEnabled(Context context) {
        i a5 = i.a(context);
        if (a5.containsKey("push_kit_auto_init_enabled")) {
            return a5.getBoolean("push_kit_auto_init_enabled");
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("push_kit_auto_init_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void setAutoInitEnabled(Context context, boolean z4) {
        i a5 = i.a(context);
        boolean z5 = a5.getBoolean("push_kit_auto_init_enabled");
        a5.saveBoolean("push_kit_auto_init_enabled", z4);
        if (z4 && !z5) {
            doAutoInit(context);
        }
    }
}
