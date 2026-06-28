package com.ss.android.socialbase.downloader.h;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static ExecutorService f10873a = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Download_OP_Thread"));

    /* renamed from: c, reason: collision with root package name */
    private int f10875c = 0;

    /* renamed from: b, reason: collision with root package name */
    private volatile SparseArray<c> f10874b = new SparseArray<>();

    public static void a(Runnable runnable) {
        f10873a.execute(runnable);
    }

    private void b() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < this.f10874b.size(); i5++) {
                int keyAt = this.f10874b.keyAt(i5);
                if (!this.f10874b.get(keyAt).d()) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                try {
                    Integer num = (Integer) arrayList.get(i6);
                    if (num != null) {
                        this.f10874b.remove(num.intValue());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void c(int i5) {
        synchronized (d.class) {
            b();
            c cVar = this.f10874b.get(i5);
            if (cVar != null) {
                cVar.a();
                c(cVar);
                this.f10874b.remove(i5);
            }
        }
    }

    public void a(c cVar) {
        cVar.f();
        synchronized (d.class) {
            int i5 = this.f10875c;
            if (i5 >= 500) {
                b();
                this.f10875c = 0;
            } else {
                this.f10875c = i5 + 1;
            }
            this.f10874b.put(cVar.e(), cVar);
        }
        DownloadTask c5 = cVar.c();
        try {
            ExecutorService p5 = com.ss.android.socialbase.downloader.downloader.c.p();
            if (c5 != null && c5.getDownloadInfo() != null) {
                if ("mime_type_plg".equals(c5.getDownloadInfo().getMimeType()) && com.ss.android.socialbase.downloader.g.a.c().a("divide_plugin", 1) == 1) {
                    c5.getDownloadInfo().safePutToDBJsonData("executor_group", 3);
                }
                int executorGroup = c5.getDownloadInfo().getExecutorGroup();
                if (executorGroup == 3) {
                    p5 = com.ss.android.socialbase.downloader.downloader.c.n();
                } else if (executorGroup == 4) {
                    p5 = com.ss.android.socialbase.downloader.downloader.c.o();
                }
            }
            if (p5 != null) {
                if (com.ss.android.socialbase.downloader.g.a.a(cVar.e()).b("pause_with_interrupt", false)) {
                    cVar.a(p5.submit(cVar));
                    return;
                } else {
                    p5.execute(cVar);
                    return;
                }
            }
            com.ss.android.socialbase.downloader.d.a.a(c5.getMonitorDepend(), c5.getDownloadInfo(), new BaseException(1003, "execute failed cpu thread executor service is null"), c5.getDownloadInfo() != null ? c5.getDownloadInfo().getStatus() : 0);
        } catch (Exception e5) {
            if (c5 != null) {
                com.ss.android.socialbase.downloader.d.a.a(c5.getMonitorDepend(), c5.getDownloadInfo(), new BaseException(1003, com.ss.android.socialbase.downloader.i.f.b(e5, "DownloadThreadPoolExecute")), c5.getDownloadInfo() != null ? c5.getDownloadInfo().getStatus() : 0);
            }
            e5.printStackTrace();
        } catch (OutOfMemoryError e6) {
            if (c5 != null) {
                com.ss.android.socialbase.downloader.d.a.a(c5.getMonitorDepend(), c5.getDownloadInfo(), new BaseException(1003, "execute OOM"), c5.getDownloadInfo() != null ? c5.getDownloadInfo().getStatus() : 0);
            }
            e6.printStackTrace();
        }
    }

    private void c(c cVar) {
        Future g5;
        if (cVar == null) {
            return;
        }
        try {
            ExecutorService p5 = com.ss.android.socialbase.downloader.downloader.c.p();
            DownloadTask c5 = cVar.c();
            if (c5 != null && c5.getDownloadInfo() != null) {
                int executorGroup = c5.getDownloadInfo().getExecutorGroup();
                if (executorGroup == 3) {
                    p5 = com.ss.android.socialbase.downloader.downloader.c.n();
                } else if (executorGroup == 4) {
                    p5 = com.ss.android.socialbase.downloader.downloader.c.o();
                }
            }
            if (p5 == null || !(p5 instanceof ThreadPoolExecutor)) {
                return;
            }
            ((ThreadPoolExecutor) p5).remove(cVar);
            if (!com.ss.android.socialbase.downloader.g.a.a(cVar.e()).b("pause_with_interrupt", false) || (g5 = cVar.g()) == null) {
                return;
            }
            g5.cancel(true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b(c cVar) {
        if (cVar == null) {
            return;
        }
        synchronized (d.class) {
            try {
                if (com.ss.android.socialbase.downloader.i.a.a(524288)) {
                    int indexOfValue = this.f10874b.indexOfValue(cVar);
                    if (indexOfValue >= 0) {
                        this.f10874b.removeAt(indexOfValue);
                    }
                } else {
                    this.f10874b.remove(cVar.e());
                }
            } finally {
            }
        }
    }

    public c b(int i5) {
        synchronized (d.class) {
            b();
            c cVar = this.f10874b.get(i5);
            if (cVar == null) {
                return null;
            }
            cVar.b();
            c(cVar);
            this.f10874b.remove(i5);
            return cVar;
        }
    }

    public boolean a(int i5) {
        synchronized (d.class) {
            boolean z4 = false;
            if (this.f10874b != null && this.f10874b.size() > 0) {
                c cVar = this.f10874b.get(i5);
                if (cVar != null && cVar.d()) {
                    z4 = true;
                }
                return z4;
            }
            return false;
        }
    }

    public List<Integer> a() {
        ArrayList arrayList;
        synchronized (d.class) {
            b();
            arrayList = new ArrayList();
            for (int i5 = 0; i5 < this.f10874b.size(); i5++) {
                c cVar = this.f10874b.get(this.f10874b.keyAt(i5));
                if (cVar != null) {
                    arrayList.add(Integer.valueOf(cVar.e()));
                }
            }
        }
        return arrayList;
    }

    public void a(int i5, long j5) {
        c cVar = this.f10874b.get(i5);
        if (cVar != null) {
            cVar.c(j5);
        }
    }
}
