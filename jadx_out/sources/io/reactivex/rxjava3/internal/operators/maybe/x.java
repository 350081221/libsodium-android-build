package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class x<T> extends io.reactivex.rxjava3.core.r0<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T> f17427a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<? extends T> f17428b;

    /* renamed from: c, reason: collision with root package name */
    final m3.d<? super T, ? super T> f17429c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        final io.reactivex.rxjava3.core.u0<? super Boolean> downstream;
        final m3.d<? super T, ? super T> isEqual;
        final b<T> observer1;
        final b<T> observer2;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, m3.d<? super T, ? super T> dVar) {
            super(2);
            this.downstream = u0Var;
            this.isEqual = dVar;
            this.observer1 = new b<>(this);
            this.observer2 = new b<>(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.observer1.dispose();
            this.observer2.dispose();
        }

        void done() {
            boolean z4;
            if (decrementAndGet() == 0) {
                Object obj = this.observer1.value;
                Object obj2 = this.observer2.value;
                if (obj != null && obj2 != null) {
                    try {
                        this.downstream.onSuccess(Boolean.valueOf(this.isEqual.a(obj, obj2)));
                        return;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                io.reactivex.rxjava3.core.u0<? super Boolean> u0Var = this.downstream;
                if (obj == null && obj2 == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                u0Var.onSuccess(Boolean.valueOf(z4));
            }
        }

        void error(b<T> bVar, Throwable th) {
            if (getAndSet(0) > 0) {
                b<T> bVar2 = this.observer1;
                if (bVar == bVar2) {
                    this.observer2.dispose();
                } else {
                    bVar2.dispose();
                }
                this.downstream.onError(th);
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.observer1.get());
        }

        void subscribe(io.reactivex.rxjava3.core.d0<? extends T> d0Var, io.reactivex.rxjava3.core.d0<? extends T> d0Var2) {
            d0Var.a(this.observer1);
            d0Var2.a(this.observer2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T> {
        private static final long serialVersionUID = -3031974433025990931L;
        final a<T> parent;
        Object value;

        b(a<T> aVar) {
            this.parent = aVar;
        }

        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.parent.done();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.value = t5;
            this.parent.done();
        }
    }

    public x(io.reactivex.rxjava3.core.d0<? extends T> d0Var, io.reactivex.rxjava3.core.d0<? extends T> d0Var2, m3.d<? super T, ? super T> dVar) {
        this.f17427a = d0Var;
        this.f17428b = d0Var2;
        this.f17429c = dVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        a aVar = new a(u0Var, this.f17429c);
        u0Var.onSubscribe(aVar);
        aVar.subscribe(this.f17427a, this.f17428b);
    }
}
