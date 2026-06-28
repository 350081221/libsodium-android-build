package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o4<T, U, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.c<? super T, ? super U, ? extends R> f17926b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<? extends U> f17927c;

    /* loaded from: classes3.dex */
    static final class a<T, U, R> extends AtomicReference<U> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -312246233408980075L;
        final m3.c<? super T, ? super U, ? extends R> combiner;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> upstream = new AtomicReference<>();
        final AtomicReference<io.reactivex.rxjava3.disposables.e> other = new AtomicReference<>();

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.c<? super T, ? super U, ? extends R> cVar) {
            this.downstream = p0Var;
            this.combiner = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            U u4 = get();
            if (u4 != null) {
                try {
                    R apply = this.combiner.apply(t5, u4);
                    Objects.requireNonNull(apply, "The combiner returned a null value");
                    this.downstream.onNext(apply);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    dispose();
                    this.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.setOnce(this.upstream, eVar);
        }

        public void otherError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.upstream);
            this.downstream.onError(th);
        }

        public boolean setOther(io.reactivex.rxjava3.disposables.e eVar) {
            return io.reactivex.rxjava3.internal.disposables.c.setOnce(this.other, eVar);
        }
    }

    /* loaded from: classes3.dex */
    final class b implements io.reactivex.rxjava3.core.p0<U> {

        /* renamed from: a, reason: collision with root package name */
        private final a<T, U, R> f17928a;

        b(a<T, U, R> aVar) {
            this.f17928a = aVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17928a.otherError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(U u4) {
            this.f17928a.lazySet(u4);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f17928a.setOther(eVar);
        }
    }

    public o4(io.reactivex.rxjava3.core.n0<T> n0Var, m3.c<? super T, ? super U, ? extends R> cVar, io.reactivex.rxjava3.core.n0<? extends U> n0Var2) {
        super(n0Var);
        this.f17926b = cVar;
        this.f17927c = n0Var2;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(p0Var);
        a aVar = new a(mVar, this.f17926b);
        mVar.onSubscribe(aVar);
        this.f17927c.subscribe(new b(aVar));
        this.f17528a.subscribe(aVar);
    }
}
