package com.huawei.hms.analytics.framework.a;

import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.b.b;
import com.huawei.hms.analytics.framework.b.c;
import com.huawei.hms.analytics.framework.policy.IStoragePolicy;

/* loaded from: classes3.dex */
public final class a {
    public static IStorageHandler a(String str) {
        c b5 = b.a().b(str);
        if (b5 != null) {
            return b5.f8209b;
        }
        return null;
    }

    public static IStoragePolicy b(String str) {
        com.huawei.hms.analytics.framework.b.a aVar = b.a().f8207b.get(str);
        if (aVar != null) {
            return aVar.f8203b;
        }
        return null;
    }
}
