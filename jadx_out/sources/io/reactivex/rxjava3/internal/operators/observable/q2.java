package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class q2<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f17991a;

    /* renamed from: b, reason: collision with root package name */
    final R f17992b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<R, ? super T, R> f17993c;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super R> f17994a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<R, ? super T, R> f17995b;

        /* renamed from: c, reason: collision with root package name */
        R f17996c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17997d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(io.reactivex.rxjava3.core.u0<? super R> u0Var, m3.c<R, ? super T, R> cVar, R r5) {
            this.f17994a = u0Var;
            this.f17996c = r5;
            this.f17995b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17997d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17997d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            R r5 = this.f17996c;
            if (r5 != null) {
                this.f17996c = null;
                this.f17994a.onSuccess(r5);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17996c != null) {
                this.f17996c = null;
                this.f17994a.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            R r5 = this.f17996c;
            if (r5 != null) {
                try {
                    R apply = this.f17995b.apply(r5, t5);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.f17996c = apply;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.f17997d.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17997d, eVar)) {
                this.f17997d = eVar;
                this.f17994a.onSubscribe(this);
            }
        }
    }

    public q2(io.reactivex.rxjava3.core.n0<T> n0Var, R r5, m3.c<R, ? super T, R> cVar) {
        this.f17991a = n0Var;
        this.f17992b = r5;
        this.f17993c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        this.f17991a.subscribe(new a(u0Var, this.f17993c, this.f17992b));
    }
}
