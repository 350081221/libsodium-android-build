package com.ss.android.socialbase.downloader.h;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.downloader.s;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.f.k;
import com.ss.android.socialbase.downloader.f.n;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.b;
import com.ss.android.socialbase.downloader.network.i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements f, Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10844a = "c";
    private r A;
    private String E;
    private long G;
    private long H;
    private final com.ss.android.socialbase.downloader.g.a I;

    /* renamed from: b, reason: collision with root package name */
    private Future f10845b;

    /* renamed from: c, reason: collision with root package name */
    private final DownloadTask f10846c;

    /* renamed from: e, reason: collision with root package name */
    private AtomicInteger f10848e;

    /* renamed from: g, reason: collision with root package name */
    private volatile com.ss.android.socialbase.downloader.downloader.e f10850g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10851h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10852i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10853j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10854k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10855l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f10856m;

    /* renamed from: o, reason: collision with root package name */
    private final j f10858o;

    /* renamed from: p, reason: collision with root package name */
    private DownloadInfo f10859p;

    /* renamed from: q, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.h f10860q;

    /* renamed from: r, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.h f10861r;

    /* renamed from: s, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.g f10862s;

    /* renamed from: t, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.g f10863t;

    /* renamed from: u, reason: collision with root package name */
    private s f10864u;

    /* renamed from: v, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.f f10865v;

    /* renamed from: w, reason: collision with root package name */
    private volatile BaseException f10866w;

    /* renamed from: x, reason: collision with root package name */
    private i f10867x;

    /* renamed from: y, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.network.g f10868y;

    /* renamed from: z, reason: collision with root package name */
    private w f10869z;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f10847d = false;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<b> f10849f = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    private volatile com.ss.android.socialbase.downloader.constants.h f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_NONE;
    private volatile int B = 5;
    private boolean C = false;
    private boolean D = false;
    private boolean F = false;
    private int J = 0;
    private volatile k K = null;

    public c(DownloadTask downloadTask, Handler handler) {
        this.f10846c = downloadTask;
        if (downloadTask != null) {
            this.f10859p = downloadTask.getDownloadInfo();
            this.f10860q = downloadTask.getChunkStrategy();
            this.f10862s = downloadTask.getChunkAdjustCalculator();
            this.f10869z = downloadTask.getForbiddenHandler();
            this.A = downloadTask.getDiskSpaceHandler();
            this.f10864u = a(downloadTask);
            this.I = com.ss.android.socialbase.downloader.g.a.a(this.f10859p.getId());
        } else {
            this.I = com.ss.android.socialbase.downloader.g.a.c();
        }
        h();
        this.f10858o = com.ss.android.socialbase.downloader.downloader.c.y();
        this.f10861r = com.ss.android.socialbase.downloader.downloader.c.J();
        this.f10863t = com.ss.android.socialbase.downloader.downloader.c.L();
        this.f10865v = new com.ss.android.socialbase.downloader.downloader.f(downloadTask, handler);
        this.f10856m = new AtomicBoolean(true);
    }

    private long A() {
        return this.f10864u.a(this.f10859p.getCurRetryTimeInTotal(), this.f10859p.getTotalRetryCount());
    }

    private void B() throws com.ss.android.socialbase.downloader.exception.i, BaseException {
        com.ss.android.socialbase.downloader.impls.a D;
        int id = this.f10859p.getId();
        int a5 = com.ss.android.socialbase.downloader.downloader.c.a(this.f10859p);
        if (this.f10859p.isDownloaded() && !this.f10859p.isExpiredRedownload() && !this.F) {
            throw new BaseException(PointerIconCompat.TYPE_VERTICAL_TEXT, "file has downloaded");
        }
        DownloadInfo b5 = this.f10858o.b(a5);
        if (b5 != null && (D = com.ss.android.socialbase.downloader.downloader.c.D()) != null && b5.getId() != id && b5.equalsTask(this.f10859p)) {
            if (!D.a(b5.getId())) {
                List<com.ss.android.socialbase.downloader.model.b> c5 = this.f10858o.c(a5);
                com.ss.android.socialbase.downloader.i.f.a(this.f10859p);
                this.f10858o.f(a5);
                if (b5.isBreakpointAvailable()) {
                    this.f10859p.copyFromCacheData(b5, false);
                    this.f10858o.a(this.f10859p);
                    if (c5 != null) {
                        for (com.ss.android.socialbase.downloader.model.b bVar : c5) {
                            bVar.b(id);
                            this.f10858o.a(bVar);
                        }
                    }
                    throw new com.ss.android.socialbase.downloader.exception.i("retry task because id generator changed");
                }
                return;
            }
            this.f10858o.f(id);
            throw new BaseException(InputDeviceCompat.SOURCE_GAMEPAD, "another same task is downloading");
        }
    }

    private boolean C() {
        DownloadInfo downloadInfo = this.f10859p;
        if (downloadInfo == null || downloadInfo.isExpiredRedownload()) {
            return false;
        }
        if ((this.f10852i && this.f10859p.getChunkCount() <= 1) || this.f10859p.isChunkDowngradeRetryUsed() || !this.f10853j || this.f10855l) {
            return false;
        }
        return true;
    }

    private void D() throws BaseException {
        long j5;
        int a5;
        try {
            j5 = com.ss.android.socialbase.downloader.i.f.d(this.f10859p.getTempPath());
        } catch (BaseException unused) {
            j5 = 0;
        }
        String str = f10844a;
        com.ss.android.socialbase.downloader.c.a.c(str, "checkSpaceOverflowInProgress: available = " + com.ss.android.socialbase.downloader.i.f.a(j5) + "MB");
        if (j5 > 0) {
            long totalBytes = this.f10859p.getTotalBytes() - this.f10859p.getCurBytes();
            if (j5 < totalBytes && (a5 = com.ss.android.socialbase.downloader.g.a.a(this.f10859p.getId()).a("space_fill_min_keep_mb", 100)) > 0) {
                long j6 = j5 - (a5 * 1048576);
                com.ss.android.socialbase.downloader.c.a.c(str, "checkSpaceOverflowInProgress: minKeep  = " + a5 + "MB, canDownload = " + com.ss.android.socialbase.downloader.i.f.a(j6) + "MB");
                if (j6 > 0) {
                    this.G = this.f10859p.getCurBytes() + j6 + 1048576;
                    return;
                } else {
                    this.G = 0L;
                    throw new com.ss.android.socialbase.downloader.exception.d(j5, totalBytes);
                }
            }
        }
        this.G = 0L;
    }

    private void E() throws com.ss.android.socialbase.downloader.exception.f {
        if (this.f10859p.isOnlyWifi() && !com.ss.android.socialbase.downloader.i.f.a(com.ss.android.socialbase.downloader.downloader.c.O(), "android.permission.ACCESS_NETWORK_STATE")) {
            throw new com.ss.android.socialbase.downloader.exception.f(PointerIconCompat.TYPE_ZOOM_OUT, String.format("download task need permission:%s", "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.f10859p.isDownloadWithWifiValid()) {
            if (this.f10859p.isPauseReserveWithWifiValid()) {
                return;
            } else {
                throw new com.ss.android.socialbase.downloader.exception.e();
            }
        }
        throw new com.ss.android.socialbase.downloader.exception.c();
    }

    private void F() throws BaseException {
        if (!TextUtils.isEmpty(this.f10859p.getSavePath())) {
            if (!TextUtils.isEmpty(this.f10859p.getName())) {
                File file = new File(this.f10859p.getSavePath());
                if (!file.exists()) {
                    boolean mkdirs = file.mkdirs();
                    if (!mkdirs && !file.exists()) {
                        int i5 = 0;
                        if (com.ss.android.socialbase.downloader.g.a.a(this.f10859p.getId()).a("opt_mkdir_failed", 0) == 1) {
                            while (!mkdirs) {
                                int i6 = i5 + 1;
                                if (i5 >= 3) {
                                    break;
                                }
                                try {
                                    Thread.sleep(10L);
                                    mkdirs = file.mkdirs();
                                    i5 = i6;
                                } catch (InterruptedException unused) {
                                }
                            }
                            if (!mkdirs && !file.exists()) {
                                if (com.ss.android.socialbase.downloader.i.f.d(this.f10859p.getSavePath()) < 16384) {
                                    throw new BaseException(1006, "download savePath directory can not created:" + this.f10859p.getSavePath());
                                }
                                throw new BaseException(1030, "download savePath directory can not created:" + this.f10859p.getSavePath());
                            }
                            return;
                        }
                        throw new BaseException(1030, "download savePath directory can not created:" + this.f10859p.getSavePath());
                    }
                    return;
                }
                if (!file.isDirectory()) {
                    if (com.ss.android.socialbase.downloader.i.d.b(this.f10859p)) {
                        file.delete();
                        if (!file.mkdirs() && !file.exists()) {
                            throw new BaseException(1031, "download savePath is not directory:path=" + this.f10859p.getSavePath());
                        }
                        return;
                    }
                    throw new BaseException(1031, "download savePath is not a directory:" + this.f10859p.getSavePath());
                }
                return;
            }
            throw new BaseException(1029, "download name can not be empty");
        }
        throw new BaseException(1028, "download savePath can not be empty");
    }

    private void G() {
        boolean z4;
        long f5 = com.ss.android.socialbase.downloader.i.f.f(this.f10859p);
        long curBytes = this.f10859p.getCurBytes();
        if (f5 != curBytes) {
            com.ss.android.socialbase.downloader.c.a.d(f10844a, "checkTaskCanResume: offset = " + f5 + ", curBytes = " + curBytes);
        }
        this.f10859p.setCurBytes(f5);
        if (f5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f10852i = z4;
        if (!z4 && !this.F) {
            com.ss.android.socialbase.downloader.c.a.c(f10844a, "checkTaskCanResume: deleteAllDownloadFiles");
            this.f10858o.d(this.f10859p.getId());
            this.f10858o.m(this.f10859p.getId());
            com.ss.android.socialbase.downloader.i.f.a(this.f10859p);
        }
    }

    private void H() {
        com.ss.android.socialbase.downloader.c.a.d(f10844a, "clearCurrentDownloadData::" + Log.getStackTraceString(new Throwable()));
        try {
            this.f10858o.d(this.f10859p.getId());
            this.f10858o.m(this.f10859p.getId());
            com.ss.android.socialbase.downloader.i.f.a(this.f10859p);
            this.f10852i = false;
            this.f10859p.resetDataForEtagEndure("");
            this.f10858o.a(this.f10859p);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void I() {
        try {
            Iterator it = ((ArrayList) this.f10849f.clone()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null) {
                    bVar.b();
                }
            }
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.c.a.c(f10844a, "cancelAllChunkRunnable: " + th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        com.ss.android.socialbase.downloader.impls.a D;
        if (!v() && (D = com.ss.android.socialbase.downloader.downloader.c.D()) != null) {
            D.l(this.f10859p.getId());
        }
    }

    private boolean K() {
        return false;
    }

    private void h() {
        DownloadInfo downloadInfo = this.f10859p;
        if (downloadInfo == null) {
            return;
        }
        int retryCount = downloadInfo.getRetryCount() - this.f10859p.getCurRetryTime();
        if (retryCount < 0) {
            retryCount = 0;
        }
        AtomicInteger atomicInteger = this.f10848e;
        if (atomicInteger == null) {
            this.f10848e = new AtomicInteger(retryCount);
        } else {
            atomicInteger.set(retryCount);
        }
    }

    private boolean i() {
        int status = this.f10859p.getStatus();
        if (status == 1 || this.f10859p.canSkipStatusHandler()) {
            return true;
        }
        if (status != -2 && status != -4) {
            b(new BaseException(1000, "The download Task can't start, because its status is not prepare:" + status));
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f1, code lost:
    
        if (r10.I.a("fix_file_exist_update_download_info") != false) goto L79;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e9: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:78:0x00f3 (LINE:234), block:B:77:0x00e9 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j() throws com.ss.android.socialbase.downloader.exception.a {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.c.j():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[LOOP:0: B:26:0x0058->B:41:0x0058, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.c.k():void");
    }

    private void l() {
        boolean z4;
        List<com.ss.android.socialbase.downloader.model.b> c5;
        long j5;
        boolean z5;
        try {
            this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_NONE;
            this.f10859p.updateStartDownloadTime();
            this.f10859p.resetRealStartDownloadTime();
            long currentTimeMillis = System.currentTimeMillis();
            this.f10859p.setFirstSpeedTime(-1L);
            try {
                j();
                z4 = false;
            } catch (com.ss.android.socialbase.downloader.exception.a e5) {
                com.ss.android.socialbase.downloader.c.a.b(f10844a, "file exist " + e5.a());
                this.E = e5.a();
                z4 = true;
            }
            if (!this.C) {
                this.f10865v.b();
            }
            this.C = false;
            if (v()) {
                return;
            }
            if (!TextUtils.isEmpty(this.E) && z4) {
                if (this.f10859p.isExpiredRedownload()) {
                    this.F = com.ss.android.socialbase.downloader.i.f.d(this.f10859p);
                }
                if (!this.F) {
                    m();
                    return;
                }
            }
            while (!v()) {
                try {
                    try {
                        try {
                            try {
                                F();
                                B();
                                E();
                                c5 = this.f10858o.c(this.f10859p.getId());
                                G();
                            } catch (Throwable th) {
                                com.ss.android.socialbase.downloader.c.a.d(f10844a, "downloadInner: throwable =  " + th);
                                if (this.f10857n != com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE) {
                                    b(new BaseException(1045, th));
                                }
                            }
                        } catch (com.ss.android.socialbase.downloader.exception.i e6) {
                            try {
                                com.ss.android.socialbase.downloader.c.a.d(f10844a, "downloadInner: retry throwable for " + e6.a());
                                if (this.f10857n != com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE) {
                                    AtomicInteger atomicInteger = this.f10848e;
                                    if (atomicInteger != null && atomicInteger.get() > 0) {
                                        this.f10859p.updateCurRetryTime(this.f10848e.decrementAndGet());
                                        this.f10859p.setStatus(5);
                                    } else if (this.f10848e != null) {
                                        if (this.f10859p.trySwitchToNextBackupUrl()) {
                                            this.f10859p.setStatus(5);
                                            this.f10848e.set(this.f10859p.getRetryCount());
                                            this.f10859p.updateCurRetryTime(this.f10848e.get());
                                        } else {
                                            b(new BaseException(PointerIconCompat.TYPE_ZOOM_IN, String.format("retry for Throwable, but retry Time %s all used, last error is %s", String.valueOf(this.f10859p.getRetryCount()), e6.a())));
                                        }
                                    } else {
                                        b(new BaseException(1043, "retry for Throwable, but retain retry time is NULL, last error is" + e6.a()));
                                    }
                                    s();
                                }
                            } catch (Throwable th2) {
                                s();
                                throw th2;
                            }
                        }
                    } catch (com.ss.android.socialbase.downloader.exception.a unused) {
                        m();
                    }
                } catch (BaseException e7) {
                    com.ss.android.socialbase.downloader.c.a.d(f10844a, "downloadInner: baseException = " + e7);
                    if (this.f10857n != com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE) {
                        if (e7.getErrorCode() != 1025 && e7.getErrorCode() != 1009) {
                            if (a(e7)) {
                                if (com.ss.android.socialbase.downloader.i.f.a(e7)) {
                                    H();
                                }
                                if (a(e7, 0L) != com.ss.android.socialbase.downloader.exception.h.RETURN) {
                                    s();
                                } else {
                                    s();
                                    return;
                                }
                            } else {
                                b(e7);
                            }
                        }
                        this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_END_RIGHT_NOW;
                        s();
                        return;
                    }
                }
                if (n()) {
                    com.ss.android.socialbase.downloader.c.a.c(f10844a, "downloadSegments return");
                    s();
                    return;
                }
                String connectionUrl = this.f10859p.getConnectionUrl();
                if (v()) {
                    s();
                    return;
                }
                if (this.f10852i) {
                    j5 = com.ss.android.socialbase.downloader.i.f.e(this.f10859p);
                } else {
                    j5 = 0;
                }
                com.ss.android.socialbase.downloader.model.b a5 = a(this.f10859p, j5);
                List<com.ss.android.socialbase.downloader.model.c> a6 = a(a5);
                com.ss.android.socialbase.downloader.i.f.a(a6, this.f10859p);
                com.ss.android.socialbase.downloader.i.f.b(a6, this.f10859p);
                this.f10859p.setPreconnectLevel(0);
                long currentTimeMillis2 = System.currentTimeMillis();
                try {
                    a(connectionUrl, a6, j5);
                    this.f10859p.increaseAllConnectTime(System.currentTimeMillis() - currentTimeMillis2);
                    if (v()) {
                        s();
                        return;
                    }
                    long totalBytes = this.f10859p.getTotalBytes();
                    a(totalBytes);
                    int a7 = a(totalBytes, c5);
                    if (v()) {
                        s();
                        return;
                    }
                    if (a7 > 0) {
                        if (a7 == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        this.f10851h = z5;
                        if (z5) {
                            if (this.f10867x == null) {
                                try {
                                    currentTimeMillis2 = System.currentTimeMillis();
                                    a(connectionUrl, a6);
                                    this.f10859p.increaseAllConnectTime(System.currentTimeMillis() - currentTimeMillis2);
                                } finally {
                                }
                            }
                            if (v()) {
                                s();
                                return;
                            } else {
                                this.f10859p.setFirstSpeedTime(System.currentTimeMillis() - currentTimeMillis);
                                o();
                                a(a5, connectionUrl, this.f10867x);
                            }
                        } else {
                            if (!this.f10859p.isNeedReuseFirstConnection()) {
                                r();
                            }
                            if (v()) {
                                s();
                                return;
                            }
                            o();
                            this.f10859p.setFirstSpeedTime(System.currentTimeMillis() - currentTimeMillis);
                            if (this.f10852i) {
                                a(a7, c5);
                            } else {
                                a(totalBytes, a7);
                            }
                        }
                        s();
                        return;
                    }
                    throw new BaseException(1032, "chunkCount is 0");
                } finally {
                }
            }
        } finally {
            p();
        }
    }

    private void m() {
        com.ss.android.socialbase.downloader.c.a.b(f10844a, "finishWithFileExist");
        if (com.ss.android.socialbase.downloader.g.a.c().b("fix_end_for_file_exist_error", true)) {
            if (this.E.equals(this.f10859p.getName())) {
                this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_END_RIGHT_NOW;
                return;
            } else {
                this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_END_FOR_FILE_EXIST;
                return;
            }
        }
        if (this.E.equals(this.f10859p.getTargetFilePath())) {
            this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_END_RIGHT_NOW;
        } else {
            this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_END_FOR_FILE_EXIST;
        }
    }

    private boolean n() throws BaseException, InterruptedException {
        if (this.f10859p.isExpiredRedownload() || this.f10859p.getChunkCount() != 1 || this.f10859p.getThrottleNetSpeed() > 0) {
            return false;
        }
        JSONObject d5 = com.ss.android.socialbase.downloader.g.a.a(this.f10859p.getId()).d("segment_config");
        List<com.ss.android.socialbase.downloader.f.i> n5 = this.f10858o.n(this.f10859p.getId());
        if (this.f10859p.getCurBytes() > 0) {
            if (n5 == null || n5.isEmpty()) {
                return false;
            }
            if (d5 == null) {
                d5 = new JSONObject();
            }
        }
        if (d5 == null) {
            return false;
        }
        this.K = new k(this.f10859p, n.a(d5), this);
        if (v()) {
            com.ss.android.socialbase.downloader.c.a.c(f10844a, "downloadSegments: is stopped by user");
            if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED) {
                this.K.a();
            } else {
                this.K.b();
            }
            return true;
        }
        return this.K.a(n5);
    }

    private void o() {
        int retryCount;
        if (com.ss.android.socialbase.downloader.g.a.a(this.f10859p.getId()).a("reset_retain_retry_times", 0) == 1 && this.J < 3) {
            AtomicInteger atomicInteger = this.f10848e;
            if (this.f10859p.isBackUpUrlUsed()) {
                retryCount = this.f10859p.getBackUpUrlRetryCount();
            } else {
                retryCount = this.f10859p.getRetryCount();
            }
            atomicInteger.set(retryCount);
            this.J++;
        }
    }

    private void p() {
        boolean z4;
        boolean z5;
        boolean z6;
        com.ss.android.socialbase.downloader.c.a.b(f10844a, "endDownloadRunnable::runStatus=" + this.f10857n);
        int i5 = 0;
        if (this.f10857n != com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE && this.f10857n != com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED) {
            z4 = true;
        } else {
            z4 = false;
        }
        try {
            z5 = w();
            z6 = false;
        } catch (Exception e5) {
            if (e5 instanceof BaseException) {
                this.f10865v.a((BaseException) e5);
            } else {
                this.f10865v.a(new BaseException(1046, e5));
            }
            z5 = true;
            z6 = true;
        }
        if (!z5 && !z6) {
            this.C = true;
            com.ss.android.socialbase.downloader.c.a.b(f10844a, "jump to restart");
            return;
        }
        this.f10856m.set(false);
        if (z4) {
            try {
                com.ss.android.socialbase.downloader.impls.a D = com.ss.android.socialbase.downloader.downloader.c.D();
                if (D != null) {
                    D.a(this);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                x monitorDepend = this.f10846c.getMonitorDepend();
                DownloadInfo downloadInfo = this.f10859p;
                BaseException baseException = new BaseException(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, com.ss.android.socialbase.downloader.i.f.b(th, "removeDownloadRunnable"));
                DownloadInfo downloadInfo2 = this.f10859p;
                if (downloadInfo2 != null) {
                    i5 = downloadInfo2.getStatus();
                }
                com.ss.android.socialbase.downloader.d.a.a(monitorDepend, downloadInfo, baseException, i5);
            }
        }
    }

    private void q() {
        com.ss.android.socialbase.downloader.network.g gVar = this.f10868y;
        if (gVar != null) {
            gVar.c();
            this.f10868y = null;
        }
    }

    private void r() {
        i iVar = this.f10867x;
        if (iVar != null) {
            iVar.d();
            this.f10867x = null;
        }
    }

    private void s() {
        q();
        r();
    }

    private void t() throws BaseException {
        if (this.f10850g != null) {
            if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED) {
                this.f10859p.setStatus(-4);
                this.f10850g.c();
            } else if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE) {
                this.f10859p.setStatus(-2);
                this.f10850g.b();
            } else {
                this.f10850g.d();
            }
        }
    }

    private boolean u() {
        return this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED || this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE;
    }

    private boolean v() {
        if (!u() && this.f10859p.getStatus() != -2) {
            return false;
        }
        if (!u()) {
            if (this.f10859p.getStatus() == -2) {
                this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE;
                return true;
            }
            if (this.f10859p.getStatus() == -4) {
                this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED;
                return true;
            }
            return true;
        }
        return true;
    }

    private boolean w() {
        if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_ERROR) {
            this.f10865v.a(this.f10866w);
        } else if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED) {
            this.f10865v.c();
        } else if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE) {
            this.f10865v.d();
        } else if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_END_RIGHT_NOW) {
            try {
                this.f10865v.g();
            } catch (BaseException e5) {
                this.f10865v.a(e5);
            }
        } else if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_END_FOR_FILE_EXIST) {
            try {
                this.f10865v.a(this.E);
            } catch (BaseException e6) {
                this.f10865v.a(e6);
            }
        } else {
            if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET) {
                this.f10865v.a(this.f10866w, false);
                return false;
            }
            if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_WAITING_ASYNC_HANDLER) {
                return true;
            }
            com.ss.android.socialbase.downloader.constants.h hVar = this.f10857n;
            com.ss.android.socialbase.downloader.constants.h hVar2 = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_RETRY_DELAY;
            if (hVar == hVar2 && !x()) {
                com.ss.android.socialbase.downloader.c.a.b(f10844a, "doTaskStatusHandle retryDelay");
                z();
                if (this.f10857n == hVar2) {
                    return true;
                }
                return false;
            }
            try {
                if (!y()) {
                    return false;
                }
                this.f10865v.f();
                com.ss.android.socialbase.downloader.impls.r.a().d();
            } catch (Throwable th) {
                b(new BaseException(PointerIconCompat.TYPE_TEXT, com.ss.android.socialbase.downloader.i.f.b(th, "doTaskStatusHandle onComplete")));
            }
        }
        return true;
    }

    private boolean x() {
        if (this.f10859p.getChunkCount() <= 1) {
            if (this.f10859p.getCurBytes() <= 0 || this.f10859p.getCurBytes() != this.f10859p.getTotalBytes()) {
                return false;
            }
            return true;
        }
        List<com.ss.android.socialbase.downloader.model.b> c5 = this.f10858o.c(this.f10859p.getId());
        if (c5 == null || c5.size() <= 1) {
            return false;
        }
        for (com.ss.android.socialbase.downloader.model.b bVar : c5) {
            if (bVar == null || !bVar.i()) {
                return false;
            }
        }
        return true;
    }

    private boolean y() {
        if (this.f10859p.isChunked()) {
            DownloadInfo downloadInfo = this.f10859p;
            downloadInfo.setTotalBytes(downloadInfo.getCurBytes());
        }
        com.ss.android.socialbase.downloader.c.a.c(f10844a, "checkCompletedByteValid: downloadInfo.getCurBytes() = " + this.f10859p.getCurBytes() + ",  downloadInfo.getTotalBytes() = " + this.f10859p.getTotalBytes());
        if (this.f10859p.getCurBytes() > 0) {
            if (!this.f10859p.isIgnoreDataVerify()) {
                if (this.f10859p.getTotalBytes() > 0 && this.f10859p.getCurBytes() == this.f10859p.getTotalBytes()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        this.f10859p.setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.f10859p.reset();
        this.f10858o.a(this.f10859p);
        this.f10858o.d(this.f10859p.getId());
        this.f10858o.m(this.f10859p.getId());
        com.ss.android.socialbase.downloader.i.f.a(this.f10859p);
        return false;
    }

    private void z() {
        this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_NONE;
    }

    public void b() {
        com.ss.android.socialbase.downloader.constants.h hVar = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED;
        this.f10857n = hVar;
        if (this.K != null) {
            this.K.a();
        }
        if (this.f10850g != null) {
            this.f10850g.c();
        }
        if (this.K == null && this.f10850g == null) {
            s();
            this.f10857n = hVar;
            p();
        }
        I();
    }

    public DownloadTask c() {
        return this.f10846c;
    }

    public boolean d() {
        return this.f10856m.get();
    }

    public int e() {
        DownloadInfo downloadInfo = this.f10859p;
        if (downloadInfo != null) {
            return downloadInfo.getId();
        }
        return 0;
    }

    public void f() {
        this.H = System.currentTimeMillis();
        this.f10865v.a();
    }

    public Future g() {
        return this.f10845b;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.ss.android.socialbase.downloader.downloader.c.a(this.f10846c, 3);
        try {
            com.ss.android.socialbase.downloader.network.b.a().b();
            k();
            com.ss.android.socialbase.downloader.network.b.a().c();
            com.ss.android.socialbase.downloader.downloader.c.b(this.f10846c, 3);
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.network.b.a().c();
            throw th;
        }
    }

    private boolean d(BaseException baseException) {
        AtomicInteger atomicInteger = this.f10848e;
        boolean z4 = true;
        if (atomicInteger != null) {
            if (atomicInteger.get() <= 0 || (baseException != null && baseException.getErrorCode() == 1070)) {
                if (this.f10859p.trySwitchToNextBackupUrl()) {
                    this.f10848e.set(this.f10859p.getBackUpUrlRetryCount());
                    this.f10859p.updateCurRetryTime(this.f10848e.get());
                } else if (baseException != null && ((baseException.getErrorCode() == 1011 || (baseException.getCause() != null && (baseException.getCause() instanceof SSLHandshakeException))) && this.f10859p.canReplaceHttpForRetry())) {
                    this.f10848e.set(this.f10859p.getRetryCount());
                    this.f10859p.updateCurRetryTime(this.f10848e.get());
                    this.f10859p.setHttpsToHttpRetryUsed(true);
                } else {
                    b(new BaseException(baseException.getErrorCode(), String.format("retry for exception, but current retry time : %s , retry Time %s all used, last error is %s", String.valueOf(this.f10848e), String.valueOf(this.f10859p.getRetryCount()), baseException.getErrorMessage())));
                    return true;
                }
                z4 = false;
            }
            if (this.f10857n != com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_RETRY_DELAY && z4) {
                this.f10859p.updateCurRetryTime(this.f10848e.decrementAndGet());
            }
            return false;
        }
        b(new BaseException(1043, "retry for exception, but retain retry time is null, last error is :" + baseException.getErrorMessage()));
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public void c(BaseException baseException) {
        DownloadInfo downloadInfo = this.f10859p;
        if (downloadInfo != null) {
            downloadInfo.setChunkDowngradeRetryUsed(true);
        }
        a(baseException, false);
    }

    public void a() {
        com.ss.android.socialbase.downloader.constants.h hVar = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE;
        this.f10857n = hVar;
        if (this.K != null) {
            this.K.b();
        }
        if (this.f10850g != null) {
            this.f10850g.b();
        }
        if (this.K == null && this.f10850g == null) {
            s();
            this.f10857n = hVar;
            p();
        }
        try {
            Iterator it = ((ArrayList) this.f10849f.clone()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null) {
                    bVar.a();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void c(long j5) {
        i iVar = this.f10867x;
        if (iVar != null && (iVar instanceof com.ss.android.socialbase.downloader.network.a)) {
            try {
                ((com.ss.android.socialbase.downloader.network.a) iVar).a(j5);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void b(String str, List<com.ss.android.socialbase.downloader.model.c> list, long j5) throws BaseException, com.ss.android.socialbase.downloader.exception.i {
        com.ss.android.socialbase.downloader.network.a.c a5;
        boolean z4 = true;
        if (this.f10859p.getChunkCount() == 1 && (a5 = com.ss.android.socialbase.downloader.network.a.a.a().a(str, list)) != null) {
            this.f10868y = a5;
            this.f10859p.setPreconnectLevel(1);
        }
        if (this.f10868y == null && !this.D && this.f10859p.isHeadConnectionAvailable()) {
            try {
                int b5 = this.I.b("net_lib_strategy");
                if (this.I.a("monitor_download_connect", 0) <= 0) {
                    z4 = false;
                }
                this.f10868y = com.ss.android.socialbase.downloader.downloader.c.a(str, list, b5, z4, this.f10859p);
            } catch (Throwable th) {
                this.f10859p.setHeadConnectionException(com.ss.android.socialbase.downloader.i.f.j(th));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        if (r9 <= 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(long r7, java.util.List<com.ss.android.socialbase.downloader.model.b> r9) {
        /*
            r6 = this;
            boolean r0 = r6.C()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5e
            boolean r0 = r6.f10852i
            if (r0 == 0) goto L1a
            if (r9 == 0) goto L13
            int r9 = r9.size()
            goto L5c
        L13:
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r6.f10859p
            int r9 = r9.getChunkCount()
            goto L5c
        L1a:
            com.ss.android.socialbase.downloader.downloader.h r9 = r6.f10860q
            if (r9 == 0) goto L23
            int r9 = r9.a(r7)
            goto L29
        L23:
            com.ss.android.socialbase.downloader.downloader.h r9 = r6.f10861r
            int r9 = r9.a(r7)
        L29:
            com.ss.android.socialbase.downloader.network.k r0 = com.ss.android.socialbase.downloader.network.k.a()
            com.ss.android.socialbase.downloader.network.l r0 = r0.b()
            java.lang.String r3 = com.ss.android.socialbase.downloader.h.c.f10844a
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r0.name()
            r4[r1] = r5
            java.lang.String r5 = "NetworkQuality is : %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            com.ss.android.socialbase.downloader.c.a.b(r3, r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r6.f10859p
            java.lang.String r4 = r0.name()
            r3.setNetworkQuality(r4)
            com.ss.android.socialbase.downloader.downloader.g r3 = r6.f10862s
            if (r3 == 0) goto L56
            int r9 = r3.a(r9, r0)
            goto L5c
        L56:
            com.ss.android.socialbase.downloader.downloader.g r3 = r6.f10863t
            int r9 = r3.a(r9, r0)
        L5c:
            if (r9 > 0) goto L5f
        L5e:
            r9 = r2
        L5f:
            boolean r0 = com.ss.android.socialbase.downloader.c.a.a()
            if (r0 == 0) goto L88
            java.lang.String r0 = com.ss.android.socialbase.downloader.h.c.f10844a
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r3[r1] = r4
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r6.f10859p
            java.lang.String r1 = r1.getName()
            r3[r2] = r1
            r1 = 2
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r3[r1] = r7
            java.lang.String r7 = "chunk count : %s for %s contentLen:%s"
            java.lang.String r7 = java.lang.String.format(r7, r3)
            com.ss.android.socialbase.downloader.c.a.b(r0, r7)
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.c.a(long, java.util.List):int");
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public boolean b(long j5) throws BaseException {
        if (this.G > 0 && this.f10859p.getCurBytes() > this.G) {
            D();
        }
        return this.f10865v.a(j5);
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public void b(BaseException baseException) {
        com.ss.android.socialbase.downloader.c.a.b(f10844a, "onError:" + baseException.getMessage());
        this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_ERROR;
        this.f10866w = baseException;
        I();
    }

    private void a(String str, List<com.ss.android.socialbase.downloader.model.c> list, long j5) throws BaseException, com.ss.android.socialbase.downloader.exception.i {
        b(str, list, j5);
        com.ss.android.socialbase.downloader.network.g gVar = this.f10868y;
        if (gVar != null) {
            try {
                a(str, gVar, j5);
            } catch (Throwable unused) {
                this.D = true;
            }
        }
        if (this.f10868y == null || this.D) {
            a(str, list);
            a(str, this.f10867x, j5);
        }
    }

    private void a(String str, List<com.ss.android.socialbase.downloader.model.c> list) throws BaseException, com.ss.android.socialbase.downloader.exception.i {
        i iVar;
        if (this.f10867x != null) {
            return;
        }
        com.ss.android.socialbase.downloader.network.a.d b5 = this.f10859p.getChunkCount() == 1 ? com.ss.android.socialbase.downloader.network.a.a.a().b(str, list) : null;
        try {
            if (b5 != null) {
                a(this.f10867x);
                this.f10859p.setPreconnectLevel(2);
                this.f10867x = b5;
            } else {
                try {
                    iVar = com.ss.android.socialbase.downloader.downloader.c.a(this.f10859p.isNeedDefaultHttpServiceBackUp(), this.f10859p.getMaxBytes(), str, null, list, this.I.b("net_lib_strategy"), this.I.a("monitor_download_connect", 0) > 0, this.f10859p);
                    this.f10867x = iVar;
                } catch (BaseException e5) {
                    throw e5;
                } catch (Throwable th) {
                    if (this.f10859p.isExpiredRedownload() && com.ss.android.socialbase.downloader.i.f.g(th) && com.ss.android.socialbase.downloader.i.f.c(list)) {
                        com.ss.android.socialbase.downloader.c.a.b(f10844a, "dcache=execepiton responseCode=304 lastModified not changed, use local file.. old cacheControl=" + this.f10859p.getCacheControl());
                        long i5 = com.ss.android.socialbase.downloader.i.f.i(this.f10859p.getCacheControl());
                        if (i5 <= 0) {
                            i5 = com.ss.android.socialbase.downloader.g.a.a(this.f10859p.getId()).a("default_304_max_age", 300);
                        }
                        this.f10859p.setCacheExpiredTime(System.currentTimeMillis() + (i5 * 1000));
                        throw new com.ss.android.socialbase.downloader.exception.a(this.E);
                    }
                    if (com.ss.android.socialbase.downloader.i.f.f(th)) {
                        a("", "http code 416");
                    } else if (com.ss.android.socialbase.downloader.i.f.e(th)) {
                        a("", "http code 412");
                    } else {
                        com.ss.android.socialbase.downloader.i.f.a(th, "CreateFirstConnection");
                    }
                    iVar = this.f10867x;
                }
                a(iVar);
            }
            if (this.f10867x == null) {
                throw new BaseException(1022, new IOException("download can't continue, firstConnection is null"));
            }
        } catch (Throwable th2) {
            a(this.f10867x);
            throw th2;
        }
    }

    public static com.ss.android.socialbase.downloader.model.b a(DownloadInfo downloadInfo, long j5) {
        return new b.a(downloadInfo.getId()).a(-1).a(0L).e(j5).b(j5).c(0L).d(downloadInfo.getTotalBytes() - j5).a();
    }

    private List<com.ss.android.socialbase.downloader.model.c> a(com.ss.android.socialbase.downloader.model.b bVar) {
        List<com.ss.android.socialbase.downloader.model.c> a5 = com.ss.android.socialbase.downloader.i.f.a(this.f10859p.getExtraHeaders(), this.f10859p.geteTag(), bVar);
        if (this.f10859p.isExpiredRedownload() && this.F && this.f10859p.getLastModified() != null) {
            a5.add(new com.ss.android.socialbase.downloader.model.c("if-modified-since", this.f10859p.getLastModified()));
            a5.add(new com.ss.android.socialbase.downloader.model.c("download-tc21-1-15", "download-tc21-1-15"));
            com.ss.android.socialbase.downloader.c.a.b(f10844a, "dcache::add head IF_MODIFIED_SINCE=" + this.f10859p.getLastModified());
        }
        return a5;
    }

    private void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws BaseException {
        if (list.size() == i5) {
            a(list, this.f10859p.getTotalBytes());
            return;
        }
        throw new BaseException(1033, new IllegalArgumentException());
    }

    private void a(long j5, int i5) throws BaseException {
        long j6 = j5 / i5;
        int id = this.f10859p.getId();
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        long j7 = 0;
        while (i6 < i5) {
            com.ss.android.socialbase.downloader.model.b a5 = new b.a(id).a(i6).a(j7).e(j7).b(j7).c(i6 == i5 + (-1) ? 0L : (j7 + j6) - 1).a();
            arrayList.add(a5);
            this.f10858o.a(a5);
            j7 += j6;
            i6++;
        }
        this.f10859p.setChunkCount(i5);
        this.f10858o.a(id, i5);
        a(arrayList, j5);
    }

    private void a(List<com.ss.android.socialbase.downloader.model.b> list, long j5) throws BaseException {
        long p5;
        for (com.ss.android.socialbase.downloader.model.b bVar : list) {
            if (bVar != null) {
                if (bVar.p() == 0) {
                    p5 = j5 - bVar.n();
                } else {
                    p5 = (bVar.p() - bVar.n()) + 1;
                }
                if (p5 > 0) {
                    bVar.a(p5);
                    if (this.f10859p.isNeedReuseFirstConnection() && this.f10867x != null && (!this.f10859p.isHeadConnectionAvailable() || this.D)) {
                        if (bVar.s() == 0) {
                            this.f10849f.add(new b(bVar, this.f10846c, this.f10867x, this));
                        } else if (bVar.s() > 0) {
                            this.f10849f.add(new b(bVar, this.f10846c, this));
                        }
                    } else {
                        this.f10849f.add(new b(bVar, this.f10846c, this));
                    }
                }
            }
        }
        if (com.ss.android.socialbase.downloader.i.a.a(64)) {
            ArrayList arrayList = new ArrayList(this.f10849f.size());
            Iterator<b> it = this.f10849f.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED) {
                    next.b();
                } else if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE) {
                    next.a();
                } else {
                    arrayList.add(next);
                }
            }
            try {
                List<Future> d5 = com.ss.android.socialbase.downloader.impls.e.d(arrayList);
                for (Runnable runnable = (Runnable) arrayList.remove(0); runnable != null; runnable = com.ss.android.socialbase.downloader.impls.e.e(d5)) {
                    if (v()) {
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                if (d5 == null || d5.isEmpty()) {
                    return;
                }
                for (Future future : d5) {
                    if (future != null && !future.isDone()) {
                        try {
                            future.get();
                        } catch (Throwable unused) {
                        }
                    }
                }
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList(this.f10849f.size());
        Iterator<b> it2 = this.f10849f.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_CANCELED) {
                next2.b();
            } else if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_PAUSE) {
                next2.a();
            } else {
                arrayList2.add(Executors.callable(next2));
            }
        }
        if (v()) {
            return;
        }
        try {
            com.ss.android.socialbase.downloader.impls.e.c(arrayList2);
        } catch (InterruptedException e5) {
            throw new BaseException(PointerIconCompat.TYPE_GRAB, e5);
        }
    }

    private void a(com.ss.android.socialbase.downloader.model.b bVar, String str, i iVar) throws BaseException {
        bVar.a(this.f10859p.getTotalBytes() - bVar.n());
        this.f10859p.setChunkCount(1);
        this.f10858o.a(this.f10859p.getId(), 1);
        this.f10850g = new com.ss.android.socialbase.downloader.downloader.e(this.f10859p, str, iVar, bVar, this);
        t();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|7|8|(4:10|(1:12)|13|(2:15|(4:17|(2:19|(1:21)(2:56|57))(1:58)|22|(8:24|(1:26)|27|28|29|30|31|32))(2:59|(6:61|28|29|30|31|32)(4:62|(1:64)(1:67)|65|66))))(2:69|(4:71|(1:73)(1:76)|74|75)(2:77|(2:79|80)))|68|27|28|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016f, code lost:
    
        com.ss.android.socialbase.downloader.c.a.e(com.ss.android.socialbase.downloader.h.c.f10844a, "checkSpaceOverflow: setLength1 e = " + r0 + ", mustSetLength = " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0191, code lost:
    
        if (r5 >= r24) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x019d, code lost:
    
        r7.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a3, code lost:
    
        com.ss.android.socialbase.downloader.c.a.e(com.ss.android.socialbase.downloader.h.c.f10844a, "checkSpaceOverflow: setLength2 ex = " + r0 + ", mustSetLength = " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01bf, code lost:
    
        if (r4 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c7, code lost:
    
        throw new com.ss.android.socialbase.downloader.exception.BaseException(1040, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c8, code lost:
    
        if (r4 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d9, code lost:
    
        throw new com.ss.android.socialbase.downloader.exception.BaseException(1040, r0);
     */
    @Override // com.ss.android.socialbase.downloader.h.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r24) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.c.a(long):void");
    }

    private boolean a(int i5, String str, String str2) {
        if (i5 == 412) {
            return true;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2) || !(this.f10854k || this.f10853j)) {
            return (i5 == 201 || i5 == 416) && this.f10859p.getCurBytes() > 0;
        }
        return true;
    }

    private void a(String str, String str2) throws com.ss.android.socialbase.downloader.exception.i {
        this.f10858o.d(this.f10859p.getId());
        this.f10858o.m(this.f10859p.getId());
        com.ss.android.socialbase.downloader.i.f.a(this.f10859p);
        this.f10852i = false;
        this.f10859p.resetDataForEtagEndure(str);
        this.f10858o.a(this.f10859p);
        throw new com.ss.android.socialbase.downloader.exception.i(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x027a, code lost:
    
        if (r19.I.b("fix_get_total_bytes", true) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x027c, code lost:
    
        r3 = com.ss.android.socialbase.downloader.i.f.b(r8);
        com.ss.android.socialbase.downloader.c.a.c(r14, "firstConnection: 1 totalLength = " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0295, code lost:
    
        r12 = r22 + r3;
        com.ss.android.socialbase.downloader.c.a.e(r14, "firstConnection: 2 totalLength = " + r12 + ", contentLength = " + r3);
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013a, code lost:
    
        com.ss.android.socialbase.downloader.i.f.a(r19.f10859p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0251, code lost:
    
        r8 = com.ss.android.socialbase.downloader.i.f.b(r11, "Content-Range");
        com.ss.android.socialbase.downloader.c.a.c(r14, "firstConnection: contentRange = " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x026f, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) != false) goto L106;
     */
    @Override // com.ss.android.socialbase.downloader.h.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r20, com.ss.android.socialbase.downloader.network.g r21, long r22) throws com.ss.android.socialbase.downloader.exception.BaseException, com.ss.android.socialbase.downloader.exception.i {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.c.a(java.lang.String, com.ss.android.socialbase.downloader.network.g, long):void");
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public void a(b bVar) {
        if (this.f10851h) {
            return;
        }
        synchronized (this) {
            this.f10849f.remove(bVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public boolean a(BaseException baseException) {
        if (this.K != null && com.ss.android.socialbase.downloader.i.f.i(baseException) && this.f10848e.get() < this.f10859p.getRetryCount()) {
            return false;
        }
        if (com.ss.android.socialbase.downloader.i.f.b(baseException)) {
            if (this.f10851h && !this.f10847d) {
                com.ss.android.socialbase.downloader.i.f.a(this.f10859p);
                this.f10847d = true;
            }
            return true;
        }
        AtomicInteger atomicInteger = this.f10848e;
        if ((atomicInteger == null || atomicInteger.get() <= 0) && !this.f10859p.hasNextBackupUrl()) {
            if (baseException == null) {
                return false;
            }
            if ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f10859p.canReplaceHttpForRetry()) {
                return false;
            }
        }
        return !(baseException instanceof com.ss.android.socialbase.downloader.exception.f);
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public void a(BaseException baseException, boolean z4) {
        com.ss.android.socialbase.downloader.c.a.b(f10844a, "onAllChunkRetryWithReset");
        this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;
        this.f10866w = baseException;
        I();
        if (z4 ? d(baseException) : false) {
            return;
        }
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f10859p.setForbiddenBackupUrls(list, this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_WAITING_ASYNC_HANDLER);
        com.ss.android.socialbase.downloader.impls.a D = com.ss.android.socialbase.downloader.downloader.c.D();
        if (D != null) {
            D.l(this.f10859p.getId());
        }
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public com.ss.android.socialbase.downloader.exception.h a(com.ss.android.socialbase.downloader.model.b bVar, BaseException baseException, long j5) {
        if (u()) {
            return com.ss.android.socialbase.downloader.exception.h.RETURN;
        }
        if (baseException != null && (baseException.getErrorCode() == 1047 || com.ss.android.socialbase.downloader.i.f.h(baseException))) {
            return a(baseException, j5);
        }
        this.f10866w = baseException;
        this.f10859p.increaseCurBytes(-j5);
        this.f10858o.a(this.f10859p);
        if (d(baseException)) {
            return com.ss.android.socialbase.downloader.exception.h.RETURN;
        }
        com.ss.android.socialbase.downloader.downloader.f fVar = this.f10865v;
        com.ss.android.socialbase.downloader.constants.h hVar = this.f10857n;
        com.ss.android.socialbase.downloader.constants.h hVar2 = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_RETRY_DELAY;
        fVar.a(bVar, baseException, hVar == hVar2);
        if (this.f10857n != hVar2 && this.f10859p.isNeedRetryDelay()) {
            long A = A();
            if (A > 0) {
                com.ss.android.socialbase.downloader.c.a.c(f10844a, "onSingleChunkRetry with delay time " + A);
                try {
                    Thread.sleep(A);
                } catch (Throwable th) {
                    com.ss.android.socialbase.downloader.c.a.d(f10844a, "onSingleChunkRetry:" + th.getMessage());
                }
            }
        }
        return com.ss.android.socialbase.downloader.exception.h.CONTINUE;
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public com.ss.android.socialbase.downloader.exception.h a(BaseException baseException, long j5) {
        long j6;
        long totalBytes;
        boolean z4;
        this.f10866w = baseException;
        this.f10859p.increaseCurBytes(-j5);
        this.f10858o.a(this.f10859p);
        if (u()) {
            return com.ss.android.socialbase.downloader.exception.h.RETURN;
        }
        if (baseException != null && baseException.getErrorCode() == 1047) {
            if (this.f10869z != null && !this.f10859p.isForbiddenRetryed()) {
                com.ss.android.socialbase.downloader.depend.b bVar = new com.ss.android.socialbase.downloader.depend.b() { // from class: com.ss.android.socialbase.downloader.h.c.1
                    @Override // com.ss.android.socialbase.downloader.depend.b, com.ss.android.socialbase.downloader.depend.v
                    public void a(List<String> list) {
                        super.a(list);
                        c.this.a(list);
                    }
                };
                boolean a5 = this.f10869z.a(bVar);
                this.f10859p.setForbiddenRetryed();
                if (a5) {
                    if (!bVar.a()) {
                        I();
                        this.f10865v.h();
                        this.f10857n = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_WAITING_ASYNC_HANDLER;
                        return com.ss.android.socialbase.downloader.exception.h.RETURN;
                    }
                    z4 = true;
                }
            } else if (d(baseException)) {
                return com.ss.android.socialbase.downloader.exception.h.RETURN;
            }
            z4 = false;
        } else if (com.ss.android.socialbase.downloader.i.f.h(baseException)) {
            if (this.A == null) {
                b(baseException);
                return com.ss.android.socialbase.downloader.exception.h.RETURN;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            q qVar = new q() { // from class: com.ss.android.socialbase.downloader.h.c.2
                @Override // com.ss.android.socialbase.downloader.depend.q
                public void a() {
                    synchronized (c.this) {
                        atomicBoolean.set(true);
                        c.this.J();
                    }
                }
            };
            if (baseException instanceof com.ss.android.socialbase.downloader.exception.d) {
                com.ss.android.socialbase.downloader.exception.d dVar = (com.ss.android.socialbase.downloader.exception.d) baseException;
                j6 = dVar.a();
                totalBytes = dVar.b();
            } else {
                j6 = -1;
                totalBytes = this.f10859p.getTotalBytes();
            }
            synchronized (this) {
                if (this.A.a(j6, totalBytes, qVar)) {
                    if (!com.ss.android.socialbase.downloader.g.a.a(this.f10859p.getId()).b("not_delete_when_clean_space", false)) {
                        y();
                    }
                    if (!atomicBoolean.get()) {
                        com.ss.android.socialbase.downloader.constants.h hVar = this.f10857n;
                        com.ss.android.socialbase.downloader.constants.h hVar2 = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_WAITING_ASYNC_HANDLER;
                        if (hVar != hVar2) {
                            this.f10857n = hVar2;
                            I();
                            this.f10865v.h();
                        }
                        return com.ss.android.socialbase.downloader.exception.h.RETURN;
                    }
                    if (d(baseException)) {
                        return com.ss.android.socialbase.downloader.exception.h.RETURN;
                    }
                    z4 = true;
                } else {
                    if (this.f10857n == com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_WAITING_ASYNC_HANDLER) {
                        return com.ss.android.socialbase.downloader.exception.h.RETURN;
                    }
                    b(baseException);
                    return com.ss.android.socialbase.downloader.exception.h.RETURN;
                }
            }
        } else {
            if (d(baseException)) {
                return com.ss.android.socialbase.downloader.exception.h.RETURN;
            }
            z4 = false;
        }
        if (!z4 && K()) {
            I();
        }
        com.ss.android.socialbase.downloader.downloader.f fVar = this.f10865v;
        com.ss.android.socialbase.downloader.constants.h hVar3 = this.f10857n;
        com.ss.android.socialbase.downloader.constants.h hVar4 = com.ss.android.socialbase.downloader.constants.h.RUN_STATUS_RETRY_DELAY;
        fVar.a(baseException, hVar3 == hVar4);
        return this.f10857n == hVar4 ? com.ss.android.socialbase.downloader.exception.h.RETURN : com.ss.android.socialbase.downloader.exception.h.CONTINUE;
    }

    @Override // com.ss.android.socialbase.downloader.h.f
    public synchronized com.ss.android.socialbase.downloader.model.b a(int i5) {
        com.ss.android.socialbase.downloader.model.b a5;
        if (this.f10859p.getChunkCount() < 2) {
            return null;
        }
        List<com.ss.android.socialbase.downloader.model.b> c5 = this.f10858o.c(this.f10859p.getId());
        if (c5 != null && !c5.isEmpty()) {
            for (int i6 = 0; i6 < c5.size(); i6++) {
                com.ss.android.socialbase.downloader.model.b bVar = c5.get(i6);
                if (bVar != null && (a5 = a(bVar, i5)) != null) {
                    return a5;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.socialbase.downloader.h.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.ss.android.socialbase.downloader.network.g r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L1a
            int r2 = r2.b()     // Catch: java.lang.Throwable -> L16
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f10859p     // Catch: java.lang.Throwable -> L16
            r0.setHttpStatusCode(r2)     // Catch: java.lang.Throwable -> L16
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f10859p     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = com.ss.android.socialbase.downloader.i.b.a(r2)     // Catch: java.lang.Throwable -> L16
            r0.setHttpStatusMessage(r2)     // Catch: java.lang.Throwable -> L16
            r2 = 1
            goto L1b
        L16:
            r2 = move-exception
            r2.printStackTrace()
        L1a:
            r2 = 0
        L1b:
            if (r2 != 0) goto L2a
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f10859p
            r0 = -1
            r2.setHttpStatusCode(r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f10859p
            java.lang.String r0 = ""
            r2.setHttpStatusMessage(r0)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.c.a(com.ss.android.socialbase.downloader.network.g):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ss.android.socialbase.downloader.model.b a(com.ss.android.socialbase.downloader.model.b r9, int r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.c.a(com.ss.android.socialbase.downloader.model.b, int):com.ss.android.socialbase.downloader.model.b");
    }

    private s a(DownloadTask downloadTask) {
        s retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
        if (retryDelayTimeCalculator != null) {
            return retryDelayTimeCalculator;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            String retryDelayTimeArray = downloadInfo.getRetryDelayTimeArray();
            if (!TextUtils.isEmpty(retryDelayTimeArray)) {
                return new com.ss.android.socialbase.downloader.impls.q(retryDelayTimeArray);
            }
        }
        return com.ss.android.socialbase.downloader.downloader.c.M();
    }

    public void a(Future future) {
        this.f10845b = future;
    }
}
