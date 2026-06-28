package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class r implements Handler.Callback, a.InterfaceC0196a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile r f11045a;

    /* renamed from: i, reason: collision with root package name */
    private static b f11046i;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11050e;

    /* renamed from: f, reason: collision with root package name */
    private long f11051f;

    /* renamed from: h, reason: collision with root package name */
    private ConnectivityManager f11053h;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f11048c = new Handler(Looper.getMainLooper(), this);

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f11049d = new SparseArray<>();

    /* renamed from: g, reason: collision with root package name */
    private int f11052g = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11047b = com.ss.android.socialbase.downloader.downloader.c.O();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f11061a;

        /* renamed from: b, reason: collision with root package name */
        final int f11062b;

        /* renamed from: c, reason: collision with root package name */
        final int f11063c;

        /* renamed from: d, reason: collision with root package name */
        final int f11064d;

        /* renamed from: e, reason: collision with root package name */
        final int f11065e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f11066f;

        /* renamed from: g, reason: collision with root package name */
        final int[] f11067g;

        /* renamed from: h, reason: collision with root package name */
        private int f11068h;

        /* renamed from: i, reason: collision with root package name */
        private int f11069i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f11070j;

        /* renamed from: k, reason: collision with root package name */
        private long f11071k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f11072l;

        a(int i5, int i6, int i7, int i8, int i9, boolean z4, int[] iArr) {
            i8 = i8 < 3000 ? 3000 : i8;
            i9 = i9 < 5000 ? 5000 : i9;
            this.f11061a = i5;
            this.f11062b = i6;
            this.f11063c = i7;
            this.f11064d = i8;
            this.f11065e = i9;
            this.f11066f = z4;
            this.f11067g = iArr;
            this.f11068h = i8;
        }

        void c() {
            this.f11068h = this.f11064d;
        }

        int d() {
            return this.f11068h;
        }

        boolean a(long j5, int i5, int i6, boolean z4) {
            if (!this.f11072l) {
                com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "canRetry: mIsWaitingRetry is false, return false!!!");
                return false;
            }
            if (this.f11062b < i5 || this.f11069i >= this.f11063c) {
                return false;
            }
            if (!this.f11070j || i6 == 2) {
                return z4 || j5 - this.f11071k >= ((long) this.f11064d);
            }
            return false;
        }

        synchronized void b() {
            this.f11069i++;
        }

        synchronized void a() {
            this.f11068h += this.f11065e;
        }

        synchronized void a(long j5) {
            this.f11071k = j5;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(DownloadInfo downloadInfo, long j5, boolean z4, int i5);
    }

    private r() {
        f();
        this.f11050e = com.ss.android.socialbase.downloader.i.f.c();
        com.ss.android.socialbase.downloader.a.a.a().a(this);
    }

    private void f() {
        if (com.ss.android.socialbase.downloader.g.a.c().a("use_network_callback", 0) != 1) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.l().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.r.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (r.this.f11047b != null) {
                        r rVar = r.this;
                        rVar.f11053h = (ConnectivityManager) rVar.f11047b.getApplicationContext().getSystemService("connectivity");
                        r.this.f11053h.registerNetworkCallback(new NetworkRequest.Builder().build(), new ConnectivityManager.NetworkCallback() { // from class: com.ss.android.socialbase.downloader.impls.r.1.1
                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onAvailable(Network network) {
                                com.ss.android.socialbase.downloader.c.a.b("RetryScheduler", "network onAvailable: ");
                                r.this.a(1, true);
                            }
                        });
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g() {
        try {
            if (this.f11053h == null) {
                this.f11053h = (ConnectivityManager) this.f11047b.getApplicationContext().getSystemService("connectivity");
            }
            NetworkInfo activeNetworkInfo = this.f11053h.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() != 1) {
                    return 1;
                }
                return 2;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        boolean z4;
        if (message.what == 0) {
            int i5 = message.arg1;
            if (message.arg2 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            b(i5, z4);
        } else {
            com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "handleMessage, doSchedulerRetry, id = " + message.what);
            a(message.what);
        }
        return true;
    }

    private void b(final int i5, final boolean z4) {
        com.ss.android.socialbase.downloader.downloader.c.l().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.r.2
            @Override // java.lang.Runnable
            public void run() {
                int g5;
                try {
                    if (r.this.f11052g <= 0 || (g5 = r.this.g()) == 0) {
                        return;
                    }
                    com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "doScheduleAllTaskRetry: mWaitingRetryTasksCount = " + r.this.f11052g);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    synchronized (r.this.f11049d) {
                        for (int i6 = 0; i6 < r.this.f11049d.size(); i6++) {
                            a aVar = (a) r.this.f11049d.valueAt(i6);
                            if (aVar != null && aVar.a(currentTimeMillis, i5, g5, z4)) {
                                if (z4) {
                                    aVar.c();
                                }
                                arrayList.add(aVar);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            r.this.a(((a) it.next()).f11061a, g5, false);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    private void c(int i5) {
        synchronized (this.f11049d) {
            this.f11049d.remove(i5);
        }
    }

    private a d(int i5) {
        int[] iArr;
        int i6;
        int i7;
        boolean z4;
        com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(i5);
        boolean z5 = false;
        int a6 = a5.a("retry_schedule", 0);
        JSONObject d5 = a5.d("retry_schedule_config");
        int i8 = 60;
        if (d5 != null) {
            int optInt = d5.optInt("max_count", 60);
            int optInt2 = d5.optInt("interval_sec", 60);
            int optInt3 = d5.optInt("interval_sec_acceleration", 60);
            if (f11046i != null && d5.optInt("use_job_scheduler", 0) == 1) {
                z5 = true;
            }
            iArr = a(d5.optString("allow_error_code"));
            i6 = optInt3;
            z4 = z5;
            i7 = optInt;
            i8 = optInt2;
        } else {
            iArr = null;
            i6 = 60;
            i7 = 60;
            z4 = false;
        }
        return new a(i5, a6, i7, i8 * 1000, i6 * 1000, z4, iArr);
    }

    public void e() {
        a(5, false);
    }

    private a b(int i5) {
        a aVar = this.f11049d.get(i5);
        if (aVar == null) {
            synchronized (this.f11049d) {
                aVar = this.f11049d.get(i5);
                if (aVar == null) {
                    aVar = d(i5);
                }
                this.f11049d.put(i5, aVar);
            }
        }
        return aVar;
    }

    public static r a() {
        if (f11045a == null) {
            synchronized (r.class) {
                if (f11045a == null) {
                    f11045a = new r();
                }
            }
        }
        return f11045a;
    }

    @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
    public void c() {
        a(3, false);
    }

    @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
    public void b() {
        a(4, false);
    }

    public static void a(b bVar) {
        f11046i = bVar;
    }

    public void a(DownloadInfo downloadInfo) {
        if (downloadInfo == null || TextUtils.isEmpty(com.ss.android.socialbase.downloader.constants.e.f10511a) || !com.ss.android.socialbase.downloader.constants.e.f10511a.equals(downloadInfo.getMimeType())) {
            return;
        }
        a(downloadInfo, downloadInfo.isOnlyWifi() || downloadInfo.isPauseReserveOnWifi(), g());
    }

    public void d() {
        a(2, true);
    }

    private void a(DownloadInfo downloadInfo, boolean z4, int i5) {
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException == null) {
            return;
        }
        a b5 = b(downloadInfo.getId());
        if (b5.f11069i > b5.f11063c) {
            com.ss.android.socialbase.downloader.c.a.d("RetryScheduler", "tryStartScheduleRetry, id = " + b5.f11061a + ", mRetryCount = " + b5.f11069i + ", maxCount = " + b5.f11063c);
            return;
        }
        int errorCode = failedException.getErrorCode();
        if (!com.ss.android.socialbase.downloader.i.f.h(failedException) && !com.ss.android.socialbase.downloader.i.f.i(failedException) && (!downloadInfo.statusInPause() || !downloadInfo.isPauseReserveOnWifi())) {
            if (!a(b5, errorCode)) {
                return;
            }
            com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "allow error code, id = " + b5.f11061a + ", error code = " + errorCode);
        }
        b5.f11070j = z4;
        synchronized (this.f11049d) {
            if (!b5.f11072l) {
                b5.f11072l = true;
                this.f11052g++;
            }
        }
        int d5 = b5.d();
        com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "tryStartScheduleRetry: id = " + b5.f11061a + ", delayTimeMills = " + d5 + ", mWaitingRetryTasks = " + this.f11052g);
        if (!b5.f11066f) {
            if (z4) {
                return;
            }
            this.f11048c.removeMessages(downloadInfo.getId());
            this.f11048c.sendEmptyMessageDelayed(downloadInfo.getId(), d5);
            return;
        }
        if (i5 == 0) {
            b5.c();
        }
        b bVar = f11046i;
        if (bVar != null) {
            bVar.a(downloadInfo, d5, z4, i5);
        }
        if (this.f11050e) {
            b5.a(System.currentTimeMillis());
            b5.b();
            b5.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, boolean z4) {
        if (this.f11052g <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (!z4) {
                if (currentTimeMillis - this.f11051f < 10000) {
                    return;
                }
            }
            this.f11051f = currentTimeMillis;
            com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "scheduleAllTaskRetry, level = [" + i5 + "], force = [" + z4 + "]");
            if (z4) {
                this.f11048c.removeMessages(0);
            }
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.arg1 = i5;
            obtain.arg2 = z4 ? 1 : 0;
            this.f11048c.sendMessageDelayed(obtain, 2000L);
        }
    }

    public void a(final int i5) {
        com.ss.android.socialbase.downloader.downloader.c.l().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.r.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    r rVar = r.this;
                    rVar.a(i5, rVar.g(), true);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, int i6, boolean z4) {
        com.ss.android.socialbase.downloader.downloader.r reserveWifiStatusListener;
        boolean z5;
        Context context = this.f11047b;
        if (context == null) {
            return;
        }
        synchronized (this.f11049d) {
            a aVar = this.f11049d.get(i5);
            if (aVar == null) {
                return;
            }
            boolean z6 = true;
            if (aVar.f11072l) {
                aVar.f11072l = false;
                int i7 = this.f11052g - 1;
                this.f11052g = i7;
                if (i7 < 0) {
                    this.f11052g = 0;
                }
            }
            com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "doSchedulerRetryInSubThread: downloadId = " + i5 + ", retryCount = " + aVar.f11069i + ", mWaitingRetryTasksCount = " + this.f11052g);
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i5);
            if (downloadInfo == null) {
                c(i5);
                return;
            }
            com.ss.android.socialbase.downloader.c.a.e("RetryScheduler", "doSchedulerRetryInSubThread，id:" + i5);
            int realStatus = downloadInfo.getRealStatus();
            if (realStatus != -3 && realStatus != -4) {
                if (realStatus == -5 || (realStatus == -2 && downloadInfo.isPauseReserveOnWifi())) {
                    if (realStatus == -2 && (reserveWifiStatusListener = Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).getReserveWifiStatusListener()) != null) {
                        reserveWifiStatusListener.a(downloadInfo, 4, 3);
                    }
                    com.ss.android.socialbase.downloader.downloader.l x4 = com.ss.android.socialbase.downloader.downloader.c.x();
                    if (x4 != null) {
                        x4.a(Collections.singletonList(downloadInfo), 3);
                    }
                    c(i5);
                    return;
                }
                if (realStatus != -1) {
                    return;
                }
                if (i6 != 0) {
                    z5 = true;
                } else if (!aVar.f11066f) {
                    return;
                } else {
                    z5 = false;
                }
                BaseException failedException = downloadInfo.getFailedException();
                if (z5 && com.ss.android.socialbase.downloader.i.f.h(failedException)) {
                    z5 = a(downloadInfo, failedException);
                }
                aVar.b();
                if (z5) {
                    com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "doSchedulerRetry: restart task, ****** id = " + aVar.f11061a);
                    aVar.a(System.currentTimeMillis());
                    if (z4) {
                        aVar.a();
                    }
                    downloadInfo.setRetryScheduleCount(aVar.f11069i);
                    if (downloadInfo.getStatus() == -1) {
                        Downloader.getInstance(context).restart(downloadInfo.getId());
                        return;
                    }
                    return;
                }
                if (z4) {
                    aVar.a();
                }
                if (!downloadInfo.isOnlyWifi() && !downloadInfo.isPauseReserveOnWifi()) {
                    z6 = false;
                }
                a(downloadInfo, z6, i6);
                return;
            }
            c(i5);
        }
    }

    private boolean a(a aVar, int i5) {
        int[] iArr = aVar.f11067g;
        if (iArr != null && iArr.length != 0) {
            for (int i6 : iArr) {
                if (i6 == i5) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length <= 0) {
                return null;
            }
            int[] iArr = new int[split.length];
            for (int i5 = 0; i5 < split.length; i5++) {
                iArr[i5] = Integer.parseInt(split[i5]);
            }
            return iArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean a(DownloadInfo downloadInfo, BaseException baseException) {
        long j5;
        long totalBytes;
        try {
            j5 = com.ss.android.socialbase.downloader.i.f.d(downloadInfo.getTempPath());
        } catch (BaseException e5) {
            e5.printStackTrace();
            j5 = 0;
        }
        if (baseException instanceof com.ss.android.socialbase.downloader.exception.d) {
            totalBytes = ((com.ss.android.socialbase.downloader.exception.d) baseException).b();
        } else {
            totalBytes = downloadInfo.getTotalBytes() - downloadInfo.getCurBytes();
        }
        if (j5 < totalBytes) {
            com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId());
            if (a5.a("space_fill_part_download", 0) == 1) {
                if (j5 > 0) {
                    int a6 = a5.a("space_fill_min_keep_mb", 100);
                    if (a6 > 0) {
                        long j6 = j5 - (a6 * 1048576);
                        com.ss.android.socialbase.downloader.c.a.c("RetryScheduler", "retry schedule: available = " + com.ss.android.socialbase.downloader.i.f.a(j5) + "MB, minKeep = " + a6 + "MB, canDownload = " + com.ss.android.socialbase.downloader.i.f.a(j6) + "MB");
                        if (j6 <= 0) {
                            com.ss.android.socialbase.downloader.c.a.d("RetryScheduler", "doSchedulerRetryInSubThread: canDownload <= 0 , canRetry = false !!!!");
                            return false;
                        }
                    }
                } else if (a5.a("download_when_space_negative", 0) != 1) {
                }
            }
            return false;
        }
        return true;
    }
}
