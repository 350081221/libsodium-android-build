package io.reactivex.rxjava3.disposables;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a extends h<m3.a> {
    private static final long serialVersionUID = -8219729196779211169L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(m3.a aVar) {
        super(aVar);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.disposables.h
    public void onDisposed(@l3.f m3.a aVar) {
        try {
            aVar.run();
        } catch (Throwable th) {
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }
}
