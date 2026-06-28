package m;

import android.content.Context;

/* loaded from: classes2.dex */
public class b extends g1.b {
    public static void d(Context context) {
        g1.b.d(context);
    }

    public static String e(Context context) {
        return g1.b.e(context);
    }

    public static String f(Context context) {
        return g1.b.f(context);
    }

    public static synchronized String g(Context context) {
        String g5;
        synchronized (b.class) {
            g5 = g1.b.g(context);
        }
        return g5;
    }

    public static String h(Context context) {
        return g1.b.h(context);
    }

    public static String i(Context context) {
        return g1.b.i(context);
    }

    public static boolean m(Context context) throws Exception {
        return g1.b.m(context);
    }

    public static a n(Context context) {
        return a.e(g1.b.j(context));
    }

    public static synchronized a o(Context context) {
        a e5;
        synchronized (b.class) {
            e5 = a.e(g1.b.k(context));
        }
        return e5;
    }

    public static a p(Context context) {
        return a.e(g1.b.l(context));
    }
}
