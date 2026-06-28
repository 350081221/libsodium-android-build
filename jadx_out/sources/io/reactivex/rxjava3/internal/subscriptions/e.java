package io.reactivex.rxjava3.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class e extends AtomicBoolean implements q {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // org.reactivestreams.q
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        j.validate(j5);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
