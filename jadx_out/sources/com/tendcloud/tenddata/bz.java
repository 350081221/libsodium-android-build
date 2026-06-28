package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class bz {

    /* renamed from: b, reason: collision with root package name */
    private static volatile bz f11575b = new bz();

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue<IBinder> f11576a = new LinkedBlockingQueue<>(1);

    /* renamed from: c, reason: collision with root package name */
    private ServiceConnection f11577c = new ServiceConnection() { // from class: com.tendcloud.tenddata.bz.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            w.f11818a.execute(new Runnable() { // from class: com.tendcloud.tenddata.bz.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bz.this.f11576a.size() > 0) {
                            bz.this.f11576a.clear();
                        }
                        bz.this.f11576a.put(iBinder);
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
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.mIBinder.transact(3, obtain, obtain2, 0);
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

    private bz() {
    }

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.asus.msa.action.ACCESS_DID");
            intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
            if (context.bindService(intent, this.f11577c, 1)) {
                try {
                    df.a().setOAID(new a(this.f11576a.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f11577c);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void bindASUSServiceGetOAID(Context context) {
        f11575b.b(context);
    }

    public static boolean a(Context context) {
        try {
            return bx.j();
        } catch (Throwable unused) {
            return false;
        }
    }
}
