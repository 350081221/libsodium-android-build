package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class x1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> implements m3.s<io.reactivex.rxjava3.flowables.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.o<T> f17135a;

        /* renamed from: b, reason: collision with root package name */
        final int f17136b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f17137c;

        a(io.reactivex.rxjava3.core.o<T> oVar, int i5, boolean z4) {
            this.f17135a = oVar;
            this.f17136b = i5;
            this.f17137c = z4;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.flowables.a<T> get() {
            return this.f17135a.J5(this.f17136b, this.f17137c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> implements m3.s<io.reactivex.rxjava3.flowables.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.o<T> f17138a;

        /* renamed from: b, reason: collision with root package name */
        final int f17139b;

        /* renamed from: c, reason: collision with root package name */
        final long f17140c;

        /* renamed from: d, reason: collision with root package name */
        final TimeUnit f17141d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.rxjava3.core.q0 f17142e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f17143f;

        b(io.reactivex.rxjava3.core.o<T> oVar, int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            this.f17138a = oVar;
            this.f17139b = i5;
            this.f17140c = j5;
            this.f17141d = timeUnit;
            this.f17142e = q0Var;
            this.f17143f = z4;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.flowables.a<T> get() {
            return this.f17138a.I5(this.f17139b, this.f17140c, this.f17141d, this.f17142e, this.f17143f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T, U> implements m3.o<T, org.reactivestreams.o<U>> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.o<? super T, ? extends Iterable<? extends U>> f17144a;

        c(m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f17144a = oVar;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.o<U> apply(T t5) throws Throwable {
            Iterable<? extends U> apply = this.f17144a.apply(t5);
            Objects.requireNonNull(apply, "The mapper returned a null Iterable");
            return new m1(apply);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d<U, R, T> implements m3.o<U, R> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.c<? super T, ? super U, ? extends R> f17145a;

        /* renamed from: b, reason: collision with root package name */
        private final T f17146b;

        d(m3.c<? super T, ? super U, ? extends R> cVar, T t5) {
            this.f17145a = cVar;
            this.f17146b = t5;
        }

        @Override // m3.o
        public R apply(U u4) throws Throwable {
            return this.f17145a.apply(this.f17146b, u4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e<T, R, U> implements m3.o<T, org.reactivestreams.o<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.c<? super T, ? super U, ? extends R> f17147a;

        /* renamed from: b, reason: collision with root package name */
        private final m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> f17148b;

        e(m3.c<? super T, ? super U, ? extends R> cVar, m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> oVar) {
            this.f17147a = cVar;
            this.f17148b = oVar;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.o<R> apply(T t5) throws Throwable {
            org.reactivestreams.o<? extends U> apply = this.f17148b.apply(t5);
            Objects.requireNonNull(apply, "The mapper returned a null Publisher");
            return new h2(apply, new d(this.f17147a, t5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class f<T, U> implements m3.o<T, org.reactivestreams.o<T>> {

        /* renamed from: a, reason: collision with root package name */
        final m3.o<? super T, ? extends org.reactivestreams.o<U>> f17149a;

        f(m3.o<? super T, ? extends org.reactivestreams.o<U>> oVar) {
            this.f17149a = oVar;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.o<T> apply(T t5) throws Throwable {
            org.reactivestreams.o<U> apply = this.f17149a.apply(t5);
            Objects.requireNonNull(apply, "The itemDelay returned a null Publisher");
            return new j4(apply, 1L).g4(io.reactivex.rxjava3.internal.functions.a.n(t5)).K1(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class g<T> implements m3.s<io.reactivex.rxjava3.flowables.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.o<T> f17150a;

        g(io.reactivex.rxjava3.core.o<T> oVar) {
            this.f17150a = oVar;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.flowables.a<T> get() {
            return this.f17150a.E5();
        }
    }

    /* loaded from: classes3.dex */
    public enum h implements m3.g<org.reactivestreams.q> {
        INSTANCE;

        @Override // m3.g
        public void accept(org.reactivestreams.q qVar) {
            qVar.request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class i<T, S> implements m3.c<S, io.reactivex.rxjava3.core.k<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final m3.b<S, io.reactivex.rxjava3.core.k<T>> f17151a;

        i(m3.b<S, io.reactivex.rxjava3.core.k<T>> bVar) {
            this.f17151a = bVar;
        }

        @Override // m3.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s5, io.reactivex.rxjava3.core.k<T> kVar) throws Throwable {
            this.f17151a.accept(s5, kVar);
            return s5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class j<T, S> implements m3.c<S, io.reactivex.rxjava3.core.k<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final m3.g<io.reactivex.rxjava3.core.k<T>> f17152a;

        j(m3.g<io.reactivex.rxjava3.core.k<T>> gVar) {
            this.f17152a = gVar;
        }

        @Override // m3.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s5, io.reactivex.rxjava3.core.k<T> kVar) throws Throwable {
            this.f17152a.accept(kVar);
            return s5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class k<T> implements m3.a {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<T> f17153a;

        k(org.reactivestreams.p<T> pVar) {
            this.f17153a = pVar;
        }

        @Override // m3.a
        public void run() {
            this.f17153a.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class l<T> implements m3.g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<T> f17154a;

        l(org.reactivestreams.p<T> pVar) {
            this.f17154a = pVar;
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            this.f17154a.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class m<T> implements m3.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<T> f17155a;

        m(org.reactivestreams.p<T> pVar) {
            this.f17155a = pVar;
        }

        @Override // m3.g
        public void accept(T t5) {
            this.f17155a.onNext(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class n<T> implements m3.s<io.reactivex.rxjava3.flowables.a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.o<T> f17156a;

        /* renamed from: b, reason: collision with root package name */
        private final long f17157b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f17158c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.q0 f17159d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f17160e;

        n(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            this.f17156a = oVar;
            this.f17157b = j5;
            this.f17158c = timeUnit;
            this.f17159d = q0Var;
            this.f17160e = z4;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.flowables.a<T> get() {
            return this.f17156a.M5(this.f17157b, this.f17158c, this.f17159d, this.f17160e);
        }
    }

    private x1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> m3.o<T, org.reactivestreams.o<U>> a(m3.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> m3.o<T, org.reactivestreams.o<R>> b(m3.o<? super T, ? extends org.reactivestreams.o<? extends U>> oVar, m3.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> m3.o<T, org.reactivestreams.o<T>> c(m3.o<? super T, ? extends org.reactivestreams.o<U>> oVar) {
        return new f(oVar);
    }

    public static <T> m3.s<io.reactivex.rxjava3.flowables.a<T>> d(io.reactivex.rxjava3.core.o<T> oVar) {
        return new g(oVar);
    }

    public static <T> m3.s<io.reactivex.rxjava3.flowables.a<T>> e(io.reactivex.rxjava3.core.o<T> oVar, int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        return new b(oVar, i5, j5, timeUnit, q0Var, z4);
    }

    public static <T> m3.s<io.reactivex.rxjava3.flowables.a<T>> f(io.reactivex.rxjava3.core.o<T> oVar, int i5, boolean z4) {
        return new a(oVar, i5, z4);
    }

    public static <T> m3.s<io.reactivex.rxjava3.flowables.a<T>> g(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        return new n(oVar, j5, timeUnit, q0Var, z4);
    }

    public static <T, S> m3.c<S, io.reactivex.rxjava3.core.k<T>, S> h(m3.b<S, io.reactivex.rxjava3.core.k<T>> bVar) {
        return new i(bVar);
    }

    public static <T, S> m3.c<S, io.reactivex.rxjava3.core.k<T>, S> i(m3.g<io.reactivex.rxjava3.core.k<T>> gVar) {
        return new j(gVar);
    }

    public static <T> m3.a j(org.reactivestreams.p<T> pVar) {
        return new k(pVar);
    }

    public static <T> m3.g<Throwable> k(org.reactivestreams.p<T> pVar) {
        return new l(pVar);
    }

    public static <T> m3.g<T> l(org.reactivestreams.p<T> pVar) {
        return new m(pVar);
    }
}
