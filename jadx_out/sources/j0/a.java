package j0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b(String str) throws RemoteException;

    /* renamed from: j0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0538a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f18942a = "com.samsung.android.deviceidservice.IDeviceIdService";

        /* renamed from: b, reason: collision with root package name */
        public static final int f18943b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f18944c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f18945d = 3;

        public AbstractBinderC0538a() {
            attachInterface(this, f18942a);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f18942a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0539a(iBinder);
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
                        parcel2.writeString(f18942a);
                        return true;
                    }
                    parcel.enforceInterface(f18942a);
                    String a5 = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(a5);
                    return true;
                }
                parcel.enforceInterface(f18942a);
                String b5 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b5);
                return true;
            }
            parcel.enforceInterface(f18942a);
            String a6 = a();
            parcel2.writeNoException();
            parcel2.writeString(a6);
            return true;
        }

        /* renamed from: j0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0539a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f18946a;

            public C0539a(IBinder iBinder) {
                this.f18946a = iBinder;
            }

            @Override // j0.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0538a.f18942a);
                    this.f18946a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18946a;
            }

            @Override // j0.a
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0538a.f18942a);
                    obtain.writeString(str);
                    this.f18946a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String m() {
                return AbstractBinderC0538a.f18942a;
            }

            @Override // j0.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0538a.f18942a);
                    obtain.writeString(str);
                    this.f18946a.transact(3, obtain, obtain2, 0);
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
