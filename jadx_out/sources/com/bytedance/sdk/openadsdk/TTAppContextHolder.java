package com.bytedance.sdk.openadsdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.c;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class TTAppContextHolder {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context f4751a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application f4752a;

        static {
            try {
                Object b5 = b();
                f4752a = (Application) b5.getClass().getMethod("getApplication", new Class[0]).invoke(b5, new Object[0]);
                c.d("MyApplication", "application get success");
            } catch (Throwable th) {
                c.c("MyApplication", "application get failed", th);
            }
        }

        public static Application a() {
            return f4752a;
        }

        private static Object b() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                c.c("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }

    public static Context getContext() {
        if (f4751a == null) {
            setContext(null);
        }
        return f4751a;
    }

    public static synchronized void setContext(Context context) {
        synchronized (TTAppContextHolder.class) {
            if (f4751a == null) {
                if (context != null) {
                    f4751a = context.getApplicationContext();
                } else if (a.a() != null) {
                    try {
                        f4751a = a.a();
                        if (f4751a != null) {
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
