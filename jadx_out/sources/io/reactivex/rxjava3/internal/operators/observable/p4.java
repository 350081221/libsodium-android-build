package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class p4<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    @l3.g
    final io.reactivex.rxjava3.core.n0<?>[] f17962b;

    /* renamed from: c, reason: collision with root package name */
    @l3.g
    final Iterable<? extends io.reactivex.rxjava3.core.n0<?>> f17963c;

    /* renamed from: d, reason: collision with root package name */
    @l3.f
    final m3.o<? super Object[], R> f17964d;

    /* loaded from: classes3.dex */
    final class a implements m3.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // m3.o
        public R apply(T t5) throws Throwable {
            R apply = p4.this.f17964d.apply(new Object[]{t5});
            Objects.requireNonNull(apply, "The combiner returned a null value");
            return apply;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 1577321883966341961L;
        final m3.o<? super Object[], R> combiner;
        volatile boolean done;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.c error;
        final c[] observers;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream;
        final AtomicReferenceArray<Object> values;

        b(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super Object[], R> oVar, int i5) {
            this.downstream = p0Var;
            this.combiner = oVar;
            c[] cVarArr = new c[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                cVarArr[i6] = new c(this, i6);
            }
            this.observers = cVarArr;
            this.values = new AtomicReferenceArray<>(i5);
            this.upstream = new AtomicReference<>();
            this.error = new io.reactivex.rxjava3.internal.util.c();
        }

        void cancelAllBut(int i5) {
            c[] cVarArr = this.observers;
            for (int i6 = 0; i6 < cVarArr.length; i6++) {
                if (i6 != i5) {
                    cVarArr[i6].dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            for (c cVar : this.observers) {
                cVar.dispose();
            }
        }

        void innerComplete(int i5, boolean z4) {
            if (!z4) {
                this.done = true;
                cancelAllBut(i5);
                io.reactivex.rxjava3.internal.util.l.a(this.downstream, this, this.error);
            }
        }

        void innerError(int i5, Throwable th) {
            this.done = true;
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            cancelAllBut(i5);
            io.reactivex.rxjava3.internal.util.l.c(this.downstream, th, this, this.error);
        }

        void innerNext(int i5, Object obj) {
            this.values.set(i5, obj);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                cancelAllBut(-1);
                io.reactivex.rxjava3.internal.util.l.a(this.downstream, this, this.error);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            io.reactivex.rxjava3.internal.util.l.c(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i5 = 0;
            objArr[0] = t5;
            while (i5 < length) {
                Object obj = atomicReferenceArray.get(i5);
                if (obj == null) {
                    return;
                }
                i5++;
                objArr[i5] = obj;
            }
            try {
                R apply = this.combiner.apply(objArr);
                Objects.requireNonNull(apply, "combiner returned a null value");
                io.reactivex.rxjava3.internal.util.l.e(this.downstream, apply, this, this.error);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar);
        }

        void subscribe(io.reactivex.rxjava3.core.n0<?>[] n0VarArr, int i5) {
            c[] cVarArr = this.observers;
            AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference = this.upstream;
            for (int i6 = 0; i6 < i5 && !io.reactivex.rxjava3.internal.disposables.c.isDisposed(atomicReference.get()) && !this.done; i6++) {
                n0VarArr[i6].subscribe(cVarArr[i6]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final b<?, ?> parent;

        c(b<?, ?> bVar, int i5) {
            this.parent = bVar;
            this.index = i5;
        }

        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }
    }

    public p4(@l3.f io.reactivex.rxjava3.core.n0<T> n0Var, @l3.f io.reactivex.rxjava3.core.n0<?>[] n0VarArr, @l3.f m3.o<? super Object[], R> oVar) {
        super(n0Var);
        this.f17962b = n0VarArr;
        this.f17963c = null;
        this.f17964d = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        int length;
        io.reactivex.rxjava3.core.n0<?>[] n0VarArr = this.f17962b;
        if (n0VarArr == null) {
            n0VarArr = new io.reactivex.rxjava3.core.n0[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.n0<?> n0Var : this.f17963c) {
                    if (length == n0VarArr.length) {
                        n0VarArr = (io.reactivex.rxjava3.core.n0[]) Arrays.copyOf(n0VarArr, (length >> 1) + length);
                    }
                    int i5 = length + 1;
                    n0VarArr[length] = n0Var;
                    length = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                return;
            }
        } else {
            length = n0VarArr.length;
        }
        if (length == 0) {
            new a2(this.f17528a, new a()).l6(p0Var);
            return;
        }
        b bVar = new b(p0Var, this.f17964d, length);
        p0Var.onSubscribe(bVar);
        bVar.subscribe(n0VarArr, length);
        this.f17528a.subscribe(bVar);
    }

    public p4(@l3.f io.reactivex.rxjava3.core.n0<T> n0Var, @l3.f Iterable<? extends io.reactivex.rxjava3.core.n0<?>> iterable, @l3.f m3.o<? super Object[], R> oVar) {
        super(n0Var);
        this.f17962b = null;
        this.f17963c = iterable;
        this.f17964d = oVar;
    }
}
