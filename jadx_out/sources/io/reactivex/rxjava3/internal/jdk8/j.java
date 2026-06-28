package io.reactivex.rxjava3.internal.jdk8;

import java.util.Objects;
import java.util.Optional;

/* loaded from: classes3.dex */
public final class j<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16357b;

    /* renamed from: c, reason: collision with root package name */
    final m3.o<? super T, Optional<? extends R>> f16358c;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.subscribers.a<T, R> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16359f;

        a(io.reactivex.rxjava3.internal.fuseable.c<? super R> cVar, m3.o<? super T, Optional<? extends R>> oVar) {
            super(cVar);
            this.f16359f = oVar;
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.f18632b.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public R poll() throws Throwable {
            while (true) {
                T poll = this.f18633c.poll();
                if (poll == null) {
                    return null;
                }
                Optional<? extends R> apply = this.f16359f.apply(poll);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    return optional.get();
                }
                if (this.f18635e == 2) {
                    this.f18633c.request(1L);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.f18634d) {
                return true;
            }
            if (this.f18635e != 0) {
                this.f18631a.onNext(null);
                return true;
            }
            try {
                Optional<? extends R> apply = this.f16359f.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    return this.f18631a.tryOnNext(optional.get());
                }
                return false;
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> extends io.reactivex.rxjava3.internal.subscribers.b<T, R> implements io.reactivex.rxjava3.internal.fuseable.c<T> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16360f;

        b(org.reactivestreams.p<? super R> pVar, m3.o<? super T, Optional<? extends R>> oVar) {
            super(pVar);
            this.f16360f = oVar;
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.f18637b.request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public R poll() throws Throwable {
            while (true) {
                T poll = this.f18638c.poll();
                if (poll == null) {
                    return null;
                }
                Optional<? extends R> apply = this.f16360f.apply(poll);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    return optional.get();
                }
                if (this.f18640e == 2) {
                    this.f18638c.request(1L);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.f18639d) {
                return true;
            }
            if (this.f18640e != 0) {
                this.f18636a.onNext(null);
                return true;
            }
            try {
                Optional<? extends R> apply = this.f16360f.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    this.f18636a.onNext(optional.get());
                    return true;
                }
                return false;
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    public j(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, Optional<? extends R>> oVar2) {
        this.f16357b = oVar;
        this.f16358c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super R> pVar) {
        if (pVar instanceof io.reactivex.rxjava3.internal.fuseable.c) {
            this.f16357b.N6(new a((io.reactivex.rxjava3.internal.fuseable.c) pVar, this.f16358c));
        } else {
            this.f16357b.N6(new b(pVar, this.f16358c));
        }
    }
}
