package com.ss.android.socialbase.downloader.f;

import android.support.v4.media.session.PlaybackStateCompat;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private final DownloadInfo f10720c;

    /* renamed from: e, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.g.a f10722e;

    /* renamed from: f, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.h.f f10723f;

    /* renamed from: g, reason: collision with root package name */
    private final c f10724g;

    /* renamed from: h, reason: collision with root package name */
    private BaseException f10725h;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f10730m;

    /* renamed from: n, reason: collision with root package name */
    private final long f10731n;

    /* renamed from: o, reason: collision with root package name */
    private final long f10732o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f10733p;

    /* renamed from: q, reason: collision with root package name */
    private long f10734q;

    /* renamed from: a, reason: collision with root package name */
    private final List<l> f10718a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final List<l> f10719b = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f10726i = false;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f10727j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f10728k = false;

    /* renamed from: r, reason: collision with root package name */
    private volatile long f10735r = 0;

    /* renamed from: s, reason: collision with root package name */
    private volatile long f10736s = 0;

    /* renamed from: d, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.j f10721d = com.ss.android.socialbase.downloader.downloader.c.y();

    /* renamed from: l, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.a.a f10729l = com.ss.android.socialbase.downloader.a.a.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(DownloadInfo downloadInfo, com.ss.android.socialbase.downloader.h.f fVar, c cVar) {
        boolean z4;
        this.f10720c = downloadInfo;
        this.f10723f = fVar;
        this.f10724g = cVar;
        com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId());
        this.f10722e = a5;
        if (a5.a("sync_strategy", 0) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f10730m = z4;
        if (z4) {
            long a6 = a5.a("sync_interval_ms_fg", com.alipay.sdk.app.b.f3003h);
            long a7 = a5.a("sync_interval_ms_bg", 1000);
            this.f10731n = Math.max(a6, 500L);
            this.f10732o = Math.max(a7, 500L);
        } else {
            this.f10731n = 0L;
            this.f10732o = 0L;
        }
        this.f10733p = a5.b("monitor_rw") == 1;
    }

    private boolean a(long j5, long j6) {
        return j5 > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH && j6 > 500;
    }

    private void b(List<l> list) throws IOException {
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private void c() throws IOException {
        boolean z4;
        boolean z5 = this.f10733p;
        long nanoTime = z5 ? System.nanoTime() : 0L;
        DownloadInfo downloadInfo = this.f10720c;
        com.ss.android.socialbase.downloader.downloader.j jVar = this.f10721d;
        List<l> list = this.f10718a;
        List<l> list2 = this.f10719b;
        Map<Long, i> l5 = jVar.l(downloadInfo.getId());
        if (l5 == null) {
            l5 = new HashMap<>(4);
        }
        synchronized (this) {
            a(list);
            try {
                b(list);
                z4 = true;
            } catch (Throwable th) {
                th.printStackTrace();
                z4 = false;
            }
            a(list, l5);
            if (list2.size() > 0) {
                c(list2);
                list.removeAll(list2);
                list2.clear();
            }
        }
        if (z4) {
            downloadInfo.updateRealDownloadTime(true);
            jVar.a(downloadInfo.getId(), l5);
            jVar.a(downloadInfo);
            this.f10735r = downloadInfo.getCurBytes();
        }
        if (z5) {
            this.f10734q += System.nanoTime() - nanoTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(l lVar) {
        synchronized (this) {
            this.f10718a.add(lVar);
        }
    }

    public void b() {
        this.f10727j = true;
        this.f10726i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02a6, code lost:
    
        r3.b(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x00bc, code lost:
    
        if (r13 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00bf, code lost:
    
        r3.b(r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ba A[Catch: all -> 0x03d6, TryCatch #24 {all -> 0x03d6, blocks: (B:124:0x01f5, B:126:0x01f9, B:129:0x01ff, B:131:0x0205, B:132:0x0208, B:134:0x021e, B:178:0x02a0, B:179:0x02a2, B:68:0x0326, B:70:0x0330, B:72:0x0334, B:115:0x03b4, B:117:0x03ba, B:118:0x03bd, B:119:0x03d5), top: B:6:0x0027, inners: #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f9 A[Catch: all -> 0x03d6, TryCatch #24 {all -> 0x03d6, blocks: (B:124:0x01f5, B:126:0x01f9, B:129:0x01ff, B:131:0x0205, B:132:0x0208, B:134:0x021e, B:178:0x02a0, B:179:0x02a2, B:68:0x0326, B:70:0x0330, B:72:0x0334, B:115:0x03b4, B:117:0x03ba, B:118:0x03bd, B:119:0x03d5), top: B:6:0x0027, inners: #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0205 A[Catch: all -> 0x03d6, TryCatch #24 {all -> 0x03d6, blocks: (B:124:0x01f5, B:126:0x01f9, B:129:0x01ff, B:131:0x0205, B:132:0x0208, B:134:0x021e, B:178:0x02a0, B:179:0x02a2, B:68:0x0326, B:70:0x0330, B:72:0x0334, B:115:0x03b4, B:117:0x03ba, B:118:0x03bd, B:119:0x03d5), top: B:6:0x0027, inners: #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0411 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0330 A[Catch: all -> 0x03d6, TryCatch #24 {all -> 0x03d6, blocks: (B:124:0x01f5, B:126:0x01f9, B:129:0x01ff, B:131:0x0205, B:132:0x0208, B:134:0x021e, B:178:0x02a0, B:179:0x02a2, B:68:0x0326, B:70:0x0330, B:72:0x0334, B:115:0x03b4, B:117:0x03ba, B:118:0x03bd, B:119:0x03d5), top: B:6:0x0027, inners: #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0361 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.ss.android.socialbase.downloader.f.d r31) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.f.g.a(com.ss.android.socialbase.downloader.f.d):void");
    }

    private void c(List<l> list) {
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    private void a(long j5, boolean z4) throws IOException {
        long j6 = j5 - this.f10736s;
        if (this.f10730m) {
            if (j6 > (this.f10729l.b() ? this.f10731n : this.f10732o)) {
                c();
                this.f10736s = j5;
                return;
            }
            return;
        }
        long curBytes = this.f10720c.getCurBytes() - this.f10735r;
        if (z4 || a(curBytes, j6)) {
            c();
            this.f10736s = j5;
        }
    }

    private void a(e eVar) {
        synchronized (this) {
            this.f10719b.add((l) eVar);
        }
    }

    private void a(List<l> list) throws IOException {
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void a(List<l> list, Map<Long, i> map) {
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            i e5 = it.next().e();
            i iVar = map.get(Long.valueOf(e5.c()));
            if (iVar == null) {
                map.put(Long.valueOf(e5.c()), new i(e5));
            } else {
                iVar.a(e5.d());
                iVar.c(e5.f());
            }
        }
    }

    public void a() {
        this.f10728k = true;
        this.f10726i = true;
    }
}
