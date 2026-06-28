package io.reactivex.rxjava3.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final l<T> parent;
    final int prefetch;
    long produced;
    volatile io.reactivex.rxjava3.internal.fuseable.q<T> queue;

    public k(l<T> lVar, int i5) {
        this.parent = lVar;
        this.prefetch = i5;
        this.limit = i5 - (i5 >> 2);
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t5);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
            if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                io.reactivex.rxjava3.internal.fuseable.n nVar = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
                int requestFusion = nVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = nVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = nVar;
                    io.reactivex.rxjava3.internal.util.v.j(qVar, this.prefetch);
                    return;
                }
            }
            this.queue = io.reactivex.rxjava3.internal.util.v.c(this.prefetch);
            io.reactivex.rxjava3.internal.util.v.j(qVar, this.prefetch);
        }
    }

    public io.reactivex.rxjava3.internal.fuseable.q<T> queue() {
        return this.queue;
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        if (this.fusionMode != 1) {
            long j6 = this.produced + j5;
            if (j6 >= this.limit) {
                this.produced = 0L;
                get().request(j6);
            } else {
                this.produced = j6;
            }
        }
    }

    public void setDone() {
        this.done = true;
    }
}
