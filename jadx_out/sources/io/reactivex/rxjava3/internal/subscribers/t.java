package io.reactivex.rxjava3.internal.subscribers;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class t<T, R> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final org.reactivestreams.p<? super R> downstream;
    protected long produced;
    protected org.reactivestreams.q upstream;
    protected R value;

    public t(org.reactivestreams.p<? super R> pVar) {
        this.downstream = pVar;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void complete(R r5) {
        long j5 = this.produced;
        if (j5 != 0) {
            io.reactivex.rxjava3.internal.util.d.e(this, j5);
        }
        while (true) {
            long j6 = get();
            if ((j6 & Long.MIN_VALUE) != 0) {
                onDrop(r5);
                return;
            }
            if ((j6 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r5);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r5;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    protected void onDrop(R r5) {
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
            this.upstream = qVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.q
    public final void request(long j5) {
        long j6;
        if (!io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
            return;
        }
        do {
            j6 = get();
            if ((j6 & Long.MIN_VALUE) != 0) {
                if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                    this.downstream.onNext(this.value);
                    this.downstream.onComplete();
                    return;
                }
                return;
            }
        } while (!compareAndSet(j6, io.reactivex.rxjava3.internal.util.d.c(j6, j5)));
        this.upstream.request(j5);
    }
}
