package com.swift.sandhook;

import android.util.Log;

/* loaded from: classes3.dex */
public class HookLog {
    public static boolean DEBUG = SandHookConfig.DEBUG;
    public static final String TAG = "SandHook";

    public static int d(String str) {
        if (!DEBUG) {
            return 0;
        }
        return Log.d("SandHook", str);
    }

    public static int e(String str) {
        return Log.e("SandHook", str);
    }

    public static int i(String str) {
        if (!DEBUG) {
            return 0;
        }
        return Log.i("SandHook", str);
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
