package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.ae;
import com.ss.android.socialbase.downloader.depend.aj;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.i;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.a;
import java.util.List;

/* loaded from: classes3.dex */
public interface i extends IInterface {
    int a(String str, String str2) throws RemoteException;

    List<DownloadInfo> a(String str) throws RemoteException;

    void a() throws RemoteException;

    void a(int i5) throws RemoteException;

    void a(int i5, int i6) throws RemoteException;

    void a(int i5, int i6, int i7, int i8) throws RemoteException;

    void a(int i5, int i6, int i7, long j5) throws RemoteException;

    void a(int i5, int i6, long j5) throws RemoteException;

    void a(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4) throws RemoteException;

    void a(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4, boolean z5) throws RemoteException;

    void a(int i5, long j5) throws RemoteException;

    void a(int i5, Notification notification) throws RemoteException;

    void a(int i5, y yVar) throws RemoteException;

    void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException;

    void a(int i5, boolean z4) throws RemoteException;

    void a(aj ajVar) throws RemoteException;

    void a(com.ss.android.socialbase.downloader.model.a aVar) throws RemoteException;

    void a(com.ss.android.socialbase.downloader.model.b bVar) throws RemoteException;

    void a(List<String> list) throws RemoteException;

    void a(boolean z4) throws RemoteException;

    boolean a(DownloadInfo downloadInfo) throws RemoteException;

    DownloadInfo b(String str, String str2) throws RemoteException;

    List<DownloadInfo> b() throws RemoteException;

    List<DownloadInfo> b(String str) throws RemoteException;

    void b(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4) throws RemoteException;

    void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException;

    void b(int i5, boolean z4) throws RemoteException;

    void b(List<String> list) throws RemoteException;

    boolean b(int i5) throws RemoteException;

    boolean b(DownloadInfo downloadInfo) throws RemoteException;

    List<DownloadInfo> c(String str) throws RemoteException;

    void c(int i5) throws RemoteException;

    void c(int i5, boolean z4) throws RemoteException;

    boolean c() throws RemoteException;

    List<DownloadInfo> d(String str) throws RemoteException;

    void d(int i5) throws RemoteException;

    void d(int i5, boolean z4) throws RemoteException;

    boolean d() throws RemoteException;

    long e(int i5) throws RemoteException;

    List<DownloadInfo> e(String str) throws RemoteException;

    void e() throws RemoteException;

    int f(int i5) throws RemoteException;

    boolean f() throws RemoteException;

    boolean g(int i5) throws RemoteException;

    DownloadInfo h(int i5) throws RemoteException;

    List<com.ss.android.socialbase.downloader.model.b> i(int i5) throws RemoteException;

    void j(int i5) throws RemoteException;

    boolean k(int i5) throws RemoteException;

    void l(int i5) throws RemoteException;

    int m(int i5) throws RemoteException;

    boolean n(int i5) throws RemoteException;

    void o(int i5) throws RemoteException;

    boolean p(int i5) throws RemoteException;

    y q(int i5) throws RemoteException;

    ae r(int i5) throws RemoteException;

