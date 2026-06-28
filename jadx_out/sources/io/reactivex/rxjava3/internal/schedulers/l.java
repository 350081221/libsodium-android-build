package io.reactivex.rxjava3.internal.schedulers;

/* loaded from: classes3.dex */
public final class l extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public l(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.rxjava3.internal.schedulers.a, io.reactivex.rxjava3.schedulers.a
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            this.runner = null;
            lazySet(a.FINISHED);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }
}
