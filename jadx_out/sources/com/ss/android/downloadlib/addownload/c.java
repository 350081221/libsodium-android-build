package com.ss.android.downloadlib.addownload;

import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f9679a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f9680b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<Long, Runnable> f9681c;

    public c() {
        this.f9681c = null;
        this.f9681c = new ConcurrentHashMap<>();
    }

    public static c a() {
        if (f9680b == null) {
            synchronized (c.class) {
                if (f9680b == null) {
                    f9680b = new c();
                }
            }
        }
        return f9680b;
    }

    public long b() {
        return k.j().optLong("quick_app_check_internal", 1200L);
    }

    public void a(e eVar, boolean z4, int i5, DownloadModel downloadModel) {
        if (downloadModel instanceof AdDownloadModel) {
            ((AdDownloadModel) downloadModel).setFunnelType(3);
        }
        long id = downloadModel.getId();
        if (i5 == 4) {
            if (!z4) {
                a(id, false, 2);
                eVar.b(false);
                return;
            } else {
                a(id, true, 2);
                return;
            }
        }
        if (i5 == 5) {
            if (!z4) {
                a(id, false, 1);
                eVar.c(false);
                return;
            } else {
                a(id, true, 1);
                return;
            }
        }
        if (i5 != 7) {
            return;
        }
        Runnable remove = this.f9681c.remove(Long.valueOf(id));
        if (z4) {
            com.ss.android.downloadlib.d.a.a().a(id, 1);
            a(id, true, 1);
        } else {
            if (remove != null) {
                com.ss.android.downloadlib.g.a().b().post(remove);
            }
            a(id, false, 1);
        }
    }

    private void a(long j5, boolean z4, int i5) {
        com.ss.android.downloadlib.d.a.a().a(j5, z4, i5);
        if (z4) {
            k.v().a(null, null, null, null, null, 3);
        }
    }

    public void a(final e eVar, final int i5, final DownloadModel downloadModel) {
        com.ss.android.downloadlib.b.e.a().a(new com.ss.android.downloadlib.b.d() { // from class: com.ss.android.downloadlib.addownload.c.1
            @Override // com.ss.android.downloadlib.b.d
            public void a(boolean z4) {
                c.this.a(eVar, z4, i5, downloadModel);
            }
        }, b());
    }

    public static boolean a(DownloadInfo downloadInfo) {
        return downloadInfo == null || downloadInfo.getStatus() == 0 || downloadInfo.getStatus() == -4;
    }
}
