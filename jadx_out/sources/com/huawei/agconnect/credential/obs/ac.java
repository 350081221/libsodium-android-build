package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* loaded from: classes3.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    private static ac f7817a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPrefUtil f7818b = SharedPrefUtil.getInstance();

    /* renamed from: c, reason: collision with root package name */
    private CryptoUtil f7819c;

    private ac() {
    }

    public static synchronized ac a() {
        ac acVar;
        synchronized (ac.class) {
            if (f7817a == null) {
                f7817a = new ac();
            }
            acVar = f7817a;
        }
        return acVar;
    }

    public void a(ab abVar) {
    }

    public void a(ab abVar, String str) {
        if (abVar == null || str == null) {
            return;
        }
        this.f7818b.put("com.huawei.agconnect", "tokenString_" + str, String.class, abVar.tokenString, AgcCrypto.class);
    }

    public void a(String str) {
        this.f7818b.remove("com.huawei.agconnect", "tokenString_" + str);
    }

    public void b() {
    }

    public void b(ab abVar) {
    }

    public void b(ab abVar, String str) {
        if (abVar == null || str == null) {
            return;
        }
        this.f7818b.put("com.huawei.agconnect", "expires_" + str, Long.class, Long.valueOf(abVar.expires), AgcCrypto.class);
    }

    public void b(String str) {
        this.f7818b.remove("com.huawei.agconnect", "expires_" + str);
    }

    public void c(ab abVar, String str) {
        if (abVar == null || str == null) {
            return;
        }
        this.f7818b.put("com.huawei.agconnect", "validTime_" + str, Long.class, Long.valueOf(abVar.validTime), AgcCrypto.class);
    }

    public void c(String str) {
        this.f7818b.remove("com.huawei.agconnect", "validTime_" + str);
    }

    public void d(ab abVar, String str) {
        if (abVar == null || str == null) {
            return;
        }
        abVar.tokenString = (String) this.f7818b.get("com.huawei.agconnect", "tokenString_" + str, String.class, null, AgcCrypto.class);
    }

    public void e(ab abVar, String str) {
        if (abVar == null || str == null) {
            return;
        }
        abVar.expires = ((Long) this.f7818b.get("com.huawei.agconnect", "expires_" + str, Long.class, null, AgcCrypto.class)).longValue();
    }

    public void f(ab abVar, String str) {
        if (abVar == null || str == null) {
            return;
        }
        abVar.validTime = ((Long) this.f7818b.get("com.huawei.agconnect", "validTime_" + str, Long.class, null, AgcCrypto.class)).longValue();
    }
}
