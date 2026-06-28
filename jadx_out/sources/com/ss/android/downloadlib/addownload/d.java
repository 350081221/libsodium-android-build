package com.ss.android.downloadlib.addownload;

import android.net.http.Headers;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.e;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private Handler f9792a;

    /* renamed from: b, reason: collision with root package name */
    private com.ss.android.downloadlib.addownload.b.e f9793b;

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f9794c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f9795d = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Handler handler) {
        this.f9792a = handler;
    }

    public static long b() {
        if (k.n() != null) {
            return k.n().a();
        }
        return 0L;
    }

    static /* synthetic */ long c() {
        return d();
    }

    private static long d() {
        return com.ss.android.downloadlib.g.m.b(0L);
    }

    private void b(com.ss.android.downloadad.api.a.b bVar, JSONObject jSONObject, long j5, long j6) {
        bVar.l("1");
        com.ss.android.downloadlib.addownload.b.i.a().a(bVar);
        try {
            jSONObject.putOpt("quite_clean_size", Long.valueOf(j6 - j5));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("cleanspace_download_after_quite_clean", jSONObject, bVar);
    }

    public void a(com.ss.android.downloadlib.addownload.b.e eVar) {
        this.f9793b = eVar;
    }

    public boolean a() {
        return this.f9795d.get();
    }

    public void a(boolean z4) {
        this.f9795d.set(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i5, final long j5, long j6, final e.a aVar) {
        this.f9795d.set(false);
        if (aVar == null) {
            return;
        }
        if (com.ss.android.downloadlib.g.e.f(i5) && com.ss.android.downloadlib.g.e.e(i5)) {
            long c5 = com.ss.android.downloadlib.g.e.c(i5);
            this.f9794c.set(false);
            final String downloadUrl = this.f9793b.f9659b.getDownloadUrl();
            com.ss.android.downloadad.api.a.b b5 = com.ss.android.downloadlib.addownload.b.f.a().b(downloadUrl);
            if (b5 == null) {
                com.ss.android.downloadlib.addownload.b.e eVar = this.f9793b;
                b5 = new com.ss.android.downloadad.api.a.b(eVar.f9659b, eVar.f9660c, eVar.f9661d, 0);
                com.ss.android.downloadlib.addownload.b.f.a().a(b5);
            }
            final com.ss.android.downloadad.api.a.b bVar = b5;
            bVar.e(false);
            if (k.n() != null) {
                k.n().a(bVar.b());
            }
            com.ss.android.downloadlib.addownload.c.d.a().a(bVar.a());
            boolean d5 = com.ss.android.downloadlib.g.e.d(i5);
            if (j6 > 0) {
                a(i5, downloadUrl, j6, bVar, j5, aVar);
            } else if (d5) {
                a(downloadUrl, bVar, new e.b() { // from class: com.ss.android.downloadlib.addownload.d.1
                    @Override // com.ss.android.downloadlib.addownload.e.b
                    public void a(long j7) {
                        d.this.a(i5, downloadUrl, j7, bVar, j5, aVar);
                    }
                });
            } else {
                c5 = 0;
            }
            this.f9792a.postDelayed(new Runnable() { // from class: com.ss.android.downloadlib.addownload.d.2
                @Override // java.lang.Runnable
                public void run() {
                    if (d.this.f9794c.get()) {
                        return;
                    }
                    d.this.f9794c.set(true);
                    aVar.a();
                }
            }, c5);
            return;
        }
        aVar.a();
    }

    private void a(String str, com.ss.android.downloadad.api.a.b bVar, final e.b bVar2) {
        if (bVar2 == null) {
            return;
        }
        com.ss.android.socialbase.downloader.network.a.b.a(str, new com.ss.android.socialbase.downloader.network.j() { // from class: com.ss.android.downloadlib.addownload.d.3
            @Override // com.ss.android.socialbase.downloader.network.j
            public void a(Map<String, String> map) {
                if (d.this.f9794c.get()) {
                    return;
                }
                d.this.f9794c.set(true);
                long a5 = d.this.a(map);
                if (a5 > 0) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("apk_size", Long.valueOf(a5));
                        jSONObject.putOpt("available_space", Long.valueOf(d.c()));
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                }
                bVar2.a(a5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (Headers.CONTENT_LEN.equalsIgnoreCase(key)) {
                        return Long.parseLong(value);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, String str, long j5, final com.ss.android.downloadad.api.a.b bVar, long j6, final e.a aVar) {
        this.f9794c.set(true);
        boolean z4 = false;
        if (j5 > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("apk_size", Long.valueOf(j5));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            long longValue = (Double.valueOf((com.ss.android.downloadlib.g.e.a(i5) + 1.0d) * j5).longValue() + com.ss.android.downloadlib.g.e.b(i5)) - j6;
            long d5 = d();
            if (d5 < longValue) {
                a(bVar, jSONObject, longValue, d5);
                a(bVar);
                long d6 = d();
                if (d6 < longValue) {
                    bVar.d(true);
                    final String a5 = bVar.a();
                    com.ss.android.downloadlib.addownload.c.d.a().a(a5, new com.ss.android.downloadlib.addownload.c.e() { // from class: com.ss.android.downloadlib.addownload.d.4
                    });
                    z4 = a(i5, bVar, str, longValue);
                    if (z4) {
                        bVar.e(true);
                    }
                } else {
                    b(bVar, jSONObject, d5, d6);
                }
            }
        }
        if (z4) {
            return;
        }
        this.f9792a.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.d.5
            @Override // java.lang.Runnable
            public void run() {
                aVar.a();
            }
        });
    }

    private boolean a(int i5, @NonNull com.ss.android.downloadad.api.a.b bVar, String str, long j5) {
        if (!com.ss.android.downloadlib.g.e.f(i5)) {
            return false;
        }
        if (k.n() != null) {
            return k.n().a(i5, str, true, j5);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("show_dialog_result", 3);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("cleanspace_window_show", jSONObject, bVar);
        return false;
    }

    public static boolean a(final DownloadInfo downloadInfo, long j5) {
        int id = downloadInfo.getId();
        boolean z4 = false;
        if (!com.ss.android.downloadlib.g.e.f(id)) {
            return false;
        }
        if (k.n() != null && (z4 = k.n().a(id, downloadInfo.getUrl(), false, j5))) {
            com.ss.android.downloadlib.addownload.c.d.a().a(downloadInfo.getUrl(), new com.ss.android.downloadlib.addownload.c.e() { // from class: com.ss.android.downloadlib.addownload.d.6
            });
        }
        return z4;
    }

    public static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("clean_space_install_params", str);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public static void a(int i5) {
        if (com.ss.android.downloadlib.g.e.f(i5) && k.n() != null && k.n().b()) {
            k.n().c();
        }
    }

    private static void a(com.ss.android.downloadad.api.a.b bVar) {
        long d5 = d();
        if (k.n() != null) {
            k.n().e();
        }
        com.ss.android.downloadlib.addownload.c.c.a();
        com.ss.android.downloadlib.addownload.c.c.b();
        if (com.ss.android.downloadlib.g.e.g(bVar.s())) {
            com.ss.android.downloadlib.addownload.c.c.a(k.a());
        }
        long d6 = d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("quite_clean_size", Long.valueOf(d6 - d5));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("clean_quite_finish", jSONObject, bVar);
    }

    private void a(com.ss.android.downloadad.api.a.b bVar, JSONObject jSONObject, long j5, long j6) {
        try {
            jSONObject.putOpt("available_space", Long.valueOf(j6));
            jSONObject.putOpt("apk_download_need_size", Long.valueOf(j5));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("clean_space_no_enough_for_download", jSONObject, bVar);
    }
}
