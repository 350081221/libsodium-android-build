package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.t;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<List<T>> f18310b;

    /* renamed from: c, reason: collision with root package name */
    final Comparator<? super T> f18311c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<org.reactivestreams.q> implements t<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int index;
        final b<T> parent;

        a(b<T> bVar, int i5) {
            this.parent = bVar;
            this.index = i5;
        }

        void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.p
        public void onNext(List<T> list) {
            this.parent.innerNext(list, this.index);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicInteger implements org.reactivestreams.q {
        private static final long serialVersionUID = 3481980673745556697L;
        volatile boolean cancelled;
        final Comparator<? super T> comparator;
        final org.reactivestreams.p<? super T> downstream;
        final int[] indexes;
        final List<T>[] lists;
        final a<T>[] subscribers;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger remaining = new AtomicInteger();
        final AtomicReference<Throwable> error = new AtomicReference<>();

        b(org.reactivestreams.p<? super T> pVar, int i5, Comparator<? super T> comparator) {
            this.downstream = pVar;
            this.comparator = comparator;
            a<T>[] aVarArr = new a[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                aVarArr[i6] = new a<>(this, i6);
            }
            this.subscribers = aVarArr;
            this.lists = new List[i5];
            this.indexes = new int[i5];
            this.remaining.lazySet(i5);
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    Arrays.fill(this.lists, (Object) null);
                }
            }
        }

        void cancelAll() {
            for (a<T> aVar : this.subscribers) {
                aVar.cancel();
            }
        }

        void drain() {
            boolean z4;
            boolean z5;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super T> pVar = this.downstream;
            List<T>[] listArr = this.lists;
            int[] iArr = this.indexes;
            int length = iArr.length;
            int i5 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    if (this.cancelled) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th = this.error.get();
                    if (th != null) {
                        cancelAll();
                        Arrays.fill(listArr, (Object) null);
                        pVar.onError(th);
                        return;
                    }
                    int i6 = -1;
                    T t5 = null;
                    for (int i7 = 0; i7 < length; i7++) {
                        List<T> list = listArr[i7];
                        int i8 = iArr[i7];
                        if (list.size() != i8) {
                            if (t5 == null) {
                                t5 = list.get(i8);
                            } else {
                                T t6 = list.get(i8);
                                try {
                                    if (this.comparator.compare(t5, t6) > 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        t5 = t6;
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.b.b(th2);
                                    cancelAll();
                                    Arrays.fill(listArr, (Object) null);
                                    if (!androidx.compose.animation.core.h.a(this.error, null, th2)) {
                                        io.reactivex.rxjava3.plugins.a.Y(th2);
                                    }
                                    pVar.onError(this.error.get());
                                    return;
                                }
                            }
                            i6 = i7;
                        }
                    }
                    if (t5 == null) {
                        Arrays.fill(listArr, (Object) null);
                        pVar.onComplete();
                        return;
                    } else {
                        pVar.onNext(t5);
                        iArr[i6] = iArr[i6] + 1;
                        j6++;
                    }
                }
                if (this.cancelled) {
                    Arrays.fill(listArr, (Object) null);
                    return;
                }
                Throwable th3 = this.error.get();
                if (th3 != null) {
                    cancelAll();
                    Arrays.fill(listArr, (Object) null);
                    pVar.onError(th3);
                    return;
                }
                int i9 = 0;
                while (true) {
                    if (i9 < length) {
                        if (iArr[i9] != listArr[i9].size()) {
                            z4 = false;
                            break;
                        }
                        i9++;
                    } else {
                        z4 = true;
                        break;
                    }
                }
                if (z4) {
                    Arrays.fill(listArr, (Object) null);
                    pVar.onComplete();
                    return;
                } else {
                    if (j6 != 0) {
                        io.reactivex.rxjava3.internal.util.d.e(this.requested, j6);
                    }
                    i5 = addAndGet(-i5);
                }
            } while (i5 != 0);
        }

        void innerError(Throwable th) {
            if (androidx.compose.animation.core.h.a(this.error, null, th)) {
                drain();
            } else if (th != this.error.get()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        void innerNext(List<T> list, int i5) {
            this.lists[i5] = list;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }
    }

    public q(io.reactivex.rxjava3.parallel.b<List<T>> bVar, Comparator<? super T> comparator) {
        this.f18310b = bVar;
        this.f18311c = comparator;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        b bVar = new b(pVar, this.f18310b.M(), this.f18311c);
        pVar.onSubscribe(bVar);
        this.f18310b.X(bVar.subscribers);
    }
}
