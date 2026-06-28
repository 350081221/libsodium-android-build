package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes3.dex */
public interface f extends IInterface {
    void a(DownloadInfo downloadInfo, BaseException baseException, int i5) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements f {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0204a implements f {

            /* renamed from: a, reason: collision with root package name */
            public static f f10549a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10550b;

            C0204a(IBinder iBinder) {
                this.f10550b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.f
            public void a(DownloadInfo downloadInfo, BaseException baseException, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    if (!this.f10550b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        a.a().a(downloadInfo, baseException, i5);
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
                return this.f10550b;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
        }

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
            if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
                return (f) queryLocalInterface;
            }
            return new C0204a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            DownloadInfo downloadInfo;
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
            BaseException baseException = null;
            if (parcel.readInt() != 0) {
                downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
            } else {
                downloadInfo = null;
            }
            if (parcel.readInt() != 0) {
                baseException = BaseException.CREATOR.createFromParcel(parcel);
            }
            a(downloadInfo, baseException, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        public static f a() {
            return C0204a.f10549a;
        }
    }
}
