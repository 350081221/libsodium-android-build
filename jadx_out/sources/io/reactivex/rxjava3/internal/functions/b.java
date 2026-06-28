package io.reactivex.rxjava3.internal.functions;

import java.util.Objects;
import m3.d;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final d<Object, Object> f16289a = new a();

    /* loaded from: classes3.dex */
    static final class a implements d<Object, Object> {
        a() {
        }

        @Override // m3.d
        public boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> d<T, T> a() {
        return (d<T, T>) f16289a;
    }

    public static int b(int i5, String str) {
        if (i5 > 0) {
            return i5;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i5);
    }

    public static long c(long j5, String str) {
        if (j5 > 0) {
            return j5;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j5);
    }
}
