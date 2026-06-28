package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class m0<T, K> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, K> f16872c;

    /* renamed from: d, reason: collision with root package name */
    final m3.s<? extends Collection<? super K>> f16873d;

    /* loaded from: classes3.dex */
    static final class a<T, K> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Collection<? super K> f16874f;

        /* renamed from: g, reason: collision with root package name */
        final m3.o<? super T, K> f16875g;

        a(org.reactivestreams.p<? super T> pVar, m3.o<? super T, K> oVar, Collection<? super K> collection) {
            super(pVar);
            this.f16875g = oVar;
            this.f16874f = collection;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.f16874f.clear();
            super.clear();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.p
        public void onComplete() {
            if (!this.f18639d) {
                this.f18639d = true;
                this.f16874f.clear();
                this.f18636a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18639d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f18639d = true;
            this.f16874f.clear();
            this.f18636a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18639d) {
                return;
            }
            if (this.f18640e == 0) {
                try {
                    K apply = this.f16875g.apply(t5);
                    Objects.requireNonNull(apply, "The keySelector returned a null key");
                    if (this.f16874f.add(apply)) {
                        this.f18636a.onNext(t5);
                        return;
                    } else {
                        this.f18637b.request(1L);
                        return;
                    }
                } catch (Throwable th) {
                    c(th);
                    return;
                }
            }
            this.f18636a.onNext(null);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll;
            while (true) {
                poll = this.f18638c.poll();
                if (poll == null) {
                    break;
                }
                Collection<? super K> collection = this.f16874f;
                K apply = this.f16875g.apply(poll);
                Objects.requireNonNull(apply, "The keySelector returned a null key");
                if (collection.add(apply)) {
                    break;
                }
                if (this.f18640e == 2) {
                    this.f18637b.request(1L);
                }
            }
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public m0(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, K> oVar2, m3.s<? extends Collection<? super K>> sVar) {
        super(oVar);
        this.f16872c = oVar2;
        this.f16873d = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        try {
            this.f16598b.N6(new a(pVar, this.f16872c, (Collection) io.reactivex.rxjava3.internal.util.k.d(this.f16873d.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
        }
    }
}
