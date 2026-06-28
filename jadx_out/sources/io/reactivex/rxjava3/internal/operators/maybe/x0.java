package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class x0<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends R> f17430b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.a0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super R> f17431a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends R> f17432b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17433c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(io.reactivex.rxjava3.core.a0<? super R> a0Var, m3.o<? super T, ? extends R> oVar) {
            this.f17431a = a0Var;
            this.f17432b = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.disposables.e eVar = this.f17433c;
            this.f17433c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            eVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17433c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f17431a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f17431a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17433c, eVar)) {
                this.f17433c = eVar;
                this.f17431a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(T t5) {
            try {
                R apply = this.f17432b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null item");
                this.f17431a.onSuccess(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17431a.onError(th);
            }
        }
    }

    public x0(io.reactivex.rxjava3.core.d0<T> d0Var, m3.o<? super T, ? extends R> oVar) {
        super(d0Var);
        this.f17430b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super R> a0Var) {
        this.f17232a.a(new a(a0Var, this.f17430b));
    }
}
