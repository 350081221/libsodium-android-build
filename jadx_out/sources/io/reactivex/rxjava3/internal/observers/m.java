package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;

/* loaded from: classes3.dex */
public class m<T> extends b<T> {
    static final int DISPOSED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    protected final p0<? super T> downstream;
    protected T value;

    public m(p0<? super T> p0Var) {
        this.downstream = p0Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t5) {
        int i5 = get();
        if ((i5 & 54) != 0) {
            return;
        }
        p0<? super T> p0Var = this.downstream;
        if (i5 == 8) {
            this.value = t5;
            lazySet(16);
            p0Var.onNext(null);
        } else {
            lazySet(2);
            p0Var.onNext(t5);
        }
        if (get() != 4) {
            p0Var.onComplete();
        }
    }

    public void dispose() {
        set(4);
        this.value = null;
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        } else {
            lazySet(2);
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
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
        T t5 = this.value;
        this.value = null;
        lazySet(32);
        return t5;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.m
    public final int requestFusion(int i5) {
        if ((i5 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.downstream.onComplete();
    }
}
