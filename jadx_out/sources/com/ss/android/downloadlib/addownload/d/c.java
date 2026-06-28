package com.ss.android.downloadlib.addownload.d;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.a.d f9829a;

    /* renamed from: b, reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.a.c f9830b;

    public static com.ss.android.downloadlib.addownload.a.c b() {
        return f9830b;
    }

    public static com.ss.android.downloadlib.addownload.a.d a() {
        return f9829a;
    }

    public static void a(com.ss.android.downloadlib.addownload.a.c cVar) {
        f9830b = cVar;
    }

    @Override // com.ss.android.downloadlib.addownload.d.g
    public boolean a(final com.ss.android.downloadad.api.a.b bVar, int i5, final h hVar, final com.ss.android.downloadlib.addownload.a.c cVar) {
        DownloadInfo b5;
        String format;
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
        long curBytes = b5.getCurBytes();
        long totalBytes = b5.getTotalBytes();
        if (curBytes < 0 || totalBytes <= 0) {
            return false;
        }
        final int a5 = com.ss.android.downloadlib.addownload.j.a(b5.getId(), (int) ((100 * curBytes) / totalBytes));
        final int i6 = (int) (curBytes / 1048576);
        boolean z4 = a5 > a(bVar.s());
        f9829a = new com.ss.android.downloadlib.addownload.a.d() { // from class: com.ss.android.downloadlib.addownload.d.c.1
            @Override // com.ss.android.downloadlib.addownload.a.d
            public void a() {
                com.ss.android.downloadlib.addownload.a.d unused = c.f9829a = null;
                c.this.a(a5, i6, i6, bVar, "download_percent_cancel", "confirm");
            }

            @Override // com.ss.android.downloadlib.addownload.a.d
            public void b() {
                com.ss.android.downloadlib.addownload.a.d unused = c.f9829a = null;
                c.this.a(a5, i6, i6, bVar, "download_percent_cancel", "cancel");
                hVar.a(bVar);
            }
        };
        String a6 = m.a(com.ss.android.downloadlib.addownload.j.a(bVar.s(), curBytes, totalBytes));
        if (z4) {
            format = String.format("该任务已下载%s，仅需%s即可下载完成，是否继续？", a6, m.a(totalBytes - curBytes));
        } else {
            format = String.format("该任务已下载%s，即将下载完成，是否继续下载？", a6);
        }
        String str = format;
        if (cVar != null) {
            a(new com.ss.android.downloadlib.addownload.a.c() { // from class: com.ss.android.downloadlib.addownload.d.c.2
                @Override // com.ss.android.downloadlib.addownload.a.c
                public void a() {
                    com.ss.android.downloadlib.addownload.a.d unused = c.f9829a = null;
                    c.this.a(a5, i6, i6, bVar, "download_percent_cancel", "delete");
                    cVar.a();
                }
            });
        }
        TTDelegateActivity.b(bVar, str, "继续", "暂停", "删除");
        return true;
    }

    private int a(int i5) {
        return com.ss.android.socialbase.downloader.g.a.a(i5).a("cancel_pause_optimise_download_percent_value", 50);
    }

    private boolean a(com.ss.android.downloadad.api.a.a aVar) {
        return com.ss.android.downloadlib.g.e.a(aVar).a("cancel_pause_optimise_download_percent_retain_switch", 0) == 1 && aVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, int i6, int i7, com.ss.android.downloadad.api.a.b bVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("pause_optimise_type", str);
            jSONObject.putOpt("pause_optimise_action", str2);
            jSONObject.putOpt("download_percent", Integer.valueOf(i5));
            jSONObject.putOpt("download_current_bytes", Integer.valueOf(i6));
            jSONObject.putOpt("download_total_bytes", Integer.valueOf(i7));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("pause_cancel_optimise", jSONObject, bVar);
    }
}
