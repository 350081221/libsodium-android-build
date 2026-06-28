package com.huawei.secure.android.common.detect;

/* loaded from: classes3.dex */
public final class SD {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8861a = "aegissec";

    static {
        try {
            System.loadLibrary(f8861a);
        } catch (UnsatisfiedLinkError unused) {
            z1.c.d("SD", "load so UnsatisfiedLinkError");
        } catch (Throwable th) {
            z1.c.d("SD", "load so throwable : " + th.getMessage());
        }
    }

    private SD() {
    }

    public static native boolean idj();

    public static native boolean iej();

    public static native boolean irpj();

    public static native boolean irtj();
}
