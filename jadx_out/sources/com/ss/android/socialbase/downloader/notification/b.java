package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f11236c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f11237e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final long f11238a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Long> f11239b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f11240d = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray<a> f11241f = new SparseArray<>();

    private b() {
    }

    public static b a() {
        if (f11236c == null) {
            synchronized (b.class) {
                if (f11236c == null) {
                    f11236c = new b();
                }
            }
        }
        return f11236c;
    }

    static boolean b(int i5) {
        return i5 == 1 || i5 == 3;
    }

    static boolean c(DownloadInfo downloadInfo) {
        return downloadInfo.isDownloadOverStatus() && b(downloadInfo.getNotificationVisibility());
    }

    void b(DownloadInfo downloadInfo) {
        if (c(downloadInfo)) {
            f(downloadInfo.getId());
        }
    }

    public a d(int i5) {
        a aVar;
        if (i5 == 0) {
            return null;
        }
        synchronized (this.f11241f) {
            aVar = this.f11241f.get(i5);
            if (aVar != null) {
                this.f11241f.remove(i5);
                com.ss.android.socialbase.downloader.c.a.a("removeNotificationId " + i5);
            }
        }
        return aVar;
    }

    public a e(int i5) {
        a aVar;
        if (i5 == 0) {
            return null;
        }
        synchronized (this.f11241f) {
            aVar = this.f11241f.get(i5);
        }
        return aVar;
    }

    public void f(int i5) {
        d(i5);
        if (i5 != 0) {
            a().c(i5);
        }
    }

    public void c(int i5) {
        Context O = c.O();
        if (O == null || i5 == 0) {
            return;
        }
        try {
            Intent intent = new Intent(O, (Class<?>) DownloadNotificationService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i5);
            O.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<a> b() {
        SparseArray<a> sparseArray;
        synchronized (this.f11241f) {
            sparseArray = this.f11241f;
        }
        return sparseArray;
    }

    public void a(int i5) {
        DownloadInfo downloadInfo = Downloader.getInstance(c.O()).getDownloadInfo(i5);
        if (downloadInfo == null) {
            return;
        }
        a(downloadInfo);
        b(downloadInfo);
    }

    void a(DownloadInfo downloadInfo) {
        j y4 = c.y();
        if (y4 != null && downloadInfo.isDownloadOverStatus()) {
            downloadInfo.setNotificationVisibility(3);
            try {
                y4.a(downloadInfo);
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
        }
    }

    public void a(int i5, int i6, Notification notification) {
        Context O = c.O();
        if (O == null || i5 == 0 || notification == null) {
            return;
        }
        if (i6 == 4) {
            synchronized (this.f11239b) {
                Long l5 = this.f11239b.get(Integer.valueOf(i5));
                long currentTimeMillis = System.currentTimeMillis();
                if (l5 != null && Math.abs(currentTimeMillis - l5.longValue()) < 1000) {
                    return;
                } else {
                    this.f11239b.put(Integer.valueOf(i5), Long.valueOf(currentTimeMillis));
                }
            }
        }
        try {
            Intent intent = new Intent(O, (Class<?>) DownloadNotificationService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY");
            intent.putExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", i6);
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i5);
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA", notification);
            O.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (this.f11241f) {
            this.f11241f.put(aVar.a(), aVar);
        }
    }
}
