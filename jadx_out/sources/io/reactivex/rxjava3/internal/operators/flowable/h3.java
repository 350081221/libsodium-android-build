package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super io.reactivex.rxjava3.core.o<Object>, ? extends org.reactivestreams.o<?>> f16779c;

    /* loaded from: classes3.dex */
    static final class a<T> extends c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        a(org.reactivestreams.p<? super T> pVar, io.reactivex.rxjava3.processors.c<Object> cVar, org.reactivestreams.q qVar) {
            super(pVar, cVar, qVar);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            again(0);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.t<Object>, org.reactivestreams.q {
        private static final long serialVersionUID = 2827772011130406689L;
        final org.reactivestreams.o<T> source;
        c<T, U> subscriber;
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(org.reactivestreams.o<T> oVar) {
            this.source = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            if (getAndIncrement() != 0) {
                return;
            }
            while (this.upstream.get() != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                this.source.subscribe(this.subscriber);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.upstream, this.requested, qVar);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this.requested, j5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class c<T, U> extends io.reactivex.rxjava3.internal.subscriptions.i implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final org.reactivestreams.p<? super T> downstream;
        protected final io.reactivex.rxjava3.processors.c<U> processor;
        private long produced;
        protected final org.reactivestreams.q receiver;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(org.reactivestreams.p<? super T> pVar, io.reactivex.rxjava3.processors.c<U> cVar, org.reactivestreams.q qVar) {
            super(false);
            this.downstream = pVar;
            this.processor = cVar;
            this.receiver = qVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void again(U u4) {
            setSubscription(io.reactivex.rxjava3.internal.subscriptions.g.INSTANCE);
            long j5 = this.produced;
            if (j5 != 0) {
                this.produced = 0L;
                produced(j5);
            }
            this.receiver.request(1L);
            this.processor.onNext(u4);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.i, org.reactivestreams.q
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        @Override // org.reactivestreams.p
        public final void onNext(T t5) {
            this.produced++;
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public final void onSubscribe(org.reactivestreams.q qVar) {
            setSubscription(qVar);
        }
    }

    public h3(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super io.reactivex.rxjava3.core.o<Object>, ? extends org.reactivestreams.o<?>> oVar2) {
        super(oVar);
        this.f16779c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.subscribers.e eVar = new io.reactivex.rxjava3.subscribers.e(pVar);
        io.reactivex.rxjava3.processors.c<T> r9 = io.reactivex.rxjava3.processors.h.u9(8).r9();
        try {
            org.reactivestreams.o<?> apply = this.f16779c.apply(r9);
            Objects.requireNonNull(apply, "handler returned a null Publisher");
            org.reactivestreams.o<?> oVar = apply;
            b bVar = new b(this.f16598b);
            a aVar = new a(eVar, r9, bVar);
            bVar.subscriber = aVar;
            pVar.onSubscribe(aVar);
            oVar.subscribe(bVar);
            bVar.onNext(0);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
