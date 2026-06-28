package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ai;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10654a = "f";

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10655b;

    /* renamed from: c, reason: collision with root package name */
    private DownloadInfo f10656c;

    /* renamed from: d, reason: collision with root package name */
    private final j f10657d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f10658e;

    /* renamed from: f, reason: collision with root package name */
    private DownloadTask f10659f;

    /* renamed from: g, reason: collision with root package name */
    private SparseArray<IDownloadListener> f10660g;

    /* renamed from: h, reason: collision with root package name */
    private SparseArray<IDownloadListener> f10661h;

    /* renamed from: i, reason: collision with root package name */
    private SparseArray<IDownloadListener> f10662i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10663j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile long f10664k = 0;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicLong f10665l = new AtomicLong();

    /* renamed from: m, reason: collision with root package name */
    private boolean f10666m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f10667n;

    /* renamed from: o, reason: collision with root package name */
    private long f10668o;

    /* renamed from: p, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.depend.n f10669p;

    /* renamed from: q, reason: collision with root package name */
    private x f10670q;

    public f(DownloadTask downloadTask, Handler handler) {
        this.f10659f = downloadTask;
        j();
        this.f10658e = handler;
        this.f10657d = c.y();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            this.f10655b = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("fix_start_with_file_exist_update_error");
        } else {
            this.f10655b = false;
        }
    }

    private void j() {
        DownloadTask downloadTask = this.f10659f;
        if (downloadTask != null) {
            this.f10656c = downloadTask.getDownloadInfo();
            this.f10660g = this.f10659f.getDownloadListeners(com.ss.android.socialbase.downloader.constants.f.MAIN);
            this.f10662i = this.f10659f.getDownloadListeners(com.ss.android.socialbase.downloader.constants.f.NOTIFICATION);
            this.f10661h = this.f10659f.getDownloadListeners(com.ss.android.socialbase.downloader.constants.f.SUB);
            this.f10669p = this.f10659f.getDepend();
            this.f10670q = this.f10659f.getMonitorDepend();
        }
    }

    private void k() {
        ExecutorService l5 = c.l();
        if (l5 != null) {
            l5.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.f10657d.i(f.this.f10656c.getId());
                    f.this.a(1, (BaseException) null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            com.ss.android.socialbase.downloader.c.a.b(f10654a, "saveFileAsTargetName onSuccess");
            try {
                m();
                this.f10656c.setFirstSuccess(false);
                this.f10656c.setSuccessByCache(false);
                a(-3, (BaseException) null);
                this.f10657d.c(this.f10656c.getId(), this.f10656c.getTotalBytes());
                this.f10657d.d(this.f10656c.getId());
                this.f10657d.m(this.f10656c.getId());
            } catch (BaseException e5) {
                a(e5);
            }
        } catch (Throwable th) {
            a(new BaseException(PointerIconCompat.TYPE_TEXT, com.ss.android.socialbase.downloader.i.f.b(th, "onCompleted")));
        }
    }

    private void m() throws BaseException {
        List<com.ss.android.socialbase.downloader.depend.m> downloadCompleteHandlers = this.f10659f.getDownloadCompleteHandlers();
        if (!downloadCompleteHandlers.isEmpty()) {
            DownloadInfo downloadInfo = this.f10656c;
            a(11, (BaseException) null);
            this.f10657d.a(downloadInfo);
            for (com.ss.android.socialbase.downloader.depend.m mVar : downloadCompleteHandlers) {
                try {
                    if (mVar.b(downloadInfo)) {
                        mVar.a(downloadInfo);
                        this.f10657d.a(downloadInfo);
                    }
                } catch (BaseException e5) {
                    throw e5;
                } catch (Throwable th) {
                    throw new BaseException(1071, th);
                }
            }
        }
    }

    public void d() {
        this.f10656c.setStatus(-2);
        try {
            this.f10657d.d(this.f10656c.getId(), this.f10656c.getCurBytes());
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        a(-2, (BaseException) null);
    }

    public void e() {
        this.f10656c.setStatus(-7);
        try {
            this.f10657d.j(this.f10656c.getId());
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        a(-7, (BaseException) null);
    }

    public void f() {
        this.f10656c.setFirstDownload(false);
        if (!this.f10656c.isIgnoreDataVerify() && this.f10656c.getCurBytes() != this.f10656c.getTotalBytes()) {
            com.ss.android.socialbase.downloader.c.a.b(f10654a, this.f10656c.getErrorBytesLog());
            a(new com.ss.android.socialbase.downloader.exception.f(1027, "current bytes is not equals to total bytes, bytes changed with process : " + this.f10656c.getByteInvalidRetryStatus()));
            return;
        }
        if (this.f10656c.getCurBytes() <= 0) {
            com.ss.android.socialbase.downloader.c.a.b(f10654a, this.f10656c.getErrorBytesLog());
            a(new com.ss.android.socialbase.downloader.exception.f(1026, "curBytes is 0, bytes changed with process : " + this.f10656c.getByteInvalidRetryStatus()));
            return;
        }
        if (!this.f10656c.isIgnoreDataVerify() && this.f10656c.getTotalBytes() <= 0) {
            com.ss.android.socialbase.downloader.c.a.b(f10654a, this.f10656c.getErrorBytesLog());
            a(new com.ss.android.socialbase.downloader.exception.f(1044, "TotalBytes is 0, bytes changed with process : " + this.f10656c.getByteInvalidRetryStatus()));
            return;
        }
        com.ss.android.socialbase.downloader.c.a.b(f10654a, "" + this.f10656c.getName() + " onCompleted start save file as target name");
        x xVar = this.f10670q;
        DownloadTask downloadTask = this.f10659f;
        if (downloadTask != null) {
            xVar = downloadTask.getMonitorDepend();
        }
        com.ss.android.socialbase.downloader.i.f.a(this.f10656c, xVar, new ai() { // from class: com.ss.android.socialbase.downloader.downloader.f.2
            @Override // com.ss.android.socialbase.downloader.depend.ai
            public void a() {
                f.this.l();
            }

            @Override // com.ss.android.socialbase.downloader.depend.ai
            public void a(BaseException baseException) {
                String str = f.f10654a;
                StringBuilder sb = new StringBuilder();
                sb.append("saveFileAsTargetName onFailed : ");
                sb.append(baseException != null ? baseException.getErrorMessage() : "");
                com.ss.android.socialbase.downloader.c.a.b(str, sb.toString());
                f.this.a(baseException);
            }
        });
    }

    public void g() throws BaseException {
        if (this.f10655b) {
            m();
            com.ss.android.socialbase.downloader.c.a.b(f10654a, "onCompleteForFileExist");
            this.f10656c.setSuccessByCache(true);
            a(-3, (BaseException) null);
            this.f10657d.c(this.f10656c.getId(), this.f10656c.getTotalBytes());
            this.f10657d.d(this.f10656c.getId());
            this.f10657d.a(this.f10656c);
            this.f10657d.m(this.f10656c.getId());
            return;
        }
        m();
        com.ss.android.socialbase.downloader.c.a.b(f10654a, "onCompleteForFileExist");
        this.f10656c.setSuccessByCache(true);
        a(-3, (BaseException) null);
        this.f10657d.c(this.f10656c.getId(), this.f10656c.getTotalBytes());
        this.f10657d.d(this.f10656c.getId());
        this.f10657d.m(this.f10656c.getId());
    }

    public void h() {
        this.f10656c.setStatus(8);
        this.f10656c.setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_WAITING);
        com.ss.android.socialbase.downloader.impls.a D = c.D();
        if (D != null) {
            D.a(this.f10656c.getId(), this.f10659f.getHashCodeForSameTask(), 8);
        }
    }

    public void b() {
        if (this.f10656c.canSkipStatusHandler()) {
            this.f10656c.changeSkipStatus();
            return;
        }
        this.f10657d.g(this.f10656c.getId());
        if (this.f10656c.isFirstDownload()) {
            a(6, (BaseException) null);
        }
        a(2, (BaseException) null);
    }

    public void c() {
        a(-4, (BaseException) null);
    }

    private BaseException c(BaseException baseException) {
        Context O;
        if (com.ss.android.socialbase.downloader.g.a.a(this.f10656c.getId()).a("download_failed_check_net", 1) != 1 || !com.ss.android.socialbase.downloader.i.f.i(baseException) || (O = c.O()) == null || com.ss.android.socialbase.downloader.i.f.c(O)) {
            return baseException;
        }
        return new BaseException(this.f10656c.isOnlyWifi() ? PointerIconCompat.TYPE_ALL_SCROLL : 1049, baseException.getErrorMessage());
    }

    public void a() {
        if (this.f10656c.canSkipStatusHandler()) {
            return;
        }
        this.f10656c.setStatus(1);
        k();
    }

    public void a(long j5, String str, String str2) {
        this.f10656c.setTotalBytes(j5);
        this.f10656c.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f10656c.getName())) {
            this.f10656c.setName(str2);
        }
        try {
            this.f10657d.a(this.f10656c.getId(), j5, str, str2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        a(3, (BaseException) null);
        this.f10668o = this.f10656c.getMinByteIntervalForPostToMainThread(j5);
        this.f10667n = this.f10656c.getMinProgressTimeMsInterval();
        this.f10663j = true;
        com.ss.android.socialbase.downloader.impls.r.a().e();
    }

    private void b(BaseException baseException) {
        Log.d(f10654a, "handleError::" + baseException + " \r\n" + Log.getStackTraceString(new Throwable()));
        if (baseException != null && baseException.getCause() != null && (baseException.getCause() instanceof SQLiteFullException)) {
            try {
                this.f10657d.f(this.f10656c.getId());
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
        } else {
            try {
                try {
                    this.f10657d.b(this.f10656c.getId(), this.f10656c.getCurBytes());
                } catch (SQLiteException unused) {
                    this.f10657d.f(this.f10656c.getId());
                }
            } catch (SQLiteException e6) {
                e6.printStackTrace();
            }
        }
        BaseException c5 = c(baseException);
        this.f10656c.setFailedException(c5);
        a(c5 instanceof com.ss.android.socialbase.downloader.exception.e ? -2 : -1, c5);
        if (com.ss.android.socialbase.downloader.g.a.a(this.f10656c.getId()).a("retry_schedule", 0) > 0) {
            com.ss.android.socialbase.downloader.impls.r.a().a(this.f10656c);
        }
    }

    public boolean a(long j5) {
        this.f10665l.addAndGet(j5);
        this.f10656c.increaseCurBytes(j5);
        long uptimeMillis = SystemClock.uptimeMillis();
        return a(uptimeMillis, b(uptimeMillis));
    }

    private boolean b(long j5) {
        boolean z4 = true;
        if (!this.f10666m) {
            this.f10666m = true;
            return true;
        }
        long j6 = j5 - this.f10664k;
        if (this.f10665l.get() < this.f10668o && j6 < this.f10667n) {
            z4 = false;
        }
        if (z4) {
            this.f10664k = j5;
            this.f10665l.set(0L);
        }
        return z4;
    }

    public void a(BaseException baseException, boolean z4) {
        this.f10656c.setFirstDownload(false);
        this.f10665l.set(0L);
        b(baseException, z4);
    }

    public void a(com.ss.android.socialbase.downloader.model.b bVar, BaseException baseException, boolean z4) {
        this.f10656c.setFirstDownload(false);
        this.f10665l.set(0L);
        this.f10657d.h(this.f10656c.getId());
        a(z4 ? 10 : 9, baseException, true);
    }

    private void b(BaseException baseException, boolean z4) {
        this.f10657d.h(this.f10656c.getId());
        a(z4 ? 7 : 5, baseException);
    }

    public void a(BaseException baseException) {
        this.f10656c.setFirstDownload(false);
        b(baseException);
    }

    public void a(String str) throws BaseException {
        com.ss.android.socialbase.downloader.c.a.b(f10654a, "onCompleteForFileExist existTargetFileName is " + str + " but curName is " + this.f10656c.getName());
        if (this.f10655b) {
            com.ss.android.socialbase.downloader.i.f.a(this.f10656c, str);
            m();
            this.f10656c.setSuccessByCache(true);
            a(-3, (BaseException) null);
            this.f10657d.a(this.f10656c);
            return;
        }
        this.f10657d.a(this.f10656c);
        com.ss.android.socialbase.downloader.i.f.a(this.f10656c, str);
        this.f10656c.setSuccessByCache(true);
        m();
        a(-3, (BaseException) null);
    }

    private boolean a(long j5, boolean z4) {
        boolean z5 = false;
        if (this.f10656c.getCurBytes() == this.f10656c.getTotalBytes()) {
            try {
                this.f10657d.a(this.f10656c.getId(), this.f10656c.getCurBytes());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return false;
        }
        if (this.f10663j) {
            this.f10663j = false;
            this.f10656c.setStatus(4);
        }
        if (this.f10656c.isNeedPostProgress() && z4) {
            z5 = true;
        }
        a(4, (BaseException) null, z5);
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, BaseException baseException) {
        a(i5, baseException, true);
    }

    private void a(int i5, BaseException baseException, boolean z4) {
        SparseArray<IDownloadListener> sparseArray;
        SparseArray<IDownloadListener> sparseArray2;
        int status = this.f10656c.getStatus();
        if (status == -3 && i5 == 4) {
            return;
        }
        j();
        if (i5 != 4 && DownloadStatus.isRealTimeUploadStatus(i5)) {
            this.f10656c.updateRealDownloadTime(false);
            if (DownloadStatus.isTimeUploadStatus(i5)) {
                this.f10656c.updateDownloadTime();
            }
        }
        if (!this.f10656c.isAddListenerToSameTask()) {
            com.ss.android.socialbase.downloader.d.a.a(this.f10659f, baseException, i5);
        }
        if (i5 == 6) {
            this.f10656c.setStatus(2);
        } else if (i5 == -6) {
            this.f10656c.setStatus(-3);
        } else {
            this.f10656c.setStatus(i5);
        }
        if (status == -3 || status == -1) {
            if (this.f10656c.getRetryDelayStatus() == com.ss.android.socialbase.downloader.constants.g.DELAY_RETRY_DOWNLOADING) {
                this.f10656c.setRetryDelayStatus(com.ss.android.socialbase.downloader.constants.g.DELAY_RETRY_DOWNLOADED);
            }
            if (this.f10656c.getAsyncHandleStatus() == com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_DOWNLOADING) {
                this.f10656c.setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_DOWNLOADED);
            }
            if (this.f10656c.getByteInvalidRetryStatus() == com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_DOWNLOADING) {
                this.f10656c.setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_DOWNLOADED);
            }
        }
        com.ss.android.socialbase.downloader.i.c.a(i5, this.f10661h, true, this.f10656c, baseException);
        if (i5 == -4) {
            return;
        }
        if (z4 && this.f10658e != null && (((sparseArray = this.f10660g) != null && sparseArray.size() > 0) || ((sparseArray2 = this.f10662i) != null && sparseArray2.size() > 0 && (this.f10656c.canShowNotification() || this.f10656c.isAutoInstallWithoutNotification())))) {
            this.f10658e.obtainMessage(i5, this.f10656c.getId(), this.f10659f.getHashCodeForSameTask(), baseException).sendToTarget();
            return;
        }
        com.ss.android.socialbase.downloader.impls.a D = c.D();
        if (D != null) {
            D.a(this.f10656c.getId(), this.f10659f.getHashCodeForSameTask(), i5);
        }
    }
}
