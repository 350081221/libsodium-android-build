package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, c> f8406a = new ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f8407b = new Object();

    public static c a(GrsBaseInfo grsBaseInfo, Context context) {
        synchronized (f8407b) {
            int uniqueCode = grsBaseInfo.uniqueCode();
            Map<String, c> map = f8406a;
            c cVar = map.get(context.getPackageName() + uniqueCode);
            if (cVar == null) {
                c cVar2 = new c(context, grsBaseInfo);
                map.put(context.getPackageName() + uniqueCode, cVar2);
                return cVar2;
            }
            if (cVar.a((Object) new c(grsBaseInfo))) {
                return cVar;
            }
            c cVar3 = new c(context, grsBaseInfo);
            map.put(context.getPackageName() + uniqueCode, cVar3);
            return cVar3;
        }
    }
}
