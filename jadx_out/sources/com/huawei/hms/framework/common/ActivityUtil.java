package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* loaded from: classes3.dex */
public class ActivityUtil {
    private static final String TAG = "ActivityUtil";

    public static PendingIntent getActivities(Context context, int i5, Intent[] intentArr, int i6) {
        if (context == null) {
            Logger.w(TAG, "context is null");
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i5, intentArr, i6);
        } catch (RuntimeException e5) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e5);
            return null;
        }
    }

    public static boolean isForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        if (context != null && (activityManager = (ActivityManager) ContextCompat.getSystemService(context, "activity")) != null) {
            try {
                list = activityManager.getRunningAppProcesses();
            } catch (RuntimeException e5) {
                Logger.w(TAG, "activityManager getRunningAppProcesses occur exception: ", e5);
                list = null;
            }
            if (list != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                    String str = runningAppProcessInfo.processName;
                    if (str != null && str.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                        Logger.v(TAG, "isForeground true");
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
