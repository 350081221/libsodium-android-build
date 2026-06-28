package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17585a;

    /* renamed from: b, reason: collision with root package name */
    final T f17586b;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.observers.b<T> {

        /* renamed from: b, reason: collision with root package name */
        volatile Object f17587b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0500a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            private Object f17588a;

            C0500a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f17588a = a.this.f17587b;
                return !io.reactivex.rxjava3.internal.util.q.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f17588a == null) {
                        this.f17588a = a.this.f17587b;
                    }
                    if (!io.reactivex.rxjava3.internal.util.q.isComplete(this.f17588a)) {
                        if (!io.reactivex.rxjava3.internal.util.q.isError(this.f17588a)) {
                            return (T) io.reactivex.rxjava3.internal.util.q.getValue(this.f17588a);
                        }
                        throw io.reactivex.rxjava3.internal.util.k.i(io.reactivex.rxjava3.internal.util.q.getError(this.f17588a));
                    }
                    throw new NoSuchElementException();
                } finally {
                    this.f17588a = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        a(T t5) {
            this.f17587b = io.reactivex.rxjava3.internal.util.q.next(t5);
        }

        public a<T>.C0500a c() {
            return new C0500a();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17587b = io.reactivex.rxjava3.internal.util.q.complete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17587b = io.reactivex.rxjava3.internal.util.q.error(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17587b = io.reactivex.rxjava3.internal.util.q.next(t5);
        }
    }

    public d(io.reactivex.rxjava3.core.n0<T> n0Var, T t5) {
        this.f17585a = n0Var;
        this.f17586b = t5;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f17586b);
        this.f17585a.subscribe(aVar);
        return aVar.c();
    }
}
