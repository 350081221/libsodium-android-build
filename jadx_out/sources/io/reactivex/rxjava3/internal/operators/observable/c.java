package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17572a;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.observers.e<io.reactivex.rxjava3.core.f0<T>> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.core.f0<T> f17573b;

        /* renamed from: c, reason: collision with root package name */
        final Semaphore f17574c = new Semaphore(0);

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.core.f0<T>> f17575d = new AtomicReference<>();

        a() {
        }

        @Override // io.reactivex.rxjava3.core.p0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.rxjava3.core.f0<T> f0Var) {
            boolean z4;
            if (this.f17575d.getAndSet(f0Var) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f17574c.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            io.reactivex.rxjava3.core.f0<T> f0Var = this.f17573b;
            if (f0Var != null && f0Var.g()) {
                throw io.reactivex.rxjava3.internal.util.k.i(this.f17573b.d());
            }
            if (this.f17573b == null) {
                try {
                    io.reactivex.rxjava3.internal.util.e.b();
                    this.f17574c.acquire();
                    io.reactivex.rxjava3.core.f0<T> andSet = this.f17575d.getAndSet(null);
                    this.f17573b = andSet;
                    if (andSet.g()) {
                        throw io.reactivex.rxjava3.internal.util.k.i(andSet.d());
                    }
                } catch (InterruptedException e5) {
                    dispose();
                    this.f17573b = io.reactivex.rxjava3.core.f0.b(e5);
                    throw io.reactivex.rxjava3.internal.util.k.i(e5);
                }
            }
            return this.f17573b.h();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T e5 = this.f17573b.e();
                this.f17573b = null;
                return e5;
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public c(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f17572a = n0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.rxjava3.core.i0.q8(this.f17572a).X3().subscribe(aVar);
        return aVar;
    }
}
