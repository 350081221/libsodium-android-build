package com.bytedance.tools.d;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class h {
    public static ClassLoader a(String str) {
        try {
            Object d5 = d(str);
            if (d5 != null) {
                return (ClassLoader) d5.getClass().getField("mClassLoader").get(d5);
            }
            return null;
        } catch (Exception e5) {
            Log.w("TT_TOOLS", e5);
            return null;
        }
    }

    public static String b(String str) {
        try {
            Object d5 = d(str);
            return String.valueOf(d5.getClass().getMethod("getVersion", new Class[0]).invoke(d5, new Object[0]));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        try {
            Object d5 = d(str);
            return String.valueOf(d5.getClass().getMethod("getApiVersionCode", new Class[0]).invoke(d5, new Object[0]));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static Object d(String str) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        try {
            return Class.forName("com.bytedance.pangle.Zeus").getMethod("getPlugin", String.class, Boolean.TYPE).invoke(null, str, Boolean.FALSE);
        } catch (Exception e5) {
            Log.w("TT_TOOLS", e5);
            return null;
        }
    }
}
