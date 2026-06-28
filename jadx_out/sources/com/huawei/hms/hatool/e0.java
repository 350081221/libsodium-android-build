package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static e0 f8532b;

    /* renamed from: a, reason: collision with root package name */
    public volatile Map<String, f0> f8533a = new HashMap();

    public static e0 a() {
        if (f8532b == null) {
            b();
        }
        return f8532b;
    }

    public static synchronized void b() {
        synchronized (e0.class) {
            if (f8532b == null) {
                f8532b = new e0();
            }
        }
    }

    public final f0 a(String str) {
        if (!this.f8533a.containsKey(str)) {
            this.f8533a.put(str, new f0());
        }
        return this.f8533a.get(str);
    }

    public f0 a(String str, long j5) {
        f0 a5 = a(str);
        a5.a(j5);
        return a5;
    }
}
