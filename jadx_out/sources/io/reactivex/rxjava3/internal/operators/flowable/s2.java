package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final org.reactivestreams.p<? super T> downstream;
        Throwable error;
        org.reactivestreams.q upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        a(org.reactivestreams.p<? super T> pVar) {
            this.downstream = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
        }

        boolean checkTerminated(boolean z4, boolean z5, org.reactivestreams.p<?> pVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z4) {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    pVar.onError(th);
                    return true;
                }
                if (z5) {
                    pVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        void drain() {
            boolean z4;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super T> pVar = this.downstream;
            AtomicLong atomicLong = this.requested;
            AtomicReference<T> atomicReference = this.current;
            int i5 = 1;
            do {
                long j5 = 0;
                while (true) {
                    z4 = false;
                    if (j5 == atomicLong.get()) {
                        break;
                    }
                    boolean z6 = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    if (andSet == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (checkTerminated(z6, z5, pVar, atomicReference)) {
                        return;
                    }
                    if (z5) {
                        break;
                    }
                    pVar.onNext(andSet);
                    j5++;
                }
                if (j5 == atomicLong.get()) {
                    boolean z7 = this.done;
                    if (atomicReference.get() == null) {
                        z4 = true;
                    }
                    if (checkTerminated(z7, z4, pVar, atomicReference)) {
                        return;
                    }
                }
                if (j5 != 0) {
                    io.reactivex.rxjava3.internal.util.d.e(atomicLong, j5);
                }
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.current.lazySet(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
        }
    }

    public s2(io.reactivex.rxjava3.core.o<T> oVar) {
        super(oVar);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar));
    }
}
