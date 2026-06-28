package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class cd implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static Map<Class<? extends br>, Map<? extends by, cd>> f12376d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f12377a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f12378b;

    /* renamed from: c, reason: collision with root package name */
    public final ce f12379c;

    public cd(String str, byte b5, ce ceVar) {
        this.f12377a = str;
        this.f12378b = b5;
        this.f12379c = ceVar;
    }

    public static void a(Class<? extends br> cls, Map<? extends by, cd> map) {
        f12376d.put(cls, map);
    }

    public static Map<? extends by, cd> a(Class<? extends br> cls) {
        if (!f12376d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e5.getMessage());
            } catch (InstantiationException e6) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e6.getMessage());
            }
        }
        return f12376d.get(cls);
    }
}
