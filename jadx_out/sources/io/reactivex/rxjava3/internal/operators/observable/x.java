package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class x<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f18168b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -1953724749712440952L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        boolean inCompletable;
        io.reactivex.rxjava3.core.i other;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, io.reactivex.rxjava3.core.i iVar) {
            this.downstream = p0Var;
            this.other = iVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            io.reactivex.rxjava3.internal.disposables.c.replace(this, null);
            io.reactivex.rxjava3.core.i iVar = this.other;
            this.other = null;
            iVar.a(this);
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
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar) && !this.inCompletable) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public x(io.reactivex.rxjava3.core.i0<T> i0Var, io.reactivex.rxjava3.core.i iVar) {
        super(i0Var);
        this.f18168b = iVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f18168b));
    }
}
