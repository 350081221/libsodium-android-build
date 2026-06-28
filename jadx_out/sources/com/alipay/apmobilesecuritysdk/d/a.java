package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (a.class) {
            String b5 = f1.a.b(map, "appchannel", "");
            hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            p.a.b();
            hashMap.put("AA2", p.a.a(context));
            hashMap.put("AA3", "APPSecuritySDK-ALIPAYSDK");
            hashMap.put("AA4", "3.4.0.202311031119");
            hashMap.put("AA6", b5);
        }
        return hashMap;
    }
}
