package com.huawei.hms.analytics.framework.b;

import com.huawei.hms.analytics.core.storage.IStorageHandler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public IStorageHandler f8209b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8208a = false;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Long> f8210c = new ConcurrentHashMap();

    public final long a(String str) {
        Long l5 = this.f8210c.get(str);
        if (l5 != null) {
            return l5.longValue();
        }
        return 0L;
    }

    public final void a(String str, long j5) {
        this.f8210c.put(str, Long.valueOf(j5));
    }
}
