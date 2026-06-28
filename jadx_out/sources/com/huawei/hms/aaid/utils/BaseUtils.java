package com.huawei.hms.aaid.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.d;
import com.huawei.hms.opendevice.e;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.opendevice.n;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class BaseUtils {
    public static void clearSubjectIds(Context context) {
        i.a(context).removeKey("subjectId");
    }

    public static void delLocalToken(Context context, String str) {
        i.a(context).c(str);
    }

    public static void deleteAllTokenCache(Context context) {
        i.a(context).a();
    }

    public static void deleteCacheData(Context context, String str) {
        i.a(context).removeKey(str);
    }

    public static String getBaseUrl(Context context, String str, String str2, String str3, String str4) {
        return e.a(context, str, str2, str3, str4);
    }

    public static String getCacheData(Context context, String str, boolean z4) {
        if (z4) {
            return i.a(context).a(str);
        }
        return i.a(context).getString(str);
    }

    public static String getLocalToken(Context context, String str) {
        return i.a(context).b(str);
    }

    public static boolean getProxyInit(Context context) {
        return i.a(context).getBoolean("_proxy_init");
    }

    public static String[] getSubjectIds(Context context) {
        String string = i.a(context).getString("subjectId");
        if (TextUtils.isEmpty(string)) {
            return new String[0];
        }
        return string.split(",");
    }

    public static void initSecret(Context context) {
        b.a(context);
    }

    public static boolean isMainProc(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            HMSLog.w("BaseUtils", "get running app processes null!");
            return false;
        }
        String str = context.getApplicationInfo().processName;
        int myPid = Process.myPid();
        HMSLog.i("BaseUtils", "my.pid -> " + myPid + ", mainProcessName -> " + str);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            HMSLog.i("BaseUtils", "info.pid -> " + runningAppProcessInfo.pid + ", info.processName -> " + runningAppProcessInfo.processName);
            if (runningAppProcessInfo.pid == myPid && str.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public static void reportAaidToken(Context context, String str) {
        n.a(context, str);
    }

    public static boolean saveCacheData(Context context, String str, String str2, boolean z4) {
        if (z4) {
            return i.a(context).a(str, str2);
        }
        return i.a(context).saveString(str, str2);
    }

    public static void saveProxyInit(Context context, boolean z4) {
        i.a(context).saveBoolean("_proxy_init", z4);
    }

    public static void saveToken(Context context, String str, String str2) {
        i.a(context).b(str, str2);
    }

    public static String sendPostRequest(Context context, String str, String str2, Map<String, String> map) {
        return d.a(context, str, str2, map);
    }
}
