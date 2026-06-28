package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class t3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final int f18109b;

    /* loaded from: classes3.dex */
    static final class a<T> extends ArrayDeque<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, int i5) {
            this.downstream = p0Var;
            this.count = i5;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.core.p0<? super T> p0Var = this.downstream;
            while (!this.cancelled) {
                T poll = poll();
                if (poll == null) {
                    p0Var.onComplete();
                    return;
                }
                p0Var.onNext(poll);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.count == size()) {
                poll();
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

    public t3(io.reactivex.rxjava3.core.n0<T> n0Var, int i5) {
        super(n0Var);
        this.f18109b = i5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18109b));
    }
}
