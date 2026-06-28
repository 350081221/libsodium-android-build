package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* loaded from: classes3.dex */
public final class q<T, A, R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final i0<T> f16377a;

    /* renamed from: b, reason: collision with root package name */
    final Collector<T, A, R> f16378b;

    /* loaded from: classes3.dex */
    static final class a<T, A, R> extends io.reactivex.rxjava3.internal.observers.m<R> implements p0<T> {
        private static final long serialVersionUID = -229544830565448758L;
        final BiConsumer<A, T> accumulator;
        A container;
        boolean done;
        final Function<A, R> finisher;
        io.reactivex.rxjava3.disposables.e upstream;

        a(p0<? super R> p0Var, A a5, BiConsumer<A, T> biConsumer, Function<A, R> function) {
            super(p0Var);
            this.container = a5;
            this.accumulator = biConsumer;
            this.finisher = function;
        }

        @Override // io.reactivex.rxjava3.internal.observers.m, io.reactivex.rxjava3.disposables.e
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            A a5 = this.container;
            this.container = null;
            try {
                R apply = this.finisher.apply(a5);
                Objects.requireNonNull(apply, "The finisher returned a null value");
                complete(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            this.upstream = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.container = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            try {
                this.accumulator.accept(this.container, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public q(i0<T> i0Var, Collector<T, A, R> collector) {
        this.f16377a = i0Var;
        this.f16378b = collector;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(@l3.f p0<? super R> p0Var) {
        try {
            this.f16377a.subscribe(new a(p0Var, this.f16378b.supplier().get(), this.f16378b.accumulator(), this.f16378b.finisher()));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
