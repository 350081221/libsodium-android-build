package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f0<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<U>> f16732c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 6725975399620862591L;
        final m3.o<? super T, ? extends org.reactivestreams.o<U>> debounceSelector;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> debouncer = new AtomicReference<>();
        boolean done;
        final org.reactivestreams.p<? super T> downstream;
        volatile long index;
        org.reactivestreams.q upstream;

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.f0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0468a<T, U> extends io.reactivex.rxjava3.subscribers.b<U> {

            /* renamed from: b, reason: collision with root package name */
            final a<T, U> f16733b;

            /* renamed from: c, reason: collision with root package name */
            final long f16734c;

            /* renamed from: d, reason: collision with root package name */
            final T f16735d;

            /* renamed from: e, reason: collision with root package name */
            boolean f16736e;

            /* renamed from: f, reason: collision with root package name */
            final AtomicBoolean f16737f = new AtomicBoolean();

            C0468a(a<T, U> aVar, long j5, T t5) {
                this.f16733b = aVar;
                this.f16734c = j5;
                this.f16735d = t5;
            }

            void d() {
                if (this.f16737f.compareAndSet(false, true)) {
                    this.f16733b.emit(this.f16734c, this.f16735d);
                }
            }

            @Override // org.reactivestreams.p
            public void onComplete() {
                if (this.f16736e) {
                    return;
                }
                this.f16736e = true;
                d();
            }

            @Override // org.reactivestreams.p
            public void onError(Throwable th) {
                if (this.f16736e) {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                } else {
                    this.f16736e = true;
                    this.f16733b.onError(th);
                }
            }

            @Override // org.reactivestreams.p
            public void onNext(U u4) {
                if (this.f16736e) {
                    return;
                }
                this.f16736e = true;
                a();
                d();
            }
        }

        a(org.reactivestreams.p<? super T> pVar, m3.o<? super T, ? extends org.reactivestreams.o<U>> oVar) {
            this.downstream = pVar;
            this.debounceSelector = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.upstream.cancel();
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.debouncer);
        }

        void emit(long j5, T t5) {
            if (j5 == this.index) {
                if (get() != 0) {
                    this.downstream.onNext(t5);
                    io.reactivex.rxjava3.internal.util.d.e(this, 1L);
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
            io.reactivex.rxjava3.disposables.e eVar = this.debouncer.get();
            if (!io.reactivex.rxjava3.internal.disposables.c.isDisposed(eVar)) {
                C0468a c0468a = (C0468a) eVar;
                if (c0468a != null) {
                    c0468a.d();
                }
                io.reactivex.rxjava3.internal.disposables.c.dispose(this.debouncer);
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.debouncer);
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            long j5 = this.index + 1;
            this.index = j5;
            io.reactivex.rxjava3.disposables.e eVar = this.debouncer.get();
            if (eVar != null) {
                eVar.dispose();
            }
            try {
                org.reactivestreams.o<U> apply = this.debounceSelector.apply(t5);
                Objects.requireNonNull(apply, "The publisher supplied is null");
                org.reactivestreams.o<U> oVar = apply;
                C0468a c0468a = new C0468a(this, j5, t5);
                if (androidx.compose.animation.core.h.a(this.debouncer, eVar, c0468a)) {
                    oVar.subscribe(c0468a);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                cancel();
                this.downstream.onError(th);
            }
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

    public f0(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends org.reactivestreams.o<U>> oVar2) {
        super(oVar);
        this.f16732c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(new io.reactivex.rxjava3.subscribers.e(pVar), this.f16732c));
    }
}
