package h0;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16123a = "IdentifierManager";

    /* renamed from: b, reason: collision with root package name */
    public static Object f16124b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f16125c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f16126d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f16127e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f16128f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f16129g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f16125c = cls;
            f16124b = cls.newInstance();
            f16126d = f16125c.getMethod("getUDID", Context.class);
            f16127e = f16125c.getMethod("getOAID", Context.class);
            f16128f = f16125c.getMethod("getVAID", Context.class);
            f16129g = f16125c.getMethod("getAAID", Context.class);
        } catch (Exception e5) {
            Log.e(f16123a, "reflect exception!", e5);
        }
    }

    public static String a(Context context) {
        return b(context, f16129g);
    }

    public static String b(Context context, Method method) {
        Object obj = f16124b;
        if (obj != null && method != null) {
            try {
                Object invoke = method.invoke(obj, context);
                if (invoke != null) {
                    return (String) invoke;
                }
                return null;
            } catch (Exception e5) {
                Log.e(f16123a, "invoke exception!", e5);
                return null;
            }
        }
        return null;
    }

    public static boolean c() {
        return (f16125c == null || f16124b == null) ? false : true;
    }

    public static String d(Context context) {
        return b(context, f16127e);
    }

    public static String e(Context context) {
        return b(context, f16126d);
    }

    public static String f(Context context) {
        return b(context, f16128f);
    }
}
