package com.ss.android.socialbase.downloader.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.ae;
import com.ss.android.socialbase.downloader.depend.ah;
import com.ss.android.socialbase.downloader.depend.e;
import com.ss.android.socialbase.downloader.depend.f;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.h;
import com.ss.android.socialbase.downloader.depend.i;
import com.ss.android.socialbase.downloader.depend.j;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.p;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.y;

/* loaded from: classes3.dex */
public interface a extends IInterface {
    int a(int i5) throws RemoteException;

    i a(int i5, int i6) throws RemoteException;

    DownloadInfo a() throws RemoteException;

    com.ss.android.socialbase.downloader.depend.e b() throws RemoteException;

    i b(int i5) throws RemoteException;

    l c(int i5) throws RemoteException;

    y c() throws RemoteException;

    ae d() throws RemoteException;

    h e() throws RemoteException;

    f f() throws RemoteException;

    u g() throws RemoteException;

    ah h() throws RemoteException;

    p i() throws RemoteException;

    j j() throws RemoteException;

    g k() throws RemoteException;

    int l() throws RemoteException;

    /* renamed from: com.ss.android.socialbase.downloader.model.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0220a extends Binder implements a {
        public AbstractBinderC0220a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0221a(iBinder);
        }

        public static a m() {
            return C0221a.f11102a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1598968902) {
                IBinder iBinder = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        DownloadInfo a5 = a();
                        parcel2.writeNoException();
                        if (a5 != null) {
                            parcel2.writeInt(1);
                            a5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        com.ss.android.socialbase.downloader.depend.e b5 = b();
                        parcel2.writeNoException();
                        if (b5 != null) {
                            iBinder = b5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int a6 = a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a6);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        i a7 = a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a7 != null) {
                            iBinder = a7.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        i b6 = b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b6 != null) {
                            iBinder = b6.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        y c5 = c();
                        parcel2.writeNoException();
                        if (c5 != null) {
                            iBinder = c5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        ae d5 = d();
                        parcel2.writeNoException();
                        if (d5 != null) {
                            iBinder = d5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        h e5 = e();
                        parcel2.writeNoException();
                        if (e5 != null) {
                            iBinder = e5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        f f5 = f();
                        parcel2.writeNoException();
                        if (f5 != null) {
                            iBinder = f5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        u g5 = g();
                        parcel2.writeNoException();
                        if (g5 != null) {
                            iBinder = g5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        ah h5 = h();
                        parcel2.writeNoException();
                        if (h5 != null) {
                            iBinder = h5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        p i7 = i();
                        parcel2.writeNoException();
                        if (i7 != null) {
                            iBinder = i7.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        j j5 = j();
                        parcel2.writeNoException();
                        if (j5 != null) {
                            iBinder = j5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        g k5 = k();
                        parcel2.writeNoException();
                        if (k5 != null) {
                            iBinder = k5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int l5 = l();
                        parcel2.writeNoException();
                        parcel2.writeInt(l5);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        l c6 = c(parcel.readInt());
                        parcel2.writeNoException();
                        if (c6 != null) {
                            iBinder = c6.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.model.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0221a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static a f11102a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f11103b;

            C0221a(IBinder iBinder) {
                this.f11103b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public DownloadInfo a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(1, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().a();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11103b;
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public com.ss.android.socialbase.downloader.depend.e b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(2, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().b();
                    }
                    obtain2.readException();
                    return e.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public y c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(6, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().c();
                    }
                    obtain2.readException();
                    return y.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public ae d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(7, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().d();
                    }
                    obtain2.readException();
                    return ae.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public h e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(8, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().e();
                    }
                    obtain2.readException();
                    return h.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public f f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(9, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().f();
                    }
                    obtain2.readException();
                    return f.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public u g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(10, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().g();
                    }
                    obtain2.readException();
                    return u.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public ah h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(11, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().h();
                    }
                    obtain2.readException();
                    return ah.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public p i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(12, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().i();
                    }
                    obtain2.readException();
                    return p.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public j j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(13, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().j();
                    }
                    obtain2.readException();
                    return j.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public g k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(14, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().k();
                    }
                    obtain2.readException();
                    return g.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public int l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f11103b.transact(15, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().l();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public i b(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i5);
                    if (!this.f11103b.transact(5, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().b(i5);
                    }
                    obtain2.readException();
                    return i.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public l c(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i5);
                    if (!this.f11103b.transact(16, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().c(i5);
                    }
                    obtain2.readException();
                    return l.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public int a(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i5);
                    if (!this.f11103b.transact(3, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().a(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public i a(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f11103b.transact(4, obtain, obtain2, 0) && AbstractBinderC0220a.m() != null) {
                        return AbstractBinderC0220a.m().a(i5, i6);
                    }
                    obtain2.readException();
                    return i.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
