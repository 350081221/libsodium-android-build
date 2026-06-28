package com.ss.android.socialbase.downloader.e;

import android.os.Process;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.f.p;
import com.ss.android.socialbase.downloader.i.f;
import java.io.InputStream;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f10675a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10676b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10677c;

    /* renamed from: f, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.f.a f10680f;

    /* renamed from: g, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.f.a f10681g;

    /* renamed from: h, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.f.a f10682h;

    /* renamed from: i, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.f.a f10683i;

    /* renamed from: j, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.f.a f10684j;

    /* renamed from: k, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.f.a f10685k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f10686l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f10687m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Throwable f10688n;

    /* renamed from: o, reason: collision with root package name */
    private volatile Future f10689o;

    /* renamed from: p, reason: collision with root package name */
    private int f10690p;

    /* renamed from: d, reason: collision with root package name */
    private final Object f10678d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f10679e = new Object();

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f10691q = new Runnable() { // from class: com.ss.android.socialbase.downloader.e.a.1
        @Override // java.lang.Runnable
        public void run() {
            com.ss.android.socialbase.downloader.f.a d5;
            Process.setThreadPriority(10);
            do {
                try {
                    d5 = a.this.d();
                    d5.f10705c = a.this.f10675a.read(d5.f10703a);
                    a.this.c(d5);
                } catch (Throwable th) {
                    try {
                        a.this.f10688n = th;
                        th.printStackTrace();
                        synchronized (a.this.f10679e) {
                            a.this.f10687m = true;
                            a.this.f10679e.notify();
                            f.a(a.this.f10675a);
                            return;
                        }
                    } catch (Throwable th2) {
                        synchronized (a.this.f10679e) {
                            a.this.f10687m = true;
                            a.this.f10679e.notify();
                            f.a(a.this.f10675a);
                            throw th2;
                        }
                    }
                }
            } while (d5.f10705c != -1);
            synchronized (a.this.f10679e) {
                a.this.f10687m = true;
                a.this.f10679e.notify();
            }
            f.a(a.this.f10675a);
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 > 64) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.io.InputStream r2, int r3, int r4) throws java.lang.Throwable {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f10678d = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f10679e = r0
            com.ss.android.socialbase.downloader.e.a$1 r0 = new com.ss.android.socialbase.downloader.e.a$1
            r0.<init>()
            r1.f10691q = r0
            r1.f10675a = r2
            r1.f10676b = r3
            r2 = 1
            if (r4 >= r2) goto L21
        L1f:
            r4 = r2
            goto L26
        L21:
            r2 = 64
            if (r4 <= r2) goto L26
            goto L1f
        L26:
            r1.f10677c = r4
            r1.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.e.a.<init>(java.io.InputStream, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ss.android.socialbase.downloader.f.a d() throws p, InterruptedException {
        int i5;
        com.ss.android.socialbase.downloader.f.a aVar = this.f10682h;
        if (aVar != null) {
            if (!this.f10686l) {
                this.f10682h = aVar.f10706d;
                aVar.f10706d = null;
                return aVar;
            }
            throw new p("");
        }
        synchronized (this.f10678d) {
            if (!this.f10686l) {
                com.ss.android.socialbase.downloader.f.a aVar2 = this.f10680f;
                if (aVar2 == null && (i5 = this.f10690p) < this.f10677c) {
                    this.f10690p = i5 + 1;
                    return new com.ss.android.socialbase.downloader.f.a(this.f10676b);
                }
                while (aVar2 == null) {
                    this.f10678d.wait();
                    if (!this.f10686l) {
                        aVar2 = this.f10680f;
                    } else {
                        throw new p("");
                    }
                }
                this.f10682h = aVar2.f10706d;
                this.f10681g = null;
                this.f10680f = null;
                aVar2.f10706d = null;
                return aVar2;
            }
            throw new p("");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        if (r4.f10687m == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        r4.f10679e.wait();
        r2 = r4.f10683i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        r4.f10685k = r2.f10706d;
        r4.f10684j = null;
        r4.f10683i = null;
        r2.f10706d = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ss.android.socialbase.downloader.f.a e() throws com.ss.android.socialbase.downloader.exception.BaseException, java.lang.InterruptedException {
        /*
            r4 = this;
            com.ss.android.socialbase.downloader.f.a r0 = r4.f10685k
            r1 = 0
            if (r0 == 0) goto Lc
            com.ss.android.socialbase.downloader.f.a r2 = r0.f10706d
            r4.f10685k = r2
            r0.f10706d = r1
            return r0
        Lc:
            java.lang.Object r0 = r4.f10679e
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.f.a r2 = r4.f10683i     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L23
        L13:
            boolean r2 = r4.f10687m     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L1a
            r4.f()     // Catch: java.lang.Throwable -> L2f
        L1a:
            java.lang.Object r2 = r4.f10679e     // Catch: java.lang.Throwable -> L2f
            r2.wait()     // Catch: java.lang.Throwable -> L2f
            com.ss.android.socialbase.downloader.f.a r2 = r4.f10683i     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L13
        L23:
            com.ss.android.socialbase.downloader.f.a r3 = r2.f10706d     // Catch: java.lang.Throwable -> L2f
            r4.f10685k = r3     // Catch: java.lang.Throwable -> L2f
            r4.f10684j = r1     // Catch: java.lang.Throwable -> L2f
            r4.f10683i = r1     // Catch: java.lang.Throwable -> L2f
            r2.f10706d = r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r2
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.e.a.e():com.ss.android.socialbase.downloader.f.a");
    }

    private void f() throws BaseException {
        Throwable th = this.f10688n;
        if (th != null) {
            if (th instanceof p) {
                throw new BaseException(1068, "async reader closed!");
            }
            f.a(th, "async_read");
        }
        throw new BaseException(1069, "async reader terminated!");
    }

    private void c() throws Throwable {
        this.f10689o = com.ss.android.socialbase.downloader.downloader.c.q().submit(this.f10691q);
    }

    @Override // com.ss.android.socialbase.downloader.e.b
    public void b() {
        synchronized (this.f10678d) {
            this.f10686l = true;
            this.f10678d.notify();
        }
        Future future = this.f10689o;
        if (future != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
            }
            this.f10689o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.ss.android.socialbase.downloader.f.a aVar) {
        synchronized (this.f10679e) {
            com.ss.android.socialbase.downloader.f.a aVar2 = this.f10684j;
            if (aVar2 == null) {
                this.f10684j = aVar;
                this.f10683i = aVar;
                this.f10679e.notify();
            } else {
                aVar2.f10706d = aVar;
                this.f10684j = aVar;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.e.b
    public com.ss.android.socialbase.downloader.f.a a() throws BaseException, InterruptedException {
        return e();
    }

    @Override // com.ss.android.socialbase.downloader.e.b
    public void a(com.ss.android.socialbase.downloader.f.a aVar) {
        b(aVar);
    }

    private void b(com.ss.android.socialbase.downloader.f.a aVar) {
        synchronized (this.f10678d) {
            com.ss.android.socialbase.downloader.f.a aVar2 = this.f10681g;
            if (aVar2 == null) {
                this.f10681g = aVar;
                this.f10680f = aVar;
                this.f10678d.notify();
            } else {
                aVar2.f10706d = aVar;
                this.f10681g = aVar;
            }
        }
    }
}
