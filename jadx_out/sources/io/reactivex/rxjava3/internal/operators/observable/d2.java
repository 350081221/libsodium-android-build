package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f17608b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -4592979584110982903L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        volatile boolean mainDone;
        volatile boolean otherDone;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> mainDisposable = new AtomicReference<>();
        final C0502a otherObserver = new C0502a(this);
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.d2$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0502a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f {
            private static final long serialVersionUID = -2935427570954647017L;
            final a<?> parent;

            C0502a(a<?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.downstream = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.mainDisposable);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
            this.errors.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.mainDisposable.get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                io.reactivex.rxjava3.internal.util.l.a(this.downstream, this, this.errors);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.otherObserver);
            io.reactivex.rxjava3.internal.util.l.c(this.downstream, th, this, this.errors);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            io.reactivex.rxjava3.internal.util.l.e(this.downstream, t5, this, this.errors);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.mainDisposable, eVar);
        }

        void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                io.reactivex.rxjava3.internal.util.l.a(this.downstream, this, this.errors);
            }
        }

        void otherError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.mainDisposable);
            io.reactivex.rxjava3.internal.util.l.c(this.downstream, th, this, this.errors);
        }
    }

    public d2(io.reactivex.rxjava3.core.i0<T> i0Var, io.reactivex.rxjava3.core.i iVar) {
        super(i0Var);
        this.f17608b = iVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar = new a(p0Var);
        p0Var.onSubscribe(aVar);
        this.f17528a.subscribe(aVar);
        this.f17608b.a(aVar.otherObserver);
    }
}
