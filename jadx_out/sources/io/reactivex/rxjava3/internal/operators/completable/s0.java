package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.u0;

/* loaded from: classes3.dex */
public final class s0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16576a;

    /* renamed from: b, reason: collision with root package name */
    final m3.s<? extends T> f16577b;

    /* renamed from: c, reason: collision with root package name */
    final T f16578c;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        private final u0<? super T> f16579a;

        a(u0<? super T> u0Var) {
            this.f16579a = u0Var;
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            T t5;
            s0 s0Var = s0.this;
            m3.s<? extends T> sVar = s0Var.f16577b;
            if (sVar != null) {
                try {
                    t5 = sVar.get();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.f16579a.onError(th);
                    return;
                }
            } else {
                t5 = s0Var.f16578c;
            }
            if (t5 == null) {
                this.f16579a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f16579a.onSuccess(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f16579a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16579a.onSubscribe(eVar);
        }
    }

    public s0(io.reactivex.rxjava3.core.i iVar, m3.s<? extends T> sVar, T t5) {
        this.f16576a = iVar;
        this.f16578c = t5;
        this.f16577b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(u0<? super T> u0Var) {
        this.f16576a.a(new a(u0Var));
    }
}
