package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.core.u0;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* loaded from: classes3.dex */
public final class r<T, A, R> extends r0<R> implements io.reactivex.rxjava3.internal.fuseable.f<R> {

    /* renamed from: a, reason: collision with root package name */
    final i0<T> f16379a;

    /* renamed from: b, reason: collision with root package name */
    final Collector<T, A, R> f16380b;

    /* loaded from: classes3.dex */
    static final class a<T, A, R> implements p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final u0<? super R> f16381a;

        /* renamed from: b, reason: collision with root package name */
        final BiConsumer<A, T> f16382b;

        /* renamed from: c, reason: collision with root package name */
        final Function<A, R> f16383c;

        /* renamed from: d, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16384d;

        /* renamed from: e, reason: collision with root package name */
        boolean f16385e;

        /* renamed from: f, reason: collision with root package name */
        A f16386f;

        a(u0<? super R> u0Var, A a5, BiConsumer<A, T> biConsumer, Function<A, R> function) {
            this.f16381a = u0Var;
            this.f16386f = a5;
            this.f16382b = biConsumer;
            this.f16383c = function;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16384d.dispose();
            this.f16384d = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16384d == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.f16385e) {
                return;
            }
            this.f16385e = true;
            this.f16384d = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            A a5 = this.f16386f;
            this.f16386f = null;
            try {
                R apply = this.f16383c.apply(a5);
                Objects.requireNonNull(apply, "The finisher returned a null value");
                this.f16381a.onSuccess(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16381a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f16385e) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f16385e = true;
            this.f16384d = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f16386f = null;
            this.f16381a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f16385e) {
                return;
            }
            try {
                this.f16382b.accept(this.f16386f, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16384d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16384d, eVar)) {
                this.f16384d = eVar;
                this.f16381a.onSubscribe(this);
            }
        }
    }

    public r(i0<T> i0Var, Collector<T, A, R> collector) {
        this.f16379a = i0Var;
        this.f16380b = collector;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(@l3.f u0<? super R> u0Var) {
        try {
            this.f16379a.subscribe(new a(u0Var, this.f16380b.supplier().get(), this.f16380b.accumulator(), this.f16380b.finisher()));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, u0Var);
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public i0<R> b() {
        return new q(this.f16379a, this.f16380b);
    }
}
