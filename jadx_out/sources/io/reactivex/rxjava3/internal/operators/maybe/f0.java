package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class f0<T, R> extends io.reactivex.rxjava3.core.i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.d0<T> f17277a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends Iterable<? extends R>> f17278b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.observers.c<R> implements io.reactivex.rxjava3.core.a0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super R> f17279a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends Iterable<? extends R>> f17280b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17281c;

        /* renamed from: d, reason: collision with root package name */
        volatile Iterator<? extends R> f17282d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f17283e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17284f;

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f17279a = p0Var;
            this.f17280b = oVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.f17282d = null;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17283e = true;
            this.f17281c.dispose();
            this.f17281c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17283e;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.f17282d == null;
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17279a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17281c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f17279a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17281c, eVar)) {
                this.f17281c = eVar;
                this.f17279a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            io.reactivex.rxjava3.core.p0<? super R> p0Var = this.f17279a;
            try {
                Iterator<? extends R> it = this.f17280b.apply(t5).iterator();
                if (!it.hasNext()) {
                    p0Var.onComplete();
                    return;
                }
                this.f17282d = it;
                if (this.f17284f) {
                    p0Var.onNext(null);
                    p0Var.onComplete();
                    return;
                }
                while (!this.f17283e) {
                    try {
                        p0Var.onNext(it.next());
                        if (this.f17283e) {
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
                p0Var.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public R poll() {
            Iterator<? extends R> it = this.f17282d;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f17282d = null;
            }
            return next;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            this.f17284f = true;
            return 2;
        }
    }

    public f0(io.reactivex.rxjava3.core.d0<T> d0Var, m3.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f17277a = d0Var;
        this.f17278b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        this.f17277a.a(new a(p0Var, this.f17278b));
    }
}
