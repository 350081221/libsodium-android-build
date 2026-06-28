package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class t0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<? extends T> f18451a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends T> f18452b;

    /* renamed from: c, reason: collision with root package name */
    final T f18453c;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.u0<? super T> f18454a;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18454a = u0Var;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            T apply;
            t0 t0Var = t0.this;
            m3.o<? super Throwable, ? extends T> oVar = t0Var.f18452b;
            if (oVar != null) {
                try {
                    apply = oVar.apply(th);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    this.f18454a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
                    return;
                }
            } else {
                apply = t0Var.f18453c;
            }
            if (apply == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f18454a.onError(nullPointerException);
                return;
            }
            this.f18454a.onSuccess(apply);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18454a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f18454a.onSuccess(t5);
        }
    }

    public t0(io.reactivex.rxjava3.core.x0<? extends T> x0Var, m3.o<? super Throwable, ? extends T> oVar, T t5) {
        this.f18451a = x0Var;
        this.f18452b = oVar;
        this.f18453c = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18451a.a(new a(u0Var));
    }
}
