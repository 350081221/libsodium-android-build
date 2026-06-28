package com.ss.android.socialbase.downloader.f;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.umeng.analytics.pro.au;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m implements Runnable {
    private Thread A;
    private volatile boolean B;
    private int C;
    private int D;
    private int E;
    private long F;
    private int G;
    private boolean H;
    private BaseException I;
    private boolean J;
    private boolean K;
    private com.ss.android.socialbase.downloader.i.e L;

    /* renamed from: a, reason: collision with root package name */
    volatile i f10780a;

    /* renamed from: b, reason: collision with root package name */
    q f10781b;

    /* renamed from: c, reason: collision with root package name */
    final int f10782c;

    /* renamed from: d, reason: collision with root package name */
    volatile long f10783d;

    /* renamed from: e, reason: collision with root package name */
    volatile long f10784e;

    /* renamed from: f, reason: collision with root package name */
    volatile long f10785f;

    /* renamed from: g, reason: collision with root package name */
    volatile long f10786g;

    /* renamed from: h, reason: collision with root package name */
    String f10787h;

    /* renamed from: i, reason: collision with root package name */
    String f10788i;

    /* renamed from: j, reason: collision with root package name */
    String f10789j;

    /* renamed from: k, reason: collision with root package name */
    private final f f10790k;

    /* renamed from: l, reason: collision with root package name */
    private final c f10791l;

    /* renamed from: m, reason: collision with root package name */
    private final DownloadInfo f10792m;

    /* renamed from: n, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.g.a f10793n;

    /* renamed from: o, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.network.i f10794o;

    /* renamed from: p, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.d f10795p;

    /* renamed from: r, reason: collision with root package name */
    private long f10797r;

    /* renamed from: s, reason: collision with root package name */
    private volatile long f10798s;

    /* renamed from: t, reason: collision with root package name */
    private volatile long f10799t;

    /* renamed from: v, reason: collision with root package name */
    private volatile long f10801v;

    /* renamed from: w, reason: collision with root package name */
    private Future f10802w;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f10803x;

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f10804y;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f10805z;

    /* renamed from: q, reason: collision with root package name */
    private final List<i> f10796q = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private volatile long f10800u = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(DownloadInfo downloadInfo, k kVar, c cVar, q qVar, int i5) {
        this.f10792m = downloadInfo;
        this.f10790k = kVar;
        this.f10791l = cVar;
        this.f10793n = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId());
        this.f10781b = qVar;
        this.f10782c = i5;
    }

    private boolean a(i iVar) throws BaseException {
        k();
        while (true) {
            try {
                b(iVar);
                d(iVar);
                i();
                return true;
            } catch (j e5) {
                this.I = e5;
                throw e5;
            } catch (Throwable th) {
                try {
                    com.ss.android.socialbase.downloader.c.a.e("SegmentReader", "download: e = " + th + ", threadIndex = " + this.f10782c + ", reconnect = " + this.f10804y + ", closed = " + this.f10803x);
                    if (this.f10803x) {
                        return false;
                    }
                    if (this.f10804y) {
                        this.f10804y = false;
                        try {
                            Thread.interrupted();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        if (this.f10805z) {
                            this.f10805z = false;
                            throw new j(5, "download");
                        }
                    } else {
                        th.printStackTrace();
                        if (th instanceof BaseException) {
                            e = th;
                        } else {
                            try {
                                com.ss.android.socialbase.downloader.i.f.a((Throwable) th, "download");
                                e = null;
                            } catch (BaseException e6) {
                                e = e6;
                            }
                        }
                        if (e == null || !a(iVar, e)) {
                            return false;
                        }
                    }
                } finally {
                    i();
                }
            }
        }
        return false;
    }

    private void b(i iVar) throws BaseException, com.ss.android.socialbase.downloader.exception.i {
        c(iVar);
        this.f10790k.a(this, iVar, this.f10781b, this.f10795p);
        this.f10781b.c();
    }

    private void c(i iVar) throws BaseException {
        String str;
        String str2;
        com.ss.android.socialbase.downloader.network.i a5;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f10784e = 0L;
                this.f10783d = currentTimeMillis;
                this.f10797r = iVar.e();
                this.f10799t = iVar.f();
                if (this.f10799t > 0 && this.f10797r > this.f10799t) {
                    throw new j(6, "createConn, " + iVar);
                }
                this.L = new com.ss.android.socialbase.downloader.i.e();
                List<com.ss.android.socialbase.downloader.model.c> a6 = com.ss.android.socialbase.downloader.i.f.a(this.f10792m.getExtraHeaders(), this.f10792m.geteTag(), this.f10797r, this.f10799t);
                a6.add(new com.ss.android.socialbase.downloader.model.c("Segment-Index", String.valueOf(iVar.g())));
                a6.add(new com.ss.android.socialbase.downloader.model.c("Thread-Index", String.valueOf(this.f10782c)));
                com.ss.android.socialbase.downloader.i.f.a(a6, this.f10792m);
                com.ss.android.socialbase.downloader.i.f.b(a6, this.f10792m);
                str = this.f10781b.f10808a;
                if (this.H && !TextUtils.isEmpty(str) && str.startsWith("https")) {
                    str = str.replaceFirst("https", "http");
                }
                str2 = this.f10781b.f10809b;
                com.ss.android.socialbase.downloader.c.a.c("SegmentReader", "createConnectionBegin: url = " + str + ", ip = " + str2 + ", segment = " + iVar + ", threadIndex = " + this.f10782c);
                this.f10787h = str;
                this.f10788i = str2;
                a5 = com.ss.android.socialbase.downloader.downloader.c.a(this.f10792m.isNeedDefaultHttpServiceBackUp(), this.f10792m.getMaxBytes(), str, str2, a6, 0, currentTimeMillis - this.F > a1.b.f90a && this.f10793n.b("monitor_download_connect") > 0, this.f10792m);
            } finally {
                this.f10784e = System.currentTimeMillis();
            }
        } catch (BaseException e5) {
            throw e5;
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.i.f.a(th, "createConn");
        }
        if (a5 != null) {
            this.f10794o = a5;
            this.f10795p = new com.ss.android.socialbase.downloader.model.d(str, a5);
            if (!this.f10803x) {
                if (a5 instanceof com.ss.android.socialbase.downloader.network.a) {
                    this.f10789j = ((com.ss.android.socialbase.downloader.network.a) a5).e();
                }
                Log.i("SegmentReader", "createConnectionSuccess: url = " + str + ", ip = " + str2 + ", hostRealIp = " + this.f10789j + ", threadIndex = " + this.f10782c);
                return;
            }
            throw new p("createConn");
        }
        throw new BaseException(1022, new IOException("download can't continue, chunk connection is null"));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:180:0x0159
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(com.ss.android.socialbase.downloader.f.i r32) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.f.m.d(com.ss.android.socialbase.downloader.f.i):void");
    }

    private void i() {
        this.F = this.f10783d;
        this.f10783d = -1L;
        this.f10784e = -1L;
        this.f10785f = -1L;
        this.f10786g = -1L;
        j();
    }

    private void j() {
        com.ss.android.socialbase.downloader.network.i iVar = this.f10794o;
        if (iVar != null) {
            try {
                com.ss.android.socialbase.downloader.c.a.c("SegmentReader", "closeConnection: thread = " + this.f10782c);
                iVar.d();
                iVar.c();
            } catch (Throwable unused) {
            }
        }
    }

    private void k() {
        this.H = false;
        l();
    }

    private void l() {
        int backUpUrlRetryCount;
        if (this.f10781b.f10811d) {
            backUpUrlRetryCount = this.f10792m.getRetryCount();
        } else {
            backUpUrlRetryCount = this.f10792m.getBackUpUrlRetryCount();
        }
        this.D = backUpUrlRetryCount;
        this.E = 0;
    }

    private long m() {
        long j5 = this.f10798s;
        this.f10798s = 0L;
        if (j5 <= 0) {
            return Long.MAX_VALUE;
        }
        return j5;
    }

    public void e() {
        com.ss.android.socialbase.downloader.c.a.c("SegmentReader", "close: threadIndex = " + this.f10782c);
        synchronized (this) {
            this.f10803x = true;
            this.B = true;
        }
        j();
        Future future = this.f10802w;
        if (future != null) {
            this.f10802w = null;
            try {
                future.cancel(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void f() {
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h() {
        return this.f10797r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r6.f10780a = null;
        r2 = r6.f10790k;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.f.m.run():void");
    }

    public long b() {
        long c5;
        synchronized (this.f10790k) {
            c5 = this.f10801v + c();
        }
        return c5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z4) {
        this.J = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j5) {
        long j6 = this.f10800u;
        com.ss.android.socialbase.downloader.i.e eVar = this.L;
        if (j6 < 0 || eVar == null) {
            return;
        }
        Log.i("SegmentReader", "markProgress: curSegmentReadOffset = " + j6 + ", threadIndex = " + this.f10782c);
        eVar.a(j6, j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(q qVar) {
        int i5 = this.G;
        if (i5 >= 30) {
            return false;
        }
        this.G = i5 + 1;
        q qVar2 = this.f10781b;
        if (qVar2 != null) {
            qVar2.b(this);
        }
        qVar.a(this);
        this.f10781b = qVar;
        l();
        return true;
    }

    private boolean a(i iVar, BaseException baseException) {
        com.ss.android.socialbase.downloader.c.a.e("SegmentReader", "handleDownloadFailed:  e = " + baseException + ", curRetryCount = " + this.E + ", retryCount = " + this.D);
        this.I = baseException;
        this.f10781b.b();
        this.f10790k.a(this, this.f10781b, iVar, baseException, this.E, this.D);
        int i5 = this.E;
        if (i5 < this.D) {
            this.E = i5 + 1;
            return true;
        }
        if (a(baseException)) {
            return true;
        }
        this.f10790k.a(this, this.f10781b, iVar, baseException);
        return false;
    }

    public long c() {
        synchronized (this.f10790k) {
            long j5 = this.f10800u;
            long j6 = this.f10797r;
            if (j6 < 0 || j5 <= j6) {
                return 0L;
            }
            return j5 - j6;
        }
    }

    private boolean a(BaseException baseException) {
        if (!com.ss.android.socialbase.downloader.i.f.c(baseException)) {
            return false;
        }
        String str = this.f10781b.f10808a;
        if (TextUtils.isEmpty(str) || !str.startsWith("https") || !this.f10792m.isNeedHttpsToHttpRetry() || this.H) {
            return false;
        }
        this.H = true;
        l();
        return true;
    }

    public void c(boolean z4) {
        this.K = z4;
    }

    private a a(c cVar, InputStream inputStream) throws InterruptedException, BaseException, IOException {
        int i5;
        a b5 = cVar.b();
        try {
            i5 = inputStream.read(b5.f10703a);
        } catch (Throwable th) {
            th = th;
            i5 = -1;
        }
        try {
            if (i5 != -1) {
                b5.f10705c = i5;
                if (i5 == -1) {
                    cVar.a(b5);
                }
                return b5;
            }
            throw new BaseException(1073, au.f12211s);
        } catch (Throwable th2) {
            th = th2;
            if (i5 == -1) {
                cVar.a(b5);
            }
            throw th;
        }
    }

    public boolean a(long j5) {
        long j6 = this.f10799t;
        if (j5 <= 0 && j6 > 0) {
            return false;
        }
        if (j5 > j6 && j6 > 0) {
            return false;
        }
        this.f10798s = j5;
        this.B = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        q qVar = this.f10781b;
        try {
            synchronized (this.f10790k) {
                long c5 = c();
                if (c5 > 0) {
                    this.f10801v += c5;
                    qVar.a(c5);
                }
                this.f10800u = -1L;
            }
        } catch (Throwable unused) {
        }
    }

    public void a(boolean z4) {
        com.ss.android.socialbase.downloader.c.a.c("SegmentReader", "reconnect: threadIndex = " + this.f10782c);
        synchronized (this) {
            this.f10805z = z4;
            this.f10804y = true;
            this.B = true;
        }
        j();
        Thread thread = this.A;
        if (thread != null) {
            try {
                Log.i("SegmentReader", "reconnect: t.interrupt threadIndex = " + this.f10782c);
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Future future) {
        this.f10802w = future;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a(long j5, long j6) {
        com.ss.android.socialbase.downloader.i.e eVar = this.L;
        if (eVar == null) {
            return -1L;
        }
        return eVar.b(j5, j6);
    }

    public long d() {
        return this.f10800u;
    }
}
