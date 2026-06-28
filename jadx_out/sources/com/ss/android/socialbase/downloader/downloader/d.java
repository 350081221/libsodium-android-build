package com.ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f10620a;

    /* renamed from: b, reason: collision with root package name */
    private volatile SparseArray<Boolean> f10621b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private Handler f10622c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private volatile List<ac> f10623d = new ArrayList();

    public static d a() {
        if (f10620a == null) {
            synchronized (d.class) {
                f10620a = new d();
            }
        }
        return f10620a;
    }

    public void b(ac acVar) {
        if (acVar == null) {
            return;
        }
        synchronized (this.f10623d) {
            if (this.f10623d.contains(acVar)) {
                this.f10623d.remove(acVar);
            }
        }
    }

    public m c(int i5) {
        return com.ss.android.socialbase.downloader.impls.l.a(a(i5) == 1 && !com.ss.android.socialbase.downloader.i.f.c());
    }

    public void d(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.a(i5);
    }

    public boolean e(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return false;
        }
        return c5.b(i5);
    }

    public void f(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.c(i5);
    }

    public void g(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.d(i5);
    }

    public long h(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return 0L;
        }
        return c5.e(i5);
    }

    public int i(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return 0;
        }
        return c5.f(i5);
    }

    public boolean j(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return false;
        }
        return c5.g(i5);
    }

    public DownloadInfo k(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return null;
        }
        return c5.h(i5);
    }

    public z l(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return null;
        }
        return c5.q(i5);
    }

    public af m(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return null;
        }
        return c5.r(i5);
    }

    public void n(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.j(i5);
    }

    public boolean o(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return false;
        }
        return c5.l(i5);
    }

    public void p(int i5) {
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        if (a5 != null) {
            a5.k(i5);
        }
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        if (a6 != null) {
            a6.k(i5);
        }
    }

    public void q(int i5) {
        if (i5 == 0) {
            return;
        }
        b(i5, true);
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(true);
        if (a5 == null) {
            return;
        }
        a5.e();
    }

    public IDownloadFileUriProvider r(int i5) {
        m c5 = c(i5);
        if (c5 == null) {
            return null;
        }
        return c5.s(i5);
    }

    public void c(int i5, boolean z4) {
        if (com.ss.android.socialbase.downloader.i.f.a()) {
            if (com.ss.android.socialbase.downloader.i.a.a(8388608)) {
                m a5 = com.ss.android.socialbase.downloader.impls.l.a(true);
                if (a5 != null) {
                    a5.a(i5, z4);
                }
                m a6 = com.ss.android.socialbase.downloader.impls.l.a(false);
                if (a6 != null) {
                    a6.a(i5, z4);
                    return;
                }
                return;
            }
            m a7 = com.ss.android.socialbase.downloader.impls.l.a(false);
            if (a7 != null) {
                a7.a(i5, z4);
            }
            m a8 = com.ss.android.socialbase.downloader.impls.l.a(true);
            if (a8 != null) {
                a8.a(i5, z4);
                return;
            }
            return;
        }
        m c5 = c(i5);
        if (c5 != null) {
            c5.a(i5, z4);
        }
        com.ss.android.socialbase.downloader.impls.l.a(true).a(2, i5);
    }

    public void d(int i5, boolean z4) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.b(i5, z4);
    }

    public List<DownloadInfo> e(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        List<DownloadInfo> e5 = a5 != null ? a5.e(str) : null;
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        return a(e5, a6 != null ? a6.e(str) : null, sparseArray);
    }

    public boolean f() {
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        if (a5 != null) {
            return a5.f();
        }
        return false;
    }

    public void b() {
        synchronized (this.f10623d) {
            for (ac acVar : this.f10623d) {
                if (acVar != null) {
                    acVar.a();
                }
            }
        }
    }

    public boolean d() {
        return c.P();
    }

    public void a(ac acVar) {
        if (acVar == null) {
            return;
        }
        if (com.ss.android.socialbase.downloader.i.f.c()) {
            acVar.a();
            return;
        }
        if (com.ss.android.socialbase.downloader.impls.l.a(true).h()) {
            acVar.a();
        }
        synchronized (this.f10623d) {
            if (!this.f10623d.contains(acVar)) {
                this.f10623d.add(acVar);
            }
        }
    }

    public List<DownloadInfo> d(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        List<DownloadInfo> d5 = a5 != null ? a5.d(str) : null;
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        return a(d5, a6 != null ? a6.d(str) : null, sparseArray);
    }

    public List<DownloadInfo> e() {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        List<DownloadInfo> d5 = a5 != null ? a5.d() : null;
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        return a(d5, a6 != null ? a6.d() : null, sparseArray);
    }

    public synchronized void b(int i5, boolean z4) {
        this.f10621b.put(i5, z4 ? Boolean.TRUE : Boolean.FALSE);
    }

    public synchronized int b(int i5) {
        if (this.f10621b.get(i5) == null) {
            return -1;
        }
        return this.f10621b.get(i5).booleanValue() ? 1 : 0;
    }

    public void a(int i5, boolean z4) {
        b(i5, z4);
        if (c.T() && !com.ss.android.socialbase.downloader.i.f.c() && com.ss.android.socialbase.downloader.impls.l.a(true).h()) {
            com.ss.android.socialbase.downloader.impls.l.a(true).c(i5, z4);
        }
        if (c.c() || com.ss.android.socialbase.downloader.i.f.c() || com.ss.android.socialbase.downloader.i.f.a()) {
            return;
        }
        try {
            Intent intent = new Intent(c.O(), (Class<?>) DownloadHandleService.class);
            intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
            intent.putExtra("extra_download_id", i5);
            c.O().startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void c() {
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        if (a5 != null) {
            a5.a();
        }
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        if (a6 != null) {
            a6.a();
        }
    }

    private m b(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        List<com.ss.android.socialbase.downloader.model.b> i5;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return null;
        }
        boolean isNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
        if (com.ss.android.socialbase.downloader.i.f.c() || !com.ss.android.socialbase.downloader.i.f.a()) {
            isNeedIndependentProcess = true;
        }
        int a5 = a(downloadInfo.getId());
        if (a5 >= 0 && a5 != isNeedIndependentProcess) {
            try {
                if (a5 == 1) {
                    if (com.ss.android.socialbase.downloader.i.f.a()) {
                        com.ss.android.socialbase.downloader.impls.l.a(true).a(downloadInfo.getId());
                        DownloadInfo h5 = com.ss.android.socialbase.downloader.impls.l.a(true).h(downloadInfo.getId());
                        if (h5 != null) {
                            com.ss.android.socialbase.downloader.impls.l.a(false).b(h5);
                        }
                        if (h5.getChunkCount() > 1 && (i5 = com.ss.android.socialbase.downloader.impls.l.a(true).i(downloadInfo.getId())) != null) {
                            com.ss.android.socialbase.downloader.impls.l.a(false).a(downloadInfo.getId(), com.ss.android.socialbase.downloader.i.f.a(i5));
                        }
                    }
                } else if (com.ss.android.socialbase.downloader.i.f.a()) {
                    com.ss.android.socialbase.downloader.impls.l.a(false).a(downloadInfo.getId());
                    List<com.ss.android.socialbase.downloader.model.b> i6 = com.ss.android.socialbase.downloader.impls.l.a(false).i(downloadInfo.getId());
                    if (i6 != null) {
                        com.ss.android.socialbase.downloader.impls.l.a(true).a(downloadInfo.getId(), com.ss.android.socialbase.downloader.i.f.a(i6));
                    }
                } else {
                    downloadTask.setNeedDelayForCacheSync(true);
                    com.ss.android.socialbase.downloader.impls.l.a(true).a(1, downloadInfo.getId());
                }
            } catch (Throwable unused) {
            }
        }
        a(downloadInfo.getId(), isNeedIndependentProcess);
        return com.ss.android.socialbase.downloader.impls.l.a(isNeedIndependentProcess);
    }

    public List<DownloadInfo> c(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        List<DownloadInfo> c5 = a5 != null ? a5.c(str) : null;
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        return a(c5, a6 != null ? a6.c(str) : null, sparseArray);
    }

    public int a(int i5) {
        if (!c.T()) {
            return -1;
        }
        if (!com.ss.android.socialbase.downloader.i.f.c() && com.ss.android.socialbase.downloader.impls.l.a(true).h()) {
            return com.ss.android.socialbase.downloader.impls.l.a(true).m(i5);
        }
        return b(i5);
    }

    public int a(String str, String str2) {
        return c.a(str, str2);
    }

    public List<DownloadInfo> a(String str) {
        List<DownloadInfo> a5 = com.ss.android.socialbase.downloader.impls.l.a(false).a(str);
        List<DownloadInfo> a6 = com.ss.android.socialbase.downloader.impls.l.a(true).a(str);
        if (a5 == null && a6 == null) {
            return null;
        }
        if (a5 == null || a6 == null) {
            return a5 != null ? a5 : a6;
        }
        ArrayList arrayList = new ArrayList(a5);
        arrayList.addAll(a6);
        return arrayList;
    }

    public void a(int i5, z zVar) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.a(i5, zVar);
    }

    private List<DownloadInfo> a(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo downloadInfo2 : list2) {
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i5)));
        }
        return arrayList;
    }

    public DownloadInfo b(String str, String str2) {
        int a5 = a(str, str2);
        m c5 = c(a5);
        if (c5 == null) {
            return null;
        }
        return c5.h(a5);
    }

    public List<DownloadInfo> b(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        List<DownloadInfo> b5 = a5 != null ? a5.b(str) : null;
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        return a(b5, a6 != null ? a6.b(str) : null, sparseArray);
    }

    public void a(List<String> list) {
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        if (a5 != null) {
            a5.a(list);
        }
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        if (a6 != null) {
            a6.a(list);
        }
    }

    public void b(List<String> list) {
        m a5 = com.ss.android.socialbase.downloader.impls.l.a(false);
        if (a5 != null) {
            a5.b(list);
        }
        m a6 = com.ss.android.socialbase.downloader.impls.l.a(true);
        if (a6 != null) {
            a6.b(list);
        }
    }

    public void a(int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.b(i5, iDownloadListener == null ? 0 : iDownloadListener.hashCode(), iDownloadListener, fVar, z4);
    }

    public void b(int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.a(i5, iDownloadListener.hashCode(), iDownloadListener, fVar, z4);
    }

    public void a(int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4, boolean z5) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.a(i5, iDownloadListener.hashCode(), iDownloadListener, fVar, z4, z5);
    }

    public void b(com.ss.android.socialbase.downloader.depend.k kVar) {
        c.b(kVar);
    }

    public boolean a(DownloadInfo downloadInfo) {
        m c5;
        if (downloadInfo == null || (c5 = c(downloadInfo.getId())) == null) {
            return false;
        }
        return c5.a(downloadInfo);
    }

    public void a(final DownloadTask downloadTask) {
        final m b5 = b(downloadTask);
        if (b5 == null) {
            if (downloadTask != null) {
                com.ss.android.socialbase.downloader.d.a.a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "tryDownload but getDownloadHandler failed"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
            }
        } else if (downloadTask.isNeedDelayForCacheSync()) {
            this.f10622c.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.d.1
                @Override // java.lang.Runnable
                public void run() {
                    b5.a(downloadTask);
                }
            }, 500L);
        } else {
            b5.a(downloadTask);
        }
    }

    public void a(com.ss.android.socialbase.downloader.depend.k kVar) {
        c.a(kVar);
    }

    public void a(int i5, long j5) {
        m c5 = c(i5);
        if (c5 == null) {
            return;
        }
        c5.a(i5, j5);
    }
}
