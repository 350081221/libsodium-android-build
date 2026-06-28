package a1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import n.a;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static a.InterfaceC0623a f94a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f95b = "alipaysdk";

    public static String a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }

    public static void b(String str) {
        try {
            a.InterfaceC0623a interfaceC0623a = f94a;
            if (interfaceC0623a != null) {
                interfaceC0623a.a(String.format("[AlipaySDK] %s %s", new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()), str));
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(String str, String str2, Throwable th) {
        b(a(str, str2) + " " + f(th));
    }

    public static void d(Throwable th) {
        if (th == null) {
            return;
        }
        try {
            b(f(th));
        } catch (Throwable unused) {
        }
    }

    public static void e(a.InterfaceC0623a interfaceC0623a) {
        f94a = interfaceC0623a;
    }

    public static String f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void g(String str, String str2) {
        b(a(str, str2));
    }

    public static void h(String str, String str2) {
        b(a(str, str2));
    }

    public static void i(String str, String str2) {
        b(a(str, str2));
    }

    public static void j(String str, String str2) {
        b(a(str, str2));
    }
}
