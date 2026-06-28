package com.ss.android.downloadlib.addownload.d;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.a.d f9817a;

    /* renamed from: b, reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.a.c f9818b;

    public static com.ss.android.downloadlib.addownload.a.c b() {
        return f9818b;
    }

    public static com.ss.android.downloadlib.addownload.a.d a() {
        return f9817a;
    }

    public static void a(com.ss.android.downloadlib.addownload.a.c cVar) {
        f9818b = cVar;
    }

    @Override // com.ss.android.downloadlib.addownload.d.g
    public boolean a(final com.ss.android.downloadad.api.a.b bVar, int i5, final h hVar, final com.ss.android.downloadlib.addownload.a.c cVar) {
        DownloadInfo b5;
        if (bVar == null || !a(bVar)) {
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
        if (a5 >= 0 && totalBytes > 0) {
            if (totalBytes <= a(bVar.s())) {
                final int i6 = (int) (a5 / 1048576);
                f9817a = new com.ss.android.downloadlib.addownload.a.d() { // from class: com.ss.android.downloadlib.addownload.d.b.1
                    @Override // com.ss.android.downloadlib.addownload.a.d
                    public void a() {
                        com.ss.android.downloadlib.addownload.a.d unused = b.f9817a = null;
                        b.this.a(i6, i6, bVar, "apk_size_cancel", "confirm");
                    }

                    @Override // com.ss.android.downloadlib.addownload.a.d
                    public void b() {
                        com.ss.android.downloadlib.addownload.a.d unused = b.f9817a = null;
                        b.this.a(i6, i6, bVar, "apk_size_cancel", "cancel");
                        hVar.a(bVar);
                    }
                };
                String format = String.format("该下载任务仅需%s，即将下载完成，是否继续下载？", m.a(totalBytes - a5));
                if (cVar != null) {
                    a(new com.ss.android.downloadlib.addownload.a.c() { // from class: com.ss.android.downloadlib.addownload.d.b.2
                        @Override // com.ss.android.downloadlib.addownload.a.c
                        public void a() {
                            com.ss.android.downloadlib.addownload.a.d unused = b.f9817a = null;
                            b.this.a(i6, i6, bVar, "apk_size_cancel", "delete");
                            cVar.a();
                        }
                    });
                }
                TTDelegateActivity.a(bVar, format, "继续", "暂停", "删除");
                return true;
            }
        }
        return false;
    }

    private int a(int i5) {
        return com.ss.android.socialbase.downloader.g.a.a(i5).a("cancel_pause_optimise_apk_size", 100) * 1024 * 1024;
    }

    private boolean a(com.ss.android.downloadad.api.a.a aVar) {
        return com.ss.android.downloadlib.g.e.a(aVar).a("cancel_pause_optimise_apk_retain_switch", 0) == 1 && aVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, int i6, com.ss.android.downloadad.api.a.b bVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("pause_optimise_type", str);
            jSONObject.putOpt("pause_optimise_action", str2);
            jSONObject.putOpt("download_current_bytes", Integer.valueOf(i5));
            jSONObject.putOpt("download_total_bytes", Integer.valueOf(i6));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("pause_cancel_optimise", jSONObject, bVar);
    }
}
