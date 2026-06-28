package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes3.dex */
public final class x<T, R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final i0<T> f16401a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, Optional<? extends R>> f16402b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends io.reactivex.rxjava3.internal.observers.a<T, R> {

        /* renamed from: f, reason: collision with root package name */
        final m3.o<? super T, Optional<? extends R>> f16403f;

        a(p0<? super R> p0Var, m3.o<? super T, Optional<? extends R>> oVar) {
            super(p0Var);
            this.f16403f = oVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (this.f16411d) {
                return;
            }
            if (this.f16412e != 0) {
                this.f16408a.onNext(null);
                return;
            }
            try {
                Optional<? extends R> apply = this.f16403f.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    this.f16408a.onNext(optional.get());
                }
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public R poll() throws Throwable {
            Optional<? extends R> optional;
            do {
                T poll = this.f16410c.poll();
                if (poll == null) {
                    return null;
                }
                Optional<? extends R> apply = this.f16403f.apply(poll);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                optional = apply;
            } while (!optional.isPresent());
            return optional.get();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            return d(i5);
        }
    }

    public x(i0<T> i0Var, m3.o<? super T, Optional<? extends R>> oVar) {
        this.f16401a = i0Var;
        this.f16402b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super R> p0Var) {
        this.f16401a.subscribe(new a(p0Var, this.f16402b));
    }
}
