package io.reactivex.rxjava3.internal.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f18688a = new a();

    /* loaded from: classes3.dex */
    static final class a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    private k() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable aVar;
        do {
            th2 = atomicReference.get();
            if (th2 == f18688a) {
                return false;
            }
            if (th2 == null) {
                aVar = th;
            } else {
                aVar = new io.reactivex.rxjava3.exceptions.a(th2, th);
            }
        } while (!androidx.compose.animation.core.h.a(atomicReference, th2, aVar));
        return true;
    }

    public static NullPointerException b(String str) {
        return new NullPointerException(e(str));
    }

    public static List<Throwable> c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(th);
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.removeFirst();
            if (th2 instanceof io.reactivex.rxjava3.exceptions.a) {
                List<Throwable> exceptions = ((io.reactivex.rxjava3.exceptions.a) th2).getExceptions();
                for (int size = exceptions.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(exceptions.get(size));
                }
            } else {
                arrayList.add(th2);
            }
        }
        return arrayList;
    }

    public static <T> T d(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw b(str);
    }

    public static String e(String str) {
        return str + " Null values are generally not allowed in 3.x operators and sources.";
    }

    public static Throwable f(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f18688a;
        if (th != th2) {
            return atomicReference.getAndSet(th2);
        }
        return th;
    }

    public static <E extends Throwable> Exception g(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static String h(long j5, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j5 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException i(Throwable th) {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                return (RuntimeException) th;
            }
            return new RuntimeException(th);
        }
        throw ((Error) th);
    }
}
