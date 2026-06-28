package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d1<T, U> extends io.reactivex.rxjava3.core.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<U> f18345a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super U, ? extends io.reactivex.rxjava3.core.x0<? extends T>> f18346b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super U> f18347c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f18348d;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends AtomicReference<Object> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5331524057054083935L;
        final m3.g<? super U> disposer;
        final io.reactivex.rxjava3.core.u0<? super T> downstream;
        final boolean eager;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.u0<? super T> u0Var, U u4, boolean z4, m3.g<? super U> gVar) {
            super(u4);
            this.downstream = u0Var;
            this.eager = z4;
            this.disposer = gVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.eager) {
                disposeResource();
                this.upstream.dispose();
                this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            } else {
                this.upstream.dispose();
                this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
                disposeResource();
            }
        }

        void disposeResource() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.disposer.accept(andSet);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        th = new io.reactivex.rxjava3.exceptions.a(th, th2);
                    }
                } else {
                    return;
                }
            }
            this.downstream.onError(th);
            if (!this.eager) {
                disposeResource();
            }
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.disposer.accept(andSet);
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                } else {
                    return;
                }
            }
            this.downstream.onSuccess(t5);
            if (!this.eager) {
                disposeResource();
            }
        }
    }

    public d1(m3.s<U> sVar, m3.o<? super U, ? extends io.reactivex.rxjava3.core.x0<? extends T>> oVar, m3.g<? super U> gVar, boolean z4) {
        this.f18345a = sVar;
        this.f18346b = oVar;
        this.f18347c = gVar;
        this.f18348d = z4;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super T> u0Var) {
        try {
            U u4 = this.f18345a.get();
            try {
                io.reactivex.rxjava3.core.x0<? extends T> apply = this.f18346b.apply(u4);
                Objects.requireNonNull(apply, "The singleFunction returned a null SingleSource");
                apply.a(new a(u0Var, u4, this.f18348d, this.f18347c));
            } catch (Throwable th) {
                th = th;
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (this.f18348d) {
                    try {
                        this.f18347c.accept(u4);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        th = new io.reactivex.rxjava3.exceptions.a(th, th2);
                    }
                }
                io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
                if (!this.f18348d) {
                    try {
                        this.f18347c.accept(u4);
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.b.b(th3);
                        io.reactivex.rxjava3.plugins.a.Y(th3);
                    }
                }
            }
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.b.b(th4);
            io.reactivex.rxjava3.internal.disposables.d.error(th4, u0Var);
        }
    }
}
