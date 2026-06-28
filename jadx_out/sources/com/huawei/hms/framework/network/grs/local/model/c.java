package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f8519a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, d> f8520b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    private List<b> f8521c = new ArrayList(16);

    public d a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f8520b.get(str);
        }
        Logger.w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    public List<b> a() {
        return this.f8521c;
    }

    public void a(String str, d dVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        this.f8520b.put(str, dVar);
    }

    public void a(List<b> list) {
        this.f8521c = list;
    }

    public String b() {
        return this.f8519a;
    }

    public void b(String str) {
    }

    public void c(String str) {
        this.f8519a = str;
    }
}
