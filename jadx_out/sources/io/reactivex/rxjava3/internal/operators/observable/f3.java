package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class f3<T> extends io.reactivex.rxjava3.core.i0<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17666a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17667b;

    /* renamed from: c, reason: collision with root package name */
    final m3.d<? super T, ? super T> f17668c;

    /* renamed from: d, reason: collision with root package name */
    final int f17669d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final m3.d<? super T, ? super T> comparer;
        final io.reactivex.rxjava3.core.p0<? super Boolean> downstream;
        final io.reactivex.rxjava3.core.n0<? extends T> first;
        final b<T>[] observers;
        final io.reactivex.rxjava3.internal.disposables.a resources;
        final io.reactivex.rxjava3.core.n0<? extends T> second;

        /* renamed from: v1, reason: collision with root package name */
        T f17670v1;

        /* renamed from: v2, reason: collision with root package name */
        T f17671v2;

        a(io.reactivex.rxjava3.core.p0<? super Boolean> p0Var, int i5, io.reactivex.rxjava3.core.n0<? extends T> n0Var, io.reactivex.rxjava3.core.n0<? extends T> n0Var2, m3.d<? super T, ? super T> dVar) {
            this.downstream = p0Var;
            this.first = n0Var;
            this.second = n0Var2;
            this.comparer = dVar;
            this.observers = r3;
            b<T>[] bVarArr = {new b<>(this, 0, i5), new b<>(this, 1, i5)};
            this.resources = new io.reactivex.rxjava3.internal.disposables.a(2);
        }

        void cancel(io.reactivex.rxjava3.internal.queue.c<T> cVar, io.reactivex.rxjava3.internal.queue.c<T> cVar2) {
            this.cancelled = true;
            cVar.clear();
            cVar2.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.resources.dispose();
                if (getAndIncrement() == 0) {
                    b<T>[] bVarArr = this.observers;
                    bVarArr[0].f17673b.clear();
                    bVarArr[1].f17673b.clear();
                }
            }
        }

        void drain() {
            boolean z4;
            boolean z5;
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.observers;
            b<T> bVar = bVarArr[0];
            io.reactivex.rxjava3.internal.queue.c<T> cVar = bVar.f17673b;
            b<T> bVar2 = bVarArr[1];
            io.reactivex.rxjava3.internal.queue.c<T> cVar2 = bVar2.f17673b;
            int i5 = 1;
            while (!this.cancelled) {
                boolean z6 = bVar.f17675d;
                if (z6 && (th2 = bVar.f17676e) != null) {
                    cancel(cVar, cVar2);
                    this.downstream.onError(th2);
                    return;
                }
                boolean z7 = bVar2.f17675d;
                if (z7 && (th = bVar2.f17676e) != null) {
                    cancel(cVar, cVar2);
                    this.downstream.onError(th);
                    return;
                }
                if (this.f17670v1 == null) {
                    this.f17670v1 = cVar.poll();
                }
                if (this.f17670v1 == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f17671v2 == null) {
                    this.f17671v2 = cVar2.poll();
                }
                T t5 = this.f17671v2;
                if (t5 == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z6 && z7 && z4 && z5) {
                    this.downstream.onNext(Boolean.TRUE);
                    this.downstream.onComplete();
                    return;
                }
                if (z6 && z7 && z4 != z5) {
                    cancel(cVar, cVar2);
                    this.downstream.onNext(Boolean.FALSE);
                    this.downstream.onComplete();
                    return;
                }
                if (!z4 && !z5) {
                    try {
                        if (!this.comparer.a(this.f17670v1, t5)) {
                            cancel(cVar, cVar2);
                            this.downstream.onNext(Boolean.FALSE);
                            this.downstream.onComplete();
                            return;
                        }
                        this.f17670v1 = null;
                        this.f17671v2 = null;
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.b.b(th3);
                        cancel(cVar, cVar2);
                        this.downstream.onError(th3);
                        return;
                    }
                }
                if (z4 || z5) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
            cVar.clear();
            cVar2.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        boolean setDisposable(io.reactivex.rxjava3.disposables.e eVar, int i5) {
            return this.resources.setResource(i5, eVar);
        }

        void subscribe() {
            b<T>[] bVarArr = this.observers;
            this.first.subscribe(bVarArr[0]);
            this.second.subscribe(bVarArr[1]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> implements io.reactivex.rxjava3.core.p0<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f17672a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.queue.c<T> f17673b;

        /* renamed from: c, reason: collision with root package name */
        final int f17674c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f17675d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f17676e;

        b(a<T> aVar, int i5, int i6) {
            this.f17672a = aVar;
            this.f17674c = i5;
            this.f17673b = new io.reactivex.rxjava3.internal.queue.c<>(i6);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17675d = true;
            this.f17672a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17676e = th;
            this.f17675d = true;
            this.f17672a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17673b.offer(t5);
            this.f17672a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f17672a.setDisposable(eVar, this.f17674c);
        }
    }

    public f3(io.reactivex.rxjava3.core.n0<? extends T> n0Var, io.reactivex.rxjava3.core.n0<? extends T> n0Var2, m3.d<? super T, ? super T> dVar, int i5) {
        this.f17666a = n0Var;
        this.f17667b = n0Var2;
        this.f17668c = dVar;
        this.f17669d = i5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super Boolean> p0Var) {
        a aVar = new a(p0Var, this.f17669d, this.f17666a, this.f17667b, this.f17668c);
        p0Var.onSubscribe(aVar);
        aVar.subscribe();
    }
}
