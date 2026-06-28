package com.ss.android.downloadlib.addownload;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ss.android.download.api.config.p;
import com.ss.android.download.api.config.q;
import com.ss.android.download.api.config.s;
import com.ss.android.download.api.config.u;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.a;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final JSONObject f9909a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    private static Context f9910b;

    /* renamed from: c, reason: collision with root package name */
    private static com.ss.android.download.api.config.g f9911c;

    /* renamed from: d, reason: collision with root package name */
    private static com.ss.android.download.api.config.c f9912d;

    /* renamed from: e, reason: collision with root package name */
    private static com.ss.android.download.api.config.l f9913e;

    /* renamed from: f, reason: collision with root package name */
    private static com.ss.android.download.api.config.h f9914f;

    /* renamed from: g, reason: collision with root package name */
    private static com.ss.android.download.api.config.i f9915g;

    /* renamed from: h, reason: collision with root package name */
    private static com.ss.android.download.api.config.j f9916h;

    /* renamed from: i, reason: collision with root package name */
    private static com.ss.android.download.api.model.a f9917i;

    /* renamed from: j, reason: collision with root package name */
    private static com.ss.android.download.api.config.b f9918j;

    /* renamed from: k, reason: collision with root package name */
    private static com.ss.android.socialbase.appdownloader.c.h f9919k;

    /* renamed from: l, reason: collision with root package name */
    private static com.ss.android.download.api.config.d f9920l;

    /* renamed from: m, reason: collision with root package name */
    private static com.ss.android.download.api.config.e f9921m;

    /* renamed from: n, reason: collision with root package name */
    private static com.ss.android.download.api.config.o f9922n;

    /* renamed from: o, reason: collision with root package name */
    private static com.ss.android.download.api.config.k f9923o;

    /* renamed from: p, reason: collision with root package name */
    private static u f9924p;

    /* renamed from: q, reason: collision with root package name */
    private static com.ss.android.download.api.config.n f9925q;

    /* renamed from: r, reason: collision with root package name */
    private static com.ss.android.download.api.config.m f9926r;

    /* renamed from: s, reason: collision with root package name */
    private static p f9927s;

    /* renamed from: t, reason: collision with root package name */
    private static com.ss.android.download.api.b.a f9928t;

    /* renamed from: u, reason: collision with root package name */
    private static q f9929u;

    /* renamed from: v, reason: collision with root package name */
    private static s f9930v;

    public static void a(Context context) {
        if (context != null && context.getApplicationContext() != null) {
            f9910b = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("Context is null");
    }

    public static void b(Context context) {
        if (f9910b != null || context == null || context.getApplicationContext() == null) {
            return;
        }
        f9910b = context.getApplicationContext();
    }

    @NonNull
    public static com.ss.android.download.api.config.c c() {
        if (f9912d == null) {
            f9912d = new com.ss.android.download.api.config.c() { // from class: com.ss.android.downloadlib.addownload.k.1
                @Override // com.ss.android.download.api.config.c
                public void a(@Nullable Context context, @NonNull DownloadModel downloadModel, @Nullable DownloadController downloadController, @Nullable DownloadEventConfig downloadEventConfig) {
                }

                @Override // com.ss.android.download.api.config.c
                public void a(@Nullable Context context, @NonNull DownloadModel downloadModel, @Nullable DownloadController downloadController, @Nullable DownloadEventConfig downloadEventConfig, String str, @NonNull String str2) {
                }
            };
        }
        return f9912d;
    }

    @NonNull
    public static com.ss.android.download.api.config.l d() {
        if (f9913e == null) {
            f9913e = new com.ss.android.download.api.a.a();
        }
        return f9913e;
    }

    public static com.ss.android.download.api.config.h e() {
        return f9914f;
    }

    @NonNull
    public static com.ss.android.download.api.config.i f() {
        if (f9915g == null) {
            f9915g = new com.ss.android.download.api.a.b();
        }
        return f9915g;
    }

    public static com.ss.android.socialbase.appdownloader.c.h g() {
        if (f9919k == null) {
            f9919k = new com.ss.android.socialbase.appdownloader.c.h() { // from class: com.ss.android.downloadlib.addownload.k.2
                @Override // com.ss.android.socialbase.appdownloader.c.h
                public void a(DownloadInfo downloadInfo, BaseException baseException, int i5) {
                }
            };
        }
        return f9919k;
    }

    public static com.ss.android.download.api.config.o h() {
        return f9922n;
    }

    @NonNull
    public static p i() {
        if (f9927s == null) {
            f9927s = new p() { // from class: com.ss.android.downloadlib.addownload.k.3
                @Override // com.ss.android.download.api.config.p
                public void a(String str, int i5, JSONObject jSONObject) {
                }
            };
        }
        return f9927s;
    }

    @NonNull
    public static JSONObject j() {
        com.ss.android.download.api.config.j jVar = f9916h;
        if (jVar != null && jVar.a() != null) {
            return f9916h.a();
        }
        return f9909a;
    }

    @NonNull
    public static com.ss.android.download.api.model.a k() {
        if (f9917i == null) {
            f9917i = new a.C0177a().a();
        }
        return f9917i;
    }

    public static com.ss.android.download.api.config.m l() {
        return f9926r;
    }

    @Nullable
    public static com.ss.android.download.api.config.b m() {
        return f9918j;
    }

    @Nullable
    public static com.ss.android.download.api.config.n n() {
        return f9925q;
    }

    public static String o() {
        return "1.7.0";
    }

    public static com.ss.android.download.api.config.d p() {
        return f9920l;
    }

    public static com.ss.android.download.api.config.e q() {
        return f9921m;
    }

    public static com.ss.android.download.api.config.k r() {
        return f9923o;
    }

    @NonNull
    public static q s() {
        return f9929u;
    }

    public static u t() {
        return f9924p;
    }

    @NonNull
    public static com.ss.android.download.api.b.a u() {
        if (f9928t == null) {
            f9928t = new com.ss.android.download.api.b.a() { // from class: com.ss.android.downloadlib.addownload.k.4
                @Override // com.ss.android.download.api.b.a
                public void a(Throwable th, String str) {
                }
            };
        }
        return f9928t;
    }

    @NonNull
    public static s v() {
        if (f9930v == null) {
            f9930v = new s() { // from class: com.ss.android.downloadlib.addownload.k.5
                @Override // com.ss.android.download.api.config.s
                public void a(@Nullable Context context, @NonNull DownloadModel downloadModel, @Nullable DownloadController downloadController, @Nullable DownloadEventConfig downloadEventConfig, String str, int i5) {
                }
            };
        }
        return f9930v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r0 > 29) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        return a().getExternalFilesDir(android.os.Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String w() {
        /*
            android.content.Context r0 = a()     // Catch: java.lang.Throwable -> L52
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L52
            int r0 = r0.targetSdkVersion     // Catch: java.lang.Throwable -> L52
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L52
            r2 = 29
            if (r1 < r2) goto L29
            if (r0 != r2) goto L18
            boolean r1 = com.ss.android.downloadlib.addownload.o.a()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L1a
        L18:
            if (r0 <= r2) goto L29
        L1a:
            android.content.Context r0 = a()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Throwable -> L52
            java.io.File r0 = r0.getExternalFilesDir(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L52
            return r0
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L52
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Throwable -> L52
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            org.json.JSONObject r1 = j()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "default_save_dir_name"
            java.lang.String r3 = "ByteDownload"
            java.lang.String r1 = r1.optString(r2, r3)     // Catch: java.lang.Throwable -> L52
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            return r0
        L52:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.k.w():java.lang.String");
    }

    public static boolean x() {
        return (f9911c == null || f9914f == null || f9916h == null || f9918j == null || f9929u == null) ? false : true;
    }

    public static com.ss.android.download.api.config.g b() {
        return f9911c;
    }

    public static Context a() {
        Context context = f9910b;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Context is null");
    }

    public static void a(@NonNull com.ss.android.download.api.config.g gVar) {
        f9911c = gVar;
    }

    public static void a(@NonNull com.ss.android.download.api.config.l lVar) {
        f9913e = lVar;
    }

    public static void a(@NonNull com.ss.android.download.api.config.h hVar) {
        f9914f = hVar;
    }

    public static void a(@NonNull com.ss.android.download.api.config.i iVar) {
        f9915g = iVar;
    }

    public static void a(@NonNull com.ss.android.download.api.config.j jVar) {
        f9916h = jVar;
    }

    public static void a(@NonNull com.ss.android.download.api.model.a aVar) {
        f9917i = aVar;
    }

    public static void a(@NonNull com.ss.android.download.api.config.b bVar) {
        f9918j = bVar;
    }

    public static void a(String str) {
        com.ss.android.socialbase.appdownloader.d.j().a(str);
    }

    public static void a(q qVar) {
        f9929u = qVar;
    }

    public static void a(com.ss.android.download.api.b.a aVar) {
        f9928t = aVar;
    }
}
