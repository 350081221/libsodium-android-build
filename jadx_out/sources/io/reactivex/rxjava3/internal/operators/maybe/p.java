package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class p<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, io.reactivex.rxjava3.core.f0<R>> f17371b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super R> f17372a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, io.reactivex.rxjava3.core.f0<R>> f17373b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17374c;

        a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, io.reactivex.rxjava3.core.f0<R>> oVar) {
            this.f17372a = a0Var;
            this.f17373b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17374c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17374c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17372a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17372a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17374c, eVar)) {
                this.f17374c = eVar;
                this.f17372a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                io.reactivex.rxjava3.core.f0<R> apply = this.f17373b.apply(t5);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                io.reactivex.rxjava3.core.f0<R> f0Var = apply;
                if (f0Var.h()) {
                    this.f17372a.onSuccess(f0Var.e());
                } else if (f0Var.f()) {
                    this.f17372a.onComplete();
                } else {
                    this.f17372a.onError(f0Var.d());
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17372a.onError(th);
            }
        }
    }

    public p(io.reactivex.rxjava3.core.x<T> xVar, m3.o<? super T, io.reactivex.rxjava3.core.f0<R>> oVar) {
        super(xVar);
        this.f17371b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17371b));
    }
}
