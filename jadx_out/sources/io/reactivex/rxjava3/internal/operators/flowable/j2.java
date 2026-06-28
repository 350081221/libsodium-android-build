package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16830c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -4592979584110982903L;
        final org.reactivestreams.p<? super T> downstream;
        volatile boolean mainDone;
        volatile boolean otherDone;
        final AtomicReference<org.reactivestreams.q> mainSubscription = new AtomicReference<>();
        final C0471a otherObserver = new C0471a(this);
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final AtomicLong requested = new AtomicLong();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.j2$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0471a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f {
            private static final long serialVersionUID = -2935427570954647017L;
            final a<?> parent;

            C0471a(a<?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(org.reactivestreams.p<? super T> pVar) {
            this.downstream = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.mainSubscription);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
            this.errors.tryTerminateAndReport();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                io.reactivex.rxjava3.internal.util.l.b(this.downstream, this, this.errors);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
            io.reactivex.rxjava3.internal.util.l.d(this.downstream, th, this, this.errors);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            io.reactivex.rxjava3.internal.util.l.f(this.downstream, t5, this, this.errors);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.mainSubscription, this.requested, qVar);
        }

        void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                io.reactivex.rxjava3.internal.util.l.b(this.downstream, this, this.errors);
            }
        }

        void otherError(Throwable th) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.mainSubscription);
            io.reactivex.rxjava3.internal.util.l.d(this.downstream, th, this, this.errors);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.mainSubscription, this.requested, j5);
        }
    }

    public j2(io.reactivex.rxjava3.core.o<T> oVar, io.reactivex.rxjava3.core.i iVar) {
        super(oVar);
        this.f16830c = iVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        this.f16598b.N6(aVar);
        this.f16830c.a(aVar.otherObserver);
    }
}
