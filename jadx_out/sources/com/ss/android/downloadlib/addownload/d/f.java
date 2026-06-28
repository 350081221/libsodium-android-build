package com.ss.android.downloadlib.addownload.d;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f implements i {

    /* renamed from: a, reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.a.d f9845a;

    public static com.ss.android.downloadlib.addownload.a.d a() {
        return f9845a;
    }

    @Override // com.ss.android.downloadlib.addownload.d.i
    public boolean a(final com.ss.android.downloadad.api.a.b bVar, int i5, final h hVar) {
        DownloadInfo b5;
        if (bVar == null || bVar.ad() || !a(bVar)) {
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
        long curBytes = b5.getCurBytes();
        long totalBytes = b5.getTotalBytes();
        if (curBytes > 0 && totalBytes > 0) {
            int a5 = com.ss.android.downloadlib.addownload.j.a(b5.getId(), (int) ((curBytes * 100) / totalBytes));
            if (a5 > a(bVar.s())) {
                f9845a = new com.ss.android.downloadlib.addownload.a.d() { // from class: com.ss.android.downloadlib.addownload.d.f.1
                    @Override // com.ss.android.downloadlib.addownload.a.d
                    public void a() {
                        com.ss.android.downloadlib.addownload.a.d unused = f.f9845a = null;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.putOpt("pause_optimise_type", "download_percent");
                            jSONObject.putOpt("pause_optimise_action", "confirm");
                        } catch (JSONException e5) {
                            e5.printStackTrace();
                        }
                        com.ss.android.downloadlib.d.a.a().a("pause_optimise", jSONObject, bVar);
                    }

                    @Override // com.ss.android.downloadlib.addownload.a.d
                    public void b() {
                        com.ss.android.downloadlib.addownload.a.d unused = f.f9845a = null;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.putOpt("pause_optimise_type", "download_percent");
                            jSONObject.putOpt("pause_optimise_action", "cancel");
                        } catch (JSONException e5) {
                            e5.printStackTrace();
                        }
                        com.ss.android.downloadlib.d.a.a().a("pause_optimise", jSONObject, bVar);
                        hVar.a(bVar);
                    }
                };
                TTDelegateActivity.b(bVar, String.format("已下载%s%%，即将下载完成，是否继续下载？", Integer.valueOf(a5)), "继续", "暂停");
                bVar.o(true);
                return true;
            }
        }
        return false;
    }

    private int a(int i5) {
        return com.ss.android.socialbase.downloader.g.a.a(i5).a("pause_optimise_download_percent", 50);
    }

    private boolean a(com.ss.android.downloadad.api.a.a aVar) {
        return com.ss.android.downloadlib.g.e.a(aVar).a("pause_optimise_download_percent_switch", 0) == 1 && aVar.q();
    }
}
