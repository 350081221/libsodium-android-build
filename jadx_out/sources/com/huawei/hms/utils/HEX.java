package com.huawei.hms.utils;

import com.umeng.analytics.pro.cx;

/* loaded from: classes3.dex */
public final class HEX {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8819a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f8820b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i5 = 0;
        for (byte b5 : bArr) {
            int i6 = i5 + 1;
            cArr2[i5] = cArr[(b5 & 240) >>> 4];
            i5 = i6 + 1;
            cArr2[i6] = cArr[b5 & cx.f12477m];
        }
        return cArr2;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, false);
    }

    public static String encodeHexString(byte[] bArr, boolean z4) {
        return new String(encodeHex(bArr, z4));
    }

    public static char[] encodeHex(byte[] bArr, boolean z4) {
        return a(bArr, z4 ? f8820b : f8819a);
    }
}
