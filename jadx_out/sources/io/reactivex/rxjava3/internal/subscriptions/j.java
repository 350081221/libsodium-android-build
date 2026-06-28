package io.reactivex.rxjava3.internal.subscriptions;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public enum j implements q {
    CANCELLED;

    public static boolean cancel(AtomicReference<q> atomicReference) {
        q andSet;
        q qVar = atomicReference.get();
        j jVar = CANCELLED;
        if (qVar != jVar && (andSet = atomicReference.getAndSet(jVar)) != jVar) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    public static void deferredRequest(AtomicReference<q> atomicReference, AtomicLong atomicLong, long j5) {
        q qVar = atomicReference.get();
        if (qVar != null) {
            qVar.request(j5);
            return;
        }
        if (validate(j5)) {
            io.reactivex.rxjava3.internal.util.d.a(atomicLong, j5);
            q qVar2 = atomicReference.get();
            if (qVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    qVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<q> atomicReference, AtomicLong atomicLong, q qVar) {
        if (setOnce(atomicReference, qVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                qVar.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<q> atomicReference, q qVar) {
        q qVar2;
        do {
            qVar2 = atomicReference.get();
            if (qVar2 == CANCELLED) {
                if (qVar != null) {
                    qVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!androidx.compose.animation.core.h.a(atomicReference, qVar2, qVar));
        return true;
    }

    public static void reportMoreProduced(long j5) {
        io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.e("More produced than requested: " + j5));
    }

    public static void reportSubscriptionSet() {
        io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.e("Subscription already set!"));
    }

    public static boolean set(AtomicReference<q> atomicReference, q qVar) {
        q qVar2;
        do {
            qVar2 = atomicReference.get();
            if (qVar2 == CANCELLED) {
                if (qVar != null) {
                    qVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!androidx.compose.animation.core.h.a(atomicReference, qVar2, qVar));
        if (qVar2 != null) {
            qVar2.cancel();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<q> atomicReference, q qVar) {
        Objects.requireNonNull(qVar, "s is null");
        if (androidx.compose.animation.core.h.a(atomicReference, null, qVar)) {
            return true;
        }
        qVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(q qVar, q qVar2) {
        if (qVar2 == null) {
            io.reactivex.rxjava3.plugins.a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (qVar == null) {
            return true;
        }
        qVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // org.reactivestreams.q
    public void cancel() {
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
    }

    public static boolean validate(long j5) {
        if (j5 > 0) {
            return true;
        }
        io.reactivex.rxjava3.plugins.a.Y(new IllegalArgumentException("n > 0 required but it was " + j5));
        return false;
    }

    public static boolean setOnce(AtomicReference<q> atomicReference, q qVar, long j5) {
        if (!setOnce(atomicReference, qVar)) {
            return false;
        }
        qVar.request(j5);
        return true;
    }
}
