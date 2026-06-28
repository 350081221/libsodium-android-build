package io.reactivex.rxjava3.internal.operators.single;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class h0<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f18379a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18380a;

        /* renamed from: b, reason: collision with root package name */
        org.reactivestreams.q f18381b;

        /* renamed from: c, reason: collision with root package name */
        T f18382c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18383d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f18384e;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
            this.f18380a = u0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18384e = true;
            this.f18381b.cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18384e;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f18383d) {
                return;
            }
            this.f18383d = true;
            T t5 = this.f18382c;
            this.f18382c = null;
            if (t5 == null) {
                this.f18380a.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.f18380a.onSuccess(t5);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18383d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f18383d = true;
            this.f18382c = null;
            this.f18380a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18383d) {
                return;
            }
            if (this.f18382c != null) {
                this.f18381b.cancel();
                this.f18383d = true;
                this.f18382c = null;
                this.f18380a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
                return;
            }
            this.f18382c = t5;
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18381b, qVar)) {
                this.f18381b = qVar;
                this.f18380a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public h0(org.reactivestreams.o<? extends T> oVar) {
        this.f18379a = oVar;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18379a.subscribe(new a(u0Var));
    }
}
