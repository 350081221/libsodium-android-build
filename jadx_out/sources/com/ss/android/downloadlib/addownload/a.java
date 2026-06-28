package com.ss.android.downloadlib.addownload;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.g.n;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a implements n.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9580a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static a f9581b;

    /* renamed from: c, reason: collision with root package name */
    private com.ss.android.downloadlib.g.n f9582c = new com.ss.android.downloadlib.g.n(Looper.getMainLooper(), this);

    /* renamed from: d, reason: collision with root package name */
    private long f9583d;

    private a() {
    }

    public static a a() {
        if (f9581b == null) {
            synchronized (a.class) {
                if (f9581b == null) {
                    f9581b = new a();
                }
            }
        }
        return f9581b;
    }

    public void a(@NonNull DownloadInfo downloadInfo, long j5, long j6, String str, String str2, String str3, String str4) {
        int i5;
        com.ss.android.downloadlib.addownload.b.a aVar = new com.ss.android.downloadlib.addownload.b.a(downloadInfo.getId(), j5, j6, str, str2, str3, str4);
        if (com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("back_miui_silent_install", 1) == 0 && ((com.ss.android.socialbase.appdownloader.f.e.m() || com.ss.android.socialbase.appdownloader.f.e.n()) && com.ss.android.socialbase.downloader.i.j.a(k.a(), "com.miui.securitycore", "com.miui.enterprise.service.EntInstallService"))) {
            if (com.ss.android.socialbase.downloader.i.f.a(downloadInfo.getTempCacheData().get("extra_silent_install_succeed"), false)) {
                Message obtainMessage = this.f9582c.obtainMessage(200, aVar);
                obtainMessage.arg1 = 2;
                this.f9582c.sendMessageDelayed(obtainMessage, r1.a("check_silent_install_interval", 60000));
                return;
            }
            com.ss.android.downloadad.api.a.b d5 = com.ss.android.downloadlib.addownload.b.f.a().d(aVar.f9624b);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ttdownloader_type", "miui_silent_install");
                jSONObject.put("ttdownloader_message", "miui_silent_install_failed: has not started service");
                i5 = 5;
            } catch (Exception unused) {
                i5 = -1;
            }
            k.g().a(null, new BaseException(i5, jSONObject.toString()), i5);
            com.ss.android.downloadlib.d.a.a().a("embeded_ad", "ah_result", jSONObject, d5);
        }
        if (com.ss.android.downloadlib.g.e.c()) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9583d;
            long d6 = com.ss.android.downloadlib.g.e.d();
            if (currentTimeMillis < com.ss.android.downloadlib.g.e.e()) {
                long e5 = com.ss.android.downloadlib.g.e.e() - currentTimeMillis;
                d6 += e5;
                this.f9583d = System.currentTimeMillis() + e5;
            } else {
                this.f9583d = System.currentTimeMillis();
            }
            com.ss.android.downloadlib.g.n nVar = this.f9582c;
            nVar.sendMessageDelayed(nVar.obtainMessage(200, aVar), d6);
        }
    }

    private void a(com.ss.android.downloadlib.addownload.b.a aVar, int i5) {
        int i6;
        if (k.m() == null || k.m().a() || aVar == null) {
            return;
        }
        if (2 == i5) {
            com.ss.android.downloadad.api.a.b d5 = com.ss.android.downloadlib.addownload.b.f.a().d(aVar.f9624b);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ttdownloader_type", "miui_silent_install");
                if (com.ss.android.downloadlib.g.m.e(k.a(), aVar.f9626d)) {
                    jSONObject.put("ttdownloader_message", "miui_silent_install_succeed");
                    i6 = 4;
                } else {
                    jSONObject.put("ttdownloader_message", "miui_silent_install_failed: has started service");
                    i6 = 5;
                }
            } catch (Exception unused) {
                i6 = -1;
            }
            k.g().a(null, new BaseException(i6, jSONObject.toString()), i6);
            com.ss.android.downloadlib.d.a.a().a("embeded_ad", "ah_result", jSONObject, d5);
        }
        if (com.ss.android.downloadlib.g.m.e(k.a(), aVar.f9626d)) {
            com.ss.android.downloadlib.d.a.a().a("delayinstall_installed", aVar.f9624b);
            return;
        }
        if (!com.ss.android.downloadlib.g.m.a(aVar.f9629g)) {
            com.ss.android.downloadlib.d.a.a().a("delayinstall_file_lost", aVar.f9624b);
        } else if (com.ss.android.downloadlib.addownload.a.a.a().a(aVar.f9626d)) {
            com.ss.android.downloadlib.d.a.a().a("delayinstall_conflict_with_back_dialog", aVar.f9624b);
        } else {
            com.ss.android.downloadlib.d.a.a().a("delayinstall_install_start", aVar.f9624b);
            com.ss.android.socialbase.appdownloader.d.a(k.a(), (int) aVar.f9623a);
        }
    }

    @Override // com.ss.android.downloadlib.g.n.a
    public void a(Message message) {
        if (message.what != 200) {
            return;
        }
        a((com.ss.android.downloadlib.addownload.b.a) message.obj, message.arg1);
    }
}
