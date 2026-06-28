package com.umeng.umzid;

import android.content.Context;

/* loaded from: classes3.dex */
public class Spy {
    public static boolean initSuccess = false;

    static {
        try {
            System.loadLibrary("umeng-spy");
            initSuccess = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String getID() {
        if (initSuccess) {
            return getNativeID();
        }
        return null;
    }

    public static native String getNativeID();

    public static native String getNativeLibraryVersion();

    public static native String getNativeTag(boolean z4, boolean z5);

    public static synchronized String getTag(Context context) {
        boolean j5;
        String nativeTag;
        synchronized (Spy.class) {
            if (context != null) {
                try {
                    j5 = d.j(context);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                j5 = false;
            }
            nativeTag = getNativeTag(j5, context != null ? d.i(context) : false);
        }
        return nativeTag;
    }

    public static String getVersion() {
        if (initSuccess) {
            return getNativeLibraryVersion();
        }
        return null;
    }
}
