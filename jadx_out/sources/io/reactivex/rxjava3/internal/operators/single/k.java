package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class k<T, R> extends io.reactivex.rxjava3.core.x<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.r0<T> f18391a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, io.reactivex.rxjava3.core.f0<R>> f18392b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super R> f18393a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, io.reactivex.rxjava3.core.f0<R>> f18394b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18395c;

        a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, io.reactivex.rxjava3.core.f0<R>> oVar) {
            this.f18393a = a0Var;
            this.f18394b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18395c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18395c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18393a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18395c, eVar)) {
                this.f18395c = eVar;
                this.f18393a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                io.reactivex.rxjava3.core.f0<R> apply = this.f18394b.apply(t5);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                io.reactivex.rxjava3.core.f0<R> f0Var = apply;
                if (f0Var.h()) {
                    this.f18393a.onSuccess(f0Var.e());
                } else if (f0Var.f()) {
                    this.f18393a.onComplete();
                } else {
                    this.f18393a.onError(f0Var.d());
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18393a.onError(th);
            }
        }
    }

    public k(io.reactivex.rxjava3.core.r0<T> r0Var, m3.o<? super T, io.reactivex.rxjava3.core.f0<R>> oVar) {
        this.f18391a = r0Var;
        this.f18392b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f18391a.a(new a(a0Var, this.f18392b));
    }
}
