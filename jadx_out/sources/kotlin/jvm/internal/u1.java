package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import w3.g;

/* loaded from: classes4.dex */
public class u1 {
    public static int A(Object obj) {
        if (obj instanceof e0) {
            return ((e0) obj).getArity();
        }
        if (obj instanceof v3.a) {
            return 0;
        }
        if (obj instanceof v3.l) {
            return 1;
        }
        if (obj instanceof v3.p) {
            return 2;
        }
        if (obj instanceof v3.q) {
            return 3;
        }
        if (obj instanceof v3.r) {
            return 4;
        }
        if (obj instanceof v3.s) {
            return 5;
        }
        if (obj instanceof v3.t) {
            return 6;
        }
        if (obj instanceof v3.u) {
            return 7;
        }
        if (obj instanceof v3.v) {
            return 8;
        }
        if (obj instanceof v3.w) {
            return 9;
        }
        if (obj instanceof v3.b) {
            return 10;
        }
        if (obj instanceof v3.c) {
            return 11;
        }
        if (obj instanceof v3.d) {
            return 12;
        }
        if (obj instanceof v3.e) {
            return 13;
        }
        if (obj instanceof v3.f) {
            return 14;
        }
        if (obj instanceof v3.g) {
            return 15;
        }
        if (obj instanceof v3.h) {
            return 16;
        }
        if (obj instanceof v3.i) {
            return 17;
        }
        if (obj instanceof v3.j) {
            return 18;
        }
        if (obj instanceof v3.k) {
            return 19;
        }
        if (obj instanceof v3.m) {
            return 20;
        }
        if (obj instanceof v3.n) {
            return 21;
        }
        if (obj instanceof v3.o) {
            return 22;
        }
        return -1;
    }

    public static boolean B(Object obj, int i5) {
        return (obj instanceof kotlin.v) && A(obj) == i5;
    }

    public static boolean C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof w3.a) || (obj instanceof w3.b));
    }

    public static boolean D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof w3.a) || (obj instanceof w3.c));
    }

    public static boolean E(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof w3.a) || (obj instanceof w3.d));
    }

    public static boolean F(Object obj) {
        return (obj instanceof List) && (!(obj instanceof w3.a) || (obj instanceof w3.e));
    }

    public static boolean G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof w3.a) || (obj instanceof w3.f));
    }

    public static boolean H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof w3.a) || (obj instanceof w3.g));
    }

    public static boolean I(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof w3.a) || (obj instanceof g.a));
    }

    public static boolean J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof w3.a) || (obj instanceof w3.h));
    }

    private static <T extends Throwable> T K(T t5) {
        return (T) l0.B(t5, u1.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        N(name + " cannot be cast to " + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.b)) {
            M(obj, "kotlin.collections.MutableCollection");
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.b)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.c)) {
            M(obj, "kotlin.collections.MutableIterable");
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.c)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.d)) {
            M(obj, "kotlin.collections.MutableIterator");
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.d)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.e)) {
            M(obj, "kotlin.collections.MutableList");
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.e)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.f)) {
            M(obj, "kotlin.collections.MutableListIterator");
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.f)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.g)) {
            M(obj, "kotlin.collections.MutableMap");
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.g)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof w3.a) && !(obj instanceof g.a)) {
            M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof w3.a) && !(obj instanceof g.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.h)) {
            M(obj, "kotlin.collections.MutableSet");
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof w3.a) && !(obj instanceof w3.h)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i5) {
        if (obj != null && !B(obj, i5)) {
            M(obj, "kotlin.jvm.functions.Function" + i5);
        }
        return obj;
    }

    public static Object r(Object obj, int i5, String str) {
        if (obj != null && !B(obj, i5)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e5) {
            throw L(e5);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e5) {
            throw L(e5);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e5) {
            throw L(e5);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e5) {
            throw L(e5);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e5) {
            throw L(e5);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e5) {
            throw L(e5);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e5) {
            throw L(e5);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e5) {
            throw L(e5);
        }
    }
}
