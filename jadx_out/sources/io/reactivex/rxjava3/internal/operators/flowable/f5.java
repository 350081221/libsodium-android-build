package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class f5<T, U, V> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, V> {

    /* renamed from: c, reason: collision with root package name */
    final Iterable<U> f16747c;

    /* renamed from: d, reason: collision with root package name */
    final m3.c<? super T, ? super U, ? extends V> f16748d;

    /* loaded from: classes3.dex */
    static final class a<T, U, V> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super V> f16749a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<U> f16750b;

        /* renamed from: c, reason: collision with root package name */
        final m3.c<? super T, ? super U, ? extends V> f16751c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f16752d;

        /* renamed from: e, reason: collision with root package name */
        boolean f16753e;

        a(org.reactivestreams.p<? super V> pVar, Iterator<U> it, m3.c<? super T, ? super U, ? extends V> cVar) {
            this.f16749a = pVar;
            this.f16750b = it;
            this.f16751c = cVar;
        }

        void a(Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            this.f16753e = true;
            this.f16752d.cancel();
            this.f16749a.onError(th);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16752d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16753e) {
                return;
            }
            this.f16753e = true;
            this.f16749a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16753e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16753e = true;
                this.f16749a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16753e) {
                return;
            }
            try {
                U next = this.f16750b.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V apply = this.f16751c.apply(t5, next);
                    Objects.requireNonNull(apply, "The zipper function returned a null value");
                    this.f16749a.onNext(apply);
                    try {
                        if (!this.f16750b.hasNext()) {
                            this.f16753e = true;
                            this.f16752d.cancel();
                            this.f16749a.onComplete();
                        }
                    } catch (Throwable th) {
                        a(th);
                    }
                } catch (Throwable th2) {
                    a(th2);
                }
            } catch (Throwable th3) {
                a(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16752d, qVar)) {
                this.f16752d = qVar;
                this.f16749a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16752d.request(j5);
        }
    }

    public f5(io.reactivex.rxjava3.core.o<T> oVar, Iterable<U> iterable, m3.c<? super T, ? super U, ? extends V> cVar) {
        super(oVar);
        this.f16747c = iterable;
        this.f16748d = cVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super V> pVar) {
        try {
            Iterator<U> it = this.f16747c.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            Iterator<U> it2 = it;
            try {
                if (!it2.hasNext()) {
                    io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
                } else {
                    this.f16598b.N6(new a(pVar, it2, this.f16748d));
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th2, pVar);
        }
    }
}
