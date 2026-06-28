package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes4.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    private static final m1 f19420a;

    /* renamed from: b, reason: collision with root package name */
    static final String f19421b = " (Kotlin reflection is not available)";

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.d[] f19422c;

    static {
        m1 m1Var = null;
        try {
            m1Var = (m1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (m1Var == null) {
            m1Var = new m1();
        }
        f19420a = m1Var;
        f19422c = new kotlin.reflect.d[0];
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s A(Class cls) {
        return f19420a.s(d(cls), Collections.emptyList(), false);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s B(Class cls, kotlin.reflect.u uVar) {
        return f19420a.s(d(cls), Collections.singletonList(uVar), false);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s C(Class cls, kotlin.reflect.u uVar, kotlin.reflect.u uVar2) {
        return f19420a.s(d(cls), Arrays.asList(uVar, uVar2), false);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s D(Class cls, kotlin.reflect.u... uVarArr) {
        return f19420a.s(d(cls), kotlin.collections.l.Jy(uVarArr), false);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s E(kotlin.reflect.g gVar) {
        return f19420a.s(gVar, Collections.emptyList(), false);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.t F(Object obj, String str, kotlin.reflect.v vVar, boolean z4) {
        return f19420a.t(obj, str, vVar, z4);
    }

    public static kotlin.reflect.d a(Class cls) {
        return f19420a.a(cls);
    }

    public static kotlin.reflect.d b(Class cls, String str) {
        return f19420a.b(cls, str);
    }

    public static kotlin.reflect.i c(g0 g0Var) {
        return f19420a.c(g0Var);
    }

    public static kotlin.reflect.d d(Class cls) {
        return f19420a.d(cls);
    }

    public static kotlin.reflect.d e(Class cls, String str) {
        return f19420a.e(cls, str);
    }

    public static kotlin.reflect.d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f19422c;
        }
        kotlin.reflect.d[] dVarArr = new kotlin.reflect.d[length];
        for (int i5 = 0; i5 < length; i5++) {
            dVarArr[i5] = d(clsArr[i5]);
        }
        return dVarArr;
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.h g(Class cls) {
        return f19420a.f(cls, "");
    }

    public static kotlin.reflect.h h(Class cls, String str) {
        return f19420a.f(cls, str);
    }

    @kotlin.g1(version = "1.6")
    public static kotlin.reflect.s i(kotlin.reflect.s sVar) {
        return f19420a.g(sVar);
    }

    public static kotlin.reflect.k j(u0 u0Var) {
        return f19420a.h(u0Var);
    }

    public static kotlin.reflect.l k(w0 w0Var) {
        return f19420a.i(w0Var);
    }

    public static kotlin.reflect.m l(y0 y0Var) {
        return f19420a.j(y0Var);
    }

    @kotlin.g1(version = "1.6")
    public static kotlin.reflect.s m(kotlin.reflect.s sVar) {
        return f19420a.k(sVar);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s n(Class cls) {
        return f19420a.s(d(cls), Collections.emptyList(), true);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s o(Class cls, kotlin.reflect.u uVar) {
        return f19420a.s(d(cls), Collections.singletonList(uVar), true);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s p(Class cls, kotlin.reflect.u uVar, kotlin.reflect.u uVar2) {
        return f19420a.s(d(cls), Arrays.asList(uVar, uVar2), true);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s q(Class cls, kotlin.reflect.u... uVarArr) {
        return f19420a.s(d(cls), kotlin.collections.l.Jy(uVarArr), true);
    }

    @kotlin.g1(version = "1.4")
    public static kotlin.reflect.s r(kotlin.reflect.g gVar) {
        return f19420a.s(gVar, Collections.emptyList(), true);
    }

    @kotlin.g1(version = "1.6")
    public static kotlin.reflect.s s(kotlin.reflect.s sVar, kotlin.reflect.s sVar2) {
        return f19420a.l(sVar, sVar2);
    }

    public static kotlin.reflect.p t(d1 d1Var) {
        return f19420a.m(d1Var);
    }

    public static kotlin.reflect.q u(f1 f1Var) {
        return f19420a.n(f1Var);
    }

    public static kotlin.reflect.r v(h1 h1Var) {
        return f19420a.o(h1Var);
    }

    @kotlin.g1(version = "1.3")
    public static String w(e0 e0Var) {
        return f19420a.p(e0Var);
    }

    @kotlin.g1(version = "1.1")
    public static String x(n0 n0Var) {
        return f19420a.q(n0Var);
    }

    @kotlin.g1(version = "1.4")
    public static void y(kotlin.reflect.t tVar, kotlin.reflect.s sVar) {
        f19420a.r(tVar, Collections.singletonList(sVar));
    }

    @kotlin.g1(version = "1.4")
    public static void z(kotlin.reflect.t tVar, kotlin.reflect.s... sVarArr) {
        f19420a.r(tVar, kotlin.collections.l.Jy(sVarArr));
    }
}
