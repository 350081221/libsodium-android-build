package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.core.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final m3.o<Object, Object> f16249a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f16250b = new r();

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f16251c = new o();

    /* renamed from: d, reason: collision with root package name */
    static final m3.g<Object> f16252d = new p();

    /* renamed from: e, reason: collision with root package name */
    public static final m3.g<Throwable> f16253e = new t();

    /* renamed from: f, reason: collision with root package name */
    public static final m3.g<Throwable> f16254f = new g0();

    /* renamed from: g, reason: collision with root package name */
    public static final m3.q f16255g = new q();

    /* renamed from: h, reason: collision with root package name */
    static final m3.r<Object> f16256h = new l0();

    /* renamed from: i, reason: collision with root package name */
    static final m3.r<Object> f16257i = new u();

    /* renamed from: j, reason: collision with root package name */
    static final m3.s<Object> f16258j = new f0();

    /* renamed from: k, reason: collision with root package name */
    public static final m3.g<org.reactivestreams.q> f16259k = new a0();

    /* renamed from: io.reactivex.rxjava3.internal.functions.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0453a<T> implements m3.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final m3.a f16260a;

        C0453a(m3.a aVar) {
            this.f16260a = aVar;
        }

        @Override // m3.g
        public void accept(T t5) throws Throwable {
            this.f16260a.run();
        }
    }

    /* loaded from: classes3.dex */
    static final class a0 implements m3.g<org.reactivestreams.q> {
        a0() {
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(org.reactivestreams.q qVar) {
            qVar.request(Long.MAX_VALUE);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T1, T2, R> implements m3.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final m3.c<? super T1, ? super T2, ? extends R> f16261a;

        b(m3.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f16261a = cVar;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 2) {
                return this.f16261a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    enum b0 implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T1, T2, T3, R> implements m3.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final m3.h<T1, T2, T3, R> f16262a;

        c(m3.h<T1, T2, T3, R> hVar) {
            this.f16262a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 3) {
                return (R) this.f16262a.a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    static final class c0<T> implements m3.a {

        /* renamed from: a, reason: collision with root package name */
        final m3.g<? super io.reactivex.rxjava3.core.f0<T>> f16263a;

        c0(m3.g<? super io.reactivex.rxjava3.core.f0<T>> gVar) {
            this.f16263a = gVar;
        }

        @Override // m3.a
        public void run() throws Throwable {
            this.f16263a.accept(io.reactivex.rxjava3.core.f0.a());
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T1, T2, T3, T4, R> implements m3.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final m3.i<T1, T2, T3, T4, R> f16264a;

        d(m3.i<T1, T2, T3, T4, R> iVar) {
            this.f16264a = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 4) {
                return (R) this.f16264a.a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    static final class d0<T> implements m3.g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final m3.g<? super io.reactivex.rxjava3.core.f0<T>> f16265a;

        d0(m3.g<? super io.reactivex.rxjava3.core.f0<T>> gVar) {
            this.f16265a = gVar;
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Throwable {
            this.f16265a.accept(io.reactivex.rxjava3.core.f0.b(th));
        }
    }

    /* loaded from: classes3.dex */
    static final class e<T1, T2, T3, T4, T5, R> implements m3.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.j<T1, T2, T3, T4, T5, R> f16266a;

        e(m3.j<T1, T2, T3, T4, T5, R> jVar) {
            this.f16266a = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 5) {
                return (R) this.f16266a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    static final class e0<T> implements m3.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final m3.g<? super io.reactivex.rxjava3.core.f0<T>> f16267a;

        e0(m3.g<? super io.reactivex.rxjava3.core.f0<T>> gVar) {
            this.f16267a = gVar;
        }

        @Override // m3.g
        public void accept(T t5) throws Throwable {
            this.f16267a.accept(io.reactivex.rxjava3.core.f0.c(t5));
        }
    }

    /* loaded from: classes3.dex */
    static final class f<T1, T2, T3, T4, T5, T6, R> implements m3.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final m3.k<T1, T2, T3, T4, T5, T6, R> f16268a;

        f(m3.k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f16268a = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 6) {
                return (R) this.f16268a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    static final class f0 implements m3.s<Object> {
        f0() {
        }

        @Override // m3.s
        public Object get() {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements m3.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final m3.l<T1, T2, T3, T4, T5, T6, T7, R> f16269a;

        g(m3.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
            this.f16269a = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 7) {
                return (R) this.f16269a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
            throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    static final class g0 implements m3.g<Throwable> {
        g0() {
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.d(th));
        }
    }

    /* loaded from: classes3.dex */
    static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements m3.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final m3.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f16270a;

        h(m3.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
            this.f16270a = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 8) {
                return (R) this.f16270a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    static final class h0<T> implements m3.o<T, io.reactivex.rxjava3.schedulers.d<T>> {

        /* renamed from: a, reason: collision with root package name */
        final TimeUnit f16271a;

        /* renamed from: b, reason: collision with root package name */
        final q0 f16272b;

        h0(TimeUnit timeUnit, q0 q0Var) {
            this.f16271a = timeUnit;
            this.f16272b = q0Var;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.schedulers.d<T> apply(T t5) {
            return new io.reactivex.rxjava3.schedulers.d<>(t5, this.f16272b.d(this.f16271a), this.f16271a);
        }
    }

    /* loaded from: classes3.dex */
    static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements m3.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final m3.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f16273a;

        i(m3.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
            this.f16273a = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 9) {
                return (R) this.f16273a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes3.dex */
    static final class i0<K, T> implements m3.b<Map<K, T>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.o<? super T, ? extends K> f16274a;

        i0(m3.o<? super T, ? extends K> oVar) {
            this.f16274a = oVar;
        }

        @Override // m3.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> map, T t5) throws Throwable {
            map.put(this.f16274a.apply(t5), t5);
        }
    }

    /* loaded from: classes3.dex */
    static final class j<T> implements m3.s<List<T>> {

        /* renamed from: a, reason: collision with root package name */
        final int f16275a;

        j(int i5) {
            this.f16275a = i5;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> get() {
            return new ArrayList(this.f16275a);
        }
    }

    /* loaded from: classes3.dex */
    static final class j0<K, V, T> implements m3.b<Map<K, V>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.o<? super T, ? extends V> f16276a;

        /* renamed from: b, reason: collision with root package name */
        private final m3.o<? super T, ? extends K> f16277b;

        j0(m3.o<? super T, ? extends V> oVar, m3.o<? super T, ? extends K> oVar2) {
            this.f16276a = oVar;
            this.f16277b = oVar2;
        }

        @Override // m3.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> map, T t5) throws Throwable {
            map.put(this.f16277b.apply(t5), this.f16276a.apply(t5));
        }
    }

    /* loaded from: classes3.dex */
    static final class k<T> implements m3.r<T> {

        /* renamed from: a, reason: collision with root package name */
        final m3.e f16278a;

        k(m3.e eVar) {
            this.f16278a = eVar;
        }

        @Override // m3.r
        public boolean test(T t5) throws Throwable {
            return !this.f16278a.getAsBoolean();
        }
    }

    /* loaded from: classes3.dex */
    static final class k0<K, V, T> implements m3.b<Map<K, Collection<V>>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.o<? super K, ? extends Collection<? super V>> f16279a;

        /* renamed from: b, reason: collision with root package name */
        private final m3.o<? super T, ? extends V> f16280b;

        /* renamed from: c, reason: collision with root package name */
        private final m3.o<? super T, ? extends K> f16281c;

        k0(m3.o<? super K, ? extends Collection<? super V>> oVar, m3.o<? super T, ? extends V> oVar2, m3.o<? super T, ? extends K> oVar3) {
            this.f16279a = oVar;
            this.f16280b = oVar2;
            this.f16281c = oVar3;
        }

        @Override // m3.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> map, T t5) throws Throwable {
            K apply = this.f16281c.apply(t5);
            Collection<? super V> collection = (Collection) map.get(apply);
            if (collection == null) {
                collection = this.f16279a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f16280b.apply(t5));
        }
    }

    /* loaded from: classes3.dex */
    public static class l implements m3.g<org.reactivestreams.q> {

        /* renamed from: a, reason: collision with root package name */
        final int f16282a;

        l(int i5) {
            this.f16282a = i5;
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(org.reactivestreams.q qVar) {
            qVar.request(this.f16282a);
        }
    }

    /* loaded from: classes3.dex */
    static final class l0 implements m3.r<Object> {
        l0() {
        }

        @Override // m3.r
        public boolean test(Object obj) {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    static final class m<T, U> implements m3.o<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final Class<U> f16283a;

        m(Class<U> cls) {
            this.f16283a = cls;
        }

        @Override // m3.o
        public U apply(T t5) {
            return this.f16283a.cast(t5);
        }
    }

    /* loaded from: classes3.dex */
    static final class n<T, U> implements m3.r<T> {

        /* renamed from: a, reason: collision with root package name */
        final Class<U> f16284a;

        n(Class<U> cls) {
            this.f16284a = cls;
        }

        @Override // m3.r
        public boolean test(T t5) {
            return this.f16284a.isInstance(t5);
        }
    }

    /* loaded from: classes3.dex */
    static final class o implements m3.a {
        o() {
        }

        @Override // m3.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* loaded from: classes3.dex */
    static final class p implements m3.g<Object> {
        p() {
        }

        @Override // m3.g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* loaded from: classes3.dex */
    static final class q implements m3.q {
        q() {
        }

        @Override // m3.q
        public void a(long j5) {
        }
    }

    /* loaded from: classes3.dex */
    static final class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* loaded from: classes3.dex */
    static final class s<T> implements m3.r<T> {

        /* renamed from: a, reason: collision with root package name */
        final T f16285a;

        s(T t5) {
            this.f16285a = t5;
        }

        @Override // m3.r
        public boolean test(T t5) {
            return Objects.equals(t5, this.f16285a);
        }
    }

    /* loaded from: classes3.dex */
    static final class t implements m3.g<Throwable> {
        t() {
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    /* loaded from: classes3.dex */
    static final class u implements m3.r<Object> {
        u() {
        }

        @Override // m3.r
        public boolean test(Object obj) {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class v implements m3.a {

        /* renamed from: a, reason: collision with root package name */
        final Future<?> f16286a;

        v(Future<?> future) {
            this.f16286a = future;
        }

        @Override // m3.a
        public void run() throws Exception {
            this.f16286a.get();
        }
    }

    /* loaded from: classes3.dex */
    enum w implements m3.s<Set<Object>> {
        INSTANCE;

        @Override // m3.s
        public Set<Object> get() {
            return new HashSet();
        }
    }

    /* loaded from: classes3.dex */
    static final class x implements m3.o<Object, Object> {
        x() {
        }

        @Override // m3.o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* loaded from: classes3.dex */
    static final class y<T, U> implements Callable<U>, m3.s<U>, m3.o<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final U f16287a;

        y(U u4) {
            this.f16287a = u4;
        }

        @Override // m3.o
        public U apply(T t5) {
            return this.f16287a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.f16287a;
        }

        @Override // m3.s
        public U get() {
            return this.f16287a;
        }
    }

    /* loaded from: classes3.dex */
    static final class z<T> implements m3.o<List<T>, List<T>> {

        /* renamed from: a, reason: collision with root package name */
        final Comparator<? super T> f16288a;

        z(Comparator<? super T> comparator) {
            this.f16288a = comparator;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f16288a);
            return list;
        }
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }

    @l3.f
    public static <T1, T2, T3, T4, T5, R> m3.o<Object[], R> A(@l3.f m3.j<T1, T2, T3, T4, T5, R> jVar) {
        return new e(jVar);
    }

    @l3.f
    public static <T1, T2, T3, T4, T5, T6, R> m3.o<Object[], R> B(@l3.f m3.k<T1, T2, T3, T4, T5, T6, R> kVar) {
        return new f(kVar);
    }

    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, R> m3.o<Object[], R> C(@l3.f m3.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        return new g(lVar);
    }

    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> m3.o<Object[], R> D(@l3.f m3.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        return new h(mVar);
    }

    @l3.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> m3.o<Object[], R> E(@l3.f m3.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        return new i(nVar);
    }

    public static <T, K> m3.b<Map<K, T>, T> F(m3.o<? super T, ? extends K> oVar) {
        return new i0(oVar);
    }

    public static <T, K, V> m3.b<Map<K, V>, T> G(m3.o<? super T, ? extends K> oVar, m3.o<? super T, ? extends V> oVar2) {
        return new j0(oVar2, oVar);
    }

    public static <T, K, V> m3.b<Map<K, Collection<V>>, T> H(m3.o<? super T, ? extends K> oVar, m3.o<? super T, ? extends V> oVar2, m3.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new k0(oVar3, oVar2, oVar);
    }

    public static <T> m3.g<T> a(m3.a aVar) {
        return new C0453a(aVar);
    }

    @l3.f
    public static <T> m3.r<T> b() {
        return (m3.r<T>) f16257i;
    }

    @l3.f
    public static <T> m3.r<T> c() {
        return (m3.r<T>) f16256h;
    }

    public static <T> m3.g<T> d(int i5) {
        return new l(i5);
    }

    @l3.f
    public static <T, U> m3.o<T, U> e(@l3.f Class<U> cls) {
        return new m(cls);
    }

    public static <T> m3.s<List<T>> f(int i5) {
        return new j(i5);
    }

    public static <T> m3.s<Set<T>> g() {
        return w.INSTANCE;
    }

    public static <T> m3.g<T> h() {
        return (m3.g<T>) f16252d;
    }

    public static <T> m3.r<T> i(T t5) {
        return new s(t5);
    }

    @l3.f
    public static m3.a j(@l3.f Future<?> future) {
        return new v(future);
    }

    @l3.f
    public static <T> m3.o<T, T> k() {
        return (m3.o<T, T>) f16249a;
    }

    public static <T, U> m3.r<T> l(Class<U> cls) {
        return new n(cls);
    }

    @l3.f
    public static <T> Callable<T> m(@l3.f T t5) {
        return new y(t5);
    }

    @l3.f
    public static <T, U> m3.o<T, U> n(@l3.f U u4) {
        return new y(u4);
    }

    @l3.f
    public static <T> m3.s<T> o(@l3.f T t5) {
        return new y(t5);
    }

    public static <T> m3.o<List<T>, List<T>> p(Comparator<? super T> comparator) {
        return new z(comparator);
    }

    public static <T> Comparator<T> q() {
        return b0.INSTANCE;
    }

    public static <T> m3.a r(m3.g<? super io.reactivex.rxjava3.core.f0<T>> gVar) {
        return new c0(gVar);
    }

    public static <T> m3.g<Throwable> s(m3.g<? super io.reactivex.rxjava3.core.f0<T>> gVar) {
        return new d0(gVar);
    }

    public static <T> m3.g<T> t(m3.g<? super io.reactivex.rxjava3.core.f0<T>> gVar) {
        return new e0(gVar);
    }

    @l3.f
    public static <T> m3.s<T> u() {
        return (m3.s<T>) f16258j;
    }

    public static <T> m3.r<T> v(m3.e eVar) {
        return new k(eVar);
    }

    public static <T> m3.o<T, io.reactivex.rxjava3.schedulers.d<T>> w(TimeUnit timeUnit, q0 q0Var) {
        return new h0(timeUnit, q0Var);
    }

    @l3.f
    public static <T1, T2, R> m3.o<Object[], R> x(@l3.f m3.c<? super T1, ? super T2, ? extends R> cVar) {
        return new b(cVar);
    }

    @l3.f
    public static <T1, T2, T3, R> m3.o<Object[], R> y(@l3.f m3.h<T1, T2, T3, R> hVar) {
        return new c(hVar);
    }

    @l3.f
    public static <T1, T2, T3, T4, R> m3.o<Object[], R> z(@l3.f m3.i<T1, T2, T3, T4, R> iVar) {
        return new d(iVar);
    }
}
