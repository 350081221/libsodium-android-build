package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.core.u0;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* loaded from: classes3.dex */
public final class d<T, A, R> extends r0<R> implements io.reactivex.rxjava3.internal.fuseable.d<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16314a;

    /* renamed from: b, reason: collision with root package name */
    final Collector<T, A, R> f16315b;

    /* loaded from: classes3.dex */
    static final class a<T, A, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final u0<? super R> f16316a;

        /* renamed from: b, reason: collision with root package name */
        final BiConsumer<A, T> f16317b;

        /* renamed from: c, reason: collision with root package name */
        final Function<A, R> f16318c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f16319d;

        /* renamed from: e, reason: collision with root package name */
        boolean f16320e;

        /* renamed from: f, reason: collision with root package name */
        A f16321f;

        a(u0<? super R> u0Var, A a5, BiConsumer<A, T> biConsumer, Function<A, R> function) {
            this.f16316a = u0Var;
            this.f16321f = a5;
            this.f16317b = biConsumer;
            this.f16318c = function;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16319d.cancel();
            this.f16319d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16319d == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16320e) {
                return;
            }
            this.f16320e = true;
            this.f16319d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            A a5 = this.f16321f;
            this.f16321f = null;
            try {
                R apply = this.f16318c.apply(a5);
                Objects.requireNonNull(apply, "The finisher returned a null value");
                this.f16316a.onSuccess(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16316a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16320e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f16320e = true;
            this.f16319d = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.f16321f = null;
            this.f16316a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16320e) {
                return;
            }
            try {
                this.f16317b.accept(this.f16321f, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16319d.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(@l3.f org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16319d, qVar)) {
                this.f16319d = qVar;
                this.f16316a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public d(io.reactivex.rxjava3.core.o<T> oVar, Collector<T, A, R> collector) {
        this.f16314a = oVar;
        this.f16315b = collector;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(@l3.f u0<? super R> u0Var) {
        try {
            this.f16314a.N6(new a(u0Var, this.f16315b.supplier().get(), this.f16315b.accumulator(), this.f16315b.finisher()));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<R> d() {
        return new c(this.f16314a, this.f16315b);
    }
}
