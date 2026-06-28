package com.android.dex.util;

import kotlin.m2;

/* loaded from: classes2.dex */
public final class Unsigned {
    private Unsigned() {
    }

    public static int compare(int i5, int i6) {
        if (i5 == i6) {
            return 0;
        }
        return (((long) i5) & 4294967295L) < (((long) i6) & 4294967295L) ? -1 : 1;
    }

    public static int compare(short s5, short s6) {
        if (s5 == s6) {
            return 0;
        }
        return (s5 & m2.f19496d) < (s6 & m2.f19496d) ? -1 : 1;
    }
}
