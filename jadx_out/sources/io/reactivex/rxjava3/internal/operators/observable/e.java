package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class e<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17623a;

    /* loaded from: classes3.dex */
    static final class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final b<T> f17624a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.n0<T> f17625b;

        /* renamed from: c, reason: collision with root package name */
        private T f17626c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17627d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17628e = true;

        /* renamed from: f, reason: collision with root package name */
        private Throwable f17629f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f17630g;

        a(io.reactivex.rxjava3.core.n0<T> n0Var, b<T> bVar) {
            this.f17625b = n0Var;
            this.f17624a = bVar;
        }

        private boolean a() {
            if (!this.f17630g) {
                this.f17630g = true;
                this.f17624a.c();
                new c2(this.f17625b).subscribe(this.f17624a);
            }
            try {
                io.reactivex.rxjava3.core.f0<T> d5 = this.f17624a.d();
                if (d5.h()) {
                    this.f17628e = false;
                    this.f17626c = d5.e();
                    return true;
                }
                this.f17627d = false;
                if (d5.f()) {
                    return false;
                }
                Throwable d6 = d5.d();
                this.f17629f = d6;
                throw io.reactivex.rxjava3.internal.util.k.i(d6);
            } catch (InterruptedException e5) {
                this.f17624a.dispose();
                this.f17629f = e5;
                throw io.reactivex.rxjava3.internal.util.k.i(e5);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f17629f;
            if (th == null) {
                if (!this.f17627d) {
                    return false;
                }
                if (this.f17628e && !a()) {
                    return false;
                }
                return true;
            }
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f17629f;
            if (th == null) {
                if (hasNext()) {
                    this.f17628e = true;
                    return this.f17626c;
                }
                throw new NoSuchElementException("No more elements");
            }
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends io.reactivex.rxjava3.observers.e<io.reactivex.rxjava3.core.f0<T>> {

        /* renamed from: b, reason: collision with root package name */
        private final BlockingQueue<io.reactivex.rxjava3.core.f0<T>> f17631b = new ArrayBlockingQueue(1);

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f17632c = new AtomicInteger();

        b() {
        }

        @Override // io.reactivex.rxjava3.core.p0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.rxjava3.core.f0<T> f0Var) {
            if (this.f17632c.getAndSet(0) == 1 || !f0Var.h()) {
                while (!this.f17631b.offer(f0Var)) {
                    io.reactivex.rxjava3.core.f0<T> poll = this.f17631b.poll();
                    if (poll != null && !poll.h()) {
                        f0Var = poll;
                    }
                }
            }
        }

        void c() {
            this.f17632c.set(1);
        }

        public io.reactivex.rxjava3.core.f0<T> d() throws InterruptedException {
            c();
            io.reactivex.rxjava3.internal.util.e.b();
            return this.f17631b.take();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    public e(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f17623a = n0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f17623a, new b());
    }
}
