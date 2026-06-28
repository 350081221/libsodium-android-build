package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.config.t;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.download.c;
import com.ss.android.download.api.model.DownloadShortInfo;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.h;
import com.ss.android.downloadlib.g.n;
import com.ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e implements g, n.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9851a = "e";

    /* renamed from: b, reason: collision with root package name */
    private final com.ss.android.downloadlib.g.n f9852b;

    /* renamed from: c, reason: collision with root package name */
    private h f9853c;

    /* renamed from: d, reason: collision with root package name */
    private d f9854d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Context> f9855e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, Object> f9856f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadShortInfo f9857g;

    /* renamed from: h, reason: collision with root package name */
    private DownloadInfo f9858h;

    /* renamed from: i, reason: collision with root package name */
    private c f9859i;

    /* renamed from: j, reason: collision with root package name */
    private final IDownloadListener f9860j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9861k;

    /* renamed from: l, reason: collision with root package name */
    private long f9862l;

    /* renamed from: m, reason: collision with root package name */
    private String f9863m;

    /* renamed from: n, reason: collision with root package name */
    private long f9864n;

    /* renamed from: o, reason: collision with root package name */
    private DownloadModel f9865o;

    /* renamed from: p, reason: collision with root package name */
    private DownloadEventConfig f9866p;

    /* renamed from: q, reason: collision with root package name */
    private DownloadController f9867q;

    /* renamed from: r, reason: collision with root package name */
    private SoftReference<OnItemClickListener> f9868r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f9869s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f9870t;

    /* renamed from: u, reason: collision with root package name */
    private SoftReference<IDownloadButtonClickListener> f9871u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b {
        void a(long j5);
    }

    public e() {
        com.ss.android.downloadlib.g.n nVar = new com.ss.android.downloadlib.g.n(Looper.getMainLooper(), this);
        this.f9852b = nVar;
        this.f9856f = new ConcurrentHashMap();
        this.f9860j = new h.a(nVar);
        this.f9864n = -1L;
        this.f9865o = null;
        this.f9866p = null;
        this.f9867q = null;
        this.f9853c = new h(this);
        this.f9854d = new d(nVar);
        this.f9870t = com.ss.android.socialbase.downloader.g.a.c().a("ttdownloader_callback_twice");
    }

    private void k() {
        SoftReference<OnItemClickListener> softReference = this.f9868r;
        if (softReference != null && softReference.get() != null) {
            this.f9868r.get().onItemClick(this.f9865o, m(), n());
            this.f9868r = null;
        } else {
            k.c().a(l(), this.f9865o, n(), m());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context l() {
        WeakReference<Context> weakReference = this.f9855e;
        if (weakReference != null && weakReference.get() != null) {
            return this.f9855e.get();
        }
        return k.a();
    }

    @NonNull
    private DownloadEventConfig m() {
        DownloadEventConfig downloadEventConfig = this.f9866p;
        return downloadEventConfig == null ? new c.a().a() : downloadEventConfig;
    }

    @NonNull
    private DownloadController n() {
        if (this.f9867q == null) {
            this.f9867q = new com.ss.android.download.api.download.b();
        }
        return this.f9867q;
    }

    private void o() {
        String str = f9851a;
        com.ss.android.downloadlib.g.k.a(str, "pICD", null);
        if (this.f9853c.d(this.f9858h)) {
            com.ss.android.downloadlib.g.k.a(str, "pICD BC", null);
            f(false);
        } else {
            com.ss.android.downloadlib.g.k.a(str, "pICD IC", null);
            k();
        }
    }

    private boolean p() {
        if (com.ss.android.socialbase.downloader.g.a.c().a("fix_click_start")) {
            DownloadInfo downloadInfo = this.f9858h;
            if (downloadInfo == null) {
                return true;
            }
            if ((downloadInfo.getStatus() == -3 && this.f9858h.getCurBytes() <= 0) || this.f9858h.getStatus() == 0 || this.f9858h.getStatus() == -4) {
                return true;
            }
            if (!com.ss.android.socialbase.downloader.i.f.a(this.f9858h.getStatus(), this.f9858h.getSavePath(), this.f9858h.getName())) {
                return false;
            }
            return true;
        }
        DownloadInfo downloadInfo2 = this.f9858h;
        if (downloadInfo2 == null) {
            return true;
        }
        if ((downloadInfo2.getStatus() == -3 || Downloader.getInstance(k.a()).canResume(this.f9858h.getId())) && this.f9858h.getStatus() != 0) {
            return false;
        }
        return true;
    }

    private void q() {
        c cVar = this.f9859i;
        if (cVar != null && cVar.getStatus() != AsyncTask.Status.FINISHED) {
            this.f9859i.cancel(true);
        }
        this.f9859i = new c();
        if (!TextUtils.isEmpty(this.f9863m)) {
            com.ss.android.downloadlib.g.b.a(this.f9859i, this.f9865o.getDownloadUrl(), this.f9865o.getPackageName(), this.f9863m);
        } else {
            com.ss.android.downloadlib.g.b.a(this.f9859i, this.f9865o.getDownloadUrl(), this.f9865o.getPackageName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadShortInfo r() {
        if (this.f9857g == null) {
            this.f9857g = new DownloadShortInfo();
        }
        return this.f9857g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final boolean z4) {
        this.f9854d.a(new com.ss.android.downloadlib.addownload.b.e(this.f9864n, this.f9865o, m(), n()));
        this.f9854d.a(0, 0L, 0L, new a() { // from class: com.ss.android.downloadlib.addownload.e.9
            @Override // com.ss.android.downloadlib.addownload.e.a
            public void a() {
                if (!e.this.f9854d.a()) {
                    e.this.h(z4);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z4) {
        Iterator<DownloadStatusChangeListener> it = h.a(this.f9856f).iterator();
        while (it.hasNext()) {
            it.next().onDownloadStart(this.f9865o, n());
        }
        int a5 = this.f9853c.a(k.a(), this.f9860j);
        String str = f9851a;
        com.ss.android.downloadlib.g.k.a(str, "beginDown id:" + a5, null);
        if (a5 != 0) {
            if (this.f9858h != null && !com.ss.android.socialbase.downloader.g.a.c().a("fix_click_start")) {
                this.f9853c.a(this.f9858h, false);
            } else if (z4) {
                this.f9853c.a();
            }
        } else {
            DownloadInfo a6 = new DownloadInfo.a(this.f9865o.getDownloadUrl()).a();
            a6.setStatus(-1);
            a(a6);
            com.ss.android.downloadlib.d.a.a().a(this.f9864n, new BaseException(2, "start download failed, id=0"));
            com.ss.android.downloadlib.e.c.a().b("beginDown");
        }
        if (this.f9853c.a(c())) {
            com.ss.android.downloadlib.g.k.a(str, "beginDown IC id:" + a5, null);
            k();
        }
    }

    public boolean c() {
        DownloadInfo downloadInfo = this.f9858h;
        return (downloadInfo == null || downloadInfo.getStatus() == 0) ? false : true;
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public long d() {
        return this.f9862l;
    }

    public boolean e() {
        return k.j().optInt("quick_app_enable_switch", 0) == 0 && this.f9865o.getQuickAppModel() != null && !TextUtils.isEmpty(this.f9865o.getQuickAppModel().a()) && com.ss.android.downloadlib.addownload.c.a(this.f9858h) && com.ss.android.downloadlib.g.m.a(l(), new Intent("android.intent.action.VIEW", Uri.parse(this.f9865o.getQuickAppModel().a())));
    }

    public void f() {
        this.f9852b.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.e.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator<DownloadStatusChangeListener> it = h.a((Map<Integer, Object>) e.this.f9856f).iterator();
                while (it.hasNext()) {
                    it.next().onInstalled(e.this.r());
                }
            }
        });
    }

    public boolean i() {
        SoftReference<IDownloadButtonClickListener> softReference = this.f9871u;
        if (softReference == null) {
            return false;
        }
        return i.a(this.f9865o, softReference.get());
    }

    private boolean c(int i5) {
        if (!e()) {
            return false;
        }
        String a5 = this.f9865o.getQuickAppModel().a();
        int i6 = i5 != 1 ? i5 != 2 ? -1 : 4 : 5;
        DownloadModel downloadModel = this.f9865o;
        if (downloadModel instanceof AdDownloadModel) {
            ((AdDownloadModel) downloadModel).setFunnelType(3);
        }
        boolean c5 = com.ss.android.downloadlib.g.i.c(k.a(), a5);
        if (c5) {
            com.ss.android.downloadlib.d.a.a().a(this.f9864n, i5);
            Message obtain = Message.obtain();
            obtain.what = i6;
            obtain.obj = Long.valueOf(this.f9865o.getId());
            com.ss.android.downloadlib.addownload.c.a().a(this, i6, this.f9865o);
        } else {
            com.ss.android.downloadlib.d.a.a().a(this.f9864n, false, 0);
        }
        return c5;
    }

    private void f(final boolean z4) {
        DownloadModel downloadModel;
        DownloadController downloadController;
        DownloadController downloadController2;
        String str = f9851a;
        com.ss.android.downloadlib.g.k.a(str, "pBCD", null);
        if (p()) {
            com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(this.f9864n);
            if (this.f9869s) {
                if (i()) {
                    if (d(false) && (downloadController2 = e5.f9661d) != null && downloadController2.isAutoDownloadOnCardShow()) {
                        a(z4, true);
                        return;
                    }
                    return;
                }
                a(z4, true);
                return;
            }
            if (this.f9865o.isAd() && (downloadController = e5.f9661d) != null && downloadController.enableShowComplianceDialog() && e5.f9659b != null && com.ss.android.downloadlib.addownload.compliance.b.a().a(e5.f9659b) && com.ss.android.downloadlib.addownload.compliance.b.a().a(e5)) {
                return;
            }
            a(z4, true);
            return;
        }
        com.ss.android.downloadlib.g.k.a(str, "pBCD continue download, status:" + this.f9858h.getStatus(), null);
        DownloadInfo downloadInfo = this.f9858h;
        if (downloadInfo != null && (downloadModel = this.f9865o) != null) {
            downloadInfo.setOnlyWifi(downloadModel.isNeedWifi());
        }
        final int status = this.f9858h.getStatus();
        final int id = this.f9858h.getId();
        final com.ss.android.downloadad.api.a.b a5 = com.ss.android.downloadlib.addownload.b.f.a().a(this.f9858h);
        if (status != -2 && status != -1) {
            if (n.a(status)) {
                if (this.f9865o.enablePause()) {
                    this.f9854d.a(true);
                    com.ss.android.downloadlib.c.h.a().b(com.ss.android.downloadlib.addownload.b.f.a().d(this.f9864n));
                    if (com.ss.android.downloadlib.g.e.a((com.ss.android.downloadad.api.a.a) a5).a("cancel_pause_optimise_switch", 0) == 1) {
                        com.ss.android.downloadlib.addownload.d.d.a().a(a5, status, new com.ss.android.downloadlib.addownload.d.h() { // from class: com.ss.android.downloadlib.addownload.e.6
                            @Override // com.ss.android.downloadlib.addownload.d.h
                            public void a(com.ss.android.downloadad.api.a.b bVar) {
                                if (e.this.f9858h == null && com.ss.android.socialbase.downloader.g.a.c().a("fix_handle_pause")) {
                                    e.this.f9858h = Downloader.getInstance(k.a()).getDownloadInfo(id);
                                }
                                e.this.f9853c.a(e.this.f9858h, z4);
                                if (e.this.f9858h != null && com.ss.android.socialbase.downloader.i.f.b(k.a()) && e.this.f9858h.isPauseReserveOnWifi()) {
                                    e.this.f9858h.stopPauseReserveOnWifi();
                                    com.ss.android.downloadlib.d.a.a().a("cancel_pause_reserve_wifi_cancel_on_wifi", a5);
                                } else {
                                    e eVar = e.this;
                                    eVar.a(id, status, eVar.f9858h);
                                }
                            }
                        }, new com.ss.android.downloadlib.addownload.a.c() { // from class: com.ss.android.downloadlib.addownload.e.5
                            @Override // com.ss.android.downloadlib.addownload.a.c
                            public void a() {
                                e.this.a(true);
                            }
                        });
                        return;
                    } else {
                        com.ss.android.downloadlib.addownload.d.k.a().a(a5, status, new com.ss.android.downloadlib.addownload.d.h() { // from class: com.ss.android.downloadlib.addownload.e.7
                            @Override // com.ss.android.downloadlib.addownload.d.h
                            public void a(com.ss.android.downloadad.api.a.b bVar) {
                                if (e.this.f9858h == null && com.ss.android.socialbase.downloader.g.a.c().a("fix_handle_pause")) {
                                    e.this.f9858h = Downloader.getInstance(k.a()).getDownloadInfo(id);
                                }
                                e.this.f9853c.a(e.this.f9858h, z4);
                                if (e.this.f9858h != null && com.ss.android.socialbase.downloader.i.f.b(k.a()) && e.this.f9858h.isPauseReserveOnWifi()) {
                                    e.this.f9858h.stopPauseReserveOnWifi();
                                    com.ss.android.downloadlib.d.a.a().b("pause_reserve_wifi_cancel_on_wifi", a5);
                                } else {
                                    e eVar = e.this;
                                    eVar.a(id, status, eVar.f9858h);
                                }
                            }
                        });
                        return;
                    }
                }
                return;
            }
            this.f9853c.a(this.f9858h, z4);
            a(id, status, this.f9858h);
            return;
        }
        this.f9853c.a(this.f9858h, z4);
        if (a5 != null) {
            a5.h(System.currentTimeMillis());
            a5.i(this.f9858h.getCurBytes());
        }
        this.f9858h.setDownloadFromReserveWifi(false);
        this.f9854d.a(new com.ss.android.downloadlib.addownload.b.e(this.f9864n, this.f9865o, m(), n()));
        this.f9854d.a(id, this.f9858h.getCurBytes(), this.f9858h.getTotalBytes(), new a() { // from class: com.ss.android.downloadlib.addownload.e.3
            @Override // com.ss.android.downloadlib.addownload.e.a
            public void a() {
                if (e.this.f9854d.a()) {
                    return;
                }
                e eVar = e.this;
                eVar.a(id, status, eVar.f9858h);
            }
        });
        if (status == -2 && com.ss.android.downloadlib.g.e.a((com.ss.android.downloadad.api.a.a) a5).a("show_pause_continue_toast", 0) == 1) {
            com.ss.android.downloadlib.g.a().b().postDelayed(new Runnable() { // from class: com.ss.android.downloadlib.addownload.e.4
                @Override // java.lang.Runnable
                public void run() {
                    k.d().a(13, k.a(), e.this.f9865o, "已恢复下载", null, 0);
                }
            }, 500L);
        }
    }

    public boolean d(boolean z4) {
        SoftReference<IDownloadButtonClickListener> softReference = this.f9871u;
        if (softReference != null && softReference.get() != null) {
            try {
                if (!z4) {
                    this.f9871u.get().handleComplianceDialog(true);
                } else {
                    this.f9871u.get().handleMarketFailedComplianceDialog();
                }
                this.f9871u = null;
                return true;
            } catch (Exception unused) {
                com.ss.android.downloadlib.e.c.a().b("mDownloadButtonClickListener has recycled");
                return false;
            }
        }
        com.ss.android.downloadlib.e.c.a().b("mDownloadButtonClickListener has recycled");
        return false;
    }

    public void g() {
        if (this.f9856f.size() == 0) {
            return;
        }
        Iterator<DownloadStatusChangeListener> it = h.a(this.f9856f).iterator();
        while (it.hasNext()) {
            it.next().onIdle();
        }
        DownloadInfo downloadInfo = this.f9858h;
        if (downloadInfo != null) {
            downloadInfo.setStatus(-4);
        }
    }

    @Override // com.ss.android.downloadlib.addownload.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e b(Context context) {
        if (context != null) {
            this.f9855e = new WeakReference<>(context);
        }
        k.b(context);
        return this;
    }

    private void e(boolean z4) {
        if (com.ss.android.downloadlib.g.e.b(this.f9865o).b("notification_opt_2") == 1 && this.f9858h != null) {
            com.ss.android.socialbase.downloader.notification.b.a().f(this.f9858h.getId());
        }
        f(z4);
    }

    @Override // com.ss.android.downloadlib.addownload.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e b(int i5, DownloadStatusChangeListener downloadStatusChangeListener) {
        if (downloadStatusChangeListener != null) {
            if (k.j().optInt("back_use_softref_listener") == 1) {
                this.f9856f.put(Integer.valueOf(i5), downloadStatusChangeListener);
            } else if (k.j().optInt("use_weakref_listener") == 1) {
                this.f9856f.put(Integer.valueOf(i5), new WeakReference(downloadStatusChangeListener));
            } else {
                this.f9856f.put(Integer.valueOf(i5), new SoftReference(downloadStatusChangeListener));
            }
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public boolean b() {
        return this.f9861k;
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public void b(final int i5) {
        if (i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("error actionType");
        }
        this.f9853c.a(this.f9864n);
        if (!com.ss.android.downloadlib.addownload.b.f.a().e(this.f9864n).y()) {
            com.ss.android.downloadlib.e.c.a().a("handleDownload ModelBox !isStrictValid");
        }
        if (this.f9853c.a(i5, this.f9865o)) {
            com.ss.android.downloadlib.addownload.compliance.f.a().a(this.f9853c.f9898a, new com.ss.android.downloadlib.addownload.compliance.h() { // from class: com.ss.android.downloadlib.addownload.e.1
                @Override // com.ss.android.downloadlib.addownload.compliance.h
                public void a(String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("download_miui_new_market", 1);
                        jSONObject.putOpt("download_miui_market_deeplink", str);
                        if (!com.ss.android.downloadlib.g.h.a(e.this.l(), e.this.f9853c.f9898a, str, jSONObject, true, i5)) {
                            jSONObject.putOpt("download_miui_jump_market_success", 0);
                            com.ss.android.downloadlib.addownload.compliance.f.a().a(1, e.this.f9853c.f9898a, jSONObject);
                            int i6 = i5;
                            if (i6 == 1) {
                                com.ss.android.socialbase.downloader.c.a.a(e.f9851a, "miui new rollback fail: handleDownload id:" + e.this.f9864n + ",tryPerformButtonClick:", null);
                                e.this.c(true);
                            } else if (i6 == 2) {
                                com.ss.android.socialbase.downloader.c.a.a(e.f9851a, "miui new rollback fail: handleDownload id:" + e.this.f9864n + ",tryPerformButtonClick:", null);
                                e.this.b(true);
                            }
                        } else {
                            jSONObject.putOpt("download_miui_jump_market_success", 1);
                            com.ss.android.downloadlib.addownload.compliance.f.a().a(0, e.this.f9853c.f9898a, jSONObject);
                        }
                    } catch (Exception e5) {
                        com.ss.android.downloadlib.e.c.a().a(e5, "generate miui new market param error");
                    }
                }

                @Override // com.ss.android.downloadlib.addownload.compliance.h
                public void a() {
                    int i6 = i5;
                    if (i6 == 1) {
                        com.ss.android.socialbase.downloader.c.a.a(e.f9851a, "miui new get miui deeplink fail: handleDownload id:" + e.this.f9864n + ",tryPerformButtonClick:", null);
                        e.this.c(true);
                        return;
                    }
                    if (i6 != 2) {
                        return;
                    }
                    com.ss.android.socialbase.downloader.c.a.a(e.f9851a, "miui new get miui deeplink fail: handleDownload id:" + e.this.f9864n + ",tryPerformButtonClick:", null);
                    e.this.b(true);
                }
            });
            return;
        }
        if (this.f9853c.a(l(), i5, this.f9869s)) {
            return;
        }
        boolean c5 = c(i5);
        if (i5 == 1) {
            if (c5) {
                return;
            }
            com.ss.android.downloadlib.g.k.a(f9851a, "handleDownload id:" + this.f9864n + ",pIC:", null);
            c(true);
            return;
        }
        if (i5 == 2 && !c5) {
            com.ss.android.downloadlib.g.k.a(f9851a, "handleDownload id:" + this.f9864n + ",pBC:", null);
            b(true);
        }
    }

    @Override // com.ss.android.downloadlib.addownload.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e b(DownloadModel downloadModel) {
        if (downloadModel != null) {
            if (downloadModel.isAd()) {
                if (downloadModel.getId() <= 0 || TextUtils.isEmpty(downloadModel.getLogExtra())) {
                    com.ss.android.downloadlib.e.c.a().a("setDownloadModel ad error");
                }
            } else if (downloadModel.getId() == 0 && (downloadModel instanceof AdDownloadModel)) {
                com.ss.android.downloadlib.e.c.a().a(false, "setDownloadModel id=0");
                if (com.ss.android.socialbase.downloader.g.a.c().a("fix_model_id")) {
                    ((AdDownloadModel) downloadModel).setId(downloadModel.getDownloadUrl().hashCode());
                }
            }
            com.ss.android.downloadlib.addownload.b.f.a().a(downloadModel);
            this.f9864n = downloadModel.getId();
            this.f9865o = downloadModel;
            if (i.a(downloadModel)) {
                ((AdDownloadModel) downloadModel).setExtraValue(3L);
                com.ss.android.downloadad.api.a.b d5 = com.ss.android.downloadlib.addownload.b.f.a().d(this.f9864n);
                if (d5 != null && d5.l() != 3) {
                    d5.e(3L);
                    com.ss.android.downloadlib.addownload.b.i.a().a(d5);
                }
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c extends AsyncTask<String, Void, DownloadInfo> {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadInfo doInBackground(String... strArr) {
            DownloadInfo downloadInfo = null;
            if (strArr == null) {
                return null;
            }
            if (strArr.length >= 1 && TextUtils.isEmpty(strArr[0])) {
                return null;
            }
            String str = (strArr.length < 3 || TextUtils.isEmpty(strArr[2])) ? "" : strArr[2];
            String str2 = strArr[0];
            if (e.this.f9865o != null && !TextUtils.isEmpty(e.this.f9865o.getFilePath())) {
                if (TextUtils.isEmpty(str)) {
                    downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(str2, e.this.f9865o.getFilePath());
                } else {
                    downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(Downloader.getInstance(k.a()).getDownloadId(str, e.this.f9865o.getFilePath()));
                }
            }
            if (downloadInfo != null) {
                return downloadInfo;
            }
            if (!TextUtils.isEmpty(str)) {
                return com.ss.android.socialbase.appdownloader.d.j().a(k.a(), str);
            }
            return com.ss.android.socialbase.appdownloader.d.j().a(k.a(), str2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(DownloadInfo downloadInfo) {
            super.onPostExecute(downloadInfo);
            if (isCancelled() || e.this.f9865o == null) {
                return;
            }
            try {
                com.ss.android.downloadlib.addownload.b.c a5 = com.ss.android.downloadlib.g.m.a(e.this.f9865o.getPackageName(), e.this.f9865o.getVersionCode(), e.this.f9865o.getVersionName());
                com.ss.android.downloadlib.addownload.b.h.a().a(e.this.f9865o.getVersionCode(), a5.b(), com.ss.android.downloadlib.addownload.b.f.a().a(downloadInfo));
                boolean a6 = a5.a();
                if (downloadInfo != null && downloadInfo.getId() != 0 && (a6 || !Downloader.getInstance(k.a()).isDownloadSuccessAndFileNotExist(downloadInfo))) {
                    Downloader.getInstance(k.a()).removeTaskMainListener(downloadInfo.getId());
                    if (e.this.f9858h == null || e.this.f9858h.getStatus() != -4) {
                        e.this.f9858h = downloadInfo;
                        if (e.this.f9870t) {
                            Downloader.getInstance(k.a()).setMainThreadListener(e.this.f9858h.getId(), e.this.f9860j, false);
                        } else {
                            Downloader.getInstance(k.a()).setMainThreadListener(e.this.f9858h.getId(), e.this.f9860j);
                        }
                    } else {
                        e.this.f9858h = null;
                    }
                    e.this.f9853c.a(e.this.f9858h, e.this.r(), h.a((Map<Integer, Object>) e.this.f9856f), a6);
                } else {
                    if (downloadInfo != null && Downloader.getInstance(k.a()).isDownloadSuccessAndFileNotExist(downloadInfo)) {
                        com.ss.android.socialbase.downloader.notification.b.a().f(downloadInfo.getId());
                        e.this.f9858h = null;
                    }
                    if (e.this.f9858h != null) {
                        Downloader.getInstance(k.a()).removeTaskMainListener(e.this.f9858h.getId());
                        if (e.this.f9870t) {
                            Downloader.getInstance(e.this.l()).setMainThreadListener(e.this.f9858h.getId(), e.this.f9860j, false);
                        } else {
                            Downloader.getInstance(e.this.l()).setMainThreadListener(e.this.f9858h.getId(), e.this.f9860j);
                        }
                    }
                    if (!a6) {
                        Iterator<DownloadStatusChangeListener> it = h.a((Map<Integer, Object>) e.this.f9856f).iterator();
                        while (it.hasNext()) {
                            it.next().onIdle();
                        }
                        e.this.f9858h = null;
                    } else {
                        e eVar = e.this;
                        eVar.f9858h = new DownloadInfo.a(eVar.f9865o.getDownloadUrl()).a();
                        e.this.f9858h.setStatus(-3);
                        e.this.f9853c.a(e.this.f9858h, e.this.r(), h.a((Map<Integer, Object>) e.this.f9856f), a6);
                    }
                }
                e.this.f9853c.c(e.this.f9858h);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void c(boolean z4) {
        if (z4) {
            com.ss.android.downloadlib.d.a.a().a(this.f9864n, 1);
        }
        o();
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public void h() {
        com.ss.android.downloadlib.addownload.b.f.a().f(this.f9864n);
    }

    public void b(boolean z4) {
        e(z4);
    }

    @Override // com.ss.android.downloadlib.addownload.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e b(DownloadController downloadController) {
        JSONObject extra;
        this.f9867q = downloadController;
        if (com.ss.android.downloadlib.g.e.b(this.f9865o).b("force_auto_open") == 1) {
            n().setLinkMode(1);
        }
        if (com.ss.android.socialbase.downloader.g.a.c().a("fix_show_dialog") && (extra = this.f9865o.getExtra()) != null && extra.optInt("subprocess") > 0) {
            n().setEnableNewActivity(false);
        }
        com.ss.android.downloadlib.addownload.b.f.a().a(this.f9864n, n());
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e b(DownloadEventConfig downloadEventConfig) {
        this.f9866p = downloadEventConfig;
        this.f9869s = m().getDownloadScene() == 0;
        com.ss.android.downloadlib.addownload.b.f.a().a(this.f9864n, m());
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public g a(OnItemClickListener onItemClickListener) {
        if (onItemClickListener == null) {
            this.f9868r = null;
        } else {
            this.f9868r = new SoftReference<>(onItemClickListener);
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public void a() {
        this.f9861k = true;
        com.ss.android.downloadlib.addownload.b.f.a().a(this.f9864n, m());
        com.ss.android.downloadlib.addownload.b.f.a().a(this.f9864n, n());
        this.f9853c.a(this.f9864n);
        q();
        if (k.j().optInt("enable_empty_listener", 1) == 1 && this.f9856f.get(Integer.MIN_VALUE) == null) {
            b(Integer.MIN_VALUE, new com.ss.android.download.api.config.a());
        }
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public boolean a(int i5) {
        if (i5 == 0) {
            this.f9856f.clear();
        } else {
            this.f9856f.remove(Integer.valueOf(i5));
        }
        if (this.f9856f.isEmpty()) {
            this.f9861k = false;
            this.f9862l = System.currentTimeMillis();
            if (this.f9858h != null) {
                Downloader.getInstance(k.a()).removeTaskMainListener(this.f9858h.getId());
            }
            c cVar = this.f9859i;
            if (cVar != null && cVar.getStatus() != AsyncTask.Status.FINISHED) {
                this.f9859i.cancel(true);
            }
            this.f9853c.a(this.f9858h);
            String str = f9851a;
            StringBuilder sb = new StringBuilder();
            sb.append("onUnbind removeCallbacksAndMessages, downloadUrl:");
            DownloadInfo downloadInfo = this.f9858h;
            sb.append(downloadInfo == null ? "" : downloadInfo.getUrl());
            com.ss.android.downloadlib.g.k.a(str, sb.toString(), null);
            this.f9852b.removeCallbacksAndMessages(null);
            this.f9857g = null;
            this.f9858h = null;
            return true;
        }
        if (this.f9856f.size() == 1 && this.f9856f.containsKey(Integer.MIN_VALUE)) {
            this.f9853c.b(this.f9858h);
        }
        return false;
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public void a(boolean z4) {
        if (this.f9858h != null) {
            if (z4) {
                com.ss.android.socialbase.appdownloader.c.d b5 = com.ss.android.socialbase.appdownloader.d.j().b();
                if (b5 != null) {
                    b5.a(this.f9858h);
                }
                Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).cancel(this.f9858h.getId(), true);
                return;
            }
            Intent intent = new Intent(k.a(), (Class<?>) DownloadHandlerService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_DELETE");
            intent.putExtra("extra_click_download_ids", this.f9858h.getId());
            k.a().startService(intent);
        }
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public g a(long j5) {
        if (j5 != 0) {
            DownloadModel a5 = com.ss.android.downloadlib.addownload.b.f.a().a(j5);
            if (a5 != null) {
                this.f9865o = a5;
                this.f9864n = j5;
                this.f9853c.a(j5);
            }
        } else {
            com.ss.android.downloadlib.e.c.a().a(false, "setModelId");
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.g.n.a
    public void a(Message message) {
        if (message != null && this.f9861k && message.what == 3) {
            this.f9858h = (DownloadInfo) message.obj;
            this.f9853c.a(message, r(), this.f9856f);
        }
    }

    public void a(boolean z4, final boolean z5) {
        if (z4) {
            com.ss.android.downloadlib.d.a.a().a(this.f9864n, 2);
        }
        if (!com.ss.android.downloadlib.g.m.a()) {
            if (!com.ss.android.downloadlib.g.j.b("android.permission.WRITE_EXTERNAL_STORAGE") && !n().enableNewActivity()) {
                this.f9865o.setFilePath(this.f9853c.b());
            }
        } else if (!com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_IMAGES") && !com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_AUDIO") && !com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_VIDEO") && !n().enableNewActivity()) {
            this.f9865o.setFilePath(this.f9853c.b());
        }
        if (com.ss.android.downloadlib.g.e.c(this.f9865o) == 0) {
            com.ss.android.downloadlib.g.k.a(f9851a, "pBCD not start", null);
            this.f9853c.a(new t() { // from class: com.ss.android.downloadlib.addownload.e.8
                @Override // com.ss.android.download.api.config.t
                public void a() {
                    com.ss.android.downloadlib.g.k.a(e.f9851a, "pBCD start download", null);
                    e.this.g(z5);
                }

                @Override // com.ss.android.download.api.config.t
                public void a(String str) {
                    com.ss.android.downloadlib.g.k.a(e.f9851a, "pBCD onDenied", null);
                }
            });
        } else {
            g(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, int i6, @NonNull DownloadInfo downloadInfo) {
        if (com.ss.android.socialbase.downloader.g.a.c().a("fix_click_start")) {
            if (i6 != -3 && !com.ss.android.socialbase.downloader.downloader.d.a().e(i5)) {
                a(false, false);
                return;
            } else {
                com.ss.android.socialbase.appdownloader.d.j().a(k.a(), i5, i6);
                return;
            }
        }
        com.ss.android.socialbase.appdownloader.d.j().a(k.a(), i5, i6);
    }

    private void a(DownloadInfo downloadInfo) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.obj = downloadInfo;
        this.f9852b.sendMessage(obtain);
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public g a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f9863m = str;
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.g
    public g a(IDownloadButtonClickListener iDownloadButtonClickListener) {
        if (iDownloadButtonClickListener == null) {
            this.f9871u = null;
        } else {
            this.f9871u = new SoftReference<>(iDownloadButtonClickListener);
        }
        return this;
    }
}
