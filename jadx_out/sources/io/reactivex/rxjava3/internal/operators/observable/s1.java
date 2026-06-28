package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> implements m3.s<io.reactivex.rxjava3.observables.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.i0<T> f18061a;

        /* renamed from: b, reason: collision with root package name */
        final int f18062b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f18063c;

        a(io.reactivex.rxjava3.core.i0<T> i0Var, int i5, boolean z4) {
            this.f18061a = i0Var;
            this.f18062b = i5;
            this.f18063c = z4;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.observables.a<T> get() {
            return this.f18061a.h5(this.f18062b, this.f18063c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> implements m3.s<io.reactivex.rxjava3.observables.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.i0<T> f18064a;

        /* renamed from: b, reason: collision with root package name */
        final int f18065b;

        /* renamed from: c, reason: collision with root package name */
        final long f18066c;

        /* renamed from: d, reason: collision with root package name */
        final TimeUnit f18067d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.rxjava3.core.q0 f18068e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f18069f;

        b(io.reactivex.rxjava3.core.i0<T> i0Var, int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            this.f18064a = i0Var;
            this.f18065b = i5;
            this.f18066c = j5;
            this.f18067d = timeUnit;
            this.f18068e = q0Var;
            this.f18069f = z4;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.observables.a<T> get() {
            return this.f18064a.g5(this.f18065b, this.f18066c, this.f18067d, this.f18068e, this.f18069f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T, U> implements m3.o<T, io.reactivex.rxjava3.core.n0<U>> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.o<? super T, ? extends Iterable<? extends U>> f18070a;

        c(m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f18070a = oVar;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.core.n0<U> apply(T t5) throws Throwable {
            Iterable<? extends U> apply = this.f18070a.apply(t5);
            Objects.requireNonNull(apply, "The mapper returned a null Iterable");
            return new h1(apply);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d<U, R, T> implements m3.o<U, R> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.c<? super T, ? super U, ? extends R> f18071a;

        /* renamed from: b, reason: collision with root package name */
        private final T f18072b;

        d(m3.c<? super T, ? super U, ? extends R> cVar, T t5) {
            this.f18071a = cVar;
            this.f18072b = t5;
        }

        @Override // m3.o
        public R apply(U u4) throws Throwable {
            return this.f18071a.apply(this.f18072b, u4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e<T, R, U> implements m3.o<T, io.reactivex.rxjava3.core.n0<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.c<? super T, ? super U, ? extends R> f18073a;

        /* renamed from: b, reason: collision with root package name */
        private final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> f18074b;

        e(m3.c<? super T, ? super U, ? extends R> cVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> oVar) {
            this.f18073a = cVar;
            this.f18074b = oVar;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.core.n0<R> apply(T t5) throws Throwable {
            io.reactivex.rxjava3.core.n0<? extends U> apply = this.f18074b.apply(t5);
            Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
            return new a2(apply, new d(this.f18073a, t5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class f<T, U> implements m3.o<T, io.reactivex.rxjava3.core.n0<T>> {

        /* renamed from: a, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<U>> f18075a;

        f(m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<U>> oVar) {
            this.f18075a = oVar;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.core.n0<T> apply(T t5) throws Throwable {
            io.reactivex.rxjava3.core.n0<U> apply = this.f18075a.apply(t5);
            Objects.requireNonNull(apply, "The itemDelay returned a null ObservableSource");
            return new s3(apply, 1L).V3(io.reactivex.rxjava3.internal.functions.a.n(t5)).F1(t5);
        }
    }

    /* loaded from: classes3.dex */
    enum g implements m3.o<Object, Object> {
        INSTANCE;

        @Override // m3.o
        public Object apply(Object obj) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class h<T> implements m3.a {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<T> f18076a;

        h(io.reactivex.rxjava3.core.p0<T> p0Var) {
            this.f18076a = p0Var;
        }

        @Override // m3.a
        public void run() {
            this.f18076a.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class i<T> implements m3.g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<T> f18077a;

        i(io.reactivex.rxjava3.core.p0<T> p0Var) {
            this.f18077a = p0Var;
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            this.f18077a.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class j<T> implements m3.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<T> f18078a;

        j(io.reactivex.rxjava3.core.p0<T> p0Var) {
            this.f18078a = p0Var;
        }

        @Override // m3.g
        public void accept(T t5) {
            this.f18078a.onNext(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class k<T> implements m3.s<io.reactivex.rxjava3.observables.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.i0<T> f18079a;

        k(io.reactivex.rxjava3.core.i0<T> i0Var) {
            this.f18079a = i0Var;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.observables.a<T> get() {
            return this.f18079a.c5();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class l<T, S> implements m3.c<S, io.reactivex.rxjava3.core.k<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final m3.b<S, io.reactivex.rxjava3.core.k<T>> f18080a;

        l(m3.b<S, io.reactivex.rxjava3.core.k<T>> bVar) {
            this.f18080a = bVar;
        }

        @Override // m3.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s5, io.reactivex.rxjava3.core.k<T> kVar) throws Throwable {
            this.f18080a.accept(s5, kVar);
            return s5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class m<T, S> implements m3.c<S, io.reactivex.rxjava3.core.k<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final m3.g<io.reactivex.rxjava3.core.k<T>> f18081a;

        m(m3.g<io.reactivex.rxjava3.core.k<T>> gVar) {
            this.f18081a = gVar;
        }

        @Override // m3.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s5, io.reactivex.rxjava3.core.k<T> kVar) throws Throwable {
            this.f18081a.accept(kVar);
            return s5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class n<T> implements m3.s<io.reactivex.rxjava3.observables.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.i0<T> f18082a;

        /* renamed from: b, reason: collision with root package name */
        final long f18083b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f18084c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.rxjava3.core.q0 f18085d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f18086e;

        n(io.reactivex.rxjava3.core.i0<T> i0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            this.f18082a = i0Var;
            this.f18083b = j5;
            this.f18084c = timeUnit;
            this.f18085d = q0Var;
            this.f18086e = z4;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.observables.a<T> get() {
            return this.f18082a.k5(this.f18083b, this.f18084c, this.f18085d, this.f18086e);
        }
    }

    private s1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> m3.o<T, io.reactivex.rxjava3.core.n0<U>> a(m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> m3.o<T, io.reactivex.rxjava3.core.n0<R>> b(m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<? extends U>> oVar, m3.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> m3.o<T, io.reactivex.rxjava3.core.n0<T>> c(m3.o<? super T, ? extends io.reactivex.rxjava3.core.n0<U>> oVar) {
        return new f(oVar);
    }

    public static <T> m3.a d(io.reactivex.rxjava3.core.p0<T> p0Var) {
        return new h(p0Var);
    }

    public static <T> m3.g<Throwable> e(io.reactivex.rxjava3.core.p0<T> p0Var) {
        return new i(p0Var);
    }

    public static <T> m3.g<T> f(io.reactivex.rxjava3.core.p0<T> p0Var) {
        return new j(p0Var);
    }

    public static <T> m3.s<io.reactivex.rxjava3.observables.a<T>> g(io.reactivex.rxjava3.core.i0<T> i0Var) {
        return new k(i0Var);
    }

    public static <T> m3.s<io.reactivex.rxjava3.observables.a<T>> h(io.reactivex.rxjava3.core.i0<T> i0Var, int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        return new b(i0Var, i5, j5, timeUnit, q0Var, z4);
    }

    public static <T> m3.s<io.reactivex.rxjava3.observables.a<T>> i(io.reactivex.rxjava3.core.i0<T> i0Var, int i5, boolean z4) {
        return new a(i0Var, i5, z4);
    }

    public static <T> m3.s<io.reactivex.rxjava3.observables.a<T>> j(io.reactivex.rxjava3.core.i0<T> i0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        return new n(i0Var, j5, timeUnit, q0Var, z4);
    }

    public static <T, S> m3.c<S, io.reactivex.rxjava3.core.k<T>, S> k(m3.b<S, io.reactivex.rxjava3.core.k<T>> bVar) {
        return new l(bVar);
    }

    public static <T, S> m3.c<S, io.reactivex.rxjava3.core.k<T>, S> l(m3.g<io.reactivex.rxjava3.core.k<T>> gVar) {
        return new m(gVar);
    }
}
