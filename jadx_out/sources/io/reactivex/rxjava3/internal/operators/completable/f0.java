package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class f0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.i> f16500a;

    /* loaded from: classes3.dex */
    static final class a extends AtomicBoolean implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -7730517613164279224L;
        final io.reactivex.rxjava3.core.f downstream;
        final io.reactivex.rxjava3.disposables.c set;
        final AtomicInteger wip;

        a(io.reactivex.rxjava3.core.f fVar, io.reactivex.rxjava3.disposables.c cVar, AtomicInteger atomicInteger) {
            this.downstream = fVar;
            this.set = cVar;
            this.wip = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.set.dispose();
            set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.set.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.set.dispose();
            if (compareAndSet(false, true)) {
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

    public f0(Iterable<? extends io.reactivex.rxjava3.core.i> iterable) {
        this.f16500a = iterable;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        a aVar = new a(fVar, cVar, atomicInteger);
        fVar.onSubscribe(aVar);
        try {
            Iterator<? extends io.reactivex.rxjava3.core.i> it = this.f16500a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            Iterator<? extends io.reactivex.rxjava3.core.i> it2 = it;
            while (!cVar.isDisposed()) {
                try {
                    if (!it2.hasNext()) {
                        aVar.onComplete();
                        return;
                    }
                    if (cVar.isDisposed()) {
                        return;
                    }
                    try {
                        io.reactivex.rxjava3.core.i next = it2.next();
                        Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                        io.reactivex.rxjava3.core.i iVar = next;
                        if (cVar.isDisposed()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        iVar.a(aVar);
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        cVar.dispose();
                        aVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    cVar.dispose();
                    aVar.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.b.b(th3);
            fVar.onError(th3);
        }
    }
}
