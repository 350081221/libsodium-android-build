package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class r<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final m3.s<? extends U> f18013b;

    /* renamed from: c, reason: collision with root package name */
    final m3.b<? super U, ? super T> f18014c;

    /* loaded from: classes3.dex */
    static final class a<T, U> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super U> f18015a;

        /* renamed from: b, reason: collision with root package name */
        final m3.b<? super U, ? super T> f18016b;

        /* renamed from: c, reason: collision with root package name */
        final U f18017c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18018d;

        /* renamed from: e, reason: collision with root package name */
        boolean f18019e;

        a(io.reactivex.rxjava3.core.p0<? super U> p0Var, U u4, m3.b<? super U, ? super T> bVar) {
            this.f18015a = p0Var;
            this.f18016b = bVar;
            this.f18017c = u4;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18018d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18018d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f18019e) {
                return;
            }
            this.f18019e = true;
            this.f18015a.onNext(this.f18017c);
            this.f18015a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f18019e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18019e = true;
                this.f18015a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f18019e) {
                return;
            }
            try {
                this.f18016b.accept(this.f18017c, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18018d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18018d, eVar)) {
                this.f18018d = eVar;
                this.f18015a.onSubscribe(this);
            }
        }
    }

    public r(io.reactivex.rxjava3.core.n0<T> n0Var, m3.s<? extends U> sVar, m3.b<? super U, ? super T> bVar) {
        super(n0Var);
        this.f18013b = sVar;
        this.f18014c = bVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        try {
            U u4 = this.f18013b.get();
            Objects.requireNonNull(u4, "The initialSupplier returned a null value");
            this.f17528a.subscribe(new a(p0Var, u4, this.f18014c));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
