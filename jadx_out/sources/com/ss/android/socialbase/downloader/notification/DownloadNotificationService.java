package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.SparseArray;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.ss.android.socialbase.downloader.constants.e;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.downloader.m;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.h.g;
import com.ss.android.socialbase.downloader.i.f;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class DownloadNotificationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11206a = "DownloadNotificationService";

    /* renamed from: b, reason: collision with root package name */
    private static int f11207b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f11208c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f11209d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f11210e = false;

    /* renamed from: f, reason: collision with root package name */
    private static volatile long f11211f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static volatile long f11212g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f11213h = false;

    /* renamed from: i, reason: collision with root package name */
    private static long f11214i = 900;

    /* renamed from: j, reason: collision with root package name */
    private g f11215j;

    /* renamed from: k, reason: collision with root package name */
    private final SparseArray<Notification> f11216k = new SparseArray<>(2);

    private void d() {
        if (this.f11215j == null) {
            g gVar = new g("DownloaderNotifyThread");
            this.f11215j = gVar;
            gVar.a();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d();
        c.a(this);
        com.ss.android.socialbase.downloader.g.a c5 = com.ss.android.socialbase.downloader.g.a.c();
        int a5 = c5.a("download_service_foreground", 0);
        if ((a5 == 1 || a5 == 3) && f11207b == -1) {
            f11207b = 0;
        }
        if ((a5 == 2 || a5 == 3) && f11208c == -1) {
            f11208c = 0;
        }
        f11210e = c5.b("non_going_notification_foreground", false);
        f11213h = c5.b("notify_too_fast", false);
        long a6 = c5.a("notification_time_window", 900L);
        f11214i = a6;
        if (a6 < 0 || a6 > 1200) {
            f11214i = 900L;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        g gVar = this.f11215j;
        if (gVar != null) {
            try {
                gVar.b();
            } catch (Throwable unused) {
            }
            this.f11215j = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i5, int i6) {
        a(intent);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001f, code lost:
    
        if (com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11207b == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
            r5 = this;
            boolean r0 = r5.a(r7, r8)
            if (r0 == 0) goto L85
            com.ss.android.socialbase.downloader.downloader.d r0 = com.ss.android.socialbase.downloader.downloader.d.a()     // Catch: java.lang.Throwable -> L80
            int r0 = r0.a(r7)     // Catch: java.lang.Throwable -> L80
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1a
            boolean r0 = com.ss.android.socialbase.downloader.i.f.c()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 != 0) goto L23
            int r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11207b     // Catch: java.lang.Throwable -> L80
            if (r3 != 0) goto L23
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r0 == 0) goto L2a
            int r3 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11208c     // Catch: java.lang.Throwable -> L80
            if (r3 != 0) goto L2a
            goto L21
        L2a:
            if (r1 == 0) goto L9a
            com.ss.android.socialbase.downloader.downloader.d r1 = com.ss.android.socialbase.downloader.downloader.d.a()     // Catch: java.lang.Throwable -> L80
            com.ss.android.socialbase.downloader.downloader.m r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L80
            boolean r2 = r1.h()     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L69
            boolean r2 = r1.b()     // Catch: java.lang.Throwable -> L80
            if (r2 != 0) goto L69
            java.lang.String r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11206a     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r3.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "doNotify, startForeground, ======== id = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L80
            r3.append(r7)     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = ", isIndependentProcess = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L80
            r3.append(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L80
            com.ss.android.socialbase.downloader.c.a.c(r2, r3)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L63
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11208c = r7     // Catch: java.lang.Throwable -> L80
            goto L65
        L63:
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11207b = r7     // Catch: java.lang.Throwable -> L80
        L65:
            r1.a(r7, r8)     // Catch: java.lang.Throwable -> L80
            goto L9a
        L69:
            java.lang.String r1 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11206a     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r2.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = "doNotify: canStartForeground = true, but proxy can not startForeground, isIndependentProcess = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L80
            r2.append(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L80
            com.ss.android.socialbase.downloader.c.a.c(r1, r0)     // Catch: java.lang.Throwable -> L80
            goto L9a
        L80:
            r0 = move-exception
            r0.printStackTrace()
            goto L9a
        L85:
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11207b
            if (r0 == r7) goto L8d
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11208c
            if (r0 != r7) goto L9a
        L8d:
            boolean r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11210e
            if (r0 == 0) goto L9a
            int r0 = r8.flags
            r0 = r0 & 2
            if (r0 != 0) goto L9a
            r5.b(r6, r7)
        L9a:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La9
            long r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11211f     // Catch: java.lang.Throwable -> La9
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto La6
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f11211f = r0     // Catch: java.lang.Throwable -> La9
        La6:
            r6.notify(r7, r8)     // Catch: java.lang.Throwable -> La9
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.b(android.app.NotificationManager, int, android.app.Notification):void");
    }

    private void a(final Intent intent) {
        g gVar;
        if (intent == null) {
            return;
        }
        final String action = intent.getAction();
        if (TextUtils.isEmpty(action) || (gVar = this.f11215j) == null) {
            return;
        }
        gVar.a(new Runnable() { // from class: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.1
            @Override // java.lang.Runnable
            public void run() {
                ConnectivityManager connectivityManager;
                NetworkInfo activeNetworkInfo;
                long j5;
                final NotificationManager notificationManager = (NotificationManager) DownloadNotificationService.this.getSystemService(ServiceManagerNative.NOTIFICATION);
                final int intExtra = intent.getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
                if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
                    final Notification notification = (Notification) intent.getParcelableExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA");
                    int intExtra2 = intent.getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
                    if (intExtra != 0 && notification != null && notificationManager != null) {
                        if (intExtra2 == 4) {
                            if (!Downloader.getInstance(c.O()).isDownloading(intExtra)) {
                                return;
                            }
                            DownloadInfo downloadInfo = Downloader.getInstance(c.O()).getDownloadInfo(intExtra);
                            if (DownloadNotificationService.f11213h) {
                                if (downloadInfo != null && downloadInfo.canNotifyProgress() && System.currentTimeMillis() - DownloadNotificationService.f11212g > DownloadNotificationService.f11214i) {
                                    DownloadNotificationService.this.b(notificationManager, intExtra, notification);
                                    downloadInfo.setLastNotifyProgressTime();
                                    return;
                                }
                                return;
                            }
                            if (downloadInfo != null && downloadInfo.canNotifyProgress()) {
                                DownloadNotificationService.this.b(notificationManager, intExtra, notification);
                                downloadInfo.setLastNotifyProgressTime();
                                return;
                            }
                            return;
                        }
                        if (intExtra2 != -2 && intExtra2 != -3) {
                            if (DownloadNotificationService.f11213h) {
                                DownloadNotificationService.this.a(notificationManager, intExtra, notification);
                                return;
                            } else {
                                DownloadNotificationService.this.b(notificationManager, intExtra, notification);
                                return;
                            }
                        }
                        if (DownloadNotificationService.f11213h) {
                            DownloadNotificationService.this.a(notificationManager, intExtra, notification);
                            return;
                        }
                        if (DownloadNotificationService.this.f11215j != null) {
                            g gVar2 = DownloadNotificationService.this.f11215j;
                            Runnable runnable = new Runnable() { // from class: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    DownloadNotificationService.this.b(notificationManager, intExtra, notification);
                                }
                            };
                            if (intExtra2 == -2) {
                                j5 = 50;
                            } else {
                                j5 = 200;
                            }
                            gVar2.a(runnable, j5);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
                    if (intExtra != 0) {
                        DownloadNotificationService.this.b(notificationManager, intExtra);
                        return;
                    }
                    return;
                }
                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    try {
                        if (f.a((Context) DownloadNotificationService.this, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) DownloadNotificationService.this.getApplicationContext().getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                            ArrayList arrayList = new ArrayList();
                            if (!TextUtils.isEmpty(e.f10511a)) {
                                arrayList.add(e.f10511a);
                            }
                            arrayList.add("mime_type_plg");
                            Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                            if (applicationContext != null) {
                                Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    try {
                        Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final NotificationManager notificationManager, final int i5, Notification notification) {
        synchronized (this.f11216k) {
            int indexOfKey = this.f11216k.indexOfKey(i5);
            if (indexOfKey >= 0 && indexOfKey < this.f11216k.size()) {
                this.f11216k.setValueAt(indexOfKey, notification);
                return;
            }
            long currentTimeMillis = f11214i - (System.currentTimeMillis() - f11211f);
            if (currentTimeMillis <= 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 20000) {
                currentTimeMillis = 20000;
            }
            long currentTimeMillis2 = System.currentTimeMillis() + currentTimeMillis;
            f11212g = currentTimeMillis2;
            f11211f = currentTimeMillis2;
            if (currentTimeMillis <= 0) {
                b(notificationManager, i5, notification);
            } else if (this.f11215j != null) {
                synchronized (this.f11216k) {
                    this.f11216k.put(i5, notification);
                }
                this.f11215j.a(new Runnable() { // from class: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DownloadNotificationService.this.a(notificationManager, i5);
                    }
                }, currentTimeMillis);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NotificationManager notificationManager, int i5) {
        Notification notification;
        synchronized (this.f11216k) {
            notification = this.f11216k.get(i5);
            this.f11216k.remove(i5);
        }
        if (notification != null) {
            b(notificationManager, i5, notification);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NotificationManager notificationManager, int i5) {
        boolean z4;
        a aVar;
        int a5;
        int i6 = f11207b;
        if (i6 != i5 && f11208c != i5) {
            try {
                notificationManager.cancel(i5);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        boolean z5 = true;
        if (i6 == i5) {
            f11207b = 0;
            z4 = false;
        } else {
            f11208c = 0;
            z4 = true;
        }
        try {
            m c5 = d.a().c(i5);
            if (!c5.b()) {
                f11209d = false;
                com.ss.android.socialbase.downloader.c.a.d(f11206a, "try to stopForeground when is not Foreground, id = " + i5 + ", isIndependentProcess = " + z4);
            }
            com.ss.android.socialbase.downloader.c.a.c(f11206a, "doCancel, ========== stopForeground id = " + i5 + ", isIndependentProcess = " + z4);
            c5.a(false, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            notificationManager.cancel(i5);
        } catch (Throwable unused2) {
        }
        if (f11209d) {
            try {
                SparseArray<a> b5 = b.a().b();
                if (b5 != null) {
                    for (int size = b5.size() - 1; size >= 0; size--) {
                        aVar = b5.valueAt(size);
                        if (aVar != null && (a5 = aVar.a()) != i5 && a5 != f11207b && a5 != f11208c && aVar.h()) {
                            if ((d.a().a(aVar.a()) == 1 && !f.c()) == z4) {
                                break;
                            }
                        }
                    }
                }
                aVar = null;
                if (aVar != null) {
                    int a6 = aVar.a();
                    try {
                        notificationManager.cancel(a6);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    if (Downloader.getInstance(this).getStatus(a6) != 1) {
                        z5 = false;
                    }
                    com.ss.android.socialbase.downloader.c.a.c(f11206a, "doCancel, updateNotification id = " + a6);
                    aVar.a((BaseException) null, z5);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }

    private boolean a(int i5, Notification notification) {
        int i6;
        int i7;
        String channelId;
        if (!f11209d || (i6 = f11207b) == i5 || (i7 = f11208c) == i5) {
            return false;
        }
        if (i6 != 0 && i7 != 0) {
            return false;
        }
        if (f11210e && (notification.flags & 2) == 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        channelId = notification.getChannelId();
        return !TextUtils.isEmpty(channelId);
    }
}
