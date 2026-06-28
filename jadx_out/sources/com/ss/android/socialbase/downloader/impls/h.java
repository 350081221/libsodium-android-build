package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.ss.android.socialbase.downloader.downloader.DownloadService;

/* loaded from: classes3.dex */
public class h extends com.ss.android.socialbase.downloader.downloader.a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f11023e = "h";

    @Override // com.ss.android.socialbase.downloader.downloader.a
    public void a(Context context, ServiceConnection serviceConnection) {
        try {
            context.startService(new Intent(context, (Class<?>) DownloadService.class));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.o
    public void c() {
        if (com.ss.android.socialbase.downloader.i.a.a(262144)) {
            this.f10587b = true;
            this.f10589d = false;
            if (com.ss.android.socialbase.downloader.c.a.a()) {
                com.ss.android.socialbase.downloader.c.a.b(f11023e, "onStartCommandOnMainThread");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.o
    public void a(Intent intent, int i5, int i6) {
        if (com.ss.android.socialbase.downloader.c.a.a()) {
            com.ss.android.socialbase.downloader.c.a.b(f11023e, "onStartCommand");
        }
        if (!com.ss.android.socialbase.downloader.i.a.a(262144)) {
            this.f10587b = true;
        }
        e();
    }
}
