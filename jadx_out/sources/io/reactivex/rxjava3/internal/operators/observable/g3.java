package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class g3<T> extends io.reactivex.rxjava3.core.r0<Boolean> implements io.reactivex.rxjava3.internal.fuseable.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17706a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T> f17707b;

    /* renamed from: c, reason: collision with root package name */
    final m3.d<? super T, ? super T> f17708c;

    /* renamed from: d, reason: collision with root package name */
    final int f17709d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final m3.d<? super T, ? super T> comparer;
        final io.reactivex.rxjava3.core.u0<? super Boolean> downstream;
        final io.reactivex.rxjava3.core.n0<? extends T> first;
        final b<T>[] observers;
        final io.reactivex.rxjava3.internal.disposables.a resources;
        final io.reactivex.rxjava3.core.n0<? extends T> second;

        /* renamed from: v1, reason: collision with root package name */
        T f17710v1;

        /* renamed from: v2, reason: collision with root package name */
        T f17711v2;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, int i5, io.reactivex.rxjava3.core.n0<? extends T> n0Var, io.reactivex.rxjava3.core.n0<? extends T> n0Var2, m3.d<? super T, ? super T> dVar) {
            this.downstream = u0Var;
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
                    bVarArr[0].f17713b.clear();
                    bVarArr[1].f17713b.clear();
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
            io.reactivex.rxjava3.internal.queue.c<T> cVar = bVar.f17713b;
            b<T> bVar2 = bVarArr[1];
            io.reactivex.rxjava3.internal.queue.c<T> cVar2 = bVar2.f17713b;
            int i5 = 1;
            while (!this.cancelled) {
                boolean z6 = bVar.f17715d;
                if (z6 && (th2 = bVar.f17716e) != null) {
                    cancel(cVar, cVar2);
                    this.downstream.onError(th2);
                    return;
                }
                boolean z7 = bVar2.f17715d;
                if (z7 && (th = bVar2.f17716e) != null) {
                    cancel(cVar, cVar2);
                    this.downstream.onError(th);
                    return;
                }
                if (this.f17710v1 == null) {
                    this.f17710v1 = cVar.poll();
                }
                if (this.f17710v1 == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f17711v2 == null) {
                    this.f17711v2 = cVar2.poll();
                }
                T t5 = this.f17711v2;
                if (t5 == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z6 && z7 && z4 && z5) {
                    this.downstream.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z6 && z7 && z4 != z5) {
                    cancel(cVar, cVar2);
                    this.downstream.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z4 && !z5) {
                    try {
                        if (!this.comparer.a(this.f17710v1, t5)) {
                            cancel(cVar, cVar2);
                            this.downstream.onSuccess(Boolean.FALSE);
                            return;
                        } else {
                            this.f17710v1 = null;
                            this.f17711v2 = null;
                        }
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
        final a<T> f17712a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.queue.c<T> f17713b;

        /* renamed from: c, reason: collision with root package name */
        final int f17714c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f17715d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f17716e;

        b(a<T> aVar, int i5, int i6) {
            this.f17712a = aVar;
            this.f17714c = i5;
            this.f17713b = new io.reactivex.rxjava3.internal.queue.c<>(i6);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17715d = true;
            this.f17712a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17716e = th;
            this.f17715d = true;
            this.f17712a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17713b.offer(t5);
            this.f17712a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f17712a.setDisposable(eVar, this.f17714c);
        }
    }

    public g3(io.reactivex.rxjava3.core.n0<? extends T> n0Var, io.reactivex.rxjava3.core.n0<? extends T> n0Var2, m3.d<? super T, ? super T> dVar, int i5) {
        this.f17706a = n0Var;
        this.f17707b = n0Var2;
        this.f17708c = dVar;
        this.f17709d = i5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    public void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        a aVar = new a(u0Var, this.f17709d, this.f17706a, this.f17707b, this.f17708c);
        u0Var.onSubscribe(aVar);
        aVar.subscribe();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public io.reactivex.rxjava3.core.i0<Boolean> b() {
        return io.reactivex.rxjava3.plugins.a.R(new f3(this.f17706a, this.f17707b, this.f17708c, this.f17709d));
    }
}
