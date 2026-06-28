package io.reactivex.rxjava3.internal.util;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i {
    private i() {
        throw new IllegalStateException("No instances!");
    }

    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.e(a(cls.getName())));
    }

    public static boolean c(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, io.reactivex.rxjava3.disposables.e eVar, Class<?> cls) {
        Objects.requireNonNull(eVar, "next is null");
        if (!androidx.compose.animation.core.h.a(atomicReference, null, eVar)) {
            eVar.dispose();
            if (atomicReference.get() != io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                b(cls);
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean d(AtomicReference<org.reactivestreams.q> atomicReference, org.reactivestreams.q qVar, Class<?> cls) {
        Objects.requireNonNull(qVar, "next is null");
        if (!androidx.compose.animation.core.h.a(atomicReference, null, qVar)) {
            qVar.cancel();
            if (atomicReference.get() != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                b(cls);
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean e(io.reactivex.rxjava3.disposables.e eVar, io.reactivex.rxjava3.disposables.e eVar2, Class<?> cls) {
        Objects.requireNonNull(eVar2, "next is null");
        if (eVar != null) {
            eVar2.dispose();
            if (eVar != io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                b(cls);
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean f(org.reactivestreams.q qVar, org.reactivestreams.q qVar2, Class<?> cls) {
        Objects.requireNonNull(qVar2, "next is null");
        if (qVar != null) {
            qVar2.cancel();
            if (qVar != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                b(cls);
                return false;
            }
            return false;
        }
        return true;
    }
}
