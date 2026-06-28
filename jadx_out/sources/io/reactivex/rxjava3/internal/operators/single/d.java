package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.v0<T> f18340a;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.t0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.downstream = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.t0, io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.t0
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t0
        public void onSuccess(T t5) {
            io.reactivex.rxjava3.disposables.e andSet;
            io.reactivex.rxjava3.disposables.e eVar = get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar && (andSet = getAndSet(cVar)) != cVar) {
                try {
                    if (t5 == null) {
                        this.downstream.onError(io.reactivex.rxjava3.internal.util.k.b("onSuccess called with a null value."));
                    } else {
                        this.downstream.onSuccess(t5);
                    }
                    if (andSet != null) {
                        andSet.dispose();
                    }
                } catch (Throwable th) {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t0
        public void setCancellable(m3.f fVar) {
            setDisposable(new io.reactivex.rxjava3.internal.disposables.b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.t0
        public void setDisposable(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.set(this, eVar);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }

        @Override // io.reactivex.rxjava3.core.t0
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

    public d(io.reactivex.rxjava3.core.v0<T> v0Var) {
        this.f18340a = v0Var;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        a aVar = new a(u0Var);
        u0Var.onSubscribe(aVar);
        try {
            this.f18340a.a(aVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            aVar.onError(th);
        }
    }
}
