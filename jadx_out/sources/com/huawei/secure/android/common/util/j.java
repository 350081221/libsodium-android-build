package com.huawei.secure.android.common.util;

import android.app.Activity;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9067a = "ScreenUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9068b = 524288;

    /* loaded from: classes3.dex */
    private static class a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        Method f9069a;

        public a(Method method) {
            this.f9069a = method;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            Method method = this.f9069a;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return null;
        }
    }

    private static void a(Activity activity, int i5) {
        if (activity != null && !activity.isFinishing()) {
            activity.getWindow().addFlags(i5);
        } else {
            e.l("", "activity is null");
        }
    }

    private static void b(Activity activity, int i5) {
        if (activity != null && !activity.isFinishing()) {
            activity.getWindow().clearFlags(i5);
        } else {
            e.l("", "activity is null");
        }
    }

    public static void c(Activity activity) {
        a(activity, 8192);
    }

    public static void d(Activity activity) {
        b(activity, 8192);
    }

    public static void e(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            try {
                Window window = activity.getWindow();
                Method declaredMethod = Class.forName("android.view.Window").getDeclaredMethod("addPrivateFlags", Integer.TYPE);
                AccessController.doPrivileged(new a(declaredMethod));
                declaredMethod.invoke(window, 524288);
            } catch (ClassNotFoundException unused) {
                e.l(f9067a, "hideOverlayWindows ClassNotFoundException");
            } catch (IllegalAccessException unused2) {
                e.l(f9067a, "hideOverlayWindows IllegalAccessException");
            } catch (NoSuchMethodException unused3) {
                e.l(f9067a, "hideOverlayWindows NoSuchMethodException");
            } catch (InvocationTargetException unused4) {
                e.l(f9067a, "hideOverlayWindows InvocationTargetException");
            }
        }
    }
}
