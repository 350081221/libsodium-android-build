package com.ss.android.downloadlib.addownload;

import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.impls.r;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.a.d f9935a;

    /* renamed from: b, reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.a.c f9936b;

    public static com.ss.android.downloadlib.addownload.a.d a() {
        return f9935a;
    }

    public static boolean a(int i5) {
        return i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 7 || i5 == 8;
    }

    public static com.ss.android.downloadlib.addownload.a.c b() {
        return f9936b;
    }

    public static void a(com.ss.android.downloadlib.addownload.a.d dVar) {
        f9935a = dVar;
    }

    public static void a(com.ss.android.downloadlib.addownload.a.c cVar) {
        f9936b = cVar;
    }

    public static boolean a(final com.ss.android.downloadad.api.a.b bVar, DownloadInfo downloadInfo, int i5, final com.ss.android.downloadlib.addownload.d.h hVar, final boolean z4, final com.ss.android.downloadlib.addownload.a.c cVar) {
        boolean b5;
        if (bVar == null) {
            com.ss.android.downloadlib.e.c.a().a("tryReverseWifi nativeModel null");
            return false;
        }
        if (downloadInfo == null) {
            com.ss.android.downloadlib.e.c.a().a("tryReverseWifi info null");
            return false;
        }
        final int id = downloadInfo.getId();
        if (z4) {
            b5 = com.ss.android.downloadlib.g.e.c((com.ss.android.downloadad.api.a.a) bVar);
        } else {
            b5 = com.ss.android.downloadlib.g.e.b((com.ss.android.downloadad.api.a.a) bVar);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("switch_status", Integer.valueOf(b5 ? 1 : 0));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (z4) {
            com.ss.android.downloadlib.d.a.a().a("cancel_pause_reserve_wifi_switch_status", jSONObject, bVar);
        } else {
            com.ss.android.downloadlib.d.a.a().a("pause_reserve_wifi_switch_status", jSONObject, bVar);
        }
        if (!b5 || !a(i5) || com.ss.android.socialbase.downloader.i.f.b(k.a())) {
            return false;
        }
        if (!z4 && downloadInfo.hasPauseReservedOnWifi()) {
            return false;
        }
        a(new com.ss.android.downloadlib.addownload.a.d() { // from class: com.ss.android.downloadlib.addownload.n.1
            @Override // com.ss.android.downloadlib.addownload.a.d
            public void a() {
                n.a((com.ss.android.downloadlib.addownload.a.d) null);
                DownloadInfo downloadInfo2 = Downloader.getInstance(k.a()).getDownloadInfo(id);
                if (downloadInfo2 != null) {
                    downloadInfo2.startPauseReserveOnWifi();
                    r.a().a(downloadInfo2);
                    if (z4) {
                        com.ss.android.downloadlib.d.a.a().a("cancel_pause_reserve_wifi_confirm", bVar);
                    } else {
                        com.ss.android.downloadlib.d.a.a().b("pause_reserve_wifi_confirm", bVar);
                    }
                }
                hVar.a(bVar);
            }

            @Override // com.ss.android.downloadlib.addownload.a.d
            public void b() {
                n.a((com.ss.android.downloadlib.addownload.a.d) null);
                DownloadInfo downloadInfo2 = Downloader.getInstance(k.a()).getDownloadInfo(id);
                if (downloadInfo2 != null) {
                    downloadInfo2.stopPauseReserveOnWifi();
                }
                if (z4) {
                    com.ss.android.downloadlib.d.a.a().a("cancel_pause_reserve_wifi_cancel", bVar);
                } else {
                    com.ss.android.downloadlib.d.a.a().b("pause_reserve_wifi_cancel", bVar);
                }
                hVar.a(bVar);
            }
        });
        if (z4 && cVar != null) {
            a(new com.ss.android.downloadlib.addownload.a.c() { // from class: com.ss.android.downloadlib.addownload.n.2
                @Override // com.ss.android.downloadlib.addownload.a.c
                public void a() {
                    com.ss.android.downloadlib.d.a.a().a("cancel_pause_reserve_wifi_delete", com.ss.android.downloadad.api.a.b.this);
                    cVar.a();
                }
            });
        }
        if (z4) {
            TTDelegateActivity.a(bVar, "删除");
        } else {
            TTDelegateActivity.b(bVar);
        }
        return true;
    }
}
