package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class y2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super Throwable> f18191b;

    /* renamed from: c, reason: collision with root package name */
    final long f18192c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final m3.r<? super Throwable> predicate;
        long remaining;
        final io.reactivex.rxjava3.core.n0<? extends T> source;
        final io.reactivex.rxjava3.internal.disposables.f upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, m3.r<? super Throwable> rVar, io.reactivex.rxjava3.internal.disposables.f fVar, io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
            this.downstream = p0Var;
            this.upstream = fVar;
            this.source = n0Var;
            this.predicate = rVar;
            this.remaining = j5;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            long j5 = this.remaining;
            if (j5 != Long.MAX_VALUE) {
                this.remaining = j5 - 1;
            }
            if (j5 == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
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
                while (!this.upstream.isDisposed()) {
                    this.source.subscribe(this);
                    i5 = addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public y2(io.reactivex.rxjava3.core.i0<T> i0Var, long j5, m3.r<? super Throwable> rVar) {
        super(i0Var);
        this.f18191b = rVar;
        this.f18192c = j5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
        p0Var.onSubscribe(fVar);
        new a(p0Var, this.f18192c, this.f18191b, fVar, this.f17528a).subscribeNext();
    }
}
