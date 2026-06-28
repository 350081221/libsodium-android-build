package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class i0<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.f0<R>> f17751b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super R> f17752a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.f0<R>> f17753b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17754c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17755d;

        a(io.reactivex.rxjava3.core.p0<? super R> p0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.f0<R>> oVar) {
            this.f17752a = p0Var;
            this.f17753b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17755d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17755d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f17754c) {
                return;
            }
            this.f17754c = true;
            this.f17752a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17754c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f17754c = true;
                this.f17752a.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f17754c) {
                if (t5 instanceof io.reactivex.rxjava3.core.f0) {
                    io.reactivex.rxjava3.core.f0 f0Var = (io.reactivex.rxjava3.core.f0) t5;
                    if (f0Var.g()) {
                        io.reactivex.rxjava3.plugins.a.Y(f0Var.d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.rxjava3.core.f0<R> apply = this.f17753b.apply(t5);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                io.reactivex.rxjava3.core.f0<R> f0Var2 = apply;
                if (f0Var2.g()) {
                    this.f17755d.dispose();
                    onError(f0Var2.d());
                } else if (f0Var2.f()) {
                    this.f17755d.dispose();
                    onComplete();
                } else {
                    this.f17752a.onNext(f0Var2.e());
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17755d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17755d, eVar)) {
                this.f17755d = eVar;
                this.f17752a.onSubscribe(this);
            }
        }
    }

    public i0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.f0<R>> oVar) {
        super(n0Var);
        this.f17751b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
        this.f17528a.subscribe(new a(p0Var, this.f17751b));
    }
}
