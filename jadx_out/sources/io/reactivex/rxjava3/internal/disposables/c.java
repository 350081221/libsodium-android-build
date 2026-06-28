package io.reactivex.rxjava3.internal.disposables;

import androidx.compose.animation.core.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public enum c implements io.reactivex.rxjava3.disposables.e {
    DISPOSED;

    public static boolean dispose(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference) {
        io.reactivex.rxjava3.disposables.e andSet;
        io.reactivex.rxjava3.disposables.e eVar = atomicReference.get();
        c cVar = DISPOSED;
        if (eVar != cVar && (andSet = atomicReference.getAndSet(cVar)) != cVar) {
            if (andSet != null) {
                andSet.dispose();
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean isDisposed(io.reactivex.rxjava3.disposables.e eVar) {
        return eVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.disposables.e eVar2;
        do {
            eVar2 = atomicReference.get();
            if (eVar2 == DISPOSED) {
                if (eVar != null) {
                    eVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!h.a(atomicReference, eVar2, eVar));
        return true;
    }

    public static void reportDisposableSet() {
        io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.e("Disposable already set!"));
    }

    public static boolean set(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.disposables.e eVar2;
        do {
            eVar2 = atomicReference.get();
            if (eVar2 == DISPOSED) {
                if (eVar != null) {
                    eVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!h.a(atomicReference, eVar2, eVar));
        if (eVar2 != null) {
            eVar2.dispose();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.disposables.e eVar) {
        Objects.requireNonNull(eVar, "d is null");
        if (!h.a(atomicReference, null, eVar)) {
            eVar.dispose();
            if (atomicReference.get() != DISPOSED) {
                reportDisposableSet();
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean trySet(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.disposables.e eVar) {
        if (!h.a(atomicReference, null, eVar)) {
            if (atomicReference.get() == DISPOSED) {
                eVar.dispose();
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean validate(io.reactivex.rxjava3.disposables.e eVar, io.reactivex.rxjava3.disposables.e eVar2) {
        if (eVar2 == null) {
            io.reactivex.rxjava3.plugins.a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (eVar != null) {
            eVar2.dispose();
            reportDisposableSet();
            return false;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return true;
    }
}
