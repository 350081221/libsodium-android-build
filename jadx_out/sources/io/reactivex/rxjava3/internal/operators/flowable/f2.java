package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class f2<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, ? extends U> f16742c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends io.reactivex.rxjava3.internal.subscribers.a<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, ? extends U> f16743f;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super U> cVar, m3.o<? super T, ? extends U> oVar) {
            super(cVar);
            this.f16743f = oVar;
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18634d) {
                return;
            }
            if (this.f18635e != 0) {
                this.f18631a.onNext(null);
                return;
            }
            try {
                U apply = this.f16743f.apply(t5);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f18631a.onNext(apply);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public U poll() throws Throwable {
            T poll = this.f18633c.poll();
            if (poll != null) {
                U apply = this.f16743f.apply(poll);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
            }
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.f18634d) {
                return false;
            }
            try {
                U apply = this.f16743f.apply(t5);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return this.f18631a.tryOnNext(apply);
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, U> extends io.reactivex.rxjava3.internal.subscribers.b<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, ? extends U> f16744f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(org.reactivestreams.p<? super U> pVar, m3.o<? super T, ? extends U> oVar) {
            super(pVar);
            this.f16744f = oVar;
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f18639d) {
                return;
            }
            if (this.f18640e != 0) {
                this.f18636a.onNext(null);
                return;
            }
            try {
                U apply = this.f16744f.apply(t5);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f18636a.onNext(apply);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public U poll() throws Throwable {
            T poll = this.f18638c.poll();
            if (poll != null) {
                U apply = this.f16744f.apply(poll);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
            }
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public f2(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends U> oVar2) {
        super(oVar);
        this.f16742c = oVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super U> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            this.f16598b.N6(new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16742c));
        } else {
            this.f16598b.N6(new b(pVar, this.f16742c));
        }
    }
}
