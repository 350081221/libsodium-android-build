package com.huawei.hms.analytics.framework.d;

import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.c.d;
import com.huawei.hms.analytics.framework.config.ICallback;
import com.huawei.hms.analytics.framework.policy.IStoragePolicy;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f8269a;

    public static a a() {
        if (f8269a == null) {
            b();
        }
        return f8269a;
    }

    public static void a(String str, String str2, List<JSONObject> list, long j5) {
        new d(str, str2, list, j5).run();
    }

    public static boolean a(String str) {
        IStoragePolicy b5 = com.huawei.hms.analytics.framework.a.a.b(str);
        return b5 != null && b5.decide(IStoragePolicy.PolicyType.NETWORK, "");
    }

    private static synchronized void b() {
        synchronized (a.class) {
            if (f8269a == null) {
                f8269a = new a();
            }
        }
    }

    public static void b(String str, String str2, List<JSONObject> list, ICallback iCallback) {
        d dVar = new d(str, str2, list);
        dVar.f8245a = true;
        dVar.f8246b = iCallback;
        com.huawei.hms.analytics.framework.f.a.a().a(dVar);
    }

    public static void b(String str, String str2, List<JSONObject> list, ICallback iCallback, long j5) {
        d dVar = new d(str, str2, list, j5);
        dVar.f8245a = true;
        dVar.f8246b = iCallback;
        com.huawei.hms.analytics.framework.f.a.a().a(dVar);
    }

    public final synchronized void a(String str, String str2, List<JSONObject> list, ICallback iCallback) {
        d dVar = new d(str, str2, list);
        dVar.f8246b = iCallback;
        com.huawei.hms.analytics.framework.f.a.a().a(dVar);
    }

    public final synchronized void a(String str, String str2, List<JSONObject> list, ICallback iCallback, long j5) {
        d dVar = new d(str, str2, list, j5);
        dVar.f8246b = iCallback;
        com.huawei.hms.analytics.framework.f.a.a().a(dVar);
    }

    public final synchronized void a(List<Event> list, ICallback iCallback) {
        d dVar = new d(list);
        dVar.f8246b = iCallback;
        com.huawei.hms.analytics.framework.f.a.a().a(dVar);
    }

    public final synchronized void b(String str) {
        IStorageHandler a5 = com.huawei.hms.analytics.framework.a.a.a(str);
        if (a5 != null) {
            a5.deleteAll();
        }
    }
}
