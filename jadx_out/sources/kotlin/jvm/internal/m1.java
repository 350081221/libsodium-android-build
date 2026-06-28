package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes4.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19424a = "kotlin.jvm.functions.";

    public kotlin.reflect.d a(Class cls) {
        return new u(cls);
    }

    public kotlin.reflect.d b(Class cls, String str) {
        return new u(cls);
    }

    public kotlin.reflect.i c(g0 g0Var) {
        return g0Var;
    }

    public kotlin.reflect.d d(Class cls) {
        return new u(cls);
    }

    public kotlin.reflect.d e(Class cls, String str) {
        return new u(cls);
    }

    public kotlin.reflect.h f(Class cls, String str) {
        return new b1(cls, str);
    }

    @kotlin.g1(version = "1.6")
    public kotlin.reflect.s g(kotlin.reflect.s sVar) {
        w1 w1Var = (w1) sVar;
        return new w1(sVar.n(), sVar.getArguments(), w1Var.B(), w1Var.z() | 2);
    }

    public kotlin.reflect.k h(u0 u0Var) {
        return u0Var;
    }

    public kotlin.reflect.l i(w0 w0Var) {
        return w0Var;
    }

    public kotlin.reflect.m j(y0 y0Var) {
        return y0Var;
    }

    @kotlin.g1(version = "1.6")
    public kotlin.reflect.s k(kotlin.reflect.s sVar) {
        w1 w1Var = (w1) sVar;
        return new w1(sVar.n(), sVar.getArguments(), w1Var.B(), w1Var.z() | 4);
    }

    @kotlin.g1(version = "1.6")
    public kotlin.reflect.s l(kotlin.reflect.s sVar, kotlin.reflect.s sVar2) {
        return new w1(sVar.n(), sVar.getArguments(), sVar2, ((w1) sVar).z());
    }

    public kotlin.reflect.p m(d1 d1Var) {
        return d1Var;
    }

    public kotlin.reflect.q n(f1 f1Var) {
        return f1Var;
    }

    public kotlin.reflect.r o(h1 h1Var) {
        return h1Var;
    }

    @kotlin.g1(version = "1.3")
    public String p(e0 e0Var) {
        String obj = e0Var.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith(f19424a)) {
            return obj.substring(21);
        }
        return obj;
    }

    @kotlin.g1(version = "1.1")
    public String q(n0 n0Var) {
        return p(n0Var);
    }

    @kotlin.g1(version = "1.4")
    public void r(kotlin.reflect.t tVar, List<kotlin.reflect.s> list) {
        ((v1) tVar).j(list);
    }

    @kotlin.g1(version = "1.4")
    public kotlin.reflect.s s(kotlin.reflect.g gVar, List<kotlin.reflect.u> list, boolean z4) {
        return new w1(gVar, list, z4);
    }

    @kotlin.g1(version = "1.4")
    public kotlin.reflect.t t(Object obj, String str, kotlin.reflect.v vVar, boolean z4) {
        return new v1(obj, str, vVar, z4);
    }
}
