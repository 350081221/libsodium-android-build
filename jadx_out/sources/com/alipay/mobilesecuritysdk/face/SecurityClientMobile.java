package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import f1.a;
import java.util.HashMap;
import java.util.Map;
import k0.b;

/* loaded from: classes2.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        String a5;
        synchronized (SecurityClientMobile.class) {
            HashMap hashMap = new HashMap();
            hashMap.put(b.f19026g, a.b(map, b.f19026g, ""));
            hashMap.put("tid", a.b(map, "tid", ""));
            hashMap.put("userId", a.b(map, "userId", ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            a5 = com.alipay.apmobilesecuritysdk.a.a.a(context);
        }
        return a5;
    }
}
