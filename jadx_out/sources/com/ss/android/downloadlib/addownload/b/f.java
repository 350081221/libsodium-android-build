package com.ss.android.downloadlib.addownload.b;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f9663a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Long, DownloadModel> f9664b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<Long, DownloadEventConfig> f9665c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<Long, DownloadController> f9666d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<Long, com.ss.android.downloadad.api.a.b> f9667e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static f f9669a = new f();
    }

    public DownloadController c(long j5) {
        return this.f9666d.get(Long.valueOf(j5));
    }

    public com.ss.android.downloadad.api.a.b d(long j5) {
        return this.f9667e.get(Long.valueOf(j5));
    }

    @NonNull
    public e e(long j5) {
        e eVar = new e();
        eVar.f9658a = j5;
        eVar.f9659b = a(j5);
        DownloadEventConfig b5 = b(j5);
        eVar.f9660c = b5;
        if (b5 == null) {
            eVar.f9660c = new com.ss.android.download.api.download.c();
        }
        DownloadController c5 = c(j5);
        eVar.f9661d = c5;
        if (c5 == null) {
            eVar.f9661d = new com.ss.android.download.api.download.b();
        }
        return eVar;
    }

    public void f(long j5) {
        this.f9664b.remove(Long.valueOf(j5));
        this.f9665c.remove(Long.valueOf(j5));
        this.f9666d.remove(Long.valueOf(j5));
    }

    private f() {
        this.f9663a = false;
        this.f9664b = new ConcurrentHashMap<>();
        this.f9665c = new ConcurrentHashMap<>();
        this.f9666d = new ConcurrentHashMap<>();
        this.f9667e = new ConcurrentHashMap<>();
    }

    public void b() {
        com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.addownload.b.f.1
            @Override // java.lang.Runnable
            public void run() {
                if (!f.this.f9663a) {
                    synchronized (f.class) {
                        if (!f.this.f9663a) {
                            f.this.f9667e.putAll(i.a().b());
                            f.this.f9663a = true;
                        }
                    }
                }
            }
        }, true);
    }

    public ConcurrentHashMap<Long, com.ss.android.downloadad.api.a.b> c() {
        return this.f9667e;
    }

    public static f a() {
        return a.f9669a;
    }

    public DownloadEventConfig b(long j5) {
        return this.f9665c.get(Long.valueOf(j5));
    }

    public void a(DownloadModel downloadModel) {
        if (downloadModel != null) {
            this.f9664b.put(Long.valueOf(downloadModel.getId()), downloadModel);
            if (downloadModel.getDeepLink() != null) {
                downloadModel.getDeepLink().setId(downloadModel.getId());
                downloadModel.getDeepLink().setPackageName(downloadModel.getPackageName());
            }
        }
    }

    public com.ss.android.downloadad.api.a.b b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.ss.android.downloadad.api.a.b bVar : this.f9667e.values()) {
            if (bVar != null && str.equals(bVar.a())) {
                return bVar;
            }
        }
        return null;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        for (DownloadModel downloadModel : this.f9664b.values()) {
            if ((downloadModel instanceof AdDownloadModel) && TextUtils.equals(downloadModel.getDownloadUrl(), str)) {
                ((AdDownloadModel) downloadModel).setPackageName(str2);
            }
        }
    }

    public void a(long j5, DownloadEventConfig downloadEventConfig) {
        if (downloadEventConfig != null) {
            this.f9665c.put(Long.valueOf(j5), downloadEventConfig);
        }
    }

    public void a(long j5, DownloadController downloadController) {
        if (downloadController != null) {
            this.f9666d.put(Long.valueOf(j5), downloadController);
        }
    }

    public synchronized void a(com.ss.android.downloadad.api.a.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f9667e.put(Long.valueOf(bVar.b()), bVar);
        i.a().a(bVar);
    }

    public DownloadModel a(long j5) {
        return this.f9664b.get(Long.valueOf(j5));
    }

    public com.ss.android.downloadad.api.a.b a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.ss.android.downloadad.api.a.b bVar : this.f9667e.values()) {
            if (bVar != null && str.equals(bVar.e())) {
                return bVar;
            }
        }
        return null;
    }

    public com.ss.android.downloadad.api.a.b a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return null;
        }
        for (com.ss.android.downloadad.api.a.b bVar : this.f9667e.values()) {
            if (bVar != null && bVar.s() == downloadInfo.getId()) {
                return bVar;
            }
        }
        if (!TextUtils.isEmpty(downloadInfo.getExtra())) {
            try {
                long a5 = m.a(new JSONObject(downloadInfo.getExtra()), "extra");
                if (a5 != 0) {
                    for (com.ss.android.downloadad.api.a.b bVar2 : this.f9667e.values()) {
                        if (bVar2 != null && bVar2.b() == a5) {
                            return bVar2;
                        }
                    }
                    com.ss.android.downloadlib.e.c.a().a("getNativeModelByInfo");
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        for (com.ss.android.downloadad.api.a.b bVar3 : this.f9667e.values()) {
            if (bVar3 != null && TextUtils.equals(bVar3.a(), downloadInfo.getUrl())) {
                return bVar3;
            }
        }
        return null;
    }

    public com.ss.android.downloadad.api.a.b a(int i5) {
        for (com.ss.android.downloadad.api.a.b bVar : this.f9667e.values()) {
            if (bVar != null && bVar.s() == i5) {
                return bVar;
            }
        }
        return null;
    }

    @NonNull
    public Map<Long, com.ss.android.downloadad.api.a.b> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (com.ss.android.downloadad.api.a.b bVar : this.f9667e.values()) {
                if (bVar != null && TextUtils.equals(bVar.a(), str)) {
                    bVar.b(str2);
                    hashMap.put(Long.valueOf(bVar.b()), bVar);
                }
            }
        }
        return hashMap;
    }

    public synchronized void a(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            arrayList.add(String.valueOf(longValue));
            this.f9667e.remove(Long.valueOf(longValue));
        }
        i.a().a((List<String>) arrayList);
    }
}
