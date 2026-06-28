package external.org.apache.commons.lang3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16029a = "The value %s is not in the specified exclusive range of %s to %s";

    /* renamed from: b, reason: collision with root package name */
    private static final String f16030b = "The value %s is not in the specified inclusive range of %s to %s";

    /* renamed from: c, reason: collision with root package name */
    private static final String f16031c = "The string %s does not match the pattern %s";

    /* renamed from: d, reason: collision with root package name */
    private static final String f16032d = "The validated object is null";

    /* renamed from: e, reason: collision with root package name */
    private static final String f16033e = "The validated expression is false";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16034f = "The validated array contains null element at index: %d";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16035g = "The validated collection contains null element at index: %d";

    /* renamed from: h, reason: collision with root package name */
    private static final String f16036h = "The validated character sequence is blank";

    /* renamed from: i, reason: collision with root package name */
    private static final String f16037i = "The validated array is empty";

    /* renamed from: j, reason: collision with root package name */
    private static final String f16038j = "The validated character sequence is empty";

    /* renamed from: k, reason: collision with root package name */
    private static final String f16039k = "The validated collection is empty";

    /* renamed from: l, reason: collision with root package name */
    private static final String f16040l = "The validated map is empty";

    /* renamed from: m, reason: collision with root package name */
    private static final String f16041m = "The validated array index is invalid: %d";

    /* renamed from: n, reason: collision with root package name */
    private static final String f16042n = "The validated character sequence index is invalid: %d";

    /* renamed from: o, reason: collision with root package name */
    private static final String f16043o = "The validated collection index is invalid: %d";

    /* renamed from: p, reason: collision with root package name */
    private static final String f16044p = "The validated state is false";

    /* renamed from: q, reason: collision with root package name */
    private static final String f16045q = "Cannot assign a %s to a %s";

    /* renamed from: r, reason: collision with root package name */
    private static final String f16046r = "Expected type: %s, actual: %s";

    public static <T> T[] A(T[] tArr) {
        return (T[]) B(tArr, f16037i, new Object[0]);
    }

    public static <T> T[] B(T[] tArr, String str, Object... objArr) {
        if (tArr != null) {
            if (tArr.length != 0) {
                return tArr;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T> T C(T t5) {
        return (T) D(t5, f16032d, new Object[0]);
    }

    public static <T> T D(T t5, String str, Object... objArr) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends CharSequence> T E(T t5, int i5) {
        return (T) F(t5, i5, f16042n, Integer.valueOf(i5));
    }

    public static <T extends CharSequence> T F(T t5, int i5, String str, Object... objArr) {
        C(t5);
        if (i5 >= 0 && i5 < t5.length()) {
            return t5;
        }
        throw new IndexOutOfBoundsException(String.format(str, objArr));
    }

    public static <T extends Collection<?>> T G(T t5, int i5) {
        return (T) H(t5, i5, f16043o, Integer.valueOf(i5));
    }

    public static <T extends Collection<?>> T H(T t5, int i5, String str, Object... objArr) {
        C(t5);
        if (i5 >= 0 && i5 < t5.size()) {
            return t5;
        }
        throw new IndexOutOfBoundsException(String.format(str, objArr));
    }

    public static <T> T[] I(T[] tArr, int i5) {
        return (T[]) J(tArr, i5, f16041m, Integer.valueOf(i5));
    }

    public static <T> T[] J(T[] tArr, int i5, String str, Object... objArr) {
        C(tArr);
        if (i5 >= 0 && i5 < tArr.length) {
            return tArr;
        }
        throw new IndexOutOfBoundsException(String.format(str, objArr));
    }

    public static void K(boolean z4) {
        if (!z4) {
            throw new IllegalStateException(f16044p);
        }
    }

    public static void L(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> void a(T t5, T t6, Comparable<T> comparable) {
        if (comparable.compareTo(t5) > 0 && comparable.compareTo(t6) < 0) {
        } else {
            throw new IllegalArgumentException(String.format(f16029a, comparable, t5, t6));
        }
    }

    public static <T> void b(T t5, T t6, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t5) > 0 && comparable.compareTo(t6) < 0) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> void c(T t5, T t6, Comparable<T> comparable) {
        if (comparable.compareTo(t5) >= 0 && comparable.compareTo(t6) <= 0) {
        } else {
            throw new IllegalArgumentException(String.format(f16030b, comparable, t5, t6));
        }
    }

    public static <T> void d(T t5, T t6, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t5) >= 0 && comparable.compareTo(t6) <= 0) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void e(Class<?> cls, Class<?> cls2) {
        String name;
        if (!cls.isAssignableFrom(cls2)) {
            Object[] objArr = new Object[2];
            if (cls2 == null) {
                name = "null";
            } else {
                name = cls2.getName();
            }
            objArr[0] = name;
            objArr[1] = cls.getName();
            throw new IllegalArgumentException(String.format(f16045q, objArr));
        }
    }

    public static void f(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (cls.isAssignableFrom(cls2)) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void g(Class<?> cls, Object obj) {
        String name;
        if (!cls.isInstance(obj)) {
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (obj == null) {
                name = "null";
            } else {
                name = obj.getClass().getName();
            }
            objArr[1] = name;
            throw new IllegalArgumentException(String.format(f16046r, objArr));
        }
    }

    public static void h(Class<?> cls, Object obj, String str, Object... objArr) {
        if (cls.isInstance(obj)) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void i(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(f16033e);
        }
    }

    public static void j(boolean z4, String str, double d5) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, Double.valueOf(d5)));
        }
    }

    public static void k(boolean z4, String str, long j5) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, Long.valueOf(j5)));
        }
    }

    public static void l(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void m(CharSequence charSequence, String str) {
        if (Pattern.matches(str, charSequence)) {
        } else {
            throw new IllegalArgumentException(String.format(f16031c, charSequence, str));
        }
    }

    public static void n(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (Pattern.matches(str, charSequence)) {
        } else {
            throw new IllegalArgumentException(String.format(str2, objArr));
        }
    }

    public static <T extends Iterable<?>> T o(T t5) {
        return (T) p(t5, f16035g, new Object[0]);
    }

    public static <T extends Iterable<?>> T p(T t5, String str, Object... objArr) {
        C(t5);
        Iterator it = t5.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (it.next() != null) {
                i5++;
            } else {
                throw new IllegalArgumentException(String.format(str, a.z(objArr, Integer.valueOf(i5))));
            }
        }
        return t5;
    }

    public static <T> T[] q(T[] tArr) {
        return (T[]) r(tArr, f16034f, new Object[0]);
    }

    public static <T> T[] r(T[] tArr, String str, Object... objArr) {
        C(tArr);
        for (int i5 = 0; i5 < tArr.length; i5++) {
            if (tArr[i5] == null) {
                throw new IllegalArgumentException(String.format(str, a.o(objArr, Integer.valueOf(i5))));
            }
        }
        return tArr;
    }

    public static <T extends CharSequence> T s(T t5) {
        return (T) t(t5, f16036h, new Object[0]);
    }

    public static <T extends CharSequence> T t(T t5, String str, Object... objArr) {
        if (t5 != null) {
            if (!g.e0(t5)) {
                return t5;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends CharSequence> T u(T t5) {
        return (T) v(t5, f16038j, new Object[0]);
    }

    public static <T extends CharSequence> T v(T t5, String str, Object... objArr) {
        if (t5 != null) {
            if (t5.length() != 0) {
                return t5;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends Collection<?>> T w(T t5) {
        return (T) x(t5, f16039k, new Object[0]);
    }

    public static <T extends Collection<?>> T x(T t5, String str, Object... objArr) {
        if (t5 != null) {
            if (!t5.isEmpty()) {
                return t5;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends Map<?, ?>> T y(T t5) {
        return (T) z(t5, f16040l, new Object[0]);
    }

    public static <T extends Map<?, ?>> T z(T t5, String str, Object... objArr) {
        if (t5 != null) {
            if (!t5.isEmpty()) {
                return t5;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        throw new NullPointerException(String.format(str, objArr));
    }
}
