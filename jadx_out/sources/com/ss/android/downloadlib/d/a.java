package com.ss.android.downloadlib.d;

import android.os.Build;
import androidx.annotation.NonNull;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.c;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.b.e;
import com.ss.android.downloadlib.addownload.b.f;
import com.ss.android.downloadlib.addownload.b.i;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.appdownloader.e.d;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.umeng.analytics.pro.bi;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.downloadlib.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0188a {

        /* renamed from: a, reason: collision with root package name */
        private static a f10035a = new a();
    }

    public static a a() {
        return C0188a.f10035a;
    }

    public void b(long j5, int i5) {
        a(j5, i5, (DownloadInfo) null);
    }

    private a() {
    }

    public void a(long j5, int i5) {
        e e5 = f.a().e(j5);
        if (e5.x()) {
            com.ss.android.downloadlib.e.c.a().a("sendClickEvent ModelBox notValid");
            return;
        }
        if (e5.f9660c.isEnableClickEvent()) {
            int i6 = 1;
            DownloadEventConfig downloadEventConfig = e5.f9660c;
            String clickItemTag = i5 == 1 ? downloadEventConfig.getClickItemTag() : downloadEventConfig.getClickButtonTag();
            String a5 = m.a(e5.f9660c.getClickLabel(), "click");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("download_click_type", Integer.valueOf(i5));
                jSONObject.putOpt("permission_notification", Integer.valueOf(d.a() ? 1 : 2));
                if (!com.ss.android.socialbase.downloader.i.f.c(k.a())) {
                    i6 = 2;
                }
                jSONObject.putOpt("network_available", Integer.valueOf(i6));
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            a(clickItemTag, a5, jSONObject, e5);
            if (!"click".equals(a5) || e5.f9659b == null) {
                return;
            }
            c.a().a(j5, e5.f9659b.getLogExtra());
        }
    }

    public void b(DownloadInfo downloadInfo, BaseException baseException) {
        if (downloadInfo == null) {
            return;
        }
        com.ss.android.downloadad.api.a.b a5 = f.a().a(downloadInfo);
        if (a5 == null) {
            com.ss.android.downloadlib.e.c.a().a("sendDownloadFailedEvent nativeModel null");
            return;
        }
        if (a5.f9500c.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            com.ss.android.downloadlib.g.f.c(downloadInfo, jSONObject);
            com.ss.android.downloadlib.a.a(jSONObject, downloadInfo);
            if (baseException != null) {
                jSONObject.putOpt("fail_status", Integer.valueOf(baseException.getErrorCode()));
                jSONObject.putOpt("fail_msg", baseException.getErrorMessage());
                a5.d(baseException.getErrorCode());
                a5.a(baseException.getErrorMessage());
            }
            a5.y();
            jSONObject.put("download_failed_times", a5.x());
            if (downloadInfo.getTotalBytes() > 0) {
                jSONObject.put("download_percent", downloadInfo.getCurBytes() / downloadInfo.getTotalBytes());
            }
            int i5 = 1;
            jSONObject.put("has_send_download_failed_finally", a5.f9501d.get() ? 1 : 2);
            com.ss.android.downloadlib.g.f.a(a5, jSONObject);
            if (!a5.V()) {
                i5 = 2;
            }
            jSONObject.put("is_update_download", i5);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        a(a5.j(), "download_failed", jSONObject, a5);
        i.a().a(a5);
    }

    public void a(long j5, int i5, DownloadInfo downloadInfo) {
        String a5;
        e e5 = f.a().e(j5);
        if (e5.x()) {
            com.ss.android.downloadlib.e.c.a().a("sendEvent ModelBox notValid");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        m.a(jSONObject, "download_scene", Integer.valueOf(e5.t()));
        if (i5 == 1) {
            a5 = m.a(e5.f9660c.getStorageDenyLabel(), "storage_deny");
        } else if (i5 == 2) {
            a5 = m.a(e5.f9660c.getClickStartLabel(), "click_start");
            com.ss.android.downloadlib.g.f.a(downloadInfo, jSONObject);
        } else if (i5 == 3) {
            a5 = m.a(e5.f9660c.getClickPauseLabel(), "click_pause");
            com.ss.android.downloadlib.g.f.b(downloadInfo, jSONObject);
        } else if (i5 == 4) {
            a5 = m.a(e5.f9660c.getClickContinueLabel(), "click_continue");
            com.ss.android.downloadlib.g.f.c(downloadInfo, jSONObject);
        } else if (i5 != 5) {
            a5 = null;
        } else {
            if (downloadInfo != null) {
                try {
                    com.ss.android.downloadlib.g.f.a(jSONObject, downloadInfo.getId());
                    com.ss.android.downloadlib.a.b(jSONObject, downloadInfo);
                } catch (Throwable unused) {
                }
            }
            a5 = m.a(e5.f9660c.getClickInstallLabel(), "click_install");
        }
        a(null, a5, jSONObject, 0L, 1, e5);
    }

    public void b(String str, com.ss.android.downloadad.api.a.a aVar) {
        a((String) null, str, aVar);
    }

    public void b(String str, JSONObject jSONObject, com.ss.android.downloadad.api.a.a aVar) {
        a((String) null, str, jSONObject, aVar);
    }

    public void a(String str, int i5, e eVar) {
        a(null, str, null, i5, 0, eVar);
    }

    public void a(long j5, boolean z4, int i5) {
        e e5 = f.a().e(j5);
        if (e5.x()) {
            com.ss.android.downloadlib.e.c.a().a("sendQuickAppEvent ModelBox notValid");
            return;
        }
        if (e5.f9659b.getQuickAppModel() == null) {
            return;
        }
        DownloadModel downloadModel = e5.f9659b;
        if (downloadModel instanceof AdDownloadModel) {
            ((AdDownloadModel) downloadModel).setFunnelType(3);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("download_click_type", Integer.valueOf(i5));
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        b(z4 ? "deeplink_quickapp_success" : "deeplink_quickapp_failed", jSONObject, e5);
    }

    public void a(long j5, BaseException baseException) {
        e e5 = f.a().e(j5);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("download_time", 0);
            if (baseException != null) {
                jSONObject.putOpt("fail_status", Integer.valueOf(baseException.getErrorCode()));
                jSONObject.putOpt("fail_msg", baseException.getErrorMessage());
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        b("download_failed", jSONObject, e5);
    }

    public void a(DownloadInfo downloadInfo) {
        com.ss.android.downloadad.api.a.b a5 = f.a().a(downloadInfo);
        if (a5 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            com.ss.android.downloadlib.g.f.c(downloadInfo, jSONObject);
            a5.a(System.currentTimeMillis());
            a(a5.j(), "download_resume", jSONObject, a5);
            i.a().a(a5);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, @NonNull com.ss.android.downloadad.api.a.b bVar) {
        a(bVar.j(), "install_finish", jSONObject, bVar);
    }

    public void a(DownloadInfo downloadInfo, BaseException baseException) {
        com.ss.android.downloadad.api.a.b a5;
        if (downloadInfo == null || (a5 = f.a().a(downloadInfo)) == null || a5.f9500c.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            com.ss.android.downloadlib.a.a(jSONObject, downloadInfo);
            jSONObject.putOpt("fail_status", Integer.valueOf(a5.E()));
            jSONObject.putOpt("fail_msg", a5.F());
            jSONObject.put("download_failed_times", a5.x());
            if (downloadInfo.getTotalBytes() > 0) {
                jSONObject.put("download_percent", downloadInfo.getCurBytes() / downloadInfo.getTotalBytes());
            }
            jSONObject.put("download_status", downloadInfo.getRealStatus());
            long currentTimeMillis = System.currentTimeMillis();
            if (a5.H() > 0) {
                jSONObject.put("time_from_start_download", currentTimeMillis - a5.H());
            }
            if (a5.B() > 0) {
                jSONObject.put("time_from_download_resume", currentTimeMillis - a5.B());
            }
            int i5 = 1;
            jSONObject.put("is_update_download", a5.V() ? 1 : 2);
            jSONObject.put("can_show_notification", d.a() ? 1 : 2);
            if (!a5.f9501d.get()) {
                i5 = 2;
            }
            jSONObject.put("has_send_download_failed_finally", i5);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        a(a5.j(), "download_cancel", jSONObject, a5);
    }

    public void a(String str, com.ss.android.downloadad.api.a.a aVar) {
        a(str, (JSONObject) null, aVar);
    }

    public void a(String str, JSONObject jSONObject, long j5) {
        com.ss.android.downloadad.api.a.a d5 = f.a().d(j5);
        if (d5 != null) {
            a(str, jSONObject, d5);
            return;
        }
        e e5 = f.a().e(j5);
        if (e5.x()) {
            com.ss.android.downloadlib.e.c.a().a("sendUnityEvent ModelBox notValid");
        } else {
            a(str, jSONObject, e5);
        }
    }

    public void a(String str, JSONObject jSONObject, com.ss.android.downloadad.api.a.a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        m.a(jSONObject2, "unity_label", str);
        a("embeded_ad", "ttdownloader_unity", m.a(jSONObject, jSONObject2), aVar);
    }

    public void a(String str, @NonNull DownloadModel downloadModel, @NonNull DownloadEventConfig downloadEventConfig, @NonNull DownloadController downloadController) {
        b(str, new e(downloadModel.getId(), downloadModel, downloadEventConfig, downloadController));
    }

    public void a(String str, long j5) {
        com.ss.android.downloadad.api.a.b d5 = f.a().d(j5);
        if (d5 != null) {
            b(str, d5);
        } else {
            b(str, f.a().e(j5));
        }
    }

    public void a(String str, String str2, com.ss.android.downloadad.api.a.a aVar) {
        a(str, str2, (JSONObject) null, aVar);
    }

    public void a(String str, String str2, JSONObject jSONObject, com.ss.android.downloadad.api.a.a aVar) {
        a(str, str2, jSONObject, 0L, 0, aVar);
    }

    private void a(String str, String str2, JSONObject jSONObject, long j5, int i5, com.ss.android.downloadad.api.a.a aVar) {
        if (aVar == null) {
            com.ss.android.downloadlib.e.c.a().a("onEvent data null");
            return;
        }
        if ((aVar instanceof e) && ((e) aVar).x()) {
            com.ss.android.downloadlib.e.c.a().a("onEvent ModelBox notValid");
            return;
        }
        try {
            c.a c5 = new c.a().a(m.a(str, aVar.j(), "embeded_ad")).b(str2).b(aVar.c()).a(aVar.b()).c(aVar.d());
            if (j5 <= 0) {
                j5 = aVar.l();
            }
            c.a a5 = c5.b(j5).d(aVar.i()).a(aVar.n()).a(m.a(a(aVar), jSONObject)).b(aVar.k()).a(aVar.o());
            if (i5 <= 0) {
                i5 = 2;
            }
            a(a5.a(i5).a(aVar.m()).a());
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "onEvent");
        }
    }

    private JSONObject a(com.ss.android.downloadad.api.a.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            m.a(aVar.g(), jSONObject);
            m.a(aVar.p(), jSONObject);
            jSONObject.putOpt("download_url", aVar.a());
            jSONObject.putOpt(bi.f12269o, aVar.e());
            jSONObject.putOpt("android_int", Integer.valueOf(Build.VERSION.SDK_INT));
            jSONObject.putOpt("rom_name", com.ss.android.socialbase.appdownloader.f.e.h());
            jSONObject.putOpt("rom_version", com.ss.android.socialbase.appdownloader.f.e.i());
            jSONObject.putOpt("ttdownloader", 1);
            jSONObject.putOpt("funnel_type", Integer.valueOf(aVar.h()));
            if (aVar.h() == 2) {
                com.ss.android.downloadlib.g.f.b(jSONObject, aVar);
            }
            if (com.ss.android.socialbase.appdownloader.f.e.p()) {
                com.ss.android.downloadlib.g.f.a(jSONObject);
            }
        } catch (Exception e5) {
            k.u().a(e5, "getBaseJson");
        }
        return jSONObject;
    }

    private void a(com.ss.android.download.api.model.c cVar) {
        if (k.b() == null) {
            return;
        }
        if (cVar.m()) {
            k.b().a(cVar);
        } else {
            k.b().b(cVar);
        }
    }
}
