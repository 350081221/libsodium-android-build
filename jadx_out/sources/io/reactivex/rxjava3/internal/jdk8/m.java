package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.u0;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class m<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.x<T> f16365b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends Stream<? extends R>> f16366c;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.subscriptions.c<R> implements io.reactivex.rxjava3.core.a0<T>, u0<T> {
        private static final long serialVersionUID = 7363336003027148283L;
        volatile boolean cancelled;
        AutoCloseable close;
        final org.reactivestreams.p<? super R> downstream;
        long emitted;
        volatile Iterator<? extends R> iterator;
        final m3.o<? super T, ? extends Stream<? extends R>> mapper;
        boolean once;
        boolean outputFused;
        final AtomicLong requested = new AtomicLong();
        io.reactivex.rxjava3.disposables.e upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super R> pVar, m3.o<? super T, ? extends Stream<? extends R>> oVar) {
            this.downstream = pVar;
            this.mapper = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            if (!this.outputFused) {
                drain();
            }
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

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.p<? super R> pVar = this.downstream;
            long j5 = this.emitted;
            long j6 = this.requested.get();
            Iterator<? extends R> it = this.iterator;
            int i5 = 1;
            while (true) {
                if (this.cancelled) {
                    clear();
                } else if (this.outputFused) {
                    if (it != null) {
                        pVar.onNext(null);
                        pVar.onComplete();
                    }
                } else if (it != null && j5 != j6) {
                    try {
                        R next = it.next();
                        if (!this.cancelled) {
                            pVar.onNext(next);
                            j5++;
                            if (!this.cancelled) {
                                try {
                                    boolean hasNext = it.hasNext();
                                    if (!this.cancelled && !hasNext) {
                                        pVar.onComplete();
                                        this.cancelled = true;
                                    }
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                    pVar.onError(th);
                                    this.cancelled = true;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.b.b(th2);
                        pVar.onError(th2);
                        this.cancelled = true;
                    }
                }
                this.emitted = j5;
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
                j6 = this.requested.get();
                if (it == null) {
                    it = this.iterator;
                }
            }
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

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                drain();
            }
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

    public m(io.reactivex.rxjava3.core.x<T> xVar, m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        this.f16365b = xVar;
        this.f16366c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(@l3.f org.reactivestreams.p<? super R> pVar) {
        this.f16365b.a(new a(pVar, this.f16366c));
    }
}
