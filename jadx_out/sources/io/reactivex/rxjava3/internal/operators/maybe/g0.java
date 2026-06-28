package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g0<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> f17295b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.d0<? extends R>> f17296c;

    /* renamed from: d, reason: collision with root package name */
    final m3.s<? extends io.reactivex.rxjava3.core.d0<? extends R>> f17297d;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 4375739915521278546L;
        final io.reactivex.rxjava3.core.a0<? super R> downstream;
        final m3.s<? extends io.reactivex.rxjava3.core.d0<? extends R>> onCompleteSupplier;
        final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.d0<? extends R>> onErrorMapper;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> onSuccessMapper;
        io.reactivex.rxjava3.disposables.e upstream;

        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.g0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0480a implements io.reactivex.rxjava3.core.a0<R> {
            C0480a() {
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
            public void onComplete() {
                a.this.downstream.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                a.this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(a.this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                a.this.downstream.onSuccess(r5);
            }
        }

        a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar2, m3.s<? extends io.reactivex.rxjava3.core.d0<? extends R>> sVar) {
            this.downstream = a0Var;
            this.onSuccessMapper = oVar;
            this.onErrorMapper = oVar2;
            this.onCompleteSupplier = sVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            try {
                io.reactivex.rxjava3.core.d0<? extends R> d0Var = this.onCompleteSupplier.get();
                Objects.requireNonNull(d0Var, "The onCompleteSupplier returned a null MaybeSource");
                io.reactivex.rxjava3.core.d0<? extends R> d0Var2 = d0Var;
                if (!isDisposed()) {
                    d0Var2.a(new C0480a());
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                io.reactivex.rxjava3.core.d0<? extends R> apply = this.onErrorMapper.apply(th);
                Objects.requireNonNull(apply, "The onErrorMapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.d0<? extends R> d0Var = apply;
                if (!isDisposed()) {
                    d0Var.a(new C0480a());
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
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
            try {
                io.reactivex.rxjava3.core.d0<? extends R> apply = this.onSuccessMapper.apply(t5);
                Objects.requireNonNull(apply, "The onSuccessMapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.d0<? extends R> d0Var = apply;
                if (!isDisposed()) {
                    d0Var.a(new C0480a());
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public g0(io.reactivex.rxjava3.core.d0<T> d0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.d0<? extends R>> oVar2, m3.s<? extends io.reactivex.rxjava3.core.d0<? extends R>> sVar) {
        super(d0Var);
        this.f17295b = oVar;
        this.f17296c = oVar2;
        this.f17297d = sVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17295b, this.f17296c, this.f17297d));
    }
}
