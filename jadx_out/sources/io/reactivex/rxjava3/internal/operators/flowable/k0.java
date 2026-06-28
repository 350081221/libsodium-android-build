package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class k0<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.f0<R>> f16838c;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super R> f16839a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.f0<R>> f16840b;

        /* renamed from: c, reason: collision with root package name */
        boolean f16841c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f16842d;

        a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.f0<R>> oVar) {
            this.f16839a = pVar;
            this.f16840b = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16842d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16841c) {
                return;
            }
            this.f16841c = true;
            this.f16839a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16841c) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16841c = true;
                this.f16839a.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16841c) {
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
                io.reactivex.rxjava3.core.f0<R> apply = this.f16840b.apply(t5);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                io.reactivex.rxjava3.core.f0<R> f0Var2 = apply;
                if (f0Var2.g()) {
                    this.f16842d.cancel();
                    onError(f0Var2.d());
                } else if (f0Var2.f()) {
                    this.f16842d.cancel();
                    onComplete();
                } else {
                    this.f16839a.onNext(f0Var2.e());
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16842d.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16842d, qVar)) {
                this.f16842d = qVar;
                this.f16839a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16842d.request(j5);
        }
    }

    public k0(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.f0<R>> oVar2) {
        super(oVar);
        this.f16838c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        this.f16598b.N6(new a(pVar, this.f16838c));
    }
}
