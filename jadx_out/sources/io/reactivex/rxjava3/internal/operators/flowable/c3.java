package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class c3<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<T> f16654a;

    /* renamed from: b, reason: collision with root package name */
    final R f16655b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<R, ? super T, R> f16656c;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super R> f16657a;

        /* renamed from: b, reason: collision with root package name */
        final m3.c<R, ? super T, R> f16658b;

        /* renamed from: c, reason: collision with root package name */
        R f16659c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f16660d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(io.reactivex.rxjava3.core.u0<? super R> u0Var, m3.c<R, ? super T, R> cVar, R r5) {
            this.f16657a = u0Var;
            this.f16659c = r5;
            this.f16658b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16660d.cancel();
            this.f16660d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16660d == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            R r5 = this.f16659c;
            if (r5 != null) {
                this.f16659c = null;
                this.f16660d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                this.f16657a.onSuccess(r5);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16659c != null) {
                this.f16659c = null;
                this.f16660d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                this.f16657a.onError(th);
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            R r5 = this.f16659c;
            if (r5 != null) {
                try {
                    R apply = this.f16658b.apply(r5, t5);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.f16659c = apply;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.f16660d.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16660d, qVar)) {
                this.f16660d = qVar;
                this.f16657a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public c3(org.reactivestreams.o<T> oVar, R r5, m3.c<R, ? super T, R> cVar) {
        this.f16654a = oVar;
        this.f16655b = r5;
        this.f16656c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        this.f16654a.subscribe(new a(u0Var, this.f16656c, this.f16655b));
    }
}
