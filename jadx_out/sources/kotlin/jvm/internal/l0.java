package kotlin.jvm.internal;

import com.android.multidex.ClassPathElement;
import java.util.Arrays;
import kotlin.q2;

/* loaded from: classes4.dex */
public class l0 {

    @kotlin.g1(version = "1.4")
    /* loaded from: classes4.dex */
    public static class a {
        private a() {
        }
    }

    private l0() {
    }

    private static <T extends Throwable> T A(T t5) {
        return (T) B(t5, l0.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T B(T t5, String str) {
        StackTraceElement[] stackTrace = t5.getStackTrace();
        int length = stackTrace.length;
        int i5 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            if (str.equals(stackTrace[i6].getClassName())) {
                i5 = i6;
            }
        }
        t5.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i5 + 1, length));
        return t5;
    }

    public static String C(String str, Object obj) {
        return str + obj;
    }

    public static void D() {
        throw ((AssertionError) A(new AssertionError()));
    }

    public static void E(String str) {
        throw ((AssertionError) A(new AssertionError(str)));
    }

    public static void F() {
        throw ((IllegalArgumentException) A(new IllegalArgumentException()));
    }

    public static void G(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(str)));
    }

    public static void H() {
        throw ((IllegalStateException) A(new IllegalStateException()));
    }

    public static void I(String str) {
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    @kotlin.g1(version = "1.4")
    public static void J() {
        throw ((NullPointerException) A(new NullPointerException()));
    }

    @kotlin.g1(version = "1.4")
    public static void K(String str) {
        throw ((NullPointerException) A(new NullPointerException(str)));
    }

    public static void L() {
        throw ((kotlin.z) A(new kotlin.z()));
    }

    public static void M(String str) {
        throw ((kotlin.z) A(new kotlin.z(str)));
    }

    private static void N(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(v(str))));
    }

    private static void O(String str) {
        throw ((NullPointerException) A(new NullPointerException(v(str))));
    }

    public static void P() {
        Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        throw ((q2) A(new q2(str)));
    }

    public static void S(String str) {
        R("lateinit property " + str + " has not been initialized");
    }

    @kotlin.g1(version = "1.1")
    public static boolean a(double d5, Double d6) {
        return d6 != null && d5 == d6.doubleValue();
    }

    @kotlin.g1(version = "1.1")
    public static boolean b(float f5, Float f6) {
        return f6 != null && f5 == f6.floatValue();
    }

    @kotlin.g1(version = "1.1")
    public static boolean c(Double d5, double d6) {
        return d5 != null && d5.doubleValue() == d6;
    }

    @kotlin.g1(version = "1.1")
    public static boolean d(Double d5, Double d6) {
        if (d5 == null) {
            if (d6 == null) {
                return true;
            }
        } else if (d6 != null && d5.doubleValue() == d6.doubleValue()) {
            return true;
        }
        return false;
    }

    @kotlin.g1(version = "1.1")
    public static boolean e(Float f5, float f6) {
        return f5 != null && f5.floatValue() == f6;
    }

    @kotlin.g1(version = "1.1")
    public static boolean f(Float f5, Float f6) {
        if (f5 == null) {
            if (f6 == null) {
                return true;
            }
        } else if (f6 != null && f5.floatValue() == f6.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(str + " must not be null")));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void j(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
    }

    public static void k(String str) throws ClassNotFoundException {
        String replace = str.replace(ClassPathElement.SEPARATOR_CHAR, external.org.apache.commons.lang3.d.f15957a);
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e5) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + replace + " is not found. Please update the Kotlin runtime to the latest version", e5)));
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace(ClassPathElement.SEPARATOR_CHAR, external.org.apache.commons.lang3.d.f15957a);
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e5) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + replace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e5)));
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            J();
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            K(str);
        }
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) A(new NullPointerException(str + " must not be null")));
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            O(str);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            N(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void s(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
    }

    public static int t(int i5, int i6) {
        if (i5 < i6) {
            return -1;
        }
        return i5 == i6 ? 0 : 1;
    }

    public static int u(long j5, long j6) {
        if (j5 < j6) {
            return -1;
        }
        return j5 == j6 ? 0 : 1;
    }

    private static String v(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = l0.class.getName();
        int i5 = 0;
        while (!stackTrace[i5].getClassName().equals(name)) {
            i5++;
        }
        while (stackTrace[i5].getClassName().equals(name)) {
            i5++;
        }
        StackTraceElement stackTraceElement = stackTrace[i5];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void w() {
        P();
    }

    public static void x(String str) {
        Q(str);
    }

    public static void y(int i5, String str) {
        P();
    }

    public static void z(int i5, String str, String str2) {
        Q(str2);
    }
}
