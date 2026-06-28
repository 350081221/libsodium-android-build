package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class w<T> extends io.reactivex.rxjava3.core.r0<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18468a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18469b;

    /* loaded from: classes3.dex */
    static class a<T> implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        final int f18470a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f18471b;

        /* renamed from: c, reason: collision with root package name */
        final Object[] f18472c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super Boolean> f18473d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f18474e;

        a(int i5, io.reactivex.rxjava3.disposables.c cVar, Object[] objArr, io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, AtomicInteger atomicInteger) {
            this.f18470a = i5;
            this.f18471b = cVar;
            this.f18472c = objArr;
            this.f18473d = u0Var;
            this.f18474e = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            int andSet = this.f18474e.getAndSet(-1);
            if (andSet != 0 && andSet != 1) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18471b.dispose();
                this.f18473d.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18471b.b(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f18472c[this.f18470a] = t5;
            if (this.f18474e.incrementAndGet() == 2) {
                io.reactivex.rxjava3.core.u0<? super Boolean> u0Var = this.f18473d;
                Object[] objArr = this.f18472c;
                u0Var.onSuccess(Boolean.valueOf(Objects.equals(objArr[0], objArr[1])));
            }
        }
    }

    public w(io.reactivex.rxjava3.core.x0<? extends T> x0Var, io.reactivex.rxjava3.core.x0<? extends T> x0Var2) {
        this.f18468a = x0Var;
        this.f18469b = x0Var2;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        u0Var.onSubscribe(cVar);
        this.f18468a.a(new a(0, cVar, objArr, u0Var, atomicInteger));
        this.f18469b.a(new a(1, cVar, objArr, u0Var, atomicInteger));
    }
}
