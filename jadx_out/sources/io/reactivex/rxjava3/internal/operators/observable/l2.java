package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class l2<T> extends io.reactivex.rxjava3.observables.a<T> implements io.reactivex.rxjava3.internal.fuseable.i<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17825a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>> f17826b = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<b<T>> implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 7463222674719692880L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, b<T> bVar) {
            this.downstream = p0Var;
            lazySet(bVar);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends AtomicReference<a<T>[]> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        static final a[] EMPTY = new a[0];
        static final a[] TERMINATED = new a[0];
        private static final long serialVersionUID = -3251430252873581268L;
        final AtomicReference<b<T>> current;
        Throwable error;
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();

        b(AtomicReference<b<T>> atomicReference) {
            this.current = atomicReference;
            lazySet(EMPTY);
        }

        public boolean add(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == TERMINATED) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            getAndSet(TERMINATED);
            androidx.compose.animation.core.h.a(this.current, this, null);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == TERMINATED;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.upstream.lazySet(io.reactivex.rxjava3.internal.disposables.c.DISPOSED);
            for (a<T> aVar : getAndSet(TERMINATED)) {
                aVar.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.disposables.e eVar = this.upstream.get();
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar != cVar) {
                this.error = th;
                this.upstream.lazySet(cVar);
                for (a<T> aVar : getAndSet(TERMINATED)) {
                    aVar.downstream.onError(th);
                }
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            for (a<T> aVar : get()) {
                aVar.downstream.onNext(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar);
        }

        public void remove(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (aVarArr[i5] == aVar) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 < 0) {
                    return;
                }
                aVarArr2 = EMPTY;
                if (length != 1) {
                    aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i5);
                    System.arraycopy(aVarArr, i5 + 1, aVarArr2, i5, (length - i5) - 1);
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }
    }

    public l2(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f17825a = n0Var;
    }

    @Override // io.reactivex.rxjava3.observables.a
    public void M8(m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f17826b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f17826b);
            if (androidx.compose.animation.core.h.a(this.f17826b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z4 = false;
        if (!bVar.connect.get() && bVar.connect.compareAndSet(false, true)) {
            z4 = true;
        }
        try {
            gVar.accept(bVar);
            if (z4) {
                this.f17825a.subscribe(bVar);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }

    @Override // io.reactivex.rxjava3.observables.a
    public void T8() {
        b<T> bVar = this.f17826b.get();
        if (bVar != null && bVar.isDisposed()) {
            androidx.compose.animation.core.h.a(this.f17826b, bVar, null);
        }
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        b<T> bVar;
        while (true) {
            bVar = this.f17826b.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(this.f17826b);
            if (androidx.compose.animation.core.h.a(this.f17826b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        a<T> aVar = new a<>(p0Var, bVar);
        p0Var.onSubscribe(aVar);
        if (bVar.add(aVar)) {
            if (aVar.isDisposed()) {
                bVar.remove(aVar);
            }
        } else {
            Throwable th = bVar.error;
            if (th != null) {
                p0Var.onError(th);
            } else {
                p0Var.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.i
    public io.reactivex.rxjava3.core.n0<T> source() {
        return this.f17825a;
    }
}
