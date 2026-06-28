package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j0.a;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public final class ck {

    /* renamed from: c, reason: collision with root package name */
    private static volatile ck f11600c = new ck();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedBlockingQueue<IBinder> f11602b = new LinkedBlockingQueue<>(1);

    /* renamed from: a, reason: collision with root package name */
    ServiceConnection f11601a = new ServiceConnection() { // from class: com.tendcloud.tenddata.ck.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            w.f11818a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ck.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ck.this.f11602b.size() > 0) {
                            ck.this.f11602b.clear();
                        }
                        ck.this.f11602b.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a implements IInterface {
        private IBinder mIBinder;

        public a(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getOAID() {
            Parcel obtain;
            Parcel obtain2;
            String str = null;
            try {
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
            } catch (Throwable unused) {
            }
            try {
                try {
                    obtain.writeInterfaceToken(a.AbstractBinderC0538a.f18942a);
                    this.mIBinder.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    str = obtain2.readString();
                } catch (Throwable unused2) {
                    obtain2.recycle();
                    obtain.recycle();
                }
                return str;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    private ck() {
    }

    private void b(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, this.f11601a, 1)) {
            try {
                df.a().setOAID(new a(this.f11602b.take()).getOAID());
            } catch (Throwable unused) {
            }
            try {
                context.unbindService(this.f11601a);
            } catch (Throwable unused2) {
            }
        }
    }

    public static void bindSECServiceGetOAID(Context context) {
        f11600c.b(context);
    }

    public static boolean a(Context context) {
        try {
            if (!bx.g()) {
                return false;
            }
            context.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
