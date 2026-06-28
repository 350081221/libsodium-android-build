package io.reactivex.rxjava3.internal.operators.observable;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class y1<T> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18185a;

    /* renamed from: b, reason: collision with root package name */
    final T f18186b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.u0<? super T> f18187a;

        /* renamed from: b, reason: collision with root package name */
        final T f18188b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18189c;

        /* renamed from: d, reason: collision with root package name */
        T f18190d;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, T t5) {
            this.f18187a = u0Var;
            this.f18188b = t5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18189c.dispose();
            this.f18189c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18189c == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f18189c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            T t5 = this.f18190d;
            if (t5 != null) {
                this.f18190d = null;
                this.f18187a.onSuccess(t5);
                return;
            }
            T t6 = this.f18188b;
            if (t6 != null) {
                this.f18187a.onSuccess(t6);
            } else {
                this.f18187a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f18189c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f18190d = null;
            this.f18187a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f18190d = t5;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18189c, eVar)) {
                this.f18189c = eVar;
                this.f18187a.onSubscribe(this);
            }
        }
    }

    public y1(io.reactivex.rxjava3.core.n0<T> n0Var, T t5) {
        this.f18185a = n0Var;
        this.f18186b = t5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        this.f18185a.subscribe(new a(u0Var, this.f18186b));
    }
}
