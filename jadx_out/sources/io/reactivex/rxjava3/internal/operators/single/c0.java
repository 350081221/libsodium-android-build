package io.reactivex.rxjava3.internal.operators.single;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c0<T, R> extends io.reactivex.rxjava3.core.i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18336a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends Iterable<? extends R>> f18337b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.observers.b<R> implements io.reactivex.rxjava3.core.u0<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final io.reactivex.rxjava3.core.p0<? super R> downstream;
        volatile Iterator<? extends R> it;
        final m3.o<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        io.reactivex.rxjava3.disposables.e upstream;

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.downstream = p0Var;
            this.mapper = oVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.it = null;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.it == null;
        }

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.downstream.onError(th);
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
            io.reactivex.rxjava3.core.p0<? super R> p0Var = this.downstream;
            try {
                Iterator<? extends R> it = this.mapper.apply(t5).iterator();
                if (!it.hasNext()) {
                    p0Var.onComplete();
                    return;
                }
                if (this.outputFused) {
                    this.it = it;
                    p0Var.onNext(null);
                    p0Var.onComplete();
                    return;
                }
                while (!this.cancelled) {
                    try {
                        p0Var.onNext(it.next());
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                p0Var.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            p0Var.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        p0Var.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                this.downstream.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public R poll() {
            Iterator<? extends R> it = this.it;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.it = null;
            }
            return next;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public c0(io.reactivex.rxjava3.core.x0<T> x0Var, m3.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f18336a = x0Var;
        this.f18337b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        this.f18336a.a(new a(p0Var, this.f18337b));
    }
}
