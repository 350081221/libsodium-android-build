package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f16643a;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.subscribers.b<io.reactivex.rxjava3.core.f0<T>> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        final Semaphore f16644b = new Semaphore(0);

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.core.f0<T>> f16645c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.core.f0<T> f16646d;

        a() {
        }

        @Override // org.reactivestreams.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.rxjava3.core.f0<T> f0Var) {
            boolean z4;
            if (this.f16645c.getAndSet(f0Var) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f16644b.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            io.reactivex.rxjava3.core.f0<T> f0Var = this.f16646d;
            if (f0Var != null && f0Var.g()) {
                throw io.reactivex.rxjava3.internal.util.k.i(this.f16646d.d());
            }
            io.reactivex.rxjava3.core.f0<T> f0Var2 = this.f16646d;
            if ((f0Var2 == null || f0Var2.h()) && this.f16646d == null) {
                try {
                    io.reactivex.rxjava3.internal.util.e.b();
                    this.f16644b.acquire();
                    io.reactivex.rxjava3.core.f0<T> andSet = this.f16645c.getAndSet(null);
                    this.f16646d = andSet;
                    if (andSet.g()) {
                        throw io.reactivex.rxjava3.internal.util.k.i(andSet.d());
                    }
                } catch (InterruptedException e5) {
                    dispose();
                    this.f16646d = io.reactivex.rxjava3.core.f0.b(e5);
                    throw io.reactivex.rxjava3.internal.util.k.i(e5);
                }
            }
            return this.f16646d.h();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext() && this.f16646d.h()) {
                T e5 = this.f16646d.e();
                this.f16646d = null;
                return e5;
            }
            throw new NoSuchElementException();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public c(org.reactivestreams.o<? extends T> oVar) {
        this.f16643a = oVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.rxjava3.core.o.p3(this.f16643a).i4().N6(aVar);
        return aVar;
    }
}
