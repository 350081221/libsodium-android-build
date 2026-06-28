package com.huawei.hms.analytics.framework.b;

import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import com.huawei.hms.analytics.framework.policy.IStoragePolicy;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    ICollectorConfig f8202a;

    /* renamed from: b, reason: collision with root package name */
    public IStoragePolicy f8203b;

    /* renamed from: c, reason: collision with root package name */
    c f8204c;

    public a(ICollectorConfig iCollectorConfig, IStorageHandler iStorageHandler, IStoragePolicy iStoragePolicy) {
        this.f8202a = iCollectorConfig;
        c cVar = new c();
        this.f8204c = cVar;
        cVar.f8209b = iStorageHandler;
        this.f8203b = iStoragePolicy;
    }
}
