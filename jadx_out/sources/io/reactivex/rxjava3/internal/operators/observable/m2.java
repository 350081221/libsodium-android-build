package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class m2<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super io.reactivex.rxjava3.core.i0<T>, ? extends io.reactivex.rxjava3.core.n0<R>> f17857b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.subjects.e<T> f17858a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.rxjava3.disposables.e> f17859b;

        a(io.reactivex.rxjava3.subjects.e<T> eVar, AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference) {
            this.f17858a = eVar;
            this.f17859b = atomicReference;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17858a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17858a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17858a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.f17859b, eVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<R>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 854110278590336484L;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        io.reactivex.rxjava3.disposables.e upstream;

        b(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
            this.downstream = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.dispose();
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(R r5) {
            this.downstream.onNext(r5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public m2(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super io.reactivex.rxjava3.core.i0<T>, ? extends io.reactivex.rxjava3.core.n0<R>> oVar) {
        super(n0Var);
        this.f17857b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        io.reactivex.rxjava3.subjects.e O8 = io.reactivex.rxjava3.subjects.e.O8();
        try {
            io.reactivex.rxjava3.core.n0<R> apply = this.f17857b.apply(O8);
            Objects.requireNonNull(apply, "The selector returned a null ObservableSource");
            io.reactivex.rxjava3.core.n0<R> n0Var = apply;
            b bVar = new b(p0Var);
            n0Var.subscribe(bVar);
            this.f17528a.subscribe(new a(O8, bVar));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
