package com.ss.android.downloadlib.addownload.compliance;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.r;
import com.ss.android.downloadlib.addownload.k;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f9780a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static f f9791a = new f();
    }

    private f() {
        this.f9780a = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9780a.get() < 3 ? "https://apps.bytesfield.com" : "https://apps.bytesfield-b.com");
        sb.append("/customer/api/app/deep_link");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull final com.ss.android.downloadlib.addownload.b.e eVar, final String str, final byte[] bArr, final h hVar) {
        k.e().a(str, bArr, "application/json; charset=utf-8", 0, new r() { // from class: com.ss.android.downloadlib.addownload.compliance.f.2
            @Override // com.ss.android.download.api.config.r
            public void a(String str2) {
                f.this.a(eVar, str2, hVar);
            }

            @Override // com.ss.android.download.api.config.r
            public void a(Throwable th) {
                f.this.a(eVar, str, bArr, hVar);
            }
        });
    }

    public static f a() {
        return a.f9791a;
    }

    public void a(final com.ss.android.downloadlib.addownload.b.e eVar, final h hVar) {
        if (k.e() == null) {
            com.ss.android.downloadlib.e.c.a().a("getDownloadNetworkFactory == NULL");
            a(401, eVar);
        } else {
            com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.addownload.compliance.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f fVar = f.this;
                    fVar.b(eVar, fVar.b(), f.this.a(eVar, true, 4), hVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ss.android.downloadlib.addownload.b.e eVar, String str, byte[] bArr, h hVar) {
        if (this.f9780a.get() < 6) {
            this.f9780a.incrementAndGet();
            b(eVar, str, bArr, hVar);
        } else {
            a("当前网络不佳，请稍后再试");
            this.f9780a.set(0);
            a(402, eVar);
        }
    }

    private void a(final String str) {
        com.ss.android.downloadlib.g.a().b().post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.compliance.f.3
            @Override // java.lang.Runnable
            public void run() {
                k.d().a(6, k.a(), null, str, null, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(com.ss.android.downloadlib.addownload.b.e eVar, boolean z4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("download_url", eVar.a());
            jSONObject.put(bi.f12269o, eVar.e());
            jSONObject.put("call_scene", 50);
            if (z4) {
                jSONObject.put("sender_package_name", k.a().getPackageName());
                jSONObject.put("sender_version", k.k().f9435e);
                if (i5 > 0) {
                    jSONObject.put("store", i5);
                }
            } else {
                jSONObject.put("id", String.valueOf(eVar.b()));
                if (eVar.u().getDeepLink() != null) {
                    if (TextUtils.isEmpty(eVar.u().getDeepLink().getWebUrl())) {
                        com.ss.android.downloadlib.e.c.a().a("web_url is null");
                    }
                    jSONObject.put("web_url", eVar.u().getDeepLink().getWebUrl());
                } else {
                    com.ss.android.downloadlib.e.c.a().a("deeplink is null");
                }
            }
        } catch (Exception unused) {
            com.ss.android.downloadlib.e.c.a().a("param build error");
        }
        return jSONObject.toString().getBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull com.ss.android.downloadlib.addownload.b.e eVar, String str, h hVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                com.ss.android.downloadlib.e.c.a().a("response content is null");
                a(404, eVar);
                hVar.a();
                return;
            }
            this.f9780a.set(0);
            e g5 = e.g(str);
            if (g5.a() != 0) {
                a(403, eVar);
                hVar.a();
            } else if (TextUtils.isEmpty(g5.b())) {
                a(405, eVar);
                hVar.a();
            } else {
                hVar.a(g5.b());
            }
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "DownloadMiuiMarketHelper parseResponse");
        }
    }

    public void a(int i5, com.ss.android.downloadlib.addownload.b.e eVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("download_miui_market_fail_code", Integer.valueOf(i5));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("get_miui_market_compliance_error", jSONObject, eVar);
    }

    public void a(int i5, com.ss.android.downloadlib.addownload.b.e eVar, JSONObject jSONObject) {
        try {
            jSONObject.putOpt("download_miui_market_success_result", Integer.valueOf(i5));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("get_miui_market_compliance_success", jSONObject, eVar);
    }
}
