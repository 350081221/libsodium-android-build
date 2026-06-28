package com.huawei.secure.android.common.util;

import android.util.Base64;
import android.util.Log;

/* loaded from: classes3.dex */
public class SafeBase64 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9043a = "SafeBase64";

    private SafeBase64() {
    }

    public static byte[] decode(byte[] bArr, int i5) {
        try {
            return Base64.decode(bArr, i5);
        } catch (Exception e5) {
            Log.e(f9043a, e5.getClass().getSimpleName() + " , message0 : " + e5.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i5) {
        try {
            return Base64.encode(bArr, i5);
        } catch (Exception e5) {
            Log.e(f9043a, e5.getClass().getSimpleName() + " , message3 : " + e5.getMessage());
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i5) {
        try {
            return Base64.encodeToString(bArr, i5);
        } catch (Exception e5) {
            Log.e(f9043a, e5.getClass().getSimpleName() + " , message5 : " + e5.getMessage());
            return "";
        }
    }

    public static byte[] decode(byte[] bArr, int i5, int i6, int i7) {
        try {
            return Base64.decode(bArr, i5, i6, i7);
        } catch (Exception e5) {
            Log.e(f9043a, e5.getClass().getSimpleName() + " , message1 : " + e5.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i5, int i6, int i7) {
        try {
            return Base64.encode(bArr, i5, i6, i7);
        } catch (Exception e5) {
            Log.e(f9043a, e5.getClass().getSimpleName() + " , message4 : " + e5.getMessage());
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i5, int i6, int i7) {
        try {
            return Base64.encodeToString(bArr, i5, i6, i7);
        } catch (Exception e5) {
            Log.e(f9043a, e5.getClass().getSimpleName() + " , message6 : " + e5.getMessage());
            return "";
        }
    }

    public static byte[] decode(String str, int i5) {
        try {
            return Base64.decode(str, i5);
        } catch (Exception e5) {
            Log.e(f9043a, e5.getClass().getSimpleName() + " , message2 : " + e5.getMessage());
            return new byte[0];
        }
    }
}
