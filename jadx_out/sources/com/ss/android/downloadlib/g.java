package com.ss.android.downloadlib;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f10060a;

    /* renamed from: f, reason: collision with root package name */
    private long f10065f;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.ss.android.downloadlib.addownload.g> f10062c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, com.ss.android.downloadlib.addownload.g> f10063d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<Object> f10064e = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f10061b = new Handler(Looper.getMainLooper());

    private g() {
    }

    private synchronized void b(Context context, int i5, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        if (this.f10062c.size() <= 0) {
            c(context, i5, downloadStatusChangeListener, downloadModel);
        } else {
            com.ss.android.downloadlib.addownload.g remove = this.f10062c.remove(0);
            remove.b(context).b(i5, downloadStatusChangeListener).b(downloadModel).a();
            this.f10063d.put(downloadModel.getDownloadUrl(), remove);
        }
    }

    private void c(Context context, int i5, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        if (downloadModel == null) {
            return;
        }
        com.ss.android.downloadlib.addownload.e eVar = new com.ss.android.downloadlib.addownload.e();
        eVar.b(context).b(i5, downloadStatusChangeListener).b(downloadModel).a();
        this.f10063d.put(downloadModel.getDownloadUrl(), eVar);
    }

    private void d() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.downloadlib.addownload.g gVar : this.f10062c) {
            if (!gVar.b() && currentTimeMillis - gVar.d() > 300000) {
                gVar.h();
                arrayList.add(gVar);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f10062c.removeAll(arrayList);
        }
    }

    public static g a() {
        if (f10060a == null) {
            synchronized (g.class) {
                if (f10060a == null) {
                    f10060a = new g();
                }
            }
        }
        return f10060a;
    }

    private void c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f10065f < 300000) {
            return;
        }
        this.f10065f = currentTimeMillis;
        if (this.f10062c.isEmpty()) {
            return;
        }
        d();
    }

    public void a(Context context, int i5, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        com.ss.android.downloadlib.addownload.g gVar;
        if (downloadModel == null || TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
            return;
        }
        boolean z4 = k.j().optInt("filter_download_url_key", 0) == 1;
        String a5 = com.ss.android.downloadlib.addownload.f.a().a(downloadModel.getDownloadUrl());
        if (z4 && !TextUtils.isEmpty(a5)) {
            gVar = this.f10063d.get(a5);
            if (downloadModel instanceof AdDownloadModel) {
                AdDownloadModel adDownloadModel = (AdDownloadModel) downloadModel;
                if (TextUtils.isEmpty(adDownloadModel.getTaskKey())) {
                    adDownloadModel.setTaskKey(a5);
                }
            }
        } else {
            gVar = this.f10063d.get(downloadModel.getDownloadUrl());
        }
        if (gVar != null) {
            gVar.b(context).b(i5, downloadStatusChangeListener).b(downloadModel).a();
            return;
        }
        if (this.f10062c.isEmpty()) {
            if (z4) {
                if (!TextUtils.isEmpty(a5)) {
                    b(context, i5, downloadStatusChangeListener, downloadModel, a5);
                    return;
                }
                String a6 = com.ss.android.downloadlib.addownload.f.a().a(downloadModel);
                if (TextUtils.isEmpty(a6)) {
                    c(context, i5, downloadStatusChangeListener, downloadModel);
                    return;
                }
                b(context, i5, downloadStatusChangeListener, downloadModel, a6);
                if (downloadModel instanceof AdDownloadModel) {
                    AdDownloadModel adDownloadModel2 = (AdDownloadModel) downloadModel;
                    if (TextUtils.isEmpty(adDownloadModel2.getTaskKey())) {
                        adDownloadModel2.setTaskKey(a6);
                        return;
                    }
                    return;
                }
                return;
            }
            c(context, i5, downloadStatusChangeListener, downloadModel);
            return;
        }
        if (z4) {
            if (!TextUtils.isEmpty(a5)) {
                a(context, i5, downloadStatusChangeListener, downloadModel, a5);
                return;
            }
            String a7 = com.ss.android.downloadlib.addownload.f.a().a(downloadModel);
            if (TextUtils.isEmpty(a7)) {
                b(context, i5, downloadStatusChangeListener, downloadModel);
                return;
            }
            a(context, i5, downloadStatusChangeListener, downloadModel, a7);
            if (downloadModel instanceof AdDownloadModel) {
                AdDownloadModel adDownloadModel3 = (AdDownloadModel) downloadModel;
                if (TextUtils.isEmpty(adDownloadModel3.getTaskKey())) {
                    adDownloadModel3.setTaskKey(a7);
                    return;
                }
                return;
            }
            return;
        }
        b(context, i5, downloadStatusChangeListener, downloadModel);
    }

    private void b(Context context, int i5, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel, String str) {
        if (downloadModel == null) {
            return;
        }
        com.ss.android.downloadlib.addownload.e eVar = new com.ss.android.downloadlib.addownload.e();
        eVar.b(context).b(i5, downloadStatusChangeListener).b(downloadModel).a(str).a();
        this.f10063d.put(str, eVar);
        com.ss.android.downloadlib.addownload.f.a().a(str, downloadModel.getDownloadUrl());
    }

    public void b(final DownloadInfo downloadInfo, final String str) {
        this.f10061b.post(new Runnable() { // from class: com.ss.android.downloadlib.g.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = g.this.f10064e.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.a.a) {
                        ((com.ss.android.download.api.download.a.a) next).b(downloadInfo, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.a.a) {
                            ((com.ss.android.download.api.download.a.a) softReference.get()).b(downloadInfo, str);
                        }
                    }
                }
            }
        });
    }

    public Handler b() {
        return this.f10061b;
    }

    public com.ss.android.downloadlib.addownload.e a(String str) {
        com.ss.android.downloadlib.addownload.g gVar;
        Map<String, com.ss.android.downloadlib.addownload.g> map = this.f10063d;
        if (map != null && map.size() != 0 && !TextUtils.isEmpty(str)) {
            if (k.j().optInt("filter_download_url_key", 0) == 1) {
                gVar = this.f10063d.get(com.ss.android.downloadlib.addownload.f.a().a(str));
            } else {
                gVar = this.f10063d.get(str);
            }
            if (gVar instanceof com.ss.android.downloadlib.addownload.e) {
                return (com.ss.android.downloadlib.addownload.e) gVar;
            }
        }
        return null;
    }

    private synchronized void a(Context context, int i5, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel, String str) {
        if (this.f10062c.size() <= 0) {
            b(context, i5, downloadStatusChangeListener, downloadModel, str);
        } else {
            com.ss.android.downloadlib.addownload.g remove = this.f10062c.remove(0);
            remove.b(context).b(i5, downloadStatusChangeListener).b(downloadModel).a(str).a();
            this.f10063d.put(str, remove);
            com.ss.android.downloadlib.addownload.f.a().a(str, downloadModel.getDownloadUrl());
        }
    }

    public void a(String str, int i5) {
        com.ss.android.downloadlib.addownload.g gVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z4 = k.j().optInt("filter_download_url_key", 0) == 1;
        String a5 = com.ss.android.downloadlib.addownload.f.a().a(str);
        if (z4 && !TextUtils.isEmpty(a5)) {
            gVar = this.f10063d.get(a5);
        } else {
            gVar = this.f10063d.get(str);
        }
        if (gVar != null) {
            if (gVar.a(i5)) {
                this.f10062c.add(gVar);
                if (z4 && !TextUtils.isEmpty(a5)) {
                    this.f10063d.remove(a5);
                    com.ss.android.downloadlib.addownload.f.a().b(a5);
                } else {
                    this.f10063d.remove(str);
                }
            }
            c();
        }
    }

    public void a(String str, boolean z4) {
        com.ss.android.downloadlib.addownload.g gVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z5 = k.j().optInt("filter_download_url_key", 0) == 1;
        String a5 = com.ss.android.downloadlib.addownload.f.a().a(str);
        if (z5 && !TextUtils.isEmpty(a5)) {
            gVar = this.f10063d.get(a5);
        } else {
            gVar = this.f10063d.get(str);
        }
        if (gVar != null) {
            gVar.a(z4);
        }
    }

    public void a(String str, long j5, int i5, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        a(str, j5, i5, downloadEventConfig, downloadController, null, null);
    }

    public void a(String str, long j5, int i5, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        a(str, j5, i5, downloadEventConfig, downloadController, null, iDownloadButtonClickListener);
    }

    public void a(String str, long j5, int i5, DownloadEventConfig downloadEventConfig, DownloadController downloadController, OnItemClickListener onItemClickListener, IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.addownload.g gVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z4 = k.j().optInt("filter_download_url_key", 0) == 1;
        String a5 = com.ss.android.downloadlib.addownload.f.a().a(str);
        if (z4 && !TextUtils.isEmpty(a5)) {
            gVar = this.f10063d.get(a5);
        } else {
            gVar = this.f10063d.get(str);
        }
        if (gVar != null) {
            gVar.a(j5).b(downloadEventConfig).b(downloadController).a(onItemClickListener).a(iDownloadButtonClickListener).b(i5);
        }
    }

    public void a(com.ss.android.download.api.download.a.a aVar) {
        if (aVar != null) {
            if (com.ss.android.socialbase.downloader.g.a.c().b("fix_listener_oom", false)) {
                this.f10064e.add(new SoftReference(aVar));
            } else {
                this.f10064e.add(aVar);
            }
        }
    }

    public void a(final DownloadModel downloadModel, @Nullable final DownloadController downloadController, @Nullable final DownloadEventConfig downloadEventConfig) {
        this.f10061b.post(new Runnable() { // from class: com.ss.android.downloadlib.g.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = g.this.f10064e.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.a.a) {
                        ((com.ss.android.download.api.download.a.a) next).a(downloadModel, downloadController, downloadEventConfig);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.a.a) {
                            ((com.ss.android.download.api.download.a.a) softReference.get()).a(downloadModel, downloadController, downloadEventConfig);
                        }
                    }
                }
            }
        });
    }

    public void a(final DownloadInfo downloadInfo, final BaseException baseException, final String str) {
        this.f10061b.post(new Runnable() { // from class: com.ss.android.downloadlib.g.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = g.this.f10064e.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.a.a) {
                        ((com.ss.android.download.api.download.a.a) next).a(downloadInfo, baseException, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.a.a) {
                            ((com.ss.android.download.api.download.a.a) softReference.get()).a(downloadInfo, baseException, str);
                        }
                    }
                }
            }
        });
    }

    public void a(final DownloadInfo downloadInfo, final String str) {
        this.f10061b.post(new Runnable() { // from class: com.ss.android.downloadlib.g.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = g.this.f10064e.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.a.a) {
                        ((com.ss.android.download.api.download.a.a) next).a(downloadInfo, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.a.a) {
                            ((com.ss.android.download.api.download.a.a) softReference.get()).a(downloadInfo, str);
                        }
                    }
                }
            }
        });
    }

    public void a(final DownloadInfo downloadInfo) {
        this.f10061b.post(new Runnable() { // from class: com.ss.android.downloadlib.g.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = g.this.f10064e.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof com.ss.android.download.api.download.a.a) {
                        ((com.ss.android.download.api.download.a.a) next).a(downloadInfo);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.a.a) {
                            ((com.ss.android.download.api.download.a.a) softReference.get()).a(downloadInfo);
                        }
                    }
                }
            }
        });
    }
}
