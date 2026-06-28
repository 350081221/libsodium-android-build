package io.reactivex.rxjava3.internal.util;

/* loaded from: classes3.dex */
public final class t {
    private t() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(int i5) {
        return (i5 & (i5 + (-1))) == 0;
    }

    public static int b(int i5) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i5 - 1));
    }
}
