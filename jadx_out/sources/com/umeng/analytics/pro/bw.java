package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class bw {
    public static bv a(Class<? extends bv> cls, int i5) {
        try {
            return (bv) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i5));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
