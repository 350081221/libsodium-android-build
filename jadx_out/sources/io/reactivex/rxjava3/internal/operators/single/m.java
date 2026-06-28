package io.reactivex.rxjava3.internal.operators.single;

/* loaded from: classes3.dex */
public final class m<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18404a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super T> f18405b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18406a;

        /* renamed from: b, reason: collision with root package name */
        final m3.g<? super T> f18407b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18408c;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, m3.g<? super T> gVar) {
            this.f18406a = u0Var;
            this.f18407b = gVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18408c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18408c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f18406a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18408c, eVar)) {
                this.f18408c = eVar;
                this.f18406a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.f18406a.onSuccess(t5);
            try {
                this.f18407b.accept(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    public m(io.reactivex.rxjava3.core.x0<T> x0Var, m3.g<? super T> gVar) {
        this.f18404a = x0Var;
        this.f18405b = gVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18404a.a(new a(u0Var, this.f18405b));
    }
}
