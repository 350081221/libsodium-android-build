package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface b extends IInterface {

    /* loaded from: classes3.dex */
    public static class a implements b {
        @Override // com.umeng.analytics.pro.b
        public String a() throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.b
        public String a(String str) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.b
        public String b(String str) throws RemoteException {
            return null;
        }
    }

    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b(String str) throws RemoteException;

    /* renamed from: com.umeng.analytics.pro.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0238b extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        static final int f12239a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f12240b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f12241c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final String f12242d = "com.samsung.android.deviceidservice.IDeviceIdService";

        public AbstractBinderC0238b() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static b b() {
            return a.f12243a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 1598968902) {
                            return super.onTransact(i5, parcel, parcel2, i6);
                        }
                        parcel2.writeString("com.samsung.android.deviceidservice.IDeviceIdService");
                        return true;
                    }
                    parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                    String b5 = b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(b5);
                    return true;
                }
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String a5 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a5);
                return true;
            }
            parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            String a6 = a();
            parcel2.writeNoException();
            parcel2.writeString(a6);
            return true;
        }

        public static boolean a(b bVar) {
            if (a.f12243a != null || bVar == null) {
                return false;
            }
            a.f12243a = bVar;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.umeng.analytics.pro.b$b$a */
        /* loaded from: classes3.dex */
        public static class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static b f12243a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f12244b;

            a(IBinder iBinder) {
                this.f12244b = iBinder;
            }

            @Override // com.umeng.analytics.pro.b
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    if (!this.f12244b.transact(1, obtain, obtain2, 0) && AbstractBinderC0238b.b() != null) {
                        return AbstractBinderC0238b.b().a();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12244b;
            }

            public String b() {
                return "com.samsung.android.deviceidservice.IDeviceIdService";
            }

            @Override // com.umeng.analytics.pro.b
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    if (!this.f12244b.transact(3, obtain, obtain2, 0) && AbstractBinderC0238b.b() != null) {
                        return AbstractBinderC0238b.b().b(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.b
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    if (!this.f12244b.transact(2, obtain, obtain2, 0) && AbstractBinderC0238b.b() != null) {
                        return AbstractBinderC0238b.b().a(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
