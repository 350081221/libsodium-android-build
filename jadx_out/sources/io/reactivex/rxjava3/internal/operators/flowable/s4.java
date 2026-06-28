package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s4 extends io.reactivex.rxjava3.core.o<Long> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17042b;

    /* renamed from: c, reason: collision with root package name */
    final long f17043c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f17044d;

    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final org.reactivestreams.p<? super Long> downstream;
        volatile boolean requested;

        a(org.reactivestreams.p<? super Long> pVar) {
            this.downstream = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                if (this.requested) {
                    this.downstream.onNext(0L);
                    lazySet(io.reactivex.rxjava3.internal.disposables.d.INSTANCE);
                    this.downstream.onComplete();
                } else {
                    lazySet(io.reactivex.rxjava3.internal.disposables.d.INSTANCE);
                    this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Can't deliver value due to lack of requests"));
                }
            }
        }

        public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.trySet(this, eVar);
        }
    }

    public s4(long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f17043c = j5;
        this.f17044d = timeUnit;
        this.f17042b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super Long> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        aVar.setResource(this.f17042b.g(aVar, this.f17043c, this.f17044d));
    }
}
