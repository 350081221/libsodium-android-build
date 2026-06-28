package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static t f7952a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPrefUtil f7953b = SharedPrefUtil.getInstance();

    /* renamed from: c, reason: collision with root package name */
    private CryptoUtil f7954c;

    private t() {
    }

    public static synchronized t a() {
        t tVar;
        synchronized (t.class) {
            if (f7952a == null) {
                f7952a = new t();
            }
            tVar = f7952a;
        }
        return tVar;
    }

    public void a(s sVar) {
    }

    public void a(s sVar, String str) {
        if (sVar == null || str == null) {
            return;
        }
        this.f7953b.put("agc_site", "main_" + str, String.class, sVar.mainUrl, DefaultCrypto.class);
    }

    public void a(String str) {
        this.f7953b.remove("agc_site", "main_" + str);
    }

    public void b() {
    }

    public void b(s sVar) {
    }

    public void b(s sVar, String str) {
        if (sVar == null || str == null) {
            return;
        }
        this.f7953b.put("agc_site", "backup_" + str, String.class, sVar.backUrl, DefaultCrypto.class);
    }

    public void b(String str) {
        this.f7953b.remove("agc_site", "backup_" + str);
    }

    public void c(s sVar, String str) {
        if (sVar == null || str == null) {
            return;
        }
        this.f7953b.put("agc_site", "validTime_" + str, Long.class, Long.valueOf(sVar.validTime), DefaultCrypto.class);
    }

    public void c(String str) {
        this.f7953b.remove("agc_site", "validTime_" + str);
    }

    public void d(s sVar, String str) {
        if (sVar == null || str == null) {
            return;
        }
        sVar.mainUrl = (String) this.f7953b.get("agc_site", "main_" + str, String.class, null, DefaultCrypto.class);
    }

    public void e(s sVar, String str) {
        if (sVar == null || str == null) {
            return;
        }
        sVar.backUrl = (String) this.f7953b.get("agc_site", "backup_" + str, String.class, null, DefaultCrypto.class);
    }

    public void f(s sVar, String str) {
        if (sVar == null || str == null) {
            return;
        }
        sVar.validTime = ((Long) this.f7953b.get("agc_site", "validTime_" + str, Long.class, null, DefaultCrypto.class)).longValue();
    }
}
