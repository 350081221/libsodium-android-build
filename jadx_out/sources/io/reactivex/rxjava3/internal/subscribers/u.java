package io.reactivex.rxjava3.internal.subscribers;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class u<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final org.reactivestreams.p<? super T> downstream;
    final io.reactivex.rxjava3.internal.util.c error = new io.reactivex.rxjava3.internal.util.c();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public u(org.reactivestreams.p<? super T> pVar) {
        this.downstream = pVar;
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        if (!this.done) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
        }
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        this.done = true;
        io.reactivex.rxjava3.internal.util.l.b(this.downstream, this, this.error);
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        this.done = true;
        io.reactivex.rxjava3.internal.util.l.d(this.downstream, th, this, this.error);
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        io.reactivex.rxjava3.internal.util.l.f(this.downstream, t5, this, this.error);
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.upstream, this.requested, qVar);
        } else {
            qVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        if (j5 <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j5));
            return;
        }
        io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this.requested, j5);
    }
}
