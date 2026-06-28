package f0;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16053a = "OpenIdHelper";

    /* renamed from: b, reason: collision with root package name */
    public static Method f16054b;

    public static String a(Context context) {
        e b5 = e.b();
        return b5.c(context.getApplicationContext(), b5.f16064c);
    }

    public static void b(boolean z4) {
        e.b();
        e.f(z4);
    }

    public static final boolean c() {
        Context context = null;
        try {
            if (f16054b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                f16054b = method;
                method.setAccessible(true);
            }
            context = (Context) f16054b.invoke(null, new Object[0]);
        } catch (Exception e5) {
            Log.e(f16053a, "ActivityThread:currentApplication --> " + e5.toString());
        }
        if (context == null) {
            return false;
        }
        return e.b().h(context, false);
    }

    public static String d(Context context) {
        e b5 = e.b();
        return b5.c(context.getApplicationContext(), b5.f16063b);
    }

    public static String e(Context context) {
        e b5 = e.b();
        return b5.c(context.getApplicationContext(), b5.f16062a);
    }

    public static String f(Context context) {
        e b5 = e.b();
        return b5.c(context.getApplicationContext(), b5.f16065d);
    }
}
