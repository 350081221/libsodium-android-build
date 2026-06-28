package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t0<R> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<R> f16584a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super R, ? extends io.reactivex.rxjava3.core.i> f16585b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super R> f16586c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f16587d;

    /* loaded from: classes3.dex */
    static final class a<R> extends AtomicReference<Object> implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -674404550052917487L;
        final m3.g<? super R> disposer;
        final io.reactivex.rxjava3.core.f downstream;
        final boolean eager;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.f fVar, R r5, m3.g<? super R> gVar, boolean z4) {
            super(r5);
            this.downstream = fVar;
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

        @Override // io.reactivex.rxjava3.core.f
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

        @Override // io.reactivex.rxjava3.core.f
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

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public t0(m3.s<R> sVar, m3.o<? super R, ? extends io.reactivex.rxjava3.core.i> oVar, m3.g<? super R> gVar, boolean z4) {
        this.f16584a = sVar;
        this.f16585b = oVar;
        this.f16586c = gVar;
        this.f16587d = z4;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        try {
            R r5 = this.f16584a.get();
            try {
                io.reactivex.rxjava3.core.i apply = this.f16585b.apply(r5);
                Objects.requireNonNull(apply, "The completableFunction returned a null CompletableSource");
                apply.a(new a(fVar, r5, this.f16586c, this.f16587d));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (this.f16587d) {
                    try {
                        this.f16586c.accept(r5);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        io.reactivex.rxjava3.internal.disposables.d.error(new io.reactivex.rxjava3.exceptions.a(th, th2), fVar);
                        return;
                    }
                }
                io.reactivex.rxjava3.internal.disposables.d.error(th, fVar);
                if (!this.f16587d) {
                    try {
                        this.f16586c.accept(r5);
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.b.b(th3);
                        io.reactivex.rxjava3.plugins.a.Y(th3);
                    }
                }
            }
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.b.b(th4);
            io.reactivex.rxjava3.internal.disposables.d.error(th4, fVar);
        }
    }
}
