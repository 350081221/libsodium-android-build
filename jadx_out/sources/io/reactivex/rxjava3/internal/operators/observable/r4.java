package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class r4<T, U, V> extends io.reactivex.rxjava3.core.i0<V> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i0<? extends T> f18036a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<U> f18037b;

    /* renamed from: c, reason: collision with root package name */
    final m3.c<? super T, ? super U, ? extends V> f18038c;

    /* loaded from: classes3.dex */
    static final class a<T, U, V> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super V> f18039a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<U> f18040b;

        /* renamed from: c, reason: collision with root package name */
        final m3.c<? super T, ? super U, ? extends V> f18041c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f18042d;

        /* renamed from: e, reason: collision with root package name */
        boolean f18043e;

        a(io.reactivex.rxjava3.core.p0<? super V> p0Var, Iterator<U> it, m3.c<? super T, ? super U, ? extends V> cVar) {
            this.f18039a = p0Var;
            this.f18040b = it;
            this.f18041c = cVar;
        }

        void a(Throwable th) {
            this.f18043e = true;
            this.f18042d.dispose();
            this.f18039a.onError(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18042d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18042d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f18043e) {
                return;
            }
            this.f18043e = true;
            this.f18039a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f18043e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18043e = true;
                this.f18039a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f18043e) {
                return;
            }
            try {
                U next = this.f18040b.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V apply = this.f18041c.apply(t5, next);
                    Objects.requireNonNull(apply, "The zipper function returned a null value");
                    this.f18039a.onNext(apply);
                    try {
                        if (!this.f18040b.hasNext()) {
                            this.f18043e = true;
                            this.f18042d.dispose();
                            this.f18039a.onComplete();
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        a(th);
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    a(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                a(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18042d, eVar)) {
                this.f18042d = eVar;
                this.f18039a.onSubscribe(this);
            }
        }
    }

    public r4(io.reactivex.rxjava3.core.i0<? extends T> i0Var, Iterable<U> iterable, m3.c<? super T, ? super U, ? extends V> cVar) {
        this.f18036a = i0Var;
        this.f18037b = iterable;
        this.f18038c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super V> p0Var) {
        try {
            Iterator<U> it = this.f18037b.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            Iterator<U> it2 = it;
            try {
                if (!it2.hasNext()) {
                    io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                } else {
                    this.f18036a.subscribe(new a(p0Var, it2, this.f18038c));
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
