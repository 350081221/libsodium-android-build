package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, m> f8556b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static i f8557c;

    /* renamed from: a, reason: collision with root package name */
    public l f8558a = new l();

    public static i c() {
        if (f8557c == null) {
            d();
        }
        return f8557c;
    }

    public static synchronized void d() {
        synchronized (i.class) {
            if (f8557c == null) {
                f8557c = new i();
            }
        }
    }

    public m a(String str) {
        return f8556b.get(str);
    }

    public Set<String> a() {
        return f8556b.keySet();
    }

    public void a(String str, m mVar) {
        f8556b.put(str, mVar);
    }

    public l b() {
        return this.f8558a;
    }
}
