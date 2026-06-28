package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.g f16501a;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.e, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.rxjava3.core.f downstream;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.downstream = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.e, io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.e
        public void onComplete() {
            io.reactivex.rxjava3.disposables.e andSet;
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar && (andSet = getAndSet(cVar)) != cVar) {
                try {
                    this.downstream.onComplete();
                } finally {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.e
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.e
        public void setCancellable(m3.f fVar) {
            setDisposable(new io.reactivex.rxjava3.internal.disposables.b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.e
        public void setDisposable(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.set(this, eVar);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }

        @Override // io.reactivex.rxjava3.core.e
        public boolean tryOnError(Throwable th) {
            io.reactivex.rxjava3.disposables.e andSet;
            if (th == null) {
                th = io.reactivex.rxjava3.internal.util.k.b("onError called with a null Throwable.");
            }
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar && (andSet = getAndSet(cVar)) != cVar) {
                try {
                    this.downstream.onError(th);
                } finally {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            }
            return false;
        }
    }

    public g(io.reactivex.rxjava3.core.g gVar) {
        this.f16501a = gVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        a aVar = new a(fVar);
        fVar.onSubscribe(aVar);
        try {
            this.f16501a.a(aVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            aVar.onError(th);
        }
    }
}
