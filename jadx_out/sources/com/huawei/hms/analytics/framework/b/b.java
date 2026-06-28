package com.huawei.hms.analytics.framework.b;

import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import com.huawei.hms.analytics.framework.config.IMandatoryParameters;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final b f8205c = new b();

    /* renamed from: a, reason: collision with root package name */
    public IMandatoryParameters f8206a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, a> f8207b = new ConcurrentHashMap();

    public static b a() {
        return f8205c;
    }

    public final ICollectorConfig a(String str) {
        a aVar = this.f8207b.get(str);
        if (aVar != null) {
            return aVar.f8202a;
        }
        return null;
    }

    public final synchronized void a(String str, IMandatoryParameters iMandatoryParameters, a aVar) {
        this.f8207b.put(str, aVar);
        if (this.f8206a == null && iMandatoryParameters != null) {
            this.f8206a = iMandatoryParameters;
        }
    }

    public final c b(String str) {
        a aVar = this.f8207b.get(str);
        if (aVar != null) {
            return aVar.f8204c;
        }
        return null;
    }
}
