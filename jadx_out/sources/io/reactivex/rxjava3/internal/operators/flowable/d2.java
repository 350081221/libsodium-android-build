package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d2<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<T> f16682a;

    /* renamed from: b, reason: collision with root package name */
    final T f16683b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f16684a;

        /* renamed from: b, reason: collision with root package name */
        final T f16685b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16686c;

        /* renamed from: d, reason: collision with root package name */
        T f16687d;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, T t5) {
            this.f16684a = u0Var;
            this.f16685b = t5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16686c.cancel();
            this.f16686c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16686c == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16686c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            T t5 = this.f16687d;
            if (t5 != null) {
                this.f16687d = null;
                this.f16684a.onSuccess(t5);
                return;
            }
            T t6 = this.f16685b;
            if (t6 != null) {
                this.f16684a.onSuccess(t6);
            } else {
                this.f16684a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16686c = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f16687d = null;
            this.f16684a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f16687d = t5;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16686c, qVar)) {
                this.f16686c = qVar;
                this.f16684a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public d2(org.reactivestreams.o<T> oVar, T t5) {
        this.f16682a = oVar;
        this.f16683b = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f16682a.subscribe(new a(u0Var, this.f16683b));
    }
}
