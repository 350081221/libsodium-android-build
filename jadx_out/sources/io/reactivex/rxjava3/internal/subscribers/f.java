package io.reactivex.rxjava3.internal.subscribers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public f(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        if (io.reactivex.rxjava3.internal.subscriptions.j.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        this.queue.offer(io.reactivex.rxjava3.internal.util.q.complete());
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        this.queue.offer(io.reactivex.rxjava3.internal.util.q.error(th));
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        this.queue.offer(io.reactivex.rxjava3.internal.util.q.next(t5));
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
            this.queue.offer(io.reactivex.rxjava3.internal.util.q.subscription(this));
        }
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        get().request(j5);
    }
}
