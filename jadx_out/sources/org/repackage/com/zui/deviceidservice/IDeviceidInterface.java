package org.repackage.com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface IDeviceidInterface extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b() throws RemoteException;

    String b(String str) throws RemoteException;

    boolean c() throws RemoteException;

    boolean c(String str) throws RemoteException;

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IDeviceidInterface {

        /* renamed from: a, reason: collision with root package name */
        static final int f22193a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f22194b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f22195c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f22196d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f22197e = 5;

        /* renamed from: f, reason: collision with root package name */
        static final int f22198f = 6;

        /* renamed from: g, reason: collision with root package name */
        private static final String f22199g = "org.repackage.com.zui.deviceidservice.IDeviceidInterface";

        public Stub() {
            attachInterface(this, f22199g);
        }

        public static IDeviceidInterface a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f22199g);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDeviceidInterface)) {
                return (IDeviceidInterface) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1598968902) {
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(f22199g);
                        String a5 = a();
                        parcel2.writeNoException();
                        parcel2.writeString(a5);
                        return true;
                    case 2:
                        parcel.enforceInterface(f22199g);
                        String b5 = b();
                        parcel2.writeNoException();
                        parcel2.writeString(b5);
                        return true;
                    case 3:
                        parcel.enforceInterface(f22199g);
                        boolean c5 = c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c5 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(f22199g);
                        String a6 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(a6);
                        return true;
                    case 5:
                        parcel.enforceInterface(f22199g);
                        String b6 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(b6);
                        return true;
                    case 6:
                        parcel.enforceInterface(f22199g);
                        boolean c6 = c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(c6 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(f22199g);
            return true;
        }

        /* loaded from: classes4.dex */
        private static class Proxy implements IDeviceidInterface {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f22200a;

            Proxy(IBinder iBinder) {
                this.f22200a = iBinder;
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f22199g);
                    this.f22200a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22200a;
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f22199g);
                    this.f22200a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f22199g);
                    this.f22200a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return Stub.f22199g;
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f22199g);
                    obtain.writeString(str);
                    this.f22200a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f22199g);
                    obtain.writeString(str);
                    this.f22200a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            public boolean c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f22199g);
                    obtain.writeString(str);
                    this.f22200a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
