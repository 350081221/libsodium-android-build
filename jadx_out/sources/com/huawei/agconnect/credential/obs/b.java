package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f7848a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPrefUtil f7849b = SharedPrefUtil.getInstance();

    /* renamed from: c, reason: collision with root package name */
    private CryptoUtil f7850c;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f7848a == null) {
                f7848a = new b();
            }
            bVar = f7848a;
        }
        return bVar;
    }

    public void a(a aVar) {
        b(aVar);
    }

    public void b() {
        c();
    }

    public void b(a aVar) {
        if (aVar != null) {
            this.f7849b.put("com.huawei.agconnect", c.f7851a, String.class, aVar.aaidString, AgcCrypto.class);
        }
    }

    public void c() {
        this.f7849b.remove("com.huawei.agconnect", c.f7851a);
    }

    public void c(a aVar) {
        d(aVar);
    }

    public void d(a aVar) {
        if (aVar != null) {
            aVar.aaidString = (String) this.f7849b.get("com.huawei.agconnect", c.f7851a, String.class, aVar.aaidString, AgcCrypto.class);
        }
    }
}
