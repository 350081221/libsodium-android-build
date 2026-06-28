package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class t<T, R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final i0<T> f16389a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends Stream<? extends R>> f16390b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -5127032662980523968L;
        volatile boolean disposed;
        boolean done;
        final p0<? super R> downstream;
        final m3.o<? super T, ? extends Stream<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.e upstream;

        a(p0<? super R> p0Var, m3.o<? super T, ? extends Stream<? extends R>> oVar) {
            this.downstream = p0Var;
            this.mapper = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(@l3.f Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(@l3.f T t5) {
            if (this.done) {
                return;
            }
            try {
                Stream<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Stream");
                Stream<? extends R> stream = apply;
                try {
                    Iterator<? extends R> it = stream.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (this.disposed) {
                            this.done = true;
                            break;
                        }
                        R next = it.next();
                        Objects.requireNonNull(next, "The Stream's Iterator.next returned a null value");
                        if (this.disposed) {
                            this.done = true;
                            break;
                        }
                        this.downstream.onNext(next);
                        if (this.disposed) {
                            this.done = true;
                            break;
                        }
                    }
                    stream.close();
                } finally {
                }
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

    public t(i0<T> i0Var, m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        this.f16389a = i0Var;
        this.f16390b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super R> p0Var) {
        Stream<? extends R> stream;
        i0<T> i0Var = this.f16389a;
        if (i0Var instanceof m3.s) {
            try {
                Object obj = ((m3.s) i0Var).get();
                if (obj != null) {
                    Stream<? extends R> apply = this.f16390b.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Stream");
                    stream = apply;
                } else {
                    stream = null;
                }
                if (stream != null) {
                    v.J8(p0Var, stream);
                    return;
                } else {
                    io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                    return;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
                return;
            }
        }
        i0Var.subscribe(new a(p0Var, this.f16390b));
    }
}
