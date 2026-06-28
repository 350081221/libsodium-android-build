package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f8515a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, c> f8516b = new ConcurrentHashMap(16);

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f8516b.get(str);
        }
        Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    public void a() {
        Map<String, c> map = this.f8516b;
        if (map != null) {
            map.clear();
        }
    }

    public void a(long j5) {
    }

    public void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f8516b.put(str, cVar);
    }

    public String b() {
        return this.f8515a;
    }

    public void b(String str) {
        this.f8515a = str;
    }
}
