package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class k0<T, K> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, K> f17801b;

    /* renamed from: c, reason: collision with root package name */
    final m3.s<? extends Collection<? super K>> f17802c;

    /* loaded from: classes3.dex */
    static final class a<T, K> extends io.reactivex.rxjava3.internal.observers.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Collection<? super K> f17803f;

        /* renamed from: g, reason: collision with root package name */
        final m3.o<? super T, K> f17804g;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, m3.o<? super T, K> oVar, Collection<? super K> collection) {
            super(p0Var);
            this.f17804g = oVar;
            this.f17803f = collection;
        }

        @Override // io.reactivex.rxjava3.internal.observers.a, io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.f17803f.clear();
            super.clear();
        }

        @Override // io.reactivex.rxjava3.internal.observers.a, io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.f16411d) {
                this.f16411d = true;
                this.f17803f.clear();
                this.f16408a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.a, io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f16411d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f16411d = true;
            this.f17803f.clear();
            this.f16408a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f16411d) {
                return;
            }
            if (this.f16412e == 0) {
                try {
                    K apply = this.f17804g.apply(t5);
                    Objects.requireNonNull(apply, "The keySelector returned a null key");
                    if (this.f17803f.add(apply)) {
                        this.f16408a.onNext(t5);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c(th);
                    return;
                }
            }
            this.f16408a.onNext(null);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() throws Throwable {
            T poll;
            Collection<? super K> collection;
            K apply;
            do {
                poll = this.f16410c.poll();
                if (poll == null) {
                    break;
                }
                collection = this.f17803f;
                apply = this.f17804g.apply(poll);
                Objects.requireNonNull(apply, "The keySelector returned a null key");
            } while (!collection.add(apply));
            return poll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public k0(io.reactivex.rxjava3.core.n0<T> n0Var, m3.o<? super T, K> oVar, m3.s<? extends Collection<? super K>> sVar) {
        super(n0Var);
        this.f17801b = oVar;
        this.f17802c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        try {
            this.f17528a.subscribe(new a(p0Var, this.f17801b, (Collection) io.reactivex.rxjava3.internal.util.k.d(this.f17802c.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
        }
    }
}
