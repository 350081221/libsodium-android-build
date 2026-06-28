package com.google.gson.internal;

/* loaded from: classes2.dex */
public final class a {
    private a() {
        throw new UnsupportedOperationException();
    }

    public static void a(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t5) {
        t5.getClass();
        return t5;
    }
}
