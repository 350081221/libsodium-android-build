package z2;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f22730a = 8;

    /* renamed from: b, reason: collision with root package name */
    private static final String f22731b = "NewbieGuide";

    /* renamed from: c, reason: collision with root package name */
    public static final int f22732c = 8;

    public static void a(String str) {
    }

    public static void b(String str, Throwable th) {
    }

    public static void c(String str) {
    }

    public static void d(String str, Throwable th) {
    }

    private static String e() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String format = String.format(Locale.CHINA, "%s.%s(L:%d)", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
        if (!TextUtils.isEmpty("NewbieGuide")) {
            return "NewbieGuide:" + format;
        }
        return format;
    }

    public static void f(String str) {
    }

    public static void g(String str, Throwable th) {
    }

    public static void h(String str) {
    }

    public static void i(String str, Throwable th) {
    }

    public static void j(String str) {
    }

    public static void k(String str, Throwable th) {
    }
}
