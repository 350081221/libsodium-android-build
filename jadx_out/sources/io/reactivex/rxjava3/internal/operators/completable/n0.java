package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class n0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.c f16550a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16551b;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 3533011714830024923L;
        final io.reactivex.rxjava3.core.f downstream;
        final C0459a other = new C0459a(this);
        final AtomicBoolean once = new AtomicBoolean();

        /* renamed from: io.reactivex.rxjava3.internal.operators.completable.n0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0459a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f {
            private static final long serialVersionUID = 5176264485428790318L;
            final a parent;

            C0459a(a aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.f fVar) {
            this.downstream = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
            }
        }

        void innerComplete() {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
                this.downstream.onComplete();
            }
        }

        void innerError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.once.get();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    public n0(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.core.i iVar) {
        this.f16550a = cVar;
        this.f16551b = iVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar);
        fVar.onSubscribe(aVar);
        this.f16551b.a(aVar.other);
        this.f16550a.a(aVar);
    }
}
