package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class s<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.a f17388b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        final m3.a onFinally;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, m3.a aVar) {
            this.downstream = a0Var;
            this.onFinally = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.downstream.onSuccess(t5);
            runFinally();
        }

        void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }
    }

    public s(io.reactivex.rxjava3.core.d0<T> d0Var, m3.a aVar) {
        super(d0Var);
        this.f17388b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17388b));
    }
}
