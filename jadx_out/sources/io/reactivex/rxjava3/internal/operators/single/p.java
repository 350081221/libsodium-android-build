package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18423a;

    /* renamed from: b, reason: collision with root package name */
    final m3.a f18424b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<m3.a> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8583764624474935784L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, m3.a aVar) {
            this.downstream = u0Var;
            lazySet(aVar);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            m3.a andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }
    }

    public p(io.reactivex.rxjava3.core.x0<T> x0Var, m3.a aVar) {
        this.f18423a = x0Var;
        this.f18424b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18423a.a(new a(u0Var, this.f18424b));
    }
}
