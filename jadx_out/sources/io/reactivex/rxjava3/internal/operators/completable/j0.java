package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class j0<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16518a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends T> f16519b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f16520a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super Throwable, ? extends T> f16521b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16522c;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.o<? super Throwable, ? extends T> oVar) {
            this.f16520a = a0Var;
            this.f16521b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16522c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16522c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f16520a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                T apply = this.f16521b.apply(th);
                Objects.requireNonNull(apply, "The itemSupplier returned a null value");
                this.f16520a.onSuccess(apply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f16520a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16522c, eVar)) {
                this.f16522c = eVar;
                this.f16520a.onSubscribe(this);
            }
        }
    }

    public j0(io.reactivex.rxjava3.core.i iVar, m3.o<? super Throwable, ? extends T> oVar) {
        this.f16518a = iVar;
        this.f16519b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f16518a.a(new a(a0Var, this.f16519b));
    }
}
