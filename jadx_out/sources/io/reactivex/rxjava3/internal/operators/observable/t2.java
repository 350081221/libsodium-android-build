package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class t2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f18108b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        long remaining;
        final io.reactivex.rxjava3.internal.disposables.f sd;
        final io.reactivex.rxjava3.core.n0<? extends T> source;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, io.reactivex.rxjava3.internal.disposables.f fVar, io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
            this.downstream = p0Var;
            this.sd = fVar;
            this.source = n0Var;
            this.remaining = j5;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            long j5 = this.remaining;
            if (j5 != Long.MAX_VALUE) {
                this.remaining = j5 - 1;
            }
            if (j5 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.sd.replace(eVar);
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i5 = 1;
                while (!this.sd.isDisposed()) {
                    this.source.subscribe(this);
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public t2(io.reactivex.rxjava3.core.i0<T> i0Var, long j5) {
        super(i0Var);
        this.f18108b = j5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
        p0Var.onSubscribe(fVar);
        long j5 = this.f18108b;
        long j6 = Long.MAX_VALUE;
        if (j5 != Long.MAX_VALUE) {
            j6 = j5 - 1;
        }
        new a(p0Var, j6, fVar, this.f17528a).subscribeNext();
    }
}
