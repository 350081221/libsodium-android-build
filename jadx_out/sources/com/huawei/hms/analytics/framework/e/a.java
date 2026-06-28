package com.huawei.hms.analytics.framework.e;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f8270a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f8271b = new ConcurrentHashMap();

    private a() {
    }

    public static a a() {
        if (f8270a == null) {
            b();
        }
        return f8270a;
    }

    private static synchronized void b() {
        synchronized (a.class) {
            if (f8270a == null) {
                f8270a = new a();
            }
        }
    }

    public final b a(String str) {
        if (this.f8271b.containsKey(str)) {
            return this.f8271b.get(str);
        }
        b bVar = new b();
        this.f8271b.put(str, bVar);
        return bVar;
    }

    public final b a(String str, long j5) {
        b a5 = a(str);
        a5.a(str, j5);
        return a5;
    }
}
