package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f7711a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f7712b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        a(hashMap, hashMap2, Character.TYPE, Character.class);
        a(hashMap, hashMap2, Double.TYPE, Double.class);
        a(hashMap, hashMap2, Float.TYPE, Float.class);
        a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        a(hashMap, hashMap2, Long.TYPE, Long.class);
        a(hashMap, hashMap2, Short.TYPE, Short.class);
        a(hashMap, hashMap2, Void.TYPE, Void.class);
        f7711a = Collections.unmodifiableMap(hashMap);
        f7712b = Collections.unmodifiableMap(hashMap2);
    }

    private m() {
        throw new UnsupportedOperationException();
    }

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static boolean b(Type type) {
        return f7711a.containsKey(type);
    }

    public static boolean c(Type type) {
        return f7712b.containsKey(a.b(type));
    }

    public static <T> Class<T> d(Class<T> cls) {
        Class<T> cls2 = (Class) f7712b.get(a.b(cls));
        if (cls2 != null) {
            return cls2;
        }
        return cls;
    }

    public static <T> Class<T> e(Class<T> cls) {
        Class<T> cls2 = (Class) f7711a.get(a.b(cls));
        if (cls2 != null) {
            return cls2;
        }
        return cls;
    }
}
