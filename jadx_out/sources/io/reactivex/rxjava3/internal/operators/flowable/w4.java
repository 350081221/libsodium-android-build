package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class w4<T, D> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.s<? extends D> f17125b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super D, ? extends org.reactivestreams.o<? extends T>> f17126c;

    /* renamed from: d, reason: collision with root package name */
    final m3.g<? super D> f17127d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17128e;

    /* loaded from: classes3.dex */
    static final class a<T, D> extends AtomicBoolean implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 5904473792286235046L;
        final m3.g<? super D> disposer;
        final org.reactivestreams.p<? super T> downstream;
        final boolean eager;
        final D resource;
        org.reactivestreams.q upstream;

        a(org.reactivestreams.p<? super T> pVar, D d5, m3.g<? super D> gVar, boolean z4) {
            this.downstream = pVar;
            this.resource = d5;
            this.disposer = gVar;
            this.eager = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (this.eager) {
                disposeResource();
                this.upstream.cancel();
                this.upstream = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            } else {
                this.upstream.cancel();
                this.upstream = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                disposeResource();
            }
        }

        void disposeResource() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.cancel();
                this.downstream.onComplete();
                return;
            }
            this.downstream.onComplete();
            this.upstream.cancel();
            disposeResource();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th2) {
                        th = th2;
                        io.reactivex.rxjava3.exceptions.b.b(th);
                    }
                }
                th = null;
                this.upstream.cancel();
                if (th != null) {
                    this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(th, th));
                    return;
                } else {
                    this.downstream.onError(th);
                    return;
                }
            }
            this.downstream.onError(th);
            this.upstream.cancel();
            disposeResource();
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.upstream.request(j5);
        }
    }

    public w4(m3.s<? extends D> sVar, m3.o<? super D, ? extends org.reactivestreams.o<? extends T>> oVar, m3.g<? super D> gVar, boolean z4) {
        this.f17125b = sVar;
        this.f17126c = oVar;
        this.f17127d = gVar;
        this.f17128e = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        try {
            D d5 = this.f17125b.get();
            try {
                org.reactivestreams.o<? extends T> apply = this.f17126c.apply(d5);
                Objects.requireNonNull(apply, "The sourceSupplier returned a null Publisher");
                apply.subscribe(new a(pVar, d5, this.f17127d, this.f17128e));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                try {
                    this.f17127d.accept(d5);
                    io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    io.reactivex.rxjava3.internal.subscriptions.g.error(new io.reactivex.rxjava3.exceptions.a(th, th2), pVar);
                }
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.b.b(th3);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th3, pVar);
        }
    }
}
