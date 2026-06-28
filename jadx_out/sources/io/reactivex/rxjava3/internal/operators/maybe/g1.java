package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g1<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17299b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
            this.downstream = a0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.task.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f17300a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.d0<T> f17301b;

        b(io.reactivex.rxjava3.core.a0<? super T> a0Var, io.reactivex.rxjava3.core.d0<T> d0Var) {
            this.f17300a = a0Var;
            this.f17301b = d0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17301b.a(this.f17300a);
        }
    }

    public g1(io.reactivex.rxjava3.core.d0<T> d0Var, io.reactivex.rxjava3.core.q0 q0Var) {
        super(d0Var);
        this.f17299b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        a aVar = new a(a0Var);
        a0Var.onSubscribe(aVar);
        aVar.task.replace(this.f17299b.e(new b(aVar, this.f17232a)));
    }
}
