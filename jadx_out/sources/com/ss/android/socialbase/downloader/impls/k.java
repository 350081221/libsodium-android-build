package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class k implements com.ss.android.socialbase.downloader.downloader.j {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<DownloadInfo> f11024a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<List<com.ss.android.socialbase.downloader.model.b>> f11025b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<Map<Long, com.ss.android.socialbase.downloader.f.i>> f11026c = new SparseArray<>();

    public SparseArray<DownloadInfo> a() {
        return this.f11024a;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, int i6, int i7, int i8) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized DownloadInfo b(int i5) {
        DownloadInfo downloadInfo;
        try {
            downloadInfo = this.f11024a.get(i5);
        } catch (Exception e5) {
            e5.printStackTrace();
            downloadInfo = null;
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(com.ss.android.socialbase.downloader.model.b bVar) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized List<DownloadInfo> c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f11024a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.f11024a.size(); i5++) {
            DownloadInfo downloadInfo = this.f11024a.get(this.f11024a.keyAt(i5));
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized List<DownloadInfo> d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f11024a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.f11024a.size(); i5++) {
            DownloadInfo downloadInfo = this.f11024a.get(this.f11024a.keyAt(i5));
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && DownloadStatus.isUnCompletedStatus(downloadInfo.getStatus())) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean d() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean e() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized boolean e(int i5) {
        this.f11024a.remove(i5);
        return true;
    }

    public SparseArray<List<com.ss.android.socialbase.downloader.model.b>> f() {
        return this.f11025b;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo g(int i5) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setStatus(2);
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo h(int i5) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setStatus(5);
            b5.setFirstDownload(false);
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo i(int i5) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setStatus(1);
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo j(int i5) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setStatus(-7);
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized Map<Long, com.ss.android.socialbase.downloader.f.i> l(int i5) {
        return this.f11026c.get(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized void m(int i5) {
        this.f11026c.remove(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized List<com.ss.android.socialbase.downloader.f.i> n(int i5) {
        Map<Long, com.ss.android.socialbase.downloader.f.i> map = this.f11026c.get(i5);
        if (map != null && !map.isEmpty()) {
            return new ArrayList(map.values());
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized List<DownloadInfo> a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            int size = this.f11024a.size();
            for (int i5 = 0; i5 < size; i5++) {
                DownloadInfo valueAt = this.f11024a.valueAt(i5);
                if (str != null && str.equals(valueAt.getUrl())) {
                    arrayList.add(valueAt);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean f(int i5) {
        e(i5);
        d(i5);
        m(i5);
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized List<DownloadInfo> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f11024a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.f11024a.size(); i5++) {
            DownloadInfo downloadInfo = this.f11024a.get(this.f11024a.keyAt(i5));
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && DownloadStatus.isFailedStatus(downloadInfo.getStatus())) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(com.ss.android.socialbase.downloader.model.b bVar) {
        int k5 = bVar.k();
        List<com.ss.android.socialbase.downloader.model.b> list = this.f11025b.get(k5);
        if (list == null) {
            list = new ArrayList<>();
            this.f11025b.put(k5, list);
        }
        list.add(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        r0.b(r5);
     */
    @Override // com.ss.android.socialbase.downloader.downloader.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(int r3, int r4, long r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List r3 = r2.c(r3)     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L9
            monitor-exit(r2)
            return
        L9:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L26
        Ld:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L26
            com.ss.android.socialbase.downloader.model.b r0 = (com.ss.android.socialbase.downloader.model.b) r0     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto Ld
            int r1 = r0.s()     // Catch: java.lang.Throwable -> L26
            if (r1 != r4) goto Ld
            r0.b(r5)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r2)
            return
        L26:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.k.a(int, int, long):void");
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized List<com.ss.android.socialbase.downloader.model.b> c(int i5) {
        return this.f11025b.get(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized void d(int i5) {
        this.f11025b.remove(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized void c() {
        this.f11024a.clear();
        this.f11025b.clear();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo d(int i5, long j5) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setCurBytes(j5, false);
            b5.setStatus(-2);
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized List<DownloadInfo> b() {
        if (this.f11024a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f11024a.size());
        for (int i5 = 0; i5 < this.f11024a.size(); i5++) {
            DownloadInfo valueAt = this.f11024a.valueAt(i5);
            if (valueAt != null) {
                arrayList.add(valueAt);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo c(int i5, long j5) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setCurBytes(j5, false);
            b5.setStatus(-3);
            b5.setFirstDownload(false);
            b5.setFirstSuccess(false);
        }
        return b5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r0.g() != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        r3 = r0.g().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r3.hasNext() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r5 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        if (r5.s() != r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        r5.b(r6);
     */
    @Override // com.ss.android.socialbase.downloader.downloader.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(int r3, int r4, int r5, long r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List r3 = r2.c(r3)     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L9
            monitor-exit(r2)
            return
        L9:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4f
        Ld:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L4f
            com.ss.android.socialbase.downloader.model.b r0 = (com.ss.android.socialbase.downloader.model.b) r0     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto Ld
            int r1 = r0.s()     // Catch: java.lang.Throwable -> L4f
            if (r1 != r5) goto Ld
            boolean r1 = r0.f()     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto Ld
            java.util.List r3 = r0.g()     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L2e
            goto L4d
        L2e:
            java.util.List r3 = r0.g()     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4f
        L36:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L4f
            com.ss.android.socialbase.downloader.model.b r5 = (com.ss.android.socialbase.downloader.model.b) r5     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L36
            int r0 = r5.s()     // Catch: java.lang.Throwable -> L4f
            if (r0 != r4) goto L36
            r5.b(r6)     // Catch: java.lang.Throwable -> L4f
        L4d:
            monitor-exit(r2)
            return
        L4f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.k.a(int, int, int, long):void");
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo b(int i5, long j5) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setCurBytes(j5, false);
            b5.setStatus(-1);
            b5.setFirstDownload(false);
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(DownloadInfo downloadInfo) {
        a(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized DownloadInfo a(int i5, int i6) {
        DownloadInfo b5;
        b5 = b(i5);
        if (b5 != null) {
            b5.setChunkCount(i6);
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized boolean a(DownloadInfo downloadInfo) {
        boolean z4 = true;
        if (downloadInfo == null) {
            return true;
        }
        if (this.f11024a.get(downloadInfo.getId()) == null) {
            z4 = false;
        }
        this.f11024a.put(downloadInfo.getId(), downloadInfo);
        return z4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo a(int i5, long j5, String str, String str2) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setTotalBytes(j5);
            b5.seteTag(str);
            if (TextUtils.isEmpty(b5.getName()) && !TextUtils.isEmpty(str2)) {
                b5.setName(str2);
            }
            b5.setStatus(3);
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo a(int i5, long j5) {
        DownloadInfo b5 = b(i5);
        if (b5 != null) {
            b5.setCurBytes(j5, false);
            if (b5.getStatus() != -3 && b5.getStatus() != -2 && !DownloadStatus.isFailedStatus(b5.getStatus()) && b5.getStatus() != -4) {
                b5.setStatus(4);
            }
        }
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        if (list == null) {
            return;
        }
        d(i5);
        for (com.ss.android.socialbase.downloader.model.b bVar : list) {
            if (bVar != null) {
                a(bVar);
                if (bVar.f()) {
                    Iterator<com.ss.android.socialbase.downloader.model.b> it = bVar.g().iterator();
                    while (it.hasNext()) {
                        a(it.next());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public synchronized boolean a(int i5, Map<Long, com.ss.android.socialbase.downloader.f.i> map) {
        this.f11026c.put(i5, map);
        return false;
    }
}
