package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.p;

/* loaded from: classes3.dex */
public final class h<T> extends AtomicInteger implements n<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final p<? super T> subscriber;
    final T value;

    public h(p<? super T> pVar, T t5) {
        this.subscriber = pVar;
        this.value = t5;
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(T t5) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    @l3.g
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.value;
        }
        return null;
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        if (j.validate(j5) && compareAndSet(0, 1)) {
            p<? super T> pVar = this.subscriber;
            pVar.onNext(this.value);
            if (get() != 2) {
                pVar.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.m
    public int requestFusion(int i5) {
        return i5 & 1;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(T t5, T t6) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
