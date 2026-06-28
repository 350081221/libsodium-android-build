package io.reactivex.rxjava3.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends AtomicReference<Future<?>> implements e {
    private static final long serialVersionUID = 6545242830671168775L;
    private final boolean allowInterrupt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Future<?> future, boolean z4) {
        super(future);
        this.allowInterrupt = z4;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.allowInterrupt);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        Future<?> future = get();
        if (future != null && !future.isDone()) {
            return false;
        }
        return true;
    }
}
