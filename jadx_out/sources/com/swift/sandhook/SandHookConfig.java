package com.swift.sandhook;

import android.os.Build;

/* loaded from: classes3.dex */
public class SandHookConfig {
    public static volatile boolean compiler;
    public static volatile int curUser;
    public static volatile boolean delayHook;
    public static volatile ClassLoader initClassLoader;
    public static volatile int SDK_INT = getSdkInt();
    public static volatile boolean DEBUG = false;

    static {
        boolean z4;
        if (SDK_INT < 29) {
            z4 = true;
        } else {
            z4 = false;
        }
        compiler = z4;
        curUser = 0;
        delayHook = true;
    }

    public static int getSdkInt() {
        try {
            if (Build.VERSION.PREVIEW_SDK_INT > 0) {
                return Build.VERSION.SDK_INT + 1;
            }
        } catch (Throwable unused) {
        }
        return Build.VERSION.SDK_INT;
    }
}
