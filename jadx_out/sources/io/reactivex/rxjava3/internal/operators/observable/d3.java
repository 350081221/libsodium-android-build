package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class d3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.c<T, T, T> f17609b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17610a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<T, T, T> f17611b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17612c;

        /* renamed from: d, reason: collision with root package name */
        T f17613d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17614e;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.c<T, T, T> cVar) {
            this.f17610a = p0Var;
            this.f17611b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17612c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17612c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17614e) {
                return;
            }
            this.f17614e = true;
            this.f17610a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17614e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17614e = true;
                this.f17610a.onError(th);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17614e) {
                return;
            }
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.f17610a;
            T t6 = this.f17613d;
            if (t6 == null) {
                this.f17613d = t5;
                p0Var.onNext(t5);
                return;
            }
            try {
                T apply = this.f17611b.apply(t6, t5);
                Objects.requireNonNull(apply, "The value returned by the accumulator is null");
                this.f17613d = apply;
                p0Var.onNext(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17612c.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17612c, eVar)) {
                this.f17612c = eVar;
                this.f17610a.onSubscribe(this);
            }
        }
    }

    public d3(io.reactivex.rxjava3.core.n0<T> n0Var, m3.c<T, T, T> cVar) {
        super(n0Var);
        this.f17609b = cVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17609b));
    }
}
