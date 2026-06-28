package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T>[] f17276b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.a0<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 3520831347801429610L;
        final org.reactivestreams.p<? super T> downstream;
        int index;
        long produced;
        final io.reactivex.rxjava3.core.d0<? extends T>[] sources;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.internal.disposables.f disposables = new io.reactivex.rxjava3.internal.disposables.f();
        final AtomicReference<Object> current = new AtomicReference<>(io.reactivex.rxjava3.internal.util.q.COMPLETE);
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        a(org.reactivestreams.p<? super T> pVar, io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr) {
            this.downstream = pVar;
            this.sources = d0VarArr;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.disposables.dispose();
            this.errors.tryTerminateAndReport();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.current;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            io.reactivex.rxjava3.internal.disposables.f fVar = this.disposables;
            while (!fVar.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z4 = true;
                    if (obj != io.reactivex.rxjava3.internal.util.q.COMPLETE) {
                        long j5 = this.produced;
                        if (j5 != this.requested.get()) {
                            this.produced = j5 + 1;
                            atomicReference.lazySet(null);
                            pVar.onNext(obj);
                        } else {
                            z4 = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z4 && !fVar.isDisposed()) {
                        int i5 = this.index;
                        io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr = this.sources;
                        if (i5 == d0VarArr.length) {
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        } else {
                            this.index = i5 + 1;
                            d0VarArr[i5].a(this);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.current.lazySet(io.reactivex.rxjava3.internal.util.q.COMPLETE);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.current.lazySet(io.reactivex.rxjava3.internal.util.q.COMPLETE);
            if (this.errors.tryAddThrowableOrReport(th)) {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.disposables.replace(eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.current.lazySet(t5);
            drain();
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }
    }

    public f(io.reactivex.rxjava3.core.d0<? extends T>[] d0VarArr) {
        this.f17276b = d0VarArr;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(pVar, this.f17276b);
        pVar.onSubscribe(aVar);
        aVar.drain();
    }
}
