package com.ss.android.downloadlib.addownload.d;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a implements i {

    /* renamed from: a, reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.a.d f9813a;

    public static com.ss.android.downloadlib.addownload.a.d a() {
        return f9813a;
    }

    @Override // com.ss.android.downloadlib.addownload.d.i
    public boolean a(final com.ss.android.downloadad.api.a.b bVar, int i5, final h hVar) {
        DownloadInfo b5;
        if (bVar == null || bVar.ac() || !a(bVar)) {
            return false;
        }
        if (!TextUtils.isEmpty(bVar.af())) {
            b5 = com.ss.android.downloadlib.i.a(com.ss.android.downloadlib.addownload.k.a()).a(bVar.af(), null, true);
        } else {
            b5 = com.ss.android.downloadlib.i.a(com.ss.android.downloadlib.addownload.k.a()).b(bVar.a());
        }
        if (b5 == null) {
            return false;
        }
        long a5 = com.ss.android.downloadlib.addownload.j.a(b5.getId(), b5.getCurBytes(), b5.getTotalBytes());
        long totalBytes = b5.getTotalBytes();
        if (a5 <= 0 || totalBytes <= 0 || totalBytes > a(bVar.s())) {
            return false;
        }
        f9813a = new com.ss.android.downloadlib.addownload.a.d() { // from class: com.ss.android.downloadlib.addownload.d.a.1
            @Override // com.ss.android.downloadlib.addownload.a.d
            public void a() {
                com.ss.android.downloadlib.addownload.a.d unused = a.f9813a = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("pause_optimise_type", "apk_size");
                    jSONObject.putOpt("pause_optimise_action", "confirm");
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                com.ss.android.downloadlib.d.a.a().a("pause_optimise", jSONObject, bVar);
            }

            @Override // com.ss.android.downloadlib.addownload.a.d
            public void b() {
                com.ss.android.downloadlib.addownload.a.d unused = a.f9813a = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("pause_optimise_type", "apk_size");
                    jSONObject.putOpt("pause_optimise_action", "cancel");
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                com.ss.android.downloadlib.d.a.a().a("pause_optimise", jSONObject, bVar);
                hVar.a(bVar);
            }
        };
        TTDelegateActivity.a(bVar, String.format("该下载任务仅需%s，即将下载完成，是否继续下载？", m.a(totalBytes - a5)), "继续", "暂停");
        bVar.n(true);
        return true;
    }

    private int a(int i5) {
        return com.ss.android.socialbase.downloader.g.a.a(i5).a("pause_optimise_apk_size", 100) * 1024 * 1024;
    }

    private boolean a(com.ss.android.downloadad.api.a.a aVar) {
        return com.ss.android.downloadlib.g.e.a(aVar).a("pause_optimise_apk_size_switch", 0) == 1 && aVar.q();
    }
}
