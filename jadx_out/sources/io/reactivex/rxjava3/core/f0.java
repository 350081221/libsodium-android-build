package io.reactivex.rxjava3.core;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class f0<T> {

    /* renamed from: b, reason: collision with root package name */
    static final f0<Object> f16220b = new f0<>(null);

    /* renamed from: a, reason: collision with root package name */
    final Object f16221a;

    private f0(@l3.g Object obj) {
        this.f16221a = obj;
    }

    @l3.f
    public static <T> f0<T> a() {
        return (f0<T>) f16220b;
    }

    @l3.f
    public static <T> f0<T> b(@l3.f Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new f0<>(io.reactivex.rxjava3.internal.util.q.error(th));
    }

    @l3.f
    public static <T> f0<T> c(T t5) {
        Objects.requireNonNull(t5, "value is null");
        return new f0<>(t5);
    }

    @l3.g
    public Throwable d() {
        Object obj = this.f16221a;
        if (io.reactivex.rxjava3.internal.util.q.isError(obj)) {
            return io.reactivex.rxjava3.internal.util.q.getError(obj);
        }
        return null;
    }

    @l3.g
    public T e() {
        Object obj = this.f16221a;
        if (obj != null && !io.reactivex.rxjava3.internal.util.q.isError(obj)) {
            return (T) this.f16221a;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            return Objects.equals(this.f16221a, ((f0) obj).f16221a);
        }
        return false;
    }

    public boolean f() {
        return this.f16221a == null;
    }

    public boolean g() {
        return io.reactivex.rxjava3.internal.util.q.isError(this.f16221a);
    }

    public boolean h() {
        Object obj = this.f16221a;
        if (obj != null && !io.reactivex.rxjava3.internal.util.q.isError(obj)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f16221a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f16221a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (io.reactivex.rxjava3.internal.util.q.isError(obj)) {
            return "OnErrorNotification[" + io.reactivex.rxjava3.internal.util.q.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f16221a + "]";
    }
}
