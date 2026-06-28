package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q4<T, R> extends io.reactivex.rxjava3.core.i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends T>[] f18003a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.n0<? extends T>> f18004b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super Object[], ? extends R> f18005c;

    /* renamed from: d, reason: collision with root package name */
    final int f18006d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f18007e;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final b<T, R>[] observers;
        final T[] row;
        final m3.o<? super Object[], ? extends R> zipper;

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super Object[], ? extends R> oVar, int i5, boolean z4) {
            this.downstream = p0Var;
            this.zipper = oVar;
            this.observers = new b[i5];
            this.row = (T[]) new Object[i5];
            this.delayError = z4;
        }

        void cancel() {
            clear();
            cancelSources();
        }

        void cancelSources() {
            for (b<T, R> bVar : this.observers) {
                bVar.a();
            }
        }

        boolean checkTerminated(boolean z4, boolean z5, io.reactivex.rxjava3.core.p0<? super R> p0Var, boolean z6, b<?, ?> bVar) {
            if (this.cancelled) {
                cancel();
                return true;
            }
            if (z4) {
                if (z6) {
                    if (z5) {
                        Throwable th = bVar.f18011d;
                        this.cancelled = true;
                        cancel();
                        if (th != null) {
                            p0Var.onError(th);
                        } else {
                            p0Var.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = bVar.f18011d;
                if (th2 != null) {
                    this.cancelled = true;
                    cancel();
                    p0Var.onError(th2);
                    return true;
                }
                if (z5) {
                    this.cancelled = true;
                    cancel();
                    p0Var.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        void clear() {
            for (b<T, R> bVar : this.observers) {
                bVar.f18009b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear();
                }
            }
        }

        public void drain() {
            Throwable th;
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.observers;
            io.reactivex.rxjava3.core.p0<? super R> p0Var = this.downstream;
            T[] tArr = this.row;
            boolean z5 = this.delayError;
            int i5 = 1;
            while (true) {
                int i6 = 0;
                int i7 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i7] == null) {
                        boolean z6 = bVar.f18010c;
                        T poll = bVar.f18009b.poll();
                        if (poll == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (checkTerminated(z6, z4, p0Var, z5, bVar)) {
                            return;
                        }
                        if (!z4) {
                            tArr[i7] = poll;
                        } else {
                            i6++;
                        }
                    } else if (bVar.f18010c && !z5 && (th = bVar.f18011d) != null) {
                        this.cancelled = true;
                        cancel();
                        p0Var.onError(th);
                        return;
                    }
                    i7++;
                }
                if (i6 != 0) {
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    try {
                        R apply = this.zipper.apply(tArr.clone());
                        Objects.requireNonNull(apply, "The zipper returned a null value");
                        p0Var.onNext(apply);
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        cancel();
                        p0Var.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr, int i5) {
            b<T, R>[] bVarArr = this.observers;
            int length = bVarArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                bVarArr[i6] = new b<>(this, i5);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i7 = 0; i7 < length && !this.cancelled; i7++) {
                n0VarArr[i7].subscribe(bVarArr[i7]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, R> implements io.reactivex.rxjava3.core.p0<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T, R> f18008a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.queue.c<T> f18009b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f18010c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f18011d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.disposables.e> f18012e = new AtomicReference<>();

        b(a<T, R> aVar, int i5) {
            this.f18008a = aVar;
            this.f18009b = new io.reactivex.rxjava3.internal.queue.c<>(i5);
        }

        public void a() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.f18012e);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f18010c = true;
            this.f18008a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f18011d = th;
            this.f18010c = true;
            this.f18008a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f18009b.offer(t5);
            this.f18008a.drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f18012e, eVar);
        }
    }

    public q4(io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr, Iterable<? extends io.reactivex.rxjava3.core.n0<? extends T>> iterable, m3.o<? super Object[], ? extends R> oVar, int i5, boolean z4) {
        this.f18003a = n0VarArr;
        this.f18004b = iterable;
        this.f18005c = oVar;
        this.f18006d = i5;
        this.f18007e = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        int length;
        io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr = this.f18003a;
        if (n0VarArr == null) {
            n0VarArr = new io.reactivex.rxjava3.core.n0[8];
            length = 0;
            for (io.reactivex.rxjava3.core.n0<? extends T> n0Var : this.f18004b) {
                if (length == n0VarArr.length) {
                    io.reactivex.rxjava3.core.n0<? extends T>[] n0VarArr2 = new io.reactivex.rxjava3.core.n0[(length >> 2) + length];
                    System.arraycopy(n0VarArr, 0, n0VarArr2, 0, length);
                    n0VarArr = n0VarArr2;
                }
                n0VarArr[length] = n0Var;
                length++;
            }
        } else {
            length = n0VarArr.length;
        }
        if (length == 0) {
            io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
        } else {
            new a(p0Var, this.f18005c, length, this.f18007e).subscribe(n0VarArr, this.f18006d);
        }
    }
}
