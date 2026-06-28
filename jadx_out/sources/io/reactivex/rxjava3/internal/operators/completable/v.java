package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.core.x0;

/* loaded from: classes3.dex */
public final class v<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final x0<T> f16589a;

    /* loaded from: classes3.dex */
    static final class a<T> implements u0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16590a;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f16590a = fVar;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f16590a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16590a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f16590a.onComplete();
        }
    }

    public v(x0<T> x0Var) {
        this.f16589a = x0Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16589a.a(new a(fVar));
    }
}
