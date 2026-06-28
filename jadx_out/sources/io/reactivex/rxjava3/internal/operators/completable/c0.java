package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class c0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i[] f16488a;

    /* loaded from: classes3.dex */
    static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8360547806504310570L;
        final io.reactivex.rxjava3.core.f downstream;
        final AtomicBoolean once;
        final io.reactivex.rxjava3.disposables.c set;

        a(io.reactivex.rxjava3.core.f fVar, AtomicBoolean atomicBoolean, io.reactivex.rxjava3.disposables.c cVar, int i5) {
            this.downstream = fVar;
            this.once = atomicBoolean;
            this.set = cVar;
            lazySet(i5);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.set.dispose();
            this.once.set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.set.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.set.dispose();
            if (this.once.compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.set.b(eVar);
        }
    }

    public c0(io.reactivex.rxjava3.core.i[] iVarArr) {
        this.f16488a = iVarArr;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        a aVar = new a(fVar, new AtomicBoolean(), cVar, this.f16488a.length + 1);
        fVar.onSubscribe(aVar);
        for (io.reactivex.rxjava3.core.i iVar : this.f16488a) {
            if (cVar.isDisposed()) {
                return;
            }
            if (iVar == null) {
                cVar.dispose();
                aVar.onError(new NullPointerException("A completable source is null"));
                return;
            }
            iVar.a(aVar);
        }
        aVar.onComplete();
    }
}
