package com.huawei.secure.android.common.detect;

/* loaded from: classes3.dex */
public class SecurityDetect {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8862a = "SecurityDetect";

    public static boolean idj() {
        try {
            return SD.idj();
        } catch (Throwable th) {
            z1.c.d(f8862a, "idj: " + th.getMessage());
            return false;
        }
    }

    public static boolean iej() {
        try {
            return SD.iej();
        } catch (Throwable th) {
            z1.c.d(f8862a, "iej: " + th.getMessage());
            return false;
        }
    }

    public static boolean irpj() {
        try {
            return SD.irpj();
        } catch (Throwable th) {
            z1.c.d(f8862a, "irpj: " + th.getMessage());
            return false;
        }
    }
}
