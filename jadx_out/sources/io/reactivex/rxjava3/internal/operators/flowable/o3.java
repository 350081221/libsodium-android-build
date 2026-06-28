package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class o3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends io.reactivex.rxjava3.core.o<R> {

        /* renamed from: b, reason: collision with root package name */
        final T f16924b;

        /* renamed from: c, reason: collision with root package name */
        final m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> f16925c;

        a(T t5, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar) {
            this.f16924b = t5;
            this.f16925c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.o
        public void O6(org.reactivestreams.p<? super R> pVar) {
            try {
                org.reactivestreams.o<? extends R> apply = this.f16925c.apply(this.f16924b);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                org.reactivestreams.o<? extends R> oVar = apply;
                if (oVar instanceof m3.s) {
                    try {
                        Object obj = ((m3.s) oVar).get();
                        if (obj == null) {
                            io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
                            return;
                        } else {
                            pVar.onSubscribe(new io.reactivex.rxjava3.internal.subscriptions.h(pVar, obj));
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                        return;
                    }
                }
                oVar.subscribe(pVar);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                io.reactivex.rxjava3.internal.subscriptions.g.error(th2, pVar);
            }
        }
    }

    private o3() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> io.reactivex.rxjava3.core.o<U> a(T t5, m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> oVar) {
        return io.reactivex.rxjava3.plugins.a.P(new a(t5, oVar));
    }

    public static <T, R> boolean b(org.reactivestreams.o<T> oVar, org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends R>> oVar2) {
        if (oVar instanceof m3.s) {
            try {
                a1.a aVar = (Object) ((m3.s) oVar).get();
                if (aVar == null) {
                    io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
                    return true;
                }
                try {
                    org.reactivestreams.o<? extends R> apply = oVar2.apply(aVar);
                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                    org.reactivestreams.o<? extends R> oVar3 = apply;
                    if (oVar3 instanceof m3.s) {
                        try {
                            Object obj = ((m3.s) oVar3).get();
                            if (obj == null) {
                                io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
                                return true;
                            }
                            pVar.onSubscribe(new io.reactivex.rxjava3.internal.subscriptions.h(pVar, obj));
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                            return true;
                        }
                    } else {
                        oVar3.subscribe(pVar);
                    }
                    return true;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    io.reactivex.rxjava3.internal.subscriptions.g.error(th2, pVar);
                    return true;
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                io.reactivex.rxjava3.internal.subscriptions.g.error(th3, pVar);
                return true;
            }
        }
        return false;
    }
}
