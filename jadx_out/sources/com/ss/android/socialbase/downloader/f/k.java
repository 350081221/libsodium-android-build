package com.ss.android.socialbase.downloader.f;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.h.e;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.c;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class k implements f, c.a {
    private int A;
    private final boolean B;

    /* renamed from: a, reason: collision with root package name */
    private final DownloadInfo f10748a;

    /* renamed from: b, reason: collision with root package name */
    private final n f10749b;

    /* renamed from: c, reason: collision with root package name */
    private final b f10750c;

    /* renamed from: d, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.h.f f10751d;

    /* renamed from: e, reason: collision with root package name */
    private final g f10752e;

    /* renamed from: j, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.d f10757j;

    /* renamed from: k, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.d f10758k;

    /* renamed from: m, reason: collision with root package name */
    private long f10760m;

    /* renamed from: p, reason: collision with root package name */
    private int f10763p;

    /* renamed from: q, reason: collision with root package name */
    private BaseException f10764q;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f10765r;

    /* renamed from: t, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.i.e f10767t;

    /* renamed from: u, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.h.e f10768u;

    /* renamed from: w, reason: collision with root package name */
    private long f10770w;

    /* renamed from: x, reason: collision with root package name */
    private long f10771x;

    /* renamed from: y, reason: collision with root package name */
    private long f10772y;

    /* renamed from: z, reason: collision with root package name */
    private float f10773z;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f10753f = false;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f10754g = false;

    /* renamed from: h, reason: collision with root package name */
    private final List<m> f10755h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final List<q> f10756i = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f10759l = true;

    /* renamed from: n, reason: collision with root package name */
    private final LinkedList<i> f10761n = new LinkedList<>();

    /* renamed from: o, reason: collision with root package name */
    private final List<i> f10762o = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final Object f10766s = new Object();

    /* renamed from: v, reason: collision with root package name */
    private volatile boolean f10769v = false;
    private final e.b C = new e.b() { // from class: com.ss.android.socialbase.downloader.f.k.1

        /* renamed from: b, reason: collision with root package name */
        private int f10775b;

        @Override // com.ss.android.socialbase.downloader.h.e.b
        public long a() {
            if (k.this.f10753f || k.this.f10754g) {
                return -1L;
            }
            synchronized (k.this) {
                if (k.this.f10757j == null && k.this.f10758k == null) {
                    long j5 = k.this.f10770w;
                    if (j5 <= 0) {
                        return -1L;
                    }
                    this.f10775b++;
                    m a5 = k.this.a(false, System.currentTimeMillis(), j5);
                    if (a5 != null) {
                        Log.i("SegmentDispatcher", "connectWatcher: switchUrl and reconnect");
                        k.this.c(a5);
                        a5.f();
                        return ((this.f10775b / k.this.f10756i.size()) + 1) * j5;
                    }
                    return j5;
                }
                return -1L;
            }
        }
    };
    private final e.b D = new e.b() { // from class: com.ss.android.socialbase.downloader.f.k.2
        @Override // com.ss.android.socialbase.downloader.h.e.b
        public long a() {
            return k.this.r();
        }
    };

    public k(@NonNull DownloadInfo downloadInfo, @NonNull n nVar, com.ss.android.socialbase.downloader.h.f fVar) {
        this.f10748a = downloadInfo;
        this.f10749b = nVar;
        b bVar = new b(nVar.d(), nVar.e());
        this.f10750c = bVar;
        this.f10751d = fVar;
        this.f10752e = new g(downloadInfo, fVar, bVar);
        this.f10768u = new com.ss.android.socialbase.downloader.h.e();
        this.f10767t = new com.ss.android.socialbase.downloader.i.e();
        this.B = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).b("debug") == 1;
    }

    private void h() {
        if (this.f10771x > 0) {
            this.f10772y = System.currentTimeMillis();
            this.f10768u.a(this.D, 0L);
        }
    }

    private void i() {
        List<String> backUpUrls;
        int l5 = this.f10749b.l();
        if (l5 <= 0) {
            this.f10759l = false;
            e();
            return;
        }
        com.ss.android.socialbase.downloader.network.c a5 = com.ss.android.socialbase.downloader.network.c.a();
        a5.a(this.f10748a.getUrl(), this, 2000L);
        if (l5 > 2 && (backUpUrls = this.f10748a.getBackUpUrls()) != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    a5.a(str, this, 2000L);
                }
            }
        }
    }

    private q j() {
        q qVar;
        synchronized (this) {
            int size = this.f10763p % this.f10756i.size();
            if (this.f10749b.b()) {
                this.f10763p++;
            }
            qVar = this.f10756i.get(size);
        }
        return qVar;
    }

    private void k() {
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "onComplete");
        this.f10750c.c();
        synchronized (this.f10766s) {
            this.f10766s.notify();
        }
    }

    private boolean l() {
        Iterator<m> it = this.f10755h.iterator();
        while (it.hasNext()) {
            if (!it.next().g()) {
                return false;
            }
        }
        return true;
    }

    private void m() {
        int size;
        if (this.f10760m <= 0 || (size = this.f10762o.size()) <= 1) {
            return;
        }
        ArrayList<i> arrayList = null;
        int i5 = 0;
        for (int i6 = 1; i6 < size; i6++) {
            i iVar = this.f10762o.get(i5);
            i iVar2 = this.f10762o.get(i6);
            if (iVar.e() > iVar2.c() && iVar2.a() <= 0 && iVar2.f10739a == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                }
                arrayList.add(iVar2);
                if (this.B) {
                    Log.w("SegmentDispatcher", "clearCovered, covered = " + iVar2 + ", prev = " + iVar);
                }
            } else if (iVar2.e() > iVar.e()) {
                i5++;
            }
        }
        if (arrayList != null) {
            for (i iVar3 : arrayList) {
                this.f10762o.remove(iVar3);
                for (m mVar : this.f10755h) {
                    if (mVar.f10780a == iVar3) {
                        if (this.B) {
                            Log.w("SegmentDispatcher", "clearCoveredSegmentLocked: reconnect, segment = " + iVar3 + ", threadIndex = " + mVar.f10782c);
                        }
                        mVar.a(true);
                    }
                }
            }
        }
    }

    private boolean n() {
        long j5 = this.f10760m;
        if (j5 <= 0) {
            this.f10765r = false;
            return false;
        }
        synchronized (this) {
            long a5 = o.a(this.f10762o);
            com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "isAllContentDownloaded: firstOffset = " + a5);
            if (a5 >= j5) {
                this.f10765r = true;
                return true;
            }
            this.f10765r = false;
            return false;
        }
    }

    private long o() {
        Iterator<m> it = this.f10755h.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 += it.next().b();
        }
        return j5;
    }

    private i p() {
        int i5 = 0;
        while (true) {
            i q5 = q();
            if (q5 == null) {
                return null;
            }
            m mVar = q5.f10739a;
            if (mVar == null) {
                return q5;
            }
            if (q5.j() >= 2) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            b(currentTimeMillis);
            if (currentTimeMillis - mVar.f10785f > 2000 && a(mVar, currentTimeMillis - 2000, currentTimeMillis, 500L, 1.0d)) {
                if (this.B) {
                    Log.i("SegmentDispatcher", "obtainSegmentWhenNoNewSegment: isDownloadSpeedPoor segment = " + q5 + ", owner.threadIndex = " + mVar.f10782c);
                }
                return q5;
            }
            int i6 = i5 + 1;
            if (i5 > 2) {
                if (this.B) {
                    Log.i("SegmentDispatcher", "obtainSegmentWhenNoNewSegment: waitCount > 2, return segment = " + q5);
                }
                return q5;
            }
            try {
                synchronized (this) {
                    wait(500L);
                }
                i5 = i6;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    private i q() {
        int j5;
        i iVar = null;
        int i5 = Integer.MAX_VALUE;
        for (i iVar2 : this.f10762o) {
            if (a(iVar2) > 0 && (j5 = iVar2.j()) < i5) {
                iVar = iVar2;
                i5 = j5;
            }
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        if (!this.f10753f && !this.f10754g) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                b(currentTimeMillis);
                long k5 = this.f10749b.k();
                if (k5 > 0) {
                    long j5 = this.f10772y;
                    if (j5 > 0 && currentTimeMillis - j5 > k5 && a(currentTimeMillis, k5)) {
                        this.f10772y = currentTimeMillis;
                        this.A++;
                    }
                }
            }
            return 2000L;
        }
        return -1L;
    }

    private void b(List<i> list) {
        long totalBytes = this.f10748a.getTotalBytes();
        this.f10760m = totalBytes;
        if (totalBytes <= 0) {
            this.f10760m = this.f10748a.getExpectFileLength();
            com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "initSegments: getExpectFileLength = " + this.f10760m);
        }
        synchronized (this) {
            this.f10761n.clear();
            if (list != null && !list.isEmpty()) {
                Iterator<i> it = list.iterator();
                while (it.hasNext()) {
                    a((List<i>) this.f10761n, new i(it.next()), false);
                }
                d(this.f10761n);
                c(this.f10761n);
                com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "initSegments: totalLength = " + this.f10760m);
            }
            a((List<i>) this.f10761n, new i(0L, -1L), false);
            com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "initSegments: totalLength = " + this.f10760m);
        }
    }

    private void c() throws BaseException, InterruptedException {
        BaseException baseException;
        synchronized (this.f10766s) {
            if (this.f10757j == null && this.f10758k == null) {
                this.f10766s.wait();
            }
        }
        if (this.f10757j == null && this.f10758k == null && (baseException = this.f10764q) != null) {
            throw baseException;
        }
    }

    private void d() throws BaseException {
        try {
            this.f10752e.a((d) this.f10750c);
        } catch (p unused) {
        } catch (BaseException e5) {
            com.ss.android.socialbase.downloader.c.a.e("SegmentDispatcher", "dispatchSegments: loopAndWrite e = " + e5);
            a(e5);
            throw e5;
        }
        if (this.f10754g || this.f10753f) {
            return;
        }
        try {
            synchronized (this) {
                while (!this.f10761n.isEmpty()) {
                    i poll = this.f10761n.poll();
                    if (poll != null) {
                        a(this.f10762o, poll, true);
                    }
                }
                c(this.f10762o);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.f10769v && this.f10764q != null) {
            com.ss.android.socialbase.downloader.c.a.e("SegmentDispatcher", "dispatchSegments: loopAndWrite  failedException = " + this.f10764q);
            throw this.f10764q;
        }
        if (this.f10748a.getCurBytes() != this.f10748a.getTotalBytes()) {
            com.ss.android.socialbase.downloader.d.a.a(this.f10748a, this.f10762o);
        }
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "dispatchSegments::download finished");
    }

    private void e() {
        int i5;
        if (this.f10760m <= 0 || this.f10759l) {
            i5 = 1;
        } else {
            i5 = this.f10749b.a();
            int h5 = (int) (this.f10760m / this.f10749b.h());
            if (i5 > h5) {
                i5 = h5;
            }
        }
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "dispatchReadThread: totalLength = " + this.f10760m + ", threadCount = " + i5);
        int i6 = i5 > 0 ? i5 : 1;
        synchronized (this) {
            do {
                if (this.f10755h.size() >= i6) {
                    break;
                }
                if (!this.f10754g && !this.f10753f) {
                    a(j());
                }
                return;
            } while (!this.f10749b.f());
        }
    }

    private void f() {
        this.f10756i.add(new q(this.f10748a.getUrl(), true));
        List<String> backUpUrls = this.f10748a.getBackUpUrls();
        if (backUpUrls != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    this.f10756i.add(new q(str, false));
                }
            }
        }
        this.f10749b.a(this.f10756i.size());
    }

    private void g() {
        n nVar = this.f10749b;
        this.f10770w = nVar.j();
        this.f10771x = nVar.k();
        this.f10773z = nVar.o();
        int i5 = this.A;
        if (i5 > 0) {
            this.f10768u.a(this.C, i5);
        }
    }

    public boolean a(List<i> list) throws BaseException, InterruptedException {
        try {
            f();
            b(list);
            e();
            g();
            i();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                c();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                this.f10748a.increaseAllConnectTime(currentTimeMillis2);
                this.f10748a.setFirstSpeedTime(currentTimeMillis2);
                if (!this.f10754g && !this.f10753f) {
                    this.f10751d.a(this.f10760m);
                    h();
                    d();
                    return true;
                }
                if (!this.f10754g && !this.f10753f) {
                    com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "finally pause");
                    b();
                }
                this.f10768u.b();
                return true;
            } catch (Throwable th) {
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                this.f10748a.increaseAllConnectTime(currentTimeMillis3);
                this.f10748a.setFirstSpeedTime(currentTimeMillis3);
                throw th;
            }
        } finally {
            if (!this.f10754g && !this.f10753f) {
                com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "finally pause");
                b();
            }
            this.f10768u.b();
        }
    }

    private void c(List<i> list) {
        long b5 = o.b(list);
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "checkDownloadBytes: getCurBytes = " + this.f10748a.getCurBytes() + ", totalBytes = " + this.f10748a.getTotalBytes() + ", downloadedBytes = " + b5);
        if (b5 > this.f10748a.getTotalBytes() && this.f10748a.getTotalBytes() > 0) {
            b5 = this.f10748a.getTotalBytes();
        }
        if (this.f10748a.getCurBytes() == this.f10748a.getTotalBytes() || this.f10748a.getCurBytes() == b5) {
            return;
        }
        this.f10748a.setCurBytes(b5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if ((r10.e() - r24.e()) < (r13 / 2)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f2, code lost:
    
        r3 = r3 + 1;
        r6 = r22.f10762o.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01fa, code lost:
    
        if (r3 >= r6) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01fc, code lost:
    
        r7 = r22.f10762o.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x020c, code lost:
    
        if (r7.a() > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0210, code lost:
    
        if (r7.f10739a == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0213, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0216, code lost:
    
        r11 = r24.f();
        r20 = r7.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0220, code lost:
    
        if (r11 <= 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0224, code lost:
    
        if (r11 < r20) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0247, code lost:
    
        android.util.Log.d("SegmentDispatcher", "applySegmentLocked: break 2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024c, code lost:
    
        r6 = r24.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0254, code lost:
    
        if (r6 <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0258, code lost:
    
        if (r18 > r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0260, code lost:
    
        if (r24.e() > r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0278, code lost:
    
        throw new com.ss.android.socialbase.downloader.f.j(6, "applySegment: " + r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0279, code lost:
    
        r24.f10739a = r23;
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "applySegment: OK " + r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x028f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0226, code lost:
    
        r8 = r20 - 1;
        r24.c(r8);
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "applySegment: segment set end:" + r8 + ", later = " + r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(com.ss.android.socialbase.downloader.f.m r23, com.ss.android.socialbase.downloader.f.i r24) throws com.ss.android.socialbase.downloader.f.j {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.f.k.e(com.ss.android.socialbase.downloader.f.m, com.ss.android.socialbase.downloader.f.i):void");
    }

    private void b(String str, List<q> list) {
        int a5;
        if (this.B) {
            Iterator<q> it = list.iterator();
            while (it.hasNext()) {
                Log.i("SegmentDispatcher", "addIpListLocked: urlRecord = " + it.next());
            }
        }
        int l5 = this.f10749b.l();
        if ((l5 == 1 || l5 == 3) && (a5 = a(str)) >= 0 && a5 < this.f10756i.size()) {
            this.f10756i.addAll(a5 + 1, list);
        } else {
            this.f10756i.addAll(list);
        }
    }

    private List<q> c(String str, List<InetAddress> list) {
        boolean z4;
        if (list != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i5 = 0;
            for (InetAddress inetAddress : list) {
                if (inetAddress != null) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (!TextUtils.isEmpty(hostAddress)) {
                        if (this.B) {
                            Log.i("SegmentDispatcher", "onDnsResolved: ip = " + hostAddress);
                        }
                        q qVar = new q(str, hostAddress);
                        LinkedList linkedList = (LinkedList) linkedHashMap.get(qVar.f10810c);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            linkedHashMap.put(qVar.f10810c, linkedList);
                        }
                        linkedList.add(qVar);
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                ArrayList arrayList = new ArrayList();
                do {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    z4 = false;
                    while (it.hasNext()) {
                        LinkedList linkedList2 = (LinkedList) ((Map.Entry) it.next()).getValue();
                        if (linkedList2 != null && !linkedList2.isEmpty()) {
                            arrayList.add((q) linkedList2.pollFirst());
                            i5--;
                            z4 = true;
                        }
                    }
                    if (i5 <= 0) {
                        break;
                    }
                } while (z4);
                return arrayList;
            }
        }
        return null;
    }

    private void d(List<i> list) {
        i iVar = list.get(0);
        long c5 = iVar.c();
        if (c5 > 0) {
            i iVar2 = new i(0L, c5 - 1);
            Log.w("SegmentDispatcher", "fixSegmentsLocked: first = " + iVar + ", add new first = " + iVar2);
            a(list, iVar2, true);
        }
        Iterator<i> it = list.iterator();
        if (it.hasNext()) {
            i next = it.next();
            while (it.hasNext()) {
                i next2 = it.next();
                if (next.f() < next2.c() - 1) {
                    com.ss.android.socialbase.downloader.c.a.d("SegmentDispatcher", "fixSegment: segment = " + next + ", new end = " + (next2.c() - 1));
                    next.c(next2.c() - 1);
                }
                next = next2;
            }
        }
        i iVar3 = list.get(list.size() - 1);
        long totalBytes = this.f10748a.getTotalBytes();
        if (totalBytes <= 0 || (iVar3.f() != -1 && iVar3.f() < totalBytes - 1)) {
            com.ss.android.socialbase.downloader.c.a.d("SegmentDispatcher", "fixSegment: last segment = " + iVar3 + ", new end=-1");
            iVar3.c(-1L);
        }
    }

    private i b(m mVar, q qVar) {
        while (!this.f10761n.isEmpty()) {
            i poll = this.f10761n.poll();
            if (poll != null) {
                a(this.f10762o, poll, true);
                if (a(poll) > 0 || this.f10760m <= 0) {
                    return poll;
                }
            }
        }
        m();
        i c5 = c(mVar, qVar);
        if (c5 != null && a(c5) > 0) {
            a(this.f10762o, c5, true);
            return c5;
        }
        i p5 = p();
        if (p5 != null) {
            return p5;
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public void b(m mVar, i iVar) throws BaseException {
        synchronized (this) {
            e(mVar, iVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.c.a
    public void a(String str, List<InetAddress> list) {
        List<q> list2;
        if (this.f10754g || this.f10753f) {
            return;
        }
        try {
            list2 = c(str, list);
        } catch (Throwable th) {
            th.printStackTrace();
            list2 = null;
        }
        synchronized (this) {
            if (list2 != null) {
                b(str, list2);
            }
            this.f10759l = false;
            this.f10749b.a(this.f10756i.size());
            Log.i("SegmentDispatcher", "onDnsResolved: dispatchReadThread");
            e();
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public void b(m mVar) {
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "onReaderExit: threadIndex = " + mVar.f10782c);
        synchronized (this) {
            mVar.c(true);
            this.f10755h.remove(mVar);
            m();
            if (this.f10755h.isEmpty()) {
                k();
            } else if (n()) {
                Log.i("SegmentDispatcher", "onReaderExit: allContentDownloaded");
                Iterator<m> it = this.f10755h.iterator();
                while (it.hasNext()) {
                    it.next().e();
                }
                k();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public void c(m mVar, i iVar) {
        synchronized (this) {
            if (iVar.f10739a == mVar) {
                com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "unApplySegment " + iVar);
                iVar.d(mVar.d());
                iVar.f10739a = null;
                mVar.a();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public e d(m mVar, i iVar) throws BaseException {
        e a5;
        synchronized (this) {
            l lVar = new l(this.f10748a, this.f10750c, iVar);
            this.f10752e.a(lVar);
            a5 = lVar.a();
        }
        return a5;
    }

    private int a(String str) {
        int size = this.f10756i.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (TextUtils.equals(this.f10756i.get(i5).f10808a, str)) {
                return i5;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(m mVar) {
        synchronized (this) {
            q d5 = d(mVar);
            if (d5 == null) {
                return false;
            }
            return mVar.a(d5);
        }
    }

    private q d(m mVar) {
        q qVar;
        Iterator<q> it = this.f10756i.iterator();
        q qVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                qVar = null;
                break;
            }
            qVar = it.next();
            if (qVar != mVar.f10781b && !qVar.d()) {
                if (qVar2 == null) {
                    qVar2 = qVar;
                }
                if (qVar.a() <= 0) {
                    break;
                }
            }
        }
        if (this.f10749b.b()) {
            if (qVar != null) {
                return qVar;
            }
            if (this.f10749b.c()) {
                return null;
            }
        }
        return qVar2;
    }

    private void a(List<i> list, i iVar, boolean z4) {
        long c5 = iVar.c();
        int size = list.size();
        int i5 = 0;
        while (i5 < size && c5 >= list.get(i5).c()) {
            i5++;
        }
        list.add(i5, iVar);
        if (z4) {
            iVar.a(size);
        }
    }

    private void b(m mVar, i iVar, q qVar, com.ss.android.socialbase.downloader.model.d dVar) throws BaseException, com.ss.android.socialbase.downloader.exception.i {
        m mVar2 = iVar.f10739a;
        if (mVar2 != null && mVar2 != mVar) {
            throw new j(1, "segment already has an owner");
        }
        if (mVar.h() == iVar.e()) {
            if (!dVar.b()) {
                if (iVar.e() <= 0) {
                    com.ss.android.socialbase.downloader.c.a.e("SegmentDispatcher", "parseHttpResponse: segment.getCurrentOffsetRead = " + iVar.e());
                    if (!dVar.a()) {
                        throw new com.ss.android.socialbase.downloader.exception.b(1004, dVar.f11131c, "2: response code error : " + dVar.f11131c + " segment=" + iVar);
                    }
                } else {
                    throw new com.ss.android.socialbase.downloader.exception.b(1004, dVar.f11131c, "1: response code error : " + dVar.f11131c + " segment=" + iVar);
                }
            }
            if (qVar.f10811d) {
                if (this.f10757j == null) {
                    this.f10757j = dVar;
                    synchronized (this.f10766s) {
                        this.f10766s.notify();
                    }
                    com.ss.android.socialbase.downloader.h.f fVar = this.f10751d;
                    if (fVar != null) {
                        fVar.a(qVar.f10808a, dVar.f11130b, iVar.e());
                    }
                    long j5 = dVar.j();
                    if (j5 > 0) {
                        for (i iVar2 : this.f10762o) {
                            if (iVar2.f() <= 0 || iVar2.f() > j5 - 1) {
                                iVar2.c(j5 - 1);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            a(dVar);
            if (this.f10758k == null) {
                this.f10758k = dVar;
                if (this.f10748a.getTotalBytes() <= 0) {
                    long j6 = dVar.j();
                    com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "checkSegmentHttpResponse:len=" + j6 + ",url=" + qVar.f10808a);
                    this.f10748a.setTotalBytes(j6);
                }
                synchronized (this.f10766s) {
                    this.f10766s.notify();
                }
                return;
            }
            return;
        }
        throw new j(5, "applySegment");
    }

    private i c(m mVar, q qVar) {
        String str;
        int size = this.f10762o.size();
        long j5 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            long a5 = a(i6, size);
            if (a5 > j5) {
                i5 = i6;
                j5 = a5;
            }
        }
        long g5 = this.f10749b.g();
        long i7 = this.f10749b.i();
        if (i5 < 0 || j5 <= g5) {
            return null;
        }
        i iVar = this.f10762o.get(i5);
        int n5 = this.f10762o.size() < this.f10755h.size() ? 2 : this.f10749b.n();
        if (n5 == 1) {
            m mVar2 = iVar.f10739a;
            if (mVar2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j6 = currentTimeMillis - 4000;
                long a6 = mVar2.a(j6, currentTimeMillis);
                long a7 = mVar.a(j6, currentTimeMillis);
                float f5 = (a6 <= 0 || a7 <= 0) ? -1.0f : ((float) a7) / ((float) (a6 + a7));
                if (f5 == -1.0f) {
                    long b5 = mVar2.b();
                    long b6 = mVar.b();
                    if (b5 > 0 && b6 > 0) {
                        f5 = ((float) b6) / ((float) (b5 + b6));
                    }
                }
                if (f5 > 0.0f) {
                    float f6 = f5 * 0.9f;
                    long j7 = ((float) j5) * f6;
                    if (j7 < g5) {
                        j7 = g5;
                    }
                    if (i7 <= 0 || j7 <= i7) {
                        i7 = j7;
                    }
                    long j8 = g5 / 2;
                    long j9 = j5 - j8;
                    if (i7 > j9) {
                        i7 = j9;
                    } else if (i7 < j8) {
                        i7 = j8;
                    }
                    i iVar2 = new i(iVar.e() + (j5 - i7), iVar.f());
                    com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "obtainSegment: parent = " + iVar + ", child = " + iVar2 + ", maxRemainBytes = " + j5 + ", childLength = " + i7 + ", ratio = " + f6 + ", threadIndex = " + mVar.f10782c);
                    return iVar2;
                }
            }
            str = "SegmentDispatcher";
        } else {
            if (n5 == 2) {
                long curBytes = this.f10760m - this.f10748a.getCurBytes();
                float d5 = d(mVar, qVar);
                long j10 = ((float) curBytes) * d5;
                if (j10 < g5) {
                    j10 = g5;
                }
                if (i7 <= 0 || j10 <= i7) {
                    i7 = j10;
                }
                long j11 = g5 / 2;
                long j12 = j5 - j11;
                if (i7 > j12) {
                    i7 = j12;
                } else if (i7 < j11) {
                    i7 = j11;
                }
                i iVar3 = new i(iVar.e() + (j5 - i7), iVar.f());
                com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "obtainSegment: parent = " + iVar + ", child = " + iVar3 + ", maxRemainBytes = " + j5 + ", childLength = " + i7 + ", ratio = " + d5 + ", threadIndex = " + mVar.f10782c);
                return iVar3;
            }
            str = "SegmentDispatcher";
        }
        i iVar4 = new i(iVar.e() + (j5 / 2), iVar.f());
        com.ss.android.socialbase.downloader.c.a.c(str, "obtainSegment: parent = " + iVar + ",child = " + iVar4);
        return iVar4;
    }

    private float d(m mVar, q qVar) {
        long b5 = mVar.b();
        int size = this.f10755h.size();
        if (size <= 1) {
            size = this.f10749b.a();
        }
        float f5 = 1.0f;
        if (b5 <= 0) {
            float m5 = this.f10749b.m();
            if (m5 <= 0.0f || m5 >= 1.0f) {
                m5 = 1.0f / size;
            }
            if (mVar.f10782c == 0) {
                return m5;
            }
            if (size > 1) {
                f5 = 1.0f - m5;
                size--;
            }
        } else {
            long o5 = o();
            if (o5 > b5) {
                return ((float) b5) / ((float) o5);
            }
        }
        return f5 / size;
    }

    private void a(q qVar) {
        m mVar = new m(this.f10748a, this, this.f10750c, qVar, this.f10755h.size());
        this.f10755h.add(mVar);
        mVar.a(com.ss.android.socialbase.downloader.downloader.c.q().submit(mVar));
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public void a(m mVar) {
        if (this.B) {
            com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "onReaderRun, threadIndex = " + mVar.f10782c);
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public i a(m mVar, q qVar) {
        if (this.f10753f || this.f10754g) {
            return null;
        }
        synchronized (this) {
            i b5 = b(mVar, qVar);
            if (b5 != null) {
                b5.h();
                if (b5.j() > 1) {
                    return new i(b5);
                }
            }
            return b5;
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public void a(m mVar, i iVar) {
        synchronized (this) {
            iVar.i();
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public void a(m mVar, i iVar, q qVar, com.ss.android.socialbase.downloader.model.d dVar) throws BaseException, com.ss.android.socialbase.downloader.exception.i {
        synchronized (this) {
            if (!this.f10753f && !this.f10754g) {
                b(mVar, iVar, qVar, dVar);
                mVar.b(false);
                if (this.f10760m <= 0) {
                    long totalBytes = this.f10748a.getTotalBytes();
                    this.f10760m = totalBytes;
                    if (totalBytes <= 0) {
                        this.f10760m = dVar.j();
                    }
                    e();
                } else if (this.f10749b.f()) {
                    e();
                }
            } else {
                throw new p("connected");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public void a(m mVar, q qVar, i iVar, BaseException baseException, int i5, int i6) {
        boolean b5 = com.ss.android.socialbase.downloader.i.f.b(baseException);
        int errorCode = baseException.getErrorCode();
        if (errorCode == 1047 || errorCode == 1074 || errorCode == 1055) {
            b5 = true;
        }
        if (b5 || i5 >= i6) {
            c(mVar);
        }
    }

    public void b() {
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "pause1");
        this.f10754g = true;
        synchronized (this) {
            Iterator<m> it = this.f10755h.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }
        this.f10752e.b();
        this.f10750c.c();
    }

    @Override // com.ss.android.socialbase.downloader.f.f
    public void a(m mVar, q qVar, i iVar, BaseException baseException) {
        synchronized (this) {
            com.ss.android.socialbase.downloader.c.a.e("SegmentDispatcher", "onSegmentFailed: segment = " + iVar + ", e = " + baseException);
            mVar.b(true);
            if (mVar.f10782c == 0) {
                this.f10764q = baseException;
            }
            if (l()) {
                if (this.f10764q == null) {
                    this.f10764q = baseException;
                }
                this.f10769v = true;
                a(this.f10764q);
            }
        }
    }

    private void b(long j5) {
        this.f10767t.a(this.f10748a.getCurBytes(), j5);
        Iterator<m> it = this.f10755h.iterator();
        while (it.hasNext()) {
            it.next().b(j5);
        }
    }

    private void a(BaseException baseException) {
        com.ss.android.socialbase.downloader.c.a.e("SegmentDispatcher", "onError, e = " + baseException);
        this.f10764q = baseException;
        this.f10750c.c();
        synchronized (this) {
            Iterator<m> it = this.f10755h.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }
    }

    private void a(com.ss.android.socialbase.downloader.model.d dVar) throws BaseException {
        com.ss.android.socialbase.downloader.model.d dVar2 = this.f10757j;
        if (dVar2 == null && (dVar2 = this.f10758k) == null) {
            return;
        }
        long j5 = dVar.j();
        long j6 = dVar2.j();
        if (j5 != j6) {
            String str = "total len not equals,len=" + j5 + ",sLen=" + j6 + ",code=" + dVar.f11131c + ",sCode=" + dVar2.f11131c + ",range=" + dVar.e() + ",sRange = " + dVar2.e() + ",url = " + dVar.f11129a + ",sUrl=" + dVar2.f11129a;
            com.ss.android.socialbase.downloader.c.a.e("SegmentDispatcher", str);
            if (j5 > 0 && j6 > 0) {
                throw new BaseException(1074, str);
            }
        }
        String c5 = dVar.c();
        String c6 = dVar2.c();
        if (TextUtils.equals(c5, c6)) {
            return;
        }
        String str2 = "etag not equals with main url, etag = " + c5 + ", mainEtag = " + c6;
        com.ss.android.socialbase.downloader.c.a.e("SegmentDispatcher", str2);
        if (!TextUtils.isEmpty(c5) && !TextUtils.isEmpty(c6) && !c5.equalsIgnoreCase(c6)) {
            throw new BaseException(1074, str2);
        }
    }

    public void a() {
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "cancel");
        this.f10753f = true;
        synchronized (this) {
            Iterator<m> it = this.f10755h.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }
        this.f10752e.a();
        this.f10750c.c();
    }

    private int a(long j5) {
        int size = this.f10762o.size();
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = this.f10762o.get(i5);
            if (iVar.c() == j5) {
                return i5;
            }
            if (iVar.c() > j5) {
                return -1;
            }
        }
        return -1;
    }

    private long a(int i5, int i6) {
        i iVar = this.f10762o.get(i5);
        long a5 = a(iVar);
        int i7 = i5 + 1;
        i iVar2 = i7 < i6 ? this.f10762o.get(i7) : null;
        if (iVar2 == null) {
            return a5;
        }
        long c5 = iVar2.c() - iVar.e();
        return a5 == -1 ? c5 : Math.min(a5, c5);
    }

    private long a(i iVar) {
        long b5 = iVar.b();
        if (b5 != -1) {
            return b5;
        }
        long j5 = this.f10760m;
        return j5 > 0 ? j5 - iVar.e() : b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m a(boolean z4, long j5, long j6) {
        m mVar = null;
        for (m mVar2 : this.f10755h) {
            if (mVar2.f10782c != 0 || z4) {
                if (mVar2.f10783d > 0 && mVar2.f10784e <= 0 && j5 - mVar2.f10783d > j6 && (mVar == null || mVar2.f10783d < mVar.f10783d)) {
                    mVar = mVar2;
                }
            }
        }
        return mVar;
    }

    private boolean a(m mVar, long j5, long j6, long j7, double d5) {
        if (mVar.f10785f <= 0) {
            return false;
        }
        long b5 = this.f10767t.b(j5, j6);
        int size = this.f10755h.size();
        long j8 = size > 0 ? b5 / size : b5;
        long a5 = mVar.a(j5, j6);
        if (a5 >= j7 && a5 >= j8 * d5) {
            return false;
        }
        Log.i("SegmentDispatcher", "isDownloadSpeedPoor: totalSpeed = " + b5 + ", threadAvgSpeed = " + j8 + ", poorSpeed = " + j7 + ", speed = " + a5 + ",threadIndex = " + mVar.f10782c);
        return true;
    }

    private boolean a(long j5, long j6) {
        long j7 = j5 - j6;
        long b5 = this.f10767t.b(j7, j5);
        int size = this.f10755h.size();
        if (size > 0) {
            b5 /= size;
        }
        m a5 = a(j7, j5, Math.max(10.0f, ((float) b5) * this.f10773z), size / 2);
        if (a5 != null) {
            c(a5);
            com.ss.android.socialbase.downloader.c.a.d("SegmentDispatcher", "handlePoorReadThread: reconnect for poor speed, threadIndex = " + a5.f10782c);
            a5.f();
            return true;
        }
        m a6 = a(true, j5, j6);
        if (a6 == null) {
            return false;
        }
        c(a6);
        com.ss.android.socialbase.downloader.c.a.d("SegmentDispatcher", "handlePoorReadThread: reconnect for connect timeout, threadIndex = " + a6.f10782c);
        a6.f();
        return true;
    }

    private m a(long j5, long j6, long j7, int i5) {
        int i6;
        long j8 = Long.MAX_VALUE;
        int i7 = 0;
        m mVar = null;
        for (m mVar2 : this.f10755h) {
            if (mVar2.f10785f > 0) {
                int i8 = i7 + 1;
                if (mVar2.f10785f < j5) {
                    i6 = i8;
                    long a5 = mVar2.a(j5, j6);
                    if (this.B) {
                        Log.i("SegmentDispatcher", "findPoorReadThread: speed = " + a5 + ", threadIndex = " + mVar2.f10782c);
                    }
                    if (a5 >= 0 && a5 < j8) {
                        j8 = a5;
                        mVar = mVar2;
                    }
                } else {
                    i6 = i8;
                }
                i7 = i6;
            }
        }
        if (mVar == null || i7 < i5 || j8 >= j7) {
            return null;
        }
        com.ss.android.socialbase.downloader.c.a.c("SegmentDispatcher", "findPoorReadThread: ----------- minSpeed = " + j8 + ", threadIndex = " + mVar.f10782c);
        return mVar;
    }
}
