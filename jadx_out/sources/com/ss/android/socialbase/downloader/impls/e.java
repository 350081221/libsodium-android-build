package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public class e extends a {

    /* renamed from: b, reason: collision with root package name */
    private static com.ss.android.socialbase.downloader.h.d f11010b;

    public e() {
        f11010b = new com.ss.android.socialbase.downloader.h.d();
    }

    public static void c(List<Callable<Object>> list) throws InterruptedException {
        ExecutorService q5 = com.ss.android.socialbase.downloader.downloader.c.q();
        if (q5 != null) {
            q5.invokeAll(list);
        }
    }

    public static List<Future> d(List<Runnable> list) {
        ExecutorService q5 = com.ss.android.socialbase.downloader.downloader.c.q();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(q5.submit(it.next()));
        }
        return arrayList;
    }

    public static Runnable e(List<Future> list) {
        BlockingQueue<Runnable> queue;
        Runnable runnable;
        if (list != null && !list.isEmpty()) {
            try {
                ExecutorService q5 = com.ss.android.socialbase.downloader.downloader.c.q();
                if ((q5 instanceof ThreadPoolExecutor) && (queue = ((ThreadPoolExecutor) q5).getQueue()) != null && !queue.isEmpty()) {
                    Iterator<Future> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Future next = it.next();
                            if ((next instanceof Runnable) && queue.remove(next)) {
                                runnable = (Runnable) next;
                                break;
                            }
                        } else {
                            runnable = null;
                            break;
                        }
                    }
                    if (runnable != null) {
                        list.remove(runnable);
                        return runnable;
                    }
                }
            } catch (Throwable th) {
                com.ss.android.socialbase.downloader.c.a.d("DefaultDownloadEngine", "getUnstartedTask() error: " + th.toString());
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public boolean a(int i5) {
        DownloadInfo d5;
        com.ss.android.socialbase.downloader.h.d dVar = f11010b;
        if (dVar == null || !dVar.a(i5) || (d5 = d(i5)) == null) {
            return false;
        }
        if (DownloadStatus.isDownloading(d5.getStatus())) {
            return true;
        }
        b(i5);
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public void b(int i5) {
        com.ss.android.socialbase.downloader.h.d dVar = f11010b;
        if (dVar == null) {
            return;
        }
        dVar.c(i5);
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    protected com.ss.android.socialbase.downloader.h.c c(int i5) {
        com.ss.android.socialbase.downloader.h.d dVar = f11010b;
        if (dVar == null) {
            return null;
        }
        return dVar.b(i5);
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public void a(com.ss.android.socialbase.downloader.h.c cVar) {
        com.ss.android.socialbase.downloader.h.d dVar = f11010b;
        if (dVar == null) {
            return;
        }
        dVar.b(cVar);
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public void a(int i5, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        com.ss.android.socialbase.downloader.c.a.b("DownloadTask", "start doDownload for task : " + i5);
        f11010b.a(new com.ss.android.socialbase.downloader.h.c(downloadTask, this.f10970a));
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public List<Integer> a() {
        return f11010b.a();
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public void a(int i5, long j5) {
        com.ss.android.socialbase.downloader.h.d dVar = f11010b;
        if (dVar == null) {
            return;
        }
        dVar.a(i5, j5);
    }
}
