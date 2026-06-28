package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class u2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.e f18120b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final io.reactivex.rxjava3.core.n0<? extends T> source;
        final m3.e stop;
        final io.reactivex.rxjava3.internal.disposables.f upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.e eVar, io.reactivex.rxjava3.internal.disposables.f fVar, io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
            this.downstream = p0Var;
            this.upstream = fVar;
            this.source = n0Var;
            this.stop = eVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            try {
                if (this.stop.getAsBoolean()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
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
            this.upstream.replace(eVar);
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i5 = 1;
                do {
                    this.source.subscribe(this);
                    i5 = addAndGet(-i5);
                } while (i5 != 0);
            }
        }
    }

    public u2(io.reactivex.rxjava3.core.i0<T> i0Var, m3.e eVar) {
        super(i0Var);
        this.f18120b = eVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
        p0Var.onSubscribe(fVar);
        new a(p0Var, this.f18120b, fVar, this.f17528a).subscribeNext();
    }
}
