package com.ss.android.downloadlib;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.addownload.m;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f10127a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ss.android.download.api.a f10128b;

    /* renamed from: c, reason: collision with root package name */
    private final g f10129c;

    /* renamed from: d, reason: collision with root package name */
    private final com.ss.android.downloadad.api.a f10130d;

    /* renamed from: e, reason: collision with root package name */
    private com.ss.android.downloadad.api.b f10131e;

    /* renamed from: f, reason: collision with root package name */
    private long f10132f;

    /* JADX INFO: Access modifiers changed from: private */
    public g h() {
        return this.f10129c;
    }

    public void c() {
        this.f10132f = System.currentTimeMillis();
    }

    public com.ss.android.downloadad.api.a d() {
        return this.f10130d;
    }

    public com.ss.android.downloadad.api.b e() {
        if (this.f10131e == null) {
            this.f10131e = b.a();
        }
        return this.f10131e;
    }

    public String f() {
        return k.o();
    }

    public void g() {
        d.a().f();
    }

    private i(Context context) {
        this.f10129c = g.a();
        this.f10128b = new e();
        this.f10132f = System.currentTimeMillis();
        b(context);
        this.f10130d = a.a();
    }

    public static i a(final Context context) {
        if (f10127a == null) {
            synchronized (i.class) {
                if (f10127a == null) {
                    com.ss.android.downloadlib.e.b.a(new Runnable() { // from class: com.ss.android.downloadlib.i.1
                        @Override // java.lang.Runnable
                        public void run() {
                            i unused = i.f10127a = new i(context);
                        }
                    });
                }
            }
        }
        return f10127a;
    }

    private void b(Context context) {
        k.a(context);
        Downloader.getInstance(k.a());
        com.ss.android.downloadlib.addownload.b.f.a().b();
        com.ss.android.socialbase.appdownloader.d.j().a(k.a(), "misc_config", new com.ss.android.downloadlib.c.g(), new com.ss.android.downloadlib.c.f(context), new c());
        com.ss.android.downloadlib.c.d dVar = new com.ss.android.downloadlib.c.d();
        com.ss.android.socialbase.appdownloader.d.j().a(dVar);
        Downloader.getInstance(context).registerDownloadCacheSyncListener(dVar);
        com.ss.android.socialbase.appdownloader.d.j().a(new m());
        com.ss.android.socialbase.downloader.downloader.c.a(new com.ss.android.downloadlib.c.e());
        com.ss.android.socialbase.appdownloader.d.j().a(com.ss.android.downloadlib.f.c.a());
    }

    public com.ss.android.download.api.a a() {
        return this.f10128b;
    }

    public com.ss.android.download.api.a a(String str) {
        com.ss.android.download.api.config.f b5 = f.a().b();
        if (b5 != null && b5.a(str)) {
            return b5.b(str);
        }
        return this.f10128b;
    }

    public long b() {
        return this.f10132f;
    }

    @MainThread
    public void a(final Context context, final int i5, final DownloadStatusChangeListener downloadStatusChangeListener, final DownloadModel downloadModel) {
        com.ss.android.downloadlib.e.b.a(new Runnable() { // from class: com.ss.android.downloadlib.i.4
            @Override // java.lang.Runnable
            public void run() {
                i.this.h().a(context, i5, downloadStatusChangeListener, downloadModel);
            }
        });
    }

    public DownloadInfo b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.ss.android.socialbase.appdownloader.d.j().a(k.a(), str);
    }

    @MainThread
    public void a(final String str, final long j5, final int i5, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final OnItemClickListener onItemClickListener, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.e.b.a(new Runnable() { // from class: com.ss.android.downloadlib.i.5
            @Override // java.lang.Runnable
            public void run() {
                i.this.h().a(str, j5, i5, downloadEventConfig, downloadController, onItemClickListener, iDownloadButtonClickListener);
            }
        });
    }

    @MainThread
    public void a(final String str, final long j5, final int i5, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController) {
        com.ss.android.downloadlib.e.b.a(new Runnable() { // from class: com.ss.android.downloadlib.i.6
            @Override // java.lang.Runnable
            public void run() {
                i.this.h().a(str, j5, i5, downloadEventConfig, downloadController);
            }
        });
    }

    @MainThread
    public void a(final String str, final long j5, final int i5, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.e.b.a(new Runnable() { // from class: com.ss.android.downloadlib.i.7
            @Override // java.lang.Runnable
            public void run() {
                i.this.h().a(str, j5, i5, downloadEventConfig, downloadController, iDownloadButtonClickListener);
            }
        });
    }

    @MainThread
    public void a(final String str, final int i5) {
        com.ss.android.downloadlib.e.b.a(new Runnable() { // from class: com.ss.android.downloadlib.i.2
            @Override // java.lang.Runnable
            public void run() {
                i.this.h().a(str, i5);
            }
        });
    }

    @MainThread
    public void a(final String str, final boolean z4) {
        com.ss.android.downloadlib.e.b.a(new Runnable() { // from class: com.ss.android.downloadlib.i.3
            @Override // java.lang.Runnable
            public void run() {
                i.this.h().a(str, z4);
            }
        });
    }

    public void a(com.ss.android.download.api.download.a.a aVar) {
        h().a(aVar);
    }

    public DownloadInfo a(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str2) && z4) {
            return b(str);
        }
        return Downloader.getInstance(k.a()).getDownloadInfo(str, str2);
    }
}
