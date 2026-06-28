package com.lody.virtual.client.seccomp;

/* loaded from: classes3.dex */
public class SeccompSandbox {
    public static final int MOUNT_FLAG_DIR = 2;
    public static final int MOUNT_FLAG_FILE = 1;
    public static final int MOUNT_FLAG_FORBIDDEN = 8;
    public static final int MOUNT_FLAG_KEEP = 4;
    private static final String TAG = "Sandbox";

    private static native int _nativeMount_(String str, String str2, int i5);

    private static native int _nativeSetup_();

    private static native int _nativeStart_(boolean z4);

    private static native String _nativeTranslateToGuestPath_(String str);

    private static native String _nativeTranslateToHostPath_(String str);

    public static int nativeMount(String str, String str2, int i5) {
        return _nativeMount_(str, str2, i5);
    }

    public static int nativeSetup() {
        return _nativeSetup_();
    }

    public static int nativeStart(boolean z4) {
        return _nativeStart_(z4);
    }

    public static String nativeTranslateToGuestPath(String str) {
        return _nativeTranslateToGuestPath_(str);
    }

    public static String nativeTranslateToHostPath(String str) {
        return _nativeTranslateToHostPath_(str);
    }
}
