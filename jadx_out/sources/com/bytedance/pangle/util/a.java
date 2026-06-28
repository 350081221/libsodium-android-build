package com.bytedance.pangle.util;

import android.app.Activity;
import android.content.res.Resources;
import com.bytedance.pangle.activity.IPluginActivity;
import com.bytedance.pangle.log.ZeusLogger;

/* loaded from: classes2.dex */
public final class a {
    public static void a(com.bytedance.pangle.wrapper.a aVar, Activity activity) {
        try {
            FieldUtils.writeField(aVar, "mTheme", (Object) null);
            FieldUtils.writeField((Object) aVar, "mThemeResource", (Object) 0);
            int[] a5 = a(activity);
            if (a5 == null) {
                return;
            }
            for (int i5 : a5) {
                if (i5 != 0) {
                    aVar.setWrapperActivityTheme(i5);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static int[] a(Activity activity) {
        Resources.Theme theme = activity.getTheme();
        if (theme == null) {
            return null;
        }
        try {
            if (i.h()) {
                Object readField = FieldUtils.readField(theme, "mThemeImpl");
                if (readField == null) {
                    return null;
                }
                try {
                    Object invokeMethod = MethodUtils.invokeMethod(readField, "getKey", new Object[0]);
                    if (invokeMethod != null) {
                        return (int[]) FieldUtils.readField(invokeMethod, "mResId");
                    }
                } catch (Exception unused) {
                }
                Object invoke = com.bytedance.pangle.b.b.a.a(readField.getClass(), "getKey", new Class[0]).invoke(readField, new Object[0]);
                if (invoke == null) {
                    ZeusLogger.d(ZeusLogger.TAG_ACTIVITY, "getKey failed!");
                    return null;
                }
                ZeusLogger.d(ZeusLogger.TAG_ACTIVITY, "getKey success by doubleReflector!");
                return (int[]) com.bytedance.pangle.b.b.a.a(invoke.getClass(), "mResId").get(invoke);
            }
            Object invokeMethod2 = MethodUtils.invokeMethod(theme, "getKey", new Object[0]);
            if (invokeMethod2 == null) {
                return null;
            }
            return (int[]) FieldUtils.readField(invokeMethod2, "mResId");
        } catch (Throwable th) {
            ZeusLogger.d(ZeusLogger.TAG_ACTIVITY, "getKey exception!" + th.getMessage());
            return null;
        }
    }

    public static void a(IPluginActivity iPluginActivity, Activity activity) {
        try {
            FieldUtils.writeField(iPluginActivity, "mTheme", (Object) null);
            FieldUtils.writeField((Object) iPluginActivity, "mThemeResource", (Object) 0);
            int[] a5 = a(activity);
            if (a5 == null) {
                return;
            }
            for (int i5 : a5) {
                if (i5 != 0) {
                    iPluginActivity.setProxyTheme2Plugin(i5);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
