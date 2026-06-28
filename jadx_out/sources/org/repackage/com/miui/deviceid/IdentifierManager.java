package org.repackage.com.miui.deviceid;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class IdentifierManager {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22129a = "IdentifierManager";

    /* renamed from: b, reason: collision with root package name */
    private static Object f22130b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f22131c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f22132d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f22133e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f22134f;

    /* renamed from: g, reason: collision with root package name */
    private static Method f22135g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f22131c = cls;
            f22130b = cls.newInstance();
            f22132d = f22131c.getMethod("getUDID", Context.class);
            f22133e = f22131c.getMethod("getOAID", Context.class);
            f22134f = f22131c.getMethod("getVAID", Context.class);
            f22135g = f22131c.getMethod("getAAID", Context.class);
        } catch (Exception e5) {
            Log.e("IdentifierManager", "reflect exception!", e5);
        }
    }

    public static boolean a() {
        return (f22131c == null || f22130b == null) ? false : true;
    }

    public static String b(Context context) {
        return a(context, f22133e);
    }

    public static String c(Context context) {
        return a(context, f22134f);
    }

    public static String d(Context context) {
        return a(context, f22135g);
    }

    public static String a(Context context) {
        return a(context, f22132d);
    }

    private static String a(Context context, Method method) {
        Object obj = f22130b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e5) {
            Log.e("IdentifierManager", "invoke exception!", e5);
            return null;
        }
    }
}
