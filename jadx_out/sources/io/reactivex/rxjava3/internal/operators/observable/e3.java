package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class e3<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.c<R, ? super T, R> f17646b;

    /* renamed from: c, reason: collision with root package name */
    final m3.s<R> f17647c;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super R> f17648a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<R, ? super T, R> f17649b;

        /* renamed from: c, reason: collision with root package name */
        R f17650c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17651d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17652e;

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.c<R, ? super T, R> cVar, R r5) {
            this.f17648a = p0Var;
            this.f17649b = cVar;
            this.f17650c = r5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17651d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17651d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17652e) {
                return;
            }
            this.f17652e = true;
            this.f17648a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17652e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17652e = true;
                this.f17648a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17652e) {
                return;
            }
            try {
                R apply = this.f17649b.apply(this.f17650c, t5);
                Objects.requireNonNull(apply, "The accumulator returned a null value");
                this.f17650c = apply;
                this.f17648a.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17651d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17651d, eVar)) {
                this.f17651d = eVar;
                this.f17648a.onSubscribe(this);
                this.f17648a.onNext(this.f17650c);
            }
        }
    }

    public e3(io.reactivex.rxjava3.core.n0<T> n0Var, m3.s<R> sVar, m3.c<R, ? super T, R> cVar) {
        super(n0Var);
        this.f17646b = cVar;
        this.f17647c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        try {
            R r5 = this.f17647c.get();
            Objects.requireNonNull(r5, "The seed supplied is null");
            this.f17528a.subscribe(new a(p0Var, this.f17646b, r5));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
