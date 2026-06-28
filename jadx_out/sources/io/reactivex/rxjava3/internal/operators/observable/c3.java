package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class c3 {

    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.internal.fuseable.l<T>, Runnable {
        static final int FUSED = 1;
        static final int ON_COMPLETE = 3;
        static final int ON_NEXT = 2;
        static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        final io.reactivex.rxjava3.core.p0<? super T> observer;
        final T value;

        public a(io.reactivex.rxjava3.core.p0<? super T> p0Var, T t5) {
            this.observer = p0Var;
            this.value = t5;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(T t5) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            if (get() == 1) {
                lazySet(3);
                return this.value;
            }
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(T t5, T t6) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, R> extends io.reactivex.rxjava3.core.i0<R> {

        /* renamed from: a, reason: collision with root package name */
        final T f17580a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> f17581b;

        b(T t5, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar) {
            this.f17580a = t5;
            this.f17581b = oVar;
        }

        @Override // io.reactivex.rxjava3.core.i0
        public void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
            try {
                io.reactivex.rxjava3.core.n0<? extends R> apply = this.f17581b.apply(this.f17580a);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.n0<? extends R> n0Var = apply;
                if (n0Var instanceof m3.s) {
                    try {
                        Object obj = ((m3.s) n0Var).get();
                        if (obj == null) {
                            io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                            return;
                        }
                        a aVar = new a(p0Var, obj);
                        p0Var.onSubscribe(aVar);
                        aVar.run();
                        return;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                        return;
                    }
                }
                n0Var.subscribe(p0Var);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                io.reactivex.rxjava3.internal.disposables.d.error(th2, p0Var);
            }
        }
    }

    private c3() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> io.reactivex.rxjava3.core.i0<U> a(T t5, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> oVar) {
        return io.reactivex.rxjava3.plugins.a.R(new b(t5, oVar));
    }

    public static <T, R> boolean b(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar) {
        if (n0Var instanceof m3.s) {
            try {
                a1.a aVar = (Object) ((m3.s) n0Var).get();
                if (aVar == null) {
                    io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                    return true;
                }
                try {
                    io.reactivex.rxjava3.core.n0<? extends R> apply = oVar.apply(aVar);
                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                    io.reactivex.rxjava3.core.n0<? extends R> n0Var2 = apply;
                    if (n0Var2 instanceof m3.s) {
                        try {
                            Object obj = ((m3.s) n0Var2).get();
                            if (obj == null) {
                                io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                                return true;
                            }
                            a aVar2 = new a(p0Var, obj);
                            p0Var.onSubscribe(aVar2);
                            aVar2.run();
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                            return true;
                        }
                    } else {
                        n0Var2.subscribe(p0Var);
                    }
                    return true;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    io.reactivex.rxjava3.internal.disposables.d.error(th2, p0Var);
                    return true;
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                io.reactivex.rxjava3.internal.disposables.d.error(th3, p0Var);
                return true;
            }
        }
        return false;
    }
}
