package com.tendcloud.tenddata;

/* loaded from: classes3.dex */
public class p {
    public static boolean a(Object obj) {
        Object obj2;
        try {
            obj2 = obj.getClass().getMethod("getParentFragment", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            obj2 = null;
        }
        try {
            if (obj2 == null) {
                if (!c(obj) && b(obj) && e(obj)) {
                    return true;
                }
            } else if (!c(obj) && b(obj) && e(obj) && !c(obj2) && b(obj2) && e(obj2)) {
                return true;
            }
        } catch (Exception unused2) {
        }
        return false;
    }

    public static boolean b(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("getUserVisibleHint", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isHidden", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(Object obj) {
        Class<?> cls;
        Class<?> cls2;
        if (obj == null) {
            return false;
        }
        Class<?> cls3 = null;
        try {
            cls = Class.forName("android.app.Fragment");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            cls2 = Class.forName("androidx.fragment.app.Fragment");
        } catch (Exception unused2) {
            cls2 = null;
        }
        try {
            cls3 = Class.forName("androidx.fragment.app.Fragment");
        } catch (Exception unused3) {
        }
        if (cls2 == null && cls3 == null && cls == null) {
            return false;
        }
        if (cls2 != null) {
            try {
                if (cls2.isInstance(obj)) {
                    return true;
                }
            } catch (Exception unused4) {
            }
        }
        if (cls3 == null || !cls3.isInstance(obj)) {
            if (cls != null) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean e(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isResumed", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
