package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.d0<? extends T>> f17294b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.a0<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 3520831347801429610L;
        final org.reactivestreams.p<? super T> downstream;
        long produced;
        final Iterator<? extends io.reactivex.rxjava3.core.d0<? extends T>> sources;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.internal.disposables.f disposables = new io.reactivex.rxjava3.internal.disposables.f();
        final AtomicReference<Object> current = new AtomicReference<>(io.reactivex.rxjava3.internal.util.q.COMPLETE);

        a(org.reactivestreams.p<? super T> pVar, Iterator<? extends io.reactivex.rxjava3.core.d0<? extends T>> it) {
            this.downstream = pVar;
            this.sources = it;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.disposables.dispose();
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
                        try {
                            if (this.sources.hasNext()) {
                                try {
                                    io.reactivex.rxjava3.core.d0<? extends T> next = this.sources.next();
                                    Objects.requireNonNull(next, "The source Iterator returned a null MaybeSource");
                                    next.a(this);
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                    pVar.onError(th);
                                    return;
                                }
                            } else {
                                pVar.onComplete();
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.b.b(th2);
                            pVar.onError(th2);
                            return;
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
            this.downstream.onError(th);
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

    public g(Iterable<? extends io.reactivex.rxjava3.core.d0<? extends T>> iterable) {
        this.f17294b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        try {
            Iterator<? extends io.reactivex.rxjava3.core.d0<? extends T>> it = this.f17294b.iterator();
            Objects.requireNonNull(it, "The sources Iterable returned a null Iterator");
            a aVar = new a(pVar, it);
            pVar.onSubscribe(aVar);
            aVar.drain();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
