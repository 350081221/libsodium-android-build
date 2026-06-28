package p0;

import android.content.Context;

/* loaded from: classes2.dex */
public class a {
    public static String a(Context context) {
        b c5 = c.c(context);
        if (c5 != null && !l0.f.b(c5.g())) {
            return c5.g();
        }
        return "ffffffffffffffffffffffff";
    }

    public static String b(Context context) {
        String a5 = d.c(context).a();
        if (a5 == null || l0.f.b(a5)) {
            return "ffffffffffffffffffffffff";
        }
        return a5;
    }

    @Deprecated
    public static String c(Context context) {
        return a(context);
    }

    @Deprecated
    public static String d(Context context) {
        return b(context);
    }
}
