package io.reactivex.rxjava3.disposables;

/* loaded from: classes3.dex */
final class b extends h<AutoCloseable> {
    private static final long serialVersionUID = -6646144244598696847L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(AutoCloseable autoCloseable) {
        super(autoCloseable);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "AutoCloseableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.disposables.h
    public void onDisposed(@l3.f AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Throwable th) {
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }
}
