package com.swift.sandhook.xcompat;

import android.util.Log;
import com.swift.sandhook.HookLog;
import java.lang.reflect.Member;

/* loaded from: classes3.dex */
public class n {
    public static boolean DEBUG = HookLog.DEBUG;
    public static final String TAG = "SandHook";

    public static int d(String str) {
        if (!DEBUG) {
            return 0;
        }
        return Log.d("SandHook", str);
    }

    public static int e(String str) {
        if (DEBUG) {
            return Log.e("SandHook", str);
        }
        return 0;
    }

    public static int i(String str) {
        if (!DEBUG) {
            return 0;
        }
        return Log.i("SandHook", str);
    }

    public static void printCallOriginError(Member member) {
        if (member != null) {
            Log.e("SandHook", "method <" + member + "> call origin error!");
        }
    }

    public static void printMethodHookIn(Member member) {
        if (DEBUG && member != null) {
            Log.d("SandHook", "method <" + member + "> hook in");
        }
    }

    public static int v(String str) {
        if (!DEBUG) {
            return 0;
        }
        return Log.v("SandHook", str);
    }

    public static int w(String str) {
        if (!DEBUG) {
            return 0;
        }
        return Log.w("SandHook", str);
    }

    public static int e(String str, Throwable th) {
        return Log.e("SandHook", str, th);
    }
}
