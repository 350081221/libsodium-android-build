package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.umeng.analytics.pro.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ax implements av {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12222a = "Coolpad";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12223b = "com.coolpad.deviceidsupport";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12224c = "com.coolpad.deviceidsupport.DeviceIdService";

    /* renamed from: d, reason: collision with root package name */
    private static a f12225d;

    /* renamed from: f, reason: collision with root package name */
    private CountDownLatch f12227f;

    /* renamed from: g, reason: collision with root package name */
    private Context f12228g;

    /* renamed from: e, reason: collision with root package name */
    private String f12226e = "";

    /* renamed from: h, reason: collision with root package name */
    private final ServiceConnection f12229h = new ServiceConnection() { // from class: com.umeng.analytics.pro.ax.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                a unused = ax.f12225d = a.b.a(iBinder);
                ax.this.f12226e = ax.f12225d.b(ax.this.f12228g.getPackageName());
                Log.d(ax.f12222a, "onServiceConnected: oaid = " + ax.this.f12226e);
            } catch (RemoteException | NullPointerException e5) {
                Log.e(ax.f12222a, "onServiceConnected failed e=" + e5.getMessage());
            }
            ax.this.f12227f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(ax.f12222a, "onServiceDisconnected");
            a unused = ax.f12225d = null;
        }
    };

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(f12223b, f12224c));
            if (context.bindService(intent, this.f12229h, 1)) {
                return;
            }
            Log.e(f12222a, "bindService return false");
        } catch (Throwable th) {
            Log.e(f12222a, "bindService failed. e=" + th.getMessage());
            this.f12227f.countDown();
        }
    }

    private void c(Context context) {
        try {
            Log.d(f12222a, "call unbindService.");
            context.unbindService(this.f12229h);
        } catch (Throwable th) {
            Log.e(f12222a, "unbindService failed. e=" + th.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.av
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        this.f12228g = context.getApplicationContext();
        this.f12227f = new CountDownLatch(1);
        try {
            b(context);
            if (!this.f12227f.await(500L, TimeUnit.MILLISECONDS)) {
                Log.e(f12222a, "getOAID time-out");
            }
            return this.f12226e;
        } catch (InterruptedException e5) {
            Log.e(f12222a, "getOAID interrupted. e=" + e5.getMessage());
            return null;
        } finally {
            c(context);
        }
    }
}
