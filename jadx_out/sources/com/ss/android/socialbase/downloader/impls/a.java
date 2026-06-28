package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.h.h;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes3.dex */
public abstract class a implements h.a {

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<DownloadTask> f10971b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<DownloadTask> f10972c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<DownloadTask> f10973d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<DownloadTask> f10974e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray<DownloadTask> f10975f = new SparseArray<>();

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray<SparseArray<DownloadTask>> f10976g = new SparseArray<>();

    /* renamed from: h, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.i.h<Integer, DownloadTask> f10977h = new com.ss.android.socialbase.downloader.i.h<>();

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray<Long> f10978i = new SparseArray<>();

    /* renamed from: j, reason: collision with root package name */
    private final LinkedBlockingDeque<DownloadTask> f10979j = new LinkedBlockingDeque<>();

    /* renamed from: a, reason: collision with root package name */
    protected final com.ss.android.socialbase.downloader.h.h f10970a = new com.ss.android.socialbase.downloader.h.h(Looper.getMainLooper(), this);

    /* renamed from: k, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.j f10980k = com.ss.android.socialbase.downloader.downloader.c.y();

    private void c(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return;
        }
        try {
            if (this.f10979j.isEmpty()) {
                a(downloadTask, true);
                this.f10979j.put(downloadTask);
                return;
            }
            if (downloadInfo.getEnqueueType() == EnqueueType.ENQUEUE_TAIL) {
                if (this.f10979j.getFirst().getDownloadId() == downloadTask.getDownloadId() && a(downloadTask.getDownloadId())) {
                    return;
                }
                Iterator<DownloadTask> it = this.f10979j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DownloadTask next = it.next();
                    if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                        it.remove();
                        break;
                    }
                }
                this.f10979j.put(downloadTask);
                new com.ss.android.socialbase.downloader.downloader.f(downloadTask, this.f10970a).a();
                return;
            }
            DownloadTask first = this.f10979j.getFirst();
            if (first.getDownloadId() == downloadTask.getDownloadId() && a(downloadTask.getDownloadId())) {
                return;
            }
            e(first.getDownloadId());
            a(downloadTask, true);
            if (first.getDownloadId() != downloadTask.getDownloadId()) {
                this.f10979j.putFirst(downloadTask);
            }
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadTask o(int i5) {
        DownloadTask downloadTask = this.f10971b.get(i5);
        if (downloadTask == null) {
            DownloadTask downloadTask2 = this.f10973d.get(i5);
            if (downloadTask2 == null) {
                DownloadTask downloadTask3 = this.f10972c.get(i5);
                if (downloadTask3 == null) {
                    DownloadTask downloadTask4 = this.f10974e.get(i5);
                    if (downloadTask4 == null) {
                        return this.f10975f.get(i5);
                    }
                    return downloadTask4;
                }
                return downloadTask3;
            }
            return downloadTask2;
        }
        return downloadTask;
    }

    private void p(int i5) {
        DownloadTask first;
        if (this.f10979j.isEmpty()) {
            return;
        }
        DownloadTask first2 = this.f10979j.getFirst();
        if (first2 != null && first2.getDownloadId() == i5) {
            this.f10979j.poll();
        }
        if (!this.f10979j.isEmpty() && (first = this.f10979j.getFirst()) != null) {
            a(first, true);
        }
    }

    protected abstract List<Integer> a();

    public abstract void a(int i5, long j5);

    protected abstract void a(int i5, DownloadTask downloadTask);

    public abstract void a(com.ss.android.socialbase.downloader.h.c cVar);

    public abstract boolean a(int i5);

    protected abstract void b(int i5);

    protected abstract com.ss.android.socialbase.downloader.h.c c(int i5);

    public synchronized DownloadInfo d(int i5) {
        DownloadInfo b5;
        DownloadTask downloadTask;
        b5 = this.f10980k.b(i5);
        if (b5 == null && (downloadTask = this.f10971b.get(i5)) != null) {
            b5 = downloadTask.getDownloadInfo();
        }
        return b5;
    }

    public synchronized boolean e(int i5) {
        com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "pause id=" + i5);
        DownloadInfo b5 = this.f10980k.b(i5);
        if (b5 != null && b5.getStatus() == 11) {
            return false;
        }
        synchronized (this.f10971b) {
            b(i5);
        }
        if (b5 == null) {
            DownloadTask downloadTask = this.f10971b.get(i5);
            if (downloadTask != null) {
                new com.ss.android.socialbase.downloader.downloader.f(downloadTask, this.f10970a).d();
                return true;
            }
        } else {
            a(b5);
            if (b5.getStatus() == 1) {
                DownloadTask downloadTask2 = this.f10971b.get(i5);
                if (downloadTask2 != null) {
                    new com.ss.android.socialbase.downloader.downloader.f(downloadTask2, this.f10970a).d();
                    return true;
                }
            } else if (DownloadStatus.isDownloading(b5.getStatus())) {
                b5.setStatus(-2);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean f(int i5) {
        DownloadTask downloadTask = this.f10971b.get(i5);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            a(downloadTask);
        } else {
            g(i5);
        }
        return true;
    }

    public synchronized boolean g(int i5) {
        DownloadTask downloadTask = this.f10973d.get(i5);
        if (downloadTask == null) {
            downloadTask = this.f10974e.get(i5);
        }
        if (downloadTask == null) {
            return false;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            downloadInfo.setDownloadFromReserveWifi(false);
        }
        a(downloadTask);
        return true;
    }

    public synchronized af h(int i5) {
        DownloadTask downloadTask = this.f10971b.get(i5);
        if (downloadTask != null) {
            return downloadTask.getNotificationClickCallback();
        }
        DownloadTask downloadTask2 = this.f10972c.get(i5);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationClickCallback();
        }
        DownloadTask downloadTask3 = this.f10973d.get(i5);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationClickCallback();
        }
        DownloadTask downloadTask4 = this.f10974e.get(i5);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationClickCallback();
        }
        DownloadTask downloadTask5 = this.f10975f.get(i5);
        if (downloadTask5 != null) {
            return downloadTask5.getNotificationClickCallback();
        }
        return null;
    }

    public synchronized z i(int i5) {
        DownloadTask downloadTask = this.f10971b.get(i5);
        if (downloadTask != null) {
            return downloadTask.getNotificationEventListener();
        }
        DownloadTask downloadTask2 = this.f10972c.get(i5);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationEventListener();
        }
        DownloadTask downloadTask3 = this.f10973d.get(i5);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationEventListener();
        }
        DownloadTask downloadTask4 = this.f10974e.get(i5);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationEventListener();
        }
        DownloadTask downloadTask5 = this.f10975f.get(i5);
        if (downloadTask5 != null) {
            return downloadTask5.getNotificationEventListener();
        }
        return null;
    }

    public synchronized IDownloadFileUriProvider j(int i5) {
        DownloadTask downloadTask = this.f10971b.get(i5);
        if (downloadTask != null) {
            return downloadTask.getFileUriProvider();
        }
        DownloadTask downloadTask2 = this.f10972c.get(i5);
        if (downloadTask2 != null) {
            return downloadTask2.getFileUriProvider();
        }
        DownloadTask downloadTask3 = this.f10973d.get(i5);
        if (downloadTask3 != null) {
            return downloadTask3.getFileUriProvider();
        }
        DownloadTask downloadTask4 = this.f10974e.get(i5);
        if (downloadTask4 != null) {
            return downloadTask4.getFileUriProvider();
        }
        DownloadTask downloadTask5 = this.f10975f.get(i5);
        if (downloadTask5 != null) {
            return downloadTask5.getFileUriProvider();
        }
        return null;
    }

    public synchronized boolean k(int i5) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f10974e.get(i5);
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            if (downloadInfo.canStartRetryDelayTask()) {
                a(downloadTask, false);
            }
            return true;
        }
        DownloadInfo b5 = this.f10980k.b(i5);
        if (b5 != null && b5.canStartRetryDelayTask()) {
            a(new DownloadTask(b5), false);
        }
        return false;
    }

    public synchronized boolean l(int i5) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f10975f.get(i5);
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            if (downloadInfo.canReStartAsyncTask()) {
                a(downloadTask);
            }
            return true;
        }
        return false;
    }

    public synchronized void m(int i5) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f10971b.get(i5);
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            downloadInfo.setForceIgnoreRecommendSize(true);
            a(downloadTask);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        if (r1.f10973d.get(r2) != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean n(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L18
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f10971b     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L13
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f10973d     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L18
        L13:
            r2 = 1
            goto L19
        L15:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L18:
            r2 = 0
        L19:
            monitor-exit(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.a.n(int):boolean");
    }

    private void b(DownloadTask downloadTask) {
        int hashCodeForSameTask = downloadTask.getHashCodeForSameTask();
        if (hashCodeForSameTask == 0 && downloadTask.isAutoSetHashCodeForSameTask()) {
            hashCodeForSameTask = downloadTask.autoCalAndGetHashCodeForSameTask();
        }
        if (hashCodeForSameTask == 0) {
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.f10976g.get(downloadTask.getDownloadId());
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.f10976g.put(downloadTask.getDownloadId(), sparseArray);
        }
        com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "tryCacheSameTaskWithListenerHashCode id:" + downloadTask.getDownloadId() + " listener hasCode:" + hashCodeForSameTask);
        sparseArray.put(hashCodeForSameTask, downloadTask);
    }

    private void a(DownloadTask downloadTask, boolean z4) {
        DownloadInfo downloadInfo;
        int i5;
        DownloadInfo downloadInfo2;
        DownloadTask remove;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return;
        }
        if (downloadInfo.isEntityInvalid()) {
            com.ss.android.socialbase.downloader.d.a.a(downloadTask.getMonitorDepend(), downloadInfo, new BaseException(1003, "downloadInfo is Invalid, url is " + downloadInfo.getUrl() + " name is " + downloadInfo.getName() + " savePath is " + downloadInfo.getSavePath()), downloadInfo.getStatus());
            return;
        }
        boolean z5 = false;
        if (com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("no_net_opt", 0) == 1 && !com.ss.android.socialbase.downloader.i.f.c(com.ss.android.socialbase.downloader.downloader.c.O()) && !downloadInfo.isFirstDownload()) {
            new com.ss.android.socialbase.downloader.downloader.f(downloadTask, this.f10970a).a(new BaseException(1049, "network_not_available"));
            return;
        }
        int id = downloadInfo.getId();
        if (z4) {
            a(downloadInfo);
        }
        if (this.f10973d.get(id) != null) {
            this.f10973d.remove(id);
        }
        if (this.f10972c.get(id) != null) {
            this.f10972c.remove(id);
        }
        if (this.f10974e.get(id) != null) {
            this.f10974e.remove(id);
        }
        if (this.f10975f.get(id) != null) {
            this.f10975f.remove(id);
        }
        if (a(id) && !downloadInfo.canReStartAsyncTask()) {
            com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "another task with same id is downloading when tryDownload");
            downloadTask.addListenerToDownloadingSameTask();
            com.ss.android.socialbase.downloader.d.a.a(downloadTask.getMonitorDepend(), downloadInfo, new BaseException(1003, "downloadInfo is isDownloading and addListenerToSameTask is false"), downloadInfo.getStatus());
            return;
        }
        com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "no downloading task :" + id);
        if (downloadInfo.canReStartAsyncTask()) {
            downloadInfo.setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_RESTART);
        }
        if (com.ss.android.socialbase.downloader.i.a.a(32768) && (remove = this.f10977h.remove(Integer.valueOf(id))) != null) {
            downloadTask.copyListenerFromPendingTask(remove);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        DownloadTask downloadTask2 = this.f10971b.get(id);
        if (downloadTask2 == null || (downloadInfo2 = downloadTask2.getDownloadInfo()) == null) {
            i5 = 0;
        } else {
            i5 = downloadInfo2.getStatus();
            if (DownloadStatus.isDownloading(i5)) {
                z5 = true;
            }
        }
        com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "can add listener " + z5 + " , oldTaskStatus is :" + i5);
        if (z5) {
            downloadTask.addListenerToDownloadingSameTask();
            return;
        }
        b(downloadTask);
        this.f10971b.put(id, downloadTask);
        this.f10978i.put(id, Long.valueOf(uptimeMillis));
        a(id, downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(int i5, boolean z4) {
        com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "clearDownloadDataInSubThread::id=" + i5 + " deleteTargetFile=" + z4);
        try {
            DownloadInfo b5 = this.f10980k.b(i5);
            if (b5 != null) {
                if (z4) {
                    com.ss.android.socialbase.downloader.i.f.a(b5);
                } else {
                    com.ss.android.socialbase.downloader.i.f.c(b5.getTempPath(), b5.getTempName());
                }
                b5.erase();
            }
            try {
                this.f10980k.f(i5);
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
            a(i5, 0, -4);
            if (this.f10973d.get(i5) != null) {
                this.f10973d.remove(i5);
            }
            if (this.f10972c.get(i5) != null) {
                this.f10972c.remove(i5);
            }
            this.f10977h.remove(Integer.valueOf(i5));
            com.ss.android.socialbase.downloader.g.a.b(i5);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public synchronized void b(List<String> list) {
        DownloadInfo downloadInfo;
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.ss.android.socialbase.downloader.i.f.b(com.ss.android.socialbase.downloader.downloader.c.O())) {
            for (int i5 = 0; i5 < this.f10971b.size(); i5++) {
                DownloadTask downloadTask = this.f10971b.get(this.f10971b.keyAt(i5));
                if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && b(downloadInfo)) {
                    downloadInfo.setAutoResumed(true);
                    downloadInfo.setShowNotificationForNetworkResumed(true);
                    a(downloadTask);
                    downloadInfo.setDownloadFromReserveWifi(true);
                    com.ss.android.socialbase.downloader.downloader.r reserveWifiStatusListener = Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).getReserveWifiStatusListener();
                    if (reserveWifiStatusListener != null) {
                        reserveWifiStatusListener.a(downloadInfo, 5, 2);
                    }
                }
            }
        }
    }

    public void c(final int i5, final boolean z4) {
        DownloadInfo b5 = this.f10980k.b(i5);
        if (b5 != null) {
            a(b5);
        }
        this.f10970a.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.a.4
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.downloader.notification.b.a().f(i5);
            }
        });
        com.ss.android.socialbase.downloader.downloader.c.a(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.a.5
            @Override // java.lang.Runnable
            public void run() {
                a.this.c(i5);
                a.this.e(i5, z4);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i5, boolean z4) {
        try {
            DownloadInfo b5 = this.f10980k.b(i5);
            if (b5 != null) {
                com.ss.android.socialbase.downloader.i.f.a(b5, z4);
                b5.erase();
            }
            try {
                this.f10980k.d(i5);
                this.f10980k.a(b5);
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
            if (this.f10973d.get(i5) != null) {
                this.f10973d.remove(i5);
            }
            if (this.f10972c.get(i5) != null) {
                this.f10972c.remove(i5);
            }
            this.f10977h.remove(Integer.valueOf(i5));
            com.ss.android.socialbase.downloader.g.a.b(i5);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean b(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.statusInPause()) {
            return downloadInfo.isPauseReserveOnWifi();
        }
        return false;
    }

    public void b() {
        List<Integer> a5 = a();
        if (a5 == null) {
            return;
        }
        Iterator<Integer> it = a5.iterator();
        while (it.hasNext()) {
            e(it.next().intValue());
        }
    }

    public void b(final int i5, final boolean z4) {
        DownloadInfo b5 = this.f10980k.b(i5);
        if (b5 != null) {
            a(b5);
        }
        this.f10970a.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.a.2
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.downloader.notification.b.a().f(i5);
            }
        });
        com.ss.android.socialbase.downloader.downloader.c.a(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.a.3
            @Override // java.lang.Runnable
            public void run() {
                DownloadTask o5;
                if (a.this.c(i5) == null && (o5 = a.this.o(i5)) != null) {
                    DownloadInfo downloadInfo = o5.getDownloadInfo();
                    SparseArray<IDownloadListener> downloadListeners = o5.getDownloadListeners(com.ss.android.socialbase.downloader.constants.f.SUB);
                    if (downloadListeners != null) {
                        synchronized (downloadListeners) {
                            for (int i6 = 0; i6 < downloadListeners.size(); i6++) {
                                IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i6));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                }
                a.this.d(i5, z4);
            }
        }, false);
    }

    public synchronized void b(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4) {
        a(i5, i6, iDownloadListener, fVar, z4, true);
    }

    public List<DownloadInfo> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<Integer> it = a().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            DownloadInfo d5 = d(it.next().intValue());
            if (d5 != null && str.equals(d5.getMimeType())) {
                arrayList.add(d5);
            }
        }
        return arrayList;
    }

    public synchronized void a(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return;
        }
        downloadInfo.setDownloadFromReserveWifi(false);
        if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_NONE) {
            c(downloadTask);
        } else {
            a(downloadTask, true);
        }
    }

    public void b(int i5, long j5) {
        DownloadInfo b5 = this.f10980k.b(i5);
        if (b5 != null) {
            b5.setThrottleNetSpeed(j5);
        }
        a(i5, j5);
    }

    public synchronized List<DownloadInfo> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> a5 = this.f10980k.a(str);
        if (a5 != null && !a5.isEmpty()) {
            return a5;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f10971b.size();
        for (int i5 = 0; i5 < size; i5++) {
            DownloadTask valueAt = this.f10971b.valueAt(i5);
            if (valueAt != null && valueAt.getDownloadInfo() != null && str.equals(valueAt.getDownloadInfo().getUrl())) {
                arrayList.add(valueAt.getDownloadInfo());
            }
        }
        return arrayList;
    }

    public synchronized boolean a(int i5, boolean z4) {
        DownloadTask downloadTask = this.f10971b.get(i5);
        if (downloadTask == null && com.ss.android.socialbase.downloader.i.a.a(65536)) {
            downloadTask = o(i5);
        }
        if (downloadTask != null) {
            if (!com.ss.android.socialbase.downloader.g.a.a(i5).b("fix_on_cancel_call_twice", true)) {
                new com.ss.android.socialbase.downloader.downloader.f(downloadTask, this.f10970a).c();
            }
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            final SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.constants.f.MAIN);
            final SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.constants.f.NOTIFICATION);
            this.f10970a.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.a.1
                @Override // java.lang.Runnable
                public void run() {
                    SparseArray sparseArray;
                    SparseArray sparseArray2 = downloadListeners;
                    if (sparseArray2 != null) {
                        synchronized (sparseArray2) {
                            for (int i6 = 0; i6 < downloadListeners.size(); i6++) {
                                IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i6));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                    DownloadInfo downloadInfo2 = downloadInfo;
                    if (downloadInfo2 != null && downloadInfo2.canShowNotification() && (sparseArray = downloadListeners2) != null) {
                        synchronized (sparseArray) {
                            for (int i7 = 0; i7 < downloadListeners2.size(); i7++) {
                                IDownloadListener iDownloadListener2 = (IDownloadListener) downloadListeners2.get(downloadListeners2.keyAt(i7));
                                if (iDownloadListener2 != null) {
                                    iDownloadListener2.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                }
            });
        }
        DownloadInfo b5 = this.f10980k.b(i5);
        if (com.ss.android.socialbase.downloader.i.a.a(65536)) {
            if (b5 != null) {
                b5.setStatus(-4);
            }
        } else if (b5 != null && DownloadStatus.isDownloading(b5.getStatus())) {
            b5.setStatus(-4);
        }
        b(i5, z4);
        return true;
    }

    private void a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != com.ss.android.socialbase.downloader.constants.g.DELAY_RETRY_NONE) {
                    downloadInfo.setStatus(5);
                    downloadInfo.setRetryDelayStatus(com.ss.android.socialbase.downloader.constants.g.DELAY_RETRY_NONE);
                    com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "cancelAlarm");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public synchronized void a(int i5, z zVar) {
        DownloadTask downloadTask = this.f10971b.get(i5);
        if (downloadTask != null) {
            downloadTask.setNotificationEventListener(zVar);
        }
    }

    public synchronized void a(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            boolean b5 = com.ss.android.socialbase.downloader.i.a.a(1048576) ? com.ss.android.socialbase.downloader.i.f.b(com.ss.android.socialbase.downloader.downloader.c.O()) : true;
            for (int i5 = 0; i5 < this.f10973d.size(); i5++) {
                DownloadTask downloadTask = this.f10973d.get(this.f10973d.keyAt(i5));
                if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && (!downloadInfo.isOnlyWifi() || b5)) {
                    downloadInfo.setAutoResumed(true);
                    downloadInfo.setShowNotificationForNetworkResumed(true);
                    a(downloadTask);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public synchronized void a(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4) {
        DownloadTask o5 = o(i5);
        if (o5 == null) {
            o5 = this.f10977h.get(Integer.valueOf(i5));
        }
        if (o5 != null) {
            o5.removeDownloadListener(i6, iDownloadListener, fVar, z4);
        }
    }

    public synchronized void a(int i5, int i6, final IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4, boolean z5) {
        DownloadInfo b5;
        DownloadTask o5 = o(i5);
        if (o5 != null) {
            o5.addDownloadListener(i6, iDownloadListener, fVar, z4);
            final DownloadInfo downloadInfo = o5.getDownloadInfo();
            if (z5 && downloadInfo != null && !a(i5) && (fVar == com.ss.android.socialbase.downloader.constants.f.MAIN || fVar == com.ss.android.socialbase.downloader.constants.f.NOTIFICATION)) {
                if (fVar != com.ss.android.socialbase.downloader.constants.f.NOTIFICATION || downloadInfo.canShowNotification()) {
                    this.f10970a.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.a.6
                        @Override // java.lang.Runnable
                        public void run() {
                            if (iDownloadListener != null) {
                                if (downloadInfo.getStatus() == -3) {
                                    iDownloadListener.onSuccessed(downloadInfo);
                                } else if (downloadInfo.getStatus() == -1) {
                                    iDownloadListener.onFailed(downloadInfo, new BaseException(1000, "try add listener for failed task"));
                                }
                            }
                        }
                    });
                }
            }
        } else if (com.ss.android.socialbase.downloader.i.a.a(32768) && (b5 = this.f10980k.b(i5)) != null && b5.getStatus() != -3) {
            DownloadTask downloadTask = this.f10977h.get(Integer.valueOf(i5));
            if (downloadTask == null) {
                downloadTask = new DownloadTask(b5);
                this.f10977h.put(Integer.valueOf(i5), downloadTask);
            }
            downloadTask.addDownloadListener(i6, iDownloadListener, fVar, z4);
        }
    }

    private void a(int i5, BaseException baseException, DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.constants.f.MAIN);
            SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.constants.f.NOTIFICATION);
            boolean z4 = downloadTask.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification();
            com.ss.android.socialbase.downloader.i.c.a(i5, downloadListeners, true, downloadInfo, baseException);
            com.ss.android.socialbase.downloader.i.c.a(i5, downloadListeners2, z4, downloadInfo, baseException);
        }
    }

    private void a(int i5, int i6) {
        com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "removeTask id: " + i5 + " listener hasCode: " + i6);
        if (i6 == 0) {
            this.f10971b.remove(i5);
            this.f10976g.remove(i5);
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.f10976g.get(i5);
        if (sparseArray != null) {
            sparseArray.remove(i6);
            com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "after downloadTaskWithListenerMap removeTask taskArray.size: " + sparseArray.size());
            if (sparseArray.size() == 0) {
                this.f10971b.remove(i5);
                this.f10976g.remove(i5);
                return;
            }
            return;
        }
        this.f10971b.remove(i5);
    }

    public synchronized void a(int i5, int i6, int i7) {
        if (i7 != -7) {
            if (i7 == -6) {
                this.f10972c.put(i5, this.f10971b.get(i5));
                a(i5, i6);
            } else if (i7 == -4) {
                a(i5, i6);
                p(i5);
            } else if (i7 == -3) {
                this.f10972c.put(i5, this.f10971b.get(i5));
                a(i5, i6);
                p(i5);
            } else if (i7 != -1) {
                if (i7 == 7) {
                    DownloadTask downloadTask = this.f10971b.get(i5);
                    if (downloadTask != null) {
                        if (this.f10974e.get(i5) == null) {
                            this.f10974e.put(i5, downloadTask);
                        }
                        a(i5, i6);
                    }
                    p(i5);
                } else if (i7 == 8) {
                    DownloadTask downloadTask2 = this.f10971b.get(i5);
                    if (downloadTask2 != null && this.f10975f.get(i5) == null) {
                        this.f10975f.put(i5, downloadTask2);
                    }
                    p(i5);
                }
            }
        }
        DownloadTask downloadTask3 = this.f10971b.get(i5);
        if (downloadTask3 != null) {
            if (this.f10973d.get(i5) == null) {
                this.f10973d.put(i5, downloadTask3);
            }
            a(i5, i6);
        }
        p(i5);
    }

    @Override // com.ss.android.socialbase.downloader.h.h.a
    public void a(Message message) {
        int i5 = message.arg1;
        int i6 = message.arg2;
        com.ss.android.socialbase.downloader.c.a.b("AbsDownloadEngine", "handleMsg id: " + i5 + " listener hasCode: " + i6);
        Object obj = message.obj;
        DownloadTask downloadTask = null;
        BaseException baseException = obj instanceof Exception ? (BaseException) obj : null;
        synchronized (this) {
            if (i6 == 0) {
                downloadTask = this.f10971b.get(i5);
            } else {
                SparseArray<DownloadTask> sparseArray = this.f10976g.get(i5);
                if (sparseArray != null) {
                    downloadTask = sparseArray.get(i6);
                }
            }
            if (downloadTask == null) {
                return;
            }
            a(message.what, baseException, downloadTask);
            a(i5, i6, message.what);
        }
    }
}
