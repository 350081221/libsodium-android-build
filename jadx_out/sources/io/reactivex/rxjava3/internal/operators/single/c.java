package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class c<T> extends io.reactivex.rxjava3.core.r0<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18331a;

    /* renamed from: b, reason: collision with root package name */
    final Object f18332b;

    /* renamed from: c, reason: collision with root package name */
    final m3.d<Object, Object> f18333c;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.u0<T> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.u0<? super Boolean> f18334a;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
            this.f18334a = u0Var;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18334a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18334a.onSubscribe(eVar);
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                c cVar = c.this;
                this.f18334a.onSuccess(Boolean.valueOf(cVar.f18333c.a(t5, cVar.f18332b)));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18334a.onError(th);
            }
        }
    }

    public c(io.reactivex.rxjava3.core.x0<T> x0Var, Object obj, m3.d<Object, Object> dVar) {
        this.f18331a = x0Var;
        this.f18332b = obj;
        this.f18333c = dVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        this.f18331a.a(new a(u0Var));
    }
}
