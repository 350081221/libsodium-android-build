package io.reactivex.rxjava3.internal.disposables;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class a extends AtomicReferenceArray<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = 2746389416410565408L;

    public a(int i5) {
        super(i5);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.disposables.e andSet;
        if (get(0) != c.DISPOSED) {
            int length = length();
            for (int i5 = 0; i5 < length; i5++) {
                io.reactivex.rxjava3.disposables.e eVar = get(i5);
                c cVar = c.DISPOSED;
                if (eVar != cVar && (andSet = getAndSet(i5, cVar)) != cVar && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return get(0) == c.DISPOSED;
    }

    public io.reactivex.rxjava3.disposables.e replaceResource(int i5, io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.disposables.e eVar2;
        do {
            eVar2 = get(i5);
            if (eVar2 == c.DISPOSED) {
                eVar.dispose();
                return null;
            }
        } while (!compareAndSet(i5, eVar2, eVar));
        return eVar2;
    }

    public boolean setResource(int i5, io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.disposables.e eVar2;
        do {
            eVar2 = get(i5);
            if (eVar2 == c.DISPOSED) {
                eVar.dispose();
                return false;
            }
        } while (!compareAndSet(i5, eVar2, eVar));
        if (eVar2 != null) {
            eVar2.dispose();
            return true;
        }
        return true;
    }
}
