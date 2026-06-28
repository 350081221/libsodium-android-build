package io.reactivex.rxjava3.internal.jdk8;

import java.util.Objects;
import java.util.Optional;

/* loaded from: classes3.dex */
public final class p<T, R> extends io.reactivex.rxjava3.core.x<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x<T> f16372a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, Optional<? extends R>> f16373b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super R> f16374a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16375b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16376c;

        a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, Optional<? extends R>> oVar) {
            this.f16374a = a0Var;
            this.f16375b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.disposables.e eVar = this.f16376c;
            this.f16376c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            eVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16376c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f16374a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f16374a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16376c, eVar)) {
                this.f16376c = eVar;
                this.f16374a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                Optional<? extends R> apply = this.f16375b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null item");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    this.f16374a.onSuccess(optional.get());
                } else {
                    this.f16374a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16374a.onError(th);
            }
        }
    }

    public p(io.reactivex.rxjava3.core.x<T> xVar, m3.o<? super T, Optional<? extends R>> oVar) {
        this.f16372a = xVar;
        this.f16373b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f16372a.a(new a(a0Var, this.f16373b));
    }
}
