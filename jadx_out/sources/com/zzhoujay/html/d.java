package com.zzhoujay.html;

import android.app.Application;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, Integer> f15343a;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f15343a = hashMap;
        hashMap.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
        hashMap.put("darkgray", -12303292);
        hashMap.put("gray", -7829368);
        hashMap.put("lightgray", -3355444);
        hashMap.put("white", -1);
        hashMap.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
        hashMap.put("green", -16711936);
        hashMap.put("blue", -16776961);
        hashMap.put("yellow", Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
        hashMap.put("cyan", -16711681);
        hashMap.put("magenta", -65281);
        hashMap.put("aqua", -16711681);
        hashMap.put("fuchsia", -65281);
        hashMap.put("darkgrey", -12303292);
        hashMap.put("grey", -7829368);
        hashMap.put("lightgrey", -3355444);
        hashMap.put("lime", -16711936);
        hashMap.put("maroon", -8388608);
        hashMap.put("navy", -16777088);
        hashMap.put("olive", -8355840);
        hashMap.put("purple", -8388480);
        hashMap.put("silver", -4144960);
        hashMap.put("teal", -16744320);
    }

    public static Application a() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
            return null;
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
            return null;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
            return null;
        } catch (InvocationTargetException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r6) {
        /*
            java.lang.Class<android.graphics.Color> r0 = android.graphics.Color.class
            java.lang.String r1 = "getHtmlColor"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L2a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L2a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L2a
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L2a
            r1[r5] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L2a
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L2a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L2a
            int r6 = r0.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L2a
            return r6
        L20:
            r0 = move-exception
            r0.printStackTrace()
            goto L2e
        L25:
            r0 = move-exception
            r0.printStackTrace()
            goto L2e
        L2a:
            r0 = move-exception
            r0.printStackTrace()
        L2e:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = com.zzhoujay.html.d.f15343a
            java.lang.Object r6 = r0.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L3a
            r6 = -1
            return r6
        L3a:
            int r6 = r6.intValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zzhoujay.html.d.b(java.lang.String):int");
    }
}
