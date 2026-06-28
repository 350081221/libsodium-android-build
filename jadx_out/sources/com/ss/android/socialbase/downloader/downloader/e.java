package com.ss.android.socialbase.downloader.downloader;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static String f10627b = "ResponseHandler";
    private long A;
    private long B;
    private long C;
    private long D;

    /* renamed from: c, reason: collision with root package name */
    private final DownloadInfo f10629c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10630d;

    /* renamed from: e, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.model.b f10631e;

    /* renamed from: f, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.network.i f10632f;

    /* renamed from: g, reason: collision with root package name */
    private j f10633g;

    /* renamed from: h, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.impls.k f10634h;

    /* renamed from: i, reason: collision with root package name */
    private t f10635i;

    /* renamed from: j, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.e f10636j;

    /* renamed from: k, reason: collision with root package name */
    private BaseException f10637k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f10638l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f10639m;

    /* renamed from: n, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.h.f f10640n;

    /* renamed from: o, reason: collision with root package name */
    private long f10641o;

    /* renamed from: p, reason: collision with root package name */
    private long f10642p;

    /* renamed from: q, reason: collision with root package name */
    private volatile long f10643q;

    /* renamed from: r, reason: collision with root package name */
    private volatile long f10644r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f10645s;

    /* renamed from: t, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.g.a f10646t;

    /* renamed from: u, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.a.a f10647u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f10648v;

    /* renamed from: w, reason: collision with root package name */
    private final long f10649w;

    /* renamed from: x, reason: collision with root package name */
    private final long f10650x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f10651y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10652z;

    /* renamed from: a, reason: collision with root package name */
    boolean f10628a = false;
    private volatile long E = 0;
    private volatile long F = 0;

    public e(DownloadInfo downloadInfo, String str, com.ss.android.socialbase.downloader.network.i iVar, com.ss.android.socialbase.downloader.model.b bVar, com.ss.android.socialbase.downloader.h.f fVar) {
        boolean z4;
        this.f10629c = downloadInfo;
        this.f10630d = str;
        j y4 = c.y();
        this.f10633g = y4;
        if (y4 instanceof com.ss.android.socialbase.downloader.impls.d) {
            com.ss.android.socialbase.downloader.impls.d dVar = (com.ss.android.socialbase.downloader.impls.d) y4;
            this.f10634h = dVar.a();
            this.f10635i = dVar.f();
        }
        this.f10632f = iVar;
        this.f10631e = bVar;
        this.f10640n = fVar;
        long n5 = bVar.n();
        this.f10641o = n5;
        this.f10642p = n5;
        if (bVar.d()) {
            this.f10644r = bVar.q();
        } else {
            this.f10644r = bVar.c(false);
        }
        this.f10643q = bVar.p();
        this.f10647u = com.ss.android.socialbase.downloader.a.a.a();
        com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId());
        this.f10646t = a5;
        if (a5.a("sync_strategy", 0) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f10648v = z4;
        if (z4) {
            long a6 = a5.a("sync_interval_ms_fg", com.alipay.sdk.app.b.f3003h);
            long a7 = a5.a("sync_interval_ms_bg", 1000);
            this.f10649w = Math.max(a6, 500L);
            this.f10650x = Math.max(a7, 500L);
        } else {
            this.f10649w = 0L;
            this.f10650x = 0L;
        }
        this.f10651y = a5.b("monitor_rw") == 1;
        this.f10645s = com.ss.android.socialbase.downloader.i.a.a(65536);
    }

    private boolean b(long j5, long j6) {
        return j5 > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH && j6 > 500;
    }

    private boolean f() {
        return this.f10638l || this.f10639m;
    }

    private void g() {
        ExecutorService l5;
        if (this.f10632f != null && (l5 = c.l()) != null) {
            l5.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.e.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        e.this.f10632f.d();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void h() {
        long j5;
        boolean z4;
        if (this.f10651y) {
            j5 = System.nanoTime();
        } else {
            j5 = 0;
        }
        boolean z5 = false;
        try {
            this.f10636j.a();
            z4 = true;
        } catch (Exception unused) {
            z4 = false;
        }
        if (z4) {
            this.f10629c.updateRealDownloadTime(true);
            if (this.f10629c.getChunkCount() > 1) {
                z5 = true;
            }
            m a5 = com.ss.android.socialbase.downloader.impls.l.a(com.ss.android.socialbase.downloader.i.f.b());
            if (z5) {
                a(this.f10635i);
                if (a5 != null) {
                    a5.c(this.f10629c);
                } else {
                    this.f10635i.a(this.f10629c.getId(), this.f10629c.getCurBytes());
                }
            } else if (a5 != null) {
                a5.c(this.f10629c);
            } else {
                this.f10635i.a(this.f10631e.k(), this.f10641o);
            }
            this.E = this.f10641o;
        }
        if (this.f10651y) {
            this.C += System.nanoTime() - j5;
        }
    }

    public void b() {
        if (this.f10638l) {
            return;
        }
        this.f10638l = true;
        g();
    }

    public void c() {
        if (this.f10639m) {
            return;
        }
        synchronized (this.f10640n) {
            this.f10639m = true;
        }
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0496 A[Catch: all -> 0x04f2, TRY_LEAVE, TryCatch #11 {all -> 0x04f2, blocks: (B:176:0x02f8, B:177:0x02ff, B:208:0x0378, B:210:0x037e, B:212:0x0381, B:244:0x046d, B:245:0x046f, B:133:0x0476, B:135:0x0496, B:169:0x04e6, B:171:0x04ec, B:172:0x04ef, B:173:0x04f1), top: B:8:0x002b, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04ec A[Catch: all -> 0x04f2, TryCatch #11 {all -> 0x04f2, blocks: (B:176:0x02f8, B:177:0x02ff, B:208:0x0378, B:210:0x037e, B:212:0x0381, B:244:0x046d, B:245:0x046f, B:133:0x0476, B:135:0x0496, B:169:0x04e6, B:171:0x04ec, B:172:0x04ef, B:173:0x04f1), top: B:8:0x002b, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f8 A[Catch: all -> 0x04f2, TRY_ENTER, TryCatch #11 {all -> 0x04f2, blocks: (B:176:0x02f8, B:177:0x02ff, B:208:0x0378, B:210:0x037e, B:212:0x0381, B:244:0x046d, B:245:0x046f, B:133:0x0476, B:135:0x0496, B:169:0x04e6, B:171:0x04ec, B:172:0x04ef, B:173:0x04f1), top: B:8:0x002b, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0378 A[Catch: all -> 0x04f2, TRY_ENTER, TryCatch #11 {all -> 0x04f2, blocks: (B:176:0x02f8, B:177:0x02ff, B:208:0x0378, B:210:0x037e, B:212:0x0381, B:244:0x046d, B:245:0x046f, B:133:0x0476, B:135:0x0496, B:169:0x04e6, B:171:0x04ec, B:172:0x04ef, B:173:0x04f1), top: B:8:0x002b, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0400  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.e.d():void");
    }

    public long e() {
        return this.E;
    }

    public long a() {
        return this.f10641o;
    }

    public void a(long j5, long j6, long j7) {
        this.f10641o = j5;
        this.f10642p = j5;
        this.f10643q = j6;
        this.f10644r = j7;
    }

    public void a(long j5, long j6) {
        this.f10643q = j5;
        this.f10644r = j6;
    }

    private com.ss.android.socialbase.downloader.e.b a(InputStream inputStream) {
        int I = c.I();
        if (this.f10646t.a("rw_concurrent", 0) == 1 && this.f10629c.getChunkCount() == 1 && this.f10629c.getTotalBytes() > 20971520) {
            try {
                com.ss.android.socialbase.downloader.e.a aVar = new com.ss.android.socialbase.downloader.e.a(inputStream, I, this.f10646t.a("rw_concurrent_max_buffer_count", 4));
                this.f10652z = true;
                return aVar;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        com.ss.android.socialbase.downloader.e.c cVar = new com.ss.android.socialbase.downloader.e.c(inputStream, I);
        this.f10652z = false;
        return cVar;
    }

    private void a(boolean z4) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j5 = uptimeMillis - this.F;
        if (this.f10648v) {
            if (j5 > (this.f10647u.b() ? this.f10649w : this.f10650x)) {
                h();
                this.F = uptimeMillis;
                return;
            }
            return;
        }
        long j6 = this.f10641o - this.E;
        if (z4 || b(j6, j5)) {
            h();
            this.F = uptimeMillis;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.ss.android.socialbase.downloader.downloader.j r17) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            if (r7 != 0) goto L7
            return
        L7:
            boolean r8 = r7 instanceof com.ss.android.socialbase.downloader.b.e
            if (r8 == 0) goto L16
            boolean r1 = com.ss.android.socialbase.downloader.i.f.b()
            com.ss.android.socialbase.downloader.downloader.m r1 = com.ss.android.socialbase.downloader.impls.l.a(r1)
            if (r1 != 0) goto L17
            return
        L16:
            r1 = 0
        L17:
            r15 = r1
            com.ss.android.socialbase.downloader.model.b r1 = r0.f10631e
            boolean r1 = r1.d()
            if (r1 == 0) goto L27
            com.ss.android.socialbase.downloader.model.b r1 = r0.f10631e
            com.ss.android.socialbase.downloader.model.b r1 = r1.e()
            goto L29
        L27:
            com.ss.android.socialbase.downloader.model.b r1 = r0.f10631e
        L29:
            r5 = r1
            if (r5 == 0) goto Lb4
            long r1 = r0.f10641o
            r5.b(r1)
            if (r8 == 0) goto L49
            if (r15 == 0) goto L49
            int r10 = r5.k()
            int r11 = r5.s()
            int r12 = r5.b()
            long r13 = r0.f10641o
            r9 = r15
            r9.a(r10, r11, r12, r13)
            r11 = r5
            goto L5e
        L49:
            int r2 = r5.k()
            int r3 = r5.s()
            int r4 = r5.b()
            long r9 = r0.f10641o
            r1 = r17
            r11 = r5
            r5 = r9
            r1.a(r2, r3, r4, r5)
        L5e:
            boolean r1 = r11.h()
            if (r1 == 0) goto Le3
            boolean r1 = r11.i()
            if (r1 == 0) goto L91
            long r1 = r11.j()
            long r3 = r0.f10641o
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L91
            if (r8 == 0) goto L84
            if (r15 == 0) goto L84
            int r3 = r11.k()
            int r4 = r11.b()
            r15.a(r3, r4, r1)
            goto L8f
        L84:
            int r3 = r11.k()
            int r4 = r11.b()
            r7.a(r3, r4, r1)
        L8f:
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            if (r1 != 0) goto Le3
            if (r8 == 0) goto La6
            if (r15 == 0) goto La6
            int r1 = r11.k()
            int r2 = r11.b()
            long r3 = r0.f10641o
            r15.a(r1, r2, r3)
            goto Le3
        La6:
            int r1 = r11.k()
            int r2 = r11.b()
            long r3 = r0.f10641o
            r7.a(r1, r2, r3)
            goto Le3
        Lb4:
            com.ss.android.socialbase.downloader.model.b r1 = r0.f10631e
            boolean r1 = r1.d()
            if (r1 == 0) goto Le3
            if (r8 == 0) goto Ld2
            if (r15 == 0) goto Ld2
            com.ss.android.socialbase.downloader.model.b r1 = r0.f10631e
            int r1 = r1.k()
            com.ss.android.socialbase.downloader.model.b r2 = r0.f10631e
            int r2 = r2.s()
            long r3 = r0.f10641o
            r15.a(r1, r2, r3)
            goto Le3
        Ld2:
            com.ss.android.socialbase.downloader.model.b r1 = r0.f10631e
            int r1 = r1.k()
            com.ss.android.socialbase.downloader.model.b r2 = r0.f10631e
            int r2 = r2.s()
            long r3 = r0.f10641o
            r7.a(r1, r2, r3)
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.e.a(com.ss.android.socialbase.downloader.downloader.j):void");
    }
}
