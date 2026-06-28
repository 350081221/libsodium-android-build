package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public interface ae extends IInterface {
    boolean a(DownloadInfo downloadInfo) throws RemoteException;

    boolean b(DownloadInfo downloadInfo) throws RemoteException;

    boolean c(DownloadInfo downloadInfo) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements ae {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.ae$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0200a implements ae {

            /* renamed from: a, reason: collision with root package name */
            public static ae f10540a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10541b;

            C0200a(IBinder iBinder) {
                this.f10541b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.ae
            public boolean a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z4 = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10541b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10541b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.ae
            public boolean b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z4 = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10541b.transact(2, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().b(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.ae
            public boolean c(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z4 = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10541b.transact(3, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().c(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
        }

        public static ae a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ae)) {
                return (ae) queryLocalInterface;
            }
            return new C0200a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            DownloadInfo downloadInfo = null;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 1598968902) {
                            return super.onTransact(i5, parcel, parcel2, i6);
                        }
                        parcel2.writeString("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                        return true;
                    }
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    if (parcel.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    boolean c5 = c(downloadInfo);
                    parcel2.writeNoException();
                    parcel2.writeInt(c5 ? 1 : 0);
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean b5 = b(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(b5 ? 1 : 0);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            if (parcel.readInt() != 0) {
                downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
            }
            boolean a5 = a(downloadInfo);
            parcel2.writeNoException();
            parcel2.writeInt(a5 ? 1 : 0);
            return true;
        }

        public static ae a() {
            return C0200a.f10540a;
        }
    }
}
