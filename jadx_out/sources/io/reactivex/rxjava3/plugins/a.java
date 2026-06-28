package io.reactivex.rxjava3.plugins;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.c;
import io.reactivex.rxjava3.core.f;
import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.exceptions.d;
import io.reactivex.rxjava3.internal.schedulers.h;
import io.reactivex.rxjava3.internal.schedulers.r;
import io.reactivex.rxjava3.internal.util.k;
import io.reactivex.rxjava3.parallel.b;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import l3.g;
import m3.e;
import m3.o;
import m3.s;
import org.reactivestreams.p;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @g
    static volatile m3.g<? super Throwable> f18739a;

    /* renamed from: b, reason: collision with root package name */
    @g
    static volatile o<? super Runnable, ? extends Runnable> f18740b;

    /* renamed from: c, reason: collision with root package name */
    @g
    static volatile o<? super s<q0>, ? extends q0> f18741c;

    /* renamed from: d, reason: collision with root package name */
    @g
    static volatile o<? super s<q0>, ? extends q0> f18742d;

    /* renamed from: e, reason: collision with root package name */
    @g
    static volatile o<? super s<q0>, ? extends q0> f18743e;

    /* renamed from: f, reason: collision with root package name */
    @g
    static volatile o<? super s<q0>, ? extends q0> f18744f;

    /* renamed from: g, reason: collision with root package name */
    @g
    static volatile o<? super q0, ? extends q0> f18745g;

    /* renamed from: h, reason: collision with root package name */
    @g
    static volatile o<? super q0, ? extends q0> f18746h;

    /* renamed from: i, reason: collision with root package name */
    @g
    static volatile o<? super q0, ? extends q0> f18747i;

    /* renamed from: j, reason: collision with root package name */
    @g
    static volatile o<? super q0, ? extends q0> f18748j;

    /* renamed from: k, reason: collision with root package name */
    @g
    static volatile o<? super io.reactivex.rxjava3.core.o, ? extends io.reactivex.rxjava3.core.o> f18749k;

    /* renamed from: l, reason: collision with root package name */
    @g
    static volatile o<? super io.reactivex.rxjava3.flowables.a, ? extends io.reactivex.rxjava3.flowables.a> f18750l;

    /* renamed from: m, reason: collision with root package name */
    @g
    static volatile o<? super i0, ? extends i0> f18751m;

    /* renamed from: n, reason: collision with root package name */
    @g
    static volatile o<? super io.reactivex.rxjava3.observables.a, ? extends io.reactivex.rxjava3.observables.a> f18752n;

    /* renamed from: o, reason: collision with root package name */
    @g
    static volatile o<? super x, ? extends x> f18753o;

    /* renamed from: p, reason: collision with root package name */
    @g
    static volatile o<? super r0, ? extends r0> f18754p;

    /* renamed from: q, reason: collision with root package name */
    @g
    static volatile o<? super c, ? extends c> f18755q;

    /* renamed from: r, reason: collision with root package name */
    @g
    static volatile o<? super b, ? extends b> f18756r;

    /* renamed from: s, reason: collision with root package name */
    @g
    static volatile m3.c<? super io.reactivex.rxjava3.core.o, ? super p, ? extends p> f18757s;

    /* renamed from: t, reason: collision with root package name */
    @g
    static volatile m3.c<? super x, ? super a0, ? extends a0> f18758t;

    /* renamed from: u, reason: collision with root package name */
    @g
    static volatile m3.c<? super i0, ? super p0, ? extends p0> f18759u;

    /* renamed from: v, reason: collision with root package name */
    @g
    static volatile m3.c<? super r0, ? super u0, ? extends u0> f18760v;

    /* renamed from: w, reason: collision with root package name */
    @g
    static volatile m3.c<? super c, ? super f, ? extends f> f18761w;

    /* renamed from: x, reason: collision with root package name */
    @g
    static volatile e f18762x;

    /* renamed from: y, reason: collision with root package name */
    static volatile boolean f18763y;

    /* renamed from: z, reason: collision with root package name */
    static volatile boolean f18764z;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    @g
    public static m3.c<? super i0, ? super p0, ? extends p0> A() {
        return f18759u;
    }

    public static void A0(@g m3.c<? super x, a0, ? extends a0> cVar) {
        if (!f18763y) {
            f18758t = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super b, ? extends b> B() {
        return f18756r;
    }

    public static void B0(@g o<? super i0, ? extends i0> oVar) {
        if (!f18763y) {
            f18751m = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super r0, ? extends r0> C() {
        return f18754p;
    }

    public static void C0(@g m3.c<? super i0, ? super p0, ? extends p0> cVar) {
        if (!f18763y) {
            f18759u = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static m3.c<? super r0, ? super u0, ? extends u0> D() {
        return f18760v;
    }

    public static void D0(@g o<? super b, ? extends b> oVar) {
        if (!f18763y) {
            f18756r = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super Runnable, ? extends Runnable> E() {
        return f18740b;
    }

    public static void E0(@g o<? super r0, ? extends r0> oVar) {
        if (!f18763y) {
            f18754p = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super q0, ? extends q0> F() {
        return f18746h;
    }

    public static void F0(@g m3.c<? super r0, ? super u0, ? extends u0> cVar) {
        if (!f18763y) {
            f18760v = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @l3.f
    public static q0 G(@l3.f s<q0> sVar) {
        Objects.requireNonNull(sVar, "Scheduler Supplier can't be null");
        o<? super s<q0>, ? extends q0> oVar = f18741c;
        if (oVar == null) {
            return d(sVar);
        }
        return c(oVar, sVar);
    }

    public static void G0(@g o<? super Runnable, ? extends Runnable> oVar) {
        if (!f18763y) {
            f18740b = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @l3.f
    public static q0 H(@l3.f s<q0> sVar) {
        Objects.requireNonNull(sVar, "Scheduler Supplier can't be null");
        o<? super s<q0>, ? extends q0> oVar = f18743e;
        if (oVar == null) {
            return d(sVar);
        }
        return c(oVar, sVar);
    }

    public static void H0(@g o<? super q0, ? extends q0> oVar) {
        if (!f18763y) {
            f18746h = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @l3.f
    public static q0 I(@l3.f s<q0> sVar) {
        Objects.requireNonNull(sVar, "Scheduler Supplier can't be null");
        o<? super s<q0>, ? extends q0> oVar = f18744f;
        if (oVar == null) {
            return d(sVar);
        }
        return c(oVar, sVar);
    }

    static void I0(@l3.f Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @l3.f
    public static q0 J(@l3.f s<q0> sVar) {
        Objects.requireNonNull(sVar, "Scheduler Supplier can't be null");
        o<? super s<q0>, ? extends q0> oVar = f18742d;
        if (oVar == null) {
            return d(sVar);
        }
        return c(oVar, sVar);
    }

    static void J0() {
        f18763y = false;
    }

    static boolean K(Throwable th) {
        if ((th instanceof d) || (th instanceof io.reactivex.rxjava3.exceptions.c) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof io.reactivex.rxjava3.exceptions.a)) {
            return true;
        }
        return false;
    }

    public static boolean L() {
        return f18764z;
    }

    public static boolean M() {
        return f18763y;
    }

    public static void N() {
        f18763y = true;
    }

    @l3.f
    public static c O(@l3.f c cVar) {
        o<? super c, ? extends c> oVar = f18755q;
        if (oVar != null) {
            return (c) b(oVar, cVar);
        }
        return cVar;
    }

    @l3.f
    public static <T> io.reactivex.rxjava3.core.o<T> P(@l3.f io.reactivex.rxjava3.core.o<T> oVar) {
        o<? super io.reactivex.rxjava3.core.o, ? extends io.reactivex.rxjava3.core.o> oVar2 = f18749k;
        if (oVar2 != null) {
            return (io.reactivex.rxjava3.core.o) b(oVar2, oVar);
        }
        return oVar;
    }

    @l3.f
    public static <T> x<T> Q(@l3.f x<T> xVar) {
        o<? super x, ? extends x> oVar = f18753o;
        if (oVar != null) {
            return (x) b(oVar, xVar);
        }
        return xVar;
    }

    @l3.f
    public static <T> i0<T> R(@l3.f i0<T> i0Var) {
        o<? super i0, ? extends i0> oVar = f18751m;
        if (oVar != null) {
            return (i0) b(oVar, i0Var);
        }
        return i0Var;
    }

    @l3.f
    public static <T> r0<T> S(@l3.f r0<T> r0Var) {
        o<? super r0, ? extends r0> oVar = f18754p;
        if (oVar != null) {
            return (r0) b(oVar, r0Var);
        }
        return r0Var;
    }

    @l3.f
    public static <T> io.reactivex.rxjava3.flowables.a<T> T(@l3.f io.reactivex.rxjava3.flowables.a<T> aVar) {
        o<? super io.reactivex.rxjava3.flowables.a, ? extends io.reactivex.rxjava3.flowables.a> oVar = f18750l;
        if (oVar != null) {
            return (io.reactivex.rxjava3.flowables.a) b(oVar, aVar);
        }
        return aVar;
    }

    @l3.f
    public static <T> io.reactivex.rxjava3.observables.a<T> U(@l3.f io.reactivex.rxjava3.observables.a<T> aVar) {
        o<? super io.reactivex.rxjava3.observables.a, ? extends io.reactivex.rxjava3.observables.a> oVar = f18752n;
        if (oVar != null) {
            return (io.reactivex.rxjava3.observables.a) b(oVar, aVar);
        }
        return aVar;
    }

    @l3.f
    public static <T> b<T> V(@l3.f b<T> bVar) {
        o<? super b, ? extends b> oVar = f18756r;
        if (oVar != null) {
            return (b) b(oVar, bVar);
        }
        return bVar;
    }

    public static boolean W() {
        e eVar = f18762x;
        if (eVar != null) {
            try {
                return eVar.getAsBoolean();
            } catch (Throwable th) {
                throw k.i(th);
            }
        }
        return false;
    }

    @l3.f
    public static q0 X(@l3.f q0 q0Var) {
        o<? super q0, ? extends q0> oVar = f18745g;
        if (oVar == null) {
            return q0Var;
        }
        return (q0) b(oVar, q0Var);
    }

    public static void Y(@l3.f Throwable th) {
        m3.g<? super Throwable> gVar = f18739a;
        if (th == null) {
            th = k.b("onError called with a null Throwable.");
        } else if (!K(th)) {
            th = new io.reactivex.rxjava3.exceptions.f(th);
        }
        if (gVar != null) {
            try {
                gVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                I0(th2);
            }
        }
        th.printStackTrace();
        I0(th);
    }

    @l3.f
    public static q0 Z(@l3.f q0 q0Var) {
        o<? super q0, ? extends q0> oVar = f18747i;
        if (oVar == null) {
            return q0Var;
        }
        return (q0) b(oVar, q0Var);
    }

    @l3.f
    static <T, U, R> R a(@l3.f m3.c<T, U, R> cVar, @l3.f T t5, @l3.f U u4) {
        try {
            return cVar.apply(t5, u4);
        } catch (Throwable th) {
            throw k.i(th);
        }
    }

    @l3.f
    public static q0 a0(@l3.f q0 q0Var) {
        o<? super q0, ? extends q0> oVar = f18748j;
        if (oVar == null) {
            return q0Var;
        }
        return (q0) b(oVar, q0Var);
    }

    @l3.f
    static <T, R> R b(@l3.f o<T, R> oVar, @l3.f T t5) {
        try {
            return oVar.apply(t5);
        } catch (Throwable th) {
            throw k.i(th);
        }
    }

    @l3.f
    public static Runnable b0(@l3.f Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f18740b;
        if (oVar == null) {
            return runnable;
        }
        return (Runnable) b(oVar, runnable);
    }

    @l3.f
    static q0 c(@l3.f o<? super s<q0>, ? extends q0> oVar, s<q0> sVar) {
        Object b5 = b(oVar, sVar);
        Objects.requireNonNull(b5, "Scheduler Supplier result can't be null");
        return (q0) b5;
    }

    @l3.f
    public static q0 c0(@l3.f q0 q0Var) {
        o<? super q0, ? extends q0> oVar = f18746h;
        if (oVar == null) {
            return q0Var;
        }
        return (q0) b(oVar, q0Var);
    }

    @l3.f
    static q0 d(@l3.f s<q0> sVar) {
        try {
            q0 q0Var = sVar.get();
            Objects.requireNonNull(q0Var, "Scheduler Supplier result can't be null");
            return q0Var;
        } catch (Throwable th) {
            throw k.i(th);
        }
    }

    @l3.f
    public static f d0(@l3.f c cVar, @l3.f f fVar) {
        m3.c<? super c, ? super f, ? extends f> cVar2 = f18761w;
        if (cVar2 != null) {
            return (f) a(cVar2, cVar, fVar);
        }
        return fVar;
    }

    @l3.f
    public static q0 e(@l3.f ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new io.reactivex.rxjava3.internal.schedulers.b(threadFactory);
    }

    @l3.f
    public static <T> a0<? super T> e0(@l3.f x<T> xVar, @l3.f a0<? super T> a0Var) {
        m3.c<? super x, ? super a0, ? extends a0> cVar = f18758t;
        if (cVar != null) {
            return (a0) a(cVar, xVar, a0Var);
        }
        return a0Var;
    }

    @l3.f
    public static q0 f(@l3.f ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new io.reactivex.rxjava3.internal.schedulers.g(threadFactory);
    }

    @l3.f
    public static <T> p0<? super T> f0(@l3.f i0<T> i0Var, @l3.f p0<? super T> p0Var) {
        m3.c<? super i0, ? super p0, ? extends p0> cVar = f18759u;
        if (cVar != null) {
            return (p0) a(cVar, i0Var, p0Var);
        }
        return p0Var;
    }

    @l3.f
    public static q0 g(@l3.f ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new h(threadFactory);
    }

    @l3.f
    public static <T> u0<? super T> g0(@l3.f r0<T> r0Var, @l3.f u0<? super T> u0Var) {
        m3.c<? super r0, ? super u0, ? extends u0> cVar = f18760v;
        if (cVar != null) {
            return (u0) a(cVar, r0Var, u0Var);
        }
        return u0Var;
    }

    @l3.f
    public static q0 h(@l3.f ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new r(threadFactory);
    }

    @l3.f
    public static <T> p<? super T> h0(@l3.f io.reactivex.rxjava3.core.o<T> oVar, @l3.f p<? super T> pVar) {
        m3.c<? super io.reactivex.rxjava3.core.o, ? super p, ? extends p> cVar = f18757s;
        if (cVar != null) {
            return (p) a(cVar, oVar, pVar);
        }
        return pVar;
    }

    @g
    public static o<? super q0, ? extends q0> i() {
        return f18745g;
    }

    public static void i0() {
        k0(null);
        G0(null);
        j0(null);
        m0(null);
        q0(null);
        n0(null);
        H0(null);
        p0(null);
        r0(null);
        o0(null);
        x0(null);
        y0(null);
        B0(null);
        C0(null);
        E0(null);
        F0(null);
        t0(null);
        u0(null);
        v0(null);
        w0(null);
        z0(null);
        A0(null);
        D0(null);
        l0(false);
        s0(null);
    }

    @g
    public static m3.g<? super Throwable> j() {
        return f18739a;
    }

    public static void j0(@g o<? super q0, ? extends q0> oVar) {
        if (!f18763y) {
            f18745g = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s<q0>, ? extends q0> k() {
        return f18741c;
    }

    public static void k0(@g m3.g<? super Throwable> gVar) {
        if (!f18763y) {
            f18739a = gVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s<q0>, ? extends q0> l() {
        return f18743e;
    }

    public static void l0(boolean z4) {
        if (!f18763y) {
            f18764z = z4;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s<q0>, ? extends q0> m() {
        return f18744f;
    }

    public static void m0(@g o<? super s<q0>, ? extends q0> oVar) {
        if (!f18763y) {
            f18741c = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s<q0>, ? extends q0> n() {
        return f18742d;
    }

    public static void n0(@g o<? super s<q0>, ? extends q0> oVar) {
        if (!f18763y) {
            f18743e = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super q0, ? extends q0> o() {
        return f18747i;
    }

    public static void o0(@g o<? super s<q0>, ? extends q0> oVar) {
        if (!f18763y) {
            f18744f = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super q0, ? extends q0> p() {
        return f18748j;
    }

    public static void p0(@g o<? super s<q0>, ? extends q0> oVar) {
        if (!f18763y) {
            f18742d = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static e q() {
        return f18762x;
    }

    public static void q0(@g o<? super q0, ? extends q0> oVar) {
        if (!f18763y) {
            f18747i = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super c, ? extends c> r() {
        return f18755q;
    }

    public static void r0(@g o<? super q0, ? extends q0> oVar) {
        if (!f18763y) {
            f18748j = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static m3.c<? super c, ? super f, ? extends f> s() {
        return f18761w;
    }

    public static void s0(@g e eVar) {
        if (!f18763y) {
            f18762x = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super io.reactivex.rxjava3.flowables.a, ? extends io.reactivex.rxjava3.flowables.a> t() {
        return f18750l;
    }

    public static void t0(@g o<? super c, ? extends c> oVar) {
        if (!f18763y) {
            f18755q = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super io.reactivex.rxjava3.observables.a, ? extends io.reactivex.rxjava3.observables.a> u() {
        return f18752n;
    }

    public static void u0(@g m3.c<? super c, ? super f, ? extends f> cVar) {
        if (!f18763y) {
            f18761w = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super io.reactivex.rxjava3.core.o, ? extends io.reactivex.rxjava3.core.o> v() {
        return f18749k;
    }

    public static void v0(@g o<? super io.reactivex.rxjava3.flowables.a, ? extends io.reactivex.rxjava3.flowables.a> oVar) {
        if (!f18763y) {
            f18750l = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static m3.c<? super io.reactivex.rxjava3.core.o, ? super p, ? extends p> w() {
        return f18757s;
    }

    public static void w0(@g o<? super io.reactivex.rxjava3.observables.a, ? extends io.reactivex.rxjava3.observables.a> oVar) {
        if (!f18763y) {
            f18752n = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super x, ? extends x> x() {
        return f18753o;
    }

    public static void x0(@g o<? super io.reactivex.rxjava3.core.o, ? extends io.reactivex.rxjava3.core.o> oVar) {
        if (!f18763y) {
            f18749k = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static m3.c<? super x, ? super a0, ? extends a0> y() {
        return f18758t;
    }

    public static void y0(@g m3.c<? super io.reactivex.rxjava3.core.o, ? super p, ? extends p> cVar) {
        if (!f18763y) {
            f18757s = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super i0, ? extends i0> z() {
        return f18751m;
    }

    public static void z0(@g o<? super x, ? extends x> oVar) {
        if (!f18763y) {
            f18753o = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
}
