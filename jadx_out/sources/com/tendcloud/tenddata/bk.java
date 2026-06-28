package com.tendcloud.tenddata;

import com.tendcloud.tenddata.zz;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public class bk {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bk f11508a;

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    private bk() {
    }

    public static bk a() {
        if (f11508a == null) {
            synchronized (bk.class) {
                if (f11508a == null) {
                    f11508a = new bk();
                }
            }
        }
        return f11508a;
    }

    public final void onTDEBEventIndustry(zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> hashMap = aVar.paraMap;
                if (hashMap != null && Integer.parseInt(String.valueOf(hashMap.get("apiType"))) == 17) {
                    bv bvVar = new bv();
                    Object obj = aVar.paraMap.get("data");
                    a aVar2 = (a) aVar.paraMap.get("service");
                    bvVar.f11569b = String.valueOf(aVar.paraMap.get(ClientCookie.DOMAIN_ATTR));
                    bvVar.f11570c = String.valueOf(aVar.paraMap.get("action"));
                    if (obj instanceof Map) {
                        bvVar.f11571d = (Map) obj;
                    }
                    bvVar.f11568a = aVar2;
                    z.a().post(bvVar);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
