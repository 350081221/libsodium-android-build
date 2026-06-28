package com.ss.android.socialbase.appdownloader.e;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.RemoteViews;
import com.ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.ss.android.socialbase.appdownloader.e;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public class a extends com.ss.android.socialbase.downloader.notification.a {

    /* renamed from: b, reason: collision with root package name */
    private final Context f10266b;

    /* renamed from: c, reason: collision with root package name */
    private final Resources f10267c;

    /* renamed from: d, reason: collision with root package name */
    private String f10268d;

    /* renamed from: e, reason: collision with root package name */
    private String f10269e;

    /* renamed from: f, reason: collision with root package name */
    private String f10270f;

    public a(Context context, int i5, String str, String str2, String str3, String str4) {
        super(i5, str);
        this.f10269e = str2;
        this.f10268d = str3;
        this.f10270f = str4;
        Context applicationContext = context.getApplicationContext();
        this.f10266b = applicationContext;
        this.f10267c = applicationContext.getResources();
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x042a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.Notification b(com.ss.android.socialbase.downloader.exception.BaseException r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.e.a.b(com.ss.android.socialbase.downloader.exception.BaseException, boolean):android.app.Notification");
    }

    private RemoteViews i() {
        RemoteViews remoteViews = new RemoteViews(this.f10266b.getPackageName(), e.a());
        try {
            if (com.ss.android.socialbase.appdownloader.c.a(this.f10266b)) {
                remoteViews.setInt(e.f(), "setBackgroundColor", this.f10266b.getResources().getColor(e.r()));
            }
        } catch (Throwable unused) {
        }
        return remoteViews;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0044
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private androidx.core.app.NotificationCompat.Builder j() {
        /*
            r3 = this;
            com.ss.android.socialbase.appdownloader.d r0 = com.ss.android.socialbase.appdownloader.d.j()
            java.lang.String r0 = r0.i()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L16
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r1 = r3.f10266b
            r0.<init>(r1)
            goto L4b
        L16:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L22
            android.content.Context r0 = r3.f10266b
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.c.b(r0)
        L22:
            com.ss.android.socialbase.appdownloader.d r1 = com.ss.android.socialbase.appdownloader.d.j()     // Catch: java.lang.NoSuchMethodError -> L44
            com.ss.android.socialbase.appdownloader.c.m r1 = r1.m()     // Catch: java.lang.NoSuchMethodError -> L44
            if (r1 == 0) goto L3b
            com.ss.android.socialbase.appdownloader.d r1 = com.ss.android.socialbase.appdownloader.d.j()     // Catch: java.lang.NoSuchMethodError -> L44
            com.ss.android.socialbase.appdownloader.c.m r1 = r1.m()     // Catch: java.lang.NoSuchMethodError -> L44
            android.content.Context r2 = r3.f10266b     // Catch: java.lang.NoSuchMethodError -> L44
            androidx.core.app.NotificationCompat$Builder r0 = r1.a(r2, r0)     // Catch: java.lang.NoSuchMethodError -> L44
            goto L4b
        L3b:
            androidx.core.app.NotificationCompat$Builder r1 = new androidx.core.app.NotificationCompat$Builder     // Catch: java.lang.NoSuchMethodError -> L44
            android.content.Context r2 = r3.f10266b     // Catch: java.lang.NoSuchMethodError -> L44
            r1.<init>(r2, r0)     // Catch: java.lang.NoSuchMethodError -> L44
            r0 = r1
            goto L4b
        L44:
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r1 = r3.f10266b
            r0.<init>(r1)
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.e.a.j():androidx.core.app.NotificationCompat$Builder");
    }

    @Override // com.ss.android.socialbase.downloader.notification.a
    public void a(DownloadInfo downloadInfo) {
        super.a(downloadInfo);
        this.f10269e = downloadInfo.getSavePath();
        this.f10268d = downloadInfo.getName();
        this.f10270f = downloadInfo.getExtra();
    }

    @Override // com.ss.android.socialbase.downloader.notification.a
    public void a(BaseException baseException, boolean z4) {
        if (this.f10266b == null) {
            return;
        }
        try {
            Notification b5 = b(baseException, z4);
            this.f11227a = b5;
            a(b5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean a(BaseException baseException, com.ss.android.socialbase.downloader.g.a aVar, DownloadInfo downloadInfo) {
        if (baseException != null) {
            return (baseException.getErrorCode() == 1013 || baseException.getErrorCode() == 1049) && downloadInfo != null && "application/vnd.android.package-archive".contains(downloadInfo.getMimeType()) && aVar.a("notification_text_opt", 0) == 1;
        }
        return false;
    }

    private int a(int i5, int i6) {
        if (com.ss.android.socialbase.downloader.g.a.a(i6).b("notification_opt_2") == 1) {
            return e.v();
        }
        if (i5 == 1 || i5 == 4) {
            return e.t();
        }
        if (i5 == 2) {
            return e.u();
        }
        if (i5 == 3) {
            return e.v();
        }
        return 0;
    }

    private PendingIntent a(String str, int i5, int i6) {
        Intent intent = new Intent(this.f10266b, (Class<?>) DownloadHandlerService.class);
        intent.setAction(str);
        intent.putExtra("extra_click_download_ids", i6);
        intent.putExtra("extra_click_download_type", i5);
        intent.putExtra("extra_from_notification", true);
        return PendingIntent.getService(this.f10266b, i6, intent, 201326592);
    }

    private int a(int i5) {
        if (com.ss.android.socialbase.downloader.g.a.a(i5).b("enable_notification_ui") >= 1) {
            return e.h();
        }
        return e.g();
    }
}
