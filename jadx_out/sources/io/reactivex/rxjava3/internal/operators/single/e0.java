package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e0<T, R> extends io.reactivex.rxjava3.core.r0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x0<T> f18350a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> f18351b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.x0<? extends R>> f18352c;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.u0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 4375739915521278546L;
        final io.reactivex.rxjava3.core.u0<? super R> downstream;
        final m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.x0<? extends R>> onErrorMapper;
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> onSuccessMapper;
        io.reactivex.rxjava3.disposables.e upstream;

        /* renamed from: io.reactivex.rxjava3.internal.operators.single.e0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0522a implements io.reactivex.rxjava3.core.u0<R> {
            C0522a() {
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                a.this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(a.this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                a.this.downstream.onSuccess(r5);
            }
        }

        a(io.reactivex.rxjava3.core.u0<? super R> u0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar2) {
            this.downstream = u0Var;
            this.onSuccessMapper = oVar;
            this.onErrorMapper = oVar2;
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

        @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                io.reactivex.rxjava3.core.x0<? extends R> apply = this.onErrorMapper.apply(th);
                Objects.requireNonNull(apply, "The onErrorMapper returned a null SingleSource");
                io.reactivex.rxjava3.core.x0<? extends R> x0Var = apply;
                if (!isDisposed()) {
                    x0Var.a(new C0522a());
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
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
            try {
                io.reactivex.rxjava3.core.x0<? extends R> apply = this.onSuccessMapper.apply(t5);
                Objects.requireNonNull(apply, "The onSuccessMapper returned a null SingleSource");
                io.reactivex.rxjava3.core.x0<? extends R> x0Var = apply;
                if (!isDisposed()) {
                    x0Var.a(new C0522a());
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public e0(io.reactivex.rxjava3.core.x0<T> x0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar, m3.o<? super Throwable, ? extends io.reactivex.rxjava3.core.x0<? extends R>> oVar2) {
        this.f18350a = x0Var;
        this.f18351b = oVar;
        this.f18352c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(io.reactivex.rxjava3.core.u0<? super R> u0Var) {
        this.f18350a.a(new a(u0Var, this.f18351b, this.f18352c));
    }
}
