package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class f extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.i> f16499a;

    /* loaded from: classes3.dex */
    static final class a extends AtomicInteger implements io.reactivex.rxjava3.core.f {
        private static final long serialVersionUID = -7965400327305809232L;
        final io.reactivex.rxjava3.core.f downstream;
        final io.reactivex.rxjava3.internal.disposables.f sd = new io.reactivex.rxjava3.internal.disposables.f();
        final Iterator<? extends io.reactivex.rxjava3.core.i> sources;

        a(io.reactivex.rxjava3.core.f fVar, Iterator<? extends io.reactivex.rxjava3.core.i> it) {
            this.downstream = fVar;
            this.sources = it;
        }

        void next() {
            if (this.sd.isDisposed() || getAndIncrement() != 0) {
                return;
            }
            Iterator<? extends io.reactivex.rxjava3.core.i> it = this.sources;
            while (!this.sd.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        this.downstream.onComplete();
                        return;
                    }
                    try {
                        io.reactivex.rxjava3.core.i next = it.next();
                        Objects.requireNonNull(next, "The CompletableSource returned is null");
                        next.a(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            next();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.sd.replace(eVar);
        }
    }

    public f(Iterable<? extends io.reactivex.rxjava3.core.i> iterable) {
        this.f16499a = iterable;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        try {
            Iterator<? extends io.reactivex.rxjava3.core.i> it = this.f16499a.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            a aVar = new a(fVar, it);
            fVar.onSubscribe(aVar.sd);
            aVar.next();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, fVar);
        }
    }
}
