package com.ss.android.socialbase.downloader.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.b.b;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface c extends IInterface {
    DownloadInfo a(int i5, int i6) throws RemoteException;

    DownloadInfo a(int i5, long j5) throws RemoteException;

    DownloadInfo a(int i5, long j5, String str, String str2) throws RemoteException;

    List<DownloadInfo> a(String str) throws RemoteException;

    void a() throws RemoteException;

    void a(int i5, int i6, int i7, int i8) throws RemoteException;

    void a(int i5, int i6, int i7, long j5) throws RemoteException;

    void a(int i5, int i6, long j5) throws RemoteException;

    void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException;

    void a(b bVar) throws RemoteException;

    void a(com.ss.android.socialbase.downloader.model.b bVar) throws RemoteException;

    boolean a(int i5) throws RemoteException;

    boolean a(DownloadInfo downloadInfo) throws RemoteException;

    DownloadInfo b(int i5) throws RemoteException;

    DownloadInfo b(int i5, long j5) throws RemoteException;

    List<DownloadInfo> b() throws RemoteException;

    List<DownloadInfo> b(String str) throws RemoteException;

    void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException;

    void b(DownloadInfo downloadInfo) throws RemoteException;

    void b(com.ss.android.socialbase.downloader.model.b bVar) throws RemoteException;

    DownloadInfo c(int i5, long j5) throws RemoteException;

    List<com.ss.android.socialbase.downloader.model.b> c(int i5) throws RemoteException;

    List<DownloadInfo> c(String str) throws RemoteException;

    void c() throws RemoteException;

    DownloadInfo d(int i5, long j5) throws RemoteException;

    List<DownloadInfo> d(String str) throws RemoteException;

    void d(int i5) throws RemoteException;

    boolean d() throws RemoteException;

    DownloadInfo e(int i5, long j5) throws RemoteException;

    boolean e() throws RemoteException;

    boolean e(int i5) throws RemoteException;

    boolean f(int i5) throws RemoteException;

    DownloadInfo g(int i5) throws RemoteException;

    DownloadInfo h(int i5) throws RemoteException;

    DownloadInfo i(int i5) throws RemoteException;

    DownloadInfo j(int i5) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new C0198a(iBinder);
        }

        public static c f() {
            return C0198a.f10419a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1598968902) {
                com.ss.android.socialbase.downloader.model.b bVar = null;
                DownloadInfo downloadInfo = null;
                DownloadInfo downloadInfo2 = null;
                com.ss.android.socialbase.downloader.model.b bVar2 = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean a5 = a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a5 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo b5 = b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b5 != null) {
                            parcel2.writeInt(1);
                            b5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> a6 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(a6);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> b6 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b6);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> c5 = c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c5);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> d5 = d(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(d5);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> b7 = b();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b7);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<com.ss.android.socialbase.downloader.model.b> c6 = c(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c6);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        d(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            bVar = com.ss.android.socialbase.downloader.model.b.CREATOR.createFromParcel(parcel);
                        }
                        a(bVar);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            bVar2 = com.ss.android.socialbase.downloader.model.b.CREATOR.createFromParcel(parcel);
                        }
                        b(bVar2);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a7 = a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a7 != null) {
                            parcel2.writeInt(1);
                            a7.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean a8 = a(downloadInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(a8 ? 1 : 0);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean e5 = e(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(e5 ? 1 : 0);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean f5 = f(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(f5 ? 1 : 0);
                        return true;
                    case 20:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        c();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo g5 = g(parcel.readInt());
                        parcel2.writeNoException();
                        if (g5 != null) {
                            parcel2.writeInt(1);
                            g5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a9 = a(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (a9 != null) {
                            parcel2.writeInt(1);
                            a9.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a10 = a(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (a10 != null) {
                            parcel2.writeInt(1);
                            a10.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo b8 = b(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (b8 != null) {
                            parcel2.writeInt(1);
                            b8.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 25:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo h5 = h(parcel.readInt());
                        parcel2.writeNoException();
                        if (h5 != null) {
                            parcel2.writeInt(1);
                            h5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo c7 = c(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (c7 != null) {
                            parcel2.writeInt(1);
                            c7.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 27:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo d6 = d(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (d6 != null) {
                            parcel2.writeInt(1);
                            d6.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo e6 = e(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (e6 != null) {
                            parcel2.writeInt(1);
                            e6.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo i7 = i(parcel.readInt());
                        parcel2.writeNoException();
                        if (i7 != null) {
                            parcel2.writeInt(1);
                            i7.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo j5 = j(parcel.readInt());
                        parcel2.writeNoException();
                        if (j5 != null) {
                            parcel2.writeInt(1);
                            j5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean d7 = d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d7 ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean e7 = e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e7 ? 1 : 0);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        b(downloadInfo);
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(parcel.readInt(), parcel.createTypedArrayList(com.ss.android.socialbase.downloader.model.b.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        b(parcel.readInt(), parcel.createTypedArrayList(com.ss.android.socialbase.downloader.model.b.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        a(b.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.b.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0198a implements c {

            /* renamed from: a, reason: collision with root package name */
            public static c f10419a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10420b;

            C0198a(IBinder iBinder) {
                this.f10420b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f10420b.transact(1, obtain, obtain2, 0) && a.f() != null) {
                        a.f().a();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10420b;
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo b(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(3, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().b(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public List<DownloadInfo> c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f10420b.transact(6, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().c(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public List<DownloadInfo> d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f10420b.transact(7, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().d(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public boolean e(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(18, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().e(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public boolean f(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.f10420b.transact(19, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().f(i5);
                    }
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

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo g(int i5) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(21, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().g(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo h(int i5) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(25, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().h(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo i(int i5) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(29, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().i(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo j(int i5) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(30, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().j(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public boolean a(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(2, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().a(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public List<com.ss.android.socialbase.downloader.model.b> c(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(9, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().c(i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(com.ss.android.socialbase.downloader.model.b.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void d(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    if (!this.f10420b.transact(10, obtain, obtain2, 0) && a.f() != null) {
                        a.f().d(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo e(int i5, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeLong(j5);
                    if (!this.f10420b.transact(28, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().e(i5, j5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public List<DownloadInfo> b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f10420b.transact(5, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().b(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public List<DownloadInfo> a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f10420b.transact(4, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().a(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo d(int i5, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeLong(j5);
                    if (!this.f10420b.transact(27, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().d(i5, j5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f10420b.transact(20, obtain, obtain2, 0) && a.f() != null) {
                        a.f().c();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public List<DownloadInfo> b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f10420b.transact(8, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().b();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public boolean e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f10420b.transact(32, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().e();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void a(com.ss.android.socialbase.downloader.model.b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10420b.transact(11, obtain, obtain2, 0) && a.f() != null) {
                        a.f().a(bVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo c(int i5, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeLong(j5);
                    if (!this.f10420b.transact(26, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().c(i5, j5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void b(com.ss.android.socialbase.downloader.model.b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10420b.transact(12, obtain, obtain2, 0) && a.f() != null) {
                        a.f().b(bVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public boolean d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f10420b.transact(31, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().d();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void a(int i5, int i6, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeLong(j5);
                    if (!this.f10420b.transact(13, obtain, obtain2, 0) && a.f() != null) {
                        a.f().a(i5, i6, j5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo b(int i5, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeLong(j5);
                    if (!this.f10420b.transact(24, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().b(i5, j5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void a(int i5, int i6, int i7, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    obtain.writeLong(j5);
                    if (!this.f10420b.transact(14, obtain, obtain2, 0) && a.f() != null) {
                        a.f().a(i5, i6, i7, j5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10420b.transact(33, obtain, obtain2, 0) && a.f() != null) {
                        a.f().b(downloadInfo);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void a(int i5, int i6, int i7, int i8) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    obtain.writeInt(i8);
                    if (!this.f10420b.transact(15, obtain, obtain2, 0) && a.f() != null) {
                        a.f().a(i5, i6, i7, i8);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeTypedList(list);
                    if (!this.f10420b.transact(35, obtain, obtain2, 0) && a.f() != null) {
                        a.f().b(i5, list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo a(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f10420b.transact(16, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().a(i5, i6);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public boolean a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10420b.transact(17, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().a(downloadInfo);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo a(int i5, long j5, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeLong(j5);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f10420b.transact(22, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().a(i5, j5, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public DownloadInfo a(int i5, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeLong(j5);
                    if (!this.f10420b.transact(23, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().a(i5, j5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i5);
                    obtain.writeTypedList(list);
                    if (!this.f10420b.transact(34, obtain, obtain2, 0) && a.f() != null) {
                        a.f().a(i5, list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.b.c
            public void a(b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f10420b.transact(36, obtain, obtain2, 0) && a.f() != null) {
                        a.f().a(bVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
