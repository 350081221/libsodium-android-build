package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18374a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f18375b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final io.reactivex.rxjava3.core.x0<T> source;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, io.reactivex.rxjava3.core.x0<T> x0Var) {
            this.downstream = u0Var;
            this.source = x0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.source.a(new io.reactivex.rxjava3.internal.observers.a0(this, this.downstream));
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public g(io.reactivex.rxjava3.core.x0<T> x0Var, io.reactivex.rxjava3.core.i iVar) {
        this.f18374a = x0Var;
        this.f18375b = iVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18375b.a(new a(u0Var, this.f18374a));
    }
}
