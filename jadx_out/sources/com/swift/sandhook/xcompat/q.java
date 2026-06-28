package com.swift.sandhook.xcompat;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class q {
    private static volatile String processName;

    private static String doGetProcessName(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid() && (str = runningAppProcessInfo.processName) != null) {
                return str;
            }
        }
        return context.getPackageName();
    }

    public static List<ResolveInfo> findActivitiesForPackage(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (queryIntentActivities == null) {
            return new ArrayList();
        }
        return queryIntentActivities;
    }

    public static String getProcessName(Context context) {
        if (!TextUtils.isEmpty(processName)) {
            return processName;
        }
        processName = doGetProcessName(context);
        return processName;
    }

    public static boolean isMainProcess(Context context) {
        String processName2 = getProcessName(context);
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(processName2) && !TextUtils.equals(processName2, packageName)) {
            return false;
        }
        return true;
    }
}
