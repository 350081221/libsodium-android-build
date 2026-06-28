package com.lody.virtual.helper.utils;

/* loaded from: classes3.dex */
public class ClassUtils {
    public static void fixArgs(Class<?>[] clsArr, Object[] objArr) {
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            Class<?> cls = clsArr[i5];
            if (cls == Integer.TYPE && objArr[i5] == null) {
                objArr[i5] = 0;
            } else if (cls == Boolean.TYPE && objArr[i5] == null) {
                objArr[i5] = Boolean.FALSE;
            }
        }
    }

    public static boolean isClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
