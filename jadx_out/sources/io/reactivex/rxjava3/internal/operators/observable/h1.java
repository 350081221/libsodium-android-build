package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h1<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends T> f17734a;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.observers.c<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17735a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<? extends T> f17736b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f17737c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17738d;

        /* renamed from: e, reason: collision with root package name */
        boolean f17739e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17740f;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, Iterator<? extends T> it) {
            this.f17735a = p0Var;
            this.f17736b = it;
        }

        void a() {
            while (!isDisposed()) {
                try {
                    T next = this.f17736b.next();
                    Objects.requireNonNull(next, "The iterator returned a null value");
                    this.f17735a.onNext(next);
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f17736b.hasNext()) {
                            if (!isDisposed()) {
                                this.f17735a.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.f17735a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    this.f17735a.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.f17739e = true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17737c = true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17737c;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.f17739e;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            if (this.f17739e) {
                return null;
            }
            if (this.f17740f) {
                if (!this.f17736b.hasNext()) {
                    this.f17739e = true;
                    return null;
                }
            } else {
                this.f17740f = true;
            }
            T next = this.f17736b.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 1) == 0) {
                return 0;
            }
            this.f17738d = true;
            return 1;
        }
    }

    public h1(Iterable<? extends T> iterable) {
        this.f17734a = iterable;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        try {
            Iterator<? extends T> it = this.f17734a.iterator();
            try {
                if (!it.hasNext()) {
                    io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                    return;
                }
                a aVar = new a(p0Var, it);
                p0Var.onSubscribe(aVar);
                if (!aVar.f17738d) {
                    aVar.a();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.internal.disposables.d.error(th2, p0Var);
        }
    }
}
