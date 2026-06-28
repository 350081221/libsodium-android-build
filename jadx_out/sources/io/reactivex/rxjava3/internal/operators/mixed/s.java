package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.n0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.core.x0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s<T, R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final n0<T> f17505a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends x0<? extends R>> f17506b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.internal.util.j f17507c;

    /* renamed from: d, reason: collision with root package name */
    final int f17508d;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements p0<T>, io.reactivex.rxjava3.disposables.e {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final p0<? super R> downstream;
        final io.reactivex.rxjava3.internal.util.j errorMode;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final C0495a<R> inner = new C0495a<>(this);
        R item;
        final m3.o<? super T, ? extends x0<? extends R>> mapper;
        final io.reactivex.rxjava3.internal.fuseable.p<T> queue;
        volatile int state;
        io.reactivex.rxjava3.disposables.e upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0495a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements u0<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final a<?, R> parent;

            C0495a(a<?, R> aVar) {
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
            }

            @Override // io.reactivex.rxjava3.core.u0
            public void onSuccess(R r5) {
                this.parent.innerSuccess(r5);
            }
        }

        a(p0<? super R> p0Var, m3.o<? super T, ? extends x0<? extends R>> oVar, int i5, io.reactivex.rxjava3.internal.util.j jVar) {
            this.downstream = p0Var;
            this.mapper = oVar;
            this.errorMode = jVar;
            this.queue = new io.reactivex.rxjava3.internal.queue.c(i5);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.inner.dispose();
            this.errors.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            p0<? super R> p0Var = this.downstream;
            io.reactivex.rxjava3.internal.util.j jVar = this.errorMode;
            io.reactivex.rxjava3.internal.fuseable.p<T> pVar = this.queue;
            io.reactivex.rxjava3.internal.util.c cVar = this.errors;
            int i5 = 1;
            while (true) {
                if (this.cancelled) {
                    pVar.clear();
                    this.item = null;
                } else {
                    int i6 = this.state;
                    if (cVar.get() == null || (jVar != io.reactivex.rxjava3.internal.util.j.IMMEDIATE && (jVar != io.reactivex.rxjava3.internal.util.j.BOUNDARY || i6 != 0))) {
                        boolean z4 = false;
                        if (i6 == 0) {
                            boolean z5 = this.done;
                            T poll = pVar.poll();
                            if (poll == null) {
                                z4 = true;
                            }
                            if (z5 && z4) {
                                cVar.tryTerminateConsumer(p0Var);
                                return;
                            }
                            if (!z4) {
                                try {
                                    x0<? extends R> apply = this.mapper.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                    x0<? extends R> x0Var = apply;
                                    this.state = 1;
                                    x0Var.a(this.inner);
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.b.b(th);
                                    this.upstream.dispose();
                                    pVar.clear();
                                    cVar.tryAddThrowableOrReport(th);
                                    cVar.tryTerminateConsumer(p0Var);
                                    return;
                                }
                            }
                        } else if (i6 == 2) {
                            R r5 = this.item;
                            this.item = null;
                            p0Var.onNext(r5);
                            this.state = 0;
                        }
                    }
                }
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
            pVar.clear();
            this.item = null;
            cVar.tryTerminateConsumer(p0Var);
        }

        void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode != io.reactivex.rxjava3.internal.util.j.END) {
                    this.upstream.dispose();
                }
                this.state = 0;
                drain();
            }
        }

        void innerSuccess(R r5) {
            this.item = r5;
            this.state = 2;
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode == io.reactivex.rxjava3.internal.util.j.IMMEDIATE) {
                    this.inner.dispose();
                }
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public s(n0<T> n0Var, m3.o<? super T, ? extends x0<? extends R>> oVar, io.reactivex.rxjava3.internal.util.j jVar, int i5) {
        this.f17505a = n0Var;
        this.f17506b = oVar;
        this.f17507c = jVar;
        this.f17508d = i5;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super R> p0Var) {
        if (!w.c(this.f17505a, this.f17506b, p0Var)) {
            this.f17505a.subscribe(new a(p0Var, this.f17506b, this.f17508d, this.f17507c));
        }
    }
}
