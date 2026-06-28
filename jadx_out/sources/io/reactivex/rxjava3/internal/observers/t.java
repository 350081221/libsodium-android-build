package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements p0<T>, io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final u<T> parent;
    final int prefetch;
    io.reactivex.rxjava3.internal.fuseable.q<T> queue;

    public t(u<T> uVar, int i5) {
        this.parent = uVar;
        this.prefetch = i5;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t5);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
            if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                io.reactivex.rxjava3.internal.fuseable.l lVar = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
                int requestFusion = lVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = lVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = lVar;
                    return;
                }
            }
            this.queue = io.reactivex.rxjava3.internal.util.v.c(-this.prefetch);
        }
    }

    public io.reactivex.rxjava3.internal.fuseable.q<T> queue() {
        return this.queue;
    }

    public void setDone() {
        this.done = true;
    }
}
