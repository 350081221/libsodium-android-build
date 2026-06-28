package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.u0;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class n<T, R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x<T> f16367a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends Stream<? extends R>> f16368b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.observers.b<R> implements io.reactivex.rxjava3.core.a0<T>, u0<T> {
        private static final long serialVersionUID = 7363336003027148283L;
        AutoCloseable close;
        volatile boolean disposed;
        final p0<? super R> downstream;
        volatile Iterator<? extends R> iterator;
        final m3.o<? super T, ? extends Stream<? extends R>> mapper;
        boolean once;
        boolean outputFused;
        io.reactivex.rxjava3.disposables.e upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(p0<? super R> p0Var, m3.o<? super T, ? extends Stream<? extends R>> oVar) {
            this.downstream = p0Var;
            this.mapper = oVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.iterator = null;
            AutoCloseable autoCloseable = this.close;
            this.close = null;
            close(autoCloseable);
        }

        void close(AutoCloseable autoCloseable) {
            if (autoCloseable != null) {
                try {
                    autoCloseable.close();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            if (!this.outputFused) {
                drain();
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            p0<? super R> p0Var = this.downstream;
            Iterator<? extends R> it = this.iterator;
            int i5 = 1;
            while (true) {
                if (this.disposed) {
                    clear();
                } else if (this.outputFused) {
                    p0Var.onNext(null);
                    p0Var.onComplete();
                } else {
                    try {
                        R next = it.next();
                        if (!this.disposed) {
                            p0Var.onNext(next);
                            if (!this.disposed) {
                                try {
                                    boolean hasNext = it.hasNext();
                                    if (!this.disposed && !hasNext) {
                                        p0Var.onComplete();
                                        this.disposed = true;
                                    }
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                    p0Var.onError(th);
                                    this.disposed = true;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        p0Var.onError(th2);
                        this.disposed = true;
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            Iterator<? extends R> it = this.iterator;
            if (it != null) {
                if (!this.once || it.hasNext()) {
                    return false;
                }
                clear();
                return true;
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onError(@l3.f Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
        public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
        public void onSuccess(@l3.f T t5) {
            try {
                Stream<? extends R> apply = this.mapper.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Stream");
                Stream<? extends R> stream = apply;
                Iterator<? extends R> it = stream.iterator();
                if (!it.hasNext()) {
                    this.downstream.onComplete();
                    close(stream);
                } else {
                    this.iterator = it;
                    this.close = stream;
                    drain();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public R poll() throws Throwable {
            Iterator<? extends R> it = this.iterator;
            if (it == null) {
                return null;
            }
            if (this.once) {
                if (!it.hasNext()) {
                    clear();
                    return null;
                }
            } else {
                this.once = true;
            }
            return it.next();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public n(io.reactivex.rxjava3.core.x<T> xVar, m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        this.f16367a = xVar;
        this.f16368b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(@l3.f p0<? super R> p0Var) {
        this.f16367a.a(new a(p0Var, this.f16368b));
    }
}
