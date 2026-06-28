package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {
    public static synchronized Map<String, String> a() {
        HashMap hashMap;
        synchronized (d.class) {
            hashMap = new HashMap();
            try {
                new com.alipay.apmobilesecuritysdk.c.b();
                hashMap.put("AE16", "");
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static synchronized Map<String, String> a(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            p.e.b();
            p.b.c(APSecuritySdk.getInstance(context));
            hashMap = new HashMap();
            hashMap.put("AE1", p.e.c());
            StringBuilder sb = new StringBuilder();
            sb.append(p.e.d() ? "1" : "0");
            hashMap.put("AE2", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p.e.e() ? "1" : "0");
            hashMap.put("AE3", sb2.toString());
            hashMap.put("AE4", p.e.f());
            hashMap.put("AE5", p.e.g());
            hashMap.put("AE6", p.e.h());
            hashMap.put("AE7", p.e.i());
            hashMap.put("AE8", p.e.j());
            hashMap.put("AE9", p.e.k());
            hashMap.put("AE10", p.e.l());
            hashMap.put("AE11", p.e.m());
            hashMap.put("AE12", p.e.n());
            hashMap.put("AE13", p.e.o());
            hashMap.put("AE14", p.e.p());
            hashMap.put("AE15", p.e.q());
            hashMap.put("AE21", p.b.m());
        }
        return hashMap;
    }
}
