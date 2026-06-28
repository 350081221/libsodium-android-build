package io.reactivex.rxjava3.internal.jdk8;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class h<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final Stream<T> f16349b;

    /* loaded from: classes3.dex */
    static abstract class a<T> extends AtomicLong implements io.reactivex.rxjava3.internal.fuseable.n<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        volatile boolean cancelled;
        AutoCloseable closeable;
        Iterator<T> iterator;
        boolean once;

        a(Iterator<T> it, AutoCloseable autoCloseable) {
            this.iterator = it;
            this.closeable = autoCloseable;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.cancelled = true;
            request(1L);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.iterator = null;
            AutoCloseable autoCloseable = this.closeable;
            this.closeable = null;
            if (autoCloseable != null) {
                h.n9(autoCloseable);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            Iterator<T> it = this.iterator;
            if (it != null) {
                if (this.once && !it.hasNext()) {
                    clear();
                    return true;
                }
                return false;
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(@l3.f T t5) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            Iterator<T> it = this.iterator;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            T next = this.iterator.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5) && io.reactivex.rxjava3.internal.util.d.a(this, j5) == 0) {
                run(j5);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 1) == 0) {
                return 0;
            }
            lazySet(Long.MAX_VALUE);
            return 1;
        }

        abstract void run(long j5);

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(@l3.f T t5, @l3.f T t6) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;

        b(io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar, Iterator<T> it, AutoCloseable autoCloseable) {
            super(it, autoCloseable);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.jdk8.h.a
        public void run(long j5) {
            Iterator<T> it = this.iterator;
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            long j6 = 0;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator returned a null value");
                    if (cVar.tryOnNext(next)) {
                        j6++;
                    }
                    if (this.cancelled) {
                        continue;
                    } else {
                        try {
                            if (!it.hasNext()) {
                                cVar.onComplete();
                                this.cancelled = true;
                            } else if (j6 != j5) {
                                continue;
                            } else {
                                j5 = get();
                                if (j6 != j5) {
                                    continue;
                                } else if (compareAndSet(j5, 0L)) {
                                    return;
                                } else {
                                    j5 = get();
                                }
                            }
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            cVar.onError(th);
                            this.cancelled = true;
                        }
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    cVar.onError(th2);
                    this.cancelled = true;
                }
            }
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        final org.reactivestreams.p<? super T> downstream;

        c(org.reactivestreams.p<? super T> pVar, Iterator<T> it, AutoCloseable autoCloseable) {
            super(it, autoCloseable);
            this.downstream = pVar;
        }

        @Override // io.reactivex.rxjava3.internal.jdk8.h.a
        public void run(long j5) {
            Iterator<T> it = this.iterator;
            org.reactivestreams.p<? super T> pVar = this.downstream;
            long j6 = 0;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator returned a null value");
                    pVar.onNext(next);
                    if (this.cancelled) {
                        continue;
                    } else {
                        try {
                            if (!it.hasNext()) {
                                pVar.onComplete();
                                this.cancelled = true;
                            } else {
                                j6++;
                                if (j6 != j5) {
                                    continue;
                                } else {
                                    j5 = get();
                                    if (j6 != j5) {
                                        continue;
                                    } else if (compareAndSet(j5, 0L)) {
                                        return;
                                    } else {
                                        j5 = get();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            pVar.onError(th);
                            this.cancelled = true;
                        }
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    pVar.onError(th2);
                    this.cancelled = true;
                }
            }
            clear();
        }
    }

    public h(Stream<T> stream) {
        this.f16349b = stream;
    }

    static void n9(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    public static <T> void o9(org.reactivestreams.p<? super T> pVar, Stream<T> stream) {
        try {
            Iterator<T> it = stream.iterator();
            if (!it.hasNext()) {
                io.reactivex.rxjava3.internal.subscriptions.g.complete(pVar);
                n9(stream);
            } else if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
                pVar.onSubscribe(new b((io.reactivex.rxjava3.internal.fuseable.c) pVar, it, stream));
            } else {
                pVar.onSubscribe(new c(pVar, it, stream));
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
            n9(stream);
        }
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        o9(pVar, this.f16349b);
    }
}
