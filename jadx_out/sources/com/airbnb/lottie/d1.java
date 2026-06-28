package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d1<V> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final V f1261a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Throwable f1262b;

    public d1(V v4) {
        this.f1261a = v4;
        this.f1262b = null;
    }

    @Nullable
    public Throwable a() {
        return this.f1262b;
    }

    @Nullable
    public V b() {
        return this.f1261a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (b() != null && b().equals(d1Var.b())) {
            return true;
        }
        if (a() == null || d1Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public d1(Throwable th) {
        this.f1262b = th;
        this.f1261a = null;
    }
}
