package com.ss.android.downloadlib.c;

import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e implements com.ss.android.socialbase.downloader.d.c {
    @Override // com.ss.android.socialbase.downloader.d.c
    public void a(int i5, String str, JSONObject jSONObject) {
        com.ss.android.downloadad.api.a.b a5;
        DownloadInfo downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(i5);
        if (downloadInfo == null || (a5 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo)) == null) {
            return;
        }
        if ("install_view_result".equals(str)) {
            jSONObject = m.a(jSONObject);
            com.ss.android.downloadlib.a.a(jSONObject, downloadInfo);
            m.a(jSONObject, "model_id", Long.valueOf(a5.b()));
        }
        com.ss.android.downloadlib.d.a.a().b(str, jSONObject, a5);
    }

    @Override // com.ss.android.socialbase.downloader.d.c
    public void b(int i5, String str, JSONObject jSONObject) {
        com.ss.android.downloadad.api.a.b a5;
        DownloadInfo downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(i5);
        if (downloadInfo == null || (a5 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo)) == null) {
            return;
        }
        com.ss.android.downloadlib.d.a.a().a(str, jSONObject, a5);
    }
}
