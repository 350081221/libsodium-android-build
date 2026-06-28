package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class l extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16539a;

    /* renamed from: b, reason: collision with root package name */
    final m3.a f16540b;

    /* loaded from: classes3.dex */
    static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.rxjava3.core.f downstream;
        final m3.a onFinally;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.f fVar, m3.a aVar) {
            this.downstream = fVar;
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

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
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

    public l(io.reactivex.rxjava3.core.i iVar, m3.a aVar) {
        this.f16539a = iVar;
        this.f16540b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16539a.a(new a(fVar, this.f16540b));
    }
}
