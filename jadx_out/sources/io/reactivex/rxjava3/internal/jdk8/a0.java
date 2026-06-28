package io.reactivex.rxjava3.internal.jdk8;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* loaded from: classes3.dex */
public final class a0<T, A, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<? extends T> f16294b;

    /* renamed from: c, reason: collision with root package name */
    final Collector<T, A, R> f16295c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, A, R> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        final BiConsumer<A, T> accumulator;
        final BinaryOperator<A> combiner;
        A container;
        boolean done;
        final b<T, A, R> parent;

        a(b<T, A, R> bVar, A a5, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator) {
            this.parent = bVar;
            this.accumulator = biConsumer;
            this.combiner = binaryOperator;
            this.container = a5;
        }

        void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.done) {
                A a5 = this.container;
                this.container = null;
                this.done = true;
                this.parent.innerComplete(a5, this.combiner);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.container = null;
            this.done = true;
            this.parent.innerError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.done) {
                try {
                    this.accumulator.accept(this.container, t5);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    get().cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, A, R> extends io.reactivex.rxjava3.internal.subscriptions.f<R> {
        private static final long serialVersionUID = -5370107872170712765L;
        final AtomicReference<c<A>> current;
        final io.reactivex.rxjava3.internal.util.c error;
        final Function<A, R> finisher;
        final AtomicInteger remaining;
        final a<T, A, R>[] subscribers;

        b(org.reactivestreams.p<? super R> pVar, int i5, Collector<T, A, R> collector) {
            super(pVar);
            this.current = new AtomicReference<>();
            this.remaining = new AtomicInteger();
            this.error = new io.reactivex.rxjava3.internal.util.c();
            this.finisher = collector.finisher();
            a<T, A, R>[] aVarArr = new a[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                aVarArr[i6] = new a<>(this, collector.supplier().get(), collector.accumulator(), collector.combiner());
            }
            this.subscribers = aVarArr;
            this.remaining.lazySet(i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        c<A> addValue(A a5) {
            c<A> cVar;
            int tryAcquireSlot;
            while (true) {
                cVar = this.current.get();
                if (cVar == null) {
                    cVar = new c<>();
                    if (!androidx.compose.animation.core.h.a(this.current, null, cVar)) {
                        continue;
                    }
                }
                tryAcquireSlot = cVar.tryAcquireSlot();
                if (tryAcquireSlot >= 0) {
                    break;
                }
                androidx.compose.animation.core.h.a(this.current, cVar, null);
            }
            if (tryAcquireSlot == 0) {
                cVar.first = a5;
            } else {
                cVar.second = a5;
            }
            if (!cVar.releaseSlot()) {
                return null;
            }
            androidx.compose.animation.core.h.a(this.current, cVar, null);
            return cVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            for (a<T, A, R> aVar : this.subscribers) {
                aVar.cancel();
            }
        }

        void innerComplete(A a5, BinaryOperator<A> binaryOperator) {
            while (true) {
                c<A> addValue = addValue(a5);
                if (addValue == null) {
                    break;
                }
                try {
                    a5 = (A) binaryOperator.apply(addValue.first, addValue.second);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    innerError(th);
                    return;
                }
            }
            if (this.remaining.decrementAndGet() == 0) {
                c<A> cVar = this.current.get();
                this.current.lazySet(null);
                try {
                    R apply = this.finisher.apply(cVar.first);
                    Objects.requireNonNull(apply, "The finisher returned a null value");
                    complete(apply);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    innerError(th2);
                }
            }
        }

        void innerError(Throwable th) {
            if (this.error.compareAndSet(null, th)) {
                cancel();
                this.downstream.onError(th);
            } else if (th != this.error.get()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        T first;
        final AtomicInteger releaseIndex = new AtomicInteger();
        T second;

        c() {
        }

        boolean releaseSlot() {
            return this.releaseIndex.incrementAndGet() == 2;
        }

        int tryAcquireSlot() {
            int i5;
            do {
                i5 = get();
                if (i5 >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i5, i5 + 1));
            return i5;
        }
    }

    public a0(io.reactivex.rxjava3.parallel.b<? extends T> bVar, Collector<T, A, R> collector) {
        this.f16294b = bVar;
        this.f16295c = collector;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        try {
            b bVar = new b(pVar, this.f16294b.M(), this.f16295c);
            pVar.onSubscribe(bVar);
            this.f16294b.X(bVar.subscribers);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
