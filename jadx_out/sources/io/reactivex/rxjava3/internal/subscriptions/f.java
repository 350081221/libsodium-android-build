package io.reactivex.rxjava3.internal.subscriptions;

import org.reactivestreams.p;

/* loaded from: classes3.dex */
public class f<T> extends c<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final p<? super T> downstream;
    protected T value;

    public f(p<? super T> pVar) {
        this.downstream = pVar;
    }

    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t5) {
        int i5 = get();
        while (i5 != 8) {
            if ((i5 & (-3)) != 0) {
                return;
            }
            if (i5 == 2) {
                lazySet(3);
                p<? super T> pVar = this.downstream;
                pVar.onNext(t5);
                if (get() != 4) {
                    pVar.onComplete();
                    return;
                }
                return;
            }
            this.value = t5;
            if (compareAndSet(0, 1)) {
                return;
            }
            i5 = get();
            if (i5 == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t5;
        lazySet(16);
        p<? super T> pVar2 = this.downstream;
        pVar2.onNext(t5);
        if (get() != 4) {
            pVar2.onComplete();
        }
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    @l3.g
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t5 = this.value;
        this.value = null;
        return t5;
    }

    @Override // org.reactivestreams.q
    public final void request(long j5) {
        T t5;
        if (!j.validate(j5)) {
            return;
        }
        do {
            int i5 = get();
            if ((i5 & (-2)) != 0) {
                return;
            }
            if (i5 == 1) {
                if (compareAndSet(1, 3) && (t5 = this.value) != null) {
                    this.value = null;
                    p<? super T> pVar = this.downstream;
                    pVar.onNext(t5);
                    if (get() != 4) {
                        pVar.onComplete();
                        return;
                    }
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.m
    public final int requestFusion(int i5) {
        if ((i5 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}
