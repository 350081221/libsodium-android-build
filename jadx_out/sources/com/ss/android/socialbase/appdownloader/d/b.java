package com.ss.android.socialbase.appdownloader.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ss.android.socialbase.appdownloader.c.g;
import com.ss.android.socialbase.appdownloader.d;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.i.f;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private List<Integer> f10258a;

    /* renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f10259b;

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<DownloadInfo> list, int i5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g n5 = d.j().n();
        if (n5 != null) {
            n5.a(list);
        }
        Context O = c.O();
        if (O == null) {
            return;
        }
        boolean b5 = f.b(O);
        Iterator<DownloadInfo> it = list.iterator();
        while (it.hasNext()) {
            a(O, it.next(), b5, i5);
        }
        List<Integer> list2 = this.f10258a;
        if (list2 == null || list2.isEmpty() || this.f10259b != null) {
            return;
        }
        this.f10259b = new BroadcastReceiver() { // from class: com.ss.android.socialbase.appdownloader.d.b.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                final Context applicationContext = context.getApplicationContext();
                if (!f.b(applicationContext)) {
                    return;
                }
                com.ss.android.socialbase.downloader.c.a.b("LaunchResume", "onReceive : wifi connected !!!");
                c.l().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.d.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (b.this.f10258a != null && !b.this.f10258a.isEmpty()) {
                                int size = b.this.f10258a.size();
                                Integer[] numArr = new Integer[size];
                                b.this.f10258a.toArray(numArr);
                                b.this.f10258a.clear();
                                for (int i6 = 0; i6 < size; i6++) {
                                    DownloadInfo downloadInfo = Downloader.getInstance(applicationContext).getDownloadInfo(numArr[i6].intValue());
                                    if (downloadInfo != null && (downloadInfo.getRealStatus() == -5 || (downloadInfo.getRealStatus() == -2 && downloadInfo.isPauseReserveOnWifi()))) {
                                        b.this.a(applicationContext, downloadInfo, true, 2);
                                    }
                                }
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
                try {
                    applicationContext.unregisterReceiver(b.this.f10259b);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                b.this.f10259b = null;
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            O.registerReceiver(this.f10259b, intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
            this.f10259b = null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public List<String> a() {
        return com.ss.android.socialbase.appdownloader.c.c();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public void a(final List<DownloadInfo> list, final int i5) {
        if (f.d()) {
            c.l().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.d.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        b.this.b(list, i5);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        } else {
            b(list, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r21, com.ss.android.socialbase.downloader.model.DownloadInfo r22, boolean r23, int r24) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.d.b.a(android.content.Context, com.ss.android.socialbase.downloader.model.DownloadInfo, boolean, int):void");
    }

    private void a(DownloadInfo downloadInfo, Context context) {
        com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId());
        int a6 = a5.a("paused_resume_max_count", 0);
        double a7 = a5.a("paused_resume_max_hours", 72.0d);
        int pausedResumeCount = downloadInfo.getPausedResumeCount();
        if (pausedResumeCount < a6 && ((double) (System.currentTimeMillis() - downloadInfo.getLastDownloadTime())) < a7 * 3600000.0d) {
            com.ss.android.socialbase.downloader.notification.a e5 = com.ss.android.socialbase.downloader.notification.b.a().e(downloadInfo.getId());
            if (e5 == null) {
                e5 = new com.ss.android.socialbase.appdownloader.e.a(context, downloadInfo.getId(), downloadInfo.getTitle(), downloadInfo.getSavePath(), downloadInfo.getName(), downloadInfo.getExtra());
                com.ss.android.socialbase.downloader.notification.b.a().a(e5);
            } else {
                e5.a(downloadInfo);
            }
            e5.b(downloadInfo.getTotalBytes());
            e5.a(downloadInfo.getCurBytes());
            e5.a(downloadInfo.getStatus(), null, false, false);
            downloadInfo.setPausedResumeCount(pausedResumeCount + 1);
            downloadInfo.updateSpData();
        }
    }

    private boolean a(DownloadInfo downloadInfo) {
        if (com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).b("uninstall_can_not_resume_for_force_task", false)) {
            return f.a(downloadInfo, false, downloadInfo.getMd5());
        }
        return downloadInfo.isDownloaded();
    }
}
