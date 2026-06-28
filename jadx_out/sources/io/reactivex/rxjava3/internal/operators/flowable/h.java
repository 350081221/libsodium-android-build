package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<? extends T>[] f16770b;

    /* renamed from: c, reason: collision with root package name */
    final Iterable<? extends org.reactivestreams.o<? extends T>> f16771c;

    /* loaded from: classes3.dex */
    static final class a<T> implements org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16772a;

        /* renamed from: b, reason: collision with root package name */
        final b<T>[] f16773b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f16774c = new AtomicInteger();

        a(org.reactivestreams.p<? super T> pVar, int i5) {
            this.f16772a = pVar;
            this.f16773b = new b[i5];
        }

        public void a(org.reactivestreams.o<? extends T>[] oVarArr) {
            b<T>[] bVarArr = this.f16773b;
            int length = bVarArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5 + 1;
                bVarArr[i5] = new b<>(this, i6, this.f16772a);
                i5 = i6;
            }
            this.f16774c.lazySet(0);
            this.f16772a.onSubscribe(this);
            for (int i7 = 0; i7 < length && this.f16774c.get() == 0; i7++) {
                oVarArr[i7].subscribe(bVarArr[i7]);
            }
        }

        public boolean b(int i5) {
            int i6 = 0;
            if (this.f16774c.get() != 0 || !this.f16774c.compareAndSet(0, i5)) {
                return false;
            }
            b<T>[] bVarArr = this.f16773b;
            int length = bVarArr.length;
            while (i6 < length) {
                int i7 = i6 + 1;
                if (i7 != i5) {
                    bVarArr[i6].cancel();
                }
                i6 = i7;
            }
            return true;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.f16774c.get() != -1) {
                this.f16774c.lazySet(-1);
                for (b<T> bVar : this.f16773b) {
                    bVar.cancel();
                }
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                int i5 = this.f16774c.get();
                if (i5 > 0) {
                    this.f16773b[i5 - 1].request(j5);
                    return;
                }
                if (i5 == 0) {
                    for (b<T> bVar : this.f16773b) {
                        bVar.request(j5);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -1185974347409665484L;
        final org.reactivestreams.p<? super T> downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final a<T> parent;
        boolean won;

        b(a<T> aVar, int i5, org.reactivestreams.p<? super T> pVar) {
            this.parent = aVar;
            this.index = i5;
            this.downstream = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.b(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            } else {
                get().cancel();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.b(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                get().cancel();
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.won) {
                this.downstream.onNext(t5);
            } else if (this.parent.b(this.index)) {
                this.won = true;
                this.downstream.onNext(t5);
            } else {
                get().cancel();
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this, this.missedRequested, qVar);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this, this.missedRequested, j5);
        }
    }

    public h(org.reactivestreams.o<? extends T>[] oVarArr, Iterable<? extends org.reactivestreams.o<? extends T>> iterable) {
        this.f16770b = oVarArr;
        this.f16771c = iterable;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        int length;
        org.reactivestreams.o<? extends T>[] oVarArr = this.f16770b;
        if (oVarArr == null) {
            oVarArr = new org.reactivestreams.o[8];
            try {
                length = 0;
                for (org.reactivestreams.o<? extends T> oVar : this.f16771c) {
                    if (oVar == null) {
                        io.reactivex.rxjava3.internal.subscriptions.g.error(new NullPointerException("One of the sources is null"), pVar);
                        return;
                    }
                    if (length == oVarArr.length) {
                        org.reactivestreams.o<? extends T>[] oVarArr2 = new org.reactivestreams.o[(length >> 2) + length];
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length);
                        oVarArr = oVarArr2;
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
            io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
        } else if (length == 1) {
            oVarArr[0].subscribe(pVar);
        } else {
            new a(pVar, length).a(oVarArr);
        }
    }
}
