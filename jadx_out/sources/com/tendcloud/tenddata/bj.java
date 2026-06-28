package com.tendcloud.tenddata;

import com.tendcloud.tenddata.bu;
import com.tendcloud.tenddata.zz;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public class bj {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bj f11507a;

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    private bj() {
    }

    public static bj a() {
        if (f11507a == null) {
            synchronized (bj.class) {
                if (f11507a == null) {
                    f11507a = new bj();
                }
            }
        }
        return f11507a;
    }

    public final void onTDEBEventIAP(zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> hashMap = aVar.paraMap;
                if (hashMap != null && Integer.parseInt(String.valueOf(hashMap.get("apiType"))) == 8) {
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
                    bu buVar = new bu();
                    buVar.f11566a = aVar2;
                    buVar.f11567b = bu.a.IMMEDIATELY;
                    z.a().post(buVar);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
