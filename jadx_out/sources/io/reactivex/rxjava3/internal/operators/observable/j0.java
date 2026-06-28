package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class j0<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        io.reactivex.rxjava3.core.p0<? super T> f17778a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17779b;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.f17778a = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.disposables.e eVar = this.f17779b;
            this.f17779b = io.reactivex.rxjava3.internal.util.h.INSTANCE;
            this.f17778a = io.reactivex.rxjava3.internal.util.h.asObserver();
            eVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17779b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.f17778a;
            this.f17779b = io.reactivex.rxjava3.internal.util.h.INSTANCE;
            this.f17778a = io.reactivex.rxjava3.internal.util.h.asObserver();
            p0Var.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.f17778a;
            this.f17779b = io.reactivex.rxjava3.internal.util.h.INSTANCE;
            this.f17778a = io.reactivex.rxjava3.internal.util.h.asObserver();
            p0Var.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f17778a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17779b, eVar)) {
                this.f17779b = eVar;
                this.f17778a.onSubscribe(this);
            }
        }
    }

    public j0(io.reactivex.rxjava3.core.n0<T> n0Var) {
        super(n0Var);
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var));
    }
}
