package com.umeng.commonsdk.config;

/* loaded from: classes3.dex */
public class a {
    public static boolean a(int i5, int i6) {
        return i6 >= 0 && i6 <= 31 && (i5 & (1 << i6)) != 0;
    }

    public static boolean a(long j5, int i5) {
        return i5 >= 0 && i5 <= 63 && (j5 & (1 << i5)) != 0;
    }

    public static int b(int i5, int i6) {
        return i5 | (1 << i6);
    }

    public static long b(long j5, int i5) {
        return (i5 < 0 || i5 > 63) ? j5 : j5 | (1 << i5);
    }

    public static int c(int i5, int i6) {
        return i5 & (~(1 << i6));
    }

    public static long c(long j5, int i5) {
        return (i5 < 0 || i5 > 63) ? j5 : j5 & (~(1 << i5));
    }
}
