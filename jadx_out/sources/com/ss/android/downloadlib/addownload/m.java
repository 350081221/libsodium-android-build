package com.ss.android.downloadlib.addownload;

import com.ss.android.socialbase.downloader.downloader.r;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class m implements r {
    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void a(DownloadInfo downloadInfo, int i5, int i6) {
        com.ss.android.downloadad.api.a.b a5 = com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("reserve_wifi_source", Integer.valueOf(i6));
            jSONObject.putOpt("reserve_wifi_status", Integer.valueOf(i5));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("pause_reserve_wifi", jSONObject, a5);
    }
}
