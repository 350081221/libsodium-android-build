package io.reactivex.rxjava3.internal.jdk8;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* loaded from: classes3.dex */
public final class c<T, A, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16302b;

    /* renamed from: c, reason: collision with root package name */
    final Collector<T, A, R> f16303c;

    /* loaded from: classes3.dex */
    static final class a<T, A, R> extends io.reactivex.rxjava3.internal.subscriptions.f<R> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -229544830565448758L;
        final BiConsumer<A, T> accumulator;
        A container;
        boolean done;
        final Function<A, R> finisher;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super R> pVar, A a5, BiConsumer<A, T> biConsumer, Function<A, R> function) {
            super(pVar);
            this.container = a5;
            this.accumulator = biConsumer;
            this.finisher = function;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.upstream = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
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

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            this.upstream = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            this.container = null;
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            try {
                this.accumulator.accept(this.container, t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(@l3.f org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public c(io.reactivex.rxjava3.core.o<T> oVar, Collector<T, A, R> collector) {
        this.f16302b = oVar;
        this.f16303c = collector;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(@l3.f org.reactivestreams.p<? super R> pVar) {
        try {
            this.f16302b.N6(new a(pVar, this.f16303c.supplier().get(), this.f16303c.accumulator(), this.f16303c.finisher()));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
