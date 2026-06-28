package com.lody.virtual.client.seccomp;

import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.helper.utils.VLog;

/* loaded from: classes3.dex */
public class NativeEngineSeccomp {
    private static final String TAG = "NativeEngineSeccomp";

    private static String adjustLibName(String str) {
        if (VirtualRuntime.is64bit()) {
            return str + "_64";
        }
        return str + "_32";
    }

    public static String getRedirectedPath(String str) {
        try {
            return SeccompSandbox.nativeTranslateToGuestPath(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
            return str;
        }
    }

    public static void loadSo() {
        if (VirtualRuntime.is64bit()) {
            try {
                System.loadLibrary("vcrt2");
            } catch (Throwable th) {
                VLog.e(TAG, VLog.getStackTraceString(th));
            }
        }
    }

    public static void redirectDirectory(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        SeccompSandbox.nativeMount(str, str2, 2);
    }

    public static void redirectFile(String str, String str2) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        SeccompSandbox.nativeMount(str, str2, 1);
    }

    public static String reverseRedirectedPath(String str) {
        try {
            return SeccompSandbox.nativeTranslateToHostPath(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
            return str;
        }
    }
}
