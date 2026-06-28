package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class s3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f18093b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f18094a;

        /* renamed from: b, reason: collision with root package name */
        boolean f18095b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18096c;

        /* renamed from: d, reason: collision with root package name */
        long f18097d;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5) {
            this.f18094a = p0Var;
            this.f18097d = j5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18096c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18096c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.f18095b) {
                this.f18095b = true;
                this.f18096c.dispose();
                this.f18094a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f18095b) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f18095b = true;
            this.f18096c.dispose();
            this.f18094a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            boolean z4;
            if (!this.f18095b) {
                long j5 = this.f18097d;
                long j6 = j5 - 1;
                this.f18097d = j6;
                if (j5 > 0) {
                    if (j6 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f18094a.onNext(t5);
                    if (z4) {
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18096c, eVar)) {
                this.f18096c = eVar;
                if (this.f18097d == 0) {
                    this.f18095b = true;
                    eVar.dispose();
                    io.reactivex.rxjava3.internal.disposables.d.complete(this.f18094a);
                    return;
                }
                this.f18094a.onSubscribe(this);
            }
        }
    }

    public s3(io.reactivex.rxjava3.core.n0<T> n0Var, long j5) {
        super(n0Var);
        this.f18093b = j5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18093b));
    }
}
