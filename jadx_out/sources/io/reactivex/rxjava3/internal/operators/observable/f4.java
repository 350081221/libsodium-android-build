package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class f4<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final m3.s<U> f17677b;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super U> f17678a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17679b;

        /* renamed from: c, reason: collision with root package name */
        U f17680c;

        a(io.reactivex.rxjava3.core.p0<? super U> p0Var, U u4) {
            this.f17678a = p0Var;
            this.f17680c = u4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17679b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17679b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            U u4 = this.f17680c;
            this.f17680c = null;
            this.f17678a.onNext(u4);
            this.f17678a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17680c = null;
            this.f17678a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17680c.add(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17679b, eVar)) {
                this.f17679b = eVar;
                this.f17678a.onSubscribe(this);
            }
        }
    }

    public f4(io.reactivex.rxjava3.core.n0<T> n0Var, m3.s<U> sVar) {
        super(n0Var);
        this.f17677b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        try {
            this.f17528a.subscribe(new a(p0Var, (Collection) io.reactivex.rxjava3.internal.util.k.d(this.f17677b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
