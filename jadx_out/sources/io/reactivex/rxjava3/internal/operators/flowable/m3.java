package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class m3<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<T> f16878b;

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<?> f16879c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16880d;

    /* loaded from: classes3.dex */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip;

        a(org.reactivestreams.p<? super T> pVar, org.reactivestreams.o<?> oVar) {
            super(pVar, oVar);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.m3.c
        void completion() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.m3.c
        void run() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            do {
                boolean z4 = this.done;
                emit();
                if (z4) {
                    this.downstream.onComplete();
                    return;
                }
            } while (this.wip.decrementAndGet() != 0);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        b(org.reactivestreams.p<? super T> pVar, org.reactivestreams.o<?> oVar) {
            super(pVar, oVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.m3.c
        void completion() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.m3.c
        void run() {
            emit();
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -3517602651313910099L;
        final org.reactivestreams.p<? super T> downstream;
        final org.reactivestreams.o<?> sampler;
        org.reactivestreams.q upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<org.reactivestreams.q> other = new AtomicReference<>();

        c(org.reactivestreams.p<? super T> pVar, org.reactivestreams.o<?> oVar) {
            this.downstream = pVar;
            this.sampler = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            this.upstream.cancel();
        }

        public void complete() {
            this.upstream.cancel();
            completion();
        }

        abstract void completion();

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    io.reactivex.rxjava3.internal.util.d.e(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        public void error(Throwable th) {
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            completion();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            lazySet(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new d(this));
                    qVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            }
        }

        abstract void run();

        void setOther(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.other, qVar, Long.MAX_VALUE);
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> implements io.reactivex.rxjava3.core.t<Object> {

        /* renamed from: a, reason: collision with root package name */
        final c<T> f16881a;

        d(c<T> cVar) {
            this.f16881a = cVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16881a.complete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16881a.error(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            this.f16881a.run();
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            this.f16881a.setOther(qVar);
        }
    }

    public m3(org.reactivestreams.o<T> oVar, org.reactivestreams.o<?> oVar2, boolean z4) {
        this.f16878b = oVar;
        this.f16879c = oVar2;
        this.f16880d = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.subscribers.e eVar = new io.reactivex.rxjava3.subscribers.e(pVar);
        if (this.f16880d) {
            this.f16878b.subscribe(new a(eVar, this.f16879c));
        } else {
            this.f16878b.subscribe(new b(eVar, this.f16879c));
        }
    }
}
