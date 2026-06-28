package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super io.reactivex.rxjava3.core.i0<Throwable>, ? extends io.reactivex.rxjava3.core.n0<?>> f18202b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 802743776666017014L;
        volatile boolean active;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final io.reactivex.rxjava3.subjects.i<Throwable> signaller;
        final io.reactivex.rxjava3.core.n0<T> source;
        final AtomicInteger wip = new AtomicInteger();
        final io.reactivex.rxjava3.internal.util.c error = new io.reactivex.rxjava3.internal.util.c();
        final a<T>.C0517a inner = new C0517a();
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.z2$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0517a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            C0517a() {
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onComplete() {
                a.this.innerComplete();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onError(Throwable th) {
                a.this.innerError(th);
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onNext(Object obj) {
                a.this.innerNext();
            }

            @Override // io.reactivex.rxjava3.core.p0
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.subjects.i<Throwable> iVar, io.reactivex.rxjava3.core.n0<T> n0Var) {
            this.downstream = p0Var;
            this.signaller = iVar;
            this.source = n0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.inner);
        }

        void innerComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.util.l.a(this.downstream, this, this.error);
        }

        void innerError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.util.l.c(this.downstream, th, this, this.error);
        }

        void innerNext() {
            subscribeNext();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.inner);
            io.reactivex.rxjava3.internal.util.l.a(this.downstream, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this.upstream, null);
            this.active = false;
            this.signaller.onNext(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            io.reactivex.rxjava3.internal.util.l.e(this.downstream, t5, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this.upstream, eVar);
        }

        void subscribeNext() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.active) {
                    this.active = true;
                    this.source.subscribe(this);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public z2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super io.reactivex.rxjava3.core.i0<Throwable>, ? extends io.reactivex.rxjava3.core.n0<?>> oVar) {
        super(n0Var);
        this.f18202b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.subjects.i<T> M8 = io.reactivex.rxjava3.subjects.e.O8().M8();
        try {
            io.reactivex.rxjava3.core.n0<?> apply = this.f18202b.apply(M8);
            Objects.requireNonNull(apply, "The handler returned a null ObservableSource");
            io.reactivex.rxjava3.core.n0<?> n0Var = apply;
            a aVar = new a(p0Var, M8, this.f17528a);
            p0Var.onSubscribe(aVar);
            n0Var.subscribe(aVar.inner);
            aVar.subscribeNext();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
