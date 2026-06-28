package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16760c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f16761d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16762e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements Runnable, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final b<T> parent;
        final T value;

        a(T t5, long j5, b<T> bVar) {
            this.value = t5;
            this.idx = j5;
            this.parent = bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        void emit() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.emit(this.idx, this.value, this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }

        public void setResource(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final org.reactivestreams.p<? super T> downstream;
        volatile long index;
        final long timeout;
        io.reactivex.rxjava3.disposables.e timer;
        final TimeUnit unit;
        org.reactivestreams.q upstream;
        final q0.c worker;

        b(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, q0.c cVar) {
            this.downstream = pVar;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        void emit(long j5, T t5, a<T> aVar) {
            if (j5 == this.index) {
                if (get() != 0) {
                    this.downstream.onNext(t5);
                    io.reactivex.rxjava3.internal.util.d.e(this, 1L);
                    aVar.dispose();
                } else {
                    cancel();
                    this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            io.reactivex.rxjava3.disposables.e eVar = this.timer;
            if (eVar != null) {
                eVar.dispose();
            }
            a aVar = (a) eVar;
            if (aVar != null) {
                aVar.emit();
            }
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.done = true;
            io.reactivex.rxjava3.disposables.e eVar = this.timer;
            if (eVar != null) {
                eVar.dispose();
            }
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            long j5 = this.index + 1;
            this.index = j5;
            io.reactivex.rxjava3.disposables.e eVar = this.timer;
            if (eVar != null) {
                eVar.dispose();
            }
            a aVar = new a(t5, j5, this);
            this.timer = aVar;
            aVar.setResource(this.worker.c(aVar, this.timeout, this.unit));
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this, j5);
            }
        }
    }

    public g0(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        super(oVar);
        this.f16760c = j5;
        this.f16761d = timeUnit;
        this.f16762e = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new b(new io.reactivex.rxjava3.subscribers.e(pVar), this.f16760c, this.f16761d, this.f16762e.c()));
    }
}
