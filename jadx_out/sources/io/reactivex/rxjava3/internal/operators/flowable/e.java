package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class e<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f16700a;

    /* loaded from: classes3.dex */
    static final class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final b<T> f16701a;

        /* renamed from: b, reason: collision with root package name */
        private final org.reactivestreams.o<? extends T> f16702b;

        /* renamed from: c, reason: collision with root package name */
        private T f16703c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16704d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16705e = true;

        /* renamed from: f, reason: collision with root package name */
        private Throwable f16706f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f16707g;

        a(org.reactivestreams.o<? extends T> oVar, b<T> bVar) {
            this.f16702b = oVar;
            this.f16701a = bVar;
        }

        private boolean a() {
            try {
                if (!this.f16707g) {
                    this.f16707g = true;
                    this.f16701a.e();
                    io.reactivex.rxjava3.core.o.p3(this.f16702b).i4().N6(this.f16701a);
                }
                io.reactivex.rxjava3.core.f0<T> g5 = this.f16701a.g();
                if (g5.h()) {
                    this.f16705e = false;
                    this.f16703c = g5.e();
                    return true;
                }
                this.f16704d = false;
                if (g5.f()) {
                    return false;
                }
                Throwable d5 = g5.d();
                this.f16706f = d5;
                throw io.reactivex.rxjava3.internal.util.k.i(d5);
            } catch (InterruptedException e5) {
                this.f16701a.dispose();
                this.f16706f = e5;
                throw io.reactivex.rxjava3.internal.util.k.i(e5);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f16706f;
            if (th == null) {
                if (!this.f16704d) {
                    return false;
                }
                if (this.f16705e && !a()) {
                    return false;
                }
                return true;
            }
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f16706f;
            if (th == null) {
                if (hasNext()) {
                    this.f16705e = true;
                    return this.f16703c;
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
    public static final class b<T> extends io.reactivex.rxjava3.subscribers.b<io.reactivex.rxjava3.core.f0<T>> {

        /* renamed from: b, reason: collision with root package name */
        private final BlockingQueue<io.reactivex.rxjava3.core.f0<T>> f16708b = new ArrayBlockingQueue(1);

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f16709c = new AtomicInteger();

        b() {
        }

        @Override // org.reactivestreams.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.rxjava3.core.f0<T> f0Var) {
            if (this.f16709c.getAndSet(0) == 1 || !f0Var.h()) {
                while (!this.f16708b.offer(f0Var)) {
                    io.reactivex.rxjava3.core.f0<T> poll = this.f16708b.poll();
                    if (poll != null && !poll.h()) {
                        f0Var = poll;
                    }
                }
            }
        }

        void e() {
            this.f16709c.set(1);
        }

        public io.reactivex.rxjava3.core.f0<T> g() throws InterruptedException {
            e();
            io.reactivex.rxjava3.internal.util.e.b();
            return this.f16708b.take();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    public e(org.reactivestreams.o<? extends T> oVar) {
        this.f16700a = oVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f16700a, new b());
    }
}
