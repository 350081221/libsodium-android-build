package com.huawei.agconnect.common.network;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f7739a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPrefUtil f7740b = SharedPrefUtil.getInstance();

    /* renamed from: c, reason: collision with root package name */
    private CryptoUtil f7741c;

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f7739a == null) {
                f7739a = new c();
            }
            cVar = f7739a;
        }
        return cVar;
    }

    public void a(b bVar) {
        b(bVar);
    }

    public void b() {
        c();
    }

    public void b(b bVar) {
        if (bVar != null) {
            this.f7740b.put("AGConnectAccessNetwork", "enableAccessNetwork", Boolean.class, Boolean.valueOf(bVar.enableAccessNetwork), DefaultCrypto.class);
        }
    }

    public void c() {
        this.f7740b.remove("AGConnectAccessNetwork", "enableAccessNetwork");
    }

    public void c(b bVar) {
        d(bVar);
    }

    public void d(b bVar) {
        if (bVar != null) {
            bVar.enableAccessNetwork = ((Boolean) this.f7740b.get("AGConnectAccessNetwork", "enableAccessNetwork", Boolean.class, Boolean.valueOf(bVar.enableAccessNetwork), DefaultCrypto.class)).booleanValue();
        }
    }
}
