package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class d5<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    @l3.g
    final org.reactivestreams.o<?>[] f16696c;

    /* renamed from: d, reason: collision with root package name */
    @l3.g
    final Iterable<? extends org.reactivestreams.o<?>> f16697d;

    /* renamed from: e, reason: collision with root package name */
    final m3.o<? super Object[], R> f16698e;

    /* loaded from: classes3.dex */
    final class a implements m3.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // m3.o
        public R apply(T t5) throws Throwable {
            R apply = d5.this.f16698e.apply(new Object[]{t5});
            Objects.requireNonNull(apply, "The combiner returned a null value");
            return apply;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 1577321883966341961L;
        final m3.o<? super Object[], R> combiner;
        volatile boolean done;
        final org.reactivestreams.p<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.c error;
        final AtomicLong requested;
        final c[] subscribers;
        final AtomicReference<org.reactivestreams.q> upstream;
        final AtomicReferenceArray<Object> values;

        b(org.reactivestreams.p<? super R> pVar, m3.o<? super Object[], R> oVar, int i5) {
            this.downstream = pVar;
            this.combiner = oVar;
            c[] cVarArr = new c[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                cVarArr[i6] = new c(this, i6);
            }
            this.subscribers = cVarArr;
            this.values = new AtomicReferenceArray<>(i5);
            this.upstream = new AtomicReference<>();
            this.requested = new AtomicLong();
            this.error = new io.reactivex.rxjava3.internal.util.c();
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            for (c cVar : this.subscribers) {
                cVar.dispose();
            }
        }

        void cancelAllBut(int i5) {
            c[] cVarArr = this.subscribers;
            for (int i6 = 0; i6 < cVarArr.length; i6++) {
                if (i6 != i5) {
                    cVarArr[i6].dispose();
                }
            }
        }

        void innerComplete(int i5, boolean z4) {
            if (!z4) {
                this.done = true;
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                cancelAllBut(i5);
                io.reactivex.rxjava3.internal.util.l.b(this.downstream, this, this.error);
            }
        }

        void innerError(int i5, Throwable th) {
            this.done = true;
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            cancelAllBut(i5);
            io.reactivex.rxjava3.internal.util.l.d(this.downstream, th, this, this.error);
        }

        void innerNext(int i5, Object obj) {
            this.values.set(i5, obj);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                cancelAllBut(-1);
                io.reactivex.rxjava3.internal.util.l.b(this.downstream, this, this.error);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            io.reactivex.rxjava3.internal.util.l.d(this.downstream, th, this, this.error);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.done) {
                this.upstream.get().request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.upstream, this.requested, qVar);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this.requested, j5);
        }

        void subscribe(org.reactivestreams.o<?>[] oVarArr, int i5) {
            c[] cVarArr = this.subscribers;
            AtomicReference<org.reactivestreams.q> atomicReference = this.upstream;
            for (int i6 = 0; i6 < i5 && atomicReference.get() != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED; i6++) {
                oVarArr[i6].subscribe(cVarArr[i6]);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.done) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t5;
            int i5 = 0;
            while (i5 < length) {
                Object obj = atomicReferenceArray.get(i5);
                if (obj == null) {
                    return false;
                }
                i5++;
                objArr[i5] = obj;
            }
            try {
                R apply = this.combiner.apply(objArr);
                Objects.requireNonNull(apply, "The combiner returned a null value");
                io.reactivex.rxjava3.internal.util.l.f(this.downstream, apply, this, this.error);
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final b<?, ?> parent;

        c(b<?, ?> bVar, int i5) {
            this.parent = bVar;
            this.index = i5;
        }

        void dispose() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    public d5(@l3.f io.reactivex.rxjava3.core.o<T> oVar, @l3.f org.reactivestreams.o<?>[] oVarArr, m3.o<? super Object[], R> oVar2) {
        super(oVar);
        this.f16696c = oVarArr;
        this.f16697d = null;
        this.f16698e = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        int length;
        org.reactivestreams.o<?>[] oVarArr = this.f16696c;
        if (oVarArr == null) {
            oVarArr = new org.reactivestreams.o[8];
            try {
                length = 0;
                for (org.reactivestreams.o<?> oVar : this.f16697d) {
                    if (length == oVarArr.length) {
                        oVarArr = (org.reactivestreams.o[]) Arrays.copyOf(oVarArr, (length >> 1) + length);
                    }
                    int i5 = length + 1;
                    oVarArr[length] = oVar;
                    length = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                return;
            }
        } else {
            length = oVarArr.length;
        }
        if (length == 0) {
            new f2(this.f16598b, new a()).O6(pVar);
            return;
        }
        b bVar = new b(pVar, this.f16698e, length);
        pVar.onSubscribe(bVar);
        bVar.subscribe(oVarArr, length);
        this.f16598b.N6(bVar);
    }

    public d5(@l3.f io.reactivex.rxjava3.core.o<T> oVar, @l3.f Iterable<? extends org.reactivestreams.o<?>> iterable, @l3.f m3.o<? super Object[], R> oVar2) {
        super(oVar);
        this.f16696c = null;
        this.f16697d = iterable;
        this.f16698e = oVar2;
    }
}
