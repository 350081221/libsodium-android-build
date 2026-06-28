package com.bytedance.sdk.openadsdk.api.plugin.c;

import kotlin.y1;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f4850a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        if (bArr != null) {
            return a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String a(byte[] bArr, int i5, int i6) {
        if (bArr != null) {
            if (i5 >= 0 && i5 + i6 <= bArr.length) {
                int i7 = i6 * 2;
                char[] cArr = new char[i7];
                int i8 = 0;
                for (int i9 = 0; i9 < i6; i9++) {
                    int i10 = bArr[i9 + i5] & y1.f19838d;
                    int i11 = i8 + 1;
                    char[] cArr2 = f4850a;
                    cArr[i8] = cArr2[i10 >> 4];
                    i8 = i11 + 1;
                    cArr[i11] = cArr2[i10 & 15];
                }
                return new String(cArr, 0, i7);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
