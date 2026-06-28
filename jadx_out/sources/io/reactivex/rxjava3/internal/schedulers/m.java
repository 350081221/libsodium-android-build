package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class m extends a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public m(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.rxjava3.internal.schedulers.a, io.reactivex.rxjava3.schedulers.a
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(a.FINISHED);
            this.runner = null;
        }
    }
}
