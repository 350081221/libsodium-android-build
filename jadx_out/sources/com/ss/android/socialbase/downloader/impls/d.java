package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.t;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.h.h;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class d implements com.ss.android.socialbase.downloader.downloader.j {

    /* renamed from: b, reason: collision with root package name */
    private t f10999b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f11000c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f11001d;

    /* renamed from: f, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.h.h f11003f;

    /* renamed from: e, reason: collision with root package name */
    private h.a f11002e = new h.a() { // from class: com.ss.android.socialbase.downloader.impls.d.1
        @Override // com.ss.android.socialbase.downloader.h.h.a
        public void a(Message message) {
            if (message.what == 1) {
                com.ss.android.socialbase.downloader.downloader.c.l().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.d.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            d.this.i();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final k f10998a = new k();

    public d() {
        this.f11003f = null;
        if (com.ss.android.socialbase.downloader.g.a.c().a("fix_sigbus_downloader_db")) {
            if (!com.ss.android.socialbase.downloader.i.f.a() && com.ss.android.socialbase.downloader.downloader.c.T()) {
                this.f10999b = com.ss.android.socialbase.downloader.downloader.c.U().a(new c.a.InterfaceC0215a() { // from class: com.ss.android.socialbase.downloader.impls.d.2
                    @Override // com.ss.android.socialbase.downloader.downloader.c.a.InterfaceC0215a
                    public void a() {
                        d.this.f10999b = new com.ss.android.socialbase.downloader.b.e();
                        Log.e("DefaultDownloadCache", "rebind error,use backup sqlDownloadCache");
                    }
                });
            } else {
                this.f10999b = new com.ss.android.socialbase.downloader.b.e();
            }
        } else {
            this.f10999b = new com.ss.android.socialbase.downloader.b.e();
        }
        this.f11000c = false;
        this.f11003f = new com.ss.android.socialbase.downloader.h.h(Looper.getMainLooper(), this.f11002e);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this) {
            this.f11000c = true;
            notifyAll();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> c(String str) {
        return this.f10998a.c(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean d() {
        return this.f11000c;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean e() {
        if (this.f11000c) {
            return true;
        }
        synchronized (this) {
            if (!this.f11000c) {
                com.ss.android.socialbase.downloader.c.a.d("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting start!!!!");
                try {
                    wait(5000L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
                com.ss.android.socialbase.downloader.c.a.d("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting end!!!!");
            }
        }
        return this.f11000c;
    }

    public t f() {
        return this.f10999b;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo g(int i5) {
        DownloadInfo g5 = this.f10998a.g(i5);
        c(g5);
        return g5;
    }

    public void h() {
        this.f11003f.sendMessageDelayed(this.f11003f.obtainMessage(1), com.ss.android.socialbase.downloader.g.a.c().a("task_resume_delay") ? 4000L : 1000L);
    }

    public void i() {
        List<String> list;
        ArrayList arrayList;
        DownloadInfo downloadInfo;
        DownloadInfo downloadInfo2;
        if (this.f11000c) {
            if (this.f11001d) {
                com.ss.android.socialbase.downloader.c.a.b("DefaultDownloadCache", "resumeUnCompleteTask: has resumed, return!!!");
                return;
            }
            this.f11001d = true;
            if (com.ss.android.socialbase.downloader.i.f.a()) {
                com.ss.android.socialbase.downloader.downloader.l x4 = com.ss.android.socialbase.downloader.downloader.c.x();
                if (x4 != null) {
                    list = x4.a();
                    arrayList = (list == null || list.isEmpty()) ? null : new ArrayList();
                } else {
                    list = null;
                    arrayList = null;
                }
                SparseArray sparseArray = new SparseArray();
                synchronized (this) {
                    SparseArray<DownloadInfo> a5 = this.f10998a.a();
                    for (int i5 = 0; i5 < a5.size(); i5++) {
                        int keyAt = a5.keyAt(i5);
                        if (keyAt != 0 && (downloadInfo2 = a5.get(keyAt)) != null) {
                            sparseArray.put(keyAt, downloadInfo2);
                        }
                    }
                }
                if (sparseArray.size() == 0) {
                    return;
                }
                for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                    int keyAt2 = sparseArray.keyAt(i6);
                    if (keyAt2 != 0 && (downloadInfo = (DownloadInfo) sparseArray.get(keyAt2)) != null) {
                        int realStatus = downloadInfo.getRealStatus();
                        int statusAtDbInit = downloadInfo.getStatusAtDbInit();
                        if (statusAtDbInit >= 1 && statusAtDbInit <= 11) {
                            com.ss.android.socialbase.downloader.d.a.a(com.ss.android.socialbase.downloader.downloader.c.g(), downloadInfo, (BaseException) null, -5);
                        }
                        if (list != null && arrayList != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && (com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).b("enable_notification_ui") >= 2 || realStatus != -2 || downloadInfo.isPauseReserveOnWifi())) {
                            downloadInfo.setDownloadFromReserveWifi(false);
                            arrayList.add(downloadInfo);
                        }
                    }
                }
                if (x4 == null || arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                x4.a(arrayList, 1);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public Map<Long, com.ss.android.socialbase.downloader.f.i> l(int i5) {
        Map<Long, com.ss.android.socialbase.downloader.f.i> l5 = this.f10998a.l(i5);
        if (l5 == null || l5.isEmpty()) {
            Map<Long, com.ss.android.socialbase.downloader.f.i> l6 = this.f10999b.l(i5);
            this.f10998a.a(i5, l6);
            return l6;
        }
        return l5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void m(int i5) {
        this.f10998a.m(i5);
        this.f10999b.m(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<com.ss.android.socialbase.downloader.f.i> n(int i5) {
        List<com.ss.android.socialbase.downloader.f.i> n5 = this.f10998a.n(i5);
        if (n5 == null || n5.size() == 0) {
            return this.f10999b.n(i5);
        }
        return n5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo b(int i5) {
        return this.f10998a.b(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<com.ss.android.socialbase.downloader.model.b> c(int i5) {
        return this.f10998a.c(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> d(String str) {
        return this.f10998a.d(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean f(int i5) {
        if (com.ss.android.socialbase.downloader.i.f.b()) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.p(i5);
            } else {
                this.f10999b.f(i5);
            }
        } else {
            this.f10999b.f(i5);
        }
        return this.f10998a.f(i5);
    }

    public k a() {
        return this.f10998a;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> b(String str) {
        return this.f10998a.b(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void c() {
        try {
            this.f10998a.c();
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        if (com.ss.android.socialbase.downloader.i.f.b()) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.g();
                return;
            } else {
                this.f10999b.c();
                return;
            }
        }
        this.f10999b.c();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void d(int i5) {
        this.f10998a.d(i5);
        if (com.ss.android.socialbase.downloader.i.f.b()) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.o(i5);
                return;
            } else {
                this.f10999b.d(i5);
                return;
            }
        }
        this.f10999b.d(i5);
    }

    public void g() {
        List<com.ss.android.socialbase.downloader.model.b> list;
        DownloadInfo downloadInfo;
        com.ss.android.socialbase.downloader.downloader.c.a(com.ss.android.socialbase.downloader.constants.d.SYNC_START);
        final SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        final SparseArray<List<com.ss.android.socialbase.downloader.model.b>> sparseArray2 = new SparseArray<>();
        synchronized (this.f10998a) {
            SparseArray<DownloadInfo> a5 = this.f10998a.a();
            for (int i5 = 0; i5 < a5.size(); i5++) {
                int keyAt = a5.keyAt(i5);
                if (keyAt != 0 && (downloadInfo = a5.get(keyAt)) != null) {
                    sparseArray.put(keyAt, downloadInfo);
                }
            }
            SparseArray<List<com.ss.android.socialbase.downloader.model.b>> f5 = this.f10998a.f();
            for (int i6 = 0; i6 < f5.size(); i6++) {
                int keyAt2 = f5.keyAt(i6);
                if (keyAt2 != 0 && (list = f5.get(keyAt2)) != null) {
                    sparseArray2.put(keyAt2, new CopyOnWriteArrayList(list));
                }
            }
        }
        this.f10999b.a(sparseArray, sparseArray2, new com.ss.android.socialbase.downloader.b.d() { // from class: com.ss.android.socialbase.downloader.impls.d.3
            @Override // com.ss.android.socialbase.downloader.b.d
            public void a() {
                synchronized (d.this.f10998a) {
                    SparseArray<DownloadInfo> a6 = d.this.f10998a.a();
                    if (sparseArray != null) {
                        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                            int keyAt3 = sparseArray.keyAt(i7);
                            if (keyAt3 != 0) {
                                a6.put(keyAt3, (DownloadInfo) sparseArray.get(keyAt3));
                            }
                        }
                    }
                    SparseArray<List<com.ss.android.socialbase.downloader.model.b>> f6 = d.this.f10998a.f();
                    if (sparseArray2 != null) {
                        for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
                            int keyAt4 = sparseArray2.keyAt(i8);
                            if (keyAt4 != 0) {
                                f6.put(keyAt4, (List) sparseArray2.get(keyAt4));
                            }
                        }
                    }
                }
                d.this.j();
                d.this.h();
                com.ss.android.socialbase.downloader.downloader.c.a(com.ss.android.socialbase.downloader.constants.d.SYNC_SUCCESS);
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> a(String str) {
        return this.f10998a.a(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> b() {
        return this.f10998a.b();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo h(int i5) {
        DownloadInfo h5 = this.f10998a.h(i5);
        c(h5);
        return h5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(com.ss.android.socialbase.downloader.model.b bVar) {
        synchronized (this.f10998a) {
            this.f10998a.a(bVar);
        }
        if (com.ss.android.socialbase.downloader.i.f.b()) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.a(bVar);
                return;
            } else {
                this.f10999b.a(bVar);
                return;
            }
        }
        this.f10999b.a(bVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(com.ss.android.socialbase.downloader.model.b bVar) {
        if (com.ss.android.socialbase.downloader.i.f.b()) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.a(bVar);
                return;
            } else {
                this.f10999b.a(bVar);
                return;
            }
        }
        this.f10999b.a(bVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo j(int i5) {
        DownloadInfo j5 = this.f10998a.j(i5);
        c(j5);
        return j5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo d(int i5, long j5) {
        DownloadInfo d5 = this.f10998a.d(i5, j5);
        b(i5, (List<com.ss.android.socialbase.downloader.model.b>) null);
        return d5;
    }

    private void c(DownloadInfo downloadInfo) {
        a(downloadInfo, true);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo b(int i5, long j5) {
        DownloadInfo b5 = this.f10998a.b(i5, j5);
        b(i5, (List<com.ss.android.socialbase.downloader.model.b>) null);
        return b5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo c(int i5, long j5) {
        DownloadInfo c5 = this.f10998a.c(i5, j5);
        b(i5, (List<com.ss.android.socialbase.downloader.model.b>) null);
        return c5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean e(int i5) {
        try {
            if (com.ss.android.socialbase.downloader.i.f.b()) {
                com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
                if (a5 != null) {
                    a5.n(i5);
                } else {
                    this.f10999b.e(i5);
                }
            } else {
                this.f10999b.e(i5);
            }
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        return this.f10998a.e(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        this.f10998a.a(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        try {
            a(this.f10998a.b(i5));
            if (list == null) {
                list = this.f10998a.c(i5);
            }
            if (com.ss.android.socialbase.downloader.i.f.b()) {
                com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
                if (a5 != null) {
                    a5.b(i5, list);
                    return;
                } else {
                    this.f10999b.b(i5, list);
                    return;
                }
            }
            this.f10999b.b(i5, list);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, int i6, long j5) {
        this.f10998a.a(i5, i6, j5);
        if (com.ss.android.socialbase.downloader.i.f.b()) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.a(i5, i6, j5);
                return;
            } else {
                this.f10999b.a(i5, i6, j5);
                return;
            }
        }
        this.f10999b.a(i5, i6, j5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, int i6, int i7, long j5) {
        if (com.ss.android.socialbase.downloader.i.f.b()) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.a(i5, i6, i7, j5);
                return;
            } else {
                this.f10999b.a(i5, i6, i7, j5);
                return;
            }
        }
        this.f10999b.a(i5, i6, i7, j5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, int i6, int i7, int i8) {
        if (com.ss.android.socialbase.downloader.i.f.b()) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.a(i5, i6, i7, i8);
                return;
            } else {
                this.f10999b.a(i5, i6, i7, i8);
                return;
            }
        }
        this.f10999b.a(i5, i6, i7, i8);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo a(int i5, int i6) {
        DownloadInfo a5 = this.f10998a.a(i5, i6);
        c(a5);
        return a5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a5 = this.f10998a.a(downloadInfo);
        c(downloadInfo);
        return a5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo a(int i5, long j5, String str, String str2) {
        DownloadInfo a5 = this.f10998a.a(i5, j5, str, str2);
        c(a5);
        return a5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo i(int i5) {
        DownloadInfo i6 = this.f10998a.i(i5);
        c(i6);
        return i6;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo a(int i5, long j5) {
        DownloadInfo a5 = this.f10998a.a(i5, j5);
        a(a5, false);
        return a5;
    }

    private void a(DownloadInfo downloadInfo, boolean z4) {
        if (downloadInfo == null) {
            return;
        }
        if (!com.ss.android.socialbase.downloader.i.f.b()) {
            this.f10999b.a(downloadInfo);
            return;
        }
        if (z4) {
            com.ss.android.socialbase.downloader.downloader.m a5 = l.a(true);
            if (a5 != null) {
                a5.c(downloadInfo);
            } else {
                this.f10999b.a(downloadInfo);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f10998a.a(i5, list);
        if (com.ss.android.socialbase.downloader.i.f.c()) {
            this.f10999b.b(i5, list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean a(int i5, Map<Long, com.ss.android.socialbase.downloader.f.i> map) {
        this.f10998a.a(i5, map);
        this.f10999b.a(i5, map);
        return false;
    }
}
