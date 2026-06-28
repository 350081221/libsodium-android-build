package com.bytedance.android.openliveplugin.stub.logger;

import android.util.Log;

/* loaded from: classes2.dex */
public class TTLogger {
    private static boolean DEBUG = false;
    private static final String TAG = "TTLiveLogger";
    private static int sLevel = 4;

    public static void d(String str) {
        if (DEBUG) {
            d(TAG, str);
        }
    }

    public static void d(String str, String str2) {
        if (DEBUG && str2 != null && sLevel <= 3) {
            Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (DEBUG) {
            if (!(str2 == null && th == null) && sLevel <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    public static void d(String str, Object... objArr) {
        if (DEBUG && objArr != null && sLevel <= 3) {
            Log.d(str, formatMsgs(objArr));
        }
    }

    public static boolean debug() {
        return sLevel <= 3;
    }

    public static void e(String str) {
        if (DEBUG) {
            e(TAG, str);
        }
    }

    public static void e(String str, String str2) {
        if (DEBUG && str2 != null && sLevel <= 6) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (DEBUG) {
            if (!(str2 == null && th == null) && sLevel <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    public static void e(String str, Object... objArr) {
        if (DEBUG && objArr != null && sLevel <= 6) {
            Log.v(str, formatMsgs(objArr));
        }
    }

    private static String formatMsgs(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = objArr[i5];
            sb.append(obj != null ? obj.toString() : " null ");
            sb.append(" ");
        }
        return sb.toString();
    }

    public static int getLogLevel() {
        return sLevel;
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1);
    }

    public static void i(String str) {
        if (DEBUG) {
            i(TAG, str);
        }
    }

    public static void i(String str, String str2) {
        if (DEBUG && str2 != null && sLevel <= 4) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (DEBUG) {
            if (!(str2 == null && th == null) && sLevel <= 4) {
                Log.i(str, str2, th);
            }
        }
    }

    public static void i(String str, Object... objArr) {
        if (DEBUG && objArr != null && sLevel <= 4) {
            Log.v(str, formatMsgs(objArr));
        }
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    public static void logDirect(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (str == null) {
            str = TAG;
        }
        Log.i(str, str2);
    }

    public static void openDebugMode() {
        DEBUG = true;
        setLogLevel(3);
    }

    public static void setLogLevel(int i5) {
        sLevel = i5;
    }

    public static void st(String str, int i5) {
        try {
            throw new Exception();
        } catch (Exception e5) {
            StackTraceElement[] stackTrace = e5.getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i6 = 1; i6 < Math.min(i5, stackTrace.length); i6++) {
                if (i6 > 1) {
                    sb.append("\n");
                }
                sb.append(getSimpleClassName(stackTrace[i6].getClassName()));
                sb.append(".");
                sb.append(stackTrace[i6].getMethodName());
            }
            v(str, sb.toString());
        }
    }

    public static void v(String str) {
        v(TAG, str);
    }

    public static void v(String str, String str2) {
        if (DEBUG && str2 != null && sLevel <= 2) {
            Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (DEBUG) {
            if (!(str2 == null && th == null) && sLevel <= 2) {
                Log.v(str, str2, th);
            }
        }
    }

    public static void v(String str, Object... objArr) {
        if (DEBUG && objArr != null && sLevel <= 2) {
            Log.v(str, formatMsgs(objArr));
        }
    }

    public static void w(String str) {
        if (DEBUG) {
            w(TAG, str);
        }
    }

    public static void w(String str, String str2) {
        if (DEBUG && str2 != null && sLevel <= 5) {
            Log.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (DEBUG) {
            if (!(str2 == null && th == null) && sLevel <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public static void w(String str, Object... objArr) {
        if (DEBUG && objArr != null && sLevel <= 5) {
            Log.v(str, formatMsgs(objArr));
        }
    }
}
