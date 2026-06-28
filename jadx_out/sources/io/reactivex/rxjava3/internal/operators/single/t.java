package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class t<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18446a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super io.reactivex.rxjava3.disposables.e> f18447b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18448a;

        /* renamed from: b, reason: collision with root package name */
        final m3.g<? super io.reactivex.rxjava3.disposables.e> f18449b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18450c;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
            this.f18448a = u0Var;
            this.f18449b = gVar;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f18450c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18448a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            try {
                this.f18449b.accept(eVar);
                this.f18448a.onSubscribe(eVar);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18450c = true;
                eVar.dispose();
                io.reactivex.rxjava3.internal.disposables.d.error(th, this.f18448a);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            if (this.f18450c) {
                return;
            }
            this.f18448a.onSuccess(t5);
        }
    }

    public t(io.reactivex.rxjava3.core.x0<T> x0Var, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        this.f18446a = x0Var;
        this.f18447b = gVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18446a.a(new a(u0Var, this.f18447b));
    }
}
