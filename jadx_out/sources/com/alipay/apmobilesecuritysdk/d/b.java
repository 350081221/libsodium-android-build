package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (b.class) {
            hashMap = new HashMap();
            String b5 = f1.a.b(map, "tid", "");
            String b6 = f1.a.b(map, k0.b.f19026g, "");
            String b7 = f1.a.b(map, "userId", "");
            String b8 = f1.a.b(map, TTDownloadField.TT_APP_NAME, "");
            String b9 = f1.a.b(map, "appKeyClient", "");
            String b10 = f1.a.b(map, "tmxSessionId", "");
            String f5 = h.f(context);
            String b11 = f1.a.b(map, "sessionId", "");
            hashMap.put("AC1", b5);
            hashMap.put("AC2", b6);
            hashMap.put("AC3", "");
            hashMap.put("AC4", f5);
            hashMap.put("AC5", b7);
            hashMap.put("AC6", b10);
            hashMap.put("AC7", "");
            hashMap.put("AC8", b8);
            hashMap.put("AC9", b9);
            if (f1.a.f(b11)) {
                hashMap.put("AC10", b11);
            }
        }
        return hashMap;
    }
}
