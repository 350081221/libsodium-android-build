package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16669a;

    /* renamed from: b, reason: collision with root package name */
    final T f16670b;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.subscribers.a<T> {

        /* renamed from: b, reason: collision with root package name */
        volatile Object f16671b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0466a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            private Object f16672a;

            C0466a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f16672a = a.this.f16671b;
                return !io.reactivex.rxjava3.internal.util.q.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f16672a == null) {
                        this.f16672a = a.this.f16671b;
                    }
                    if (!io.reactivex.rxjava3.internal.util.q.isComplete(this.f16672a)) {
                        if (!io.reactivex.rxjava3.internal.util.q.isError(this.f16672a)) {
                            return (T) io.reactivex.rxjava3.internal.util.q.getValue(this.f16672a);
                        }
                        throw io.reactivex.rxjava3.internal.util.k.i(io.reactivex.rxjava3.internal.util.q.getError(this.f16672a));
                    }
                    throw new NoSuchElementException();
                } finally {
                    this.f16672a = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        a(T t5) {
            this.f16671b = io.reactivex.rxjava3.internal.util.q.next(t5);
        }

        public a<T>.C0466a d() {
            return new C0466a();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16671b = io.reactivex.rxjava3.internal.util.q.complete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16671b = io.reactivex.rxjava3.internal.util.q.error(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f16671b = io.reactivex.rxjava3.internal.util.q.next(t5);
        }
    }

    public d(io.reactivex.rxjava3.core.o<T> oVar, T t5) {
        this.f16669a = oVar;
        this.f16670b = t5;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f16670b);
        this.f16669a.N6(aVar);
        return aVar.d();
    }
}
