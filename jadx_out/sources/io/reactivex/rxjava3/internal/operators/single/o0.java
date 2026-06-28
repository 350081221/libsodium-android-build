package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class o0<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18419a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends R> f18420b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super R> f18421a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends R> f18422b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(io.reactivex.rxjava3.core.u0<? super R> u0Var, m3.o<? super T, ? extends R> oVar) {
            this.f18421a = u0Var;
            this.f18422b = oVar;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18421a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18421a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                R apply = this.f18422b.apply(t5);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f18421a.onSuccess(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                onError(th);
            }
        }
    }

    public o0(io.reactivex.rxjava3.core.x0<? extends T> x0Var, m3.o<? super T, ? extends R> oVar) {
        this.f18419a = x0Var;
        this.f18420b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        this.f18419a.a(new a(u0Var, this.f18420b));
    }
}
