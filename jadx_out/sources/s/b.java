package s;

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

/* loaded from: classes2.dex */
public class b implements q.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22321a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b, reason: collision with root package name */
    public static final int f22322b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22323c = 2;

    /* renamed from: s.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class ServiceConnectionC0661b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22324a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f22325b;

        public ServiceConnectionC0661b() {
            this.f22324a = false;
            this.f22325b = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (!this.f22324a) {
                this.f22324a = true;
                return this.f22325b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f22325b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        public IBinder f22326a;

        public c(IBinder iBinder) {
            this.f22326a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f22326a;
        }

        public boolean e() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(b.f22321a);
                boolean z4 = false;
                this.f22326a.transact(2, obtain, obtain2, 0);
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

        public String m() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(b.f22321a);
                this.f22326a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    @Override // q.b
    public String a(Context context) {
        ServiceConnectionC0661b serviceConnectionC0661b = new ServiceConnectionC0661b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC0661b, 1)) {
            try {
                return new c(serviceConnectionC0661b.a()).m();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC0661b);
            }
        }
        return null;
    }
}
