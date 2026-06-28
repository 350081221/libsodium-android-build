package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16661c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16662d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<Thread> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final org.reactivestreams.p<? super T> downstream;
        final boolean nonScheduledRequests;
        org.reactivestreams.o<T> source;
        final q0.c worker;
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c4$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class RunnableC0465a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final org.reactivestreams.q f16663a;

            /* renamed from: b, reason: collision with root package name */
            final long f16664b;

            RunnableC0465a(org.reactivestreams.q qVar, long j5) {
                this.f16663a = qVar;
                this.f16664b = j5;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16663a.request(this.f16664b);
            }
        }

        a(org.reactivestreams.p<? super T> pVar, q0.c cVar, org.reactivestreams.o<T> oVar, boolean z4) {
            this.downstream = pVar;
            this.worker = cVar;
            this.source = oVar;
            this.nonScheduledRequests = !z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.upstream, qVar)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, qVar);
                }
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                org.reactivestreams.q qVar = this.upstream.get();
                if (qVar != null) {
                    requestUpstream(j5, qVar);
                    return;
                }
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                org.reactivestreams.q qVar2 = this.upstream.get();
                if (qVar2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, qVar2);
                    }
                }
            }
        }

        void requestUpstream(long j5, org.reactivestreams.q qVar) {
            if (!this.nonScheduledRequests && Thread.currentThread() != get()) {
                this.worker.b(new RunnableC0465a(qVar, j5));
            } else {
                qVar.request(j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            org.reactivestreams.o<T> oVar = this.source;
            this.source = null;
            oVar.subscribe(this);
        }
    }

    public c4(io.reactivex.rxjava3.core.o<T> oVar, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        super(oVar);
        this.f16661c = q0Var;
        this.f16662d = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        q0.c c5 = this.f16661c.c();
        a aVar = new a(pVar, c5, this.f16598b, this.f16662d);
        pVar.onSubscribe(aVar);
        c5.b(aVar);
    }
}
