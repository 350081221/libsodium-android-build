package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f12994a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Object f12995b = new Object();

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f12996a = new b();

        private a() {
        }
    }

    public static b b() {
        return a.f12996a;
    }

    public void a() {
        synchronized (f12995b) {
            f12994a.clear();
        }
    }

    private b() {
    }

    public static boolean a(String str) {
        if (!d.a(str)) {
            return false;
        }
        synchronized (f12995b) {
            if (!f12994a.containsKey(str)) {
                return true;
            }
            return f12994a.get(str).booleanValue();
        }
    }

    @Override // com.umeng.commonsdk.config.f
    public void a(String str, Boolean bool) {
        if (d.a(str)) {
            synchronized (f12995b) {
                Map<String, Boolean> map = f12994a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}
