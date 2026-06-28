package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface j extends IInterface {
    String a() throws RemoteException;

    void a(String str) throws RemoteException;

    int[] b() throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements j {
        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
            if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
                return (j) queryLocalInterface;
            }
            return new C0208a(iBinder);
        }

        public static j c() {
            return C0208a.f10557a;
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
                        parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                        return true;
                    }
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    int[] b5 = b();
                    parcel2.writeNoException();
                    parcel2.writeIntArray(b5);
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                String a5 = a();
                parcel2.writeNoException();
                parcel2.writeString(a5);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
            a(parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0208a implements j {

            /* renamed from: a, reason: collision with root package name */
            public static j f10557a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10558b;

            C0208a(IBinder iBinder) {
                this.f10558b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.j
            public void a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    obtain.writeString(str);
                    if (!this.f10558b.transact(1, obtain, obtain2, 0) && a.c() != null) {
                        a.c().a(str);
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
                return this.f10558b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.j
            public int[] b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    if (!this.f10558b.transact(3, obtain, obtain2, 0) && a.c() != null) {
                        return a.c().b();
                    }
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.j
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    if (!this.f10558b.transact(2, obtain, obtain2, 0) && a.c() != null) {
                        return a.c().a();
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
