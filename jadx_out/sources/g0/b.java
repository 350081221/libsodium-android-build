package g0;

import a1.i;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f16090a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f16091b;

    public static String a() {
        c b5 = c.b(c.CANCELED.b());
        return b(b5.b(), b5.a(), "");
    }

    public static String b(int i5, String str, String str2) {
        return "resultStatus={" + i5 + "};memo={" + str + "};result={" + str2 + i.f138d;
    }

    public static void c(String str) {
        f16091b = str;
    }

    public static void d(boolean z4) {
        f16090a = z4;
    }

    public static String e() {
        c b5 = c.b(c.DOUBLE_REQUEST.b());
        return b(b5.b(), b5.a(), "");
    }

    public static boolean f() {
        return f16090a;
    }

    public static String g() {
        return f16091b;
    }

    public static String h() {
        c b5 = c.b(c.PARAMS_ERROR.b());
        return b(b5.b(), b5.a(), "");
    }
}
