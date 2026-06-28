package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class m<T, C extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, C> {

    /* renamed from: c, reason: collision with root package name */
    final int f16862c;

    /* renamed from: d, reason: collision with root package name */
    final int f16863d;

    /* renamed from: e, reason: collision with root package name */
    final m3.s<C> f16864e;

    /* loaded from: classes3.dex */
    static final class a<T, C extends Collection<? super T>> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super C> f16865a;

        /* renamed from: b, reason: collision with root package name */
        final m3.s<C> f16866b;

        /* renamed from: c, reason: collision with root package name */
        final int f16867c;

        /* renamed from: d, reason: collision with root package name */
        C f16868d;

        /* renamed from: e, reason: collision with root package name */
        org.reactivestreams.q f16869e;

        /* renamed from: f, reason: collision with root package name */
        boolean f16870f;

        /* renamed from: g, reason: collision with root package name */
        int f16871g;

        a(org.reactivestreams.p<? super C> pVar, int i5, m3.s<C> sVar) {
            this.f16865a = pVar;
            this.f16867c = i5;
            this.f16866b = sVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16869e.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16870f) {
                return;
            }
            this.f16870f = true;
            C c5 = this.f16868d;
            this.f16868d = null;
            if (c5 != null) {
                this.f16865a.onNext(c5);
            }
            this.f16865a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16870f) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f16868d = null;
            this.f16870f = true;
            this.f16865a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16870f) {
                return;
            }
            C c5 = this.f16868d;
            if (c5 == null) {
                try {
                    C c6 = this.f16866b.get();
                    Objects.requireNonNull(c6, "The bufferSupplier returned a null buffer");
                    c5 = c6;
                    this.f16868d = c5;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c5.add(t5);
            int i5 = this.f16871g + 1;
            if (i5 == this.f16867c) {
                this.f16871g = 0;
                this.f16868d = null;
                this.f16865a.onNext(c5);
                return;
            }
            this.f16871g = i5;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16869e, qVar)) {
                this.f16869e = qVar;
                this.f16865a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                this.f16869e.request(io.reactivex.rxjava3.internal.util.d.d(j5, this.f16867c));
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, C extends Collection<? super T>> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, m3.e {
        private static final long serialVersionUID = -7370244972039324525L;
        final m3.s<C> bufferSupplier;
        volatile boolean cancelled;
        boolean done;
        final org.reactivestreams.p<? super C> downstream;
        int index;
        long produced;
        final int size;
        final int skip;
        org.reactivestreams.q upstream;
        final AtomicBoolean once = new AtomicBoolean();
        final ArrayDeque<C> buffers = new ArrayDeque<>();

        b(org.reactivestreams.p<? super C> pVar, int i5, int i6, m3.s<C> sVar) {
            this.downstream = pVar;
            this.size = i5;
            this.skip = i6;
            this.bufferSupplier = sVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // m3.e
        public boolean getAsBoolean() {
            return this.cancelled;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            long j5 = this.produced;
            if (j5 != 0) {
                io.reactivex.rxjava3.internal.util.d.e(this, j5);
            }
            io.reactivex.rxjava3.internal.util.v.g(this.downstream, this.buffers, this, this);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.buffers;
            int i5 = this.index;
            int i6 = i5 + 1;
            if (i5 == 0) {
                try {
                    C c5 = this.bufferSupplier.get();
                    Objects.requireNonNull(c5, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer(c5);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection.size() + 1 == this.size) {
                arrayDeque.poll();
                collection.add(t5);
                this.produced++;
                this.downstream.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t5);
            }
            if (i6 == this.skip) {
                i6 = 0;
            }
            this.index = i6;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (!io.reactivex.rxjava3.internal.subscriptions.j.validate(j5) || io.reactivex.rxjava3.internal.util.v.i(j5, this.downstream, this.buffers, this, this)) {
                return;
            }
            if (!this.once.get() && this.once.compareAndSet(false, true)) {
                this.upstream.request(io.reactivex.rxjava3.internal.util.d.c(this.size, io.reactivex.rxjava3.internal.util.d.d(this.skip, j5 - 1)));
            } else {
                this.upstream.request(io.reactivex.rxjava3.internal.util.d.d(this.skip, j5));
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T, C extends Collection<? super T>> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final m3.s<C> bufferSupplier;
        boolean done;
        final org.reactivestreams.p<? super C> downstream;
        int index;
        final int size;
        final int skip;
        org.reactivestreams.q upstream;

        c(org.reactivestreams.p<? super C> pVar, int i5, int i6, m3.s<C> sVar) {
            this.downstream = pVar;
            this.size = i5;
            this.skip = i6;
            this.bufferSupplier = sVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c5 = this.buffer;
            this.buffer = null;
            if (c5 != null) {
                this.downstream.onNext(c5);
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            C c5 = this.buffer;
            int i5 = this.index;
            int i6 = i5 + 1;
            if (i5 == 0) {
                try {
                    C c6 = this.bufferSupplier.get();
                    Objects.requireNonNull(c6, "The bufferSupplier returned a null buffer");
                    c5 = c6;
                    this.buffer = c5;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c5 != null) {
                c5.add(t5);
                if (c5.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c5);
                }
            }
            if (i6 == this.skip) {
                i6 = 0;
            }
            this.index = i6;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.upstream.request(io.reactivex.rxjava3.internal.util.d.c(io.reactivex.rxjava3.internal.util.d.d(j5, this.size), io.reactivex.rxjava3.internal.util.d.d(this.skip - this.size, j5 - 1)));
                    return;
                }
                this.upstream.request(io.reactivex.rxjava3.internal.util.d.d(this.skip, j5));
            }
        }
    }

    public m(io.reactivex.rxjava3.core.o<T> oVar, int i5, int i6, m3.s<C> sVar) {
        super(oVar);
        this.f16862c = i5;
        this.f16863d = i6;
        this.f16864e = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super C> pVar) {
        int i5 = this.f16862c;
        int i6 = this.f16863d;
        if (i5 == i6) {
            this.f16598b.N6(new a(pVar, i5, this.f16864e));
        } else if (i6 > i5) {
            this.f16598b.N6(new c(pVar, this.f16862c, this.f16863d, this.f16864e));
        } else {
            this.f16598b.N6(new b(pVar, this.f16862c, this.f16863d, this.f16864e));
        }
    }
}
