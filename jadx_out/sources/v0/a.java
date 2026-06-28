package v0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b() throws RemoteException;

    String b(String str) throws RemoteException;

    boolean c() throws RemoteException;

    boolean c(String str) throws RemoteException;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0664a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f22580a = "com.zui.deviceidservice.IDeviceidInterface";

        /* renamed from: b, reason: collision with root package name */
        public static final int f22581b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f22582c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f22583d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f22584e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f22585f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f22586g = 6;

        public AbstractBinderC0664a() {
            attachInterface(this, f22580a);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f22580a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0665a(iBinder);
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
                        parcel.enforceInterface(f22580a);
                        String a5 = a();
                        parcel2.writeNoException();
                        parcel2.writeString(a5);
                        return true;
                    case 2:
                        parcel.enforceInterface(f22580a);
                        String b5 = b();
                        parcel2.writeNoException();
                        parcel2.writeString(b5);
                        return true;
                    case 3:
                        parcel.enforceInterface(f22580a);
                        boolean c5 = c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c5 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(f22580a);
                        String b6 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(b6);
                        return true;
                    case 5:
                        parcel.enforceInterface(f22580a);
                        String a6 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(a6);
                        return true;
                    case 6:
                        parcel.enforceInterface(f22580a);
                        boolean c6 = c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(c6 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(f22580a);
            return true;
        }

        /* renamed from: v0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0665a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f22587a;

            public C0665a(IBinder iBinder) {
                this.f22587a = iBinder;
            }

            @Override // v0.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0664a.f22580a);
                    this.f22587a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22587a;
            }

            @Override // v0.a
            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0664a.f22580a);
                    this.f22587a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // v0.a
            public boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0664a.f22580a);
                    this.f22587a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String m() {
                return AbstractBinderC0664a.f22580a;
            }

            @Override // v0.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0664a.f22580a);
                    obtain.writeString(str);
                    this.f22587a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // v0.a
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0664a.f22580a);
                    obtain.writeString(str);
                    this.f22587a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // v0.a
            public boolean c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0664a.f22580a);
                    obtain.writeString(str);
                    this.f22587a.transact(6, obtain, obtain2, 0);
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
