package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class i4<T, D> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends D> f17768a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super D, ? extends io.reactivex.rxjava3.core.n0<? extends T>> f17769b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super D> f17770c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17771d;

    /* loaded from: classes3.dex */
    static final class a<T, D> extends AtomicBoolean implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 5904473792286235046L;
        final m3.g<? super D> disposer;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final boolean eager;
        final D resource;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, D d5, m3.g<? super D> gVar, boolean z4) {
            this.downstream = p0Var;
            this.resource = d5;
            this.disposer = gVar;
            this.eager = z4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.eager) {
                disposeResource();
                this.upstream.dispose();
                this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            } else {
                this.upstream.dispose();
                this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
                disposeResource();
            }
        }

        void disposeResource() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.dispose();
                this.downstream.onComplete();
                return;
            }
            this.downstream.onComplete();
            this.upstream.dispose();
            disposeResource();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        th = new io.reactivex.rxjava3.exceptions.a(th, th2);
                    }
                }
                this.upstream.dispose();
                this.downstream.onError(th);
                return;
            }
            this.downstream.onError(th);
            this.upstream.dispose();
            disposeResource();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public i4(m3.s<? extends D> sVar, m3.o<? super D, ? extends io.reactivex.rxjava3.core.n0<? extends T>> oVar, m3.g<? super D> gVar, boolean z4) {
        this.f17768a = sVar;
        this.f17769b = oVar;
        this.f17770c = gVar;
        this.f17771d = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        try {
            D d5 = this.f17768a.get();
            try {
                io.reactivex.rxjava3.core.n0<? extends T> apply = this.f17769b.apply(d5);
                Objects.requireNonNull(apply, "The sourceSupplier returned a null ObservableSource");
                apply.subscribe(new a(p0Var, d5, this.f17770c, this.f17771d));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                try {
                    this.f17770c.accept(d5);
                    io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    io.reactivex.rxjava3.internal.disposables.d.error(new io.reactivex.rxjava3.exceptions.a(th, th2), p0Var);
                }
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.b.b(th3);
            io.reactivex.rxjava3.internal.disposables.d.error(th3, p0Var);
        }
    }
}
