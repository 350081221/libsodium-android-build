package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.r3;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class s3<T> extends io.reactivex.rxjava3.core.r0<Boolean> implements io.reactivex.rxjava3.internal.fuseable.d<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f17036a;

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f17037b;

    /* renamed from: c, reason: collision with root package name */
    final m3.d<? super T, ? super T> f17038c;

    /* renamed from: d, reason: collision with root package name */
    final int f17039d;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e, r3.b {
        private static final long serialVersionUID = -6178010334400373240L;
        final m3.d<? super T, ? super T> comparer;
        final io.reactivex.rxjava3.core.u0<? super Boolean> downstream;
        final io.reactivex.rxjava3.internal.util.c errors = new io.reactivex.rxjava3.internal.util.c();
        final r3.c<T> first;
        final r3.c<T> second;

        /* renamed from: v1, reason: collision with root package name */
        T f17040v1;

        /* renamed from: v2, reason: collision with root package name */
        T f17041v2;

        a(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var, int i5, m3.d<? super T, ? super T> dVar) {
            this.downstream = u0Var;
            this.comparer = dVar;
            this.first = new r3.c<>(this, i5);
            this.second = new r3.c<>(this, i5);
        }

        void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.first.cancel();
            this.second.cancel();
            this.errors.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.r3.b
        public void drain() {
            boolean z4;
            if (getAndIncrement() != 0) {
                return;
            }
            int i5 = 1;
            do {
                io.reactivex.rxjava3.internal.fuseable.q<T> qVar = this.first.queue;
                io.reactivex.rxjava3.internal.fuseable.q<T> qVar2 = this.second.queue;
                if (qVar != null && qVar2 != null) {
                    while (!isDisposed()) {
                        if (this.errors.get() != null) {
                            cancelAndClear();
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        boolean z5 = this.first.done;
                        T t5 = this.f17040v1;
                        if (t5 == null) {
                            try {
                                t5 = qVar.poll();
                                this.f17040v1 = t5;
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.b.b(th);
                                cancelAndClear();
                                this.errors.tryAddThrowableOrReport(th);
                                this.errors.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                        boolean z6 = false;
                        if (t5 == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z7 = this.second.done;
                        T t6 = this.f17041v2;
                        if (t6 == null) {
                            try {
                                t6 = qVar2.poll();
                                this.f17041v2 = t6;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.b.b(th2);
                                cancelAndClear();
                                this.errors.tryAddThrowableOrReport(th2);
                                this.errors.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                        if (t6 == null) {
                            z6 = true;
                        }
                        if (z5 && z7 && z4 && z6) {
                            this.downstream.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if (z5 && z7 && z4 != z6) {
                            cancelAndClear();
                            this.downstream.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if (!z4 && !z6) {
                            try {
                                if (!this.comparer.a(t5, t6)) {
                                    cancelAndClear();
                                    this.downstream.onSuccess(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f17040v1 = null;
                                    this.f17041v2 = null;
                                    this.first.request();
                                    this.second.request();
                                }
                            } catch (Throwable th3) {
                                io.reactivex.rxjava3.exceptions.b.b(th3);
                                cancelAndClear();
                                this.errors.tryAddThrowableOrReport(th3);
                                this.errors.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                    }
                    this.first.clear();
                    this.second.clear();
                    return;
                }
                if (isDisposed()) {
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (this.errors.get() != null) {
                    cancelAndClear();
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                i5 = addAndGet(-i5);
            } while (i5 != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.r3.b
        public void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.first.get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        void subscribe(org.reactivestreams.o<? extends T> oVar, org.reactivestreams.o<? extends T> oVar2) {
            oVar.subscribe(this.first);
            oVar2.subscribe(this.second);
        }
    }

    public s3(org.reactivestreams.o<? extends T> oVar, org.reactivestreams.o<? extends T> oVar2, m3.d<? super T, ? super T> dVar, int i5) {
        this.f17036a = oVar;
        this.f17037b = oVar2;
        this.f17038c = dVar;
        this.f17039d = i5;
    }

    @Override // io.reactivex.rxjava3.core.r0
    public void M1(io.reactivex.rxjava3.core.u0<? super Boolean> u0Var) {
        a aVar = new a(u0Var, this.f17039d, this.f17038c);
        u0Var.onSubscribe(aVar);
        aVar.subscribe(this.f17036a, this.f17037b);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.d
    public io.reactivex.rxjava3.core.o<Boolean> d() {
        return io.reactivex.rxjava3.plugins.a.P(new r3(this.f17036a, this.f17037b, this.f17038c, this.f17039d));
    }
}
