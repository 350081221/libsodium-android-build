package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c5<T, U, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final m3.c<? super T, ? super U, ? extends R> f16665c;

    /* renamed from: d, reason: collision with root package name */
    final org.reactivestreams.o<? extends U> f16666d;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.t<U> {

        /* renamed from: a, reason: collision with root package name */
        private final b<T, U, R> f16667a;

        a(b<T, U, R> bVar) {
            this.f16667a = bVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16667a.otherError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(U u4) {
            this.f16667a.lazySet(u4);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (this.f16667a.setOther(qVar)) {
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U, R> extends AtomicReference<U> implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -312246233408980075L;
        final m3.c<? super T, ? super U, ? extends R> combiner;
        final org.reactivestreams.p<? super R> downstream;
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<org.reactivestreams.q> other = new AtomicReference<>();

        b(org.reactivestreams.p<? super R> pVar, m3.c<? super T, ? super U, ? extends R> cVar) {
            this.downstream = pVar;
            this.combiner = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.upstream.get().request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.upstream, this.requested, qVar);
        }

        public void otherError(Throwable th) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this.requested, j5);
        }

        public boolean setOther(org.reactivestreams.q qVar) {
            return io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.other, qVar);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            U u4 = get();
            if (u4 != null) {
                try {
                    R apply = this.combiner.apply(t5, u4);
                    Objects.requireNonNull(apply, "The combiner returned a null value");
                    this.downstream.onNext(apply);
                    return true;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
            return false;
        }
    }

    public c5(io.reactivex.rxjava3.core.o<T> oVar, m3.c<? super T, ? super U, ? extends R> cVar, org.reactivestreams.o<? extends U> oVar2) {
        super(oVar);
        this.f16665c = cVar;
        this.f16666d = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        io.reactivex.rxjava3.subscribers.e eVar = new io.reactivex.rxjava3.subscribers.e(pVar);
        b bVar = new b(eVar, this.f16665c);
        eVar.onSubscribe(bVar);
        this.f16666d.subscribe(new a(bVar));
        this.f16598b.N6(bVar);
    }
}
