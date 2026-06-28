package org.repackage.com.meizu.flyme.openidsdk;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class OpenIdHelper {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22108a = "OpenIdHelper";

    /* renamed from: b, reason: collision with root package name */
    private static Method f22109b;

    public static String a(Context context) {
        b a5 = b.a();
        return a5.a(context.getApplicationContext(), a5.f22117a);
    }

    public static void a(boolean z4) {
        b.a();
        b.a(z4);
    }

    public static final boolean a() {
        Context context = null;
        try {
            if (f22109b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                f22109b = method;
                method.setAccessible(true);
            }
            context = (Context) f22109b.invoke(null, new Object[0]);
        } catch (Exception e5) {
            Log.e("OpenIdHelper", "ActivityThread:currentApplication --> " + e5.toString());
        }
        if (context == null) {
            return false;
        }
        return b.a().a(context, false);
    }

    public static String b(Context context) {
        b a5 = b.a();
        return a5.a(context.getApplicationContext(), a5.f22118b);
    }

    public static String c(Context context) {
        b a5 = b.a();
        return a5.a(context.getApplicationContext(), a5.f22120d);
    }

    public static String d(Context context) {
        b a5 = b.a();
        return a5.a(context.getApplicationContext(), a5.f22119c);
    }
}
