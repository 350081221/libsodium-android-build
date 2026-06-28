package com.ss.android.downloadlib.addownload.c;

import com.ss.android.downloadlib.addownload.b.f;
import com.ss.android.downloadlib.addownload.b.i;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private DownloadInfo f9687a;

    public b(DownloadInfo downloadInfo) {
        this.f9687a = downloadInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.ss.android.downloadad.api.a.b a5;
        boolean z4;
        if (this.f9687a == null || (a5 = f.a().a(this.f9687a)) == null) {
            return;
        }
        com.ss.android.downloadlib.d.a.a().a("cleanspace_task", a5);
        long longValue = Double.valueOf((com.ss.android.downloadlib.g.e.a(this.f9687a.getId()) + 1.0d) * this.f9687a.getTotalBytes()).longValue() - this.f9687a.getCurBytes();
        long b5 = m.b(0L);
        if (k.n() != null) {
            k.n().e();
        }
        c.a();
        c.b();
        if (com.ss.android.downloadlib.g.e.g(a5.s())) {
            c.a(k.a());
        }
        long b6 = m.b(0L);
        if (b6 >= longValue) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            a5.l("1");
            i.a().a(a5);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("quite_clean_size", Long.valueOf(b6 - b5));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            com.ss.android.downloadlib.d.a.a().a("cleanspace_download_after_quite_clean", jSONObject, a5);
            Downloader.getInstance(k.a()).restart(this.f9687a.getId());
            return;
        }
        if (k.n() != null) {
            a5.d(false);
            d.a().a(a5.a(), new e() { // from class: com.ss.android.downloadlib.addownload.c.b.1
            });
            if (k.n().a(this.f9687a.getId(), this.f9687a.getUrl(), true, longValue)) {
                a5.e(true);
                return;
            }
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("show_dialog_result", 3);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("cleanspace_window_show", jSONObject2, a5);
    }
}
