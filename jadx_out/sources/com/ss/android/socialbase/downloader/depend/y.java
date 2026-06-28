package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public interface y extends IInterface {
    String a() throws RemoteException;

    void a(int i5, DownloadInfo downloadInfo, String str, String str2) throws RemoteException;

    boolean a(boolean z4) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements y {
        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        }

        public static y a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof y)) {
                return (y) queryLocalInterface;
            }
            return new C0214a(iBinder);
        }

        public static y b() {
            return C0214a.f10569a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            DownloadInfo downloadInfo;
            boolean z4;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 1598968902) {
                            return super.onTransact(i5, parcel, parcel2, i6);
                        }
                        parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                        return true;
                    }
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    String a5 = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a5);
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean a6 = a(z4);
                parcel2.writeNoException();
                parcel2.writeInt(a6 ? 1 : 0);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
            } else {
                downloadInfo = null;
            }
            a(readInt, downloadInfo, parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0214a implements y {

            /* renamed from: a, reason: collision with root package name */
            public static y f10569a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10570b;

            C0214a(IBinder iBinder) {
                this.f10570b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.y
            public void a(int i5, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    obtain.writeInt(i5);
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f10570b.transact(1, obtain, obtain2, 0) && a.b() != null) {
                        a.b().a(i5, downloadInfo, str, str2);
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
                return this.f10570b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.y
            public boolean a(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f10570b.transact(2, obtain, obtain2, 0) && a.b() != null) {
                        return a.b().a(z4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.y
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    if (!this.f10570b.transact(3, obtain, obtain2, 0) && a.b() != null) {
                        return a.b().a();
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
