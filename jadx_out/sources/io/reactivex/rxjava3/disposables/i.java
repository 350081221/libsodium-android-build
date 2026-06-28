package io.reactivex.rxjava3.disposables;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i extends h<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.disposables.h
    public void onDisposed(@l3.f Runnable runnable) {
        runnable.run();
    }
}
