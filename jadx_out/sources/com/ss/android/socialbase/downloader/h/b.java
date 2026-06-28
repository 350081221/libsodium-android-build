package com.ss.android.socialbase.downloader.h;

import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.i;

/* loaded from: classes3.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10832a = "b";

    /* renamed from: b, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.b f10833b;

    /* renamed from: c, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.b f10834c;

    /* renamed from: d, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.e f10835d;

    /* renamed from: e, reason: collision with root package name */
    private final DownloadTask f10836e;

    /* renamed from: f, reason: collision with root package name */
    private DownloadInfo f10837f;

    /* renamed from: g, reason: collision with root package name */
    private final f f10838g;

    /* renamed from: h, reason: collision with root package name */
    private i f10839h;

    /* renamed from: i, reason: collision with root package name */
    private j f10840i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f10841j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f10842k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10843l;

    public b(com.ss.android.socialbase.downloader.model.b bVar, DownloadTask downloadTask, f fVar) {
        this.f10843l = false;
        this.f10834c = bVar;
        this.f10836e = downloadTask;
        if (downloadTask != null) {
            this.f10837f = downloadTask.getDownloadInfo();
        }
        this.f10838g = fVar;
        this.f10840i = com.ss.android.socialbase.downloader.downloader.c.y();
        this.f10834c.a(this);
    }

    private String c() {
        return this.f10837f.getConnectionUrl();
    }

    private void d() {
        i iVar = this.f10839h;
        if (iVar != null) {
            iVar.d();
            this.f10839h = null;
        }
    }

    private boolean e() {
        return this.f10841j || this.f10842k;
    }

    public void a(long j5, long j6) {
        com.ss.android.socialbase.downloader.downloader.e eVar = this.f10835d;
        if (eVar == null) {
            return;
        }
        eVar.a(j5, j6);
    }

    public void b() {
        this.f10842k = true;
        com.ss.android.socialbase.downloader.downloader.e eVar = this.f10835d;
        if (eVar != null) {
            eVar.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0017, code lost:
    
        r3.f10833b.a(false);
     */
    @Override // java.lang.Runnable
    @android.annotation.SuppressLint({"DefaultLocale"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r3 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.ss.android.socialbase.downloader.model.b r0 = r3.f10834c
            r3.f10833b = r0
        L9:
            r0 = 0
            com.ss.android.socialbase.downloader.model.b r1 = r3.f10833b     // Catch: java.lang.Throwable -> L5d
            r1.a(r3)     // Catch: java.lang.Throwable -> L5d
            com.ss.android.socialbase.downloader.model.b r1 = r3.f10833b     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L1d
            com.ss.android.socialbase.downloader.model.b r1 = r3.f10833b     // Catch: java.lang.Throwable -> L5d
            r1.a(r0)     // Catch: java.lang.Throwable -> L5d
            goto L4d
        L1d:
            com.ss.android.socialbase.downloader.model.b r1 = r3.f10833b     // Catch: java.lang.Throwable -> L5d
            r1.a(r0)     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r3.e()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L29
            goto L4d
        L29:
            com.ss.android.socialbase.downloader.h.f r1 = r3.f10838g     // Catch: java.lang.Throwable -> L5d
            com.ss.android.socialbase.downloader.model.b r2 = r3.f10833b     // Catch: java.lang.Throwable -> L5d
            int r2 = r2.s()     // Catch: java.lang.Throwable -> L5d
            com.ss.android.socialbase.downloader.model.b r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L5d
            r3.f10833b = r1     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r3.e()     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L4d
            com.ss.android.socialbase.downloader.model.b r1 = r3.f10833b     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L42
            goto L4d
        L42:
            r1 = 50
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L48
            goto L9
        L48:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L5d
            goto L9
        L4d:
            com.ss.android.socialbase.downloader.model.b r1 = r3.f10833b
            if (r1 == 0) goto L54
            r1.a(r0)
        L54:
            r3.d()
            com.ss.android.socialbase.downloader.h.f r0 = r3.f10838g
            r0.a(r3)
            return
        L5d:
            r1 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r3.f10833b
            if (r2 == 0) goto L65
            r2.a(r0)
        L65:
            r3.d()
            com.ss.android.socialbase.downloader.h.f r0 = r3.f10838g
            r0.a(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.b.run():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0190 A[Catch: all -> 0x01a9, BaseException -> 0x01ab, TRY_LEAVE, TryCatch #4 {all -> 0x01a9, blocks: (B:54:0x013a, B:56:0x0141, B:60:0x014d, B:61:0x0153, B:63:0x0164, B:166:0x0173, B:167:0x0181, B:179:0x018c, B:181:0x0190, B:192:0x01a5, B:193:0x01a8), top: B:53:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[Catch: all -> 0x01a9, BaseException -> 0x01ab, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x01a9, blocks: (B:54:0x013a, B:56:0x0141, B:60:0x014d, B:61:0x0153, B:63:0x0164, B:166:0x0173, B:167:0x0181, B:179:0x018c, B:181:0x0190, B:192:0x01a5, B:193:0x01a8), top: B:53:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9 A[Catch: all -> 0x01ae, BaseException -> 0x01ca, TRY_ENTER, TryCatch #15 {BaseException -> 0x01ca, all -> 0x01ae, blocks: (B:22:0x004e, B:24:0x0058, B:27:0x0063, B:33:0x00b2, B:35:0x00b6, B:44:0x00cb, B:45:0x00ef, B:47:0x00f9, B:49:0x00fd, B:51:0x012b, B:163:0x0123, B:159:0x012a, B:199:0x00d5, B:201:0x00d9), top: B:21:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0248 A[Catch: all -> 0x029a, TryCatch #15 {all -> 0x029a, blocks: (B:71:0x01cd, B:73:0x01d7, B:127:0x01dd, B:75:0x01e6, B:77:0x01ee, B:108:0x01f4, B:80:0x01ff, B:82:0x0203, B:84:0x020b, B:86:0x021c, B:88:0x0242, B:90:0x0248, B:91:0x0255, B:93:0x025d, B:98:0x024f, B:101:0x0229, B:103:0x0235, B:112:0x0268, B:114:0x0270, B:116:0x0278, B:118:0x0280, B:120:0x0288, B:123:0x0291, B:137:0x01b0, B:142:0x01ba, B:147:0x01c1), top: B:70:0x01cd, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025d A[Catch: all -> 0x029a, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x029a, blocks: (B:71:0x01cd, B:73:0x01d7, B:127:0x01dd, B:75:0x01e6, B:77:0x01ee, B:108:0x01f4, B:80:0x01ff, B:82:0x0203, B:84:0x020b, B:86:0x021c, B:88:0x0242, B:90:0x0248, B:91:0x0255, B:93:0x025d, B:98:0x024f, B:101:0x0229, B:103:0x0235, B:112:0x0268, B:114:0x0270, B:116:0x0278, B:118:0x0280, B:120:0x0288, B:123:0x0291, B:137:0x01b0, B:142:0x01ba, B:147:0x01c1), top: B:70:0x01cd, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024f A[Catch: all -> 0x029a, TryCatch #15 {all -> 0x029a, blocks: (B:71:0x01cd, B:73:0x01d7, B:127:0x01dd, B:75:0x01e6, B:77:0x01ee, B:108:0x01f4, B:80:0x01ff, B:82:0x0203, B:84:0x020b, B:86:0x021c, B:88:0x0242, B:90:0x0248, B:91:0x0255, B:93:0x025d, B:98:0x024f, B:101:0x0229, B:103:0x0235, B:112:0x0268, B:114:0x0270, B:116:0x0278, B:118:0x0280, B:120:0x0288, B:123:0x0291, B:137:0x01b0, B:142:0x01ba, B:147:0x01c1), top: B:70:0x01cd, inners: #14 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.ss.android.socialbase.downloader.model.b r31) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.h.b.a(com.ss.android.socialbase.downloader.model.b):boolean");
    }

    public b(com.ss.android.socialbase.downloader.model.b bVar, DownloadTask downloadTask, i iVar, f fVar) {
        this(bVar, downloadTask, fVar);
        this.f10839h = iVar;
    }

    private void a(com.ss.android.socialbase.downloader.model.b bVar, long j5) {
        com.ss.android.socialbase.downloader.model.b e5 = bVar.d() ? bVar.e() : bVar;
        if (e5 != null) {
            if (e5.h()) {
                this.f10840i.a(e5.k(), e5.b(), j5);
            }
            e5.b(j5);
            this.f10840i.a(e5.k(), e5.s(), e5.b(), j5);
            return;
        }
        if (bVar.d()) {
            this.f10840i.a(bVar.k(), bVar.s(), j5);
        }
    }

    public void a() {
        this.f10841j = true;
        com.ss.android.socialbase.downloader.downloader.e eVar = this.f10835d;
        if (eVar != null) {
            eVar.b();
        }
    }
}
