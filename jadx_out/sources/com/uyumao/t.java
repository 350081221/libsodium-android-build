package com.uyumao;

import android.text.TextUtils;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class t {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.lang.String r2, java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object r5, java.lang.Object[] r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L1e
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            goto L1e
        Le:
            java.lang.Class r2 = a(r2)
            if (r2 != 0) goto L15
            goto L1e
        L15:
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L1a
            goto L1f
        L1a:
            r2 = move-exception
            r2.getMessage()
        L1e:
            r2 = r1
        L1f:
            if (r2 == 0) goto L34
            boolean r3 = r2.isAccessible()     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L2b
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L30
        L2b:
            java.lang.Object r1 = r2.invoke(r5, r6)     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r2 = move-exception
            r2.getMessage()
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.t.a(java.lang.String, java.lang.String, java.lang.Class[], java.lang.Object, java.lang.Object[]):java.lang.Object");
    }

    public static Field a(String str, String str2) {
        Class<?> a5;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (a5 = a(str)) == null) {
            return null;
        }
        try {
            return a5.getField(str2);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static Object a(Field field, Object obj) {
        if (field == null) {
            return null;
        }
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static Object a(String str, Class<?>[] clsArr, Object[] objArr) {
        Class<?> a5 = a(str);
        if (a5 == null) {
            return null;
        }
        try {
            return a5.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static Class<?> a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = t.class.getClassLoader();
        }
        try {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Throwable unused) {
                return Class.forName(str, true, t.class.getClassLoader());
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
