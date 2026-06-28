package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class b1<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends Iterable<? extends R>> f17550b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super R> f17551a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends Iterable<? extends R>> f17552b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17553c;

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f17551a = p0Var;
            this.f17552b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17553c.dispose();
            this.f17553c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17553c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.disposables.e eVar = this.f17553c;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar == cVar) {
                return;
            }
            this.f17553c = cVar;
            this.f17551a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.disposables.e eVar = this.f17553c;
            io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (eVar == cVar) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17553c = cVar;
                this.f17551a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17553c == io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                return;
            }
            try {
                io.reactivex.rxjava3.core.p0<? super R> p0Var = this.f17551a;
                for (R r5 : this.f17552b.apply(t5)) {
                    try {
                        try {
                            Objects.requireNonNull(r5, "The iterator returned a null value");
                            p0Var.onNext(r5);
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            this.f17553c.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        this.f17553c.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                this.f17553c.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17553c, eVar)) {
                this.f17553c = eVar;
                this.f17551a.onSubscribe(this);
            }
        }
    }

    public b1(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(n0Var);
        this.f17550b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17550b));
    }
}
