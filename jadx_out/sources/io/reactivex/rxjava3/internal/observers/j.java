package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements p0<T>, io.reactivex.rxjava3.disposables.e {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public j(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        if (io.reactivex.rxjava3.internal.disposables.c.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        this.queue.offer(io.reactivex.rxjava3.internal.util.q.complete());
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        this.queue.offer(io.reactivex.rxjava3.internal.util.q.error(th));
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        this.queue.offer(io.reactivex.rxjava3.internal.util.q.next(t5));
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
    }
}
