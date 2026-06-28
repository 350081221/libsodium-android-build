package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class v1<T, D> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends D> f17418a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super D, ? extends io.reactivex.rxjava3.core.d0<? extends T>> f17419b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super D> f17420c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f17421d;

    /* loaded from: classes3.dex */
    static final class a<T, D> extends AtomicReference<Object> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -674404550052917487L;
        final m3.g<? super D> disposer;
        final io.reactivex.rxjava3.core.a0<? super T> downstream;
        final boolean eager;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, D d5, m3.g<? super D> gVar, boolean z4) {
            super(d5);
            this.downstream = a0Var;
            this.disposer = gVar;
            this.eager = z4;
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

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
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
            this.downstream.onComplete();
            if (!this.eager) {
                disposeResource();
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
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

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
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

    public v1(m3.s<? extends D> sVar, m3.o<? super D, ? extends io.reactivex.rxjava3.core.d0<? extends T>> oVar, m3.g<? super D> gVar, boolean z4) {
        this.f17418a = sVar;
        this.f17419b = oVar;
        this.f17420c = gVar;
        this.f17421d = z4;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        try {
            D d5 = this.f17418a.get();
            try {
                io.reactivex.rxjava3.core.d0<? extends T> apply = this.f17419b.apply(d5);
                Objects.requireNonNull(apply, "The sourceSupplier returned a null MaybeSource");
                apply.a(new a(a0Var, d5, this.f17420c, this.f17421d));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (this.f17421d) {
                    try {
                        this.f17420c.accept(d5);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        io.reactivex.rxjava3.internal.disposables.d.error(new io.reactivex.rxjava3.exceptions.a(th, th2), a0Var);
                        return;
                    }
                }
                io.reactivex.rxjava3.internal.disposables.d.error(th, a0Var);
                if (!this.f17421d) {
                    try {
                        this.f17420c.accept(d5);
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.b.b(th3);
                        io.reactivex.rxjava3.plugins.a.Y(th3);
                    }
                }
            }
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.b.b(th4);
            io.reactivex.rxjava3.internal.disposables.d.error(th4, a0Var);
        }
    }
}
