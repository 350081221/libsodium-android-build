package com.umeng.analytics.pro;

import kotlin.y1;

/* loaded from: classes3.dex */
public class bo {
    public static final void a(int i5, byte[] bArr) {
        a(i5, bArr, 0);
    }

    public static final boolean a(int i5, int i6) {
        return (i5 & (1 << i6)) != 0;
    }

    public static final boolean a(long j5, int i5) {
        return (j5 & (1 << i5)) != 0;
    }

    public static final byte b(byte b5, int i5) {
        return (byte) b((int) b5, i5);
    }

    public static final int b(int i5, int i6) {
        return i5 & (~(1 << i6));
    }

    public static final long b(long j5, int i5) {
        return j5 & (~(1 << i5));
    }

    public static final void a(int i5, byte[] bArr, int i6) {
        bArr[i6] = (byte) ((i5 >> 24) & 255);
        bArr[i6 + 1] = (byte) ((i5 >> 16) & 255);
        bArr[i6 + 2] = (byte) ((i5 >> 8) & 255);
        bArr[i6 + 3] = (byte) (i5 & 255);
    }

    public static final short b(short s5, int i5) {
        return (short) b((int) s5, i5);
    }

    public static final int a(byte[] bArr) {
        return a(bArr, 0);
    }

    public static final int a(byte[] bArr, int i5) {
        return (bArr[i5 + 3] & y1.f19838d) | ((bArr[i5] & y1.f19838d) << 24) | ((bArr[i5 + 1] & y1.f19838d) << 16) | ((bArr[i5 + 2] & y1.f19838d) << 8);
    }

    public static final boolean a(byte b5, int i5) {
        return a((int) b5, i5);
    }

    public static final boolean a(short s5, int i5) {
        return a((int) s5, i5);
    }

    public static final byte a(byte b5, int i5, boolean z4) {
        return (byte) a((int) b5, i5, z4);
    }

    public static final short a(short s5, int i5, boolean z4) {
        return (short) a((int) s5, i5, z4);
    }

    public static final int a(int i5, int i6, boolean z4) {
        return z4 ? i5 | (1 << i6) : b(i5, i6);
    }

    public static final long a(long j5, int i5, boolean z4) {
        return z4 ? j5 | (1 << i5) : b(j5, i5);
    }
}
