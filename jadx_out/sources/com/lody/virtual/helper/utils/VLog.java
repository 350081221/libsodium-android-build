package com.lody.virtual.helper.utils;

import android.os.Bundle;
import android.util.Log;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Set;

/* loaded from: classes3.dex */
public class VLog {
    public static boolean OPEN_LOG = true;
    public static final String TAG_DEFAULT = "VA";

    public static void d(String str, String str2, Object... objArr) {
        if (OPEN_LOG) {
            Log.d(str, String.format(str2, objArr));
        }
    }

    public static void e(String str, String str2) {
        if (OPEN_LOG) {
            Log.e(str, str2);
        }
    }

    public static String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static void i(String str, String str2, Object... objArr) {
        if (OPEN_LOG) {
            Log.i(str, String.format(str2, objArr));
        }
    }

    public static void logbug(String str, String str2) {
        d(str, str2, new Object[0]);
    }

    public static void printStackTrace(String str) {
        Log.e(str, getStackTraceString(new Exception()));
    }

    public static String toString(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (Reflect.on(bundle).get("mParcelledData") != null) {
            Set<String> keySet = bundle.keySet();
            StringBuilder sb = new StringBuilder("Bundle[");
            if (keySet != null) {
                for (String str : keySet) {
                    sb.append(str);
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(bundle.get(str));
                    sb.append(",");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        return bundle.toString();
    }

    public static void v(String str, String str2) {
        if (OPEN_LOG) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (OPEN_LOG) {
            Log.w(str, String.format(str2, objArr));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (OPEN_LOG) {
            Log.e(str, String.format(str2, objArr));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (OPEN_LOG) {
            Log.v(str, String.format(str2, objArr));
        }
    }

    public static void e(String str, Throwable th) {
        Log.e(str, getStackTraceString(th));
    }
}