    com.ss.android.socialbase.downloader.depend.g s(int i5) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements i {
        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof i)) {
                return (i) queryLocalInterface;
            }
            return new C0216a(iBinder);
        }

        public static i g() {
            return C0216a.f10673a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            if (i5 != 1598968902) {
                DownloadInfo downloadInfo = null;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                IBinder iBinder3 = null;
                DownloadInfo downloadInfo2 = null;
                com.ss.android.socialbase.downloader.model.b bVar = null;
                Notification notification = null;
                boolean z8 = false;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(a.AbstractBinderC0220a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        }
                        a(readInt, z8);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean b5 = b(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(b5 ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        c(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        d(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a();
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        long e5 = e(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(e5);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int f5 = f(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(f5);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean g5 = g(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(g5 ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        DownloadInfo h5 = h(parcel.readInt());
                        parcel2.writeNoException();
                        if (h5 != null) {
                            parcel2.writeInt(1);
                            h5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 12:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> a5 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(a5);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<com.ss.android.socialbase.downloader.model.b> i7 = i(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(i7);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int a6 = a(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(a6);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        DownloadInfo b6 = b(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (b6 != null) {
                            parcel2.writeInt(1);
                            b6.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> b7 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b7);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> c5 = c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c5);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> d5 = d(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(d5);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> b8 = b();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b8);
                        return true;
                    case 20:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        b(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        }
                        b(readInt2, z8);
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        }
                        c(readInt3, z8);
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        j(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        com.ss.android.socialbase.downloader.depend.i a7 = i.a.a(parcel.readStrongBinder());
                        int readInt6 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        a(readInt4, readInt5, a7, readInt6, z4);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt7 = parcel.readInt();
                        int readInt8 = parcel.readInt();
                        com.ss.android.socialbase.downloader.depend.i a8 = i.a.a(parcel.readStrongBinder());
                        int readInt9 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        b(readInt7, readInt8, a8, readInt9, z5);
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt10 = parcel.readInt();
                        int readInt11 = parcel.readInt();
                        com.ss.android.socialbase.downloader.depend.i a9 = i.a.a(parcel.readStrongBinder());
                        int readInt12 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        a(readInt10, readInt11, a9, readInt12, z6, z7);
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean a10 = a(downloadInfo);
                        parcel2.writeNoException();
                        parcel2.writeInt(a10 ? 1 : 0);
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt13 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                        }
                        a(readInt13, notification);
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        }
                        a(z8);
                        return true;
                    case 31:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean c6 = c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c6 ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> e6 = e(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(e6);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean k5 = k(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(k5 ? 1 : 0);
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        l(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean d6 = d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d6 ? 1 : 0);
                        return true;
                    case 36:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt14 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        }
                        d(readInt14, z8);
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int m5 = m(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(m5);
                        return true;
                    case 38:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            bVar = com.ss.android.socialbase.downloader.model.b.CREATOR.createFromParcel(parcel);
                        }
                        a(bVar);
                        parcel2.writeNoException();
                        return true;
                    case 39:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean b9 = b(downloadInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(b9 ? 1 : 0);
                        return true;
                    case 40:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean n5 = n(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(n5 ? 1 : 0);
                        return true;
                    case 41:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        o(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 42:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 44:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 45:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean p5 = p(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(p5 ? 1 : 0);
                        return true;
                    case 46:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        e();
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.createTypedArrayList(com.ss.android.socialbase.downloader.model.b.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 48:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        b(parcel.readInt(), parcel.createTypedArrayList(com.ss.android.socialbase.downloader.model.b.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 49:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(aj.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 50:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 51:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        y q5 = q(parcel.readInt());
                        parcel2.writeNoException();
                        if (q5 != null) {
                            iBinder3 = q5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder3);
                        return true;
                    case 52:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        ae r5 = r(parcel.readInt());
                        parcel2.writeNoException();
                        if (r5 != null) {
                            iBinder2 = r5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder2);
                        return true;
                    case 53:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), y.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 54:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        com.ss.android.socialbase.downloader.depend.g s5 = s(parcel.readInt());
                        parcel2.writeNoException();
                        if (s5 != null) {
                            iBinder = s5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 55:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean f6 = f();
                        parcel2.writeNoException();
                        parcel2.writeInt(f6 ? 1 : 0);
                        return true;
                    case 56:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        a(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.downloader.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0216a implements i {

            /* renamed from: a, reason: collision with root package name */
            public static i f10673a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10674b;

            C0216a(IBinder iBinder) {
                this.f10674b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(com.ss.android.socialbase.downloader.model.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (!this.f10674b.transact(1, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(aVar);
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
                return this.f10674b;
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean b(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(4, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().b(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void c(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(5, obtain, obtain2, 0) && a.g() != null) {
                        a.g().c(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void d(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(6, obtain, obtain2, 0) && a.g() != null) {
                        a.g().d(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public long e(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(8, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().e(i5);
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public int f(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(9, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().f(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean g(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.f10674b.transact(10, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().g(i5);
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

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public DownloadInfo h(int i5) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(11, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().h(i5);
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

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public List<com.ss.android.socialbase.downloader.model.b> i(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(13, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().i(i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(com.ss.android.socialbase.downloader.model.b.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void j(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(24, obtain, obtain2, 0) && a.g() != null) {
                        a.g().j(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean k(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.f10674b.transact(33, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().k(i5);
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

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void l(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(34, obtain, obtain2, 0) && a.g() != null) {
                        a.g().l(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public int m(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(37, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().m(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean n(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.f10674b.transact(40, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().n(i5);
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

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void o(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(41, obtain, obtain2, 0) && a.g() != null) {
                        a.g().o(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean p(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.f10674b.transact(45, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().p(i5);
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

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public y q(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(51, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().q(i5);
                    }
                    obtain2.readException();
                    return y.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public ae r(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(52, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().r(i5);
                    }
                    obtain2.readException();
                    return ae.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public com.ss.android.socialbase.downloader.depend.g s(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(54, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().s(i5);
                    }
                    obtain2.readException();
                    return g.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (!this.f10674b.transact(2, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public List<DownloadInfo> c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f10674b.transact(17, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().c(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public List<DownloadInfo> d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f10674b.transact(18, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().d(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public DownloadInfo b(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f10674b.transact(15, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().b(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public List<DownloadInfo> e(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f10674b.transact(32, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().e(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (!this.f10674b.transact(55, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().f();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f10674b.transact(3, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void c(int i5, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f10674b.transact(23, obtain, obtain2, 0) && a.g() != null) {
                        a.g().c(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (!this.f10674b.transact(35, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().d();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (!this.f10674b.transact(46, obtain, obtain2, 0) && a.g() != null) {
                        a.g().e();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public List<DownloadInfo> b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f10674b.transact(16, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().b(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (!this.f10674b.transact(7, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void d(int i5, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f10674b.transact(36, obtain, obtain2, 0) && a.g() != null) {
                        a.g().d(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (!this.f10674b.transact(31, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().c();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public List<DownloadInfo> b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (!this.f10674b.transact(19, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().b();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public List<DownloadInfo> a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f10674b.transact(12, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().a(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void b(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    if (!this.f10674b.transact(21, obtain, obtain2, 0) && a.g() != null) {
                        a.g().b(list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public int a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f10674b.transact(14, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().a(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void b(int i5, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f10674b.transact(22, obtain, obtain2, 0) && a.g() != null) {
                        a.g().b(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    if (!this.f10674b.transact(20, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void b(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    obtain.writeInt(i7);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f10674b.transact(26, obtain, obtain2, 0) && a.g() != null) {
                        a.g().b(i5, i6, iVar, i7, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    obtain.writeInt(i7);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f10674b.transact(25, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, i6, iVar, i7, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10674b.transact(39, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().b(downloadInfo);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4, boolean z5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    obtain.writeInt(i7);
                    int i8 = 1;
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!z5) {
                        i8 = 0;
                    }
                    obtain.writeInt(i8);
                    try {
                        if (!this.f10674b.transact(27, obtain, obtain2, 0) && a.g() != null) {
                            a.g().a(i5, i6, iVar, i7, z4, z5);
                            obtain2.recycle();
                            obtain.recycle();
                        } else {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeTypedList(list);
                    if (!this.f10674b.transact(48, obtain, obtain2, 0) && a.g() != null) {
                        a.g().b(i5, list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public boolean a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10674b.transact(28, obtain, obtain2, 0) && a.g() != null) {
                        return a.g().a(downloadInfo);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f10674b.transact(29, obtain, null, 1) || a.g() == null) {
                        return;
                    }
                    a.g().a(i5, notification);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(z4 ? 1 : 0);
                    if (this.f10674b.transact(30, obtain, null, 1) || a.g() == null) {
                        return;
                    }
                    a.g().a(z4);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(com.ss.android.socialbase.downloader.model.b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10674b.transact(38, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(bVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, int i6, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeLong(j5);
                    if (!this.f10674b.transact(42, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, i6, j5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, int i6, int i7, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    obtain.writeLong(j5);
                    if (!this.f10674b.transact(43, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, i6, i7, j5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, int i6, int i7, int i8) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    obtain.writeInt(i8);
                    if (!this.f10674b.transact(44, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, i6, i7, i8);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeTypedList(list);
                    if (!this.f10674b.transact(47, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(aj ajVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(ajVar != null ? ajVar.asBinder() : null);
                    if (!this.f10674b.transact(49, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(ajVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f10674b.transact(50, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, i6);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, y yVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(yVar != null ? yVar.asBinder() : null);
                    if (!this.f10674b.transact(53, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, yVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.i
            public void a(int i5, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i5);
                    obtain.writeLong(j5);
                    if (!this.f10674b.transact(56, obtain, obtain2, 0) && a.g() != null) {
                        a.g().a(i5, j5);
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
