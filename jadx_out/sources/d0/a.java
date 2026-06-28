package d0;

import android.content.Context;
import o.b;
import o.c;

/* loaded from: classes2.dex */
public class a {
    public static String a(Context context) {
        if (b.f20819a) {
            return c.b.f20827a.a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static boolean b() {
        if (b.f20819a) {
            return b.f20820b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String c(Context context) {
        if (b.f20819a) {
            return c.b.f20827a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String d(Context context) {
        if (b.f20819a) {
            return c.b.f20827a.a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String e(Context context) {
        if (b.f20819a) {
            return c.b.f20827a.a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void f(Context context) {
        b.f20820b = c.b.f20827a.b(context.getApplicationContext());
        b.f20819a = true;
    }
}
