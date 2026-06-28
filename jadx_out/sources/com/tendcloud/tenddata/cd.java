package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import v0.a;

/* loaded from: classes3.dex */
public class cd {

    /* renamed from: b, reason: collision with root package name */
    private static volatile cd f11587b = new cd();

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue<IBinder> f11588a = new LinkedBlockingQueue<>(1);

    /* renamed from: c, reason: collision with root package name */
    private ServiceConnection f11589c = new ServiceConnection() { // from class: com.tendcloud.tenddata.cd.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            w.f11818a.execute(new Runnable() { // from class: com.tendcloud.tenddata.cd.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (cd.this.f11588a.size() > 0) {
                            cd.this.f11588a.clear();
                        }
                        cd.this.f11588a.put(iBinder);
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

        a(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        String getOAID() {
            String str = null;
            try {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.AbstractBinderC0664a.f22580a);
                    this.mIBinder.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    str = obtain2.readString();
                } catch (Throwable unused) {
                }
                obtain.recycle();
                obtain2.recycle();
            } catch (Throwable unused2) {
            }
            return str;
        }
    }

    private cd() {
    }

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (context.bindService(intent, this.f11589c, 1)) {
                try {
                    df.a().setOAID(new a(this.f11588a.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f11589c);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void bindLENOVOServiceGetOAID(Context context) {
        f11587b.b(context);
    }

    public static boolean a(Context context) {
        try {
            if (!bx.k()) {
                return false;
            }
            context.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
