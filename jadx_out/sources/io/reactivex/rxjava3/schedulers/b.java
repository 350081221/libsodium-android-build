package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.internal.schedulers.p;
import io.reactivex.rxjava3.internal.schedulers.r;
import io.reactivex.rxjava3.internal.schedulers.s;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.f
    static final q0 f18837a = io.reactivex.rxjava3.plugins.a.J(new h());

    /* renamed from: b, reason: collision with root package name */
    @l3.f
    static final q0 f18838b = io.reactivex.rxjava3.plugins.a.G(new C0534b());

    /* renamed from: c, reason: collision with root package name */
    @l3.f
    static final q0 f18839c = io.reactivex.rxjava3.plugins.a.H(new c());

    /* renamed from: d, reason: collision with root package name */
    @l3.f
    static final q0 f18840d = s.t();

    /* renamed from: e, reason: collision with root package name */
    @l3.f
    static final q0 f18841e = io.reactivex.rxjava3.plugins.a.I(new f());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final q0 f18842a = new io.reactivex.rxjava3.internal.schedulers.b();

        a() {
        }
    }

    /* renamed from: io.reactivex.rxjava3.schedulers.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0534b implements m3.s<q0> {
        C0534b() {
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 get() {
            return a.f18842a;
        }
    }

    /* loaded from: classes3.dex */
    static final class c implements m3.s<q0> {
        c() {
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 get() {
            return d.f18843a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        static final q0 f18843a = new io.reactivex.rxjava3.internal.schedulers.g();

        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        static final q0 f18844a = new io.reactivex.rxjava3.internal.schedulers.h();

        e() {
        }
    }

    /* loaded from: classes3.dex */
    static final class f implements m3.s<q0> {
        f() {
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 get() {
            return e.f18844a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        static final q0 f18845a = new r();

        g() {
        }
    }

    /* loaded from: classes3.dex */
    static final class h implements m3.s<q0> {
        h() {
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 get() {
            return g.f18845a;
        }
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    @l3.f
    public static q0 a() {
        return io.reactivex.rxjava3.plugins.a.X(f18838b);
    }

    @l3.f
    public static q0 b(@l3.f Executor executor) {
        return new io.reactivex.rxjava3.internal.schedulers.d(executor, false, false);
    }

    @l3.f
    public static q0 c(@l3.f Executor executor, boolean z4) {
        return new io.reactivex.rxjava3.internal.schedulers.d(executor, z4, false);
    }

    @l3.f
    public static q0 d(@l3.f Executor executor, boolean z4, boolean z5) {
        return new io.reactivex.rxjava3.internal.schedulers.d(executor, z4, z5);
    }

    @l3.f
    public static q0 e() {
        return io.reactivex.rxjava3.plugins.a.Z(f18839c);
    }

    @l3.f
    public static q0 f() {
        return io.reactivex.rxjava3.plugins.a.a0(f18841e);
    }

    public static void g() {
        a().q();
        e().q();
        f().q();
        h().q();
        j().q();
        p.d();
    }

    @l3.f
    public static q0 h() {
        return io.reactivex.rxjava3.plugins.a.c0(f18837a);
    }

    public static void i() {
        a().r();
        e().r();
        f().r();
        h().r();
        j().r();
        p.e();
    }

    @l3.f
    public static q0 j() {
        return f18840d;
    }
}
