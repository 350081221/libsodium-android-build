package com.bytedance.pangle.dex;

import com.bytedance.pangle.d.c;
import com.bytedance.pangle.e.b;
import com.bytedance.pangle.e.g;
import com.bytedance.pangle.util.FieldUtils;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f4326a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Constructor<?> f4327b;

    public static void a(ClassLoader classLoader, String str, int i5) {
        Object obj = FieldUtils.getField(classLoader.getClass(), "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        String[] split = g.a(str, i5).split(":");
        String c5 = c.c(str, i5);
        for (String str2 : split) {
            Object native_load_direct_dex = DirectDex.native_load_direct_dex(str2);
            if (native_load_direct_dex == null) {
                native_load_direct_dex = DexFile.loadDex(str2, c5 + File.separator + b.a(str2), 0);
            }
            arrayList.add(a(new File(str2), native_load_direct_dex));
        }
        Object[] array = arrayList.toArray();
        Field field = FieldUtils.getField(obj.getClass(), "dexElements");
        Object[] objArr = (Object[]) field.get(obj);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + array.length);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        System.arraycopy(array, 0, objArr2, objArr.length, array.length);
        field.set(obj, objArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object a(java.io.File r13, java.lang.Object r14) {
        /*
            int r0 = com.bytedance.pangle.dex.a.f4326a
            java.lang.reflect.Constructor<?> r1 = com.bytedance.pangle.dex.a.f4327b
            r2 = 0
            if (r1 != 0) goto Le
            java.lang.String r3 = "dalvik.system.DexPathList$Element"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> Le
            goto Lf
        Le:
            r3 = r2
        Lf:
            r4 = 8
            java.lang.Class<dalvik.system.DexFile> r5 = dalvik.system.DexFile.class
            r6 = 4
            r7 = 0
            r8 = 3
            java.lang.Class<java.io.File> r9 = java.io.File.class
            r10 = 2
            r11 = 1
            if (r1 != 0) goto L32
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L31
            r1[r7] = r9     // Catch: java.lang.Exception -> L31
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L31
            r1[r11] = r12     // Catch: java.lang.Exception -> L31
            r1[r10] = r9     // Catch: java.lang.Exception -> L31
            r1[r8] = r5     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L31
            r1.setAccessible(r11)     // Catch: java.lang.Exception -> L31
            r0 = r4
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 != 0) goto L48
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L47
            r1[r7] = r9     // Catch: java.lang.Exception -> L47
            java.lang.Class<java.util.zip.ZipFile> r12 = java.util.zip.ZipFile.class
            r1[r11] = r12     // Catch: java.lang.Exception -> L47
            r1[r10] = r5     // Catch: java.lang.Exception -> L47
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L47
            r1.setAccessible(r11)     // Catch: java.lang.Exception -> L47
            r0 = r6
            goto L48
        L47:
            r1 = r2
        L48:
            if (r1 != 0) goto L5c
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L5b
            r1[r7] = r9     // Catch: java.lang.Exception -> L5b
            r1[r11] = r9     // Catch: java.lang.Exception -> L5b
            r1[r10] = r5     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L5b
            r1.setAccessible(r11)     // Catch: java.lang.Exception -> L5b
            r0 = r10
            goto L5c
        L5b:
            r1 = r2
        L5c:
            if (r1 != 0) goto L74
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L73
            r1[r7] = r9     // Catch: java.lang.Exception -> L73
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L73
            r1[r11] = r12     // Catch: java.lang.Exception -> L73
            r1[r10] = r9     // Catch: java.lang.Exception -> L73
            r1[r8] = r5     // Catch: java.lang.Exception -> L73
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L73
            r1.setAccessible(r11)     // Catch: java.lang.Exception -> L73
            r0 = r11
            goto L74
        L73:
            r1 = r2
        L74:
            com.bytedance.pangle.dex.a.f4327b = r1
            com.bytedance.pangle.dex.a.f4326a = r0
            if (r0 == r11) goto L8e
            if (r0 == r10) goto L81
            if (r0 == r6) goto L81
            if (r0 == r4) goto L8e
            goto L9e
        L81:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r13
            r0[r11] = r2
            r0[r10] = r14
            java.lang.Object r2 = a(r1, r0)
            goto L9e
        L8e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r7] = r13
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r0[r11] = r13
            r0[r10] = r2
            r0[r8] = r14
            java.lang.Object r2 = a(r1, r0)
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.dex.a.a(java.io.File, java.lang.Object):java.lang.Object");
    }

    private static Object a(Constructor<?> constructor, Object... objArr) {
        try {
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
