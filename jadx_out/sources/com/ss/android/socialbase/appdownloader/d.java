package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Environment;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.c.m;
import com.ss.android.socialbase.appdownloader.c.o;
import com.ss.android.socialbase.downloader.depend.ad;
import com.ss.android.socialbase.downloader.depend.ag;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.impls.r;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10223a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f10224b = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f10225f = false;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f10226g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f10227h = false;

    /* renamed from: c, reason: collision with root package name */
    private String f10228c;

    /* renamed from: d, reason: collision with root package name */
    private String f10229d;

    /* renamed from: i, reason: collision with root package name */
    private Future f10231i;

    /* renamed from: j, reason: collision with root package name */
    private int f10232j;

    /* renamed from: m, reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.c.c f10235m;

    /* renamed from: n, reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.c.d f10236n;

    /* renamed from: o, reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.c.h f10237o;

    /* renamed from: p, reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.c.g f10238p;

    /* renamed from: q, reason: collision with root package name */
    private m f10239q;

    /* renamed from: r, reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.c.f f10240r;

    /* renamed from: s, reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.c.j f10241s;

    /* renamed from: t, reason: collision with root package name */
    private ad f10242t;

    /* renamed from: u, reason: collision with root package name */
    private ag f10243u;

    /* renamed from: v, reason: collision with root package name */
    private o f10244v;

    /* renamed from: e, reason: collision with root package name */
    private DownloadReceiver f10230e = new DownloadReceiver();

    /* renamed from: k, reason: collision with root package name */
    private boolean f10233k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10234l = false;

    private d() {
    }

    public static d j() {
        if (f10224b == null) {
            synchronized (d.class) {
                if (f10224b == null) {
                    f10224b = new d();
                }
            }
        }
        return f10224b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        synchronized (this.f10230e) {
            if (f10226g) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.ss.intent.action.DOWNLOAD_COMPLETE");
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.MEDIA_MOUNTED");
                intentFilter2.addDataScheme("file");
                com.ss.android.socialbase.downloader.downloader.c.O().registerReceiver(this.f10230e, intentFilter);
                com.ss.android.socialbase.downloader.downloader.c.O().registerReceiver(this.f10230e, intentFilter2);
                f10226g = true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            com.ss.android.socialbase.downloader.c.a.b(f10223a, "registerDownloadReceiver mIsRegistered:" + f10226g);
        }
    }

    private void t() {
        r.a(new r.b() { // from class: com.ss.android.socialbase.appdownloader.d.3
            @Override // com.ss.android.socialbase.downloader.impls.r.b
            public void a(DownloadInfo downloadInfo, long j5, boolean z4, int i5) {
                RetryJobSchedulerService.a(downloadInfo, j5, z4, i5);
            }
        });
    }

    public com.ss.android.socialbase.appdownloader.c.h c() {
        return this.f10237o;
    }

    public String d() {
        return this.f10229d;
    }

    public com.ss.android.socialbase.appdownloader.c.f e() {
        return this.f10240r;
    }

    public boolean f() {
        return com.ss.android.socialbase.downloader.g.a.b().optInt("package_flag_config", 1) == 1;
    }

    public com.ss.android.socialbase.appdownloader.c.j g() {
        return this.f10241s;
    }

    public File h() {
        return Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).getGlobalSaveDir();
    }

    public String i() {
        return this.f10228c;
    }

    public void k() {
        if (com.ss.android.socialbase.downloader.g.a.c().a("enable_app_install_receiver", 1) <= 0) {
            com.ss.android.socialbase.downloader.c.a.b(f10223a, "disable app install receiver");
            return;
        }
        synchronized (this.f10230e) {
            try {
                if (f10227h) {
                    return;
                }
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addDataScheme("package");
                    com.ss.android.socialbase.downloader.downloader.c.O().registerReceiver(this.f10230e, intentFilter);
                    f10227h = true;
                    o oVar = this.f10244v;
                    if (oVar != null) {
                        oVar.a();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                com.ss.android.socialbase.downloader.c.a.b(f10223a, "tryRegisterTempAppInstallDownloadReceiver mIsAppInstallRegistered:" + f10226g);
            } finally {
                b(0);
            }
        }
    }

    public void l() {
        o oVar;
        synchronized (this.f10230e) {
            try {
                if (f10226g) {
                    com.ss.android.socialbase.downloader.downloader.c.O().unregisterReceiver(this.f10230e);
                    if (f10227h && (oVar = this.f10244v) != null) {
                        oVar.b();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            f10226g = false;
            f10227h = false;
        }
        com.ss.android.socialbase.downloader.c.a.b(f10223a, "registerDownloadReceiver unRegisterDownloadReceiver");
    }

    public m m() {
        return this.f10239q;
    }

    public com.ss.android.socialbase.appdownloader.c.g n() {
        return this.f10238p;
    }

    public com.ss.android.socialbase.downloader.downloader.r o() {
        return Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).getReserveWifiStatusListener();
    }

    public ad p() {
        return this.f10242t;
    }

    public ag q() {
        return this.f10243u;
    }

    private void c(Context context) {
        if (context == null || f10225f) {
            return;
        }
        com.ss.android.socialbase.downloader.constants.e.a("application/vnd.android.package-archive");
        com.ss.android.socialbase.downloader.downloader.c.a(context);
        com.ss.android.socialbase.downloader.downloader.c.a(new com.ss.android.socialbase.appdownloader.d.b());
        if (this.f10234l) {
            com.ss.android.socialbase.downloader.downloader.c.a(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.s();
                }
            }, 5L, TimeUnit.SECONDS);
        } else {
            s();
        }
        t();
        f10225f = true;
    }

    public com.ss.android.socialbase.appdownloader.c.d b() {
        return this.f10236n;
    }

    public com.ss.android.socialbase.appdownloader.c.c a() {
        return this.f10235m;
    }

    public void b(String str) {
        Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).setDefaultSavePath(str);
    }

    private void b(int i5) {
        this.f10232j = com.ss.android.socialbase.downloader.g.a.c().a("app_install_keep_receiver_time_s", 60);
        com.ss.android.socialbase.downloader.c.a.b(f10223a, "tryUnRegisterTempAppInstallDownloadReceiver mAppInstallReceiverKeepTime:" + this.f10232j);
        if (this.f10232j <= 0) {
            return;
        }
        if (i5 > 0) {
            this.f10232j = i5;
        }
        Future future = this.f10231i;
        if (future != null) {
            try {
                future.cancel(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.f10231i = com.ss.android.socialbase.downloader.downloader.c.a(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.d.2
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.downloader.c.a.b(d.f10223a, "registerDownloadReceiver tryUnRegisterTempAppInstallDownloadReceiver run inner");
                d.this.l();
                d.this.s();
            }
        }, this.f10232j, TimeUnit.SECONDS);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10229d = str;
    }

    public void a(com.ss.android.socialbase.appdownloader.c.j jVar) {
        this.f10241s = jVar;
    }

    @Deprecated
    public void a(Context context, String str, com.ss.android.socialbase.appdownloader.c.c cVar, com.ss.android.socialbase.appdownloader.c.d dVar, com.ss.android.socialbase.appdownloader.c.h hVar) {
        if (cVar != null) {
            this.f10235m = cVar;
        }
        if (dVar != null) {
            this.f10236n = dVar;
        }
        if (hVar != null) {
            this.f10237o = hVar;
        }
        c(context);
    }

    public static boolean a(Context context, int i5) {
        return c.a(context, i5, true) == 1;
    }

    private DownloadInfo b(Context context, String str) {
        List<DownloadInfo> downloadInfoList = Downloader.getInstance(context).getDownloadInfoList(str);
        if (downloadInfoList == null) {
            return null;
        }
        for (DownloadInfo downloadInfo : downloadInfoList) {
            if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                return downloadInfo;
            }
        }
        return null;
    }

    public void a(Context context, int i5, int i6) {
        try {
            switch (i6) {
                case -4:
                case -1:
                    Downloader.getInstance(context).restart(i5);
                    break;
                case -3:
                    c.a(context, i5, true);
                    break;
                case -2:
                    Downloader.getInstance(context).resume(i5);
                    break;
                case 0:
                case 6:
                default:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                    Downloader.getInstance(context).pause(i5);
                    break;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public List<DownloadInfo> b(Context context) {
        return Downloader.getInstance(context).getDownloadingDownloadInfosWithMimeType("application/vnd.android.package-archive");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:36|(1:38)|39|(2:43|44)|47|(1:115)(1:54)|55|(2:61|(1:63)(19:64|65|(1:67)|68|(3:70|(2:73|71)|74)|75|76|77|(1:79)(1:112)|80|81|(6:86|(1:109)(1:90)|91|(1:95)|(1:(1:107)(1:106))|108)|110|(1:88)|109|91|(2:93|95)|(0)|108))|114|65|(0)|68|(0)|75|76|77|(0)(0)|80|81|(8:83|86|(0)|109|91|(0)|(0)|108)|110|(0)|109|91|(0)|(0)|108) */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0176 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:77:0x016a, B:79:0x0170, B:80:0x017b, B:112:0x0176), top: B:76:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143 A[Catch: all -> 0x039c, TryCatch #2 {all -> 0x039c, blocks: (B:7:0x0010, B:11:0x0023, B:14:0x002c, B:16:0x003a, B:17:0x0042, B:19:0x004a, B:20:0x0053, B:23:0x005a, B:25:0x0066, B:28:0x0072, B:30:0x0080, B:31:0x0084, B:33:0x008b, B:36:0x0093, B:39:0x009e, B:41:0x00b2, B:47:0x00cc, B:50:0x00e5, B:52:0x00eb, B:55:0x00fc, B:57:0x0102, B:59:0x0108, B:61:0x010e, B:63:0x0114, B:64:0x0123, B:65:0x013d, B:67:0x0143, B:68:0x0148, B:70:0x0152, B:71:0x0156, B:73:0x015c, B:75:0x0166, B:81:0x0191, B:83:0x0197, B:88:0x01a3, B:90:0x01b0, B:91:0x01c0, B:93:0x033c, B:95:0x0346, B:98:0x0351, B:100:0x0357, B:102:0x035d, B:104:0x0367, B:106:0x036d, B:107:0x037d), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152 A[Catch: all -> 0x039c, TryCatch #2 {all -> 0x039c, blocks: (B:7:0x0010, B:11:0x0023, B:14:0x002c, B:16:0x003a, B:17:0x0042, B:19:0x004a, B:20:0x0053, B:23:0x005a, B:25:0x0066, B:28:0x0072, B:30:0x0080, B:31:0x0084, B:33:0x008b, B:36:0x0093, B:39:0x009e, B:41:0x00b2, B:47:0x00cc, B:50:0x00e5, B:52:0x00eb, B:55:0x00fc, B:57:0x0102, B:59:0x0108, B:61:0x010e, B:63:0x0114, B:64:0x0123, B:65:0x013d, B:67:0x0143, B:68:0x0148, B:70:0x0152, B:71:0x0156, B:73:0x015c, B:75:0x0166, B:81:0x0191, B:83:0x0197, B:88:0x01a3, B:90:0x01b0, B:91:0x01c0, B:93:0x033c, B:95:0x0346, B:98:0x0351, B:100:0x0357, B:102:0x035d, B:104:0x0367, B:106:0x036d, B:107:0x037d), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0170 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:77:0x016a, B:79:0x0170, B:80:0x017b, B:112:0x0176), top: B:76:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a3 A[Catch: all -> 0x039c, TryCatch #2 {all -> 0x039c, blocks: (B:7:0x0010, B:11:0x0023, B:14:0x002c, B:16:0x003a, B:17:0x0042, B:19:0x004a, B:20:0x0053, B:23:0x005a, B:25:0x0066, B:28:0x0072, B:30:0x0080, B:31:0x0084, B:33:0x008b, B:36:0x0093, B:39:0x009e, B:41:0x00b2, B:47:0x00cc, B:50:0x00e5, B:52:0x00eb, B:55:0x00fc, B:57:0x0102, B:59:0x0108, B:61:0x010e, B:63:0x0114, B:64:0x0123, B:65:0x013d, B:67:0x0143, B:68:0x0148, B:70:0x0152, B:71:0x0156, B:73:0x015c, B:75:0x0166, B:81:0x0191, B:83:0x0197, B:88:0x01a3, B:90:0x01b0, B:91:0x01c0, B:93:0x033c, B:95:0x0346, B:98:0x0351, B:100:0x0357, B:102:0x035d, B:104:0x0367, B:106:0x036d, B:107:0x037d), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033c A[Catch: all -> 0x039c, TryCatch #2 {all -> 0x039c, blocks: (B:7:0x0010, B:11:0x0023, B:14:0x002c, B:16:0x003a, B:17:0x0042, B:19:0x004a, B:20:0x0053, B:23:0x005a, B:25:0x0066, B:28:0x0072, B:30:0x0080, B:31:0x0084, B:33:0x008b, B:36:0x0093, B:39:0x009e, B:41:0x00b2, B:47:0x00cc, B:50:0x00e5, B:52:0x00eb, B:55:0x00fc, B:57:0x0102, B:59:0x0108, B:61:0x010e, B:63:0x0114, B:64:0x0123, B:65:0x013d, B:67:0x0143, B:68:0x0148, B:70:0x0152, B:71:0x0156, B:73:0x015c, B:75:0x0166, B:81:0x0191, B:83:0x0197, B:88:0x01a3, B:90:0x01b0, B:91:0x01c0, B:93:0x033c, B:95:0x0346, B:98:0x0351, B:100:0x0357, B:102:0x035d, B:104:0x0367, B:106:0x036d, B:107:0x037d), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(com.ss.android.socialbase.appdownloader.f r22) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.d.a(com.ss.android.socialbase.appdownloader.f):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DownloadTask downloadTask, int i5, boolean z4) {
        if (downloadTask == null) {
            return;
        }
        downloadTask.download();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            downloadInfo.setAntiHijackErrorCode(i5);
        }
        if (downloadInfo == null || !z4) {
            return;
        }
        downloadInfo.setSavePathRedirected(z4);
    }

    private List<com.ss.android.socialbase.downloader.model.c> a(List<com.ss.android.socialbase.downloader.model.c> list) {
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        if (list != null && list.size() > 0) {
            for (com.ss.android.socialbase.downloader.model.c cVar : list) {
                if (cVar != null && !TextUtils.isEmpty(cVar.a()) && !TextUtils.isEmpty(cVar.b())) {
                    if (cVar.a().equals(HTTP.USER_AGENT)) {
                        z4 = true;
                    }
                    arrayList.add(new com.ss.android.socialbase.downloader.model.c(cVar.a(), cVar.b()));
                }
            }
        }
        if (!z4) {
            arrayList.add(new com.ss.android.socialbase.downloader.model.c(HTTP.USER_AGENT, com.ss.android.socialbase.appdownloader.b.a.f10199a));
        }
        return arrayList;
    }

    public String a(String str, String str2) {
        return (TextUtils.isEmpty(str) || !str.endsWith(".apk") || c.c(str2)) ? str2 : "application/vnd.android.package-archive";
    }

    private z a(final com.ss.android.socialbase.appdownloader.c.e eVar) {
        if (eVar == null) {
            return null;
        }
        return new z() { // from class: com.ss.android.socialbase.appdownloader.d.6
            @Override // com.ss.android.socialbase.downloader.depend.z
            public void a(int i5, DownloadInfo downloadInfo, String str, String str2) {
                if (i5 != 1 && i5 != 3) {
                    switch (i5) {
                        case 5:
                        case 6:
                        case 7:
                            break;
                        case 8:
                            eVar.a(i5, downloadInfo.getPackageName(), str, str2);
                            return;
                        case 9:
                            eVar.a(com.ss.android.socialbase.downloader.downloader.c.O(), str);
                            return;
                        case 10:
                            eVar.a(downloadInfo);
                            return;
                        default:
                            return;
                    }
                }
                eVar.a(i5, str, downloadInfo.getStatus(), downloadInfo.getDownloadTime());
            }

            @Override // com.ss.android.socialbase.downloader.depend.z
            public boolean a(boolean z4) {
                return eVar.a(z4);
            }

            @Override // com.ss.android.socialbase.downloader.depend.z
            public String a() {
                return eVar.a();
            }
        };
    }

    public DownloadInfo a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                DownloadInfo a5 = a(context, str, h());
                if (a5 == null) {
                    a5 = a(context, str, context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
                }
                if (a5 == null) {
                    a5 = a(context, str, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                }
                if (a5 == null) {
                    a5 = a(context, str, context.getFilesDir());
                }
                return (a5 == null && com.ss.android.socialbase.downloader.g.a.c().a("get_download_info_by_list")) ? b(context, str) : a5;
            } catch (Throwable th) {
                com.ss.android.socialbase.downloader.c.a.b(f10223a, String.format("getAppDownloadInfo error:%s", th.getMessage()));
            }
        }
        return null;
    }

    private DownloadInfo a(Context context, String str, File file) {
        if (context == null || TextUtils.isEmpty(str) || file == null) {
            return null;
        }
        return Downloader.getInstance(context).getDownloadInfo(str, file.getAbsolutePath());
    }

    public List<DownloadInfo> a(Context context) {
        return Downloader.getInstance(context).getUnCompletedDownloadInfosWithMimeType("application/vnd.android.package-archive");
    }

    public void a(com.ss.android.socialbase.appdownloader.c.g gVar) {
        this.f10238p = gVar;
    }

    public void a(com.ss.android.socialbase.downloader.downloader.r rVar) {
        Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).setReserveWifiStatusListener(rVar);
    }

    public void a(ad adVar) {
        this.f10242t = adVar;
    }

    public void a(ag agVar) {
        this.f10243u = agVar;
    }

    public void a(int i5) {
        if (com.ss.android.socialbase.downloader.g.a.c().a("enable_app_install_receiver", 1) <= 0) {
            return;
        }
        k();
        b(i5);
    }

    public void a(o oVar) {
        this.f10244v = oVar;
    }

    public void a(boolean z4) {
        this.f10234l = z4;
    }
}
