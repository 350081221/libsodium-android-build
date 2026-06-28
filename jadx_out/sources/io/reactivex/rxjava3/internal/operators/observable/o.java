package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class o<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<B> f17901b;

    /* renamed from: c, reason: collision with root package name */
    final m3.s<U> f17902c;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.observers.e<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, U, B> f17903b;

        a(b<T, U, B> bVar) {
            this.f17903b = bVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17903b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17903b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(B b5) {
            this.f17903b.s();
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.observers.w<T, U, U> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        final m3.s<U> K;
        final io.reactivex.rxjava3.core.n0<B> L;
        io.reactivex.rxjava3.disposables.e M;
        io.reactivex.rxjava3.disposables.e X;
        U Y;

        b(io.reactivex.rxjava3.core.p0<? super U> p0Var, m3.s<U> sVar, io.reactivex.rxjava3.core.n0<B> n0Var) {
            super(p0Var, new io.reactivex.rxjava3.internal.queue.a());
            this.K = sVar;
            this.L = n0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.H) {
                this.H = true;
                this.X.dispose();
                this.M.dispose();
                if (b()) {
                    this.G.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.H;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            synchronized (this) {
                U u4 = this.Y;
                if (u4 == null) {
                    return;
                }
                this.Y = null;
                this.G.offer(u4);
                this.I = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.v.d(this.G, this.F, false, this, this);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            dispose();
            this.F.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            synchronized (this) {
                U u4 = this.Y;
                if (u4 == null) {
                    return;
                }
                u4.add(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.M, eVar)) {
                this.M = eVar;
                try {
                    U u4 = this.K.get();
                    Objects.requireNonNull(u4, "The buffer supplied is null");
                    this.Y = u4;
                    a aVar = new a(this);
                    this.X = aVar;
                    this.F.onSubscribe(this);
                    if (!this.H) {
                        this.L.subscribe(aVar);
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.H = true;
                    eVar.dispose();
                    io.reactivex.rxjava3.internal.disposables.d.error(th, this.F);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.w, io.reactivex.rxjava3.internal.util.r
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void g(io.reactivex.rxjava3.core.p0<? super U> p0Var, U u4) {
            this.F.onNext(u4);
        }

        void s() {
            try {
                U u4 = this.K.get();
                Objects.requireNonNull(u4, "The buffer supplied is null");
                U u5 = u4;
                synchronized (this) {
                    U u6 = this.Y;
                    if (u6 == null) {
                        return;
                    }
                    this.Y = u5;
                    o(u6, false, this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                dispose();
                this.F.onError(th);
            }
        }
    }

    public o(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<B> n0Var2, m3.s<U> sVar) {
        super(n0Var);
        this.f17901b = n0Var2;
        this.f17902c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        this.f17528a.subscribe(new b(new io.reactivex.rxjava3.observers.m(p0Var), this.f17902c, this.f17901b));
    }
}
