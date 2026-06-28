package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class l3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final int f17827b;

    /* loaded from: classes3.dex */
    static final class a<T> extends ArrayDeque<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -3807491841935125653L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final int skip;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, int i5) {
            super(i5);
            this.downstream = p0Var;
            this.skip = i5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.skip == size()) {
                this.downstream.onNext(poll());
            }
            offer(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public l3(io.reactivex.rxjava3.core.n0<T> n0Var, int i5) {
        super(n0Var);
        this.f17827b = i5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17827b));
    }
}
