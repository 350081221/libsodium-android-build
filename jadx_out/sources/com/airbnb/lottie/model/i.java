package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class i<T> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    T f1512a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    T f1513b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t5, T t6) {
        this.f1512a = t5;
        this.f1513b = t6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!a(pair.first, this.f1512a) || !a(pair.second, this.f1513b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t5 = this.f1512a;
        int hashCode = t5 == null ? 0 : t5.hashCode();
        T t6 = this.f1513b;
        return hashCode ^ (t6 != null ? t6.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f1512a + " " + this.f1513b + a1.i.f138d;
    }
}
