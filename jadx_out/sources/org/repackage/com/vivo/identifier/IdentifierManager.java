package org.repackage.com.vivo.identifier;

import android.content.Context;
import java.util.List;

/* loaded from: classes4.dex */
public class IdentifierManager {
    public static boolean a(Context context) {
        if (IdentifierIdClient.b(context) == null) {
            return false;
        }
        return IdentifierIdClient.a();
    }

    public static String b(Context context) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.c();
    }

    public static String c(Context context) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.d();
    }

    public static String d(Context context) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.e();
    }

    public static String e(Context context) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.f();
    }

    public static String f(Context context) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.g();
    }

    public static String g(Context context) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.h();
    }

    public static String h(Context context) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.b();
    }

    public static String i(Context context) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.i();
    }

    public static String j(Context context) {
        IdentifierIdClient a5 = IdentifierIdClient.a(context);
        if (a5 == null) {
            return null;
        }
        return a5.j();
    }

    public static String k(Context context) {
        IdentifierIdClient a5 = IdentifierIdClient.a(context);
        if (a5 == null) {
            return null;
        }
        return a5.k();
    }

    public static boolean a(Context context, List<String> list) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return false;
        }
        return b5.a(list);
    }

    public static List b(Context context, List<String> list) {
        IdentifierIdClient b5 = IdentifierIdClient.b(context);
        if (b5 == null) {
            return null;
        }
        return b5.b(list);
    }
}
