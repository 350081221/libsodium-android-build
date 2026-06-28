package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.p0;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public enum q {
    COMPLETE;

    /* loaded from: classes3.dex */
    static final class a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.disposables.e eVar) {
            this.upstream = eVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    /* loaded from: classes3.dex */
    static final class b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e, reason: collision with root package name */
        final Throwable f18695e;

        b(Throwable th) {
            this.f18695e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f18695e, ((b) obj).f18695e);
            }
            return false;
        }

        public int hashCode() {
            return this.f18695e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f18695e + "]";
        }
    }

    /* loaded from: classes3.dex */
    static final class c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final org.reactivestreams.q upstream;

        c(org.reactivestreams.q qVar) {
            this.upstream = qVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    public static <T> boolean accept(Object obj, org.reactivestreams.p<? super T> pVar) {
        if (obj == COMPLETE) {
            pVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            pVar.onError(((b) obj).f18695e);
            return true;
        }
        pVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, org.reactivestreams.p<? super T> pVar) {
        if (obj == COMPLETE) {
            pVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            pVar.onError(((b) obj).f18695e);
            return true;
        }
        if (obj instanceof c) {
            pVar.onSubscribe(((c) obj).upstream);
            return false;
        }
        pVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(io.reactivex.rxjava3.disposables.e eVar) {
        return new a(eVar);
    }

    public static Object error(Throwable th) {
        return new b(th);
    }

    public static io.reactivex.rxjava3.disposables.e getDisposable(Object obj) {
        return ((a) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f18695e;
    }

    public static org.reactivestreams.q getSubscription(Object obj) {
        return ((c) obj).upstream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static <T> Object next(T t5) {
        return t5;
    }

    public static Object subscription(org.reactivestreams.q qVar) {
        return new c(qVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, p0<? super T> p0Var) {
        if (obj == COMPLETE) {
            p0Var.onComplete();
            return true;
        }
        if (obj instanceof b) {
            p0Var.onError(((b) obj).f18695e);
            return true;
        }
        p0Var.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, p0<? super T> p0Var) {
        if (obj == COMPLETE) {
            p0Var.onComplete();
            return true;
        }
        if (obj instanceof b) {
            p0Var.onError(((b) obj).f18695e);
            return true;
        }
        if (obj instanceof a) {
            p0Var.onSubscribe(((a) obj).upstream);
            return false;
        }
        p0Var.onNext(obj);
        return false;
    }
}
