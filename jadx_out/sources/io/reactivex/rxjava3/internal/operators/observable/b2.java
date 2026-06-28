package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class b2<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.core.n0<? extends R>> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> f17554b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.n0<? extends R>> f17555c;

    /* renamed from: d, reason: collision with root package name */
    final m3.s<? extends io.reactivex.rxjava3.core.n0<? extends R>> f17556d;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.n0<? extends R>> f17557a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> f17558b;

        /* renamed from: c, reason: collision with root package name */
        final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.n0<? extends R>> f17559c;

        /* renamed from: d, reason: collision with root package name */
        final m3.s<? extends io.reactivex.rxjava3.core.n0<? extends R>> f17560d;

        /* renamed from: e, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17561e;

        a(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.n0<? extends R>> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar2, m3.s<? extends io.reactivex.rxjava3.core.n0<? extends R>> sVar) {
            this.f17557a = p0Var;
            this.f17558b = oVar;
            this.f17559c = oVar2;
            this.f17560d = sVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17561e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17561e.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            try {
                io.reactivex.rxjava3.core.n0<? extends R> n0Var = this.f17560d.get();
                Objects.requireNonNull(n0Var, "The onComplete ObservableSource returned is null");
                this.f17557a.onNext(n0Var);
                this.f17557a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17557a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            try {
                io.reactivex.rxjava3.core.n0<? extends R> apply = this.f17559c.apply(th);
                Objects.requireNonNull(apply, "The onError ObservableSource returned is null");
                this.f17557a.onNext(apply);
                this.f17557a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f17557a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            try {
                io.reactivex.rxjava3.core.n0<? extends R> apply = this.f17558b.apply(t5);
                Objects.requireNonNull(apply, "The onNext ObservableSource returned is null");
                this.f17557a.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17557a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17561e, eVar)) {
                this.f17561e = eVar;
                this.f17557a.onSubscribe(this);
            }
        }
    }

    public b2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.n0<? extends R>> oVar2, m3.s<? extends io.reactivex.rxjava3.core.n0<? extends R>> sVar) {
        super(n0Var);
        this.f17554b = oVar;
        this.f17555c = oVar2;
        this.f17556d = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super io.reactivex.rxjava3.core.n0<? extends R>> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17554b, this.f17555c, this.f17556d));
    }
}
