package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes3.dex */
public class SqlDownloadCacheService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10584a = "SqlDownloadCacheService";

    public static void a(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, (Class<?>) SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    context.bindService(intent, serviceConnection, 1);
                }
                context.startService(intent);
            } catch (Throwable th) {
                Log.w(f10584a, "startServiceAndBind fail", th);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        t tVar;
        j y4 = c.y();
        if (y4 instanceof com.ss.android.socialbase.downloader.impls.d) {
            tVar = ((com.ss.android.socialbase.downloader.impls.d) y4).f();
        } else if (y4 instanceof t) {
            tVar = (t) y4;
        } else {
            tVar = null;
        }
        if (tVar instanceof IBinder) {
            return (IBinder) tVar;
        }
        return new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c.a(getApplicationContext());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i5, int i6) {
        int onStartCommand = super.onStartCommand(intent, i5, i6);
        if (c.j()) {
            return 2;
        }
        return onStartCommand;
    }
}
