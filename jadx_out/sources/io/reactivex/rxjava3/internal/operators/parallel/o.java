package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.t;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<? extends T> f18302b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<T, T, T> f18303c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<org.reactivestreams.q> implements t<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        boolean done;
        final b<T> parent;
        final m3.c<T, T, T> reducer;
        T value;

        a(b<T> bVar, m3.c<T, T, T> cVar) {
            this.parent = bVar;
            this.reducer = cVar;
        }

        void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.parent.innerComplete(this.value);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.done = true;
                this.parent.innerError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.done) {
                T t6 = this.value;
                if (t6 == null) {
                    this.value = t5;
                    return;
                }
                try {
                    T apply = this.reducer.apply(t6, t5);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.value = apply;
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
    public static final class b<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        final AtomicReference<c<T>> current;
        final io.reactivex.rxjava3.internal.util.c error;
        final m3.c<T, T, T> reducer;
        final AtomicInteger remaining;
        final a<T>[] subscribers;

        b(org.reactivestreams.p<? super T> pVar, int i5, m3.c<T, T, T> cVar) {
            super(pVar);
            this.current = new AtomicReference<>();
            this.remaining = new AtomicInteger();
            this.error = new io.reactivex.rxjava3.internal.util.c();
            a<T>[] aVarArr = new a[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                aVarArr[i6] = new a<>(this, cVar);
            }
            this.subscribers = aVarArr;
            this.reducer = cVar;
            this.remaining.lazySet(i5);
        }

        c<T> addValue(T t5) {
            c<T> cVar;
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
                cVar.first = t5;
            } else {
                cVar.second = t5;
            }
            if (!cVar.releaseSlot()) {
                return null;
            }
            androidx.compose.animation.core.h.a(this.current, cVar, null);
            return cVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            for (a<T> aVar : this.subscribers) {
                aVar.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            if (r2.remaining.decrementAndGet() != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        
            r3 = r2.current.get();
            r2.current.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r3 == null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        
            complete(r3.first);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        
            r2.downstream.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:1:0x0000, code lost:
        
            if (r3 != null) goto L3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
        
            r3 = addValue(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
        
            if (r3 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
        
            r3 = r2.reducer.apply(r3.first, r3.second);
            java.util.Objects.requireNonNull(r3, "The reducer returned a null value");
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        
            io.reactivex.rxjava3.exceptions.b.b(r3);
            innerError(r3);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void innerComplete(T r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L20
            L2:
                io.reactivex.rxjava3.internal.operators.parallel.o$c r3 = r2.addValue(r3)
                if (r3 == 0) goto L20
                m3.c<T, T, T> r0 = r2.reducer     // Catch: java.lang.Throwable -> L18
                T r1 = r3.first     // Catch: java.lang.Throwable -> L18
                T r3 = r3.second     // Catch: java.lang.Throwable -> L18
                java.lang.Object r3 = r0.apply(r1, r3)     // Catch: java.lang.Throwable -> L18
                java.lang.String r0 = "The reducer returned a null value"
                java.util.Objects.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L18
                goto L2
            L18:
                r3 = move-exception
                io.reactivex.rxjava3.exceptions.b.b(r3)
                r2.innerError(r3)
                return
            L20:
                java.util.concurrent.atomic.AtomicInteger r3 = r2.remaining
                int r3 = r3.decrementAndGet()
                if (r3 != 0) goto L43
                java.util.concurrent.atomic.AtomicReference<io.reactivex.rxjava3.internal.operators.parallel.o$c<T>> r3 = r2.current
                java.lang.Object r3 = r3.get()
                io.reactivex.rxjava3.internal.operators.parallel.o$c r3 = (io.reactivex.rxjava3.internal.operators.parallel.o.c) r3
                java.util.concurrent.atomic.AtomicReference<io.reactivex.rxjava3.internal.operators.parallel.o$c<T>> r0 = r2.current
                r1 = 0
                r0.lazySet(r1)
                if (r3 == 0) goto L3e
                T r3 = r3.first
                r2.complete(r3)
                goto L43
            L3e:
                org.reactivestreams.p<? super T> r3 = r2.downstream
                r3.onComplete()
            L43:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.parallel.o.b.innerComplete(java.lang.Object):void");
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

    public o(io.reactivex.rxjava3.parallel.b<? extends T> bVar, m3.c<T, T, T> cVar) {
        this.f18302b = bVar;
        this.f18303c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        b bVar = new b(pVar, this.f18302b.M(), this.f18303c);
        pVar.onSubscribe(bVar);
        this.f18302b.X(bVar.subscribers);
    }
}
