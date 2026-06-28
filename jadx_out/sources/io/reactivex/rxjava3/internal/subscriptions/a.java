package io.reactivex.rxjava3.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class a extends AtomicReferenceArray<q> implements io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = 2746389416410565408L;

    public a(int i5) {
        super(i5);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        q andSet;
        if (get(0) != j.CANCELLED) {
            int length = length();
            for (int i5 = 0; i5 < length; i5++) {
                q qVar = get(i5);
                j jVar = j.CANCELLED;
                if (qVar != jVar && (andSet = getAndSet(i5, jVar)) != jVar && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return get(0) == j.CANCELLED;
    }

    public q replaceResource(int i5, q qVar) {
        q qVar2;
        do {
            qVar2 = get(i5);
            if (qVar2 == j.CANCELLED) {
                if (qVar != null) {
                    qVar.cancel();
                    return null;
                }
                return null;
            }
        } while (!compareAndSet(i5, qVar2, qVar));
        return qVar2;
    }

    public boolean setResource(int i5, q qVar) {
        q qVar2;
        do {
            qVar2 = get(i5);
            if (qVar2 == j.CANCELLED) {
                if (qVar != null) {
                    qVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!compareAndSet(i5, qVar2, qVar));
        if (qVar2 != null) {
            qVar2.cancel();
            return true;
        }
        return true;
    }
}
