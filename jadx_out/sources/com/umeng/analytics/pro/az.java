package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class az implements av {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12233a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b, reason: collision with root package name */
    private static final int f12234b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f12235c = 2;

    /* loaded from: classes3.dex */
    private static final class a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f12236a;

        /* renamed from: b, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f12237b;

        private a() {
            this.f12236a = false;
            this.f12237b = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (!this.f12236a) {
                this.f12236a = true;
                return this.f12237b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f12237b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        private IBinder f12238a;

        public b(IBinder iBinder) {
            this.f12238a = iBinder;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f12238a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f12238a;
        }

        public boolean b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean z4 = false;
                this.f12238a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z4 = true;
                }
                return z4;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    @Override // com.umeng.analytics.pro.av
    public String a(Context context) {
        a aVar = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new b(aVar.a()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
