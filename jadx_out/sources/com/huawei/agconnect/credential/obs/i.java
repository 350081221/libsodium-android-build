package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static i f7870a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPrefUtil f7871b = SharedPrefUtil.getInstance();

    /* renamed from: c, reason: collision with root package name */
    private CryptoUtil f7872c;

    private i() {
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f7870a == null) {
                f7870a = new i();
            }
            iVar = f7870a;
        }
        return iVar;
    }

    public void a(h hVar) {
        b(hVar);
        c(hVar);
        d(hVar);
    }

    public void b() {
        c();
        d();
        e();
    }

    public void b(h hVar) {
        if (hVar != null) {
            this.f7871b.put("com.huawei.appgallery.datastore", DatabaseFileArchive.COLUMN_KEY, String.class, hVar.randmonKey, DefaultCrypto.class);
        }
    }

    public void c() {
        this.f7871b.remove("com.huawei.appgallery.datastore", DatabaseFileArchive.COLUMN_KEY);
    }

    public void c(h hVar) {
        if (hVar != null) {
            this.f7871b.put("com.huawei.agconnect.internal", "jerry", String.class, hVar.jerry, DefaultCrypto.class);
        }
    }

    public void d() {
        this.f7871b.remove("com.huawei.agconnect.internal", "jerry");
    }

    public void d(h hVar) {
        if (hVar != null) {
            this.f7871b.put("com.huawei.appgallery.datastore", "fish", String.class, hVar.fish, DefaultCrypto.class);
        }
    }

    public void e() {
        this.f7871b.remove("com.huawei.appgallery.datastore", "fish");
    }

    public void e(h hVar) {
        f(hVar);
        g(hVar);
        h(hVar);
    }

    public void f(h hVar) {
        if (hVar != null) {
            hVar.randmonKey = (String) this.f7871b.get("com.huawei.appgallery.datastore", DatabaseFileArchive.COLUMN_KEY, String.class, hVar.randmonKey, DefaultCrypto.class);
        }
    }

    public void g(h hVar) {
        if (hVar != null) {
            hVar.jerry = (String) this.f7871b.get("com.huawei.agconnect.internal", "jerry", String.class, hVar.jerry, DefaultCrypto.class);
        }
    }

    public void h(h hVar) {
        if (hVar != null) {
            hVar.fish = (String) this.f7871b.get("com.huawei.appgallery.datastore", "fish", String.class, hVar.fish, DefaultCrypto.class);
        }
    }
}
