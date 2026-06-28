package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.core.u0;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes3.dex */
public final class h0<T, R> extends io.reactivex.rxjava3.core.x<R> {

    /* renamed from: a, reason: collision with root package name */
    final r0<T> f16350a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, Optional<? extends R>> f16351b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super R> f16352a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16353b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16354c;

        a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, Optional<? extends R>> oVar) {
            this.f16352a = a0Var;
            this.f16353b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.disposables.e eVar = this.f16354c;
            this.f16354c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            eVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16354c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f16352a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16354c, eVar)) {
                this.f16354c = eVar;
                this.f16352a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                Optional<? extends R> apply = this.f16353b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null item");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    this.f16352a.onSuccess(optional.get());
                } else {
                    this.f16352a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16352a.onError(th);
            }
        }
    }

    public h0(r0<T> r0Var, m3.o<? super T, Optional<? extends R>> oVar) {
        this.f16350a = r0Var;
        this.f16351b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f16350a.a(new a(a0Var, this.f16351b));
    }
}
